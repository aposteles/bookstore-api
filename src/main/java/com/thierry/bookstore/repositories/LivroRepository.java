package com.thierry.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thierry.bookstore.domain.Categoria;


@Repository
public interface LivroRepository  extends JpaRepository<Categoria,Integer>{
	
	

}
