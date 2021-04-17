package cpf.teste;

public abstract class CalculaDigito {

	public static boolean verificaDigito(int[] digitoCpf, int posicaoDigito, int numeroFormula) {

		int total = 0;
		int resto;
		int digitoCalculado;

		for (int i = 0; i < posicaoDigito; i++) {
			total += digitoCpf[i] * (numeroFormula - (i + 1));
		}

		resto = total % 11;
		digitoCalculado = 11 - resto;

		if (digitoCalculado > 9) {
			digitoCalculado = 0;
		}

		return digitoCalculado == digitoCpf[posicaoDigito];
	}

}
