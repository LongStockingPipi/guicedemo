package pers.jason.guicedemo.aop.another;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Provides;
import com.google.inject.matcher.Matchers;
import pers.jason.guicedemo.aop.PayLog;
import pers.jason.guicedemo.aop.PayService;
import pers.jason.guicedemo.aop.PayServiceImpl;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 3:44
 */
public class AnotherAopModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(PayService.class).to(PayServiceImpl.class);

    //创建并初始化变量
    LogInterceptor logInterceptor = new LogInterceptor();
    requestInjection(logInterceptor);

    bindInterceptor(Matchers.any(), Matchers.annotatedWith(PayLog.class), logInterceptor);
  }

  @Provides
  public Long getSessionId() {
    return System.currentTimeMillis();
  }

  public static void main(String[] args) {
    PayService payService = Guice.createInjector(new AnotherAopModule()).getInstance(PayService.class);
    payService.pay();
    payService.otherMethod();
  }
}
