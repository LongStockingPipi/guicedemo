package pers.jason.guicedemo.bind.type;

import javax.inject.Singleton;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 22:53
 */
@Singleton
public class UserServiceImpl implements UserService {

  public String getName(Long id) {
    return "u_" + id + "def";
  }
}
