package pers.jason.guicedemo.scope.singleton;

import javax.inject.Inject;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 3:17
 */
public class PriceServiceImpl implements PriceService{

  private final CacheService cacheService;

  @Inject
  public PriceServiceImpl(CacheService cacheService) {
    this.cacheService = cacheService;
  }

  @Override
  public void setPrice(String num, String price) {
    cacheService.set(num, price);
  }
}
