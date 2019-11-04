package pers.jason.guicedemo.bind.linked;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 22:16
 */
public class DatabaseTransactionLog implements TransactionLog {

  public void printLog() {
    System.out.println("this is DatabaseTransactionLog");
  }

  public String getName() {
    return "database";
  }

}
