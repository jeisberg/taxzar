package com.taxzar.repositories;

import com.taxzar.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value =  "SELECT u FROM User u WHERE u._username = ?1")
    User findUserByUsername(final String username);
}
