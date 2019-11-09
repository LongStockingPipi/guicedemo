package pers.jason.guicedemo.utils;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;
import pers.jason.guicedemo.bind.map.DataSource;
import pers.jason.guicedemo.bind.map.MySqlDataSource;

import java.util.Map;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 2:04
 */
public class MapModule extends AbstractModule {

  @Override
  protected void configure() {
    MapBinderApplets.register(binder()).named("mysql").to(MySqlDataSource.class);
  }

  public static void main(String[] args) {
    Map<String, DataSource> dataSourceMap =
        Guice.createInjector(new MapModule()).getInstance(Key.get(new TypeLiteral<Map<String, DataSource>> () {}));
    System.out.println(dataSourceMap.get("mysql").getType());
  }
}
