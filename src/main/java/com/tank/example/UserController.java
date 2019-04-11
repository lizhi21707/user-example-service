package com.tank.example;

import com.tank.hello.HelloService;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @author: lizhi1
 * @date: 2019/4/11 12:53 Thursday
 */
@RestController
public class UserController {

  @Resource
  private HelloService helloService;

  @RequestMapping("/test")
  public String test() {
    System.out.println(helloService.sayHello());

    return "success";
  }
}
