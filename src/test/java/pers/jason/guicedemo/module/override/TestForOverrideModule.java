package pers.jason.guicedemo.module.override;

import com.google.inject.Guice;
import com.google.inject.util.Modules;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 0:54
 */
public class TestForOverrideModule {

  @Inject
  private BookStore bookStore;

  @Before
  public void setUp() {
    Guice.createInjector(
        Modules.override(
            new OverridelModule2018Year()
        ).with(
            new OverridelModule2019Year()
        )
    ).injectMembers(this);
  }

  @Test
  public void getLatestBookPrice() {
    final Long bookId = 1002L;
    final Double price = bookStore.getBookProce(bookId);
    final int year  = bookStore.getYear();
    assertEquals(69.0, price, 0.00001);
    assert 2019 == year;
  }
}
