package br.com.curso.oo.veiculos;

public class Moto extends Veiculo {
    public Moto(String marca){
      super(marca); 
      }
    @Override public void mover(){ 
    System.out.println("Moto acelerando"); 
    }
}
