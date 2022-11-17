import java.util.*;

public class Ex5_Tabuada{
  public static void main(String[] args) {
    Scanner scan  = new Scanner(System.in);

    System.out.print("Informe a tabuada: ");
    int tabuada   = scan.nextInt();

    System.out.println("\nTabuada do "+ tabuada +"\n");
    for (int i = 1; i <= 10; i++){
      System.out.println(tabuada + " x " + i + " = "+ (tabuada*i));
    }

  }
}