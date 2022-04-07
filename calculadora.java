import java.util.Scanner;
import java.util.SortedMap;
public class calculadora {
    
     public static void main(String[] args) {
        
        System.out.println("Calculadora Simples");
       
        int opcao;
        do {
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.print("O que você deseja fazer? (0 para sair)");
            
            Scanner scanner = new Scanner(System.in);
             opcao = scanner.nextInt();
        
             processar(opcao);
        } while (opcao != 0);

    }


public static void processar(int opcao){
switch (opcao) {
    case 1: { 
        Scanner scanner = new Scanner(System.in);
        System.out.println("Somando Dois Numeros");
        
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;
       
        System.out.println("A soma dos dois numeros é: " + soma);
        break;
    }
   
    case 2: {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Subtraindo Dois Numeros");

        System.out.print("Digite o Primeiro Número: ");
        int numero3 = scanner.nextInt();

        System.out.print("Digite o Segundo Número: ");
        int numero4 = scanner.nextInt();

    
        int subtrair = numero3 - numero4;
        System.out.println("A Subtração dos dois números é: " + subtrair);
        break;
    }

    case 3: {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Multiplicando dois Números: ");
        
        System.out.print("Digite o Primeiro Numero: ");
        int numero5 = scanner.nextInt();

        System.out.print("Digite o Segundo Numero: ");
        int numero6 = scanner.nextInt();

        
        int multiplicando = numero5 * numero6;
        System.out.println("A Multiplicação dos dois numeros é: "+ multiplicando);
        break;



    }

    case 4: {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dividindo Dois Numeros");
        
        System.out.print("Digite o Primeiro Numero: ");
        double numero7 = scanner.nextInt();

        System.out.print("Digite o Segundo Numero: ");
        double numero8 = scanner.nextInt();
        if (numero8 == 0) {
             System.out.println("Impossivel dividir por 0");
        }
        double dividir = numero7 / numero8;
        System.out.print("A divisão dos dois numeros é: " + dividir);
        break;
    }


}   
}
}