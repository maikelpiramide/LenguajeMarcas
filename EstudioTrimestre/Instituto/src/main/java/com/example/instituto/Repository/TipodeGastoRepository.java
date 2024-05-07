package com.example.instituto.Repository;

import com.example.instituto.Classes.TipodeGasto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TipodeGastoRepository extends CrudRepository<TipodeGasto,Integer> {

    List<TipodeGasto> findAll();

}
