import java.util.Scanner;

public class ExibeIMC{


	public static void main(String... args){
		
		IMC imc = new IMC();

		Scanner scan = new Scanner(System.in);
		System.out.println("Informe a aultura: ");
		double altura = scan.nextDouble();
		System.out.println("Informe o peso: ");
		double peso = scan.nextDouble();

		System.out.println("O seu IMC eh: " + imc.calcularIMC(altura, peso));
	
	}

}
