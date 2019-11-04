package pers.jason.guicedemo.helloword.config;

import com.google.inject.AbstractModule;

/**
 * @Author JiangZhihao
 * @ClassName MainModule
 * @Description Guice用来的配置的类
 * @Date 2019/10/26 19:12
 */
public class MainModule extends AbstractModule {

  @Override
  protected void configure() {
    install(new HelloWordModule());
  }



}
