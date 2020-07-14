package edu.es.eoi.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.user.dto.ClienteDto;
import edu.es.eoi.user.dto.CuentaDto;
import edu.es.eoi.user.entity.Cliente;
import edu.es.eoi.user.entity.Cuenta;
import edu.es.eoi.user.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;
	
	@Autowired
	ModelMapper modelMapper;
	
	public ClienteDto findClienteById(String dni) {
		return convertToDto(repository.findById(dni));
	}

	public List<CuentaDto> findCuentasClienteById(String dni) {
		
		List<CuentaDto> dtos = new ArrayList<CuentaDto>();

		for (Cuenta cuenta : repository.findById(dni).getCuentas()) {
			CuentaDto cuentaDto = new CuentaDto();
			BeanUtils.copyProperties(cuenta, cuentaDto);
			dtos.add(cuentaDto);
		}

		return dtos;
	}

	public void createCliente(ClienteDto dto) {
		repository.create(convertToEntity(dto));
	}

	public void updateCliente(ClienteDto dto) {
		repository.update(convertToEntity(dto));
	}

	public void deleteById(String dni) {
		repository.deleteById(dni);
	}

	public List<ClienteDto> findAll() {
		return repository.findAll().
				stream().
				map(this::convertToDto).
				collect(Collectors.toList());
	}

	private ClienteDto convertToDto(Cliente	entity) {	
	    return modelMapper.map(entity,ClienteDto.class);	
	}
	
	private Cliente convertToEntity(ClienteDto dto) {	
	    return modelMapper.map(dto,Cliente.class);	
	}

}
