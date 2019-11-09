package pers.jason.guicedemo.bind.map;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 1:43
 */
public class MySqlDataSource implements DataSource {
  @Override
  public String getType() {
    return "mysql";
  }
}
