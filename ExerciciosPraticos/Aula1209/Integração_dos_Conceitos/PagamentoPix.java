package ExerciciosPraticos.Aula1209.Integração_dos_Conceitos;

public class PagamentoPix extends Pagamento {
    public PagamentoPix(Double valor) {
        super(valor);
    }
    public Double calcularTaxa() {
        return 0.0;
    }
    public void processar() {
        System.out.println("Pagamento via Pix");
        System.out.println("Taxa: R$ " + calcularTaxa());
        System.out.println("Total: R$ " + calcularTotal());
    }
    
}
