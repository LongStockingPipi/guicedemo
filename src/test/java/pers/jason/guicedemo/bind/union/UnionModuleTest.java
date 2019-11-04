package pers.jason.guicedemo.bind.union;

import com.google.common.collect.Lists;
import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 23:25
 */
public class UnionModuleTest {

  @Inject
  private Set<Drink> allDrink;

  @Before
  public void setUp() {
    Guice.createInjector(new UnionModule()).injectMembers(this);
  }

  @Test
  public void testForGetDrink() {
    List<String> names = Lists.newArrayList("咖啡", "可乐", "茶");

    int n = 0;
    for(Drink drink : allDrink) {
      n = n + names.indexOf(drink.getName());
    }

    assertEquals(3, n);
  }
}
