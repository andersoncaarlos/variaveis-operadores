import java.util.Locale;
import java.util.Scanner;

public class ExercicioSalario2 {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Salário Bruto: ");
		float salario = sc.nextFloat();
		
		System.out.print("Adicional Noturno: ");
		float adc = sc.nextFloat();
		
		System.out.print("Horas Extras: ");
		float horas = sc.nextFloat();
		
		System.out.print("Descontos: ");
		float desconto = sc.nextFloat();
		
		float salarioLiquido = salario + adc + (horas * 5) - desconto;
		
		
		System.out.println("Salário Líquido: " + String.format("%.2f", salarioLiquido));

		
		
		sc.close();

	}

}
