package com.nelioalves.cursomc.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.exceptions.ObjecNotFoundException;

@Service
public class CategoriaService {
	
	
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		 Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException ( 
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(),null ));
		} 

	

	//public Categoria buscar( Integer id) {
		
		//Categoria obj =  repo.findOne (id);
		//return obj;
		
	//public Categoria find(Integer id) {
		// Optional<Categoria> obj = repo.findById(id);
		//if (obj == null) {
			
	//		throw new ObjecNotFoundException("objeto nao encomntrado! Id", + id +"tipo "+ Categoria.class.getName()):
		//}
		 
		// return obj;
	//	}




	public Categoria buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	} 


}
