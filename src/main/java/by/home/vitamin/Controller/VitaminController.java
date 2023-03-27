package by.home.vitamin.Controller;

import by.home.vitamin.service.VitaminService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class VitaminController {

    public final VitaminService service;

}
