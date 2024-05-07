package com.example.instituto.Repository;

import com.example.instituto.Classes.Profesor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProfesorRepository extends CrudRepository<Profesor, Integer> {

    List<Profesor> findAll();
}
