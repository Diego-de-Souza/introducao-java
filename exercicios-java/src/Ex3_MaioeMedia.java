import java.util.Scanner;

/*
 * Faça um programa que leia 5 numeros e informe o
 * maior numero e a média desses números.
 */
public class Ex3_MaioeMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count=0;
        int maior = 0;
        int media = 0;

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            media = (media + numero);
            if(numero > maior){
                maior = numero;
            }
            count++;    
        } while (count < 5);

        System.out.println("O maior número é: "+maior);
        System.out.println("A média dos números é: "+(media/count));
    }

}
