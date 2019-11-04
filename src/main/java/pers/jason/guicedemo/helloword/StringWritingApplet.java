package pers.jason.guicedemo.helloword;

import com.google.inject.Provider;
import pers.jason.guicedemo.helloword.annotation.Output;

import javax.inject.Inject;

/**
 * @Author JiangZhihao
 * @ClassName StringWritingApplet
 * @Description 字符串输出执行器，掌握字符串提供器和字符串输出器
 * @Date 2019/10/26 15:40
 */
public class StringWritingApplet implements MyApplet {

  private Provider<String> stringProvider;

  private MyDestination myDestination;

  @Inject
  public StringWritingApplet(MyDestination destination, @Output Provider<String> provider) {
    this.myDestination = destination;
    this.stringProvider = provider;
  }

  public void run() {
    writeString();
  }

  private void writeString() {
    myDestination.write(stringProvider.get());
  }

}
