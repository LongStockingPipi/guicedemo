package pers.jason.guicedemo.helloword;

import com.google.inject.Guice;
import pers.jason.guicedemo.helloword.config.MainModule;

/**
 * @Author JiangZhihao
 * @ClassName App
 * @Description
 * @Date 2019/10/26 15:39
 */
public class App {

  /**
   * kick off main logic
   * @param args
   */
  public static void main(String[] args) {
    MyApplet myApplet = Guice.createInjector(new MainModule()).getInstance(MyApplet.class);
    myApplet.run();
  }

}
