package com.codeclan.filestructure.filestructure.repositories;

import com.codeclan.filestructure.filestructure.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
