package pers.jason.guicedemo.aop;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/10 3:29
 */
public class PayServiceImpl implements PayService {

  @PayLog
  @Override
  public void pay() {
    System.out.println("paying ...");
  }

  @PayLog
  @Override
  public void otherMethod() {
    System.out.println("do something ...");
  }
}
