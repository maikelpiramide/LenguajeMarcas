package com.example.perrera.Repository;

import com.example.perrera.Classes.Perro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PerroRepository extends CrudRepository<Perro, Long> {
    List<Perro> findAll();
}
