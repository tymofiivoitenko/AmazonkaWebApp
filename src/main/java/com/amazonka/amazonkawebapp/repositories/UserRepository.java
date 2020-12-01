package com.amazonka.amazonkawebapp.repositories;

import com.amazonka.amazonkawebapp.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
