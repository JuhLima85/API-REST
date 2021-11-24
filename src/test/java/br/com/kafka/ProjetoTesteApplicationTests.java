package br.com.kafka;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.kafka.Model.ProdutoModel;
import br.com.kafka.Repository.ProdutoRepository;

@SpringBootTest
class ProjetoTesteApplicationTests {
	
	@Autowired
	private ProdutoRepository cadRep;
	
	@Test
	void contextLoads() {
		ProdutoModel cad = new ProdutoModel();
		cad.setNome("Shampoo");
		cad.setQuantidade(6.00);
		cad.setValor(120.00);
		
		cadRep.save(cad);
		
	}

}
