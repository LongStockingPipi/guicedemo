package pers.jason.guicedemo.utils;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.binder.LinkedBindingBuilder;
import com.google.inject.multibindings.MapBinder;
import pers.jason.guicedemo.bind.map.DataSource;

import java.lang.reflect.ParameterizedType;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 1:56
 */
public class MapBinderApplets {

  public static class AppletRegister{
    private final Binder binder;

    private AppletRegister(Binder binder) {
      super();
      this.binder = binder;
    }

    public LinkedBindingBuilder<DataSource> named(final String name) {
      return MapBinder.newMapBinder(binder, String.class, DataSource.class).addBinding(name);
    }
  }

  public static AppletRegister register(final Binder binder) {
    return new AppletRegister(binder);
  }

}
