package br.unicamp.ic.inf335.beans;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;


import org.junit.jupiter.api.Test;

class AnucianteBeanTest {
	
	@Test 
	void addRemoveAnuncios(){
		var anunciante = new AnuncianteBean();
		var anuncio = new AnuncioBean();
		var anuncio2 = new AnuncioBean();
		var anuncio3 = new AnuncioBean();
		
		var produto = new ProdutoBean("codigo", "Produto", "descricao", 1000.0, "SP");
		var produto2 = new ProdutoBean("codigo", "Produto", "descricao", 200.0, "SP");
		var produto3 = new ProdutoBean("codigo", "Produto", "descricao", 300.0, "SP");
		
		anuncio.setProduto(produto);
		anuncio2.setProduto(produto2);
		anuncio3.setProduto(produto3);
		
		ArrayList<AnuncioBean> anuncios = new ArrayList<AnuncioBean>();
        anuncios.add(anuncio);
        
		anunciante.setAnuncios(anuncios);
		assertEquals(anuncios, anunciante.getAnuncios());
		
		//adicionar
		anunciante.addAnuncio(anuncio2);
		assertEquals(2, anunciante.getAnuncios().size());
		anunciante.addAnuncio(anuncio3);
		assertEquals(3, anunciante.getAnuncios().size());
		
		
		// remover posição não existente
		anunciante.removeAnuncio(3);
		assertEquals(3, anunciante.getAnuncios().size());
		
		//remover
		anunciante.removeAnuncio(1);
		assertEquals(2, anunciante.getAnuncios().size());
		assertEquals(anuncio, anunciante.getAnuncios().get(0));
		assertEquals(anuncio3, anunciante.getAnuncios().get(1));


	}

	@Test 
	void testValorMedio() {
		var anunciante = new AnuncianteBean();
		assertEquals(0.0, anunciante.valorMedioAnuncios());

		var anuncio = new AnuncioBean();
		var anuncio2 = new AnuncioBean();
		var anuncio3 = new AnuncioBean();

		var produto = new ProdutoBean("codigo", "Produto", "descricao", 1000.0, "SP");
		var produto2 = new ProdutoBean("codigo", "Produto", "descricao", 200.0, "SP");
		var produto3 = new ProdutoBean("codigo", "Produto", "descricao", 300.0, "SP");

		anuncio.setProduto(produto);
		anuncio2.setProduto(produto2);
		anuncio3.setProduto(produto3);
		
		ArrayList<AnuncioBean> anuncios = new ArrayList<AnuncioBean>();
        anuncios.add(anuncio);
        anuncios.add(anuncio2);
        anuncios.add(anuncio3);

		anunciante.setAnuncios(anuncios);

		assertEquals(anuncios, anunciante.getAnuncios());
		
		assertEquals(500.0, anunciante.valorMedioAnuncios());

	}
}
