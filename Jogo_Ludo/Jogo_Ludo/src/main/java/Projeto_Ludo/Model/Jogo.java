package Projeto_Ludo.Model;

import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 *
 * @author Henrique
 */

public class Jogo {
    
    private int Peao[] = new int[8];
    
    public Jogo(int[] Peao){
        this.Peao = Peao;
    }
    
    public int[] getPeao(){
        return Peao;
    }
    
    public void setPeao(int[] Peao){
        this.Peao = Peao;
    }
    
    
    
    
    
}
