package br.com.api.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.apirest.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	
	List<CategoriaProjection> findByNome(String nome);
}
