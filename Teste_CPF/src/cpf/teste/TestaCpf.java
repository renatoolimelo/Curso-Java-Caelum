package cpf.teste;

public class TestaCpf {

	public static void main(String[] args) {

		String cpf = "38434585880";
		int[] digitoCpf = new int[11];
		boolean digito10Correto;
		boolean digito11Correto = false;

		for (int i = 0; i < 11; i++) {
			digitoCpf[i] = Character.getNumericValue(cpf.charAt(i));
		}

		digito10Correto = CalculaDigito.verificaDigito(digitoCpf, 9, 11);

		if (digito10Correto) {

			digito11Correto = CalculaDigito.verificaDigito(digitoCpf, 10, 12);

		}

		if (digito10Correto && digito11Correto) {
			System.out.println("O CPF " + cpf + " é valido, digitos: " + digitoCpf[9] + digitoCpf[10]);
		} else {
			System.out.println("O CPF " + cpf + " é invalido");
		}

	}

}
