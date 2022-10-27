package sistema_biblioteca;

public class Livro extends Item{

    private String nome;
    private String editora;

    Livro(int CodigoItem, boolean estaEmprestado, String nome, String editora){
        super(CodigoItem, estaEmprestado);
        this.nome = nome;
        this.editora = editora;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEditora(){
        return editora;
    }

    public void setEditora(String editora){
        this.editora = editora;
    }
}