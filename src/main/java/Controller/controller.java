package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class controller {
    @RequestMapping(value = "/")
    public String test(){
        return "index";
    }
}
