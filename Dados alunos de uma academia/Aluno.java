public class Aluno{
    private String nome;
    private int    idade;
    private float  peso;
    private float  altura;
    private float  imc;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setValores(float peso,float altura){
        this.peso = peso;
        this.altura = altura;
    }
    
    public String getNome(){
        return nome;
    }
    
    public boolean condicao(){
       if(idade>=18){
           return true;
       } 
       
       else{
           return false;
       }
    }
    
    public void condicao1(){
        if(condicao()){
            System.out.println("O aluno é maior de idade");
        }
        else{
            System.out.println("O aluno é menor de idade");
        }
    }
    
    public float imc(){
        imc=peso/(altura*altura);
        return imc;
    }
}
