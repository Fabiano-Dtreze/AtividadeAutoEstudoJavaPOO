package ExerciciosPraticos.Aula1209.Encapsulamento;

public class Main {
  public static void main(String[] args) {

    Cofrinho cofrinho = new Cofrinho("Viagem");

    cofrinho.depositar(500.0);
    cofrinho.depositar(200.0);
    cofrinho.retirar(150.0);

    cofrinho.retirar(1000.0);
    cofrinho.depositar(-50.0);

    cofrinho.mostrarResumo();
   }
   
}
