package br.com.api.apirest.repository.lancamento;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import br.com.api.apirest.model.Lancamento;
import br.com.api.apirest.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery{

	public Page<Lancamento> filtrar(LancamentoFilter lancamentoFilter, Pageable pageable);
}
