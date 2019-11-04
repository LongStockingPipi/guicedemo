package pers.jason.guicedemo.bind.type;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 22:39
 */
public class TypeModuleTest {

  @Inject
  private UserService userService;

  @Before
  public void setUp() {
    Guice.createInjector(new TypeModule()).injectMembers(this);
  }

  @Test
  public void testForInject() {
    Long id = System.currentTimeMillis();
    assertEquals("u_" + id + "def", userService.getName(id));

  }
}
