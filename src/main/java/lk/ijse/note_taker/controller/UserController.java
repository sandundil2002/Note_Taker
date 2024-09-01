package lk.ijse.note_taker.controller;

import lk.ijse.note_taker.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService userService;

    //Add health check
    @GetMapping("/health")
    public String checkHealth(){
        return "User Controller is OK";
    }


}
