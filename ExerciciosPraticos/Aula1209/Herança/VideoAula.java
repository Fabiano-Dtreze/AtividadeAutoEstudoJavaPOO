package ExerciciosPraticos.Aula1209.Herança;

public class VideoAula extends Conteudo {
    public String plataforma;

    public VideoAula(String titulo, int duracaoMinutos, String plataforma) {
        super(titulo, duracaoMinutos);
        this.plataforma = plataforma;
    }
    public void reproduzirVideo() {
        System.out.println("Reproduzindo na plataforma " + plataforma + ".");
    }
    
}
