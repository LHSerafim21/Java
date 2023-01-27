package Modelo;

import java.util.ArrayList;

/**
 * @author Henrique
 * @author Nazaro
 */

public interface OrdenacaoStrategy {

    public ArrayList<Produto> executarOrdenacao(ArrayList<Produto>array);  
}
