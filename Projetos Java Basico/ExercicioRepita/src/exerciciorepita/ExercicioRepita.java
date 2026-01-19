/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author João Pires
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int valor;
        int total = 0;
        int pares = 0;
        int impares = 0;
        int acimaDe100 = 0;
        int soma = 0;

        // Loop principal
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(
                    "<html>Digite um número <br><em>44(0 para iterromper)<em></html>:"));

            if (valor != 0) {
                total++;        // conta o total
                soma += valor;  // soma para calcular média

                if (valor % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }

                if (valor > 100) {
                    acimaDe100++;
                }
            }
        } while (valor != 0);

        // Cálculo da média (se o total for > 0)
        double media = (total > 0) ? (double) soma / total : 0;

        // Exibir resultado final
        JOptionPane.showMessageDialog(null,
                "RESULTADO FINAL:\n" +
                "Total de valores: " + total + "\n" +
                "Pares: " + pares + "\n" +
                "Ímpares: " + impares + "\n" +
                "Acima de 100: " + acimaDe100 + "\n" +
                "Média dos valores: " + String.format("%.2f", media)
        );
    }
}


    
    

   
