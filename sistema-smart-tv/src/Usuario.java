public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? "+smartTv.ligada);
        System.out.println("Canal atual? "+smartTv.canal);
        System.out.println("Volume atual? "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv ligada? "+smartTv.ligada);
        smartTv.desligar();
        System.out.println("Tv ligada? "+smartTv.ligada); 

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual?"+smartTv.volume);

        smartTv.trocarCanalParaCima();
        System.out.println("Canal atual? "+smartTv.canal);

        smartTv.trocarCanalParaBaixo();
        System.out.println("Canal atual? "+smartTv.canal);

        smartTv.mudarCanal(30);
        System.out.println("Canal atual? "+smartTv.canal);
    }
}
