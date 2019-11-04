package pers.jason.guicedemo.bind.provider;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 22:29
 */
public class Pizza {

  private final Float price;

  private final String name;

  public Pizza(String name, Float price) {
    this.price = price;
    this.name = name;
  }

  public Float getPrice() {
    return price;
  }

  public String getName() {
    return name;
  }
}
