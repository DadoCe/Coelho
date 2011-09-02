package br.com.dado.java;

public class Coelho {

	private final int INICIO_DA_FERTILIDADE = 6;

	public int quantidadeDeDescendentesGeradosEm(int meses) {
		int filhos = 0;
		int descendentes = 0;

		if (isPeriodoFertil(meses))
			filhos = quantidadeDeFilhosEm(meses);

		for (int i = 0; i <= filhos; i++)
			descendentes += quantidadeDeDescendentesNaGestacaoDeNumero(i);

		return descendentes;
	}

	private boolean isPeriodoFertil(int meses) {
		return meses - INICIO_DA_FERTILIDADE > 0;
	}

	private int quantidadeDeFilhosEm(int meses) {
		return ((meses - INICIO_DA_FERTILIDADE) / 2) + 1;
	}

	private int quantidadeDeDescendentesNaGestacaoDeNumero(int gestacao) {
		if (gestacao < 2)
			return gestacao;
		if (gestacao == 2)
			return 1;

		return quantidadeDeDescendentesNaGestacaoDeNumero(gestacao - 1)
				+ quantidadeDeDescendentesNaGestacaoDeNumero(gestacao - 3);
	}
}
