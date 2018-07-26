package br.com.api.apirest.repository.lancamento;

import java.util.List;

import br.com.api.apirest.model.Lancamento;
import br.com.api.apirest.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery{

	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);
}
