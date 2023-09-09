package program;

import java.util.Scanner;

public class BoletimEstudantil {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor da nota: ");
		int mediaFinal = sc.nextInt();
		
		if(mediaFinal < 6)
			System.out.println("Reprovado");
		else if(mediaFinal==6)
			System.out.println("Prova Minerva");
		else
			System.out.println("Aprovado");
		
		sc.close();
	}

}
