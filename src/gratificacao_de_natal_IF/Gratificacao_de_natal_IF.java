package gratificacao_de_natal_IF;

import java.util.Scanner;

public class Gratificacao_de_natal_IF {

	public static void main(String[] args) {
		Double horaExtra, horaFalta, horaSaldo;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Infome o número de horas extras");
		horaExtra = input.nextDouble();
		
		System.out.println("Infome o número de horas faltadas");
		horaFalta = input.nextDouble();
		
		horaSaldo = horaExtra - (horaFalta + horaFalta* 0.6667);
		
		if (horaSaldo > 2400) {
			System.out.println("Gratificação de R$ 500,00.");
		}else if (horaSaldo >= 1801 && horaSaldo <= 2400) {
			System.out.println("Gratificação de R$ 400,00.");
		}else if (horaSaldo >= 1201 && horaSaldo < 1800) {
			System.out.println("Gratificação de R$ 300,00.");
		}else if (horaSaldo >= 600 && horaSaldo < 1200) {
			System.out.println("Gratificação de R$ 200,00.");
		}else {
			System.out.println("Gratificação de R$ 100,00.");
		}
		input.close();
	}

}
