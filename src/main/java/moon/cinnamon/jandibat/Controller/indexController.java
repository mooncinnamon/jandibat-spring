package moon.cinnamon.jandibat.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class indexController {
    @RequestMapping("/")
    public String index(){
        return "Merry Go Round";
    }
}
