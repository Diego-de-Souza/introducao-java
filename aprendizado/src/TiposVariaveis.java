public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        /**tipos primitivos de dados, temos 8 tipos:
         * int - 4 bytes - valor minimo -2147483648, valor maximo 2147483647
         * byte - 1 byte - valor minimo -128, valor máximo 127
         * short - 2 bytes - valor minimo -32768, valor maximo -32767
         * long -  8 bytes - valor minimo -9223372036854775808, valor maximo 9223372036854775807 
         * float - 4 bytes - valor minimo -3.40292347E+38, valor maximo 3.40292347E+38
         * double - 8 bytes - valor minimo -1.79769313486231570E+308, valor maximo 1.79769313486231570E+308
         * boolean - 1 bit - true or false
         * char - 2 bytes - de '\u0000' a '\uFFFF'
         * representam valores brutos e não objetos
         */
        
         /*Declaração de variaveis
          * <tipo> <nome da variavel> <atribuição, podendo não ter a atribuição, é opcional>
          */

          byte idade = 12;
          short ano = 2021;
          int cep = 9842360; //se começar com zero, talvez tenha que ser outro tipo
          long cpf = 98765432109L; // se começar com zero, talvez tenha que ser outro tipo e deve ter o L no final
          float pi = 3.14F;//o tipo float deve ter o F
          double salarioMinimo = 2500;
        
        System.out.println("Hello, World!");
        System.out.println("Testando a impressão da váriavel - tipo Double: "+salarioMinimo+" tipo byte: "+idade+" tipo short: "+ano+" tipo int: "+cep+" tipo long: "+cpf+" tipo float: "+pi);

        /**Java é fortemente tipada então cuidado com o que queira fazer
         * veja o exemplo abaixo que não fazer:
         * 
         * short primeiroNumero = 1;
         * int segundoNumero = primeiroNumero;
         * short terceiroNumero = segundoNumero;        
         * como resolver:
         */
        short primeiroNumero = 1;
        int segundoNumero = primeiroNumero;
        short terceiroNumero = (short) segundoNumero;
        System.out.println(terceiroNumero);
        
        /**Como fazer que a várivel nunca mude?
         * é utilizando a expressão "final" antes do tipo e deve ser escrita em caixa alta
         */
        final double VALOR_DE_PI = 3.14;
        System.out.println(VALOR_DE_PI);


    }
}
