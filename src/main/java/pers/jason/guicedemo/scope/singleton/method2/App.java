package pers.jason.guicedemo.scope.singleton.method2;

import com.google.inject.Guice;
import com.google.inject.Injector;
import pers.jason.guicedemo.scope.singleton.PayServiceImpl;
import pers.jason.guicedemo.scope.singleton.PriceServiceImpl;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 3:19
 */
public class App {


  public static void main(String[] args) {
    Injector injector = Guice.createInjector(new Module2());
    PayServiceImpl payService = injector.getInstance(PayServiceImpl.class);
    PriceServiceImpl priceService = injector.getInstance(PriceServiceImpl.class);

    priceService.setPrice("1001", "39RMB");
    System.out.println("39RMB".equals(payService.getPrice("1001")));
  }
}
