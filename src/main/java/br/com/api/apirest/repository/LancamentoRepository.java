package br.com.api.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.apirest.model.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
