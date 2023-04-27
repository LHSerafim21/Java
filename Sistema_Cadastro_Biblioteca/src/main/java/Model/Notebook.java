package Model;

public class Notebook extends Item{

    private String modelo;
    private String marca;
    private String processador;

    Notebook(int CodigoItem, boolean estaEmprestado, String modelo, String marca, String processador){
        super(CodigoItem, estaEmprestado);
        this.modelo = modelo;
        this.marca = marca;
        this.processador = processador;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getProcessador(){
        return processador;
    }

    public void setProcessador(String processador){
        this.processador = processador;
    }
    
    public String ToString(){
        return "\n" +getCodigoItem()+
               " | Modelo: " +modelo+
               " | Marca: " +marca+
               " | Processador: " +processador+
               " | Esta Emprestado: " +isEstaEmprestado();
    }
}

