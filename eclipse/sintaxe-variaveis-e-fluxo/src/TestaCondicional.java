
public class TestaCondicional {

	public static void main(String[] args) {
		int idade = 15;
		int idadeMinimaPermitida = 16;
		int quantidadeAcompanhantes = 2;

		if (idade >= idadeMinimaPermitida) {
			System.out.println("Voc� pode entrar, tem " + idadeMinimaPermitida + " anos ou mais");
		} else {
			if (quantidadeAcompanhantes >= 1) {
				System.out.println(
						"Voc� n�o tem " + idadeMinimaPermitida + " anos, mas pode entrar por estar acompanhado");
			} else {
				System.out.println("Infelizmente voc� n�o pode entrar por ser menor de idade e n�o estar acompanhado");
			}

		}
	}

}
