package pers.jason.guicedemo.module.override;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 0:48
 */
public class BookStore2018Year implements BookStore {

  private static Map<Long, Double> priceList = new HashMap<>();

  static {
    priceList.put(1001L, 32.0);
    priceList.put(1002L, 79.0);
    priceList.put(1003L, 45.0);
  }

  public int getYear() {
    return 2018;
  }

  public Double getBookProce(Long bookId) {
    return priceList.get(bookId);
  }
}
