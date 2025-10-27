package br.com.curso.oo.veiculos;

public class Carro extends Veiculo {
    private String modelo;
    private int ano;
    private int velocidade;

    public Carro(String marca, String modelo, int ano){
        super(marca);
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }
    public void acelerar(int delta){
      if(delta>0) velocidade += delta; 
      }
    public void frear(int delta){ 
    velocidade = Math.max(0, velocidade - Math.max(0, delta));
    }
    @Override public void mover(){ 
      System.out.println("Carro acelerando"); 
      }
    public int getVelocidade(){
      return velocidade; 
      }
}
