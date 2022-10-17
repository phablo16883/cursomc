package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Cliente;
import com.nelioalves.cursomc.repositories.ClienteRepository;
import com.nelioalves.cursomc.services.exceptions.ObjecNotFoundException;

@Service
public class ClienteService {
	
	
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente find(Integer id) {
		 Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException ( 
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName(),null ));
		} 

	

	//public Cliente buscar( Integer id) {
		
		//Cliente obj =  repo.findOne (id);
		//return obj;
		
	//public Cliente find(Integer id) {
		// Optional<Cliente> obj = repo.findById(id);
		//if (obj == null) {
			
	//		throw new ObjecNotFoundException("objeto nao encomntrado! Id", + id +"tipo "+ Cliente.class.getName()):
		//}
		 
		// return obj;
	//	}




	public Cliente buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	} 


}
