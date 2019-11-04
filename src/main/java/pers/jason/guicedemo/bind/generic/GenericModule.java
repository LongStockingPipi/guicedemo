package pers.jason.guicedemo.bind.generic;

import com.google.common.collect.Lists;
import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;

import java.util.List;

/**
 * @Author 姜治昊
 * @Description 泛型绑定
 * @Date 2019/11/4 21:45
 */
public class GenericModule extends AbstractModule {

  @Override
  protected void configure() {
    User u1 = new User(System.currentTimeMillis(), "U1");
    User u2 = new User(System.currentTimeMillis(), "U2");
    bind(new TypeLiteral<List<User>>() {})
        .toInstance(Lists.newArrayList(u1, u2));

  }
}
