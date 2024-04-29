package com.example.relacionesnm.Repository;

import com.example.relacionesnm.Classes.Corredor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CorredorRepository extends CrudRepository<Corredor, Long> {
    List<Corredor> findAll();
}
