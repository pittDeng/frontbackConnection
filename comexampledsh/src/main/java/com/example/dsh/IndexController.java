package com.example.dsh;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
    @GetMapping("/")
    @ResponseBody
    public Map<String,String> index(HttpServletResponse response){
        response.setHeader("Access-Control-Allow-origin","*");
        Map<String,String>map=new HashMap<>();
        map.put("message","Hello World");
        map.put("time",Long.toString(System.currentTimeMillis()));
        return map;
    }

}
