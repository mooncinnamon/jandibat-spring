package moon.cinnamon.jandibat.Controller;

import moon.cinnamon.jandibat.Model.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by NESOY on 2017-02-04.
 */
@Controller
public class controller {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/starter", method = RequestMethod.GET)
    public HelloWorld token(@RequestParam(value = "text", defaultValue = "None") String text) {
        return new HelloWorld("Merry-Go-Round");
    }
}