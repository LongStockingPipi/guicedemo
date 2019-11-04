package pers.jason.guicedemo.bind.generic;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import java.util.List;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 21:49
 */
public class GenericModuleTest {

  @Inject
  private List<User> users;

  @Before
  public void setUp() {
    Guice.createInjector(new GenericModule()).injectMembers(this);
  }

  @Test
  public void testForInject() {
    assert 2 == users.size();
  }

}
