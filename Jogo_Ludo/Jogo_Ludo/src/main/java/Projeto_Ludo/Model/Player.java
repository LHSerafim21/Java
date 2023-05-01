package Projeto_Ludo.Model;

class Player {
    
    private String nome;

    Player(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String ToString(){
        return "Nome do Player: " + nome;
    }
}
