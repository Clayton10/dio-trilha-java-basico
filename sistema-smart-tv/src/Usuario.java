public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        // 
        System.out.println("Canal Atual : " + smartTv.canal);
        // canal
        smartTv.mudarCanal(15);
        // imprimir qual o canal esta sintonizado
        System.out.println("Novo Canal Atual : " + smartTv.canal);

        // volume
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume Atual: " +smartTv.volume);

        // 
        // imprimir o estado atual da SmartTV (ligada/desligada)
        System.out.println("\nTV ligada ? " + smartTv.ligada);

        // imprimir a altura do volume da SmartTV
        System.out.println("Volume Atual :" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.ligada);
    }
}