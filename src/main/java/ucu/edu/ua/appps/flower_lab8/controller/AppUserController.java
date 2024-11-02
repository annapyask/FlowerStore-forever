package ucu.edu.ua.appps.flower_lab8.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.ua.appps.flower_lab8.model.AppUser;
import ucu.edu.ua.appps.flower_lab8.service.*;

@RestController
@RequestMapping("/api/v1")


public class AppUserController {
    private AppUserService appUserService;

    
    @Autowired
    public AppUserController (AppUserService appUserService) {
        this.appUserService = appUserService;
    }

    @GetMapping("/user")
    public List<AppUser> getAppUsers() {
        return appUserService.getAppUser();
    }

    @PostMapping("/user")
    public AppUser postAppUserService(AppUser user){
        return appUserService.creatAppUser(user);
    }

    @GetMapping("/user/email")
    public ResponseEntity<AppUser> getUserByEmail(@RequestParam String email) {
        AppUser userByEmail = appUserService.getUserByEmail(email);
        if (userByEmail != null){
            return ResponseEntity.ok(userByEmail);

        }
        return ResponseEntity.notFound().build();
    }
}