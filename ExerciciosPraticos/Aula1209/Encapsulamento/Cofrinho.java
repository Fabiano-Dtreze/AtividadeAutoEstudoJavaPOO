package ExerciciosPraticos.Aula1209.Encapsulamento;

public class Cofrinho {
    private String objetivo;
    private Double saldo;

public Cofrinho (String objetivo) {
    this.objetivo = objetivo;
    this.saldo = 0.0;
 }
public String getObjetivo() {
    return objetivo; 
 }
public Double getSaldo() {
    return saldo;
 }
public void depositar (Double valor) {
    if (valor > 0) {
        saldo += valor;
    } else {
        System.out.println ("Depósito inválido.");
    }
 }
 
public void retirar (Double valor) {
    if (valor > 0 && valor <= saldo) {
        saldo -= valor; 
    } else {
        System.out.println("Retirada inválida.");
    }
    }
public void mostrarResumo() {
    System.out.println("Objetivo: " + objetivo);
    System.out.println("Saldo: R$ " + saldo);
 } 
} 