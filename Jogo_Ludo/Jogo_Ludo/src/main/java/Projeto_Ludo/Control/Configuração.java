package Projeto_Ludo.Control;

import java.util.Random;

public class Configuração {
    
    Random random = new Random();
    
    public String VezJogador(){
        int x=1;
        
        if(x%2 == 1){
            return "Vez do Player 1";
        }
        else {
            return "Vez do Player 2";
        }
    }
    
    public int NumeroDado(){
        int dado = random.nextInt(6);
        
        return dado;
    }
}
