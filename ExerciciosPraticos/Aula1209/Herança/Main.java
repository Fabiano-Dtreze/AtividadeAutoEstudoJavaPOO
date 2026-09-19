package ExerciciosPraticos.Aula1209.Herança;

public class Main {
    public static void main(String[] args) {
        VideoAula video = new VideoAula("Encapsulamento", 40, "Teams");

        PodCast podcast = new PodCast("Herança em Java", 25,"Mariana");
    
        video.exibirResumo();
        podcast.exibirResumo();

        video.reproduzirVideo();
        podcast.ouvirPodCast();    
    }
    
}
