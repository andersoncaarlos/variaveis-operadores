import java.util.Locale;
import java.util.Scanner;

public class ExercicioDiferenca {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Digite o segundo número: ");
		float n2 = sc.nextFloat();
		
		System.out.print("Digite o terceiro número: ");
		float n3 = sc.nextFloat();
		
		System.out.print("Digite o quarto número: ");
		float n4 = sc.nextFloat();
		
		float calculo = (n1 * n2) - (n3 * n4);
		
		System.out.println("Diferença: " + calculo);
		
		sc.close();

	}

}
