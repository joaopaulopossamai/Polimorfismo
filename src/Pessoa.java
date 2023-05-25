public abstract class Pessoa {

    private Integer id;

    private String nome;

    private String cpf;

    private String situacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String exibirDados(){
        String dados = "Dados cadastro \n";
        dados+="----------------";
        dados+= id +" "+ nome +" "+ cpf;

        return dados;
    }

    public abstract String exibirNome();
}
