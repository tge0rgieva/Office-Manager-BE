package bg.adesso.officemanager.controller;

import bg.adesso.officemanager.model.User;
import bg.adesso.officemanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:4200")
    public List<User> getAllItems(){
        return userService.getAllUsers();
    }


    @GetMapping("{name}")
    public User getUser(@RequestParam String name){
        return userService.getUser(name);
    }

}