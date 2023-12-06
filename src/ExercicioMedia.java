import java.util.Locale;
import java.util.Scanner;

public class ExercicioMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Digite a primeira nota: ");
		float nota1 = sc.nextFloat();
		
		System.out.print("Digite a segunda nota: ");
		float nota2 = sc.nextFloat();
		
		System.out.print("Digite a terceira nota: ");
		float nota3 = sc.nextFloat();
		
		System.out.print("Digite a quarta nota: ");
		float nota4 = sc.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println();
		System.out.println("Média final " + String.format("%.1f", media));		
		
		
		sc.close();
	}

}
