package Application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.TaxPayer;

public class ProgramTextPayer {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double salaryIncome = null;
		Double serviceIncome = null;
		Double capitalIncome = null;
		Double healthSpanding = null;
		Double educationSpending = null;

		List<TaxPayer> list = new ArrayList<>();
		//TaxPayer taxtPayer = null;

		System.out.print("Quantos contribuintes você vai digitar? ");
		Integer n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			
			System.out.println();
			System.out.println("Digite os dados " + (i + 1) + "o contribuinte:");
			
			System.out.print("Renda anual com salário: ");
			salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			serviceIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			healthSpanding = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			educationSpending = sc.nextDouble();

			list.add(new TaxPayer(salaryIncome, serviceIncome, capitalIncome, healthSpanding,
					educationSpending));

		}

	
		System.out.println();
		for (int i = 0; i < n; i++) {
			
			System.out.println();
			System.out.println("Resumo do " + (i + 1) + "o contribuinte:");
			
		System.out.println(list.get(i).toString());
				
			
		}
	

	

		sc.close();

	}

}
