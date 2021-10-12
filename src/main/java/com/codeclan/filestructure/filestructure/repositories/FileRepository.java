package com.codeclan.filestructure.filestructure.repositories;

import com.codeclan.filestructure.filestructure.models.File;

public interface FileRepository {
    Object findAll();

    Object findById(Long id);

    void save(File file);
}
