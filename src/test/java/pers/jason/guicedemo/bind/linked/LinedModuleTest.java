package pers.jason.guicedemo.bind.linked;

import com.google.inject.Guice;
import org.junit.Before;
import org.junit.Test;

import javax.inject.Inject;

import static org.junit.Assert.assertEquals;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 22:20
 */
public class LinedModuleTest {

  @Inject
  private TransactionLog transactionLog;

  @Before
  public void setUp() {
    Guice.createInjector(new LinkedModule()).injectMembers(this);
  }

  @Test
  public void testForInject() {
    assertEquals("mysql", transactionLog.getName());
  }
}
