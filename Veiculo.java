package br.com.curso.oo.veiculos;

public class Veiculo {
    protected String marca;
    public Veiculo(String marca){
    this.marca = marca; 
    }
    public void mover(){
    System.out.println("Veículo movendo"); 
    }
}
