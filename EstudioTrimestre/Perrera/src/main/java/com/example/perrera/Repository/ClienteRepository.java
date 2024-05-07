package com.example.perrera.Repository;

import com.example.perrera.Classes.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    List<Cliente> findAll();
}
