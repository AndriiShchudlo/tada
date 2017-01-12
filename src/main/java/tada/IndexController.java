package tada;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController{

   @RequestMapping(value = "/home")
    public String test(Model model) {
        String greetings = "fovgfo";
       List<String> items = new ArrayList<>();
       items.add("item one");
       items.add("item two");
        model.addAttribute("data", greetings);
        model.addAttribute("data", items);

        return "home";
    }

}
