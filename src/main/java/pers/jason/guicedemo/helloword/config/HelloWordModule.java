package pers.jason.guicedemo.helloword.config;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import pers.jason.guicedemo.helloword.MyApplet;
import pers.jason.guicedemo.helloword.MyDestination;
import pers.jason.guicedemo.helloword.PrintStreamWriter;
import pers.jason.guicedemo.helloword.StringWritingApplet;
import pers.jason.guicedemo.helloword.annotation.Output;

import java.io.PrintStream;

/**
 * @Author JiangZhihao
 * @ClassName HelloWordModule
 * @Description
 * @Date 2019/10/26 19:27
 */
public class HelloWordModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(MyApplet.class).to(StringWritingApplet.class);
    bind(MyDestination.class).to(PrintStreamWriter.class);
    bind(PrintStream.class).toInstance(System.out);
    bind(String.class).annotatedWith(Output.class).toInstance("Hello Guice");
  }

//  @Provides
//  private String getString() {
//    return "Hello Guice";
//  }

}
