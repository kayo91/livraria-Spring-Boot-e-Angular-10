package com.kayo.backend.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kayo.backend.domain.Categoria;
import com.kayo.backend.domain.Livro;
import com.kayo.backend.repositories.CategoriaRepository;
import com.kayo.backend.repositories.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;

	public void instanciaBaseDeDados() {
		Categoria cat1 = new Categoria(null, "Informatica", "Livros de TI"); // Primeiro null é do id
		Categoria cat2 = new Categoria(null, "Aventura", "Livros de aventura");
		Categoria cat3 = new Categoria(null, "Terror", "Livros de terror");
		
		Livro l1 = new Livro(null, "Clean code", "Robert Martin", "Loren ipsum", cat1);
		Livro l2 = new Livro(null, "As aventuras de tim tim", "Robert Martin", "Loren ipsum", cat2);
		Livro l3 = new Livro(null, "O lobo", "Kayo", "Loren ipsum", cat3);
		Livro l4 = new Livro(null, "A fera", "kayo renan", "Loren ipsum", cat3);
		
		
		
		
		cat1.getLivros().addAll(Arrays.asList(l1));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		this.livroRepository.saveAll(Arrays.asList(l1, l2, l3, l4));
	}
}
