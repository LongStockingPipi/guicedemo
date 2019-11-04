package pers.jason.guicedemo.bind.union;

import com.google.inject.AbstractModule;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 23:20
 */
public class UnionModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new ChinaDrinkModule());
    install(new AmericanDrinkModule());
  }
}
