package Modelo;

import java.util.ArrayList;

/**
 * @author Henrique
 * @author Nazaro
 */

    public class Contexto{
        private OrdenacaoStrategy strategy;

        public Contexto (){

        }

        public void setStrategy(String k){//Verdadeiro=Insertion Falso=Bubble
            if(k.equalsIgnoreCase("insertionsort")){
                strategy = new StrategyOrdenacaoA();
            }else if(k.equalsIgnoreCase("bubblesort")){
                strategy = new StrategyOrdenacaoB();
            }
        }

        public ArrayList<Produto>executarOrdenacao(ArrayList<Produto>produtos){
            return strategy.executarOrdenacao(produtos);
        }
    }
