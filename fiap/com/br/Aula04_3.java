package fiap.com.br;

import javax.swing.JOptionPane;

public class Aula04_3 {

    public static void main(String[] args) {
        double altura = Double.valueOf(JOptionPane.showInputDialog("Digite sua altura"));
        double peso = Double.valueOf(JOptionPane.showInputDialog("Digite seu peso"));
        double IMC = peso / (altura * altura);
        
        
        
        if(IMC < 18.5) System.out.println("Você está abaixo do peso!");
        
        if(IMC > 18.4 && IMC < 25) System.out.println("Seu peso está perfeito.");
        
        if(IMC > 24.9 && IMC < 30) System.out.println("Você está acima do peso!");
        
        if(IMC > 30) System.out.println("Procure um médico, você está fudido");
        System.out.println(IMC);
        }
    }
