package by.home.vitamin.Controller;

import by.home.vitamin.model.dto.AdmissionSheduleResponseDto;
import by.home.vitamin.model.dto.GetTypesDto;
import by.home.vitamin.model.entity.Vitamin;
import by.home.vitamin.model.entity.enums.Type;
import by.home.vitamin.service.VitaminService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Controller
@RequestMapping("/test")
public class VitaminController {

    @Autowired
    private VitaminService vitaminService;

    private AdmissionSheduleResponseDto admissionSheduleResponseDto;

    @GetMapping(value = "/home")
    public ModelAndView vitamins() {
        return new ModelAndView("home").addObject("getTypes", new GetTypesDto());
    }

    @RequestMapping(value = "/getTypes", method = RequestMethod.GET)
    public Set<Type> test() {
        Set<Type> result = new HashSet<>(List.of(Type.values()));
        return result;
    }

    @RequestMapping(value = "/getTypes", method = RequestMethod.POST, consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView admission(@ModelAttribute GetTypesDto dto, HttpServletRequest request) {
        ModelAndView view = new ModelAndView();
        AdmissionSheduleResponseDto admissionShedule = vitaminService.admissionSchedule(dto.getTypes());
        view.addObject(admissionShedule);
        return view;
    }
}