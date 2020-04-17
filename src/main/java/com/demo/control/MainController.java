package com.demo.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qcrrm.service.TestService;

@RestController
public class MainController {
    @RequestMapping(value = "/getSign", method = RequestMethod.GET)
    public String getSign() {
        String sign = "";
        TestService test = new TestService();
        sign = test.getSign();
        return sign;
    }
}
