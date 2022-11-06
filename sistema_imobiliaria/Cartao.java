public class Cartao extends Pagamento {
    private String nome, bandeira, numero;

    public Cartao(String tipoPagamento, String nome, String bandeira, String numero) {
        super(tipoPagamento);
        this.nome = nome;
        this.bandeira = bandeira;
        this.numero = numero;
    }
    public Cartao() {
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getBandeira() {
        return bandeira;
    }
    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString(){
        return "Tipo Pagamento: "+tipoPagamento+"\nNome: "+nome+" | Bandeira: "+bandeira+" | Numero: "+numero;
    }
    
}
