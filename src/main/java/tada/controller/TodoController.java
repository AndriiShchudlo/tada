package tada.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tada.service.TodoService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TodoController {
    private TodoService todoService;

    @Autowired
    @Qualifier(value = "todoServiceImpl")
    public void  setTodoService(TodoService todoService) {
        this.todoService = todoService;
    }
//
//    @Autowired(required = true)
//    @Qualifier(value = "todoService")
//    public void setTodoService (TodoService todoService) {
//        this.todoService = todoService;
//    }

//    @RequestMapping(value = "/")
//    public String test(Model model) {
//        String greetings = "fovgfo";
//        List<String> items = new ArrayList<>();
//        items.add("item one");
//        items.add("item two");
//        model.addAttribute("data", greetings);
//        model.addAttribute("data", items);
//
//        return "home";
//    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String listTodo(Model model){

        model.addAttribute("listTodo", todoService.listTodos());

        return "home";
    }
}
