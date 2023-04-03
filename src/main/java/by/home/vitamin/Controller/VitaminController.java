package by.home.vitamin.Controller;

import by.home.vitamin.config.BeanConfiguration;
import by.home.vitamin.model.entity.enums.Type;
import by.home.vitamin.service.VitaminService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class VitaminController {


@GetMapping("/")
    public String vitamins(){

        return "vitamins";
    }
}