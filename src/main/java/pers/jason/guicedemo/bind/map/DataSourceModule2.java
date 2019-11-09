package pers.jason.guicedemo.bind.map;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 1:45
 */
public class DataSourceModule2 extends AbstractModule {

  @Override
  protected void configure() {
    MapBinder.newMapBinder(binder(), String.class, DataSource.class)
        .addBinding("h2").to(H2DataSource.class);
  }
}
