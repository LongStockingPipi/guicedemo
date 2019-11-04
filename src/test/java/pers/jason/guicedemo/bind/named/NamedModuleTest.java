package pers.jason.guicedemo.bind.named;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;
import javax.inject.Provider;

import static org.junit.Assert.assertNotEquals;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 21:49
 */
public class NamedModuleTest {

  @Inject
  @DbConnect
  private Provider<Connection> connectionProvider;

  @Before
  public void setUp() {
    Guice.createInjector(new NamedModule()).injectMembers(this);
  }

  @Test
  public void testForInject() throws InterruptedException {
    Connection connection = connectionProvider.get();
    assert "root".equals(connection.getUsername());
    assert "123456".equals(connection.getPassword());

    Thread.sleep(1000);
    Connection connection_ = connectionProvider.get();
    assertNotEquals(connection.getId(), connection_.getId());
  }

}
