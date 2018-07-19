package br.com.api.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.api.apirest.model.Lancamento;
import br.com.api.apirest.repository.LancamentoRepository;

@Service
public class LancamentoService {

	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento buscarPeloCodigo(Long codigo) {
		Lancamento lancamento = lancamentoRepository.findOne(codigo);
		
		if (lancamento == null) {
			throw new EmptyResultDataAccessException(1);
		}
		
		return lancamento;
	}

	public List<Lancamento> findAll() {
		return lancamentoRepository.findAll();
	}
}
