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
        timaAdmin.setFirstName("Tima");
        timaAdmin.setLastName("Voitenko");

        userRepository.save(timaAdmin);

        User egorUser = new User();
        egorUser.setFirstName("Egor");
        egorUser.setLastName("Priemniy");

        userRepository.save(egorUser);
    }
}
