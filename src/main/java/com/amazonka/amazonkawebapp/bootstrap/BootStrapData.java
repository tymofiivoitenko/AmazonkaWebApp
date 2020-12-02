package com.amazonka.amazonkawebapp.bootstrap;

import com.amazonka.amazonkawebapp.domain.User;
import com.amazonka.amazonkawebapp.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private UserRepository userRepository;

    public BootStrapData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User timaAdmin = new User();
        timaAdmin.setUserName("Tima");
        timaAdmin.setRole("ADMIN");
        timaAdmin.setPassword("q");
        timaAdmin.setActive(true);

        userRepository.save(timaAdmin);

        User egorUser = new User();
        egorUser.setUserName("Egor");
        egorUser.setRole("USER");
        egorUser.setPassword("q");
        egorUser.setActive(true);

        userRepository.save(egorUser);
    }
}
