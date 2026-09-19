package ExerciciosPraticos.Aula1209.Integração_dos_Conceitos;

public class Pagamento {
    private Double valor;

    public Pagamento(Double valor) {
        if (valor >= 0.0) {
            this.valor = valor;
        }
    }
    public Double getValor() {
        return valor;
    }
    public Double calcularTaxa() {
        return 0.0;
    }
    public Double calcularTotal() {
        return valor + calcularTaxa();
    }
    public void processar() {
        System.out.println("Total: R$ " + calcularTotal());
    }
}
