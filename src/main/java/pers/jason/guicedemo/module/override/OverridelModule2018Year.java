package pers.jason.guicedemo.module.override;

import com.google.inject.AbstractModule;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 0:52
 */
public class OverridelModule2018Year extends AbstractModule {


  @Override
  protected void configure() {
    bind(BookStore.class).to(BookStore2018Year.class);
  }
}
