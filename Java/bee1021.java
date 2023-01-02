package Bee1021; // remover pra enviar no beecrowd

import java.util.Scanner;

public class Main {
    // Classe interna que armazena as cédulas
    static class Cedula {
        int nota_100 = 0;
        int nota_50 = 0;
        int nota_20 = 0;
        int nota_10 = 0;
        int nota_5 = 0;
        int nota_2 = 0;
    }
    
    static class Moeda{
    	int moeda_100 = 0;
    	int moeda_050 = 0;
    	int moeda_025 = 0;
    	int moeda_010 = 0;
    	int moeda_005 = 0;
    	int moeda_001 = 0;

    }

    // Método principal onde inicia o programa
    public static void main(String[] args) {
        // Cria uma nova instância da classe Cedula
        Cedula cedulas = new Cedula();
        
        // Cria uma nova instância da classe Moeda
        Moeda moedas = new Moeda();
        
        // Remover pra envio no beecrowd
        System.out.println("Qual o troco?!");

        // Recebe o valor pela entrada
        Scanner entrada = new Scanner(System.in);
        double dinheiro = Double.parseDouble(entrada.nextLine());

        // Declara as cédulas como constantes
        final int[] vetor_notas = {100,50,20,10,5,2};
        
        // Declara as moedas como constantes
        final double[] vetor_moedas = {(double) 1, (double) 0.5, (double) 0.25, (double) 0.10, (double) 0.05, (double) 0.01};

       
        // dinheiro (576) / 100 = 5
        // dinheiro (576 % 100 = 76
        
        for (int valor: vetor_notas) {
        	while (dinheiro >= valor) {
        		dinheiro -= valor;
        		dinheiro = Math.round(dinheiro * 100.0) / 100.0; // arredonda para o inteiro mais próximo
        		  if (valor == 100) {
                      cedulas.nota_100++;
                  } else if (valor == 50) {
                      cedulas.nota_50++;
                  } else if (valor == 20) {
                      cedulas.nota_20++;
                  } else if (valor == 10) {
                      cedulas.nota_10++;
                  } else if (valor == 5) {
                      cedulas.nota_5++;
                  } else if (valor == 2) {
                      cedulas.nota_2++;
                  } 
        	}
        }
        
        
        for (double valor: vetor_moedas) {
        	while (dinheiro >= valor) {
        		dinheiro -= valor;
        		dinheiro = Math.round(dinheiro * 100.0) / 100.0; // arredonda para o inteiro mais próximo
        		  if (valor == 1) {
                      moedas.moeda_100++;
                  } else if (valor == 0.5) {
                      moedas.moeda_050++;
                  } else if (valor == (double) 0.25) {
                      moedas.moeda_025++;
                  } else if (valor == (double) 0.10) {
                      moedas.moeda_010++;
                  } else if (valor == (double) 0.05) {
                      moedas.moeda_005++;
                  } else if (valor == (double) 0.01) {
                      moedas.moeda_001++;
                  } 
        	}
        }
        
	
	// Cédulas
    System.out.println("NOTAS:");
	
	// Cédulas
	System.out.print(cedulas.nota_100);
	System.out.println(" nota(s) de R$ 100,00");
	
	System.out.print(cedulas.nota_50);
	System.out.println(" nota(s) de R$ 50,00");
	
	System.out.print(cedulas.nota_20);
	System.out.println(" nota(s) de R$ 20,00");
	
	System.out.print(cedulas.nota_10);
	System.out.println(" nota(s) de R$ 10,00");
	
	System.out.print(cedulas.nota_5);
	System.out.println(" nota(s) de R$ 5,00");
	
	System.out.print(cedulas.nota_2);
	System.out.println(" nota(s) de R$ 2,00");
	
	// Moedas
	System.out.println("MOEDAS:");
	
	System.out.print(moedas.moeda_100);
	System.out.println(" moeda(s) de R$ 1,00");
	
	System.out.print(moedas.moeda_050);
	System.out.println(" moeda(s) de R$ 0,50");
	
	System.out.print(moedas.moeda_025);
	System.out.println(" moeda(s) de R$ 0,25");
	
	System.out.print(moedas.moeda_010);
	System.out.println(" moeda(s) de R$ 0,10");
	
	System.out.print(moedas.moeda_005);
	System.out.println(" moeda(s) de R$ 0,05");
	
	System.out.print(moedas.moeda_001);
	System.out.println(" moeda(s) de R$ 0,01");
	
	
	entrada.close();
}

}