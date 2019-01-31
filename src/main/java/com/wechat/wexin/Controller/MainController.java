package com.wechat.wexin.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping(value = "/index")
    public String index(){
        return "Wechat/index";
    }

    @GetMapping(value = "/foot")
    public String foot(){
        return "Wechat/footer";
    }
}
