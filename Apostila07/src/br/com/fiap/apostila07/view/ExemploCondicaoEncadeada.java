package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploCondicaoEncadeada {

    public static void main(String[] args) {
        //ler a média final do aluno

        //Dizer se o aluno está aprovado >=6
        //Exame >=4 e <=5.9
        //Retido < 4

        String mediaStr = JOptionPane.showInputDialog("Digite sua média final: ");
        double media = Double.parseDouble(mediaStr);

        if (media >= 6) {
            JOptionPane.showMessageDialog(null,"Aprovado");
        }else if (media >=4){
            JOptionPane.showMessageDialog(null,"Exame!");
        }else{
            JOptionPane.showMessageDialog(null, "Retido");
        }

    }//main
}//class
