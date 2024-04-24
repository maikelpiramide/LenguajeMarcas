package com.cpifppiramide.Fornite.Reposiroty;

import org.springframework.data.repository.CrudRepository;
import com.cpifppiramide.Fornite.Classes.Idioma;

import java.util.List;

public interface IdiomaRepository extends CrudRepository<Idioma,Long> {
    List<Idioma> findAll();
}
