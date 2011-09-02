package br.com.dado.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.dado.java.Coelho;

public class CoelhoTest {

	private Coelho coelho;
	
	@Before
	public void setup() {
		coelho = new Coelho();
	}
		
	@Test
	public void emDezesseisMesesDeveParirDozeDescendentes() {
		assertEquals(12, coelho.quantidadeDeDescendentesGeradosEm(16));
	}

}
