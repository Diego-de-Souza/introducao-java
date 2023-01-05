import java.util.Scanner;

/* Faça um programa que calcule o fatorial de um número inteiro
fornecido pelo usuário.
Ex.: 5!=120 (5*4*3*2*1)
 */
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int somaFatorial = 1;

        for(int i = fatorial; i>=1 ; i--){
            somaFatorial = somaFatorial * i;
        }

        System.out.println("O fatorial de "+fatorial+" é "+somaFatorial);
    }
}
