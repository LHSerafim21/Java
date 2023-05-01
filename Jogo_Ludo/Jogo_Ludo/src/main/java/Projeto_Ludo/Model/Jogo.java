package Projeto_Ludo.Model;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Random;

public class Jogo {
    
    static Random random = new Random();
    public static int dado;
    private static int Peao[] = new int[8];
    
    public int getDado(){
        return dado;
    }
    
    public void setDado(int dado){
        Jogo.dado = dado;
    }
    
    public String VezJogador(){
        int x=1;
        
        if(x%2 == 1){
            return "Vez do Player 1";
        }
        else {
            return "Vez do Player 2";
        }
    }
    
    public static int NumeroDado(){
        dado = random.nextInt(6);
        if(dado == 0){
            dado = 6;
        }
        return dado;
    }   
    
}
