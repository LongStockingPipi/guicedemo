package pers.jason.guicedemo.bind.named;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 21:53
 */
public class NamedModule extends AbstractModule {

  @Override
  protected void configure() {

    /**
     * 使用 @Named 命名绑定
     */
    bind(String.class).annotatedWith(Names.named("username")).toInstance("root");
    bind(String.class).annotatedWith(Names.named("password")).toInstance("123456");
  }

  /**
   * 使用自定义注解 命名绑定
   */
  @Provides
  @DbConnect
  public Connection ConnectProvider(Prop prop) {
    Long now = System.currentTimeMillis();
    System.out.println("调用 connect provider: " + now);
    return new Connection(now, prop);
  }

}
