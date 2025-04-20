public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        //Ligar e desligar
        smartTv.ligar();
        System.out.println("TV ligou? " + smartTv.ligada);
        
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        smartTv.mudarCanal(13);
        System.out.println("Mudou o canal para: " + smartTv.canal);

        smartTv.desligar();
        System.out.println("TV esta ligada? " + smartTv.ligada);
    }
}