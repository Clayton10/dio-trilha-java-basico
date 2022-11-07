public class Conta{

    public static void main(String [] args){
    
        // variavel da classe conta
        double saldo = 10.0;

        // metodo sacar
        public void sacar(Double valor){
            // variavel local de metodo
            double novoSaldo = (saldo - valor);
        }

        // metodo imprimir saldo
        public void imprimirSaldo(){
            System.out.println(saldo);
            // somente o metodo sacae conhece esta variavel
            System.out.println(novoSaldo);
        }

        public double CalcularDividaExponencial(){
            //variavel local de metodo
            double valorParcela  = 50.0;
            double valorMontante = 0.0;         
        }

        for (int x = 1; x<= 5; x++){
            // esta variavel sera reiniciada a cada execucao
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }

        // escopo de fluxo
        // x e valorCalculado nunca estarao disponiveis fora do metodo

        return valorMontante;
    
    }    
}