package pers.jason.guicedemo.bind.provider;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Provider;

import static org.junit.Assert.assertEquals;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 22:39
 */
public class ProviderModuleTest {

  @Inject
  @BeefPizza
  private Provider<Pizza> beefPizzaProvider;

  @Inject
  @Named("pastoralPizza")
  private Pizza pizza;

  @Before
  public void setUp() {
    Guice.createInjector(new ProviderModule()).injectMembers(this);
  }

  @Test
  public void testForInject() {
    Pizza beefPizza = beefPizzaProvider.get();

    Pizza pastoralPizza = pizza;

    assertEquals("牛肉披萨", beefPizza.getName());
    assertEquals(12.28, beefPizza.getPrice(), 0.00001);

    assertEquals("田园披萨", pastoralPizza.getName());
    assertEquals(9.05, pastoralPizza.getPrice(), 0.00001);

  }
}
