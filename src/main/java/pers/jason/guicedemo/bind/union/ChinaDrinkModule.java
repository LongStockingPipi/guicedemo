package pers.jason.guicedemo.bind.union;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 23:21
 */
public class ChinaDrinkModule extends AbstractModule {

  @Override
  protected void configure() {
    Multibinder.newSetBinder(binder(), Drink.class)
      .addBinding().toInstance(new Tea());
  }
}
