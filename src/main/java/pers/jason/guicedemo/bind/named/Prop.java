package pers.jason.guicedemo.bind.named;

import com.google.common.collect.Maps;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import java.util.Map;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 21:54
 */
@Singleton
public class Prop {

  private final Map<String, String> properties = Maps.newHashMap();

  @Inject
  public Prop(@Named("username") String username, @Named("password") String password) {
    properties.put("username", username);
    properties.put("password", password);
  }

  public String get(String k) {
    return properties.get(k);
  }

  public void set(String k, String v) {
    properties.put(k, v);
  }
}
