package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AnuncioBeanTest {

	@Test
	void testCriarAnuncioBean() {
		var anuncio = new AnuncioBean();
		var produto = new ProdutoBean("codigo", "Produto", "descricao", 10.5, "SP");
		anuncio.setProduto(produto);
		anuncio.setDesconto(10.0);

		assertEquals(produto, anuncio.getProduto());
		assertEquals(10.0, anuncio.getDesconto());
		
	}
	
	
	@Test
	void testGetValor() {
		var anuncio = new AnuncioBean();
		var produto = new ProdutoBean("codigo", "Produto", "descricao", 100.0, "SP");
		anuncio.setProduto(produto);
		anuncio.setDesconto(10.0);

		//pouco desconto
		assertEquals(90.0, anuncio.getValor());
		
		//muito desconto
		anuncio.setDesconto(50.0);
		assertEquals(50.0, anuncio.getValor());
		
		//sem desconto
		anuncio.setDesconto(0.0);
		assertEquals(100.0, anuncio.getValor());
		
	}

}
