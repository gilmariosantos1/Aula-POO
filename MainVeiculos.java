package br.com.curso.oo.veiculos;

import java.util.*;

public class MainVeiculos {
    public static void main(String[] args){
        Veiculo v1 = new Carro("Chevrolet","Onix",2020);
        Veiculo v2 = new Moto("Honda");
        List<Veiculo> frota = Arrays.asList(v1, v2);
        for(Veiculo v : frota) v.mover();
    }
}
