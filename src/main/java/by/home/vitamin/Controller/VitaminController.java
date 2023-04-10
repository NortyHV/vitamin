package by.home.vitamin.Controller;

import by.home.vitamin.model.dto.AdmissionSheduleResponseDto;
import by.home.vitamin.model.entity.Vitamin;
import by.home.vitamin.model.entity.enums.Type;
import by.home.vitamin.service.VitaminService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@RestController
@RequestMapping("/test")
public class VitaminController {

    @Autowired
    private VitaminService vitaminService;

    AdmissionSheduleResponseDto admissionSheduleResponseDto;


    @GetMapping(value = "/")
    public String vitamins(Model model) {
        model.addAttribute("title", "Главная страница");

        return "home";
    }

    @RequestMapping(value = "/getTypes", method = RequestMethod.GET)

    public Set<Type> test() {
        Set<Type> result = new HashSet<>(List.of(Type.values()));
        return result;
    }

    @RequestMapping(value = "/getTypes", method = RequestMethod.POST)

    public ModelAndView admission(Set<Type> user) {


        ModelAndView view = new ModelAndView();
        AdmissionSheduleResponseDto admissionShedule = vitaminService.admissionSchedule(user);
        view.addObject(admissionShedule);
        return view;


    }
}