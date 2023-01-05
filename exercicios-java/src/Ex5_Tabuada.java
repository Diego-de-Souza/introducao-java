import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capas de gerar a tabuada
 * de qualquer número inteiro entre 1 e 10.
 * O usuário deve informar de qual número ele deseja ver a tabuada.
 * Asaída deve ser o exmeplo abaixo
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ....
 * 5 X 10 = 50
 */
public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada do "+tabuada);
        int resultadoTabuada = 0;

        for(int i=1;i <= 10; i++){
            resultadoTabuada = tabuada * i;

            System.out.println(tabuada+" X "+i+" = "+resultadoTabuada);
        }
    }
}
