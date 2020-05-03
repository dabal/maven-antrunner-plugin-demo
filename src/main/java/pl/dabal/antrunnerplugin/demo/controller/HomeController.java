package pl.dabal.antrunnerplugin.demo.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@NoArgsConstructor

public class HomeController {

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    @ResponseBody
    public String homeController(){
        return appName;
    }
}
