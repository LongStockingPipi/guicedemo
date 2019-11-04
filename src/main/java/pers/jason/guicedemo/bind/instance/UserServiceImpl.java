package pers.jason.guicedemo.bind.instance;

/**
 * @Author 姜治昊
 * @Description
 * @Date 2019/11/4 22:25
 */
public class UserServiceImpl implements UserService {

  public String findName(Long id) {
    return "u_" + id + "abc";
  }

}
