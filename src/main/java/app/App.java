package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

/**
  * 
  * Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
  * podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
  * bem como o total de imposto arrecadado. 
  *
  **/
public class App 
{
    public static void main( String[] args )
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            sc.nextLine();
            char ch = sc.nextLine().charAt(0);
            if (ch == 'i') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                list.add(new Individual(name, anualIncome, healthExpenditures));
            }
            else if (ch == 'c') {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();
                list.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double totalTaxes = 0.0;
        for (TaxPayer taxPayer : list) {
            totalTaxes += taxPayer.tax();
            System.out.println(taxPayer.getName() + ": $ " + String.format("%.2f", taxPayer.tax()));
        }

        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", totalTaxes));

        sc.close();
    }
}
