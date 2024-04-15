package com.cpifppiramide.Fornite.Reposiroty;

import com.cpifppiramide.Fornite.Classes.Juego;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface JuegoRepository extends CrudRepository<Juego,Long> {
    List<Juego> findAll();
}
