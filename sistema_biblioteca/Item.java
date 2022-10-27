package sistema_biblioteca;

public class Item{

    private int CodigoItem;
    private boolean estaEmprestado;

    Item(int CodigoItem, boolean estaEmprestado){
        this.CodigoItem = CodigoItem;
        this.estaEmprestado = estaEmprestado;
    }

    public int getCodigoItem(){
        return CodigoItem;
    }

    public void setCodigoItem(int CodigoItem){
        this.CodigoItem = CodigoItem;
    }

    public boolean isEstaEmprestado(){
        return estaEmprestado;
    }

    public void setEstaEmprestado(boolean estaEmprestado){
        this.estaEmprestado = estaEmprestado;
    }
}