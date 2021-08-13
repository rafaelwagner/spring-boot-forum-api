package br.com.rafael.forum.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import br.com.rafael.forum.model.Curso;

@DataJpaTest
@ActiveProfiles("test")
class CursoRepositoryTest {

	@Autowired
	private CursoRepository repository;
	
	@Test
	public void deveriaCarregarUmCursoAoBuscarPorNome() {
		String nomeCurso = "HTML 5";
		Curso curso = repository.findByNome(nomeCurso);
		Assertions.assertNotNull(curso);
		Assertions.assertEquals(nomeCurso, curso.getNome());
	}
	
	@Test
	public void naoDeveriaCarregarUmCursoAoBuscarPorNomeInvalido() {
		String nomeCurso = "CURSO INVALIDO";
		Curso curso = repository.findByNome(nomeCurso);
		Assertions.assertNull(curso);
	}

}
