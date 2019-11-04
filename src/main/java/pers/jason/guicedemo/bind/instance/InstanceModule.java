package pers.jason.guicedemo.bind.instance;

import com.google.inject.AbstractModule;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 22:24
 */
public class InstanceModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(UserService.class).to(UserServiceImpl.class);
  }
}
