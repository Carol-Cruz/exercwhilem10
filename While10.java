package while10;

import java.util.Scanner;

public class While10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner captura = new Scanner(System.in);

		int idade;
		int totalMaior = 0;
		int totalMenor = 0;

		System.out.println("Digite sua idade:");
		idade = captura.nextInt();
		while (idade > -1) {
			System.out.println("Digite sua idade:");
			idade = captura.nextInt();
			if (idade < 21) {
				totalMenor++;
			} else if (idade > 50) {
				totalMaior++;
			}

		}
		System.out.println("O total de pessoas menores de 21 anos é: " + totalMenor);
		System.out.println("O total de pessoas maiores de 50 anos é: " + totalMaior);
	}

}
