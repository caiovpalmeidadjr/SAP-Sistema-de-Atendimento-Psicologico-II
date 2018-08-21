package br.com.sitemaatendimentopsicologico.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.sitemaatendimentopsicologico.model.Psicologo;

// importando a classe nativa do spring com os métodos padroes: insert, update, select, delete
// deve ser extendida (passando o tipo do objeto e o id) pois o proprio spring faz a implementação, o spring vai trazer o entityManager, controlar as transações, etc.
// @Repository Você é um bean do Spring 
@Repository
public interface PsicologoRepository extends JpaRepository<Psicologo, Long> {

	@Query("select psi from Psicologo psi where psi.email =:email")
	public Psicologo findByEmail(@Param("email") String email);
	
	@Query("select psi from Psicologo psi")
	public List<Psicologo> findAllPsicologo();
}
