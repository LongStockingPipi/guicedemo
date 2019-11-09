package pers.jason.guicedemo.scope.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 3:14
 */
public class DefaultCacheService implements CacheService {

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
