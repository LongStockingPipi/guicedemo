package pers.jason.guicedemo.scope.singleton;

public interface CacheService {

  String get(String k);

  String set(String k, String value);
}
