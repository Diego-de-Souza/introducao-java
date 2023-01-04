public class Operadores {
    
    public static void main(String[] args){

        String concatenacao ="?"; 

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        /**usando operadores */
        int numero = 5;

        System.out.println(numero);
        System.out.println(- numero);

        numero = - numero;
        System.out.println(numero);
        System.out.println(-numero);

        /*Incremento */
        int numero2 = 5;
        numero2++;
        System.out.println(numero2);

        // ordem de prescedencia
        System.out.println(++numero2);
        System.out.println(numero2);

        System.out.println(numero2--);
        System.out.println(numero2);

        //invertendo o valor do tipo booleano
        boolean gauchoMacho = true;

        gauchoMacho = !gauchoMacho;
        System.out.println(gauchoMacho);

        //operador ternario
        int a, b;

        a=5;
        b=5;
        String resultado = a==b ?"verdadeiro":"falso";
        System.out.println(resultado);

        /** no caso de comparações, para objetos se deve usar metodos especiais
         * no caso de string se usa o metodo equals, conforme abaixo
         */
        String meuNome = "Diego";
        String myName = new String("Diego");

        System.out.println(meuNome==myName);
        System.out.println(meuNome.equals(myName));

        //usando operador logico
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras!");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }
        
    }
}
