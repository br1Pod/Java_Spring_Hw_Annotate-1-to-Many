package com.codeclan.filestructure.filestructure.repositories;

import com.codeclan.filestructure.filestructure.models.User;

public interface UserRepository {
    Object findAll();

    Object findById(Long id);

    void save(User user);
}
