package com.example.dubbo;

/**
 * @author:Administrator
 * @create 2019-01-23 11:06
 */
public class TestServiceImpl implements TestService  {
    @Override
    public String sayHello(String name) {
        return "Hello " + name + "!";
    }
}
