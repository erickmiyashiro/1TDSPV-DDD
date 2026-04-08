package view;

import model.Carro;

public class Terminal {

    public static void main(String[] args) {
        //Criar um objeto carro
        Carro onix = new Carro();
        onix.setPlaca("ACB1234");
        onix.setPreferencial(false);
        onix.setNumeroVaga(123);
        onix.setSetor('A');
        onix.setValor(15);
        onix.setHoraSaida("11:00");
        onix.setHoraEntrada("10:00");

        //Exibir os dados do carro

        System.out.println("Placa: " + onix.getPlaca());
        System.out.println("Entrada: " + onix.getHoraEntrada());
        System.out.println("Saída: " + onix.getHoraSaida());
        System.out.println("Setor: " + onix.getSetor());
        System.out.println("Preferencial: " + onix.isPreferencial());
        System.out.println("Valor a Pagar:" + onix.getValor());


    }
}
