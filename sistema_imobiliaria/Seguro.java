public class Seguro {
    private int codigoSeguro;
    private String nomeSeguradora, tipo, descricao;
    private float valor;
    
    public Seguro() {
    }
    public Seguro(int codigoSeguro, String nomeSeguradora, String tipo, String descricao, float valor) {
        this.codigoSeguro = codigoSeguro;
        this.nomeSeguradora = nomeSeguradora;
        this.tipo = tipo;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getCodigoSeguro() {
        return codigoSeguro;
    }
    public void setCodigoSeguro(int codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }
    public String getNomeSeguradora() {
        return nomeSeguradora;
    }
    public void setNomeSeguradora(String nomeSeguradora) {
        this.nomeSeguradora = nomeSeguradora;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    public String toString(){
        return "Codigo Seguro: "+codigoSeguro+" | Seguradora: "+nomeSeguradora
                +"\nTipo: "+tipo+" | Descricao: "+descricao+"\nValor: R$ "+valor;
    }
}
