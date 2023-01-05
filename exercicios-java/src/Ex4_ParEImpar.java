import java.util.Scanner;

/*Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de  números pares
 * e a quantidade de números ímpares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int par=0,impar=0, soma=0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count= 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
        
            soma = soma + numero;
        
            if(numero %2 ==0) par++;
            else impar++;
            
            count++;

        } while (count < quantNumeros);

        System.out.println("Quantidade de números pares: "+par);
        System.out.println("Quantidade de números ímpar: "+impar);
        System.out.println("A soma de todos os números é: "+soma);
    }
}
