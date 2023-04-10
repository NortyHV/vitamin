package by.home.vitamin.Controller;

import by.home.vitamin.repo.GuideRepository;
import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuideController {

    @Autowired
    private GuideRepository guideRepository;

    @GetMapping("/guides")
    public String vitaminsGuide(Model model){
        return "guides";
    }
}
