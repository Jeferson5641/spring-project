package com.projeto.java.course.repositories;

import com.projeto.java.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositories extends JpaRepository<User, Long> {
}
