package pers.jason.guicedemo.aop;

import com.google.common.base.Joiner;
import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.matcher.Matchers;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 3:30
 */
public class AopModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(PayService.class).to(PayServiceImpl.class);
    bindInterceptor(Matchers.any(), Matchers.annotatedWith(PayLog.class), methodInvocation -> {
      Method method = methodInvocation.getMethod();
      System.out.println("executing "
          + method.getDeclaringClass().getName() + "." + method.getName()
          + "(" + Joiner.on(",").join(methodInvocation.getArguments()) + ") ...");
      return methodInvocation.proceed();
    });
  }

  public static void main(String[] args) {
    PayService payService = Guice.createInjector(new AopModule()).getInstance(PayService.class);
    payService.pay();
  }
}
