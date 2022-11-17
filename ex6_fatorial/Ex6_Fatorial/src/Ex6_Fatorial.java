import java.util.*;

public class Ex6_Fatorial {
    public static void main(String[] args) {

        // criando e instanciando a classe Scanner
        Scanner scan  = new Scanner(System.in);

        // informando o valor do fatorial a ser calculado
        System.out.print("Informe o fatorial a ser calculado: ");
        int fatorial = scan.nextInt();

        // variavel multiplicadora
        int multiplicacao = 1;


        for (int i = fatorial; i >= 1; i--){
            multiplicacao = multiplicacao * i;        
        }

        System.out.println("O fatorial de "+ fatorial + "! é: "+ multiplicacao);
        
    }
}