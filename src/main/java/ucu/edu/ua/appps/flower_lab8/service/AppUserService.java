package ucu.edu.ua.appps.flower_lab8.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ucu.edu.ua.appps.flower_lab8.model.AppUser;
import ucu.edu.ua.appps.flower_lab8.repository.AppUserRepository;

@Service
public class AppUserService {
    private AppUserRepository appuserrepository;

    @Autowired
    public AppUserService(AppUserRepository appuserrepository) {
        this.appuserrepository = appuserrepository;
    }

    public List<AppUser> getAppUser() {
        return appuserrepository.findAll();
    }

    public AppUser creatAppUser(AppUser flower) {
        return appuserrepository.save(flower);
    }

    public AppUser getUserByEmail(String email) {
        return appuserrepository.findByEmail(email);
    }
}
