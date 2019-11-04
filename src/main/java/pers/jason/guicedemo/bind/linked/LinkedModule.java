package pers.jason.guicedemo.bind.linked;

import com.google.inject.AbstractModule;

/**
 * @Author 姜治昊
 * @Description 连接绑定
 * @Date 2019/11/4 22:14
 */
public class LinkedModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(TransactionLog.class).to(DatabaseTransactionLog.class);
    bind(DatabaseTransactionLog.class).to(MySqlTransactionLog.class);
  }
}
