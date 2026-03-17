package br.com.fiapride.main;

import br.com.fiapride.model.Veiculos;

public class Principal {
    public static void main(String[] args) {

        System.out.println("Inicialização do Sistema - FiapRide\n");

        Veiculos v1 = new Veiculos("Carlos", "ABC-1234");

        v1.adicionarGasolina(-10);
        v1.adicionarGasolina(0);
        v1.adicionarGasolina(50);

        v1.gastoDeGasolina(100);
        v1.gastoDeGasolina(25);
        v1.gastoDeGasolina(-20);
        v1.gastoDeGasolina(0);

        System.out.println("Dono: " + v1.getDono() + " | Placa: " + v1.getPlaca() + " | Gasolina: " + v1.getGasolina());
    }
}
