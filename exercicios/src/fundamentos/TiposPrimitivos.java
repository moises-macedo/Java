package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informações do funcionários;

		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_324_845_223L;

		// tipos numeros reais

		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;

		// tipo booleano
		boolean estarDeFerias = false;

		// tipos caracteres

		char status = 'a'; // ativos

		// dias de empresa
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numerosDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + ":ganha => " + salario);
		System.out.println("Férias? " + estarDeFerias);
		System.out.println("Status: " + status);

	}

}
