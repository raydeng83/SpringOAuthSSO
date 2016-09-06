package com.ldeng;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lede on 9/6/16.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "home.html";
    }

}
