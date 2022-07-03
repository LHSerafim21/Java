public class Aluno {
    private String nome;
    private String ra;
    private float p1;
    private float p2;
    private float t1;
    private float t2;
    private float media;
    
    public void setRa(String ra){
        this.ra = ra;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNotas(float t1, float t2, float p1, float p2){
        this.t1 = t1;
        this.t2 = t2;
        this.p1 = p1;
        this.p2 = p2;
    }
   
    public String getNome(){
        return nome;
    }
    
    public String getRa(){
        return ra;
    }
    public float media(){
        media = (p1 + p2 + t1 + t2)/4.0f;
        return media;
    }
    
    public boolean condicao(){
        if (media>=5){
            return true;
        }
        else {
            return false;
        }
    }
    
    public void condicao1(){
        if(condicao()){
            System.out.println("Aprovado");
        }
        else{
            System.out.println("Reprovado");
        }
        
    }
}
