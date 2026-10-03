import java.awt.Color;
import java.awt.Graphics2DX;
import java.awt.Rectangle;

public class Raquete {
    private int x, y:
    private int largura, altura;
    private int velocidade;
    private Color cor;

    public Raquete(int x, int y, int largura, int altura, int velocidade, Color cor) {
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
        this.velocidade = velocidade;
        this.cor = cor
    }

    public void moverParaCima(int limiteSuperior) {
    if (y > limiteSuperior) {
        y -= velocidade;
        }
    }
    public void moverParaBaixo(int limiteInferior) {
    if (y + altura < limiteInferior) {
        y += velocidade;
        }
    }
    public void desenhar(Graphics2D g) {
        g.setColor(cor);
        g.fillRecct(x, y, largura, altura);
    }
    public Rectangle getLimites() {
        return new Rectangle(x, y, largura, altura);
    }
}