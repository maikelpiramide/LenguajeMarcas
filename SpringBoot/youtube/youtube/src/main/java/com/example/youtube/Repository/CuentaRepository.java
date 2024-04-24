package com.example.youtube.Repository;

import com.example.youtube.Classes.Cuenta;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CuentaRepository extends CrudRepository<Cuenta,Long> {

    List<Cuenta> findAll();

}
