package Projeto_Ludo.Control;

import Projeto_Ludo.View.Janela_Principal;
import javax.swing.JFrame;

public class Main{
    public static void main(String[] args){
            
            Janela_Principal tela = new Janela_Principal();

            tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            tela.setSize(1400,1000);
            tela.setVisible(true);
            tela.setLocationRelativeTo(null);
    }
}
