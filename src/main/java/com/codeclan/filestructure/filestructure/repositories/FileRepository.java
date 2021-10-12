package com.codeclan.filestructure.filestructure.repositories;

import com.codeclan.filestructure.filestructure.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
