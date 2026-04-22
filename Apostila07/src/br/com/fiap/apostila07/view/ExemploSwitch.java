package br.com.fiap.apostila07.view;

import javax.swing.*;

public class ExemploSwitch {

    public static void main(String[] args) {
        //Ler dois números
        String n1str = JOptionPane.showInputDialog("Digite o primeiro número: ");
        int n1 = Integer.parseInt(n1str);

        String n2str = JOptionPane.showInputDialog("Digite o segundo número: ");
        int n2 = Integer.parseInt(n2str);

        //Ler a operção (somar, dividir, subtrair e multiplicar)

        String op = JOptionPane.showInputDialog("Operação? 9+,-,/,*)");


        //Realixar a operção e exibir o resultado
switch (op) {
    case "+" :
        JOptionPane.showMessageDialog(null, n1 + n2);
        break;
    case "-" :
        JOptionPane.showMessageDialog(null, n1 - n2);
        break;
    case "/" :
        if ( n2 == 0){
            JOptionPane.showMessageDialog(null,"Não é possível dividir por zero");
        }
        JOptionPane.showMessageDialog(null, n1 / n2);
        break;
    case "*" :
        JOptionPane.showMessageDialog(null, n1 * n2);
        break;
    default:
        JOptionPane.showMessageDialog(null, "Opção inválida");
        
        }
    }//main
}//class
