package pers.jason.guicedemo.bind.named;

import javax.inject.Inject;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 21:59
 */
public class Connection {

  private final Long id;

  private final String username;

  private final String password;

  public Connection(Long id, Prop prop) {
    this.id = id;
    this.username = prop.get("username");
    this.password = prop.get("password");
  }

  public Long getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }
}
