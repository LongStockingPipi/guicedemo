package pers.jason.guicedemo.aop.another;

import com.google.common.base.Joiner;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import javax.inject.Inject;
import javax.inject.Provider;
import java.lang.reflect.Method;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 3:42
 */
public class LogInterceptor implements MethodInterceptor {

  @Inject
  private Provider<Long> sessionIdProvider;

  @Override
  public Object invoke(MethodInvocation methodInvocation) throws Throwable {
    Method method = methodInvocation.getMethod();
    System.out.println(sessionIdProvider.get() + ":executing "
        + method.getDeclaringClass().getName() + "." + method.getName()
        + "(" + Joiner.on(",").join(methodInvocation.getArguments()) + ") ...");
    return methodInvocation.proceed();
  }
}
