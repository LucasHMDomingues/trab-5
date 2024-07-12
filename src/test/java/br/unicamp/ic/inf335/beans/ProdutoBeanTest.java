package br.unicamp.ic.inf335.beans;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProdutoBeanTest {

	
	@Test
	void testCriarProduto() {
		var codigo = "codigo";
		var nome = "nome";
		var descricao = "descricao";
		var valor = 13.54;
		var estado = "estado";

		var produto1 = new ProdutoBean();
		produto1.setCodigo(codigo);
		produto1.setNome(nome);
		produto1.setDescricao(descricao);
		produto1.setValor(valor);
		produto1.setEstado(estado);
		assertEquals(codigo, produto1.getCodigo());
		assertEquals(nome, produto1.getNome());
		assertEquals(descricao, produto1.getDescricao());
		assertEquals(valor, produto1.getValor());
		assertEquals(estado, produto1.getEstado());
		
	}
	
	@Test
	void testCompareTo() {
		var produto1 = new ProdutoBean();
		var produto2 = new ProdutoBean();
		var produto3 = new ProdutoBean();
		 ArrayList<ProdutoBean>  lista_produtos = new ArrayList<>(Arrays.asList(produto1, produto2, produto3));;
		
		produto1.setValor(2.5);
		produto2.setValor(6.1);
		produto3.setValor(1.9);
		
		 ArrayList<ProdutoBean>  lista_produtos_ordem_certa = new ArrayList<>(Arrays.asList(produto3, produto1, produto2));;

		
		Collections.sort(lista_produtos);
		
		assertEquals(lista_produtos, lista_produtos_ordem_certa);

	}

}
