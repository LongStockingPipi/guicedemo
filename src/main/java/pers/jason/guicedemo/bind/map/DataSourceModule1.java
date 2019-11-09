package pers.jason.guicedemo.bind.map;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 1:43
 */
public class DataSourceModule1 extends AbstractModule {

  @Override
  protected void configure() {
    MapBinder mapBinder = MapBinder.newMapBinder(binder(), String.class, DataSource.class);
    mapBinder.addBinding("mysql").to(MySqlDataSource.class);
    mapBinder.addBinding("oracle").to(OracleDataSource.class);
  }
}
