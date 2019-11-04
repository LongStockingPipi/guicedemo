package pers.jason.guicedemo.bind.provider;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

import javax.inject.Named;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 22:29
 */
public class ProviderModule extends AbstractModule {

  @Override
  protected void configure() {
    //牛肉披萨配置
    bind(String.class).annotatedWith(Names.named("beef")).toInstance("牛肉披萨");
    bind(Float.class).annotatedWith(BeefPizzaPrice.class).toInstance((float) 12.28);

    bind(String.class).annotatedWith(Pastoral.class).toInstance("田园披萨");
    bind(Float.class).annotatedWith(Names.named("pastoralPizzaPrice")).toInstance((float) 9.05);
  }


  @Provides
  @BeefPizza
  public Pizza getBeefPizza(@Named("beef") String name, @BeefPizzaPrice Float price) {
    return new Pizza(name, price);
  }

  @Provides
  @Named("pastoralPizza")
  public Pizza getPastoralPizza(@Pastoral String name, @Named("pastoralPizzaPrice") Float price) {
    return new Pizza(name, price);
  }


}
