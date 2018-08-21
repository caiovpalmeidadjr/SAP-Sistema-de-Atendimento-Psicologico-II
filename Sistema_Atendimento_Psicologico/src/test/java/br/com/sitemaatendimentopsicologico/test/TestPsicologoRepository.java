package br.com.sitemaatendimentopsicologico.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.sitemaatendimentopsicologico.model.Psicologo;
import br.com.sitemaatendimentopsicologico.repository.PsicologoRepository;
import junit.framework.Assert;

// @RunWith(SpringRunner.class) Rodando classe de test do JUnit usando o Spring
// @DataJpaTest ... Não suja o Banco de dados ao Usar a camada de persistencia, ele cria um banco interno e faz os testes
@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class TestPsicologoRepository {
	
	// injetar uma dependência (Spring constroi o objeto e coloca na propriedade)
	@Autowired
	private PsicologoRepository psiRepository;
	
	@Test
	public void testSavePsicologo() {
		
		Psicologo psi = new Psicologo();
		psi.setNome("Jennyfer de Paula Marques");
		psi.setEmail("jennymarques93@gmail.com");
		
		Psicologo psiTestNull = psiRepository.save(psi);
		//testando se é nulo 
		Assert.assertNotNull(psiTestNull.getId());
	}
	
}
