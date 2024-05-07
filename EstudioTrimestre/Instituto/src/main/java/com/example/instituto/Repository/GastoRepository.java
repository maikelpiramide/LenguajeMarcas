package com.example.instituto.Repository;

import com.example.instituto.Classes.Gasto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GastoRepository extends CrudRepository<Gasto, Integer> {
    List<Gasto> findAll();
}
