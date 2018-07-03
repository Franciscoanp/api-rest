package br.com.api.apirest.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.apirest.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
