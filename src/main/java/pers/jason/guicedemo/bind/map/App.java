package pers.jason.guicedemo.bind.map;

import com.google.inject.Guice;
import com.google.inject.Key;
import com.google.inject.TypeLiteral;

import java.util.Map;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 1:47
 */
public class App {

  public static void main(String[] args) {
    Map<String, DataSource> dataSourceMap =
        Guice.createInjector(new DataSourceModule1(), new DataSourceModule2())
        .getInstance(Key.get(new TypeLiteral<Map<String, DataSource>>() {}));
    assert "mysql".equals(dataSourceMap.get("mysql").getType());
    assert "oracle".equals(dataSourceMap.get("oracle").getType());
    assert "h2".equals(dataSourceMap.get("h2").getType());
  }
}
