package bee1018;
import java.util.Scanner;

public class bee1018 {
    // Classe interna que armazena as cédulas
    static class Cedula {
        int nota_100 = 0;
        int nota_50 = 0;
        int nota_20 = 0;
        int nota_10 = 0;
        int nota_5 = 0;
        int nota_2 = 0;
        int nota_1 = 0;
    }

    // Método principal onde inicia o programa
    public static void main(String[] args) {
        // Cria uma nova instância da classe Cedula
        Cedula cedulas = new Cedula();

        // Recebe o valor pela entrada
        Scanner entrada = new Scanner(System.in);
        int dinheiro = Integer.parseInt(entrada.nextLine());
        System.out.println(dinheiro);

        // Declara as cédulas como constantes
        final int cem = 100;
        final int cinquenta = 50;
        final int vinte = 20;
        final int dez = 10;
        final int cinco = 5;
        final int dois = 2;
        final int um = 1;

	
	
	while (dinheiro >= cem) {
		dinheiro -= cem;
		cedulas.nota_100++;
	}
	
	while (dinheiro >= cinquenta) {
		dinheiro -= cinquenta;
		cedulas.nota_50++;
	}
	
	while (dinheiro >= vinte) {
		dinheiro -= vinte;
		cedulas.nota_20++;
	}
	
	while (dinheiro >= dez) {
		dinheiro -= dez;
		cedulas.nota_10++;
	}
	
	while (dinheiro >= cinco) {
		dinheiro -= cinco;
		cedulas.nota_5++;
	}
	
	while (dinheiro >= dois) {
		dinheiro -= dois;
		cedulas.nota_2++;
	}
	
	while (dinheiro >= um) {
		dinheiro -= um;
		cedulas.nota_1++;
	}
	
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
	
	System.out.print(cedulas.nota_1);
	System.out.println(" nota(s) de R$ 1,00");
	
	entrada.close();
	
	

		
}

}