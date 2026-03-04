package com.example.SpringFinal.Repositories;

import com.example.SpringFinal.Models.MilagreModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface MilagreRepositories extends JpaRepository<MilagreModel, Long> {
}
