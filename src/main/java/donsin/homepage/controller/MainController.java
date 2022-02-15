package donsin.homepage.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    @GetMapping("/hello")
    public String hello(){

        return "Hello Spring boot!";

    }

    @GetMapping("/signup")
    public String signup(){

        return "signup";

    }

    @GetMapping("/signin")
    public String signin(){

      return "signin";

    }








}
