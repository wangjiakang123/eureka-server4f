package com.test4f02.controller;

import com.test4f02.api.TestClient2Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestClient1Contrioller {

    @Autowired
    private TestClient2Api testClient2Api;

    @RequestMapping("test01")
    public String test1(){
      String test01=  testClient2Api.test01();

      return test01;
    }


}
