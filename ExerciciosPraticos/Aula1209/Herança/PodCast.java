package ExerciciosPraticos.Aula1209.Herança;

public class PodCast extends Conteudo {
    public String apresentador;

    public PodCast(String titulo, int duracaoMinutos, String apresentador) {
        super(titulo, duracaoMinutos);
        this.apresentador = apresentador;
    }
    public void ouvirPodCast() {
        System.out.println("Podcast apresentado por " + apresentador + ".");
    }
}
