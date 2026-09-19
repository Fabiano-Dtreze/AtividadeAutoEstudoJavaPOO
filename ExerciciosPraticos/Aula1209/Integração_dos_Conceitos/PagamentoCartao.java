package ExerciciosPraticos.Aula1209.Integração_dos_Conceitos;

public class PagamentoCartao extends Pagamento {
    private int parcelas;

    public PagamentoCartao(Double valor, int parcelas) {
        super(valor);
        this.parcelas = parcelas;
    }
    public int getParcelas() {
        return parcelas;
    }
    public Double calcularTaxa() {
        return getValor() * 0.03;
    }
    public void processar() {
        System.out.println("Pagamento via cartão");
        System.out.println("Parcelas: " + parcelas );
        System.out.println("Taxa: R$ " + calcularTaxa());
        System.out.println("Total: R$ " + calcularTotal());
    }
}