package pers.jason.guicedemo.bind.type;

import com.google.inject.AbstractModule;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 22:52
 */
public class TypeModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(UserService.class).to(UserServiceImpl.class);
  }
}
