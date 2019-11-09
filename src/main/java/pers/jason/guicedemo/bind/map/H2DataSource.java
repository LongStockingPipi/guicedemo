package pers.jason.guicedemo.bind.map;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 1:42
 */
public class H2DataSource implements DataSource {
  @Override
  public String getType() {
    return "h2";
  }
}
