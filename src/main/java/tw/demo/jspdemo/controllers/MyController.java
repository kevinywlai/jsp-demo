package tw.demo.jspdemo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/hello")
    public String helloPage(Model model) {
        model.addAttribute("message", "Hello, Spring Boot with JSP!");
        return "hello"; // This will resolve to /WEB-INF/views/hello.jsp
    }
}
