package br.senai.sp.jandira;

import java.util.Scanner;

public class MatrizABC {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int mA[] = new int[6];
		int mB[] = new int[6];
		int i = 0;
		int mC[] = new int[6];
		
		System.out.println("***********************************");
		System.out.println("             MATRIZ A"              );
		System.out.println("***********************************");
		System.out.println("");
		
		while (i < mA.length) {
			
			System.out.print("Insira o " +(i+1)+ "º valor para a matriz A:");
			mA[i] = teclado.nextInt();
			i++;
		}
		
		i = 0;
		
		System.out.println("");
		System.out.println("------------------------------------------");
		
		System.out.println("***********************************");
		System.out.println("             MATRIZ B"              );
		System.out.println("***********************************");
		System.out.println("");
		
		while (i < mB.length) {
			
			System.out.print("Insira o " +(i+1)+ "º valor para a matriz B:");
			mB[i] = teclado.nextInt();
			i++;
		}
		
		i = 0;
		System.out.println("------------------------------------------");
		System.out.println("");
		System.out.println("O resultado das subtrações é:");
		System.out.println("");
		
		while (i < mC.length) {
			
			mC[i] = mA[i] - mB[i];
			System.out.println(mA[i]+ " - " +mB[i]+ " = " +mC[i]);
			i++;
		}
		
	}

}
