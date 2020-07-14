package edu.es.eoi.user.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.user.dto.CuentaDto;
import edu.es.eoi.user.entity.Cuenta;
import edu.es.eoi.user.repository.MyRepository;

@Service
public class CuentaService {

	@Autowired
	private MyRepository<Cuenta> repository;

	@Autowired
	ModelMapper modelMapper;

	public CuentaDto findCuentaById(Integer id) {
		return this.convertToDto(repository.findById(id));
	}

	public void createCuenta(CuentaDto cuenta) {
		repository.create(this.convertToEntity(cuenta));
	}

	public void updateCuenta(CuentaDto cuenta) {
		repository.update(this.convertToEntity(cuenta));
	}

	public void deleteById(Integer id) {
		repository.deleteById(id);
	}

	public List<CuentaDto> findAll() {
		return repository.findAll().
				stream().
				map(this::convertToDto).
				collect(Collectors.toList());
	}

	private CuentaDto convertToDto(Cuenta entity) {
		return modelMapper.map(entity, CuentaDto.class);
	}

	private Cuenta convertToEntity(CuentaDto dto) {
		return modelMapper.map(dto, Cuenta.class);
	}

}
