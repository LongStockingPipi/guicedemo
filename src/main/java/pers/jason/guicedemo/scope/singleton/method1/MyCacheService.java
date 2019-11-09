package pers.jason.guicedemo.scope.singleton.method1;

import pers.jason.guicedemo.scope.singleton.CacheService;

import javax.inject.Singleton;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 3:15
 */
@Singleton
public class MyCacheService implements CacheService {

  private final Map<String, String> cache = new HashMap<>();

  @Override
  public String get(String k) {
    return cache.get(k);
  }

  @Override
  public String set(String k, String v) {
    return cache.put(k, v);
  }
}
