
public class testeRepeticao {

	public static void main(String[] args) {

		int contador = 0;
		int total = 0;

		while (contador <= 10) {
			// total = total + contador;
			total += contador;
			contador++;
		}
		
		System.out.println("Total usando repiti��o while" + total);

		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}
}
