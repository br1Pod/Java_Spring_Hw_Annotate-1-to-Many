package com.codeclan.filestructure.filestructure.repositories;

import com.codeclan.filestructure.filestructure.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
