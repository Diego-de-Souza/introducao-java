import java.util.Scanner;

/**
 * Faça um programa que leia conjutos de dois valores
 * o primeiro representando o nome do aluno e o segundo representando a sua idade
 * (Pare o programa inserindo o valor 0 no campo nome)
 */
public class EX1_NomeEIdade {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome=scan.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade=scan.nextInt();
            if(idade == 0 ) break;
        }
        System.out.println("Continue aqui...");
    }
}