package com.codeclan.filestructure.filestructure.repositories;

public interface FolderRepository {
    Object findAll();

    Object findById(Long id);

    void save(Folder folder);
}
