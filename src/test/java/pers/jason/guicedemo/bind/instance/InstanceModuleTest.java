package pers.jason.guicedemo.bind.instance;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 22:26
 */
public class InstanceModuleTest {


  @Inject
  private UserService userService;

  @Before
  public void setUp() {
    Guice.createInjector(new InstanceModule()).injectMembers(this);
  }

  @Test
  public void testForInject() {
    Long id = System.currentTimeMillis();
    assertEquals("u_" + id + "abc", userService.findName(id));
  }
}
