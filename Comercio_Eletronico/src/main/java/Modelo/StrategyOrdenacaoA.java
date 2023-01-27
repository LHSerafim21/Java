package Modelo;

import java.util.ArrayList;

/**
 * @author Henrique
 * @author Nazaro
 * @author Ikeda
 */

public class StrategyOrdenacaoA implements OrdenacaoStrategy {
    
    public StrategyOrdenacaoA(){

    }

    @Override
    public ArrayList<Produto> executarOrdenacao(ArrayList<Produto>array){
        
        ArrayList<Produto>arrayOrdenado = array;

        //InsertionSort
        for (int k = 1; k <= arrayOrdenado.size(); k++){
            Produto y = arrayOrdenado.get(k);
            int j = k-1;

            while(j >= 0 && arrayOrdenado.get(j).getValor()>y.getValor()){
                arrayOrdenado.set(j+1,arrayOrdenado.get(j));
                j--;
            }
            arrayOrdenado.set(j + 1,y);
        }

        return arrayOrdenado;       
    } 

}      
    



