package pers.jason.guicedemo.scope.singleton;

import javax.inject.Inject;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 3:16
 */
public class PayServiceImpl implements PayService{

  private final CacheService cacheService;

  @Inject
  public PayServiceImpl(CacheService cacheService) {
    this.cacheService = cacheService;
  }

  @Override
  public String getPrice(String num) {
    return cacheService.get(num);
  }
}
