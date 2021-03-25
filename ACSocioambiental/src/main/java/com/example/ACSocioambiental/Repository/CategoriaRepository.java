package com.example.ACSocioambiental.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ACSocioambiental.Model.Categoria;

@Repository 
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	//public List<Categoria> findAllByNome_categoriaContaningIgnoreCase(String nome);
}
