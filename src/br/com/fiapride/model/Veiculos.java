package br.com.fiapride.model;

public class Veiculos {

    private String dono;
    private String placa;
    private double gasolina;

    public Veiculos (String passageiro, String placa) {
        this.dono = passageiro;
        this.placa = placa;
    }

    public void adicionarGasolina (double gasolinaAdicional) {

        if (gasolinaAdicional < 0 ) {
            System.out.println("Erro: valores negativos não podem representar a adição de gasolina. Valor inserido: " + gasolinaAdicional + "\n");
        } else if (gasolinaAdicional == 0) {
            System.out.println("Aviso: o valor de gasolina adicional inserido é nulo. Valor inserido: " + gasolinaAdicional + "\n");
            this.gasolina += gasolinaAdicional;
        } else {
            this.gasolina += gasolinaAdicional;
            System.out.println("Gasolina adicionada ao veículo: " + gasolinaAdicional + "\n");
        }
    }

    public void gastoDeGasolina (double gasolinaGasta) {

        if (gasolinaGasta < 0 ) {
            System.out.println("Erro: valores negativos não podem representar o gasto de gasolina. Valor inserido: " + gasolinaGasta + "\n");
        } else if (gasolinaGasta == 0) {
            System.out.println("Aviso: o valor de gasto de gasolina inserido é nulo. Valor inserido: " + gasolinaGasta + "\n");
            this.gasolina -= gasolinaGasta;
        } else {
            if (gasolinaGasta <= this.gasolina) {
                this.gasolina -= gasolinaGasta;

                System.out.println("Gasolina gasta pelo veículo: " + gasolinaGasta + "\n");
            } else {
                System.out.println("Erro: a quantidade de gasolina atual é menor do que o gasto inserido." + "\n");
            }
        }
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    public double getGasolina() {
        return gasolina;
    }

    private void setDono(String dono) {
        this.dono = dono;
    }

    public String getDono() {
        return dono;
    }

    private void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
}
