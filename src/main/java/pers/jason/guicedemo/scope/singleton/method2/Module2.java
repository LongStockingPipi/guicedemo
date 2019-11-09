package pers.jason.guicedemo.scope.singleton.method2;

import com.google.inject.AbstractModule;
import pers.jason.guicedemo.scope.singleton.CacheService;
import pers.jason.guicedemo.scope.singleton.DefaultCacheService;
import pers.jason.guicedemo.scope.singleton.PayService;
import pers.jason.guicedemo.scope.singleton.PayServiceImpl;
import pers.jason.guicedemo.scope.singleton.PriceService;
import pers.jason.guicedemo.scope.singleton.PriceServiceImpl;
import pers.jason.guicedemo.scope.singleton.method1.MyCacheService;

import javax.inject.Singleton;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 3:18
 */
public class Module2 extends AbstractModule {

  @Override
  protected void configure() {
    bind(PayService.class).to(PayServiceImpl.class);
    bind(PriceService.class).to(PriceServiceImpl.class);
    bind(CacheService.class).to(DefaultCacheService.class)
        .in(Singleton.class)
        ;
  }


}
