package by.home.vitamin.Controller;

import by.home.vitamin.service.VitaminService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class VitaminController {

    @Autowired
    private VitaminService vitaminService;


    @GetMapping("/")
    public String vitamins(Model model) {
        model.addAttribute("title", "Главная страница");

        return "home";
    }


}