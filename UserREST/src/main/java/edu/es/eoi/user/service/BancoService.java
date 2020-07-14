package edu.es.eoi.user.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.user.dto.BancoDto;
import edu.es.eoi.user.entity.Banco;
import edu.es.eoi.user.repository.MyRepository;

@Service
public class BancoService {

	@Autowired	
	private MyRepository<Banco> repository;
	
	@Autowired
	ModelMapper modelMapper;


	public BancoDto findBancoById(Integer id) {
		return this.convertToDto(repository.findById(id));
	}

	public void createBanco(BancoDto banco) {
		repository.create(this.convertToEntity(banco));
	}
	
	public void updateBanco(BancoDto banco) {
		repository.update(this.convertToEntity(banco));
	}
	
	public void deleteById(Integer id) {
		repository.deleteById(id);		
	}
	
	public List<BancoDto> findAll() {
		return repository.findAll().
				stream().
				map(this::convertToDto).
				collect(Collectors.toList());
	}
	
	private BancoDto convertToDto(Banco entity) {	
	    return modelMapper.map(entity,BancoDto.class);	
	}
	
	private Banco convertToEntity(BancoDto dto) {	
	    return modelMapper.map(dto,Banco.class);	
	}

}
