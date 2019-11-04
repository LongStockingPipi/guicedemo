package pers.jason.guicedemo.helloword;

import javax.inject.Inject;
import java.io.PrintStream;

/**
 * @Author JiangZhihao
 * @ClassName PrintStreamWriter
 * @Description 字符串输出器，掌握输出目的地
 * @Date 2019/10/26 16:08
 */
public class PrintStreamWriter implements MyDestination {

  private PrintStream destination;

  /**
   * 指明 参数（destination）需要由Guice提供
   * @param destination
   */
  @Inject
  public PrintStreamWriter(PrintStream destination) {
    super();
    this.destination = destination;
  }

  public void write(String str) {
    destination.println(str);
  }

}
