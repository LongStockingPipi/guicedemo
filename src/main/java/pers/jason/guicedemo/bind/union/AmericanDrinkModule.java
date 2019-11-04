package pers.jason.guicedemo.bind.union;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 23:19
 */
public class AmericanDrinkModule extends AbstractModule {

  @Override
  protected void configure() {
    Multibinder<Drink> currencyBind = Multibinder.newSetBinder(binder(), Drink.class);
    currencyBind.addBinding().toInstance(new Coffee());
    currencyBind.addBinding().toInstance(new Cola());
  }
}
