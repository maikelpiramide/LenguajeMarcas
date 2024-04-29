package com.example.relacionesnm.Repository;

import com.example.relacionesnm.Classes.Modalidad;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ModalidadRepository extends CrudRepository<Modalidad,Long> {
    List<Modalidad> findAll();
}
