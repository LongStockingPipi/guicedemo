package pers.jason.guicedemo.bind.linked;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 22:17
 */
public class MySqlTransactionLog extends DatabaseTransactionLog {

  @Override
  public void printLog() {
    System.out.println("this is MySqlTransactionLog");
  }

  @Override
  public String getName() {
    return "mysql";
  }
}
