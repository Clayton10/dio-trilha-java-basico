public class SmartTv {
  // atributos
  boolean ligada = false;
  int     canal  = 130;
  int     volume = 25;

  /****** metodos para manipular os estados *****/
  
  // metodo ligar()
  public void ligar(){
    ligada = true;
  }

  // metodo desligar()
  public void desligar(){
    ligada = false;
  }

  // metodo aumentarVolume()
  public void aumentarVolume(){
    // volume = volume + 1;
    volume++;
    System.out.println("Aumentando o volume para: "+ volume); 
  }

  // metodo diminuirVolume()
  public void diminuirVolume(){
    // volume = volume - 1 
    volume--;
    System.out.println("Diminuindo o volume para: "+ volume);
  }

    /****** metodos para mudar de canal *****/

  // qual o canal
  public void mudarCanal(int novoCanal){
    canal = novoCanal;
  }
  
  // metodo aumentar/subir canal
  public void aumentarCanal(){
    canal++;
    System.out.println();
  }

    // metodo diminuir/descer canal
    public void dimunuirCanal(){
      canal--;
      System.out.println();
    }
  
}