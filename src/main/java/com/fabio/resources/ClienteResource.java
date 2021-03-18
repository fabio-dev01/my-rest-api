package com.fabio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fabio.model.Cliente;
import com.fabio.repository.ClienteRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api") 
@Api(value="API REST CLIENTES")
@CrossOrigin(origins="*") 
public class ClienteResource {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	@ApiOperation(value="Lista todos os clientes")
	public List<Cliente> listaClientes(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/clientes/{id}")
	@ApiOperation(value="Lista pelo ID")
	public Cliente listaClienteUnico(@PathVariable(value="id") long id){
		return clienteRepository.findById(id);
	}
	
	@PostMapping("/cliente")
	@ApiOperation(value="Salva Cliente")
	public Cliente salvaCliente(@RequestBody Cliente cliente){
		return clienteRepository.save(cliente);
	}
	
	@DeleteMapping("/cliente")
	@ApiOperation(value="Deleta Cliente")
	public void deletaCliente(@RequestBody Cliente cliente){
		clienteRepository.delete(cliente);
	}
	
	@PutMapping("/cliente")
	@ApiOperation(value="Atualiza Cliente")
	public Cliente atualizaCliente(@RequestBody Cliente cliente){
		return clienteRepository.save(cliente);
	}
	
}
