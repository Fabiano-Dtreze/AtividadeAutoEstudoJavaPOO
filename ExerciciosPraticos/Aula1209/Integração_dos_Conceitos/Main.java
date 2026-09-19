package ExerciciosPraticos.Aula1209.Integração_dos_Conceitos;

public class Main {
     public static void main (String[] args) {
        Pagamento pagamentoPix = new PagamentoPix(100.0);
        Pagamento pagamentoCartao = new PagamentoCartao(100.0, 3);

        pagamentoPix.processar();
        System.out.println();
        pagamentoCartao.processar();
        }
}
   
    

          

