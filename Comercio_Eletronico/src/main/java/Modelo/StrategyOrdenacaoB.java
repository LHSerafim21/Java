package Modelo;

import java.util.ArrayList;

/**
 * @author Henrique
 * @author Nazaro
 * @author Ikeda
 */

 public class StrategyOrdenacaoB implements OrdenacaoStrategy {
    
    public StrategyOrdenacaoB(){

    }

    @Override
    public ArrayList<Produto> executarOrdenacao(ArrayList<Produto>array){
        
        ArrayList<Produto>arrayOrdenado = array;

        //BubbleSort
        for (int i = 0; i< arrayOrdenado.size(); i++){
            for(int j = 0; j< arrayOrdenado.size() -i; j++){
                if(arrayOrdenado.get(j).getValor()>arrayOrdenado.get(j+1).getValor()){
                    Produto aux= arrayOrdenado.get(j);
                    arrayOrdenado.set(j, arrayOrdenado.get(j + 1));
                    arrayOrdenado.set(j + 1,aux);
                }
            }
        }
        return arrayOrdenado;       
    } 

}  