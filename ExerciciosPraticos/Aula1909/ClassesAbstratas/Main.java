package ExerciciosPraticos.Aula1909.ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente1 = new Gerente("Marcos", 8000.00);
        Funcionario desenvolvedor1 = new Desenvolvedor("Ana", 5000.00);

        gerente1.MostrarDados();
        System.out.println("Bônus do Gerente: " + gerente1.calcularBonus());
        
        desenvolvedor1.MostrarDados();
        System.out.println("Bônus do Desenvolvedor: " + desenvolvedor1.calcularBonus());

        
    }
    
}
