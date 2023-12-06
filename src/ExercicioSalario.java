import java.util.Scanner;

public class ExercicioSalario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.print("Digite o Salário: ");
		salario = sc.nextFloat();
		
		System.out.print("\nDigite o Abono: ");
		abono = sc.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("\nNovo Salário é de: " + String.format("%.2f", novoSalario));
		
		sc.close();

	}

}
