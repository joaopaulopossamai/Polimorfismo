public class Cliente extends Pessoa{

    private  Double limite;

    private Integer score;

    public Double getLimite() {
        return limite;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String exibirDados(){

        StringBuilder mensagem = new StringBuilder();
        mensagem.append("Cadastro con Sucesso! \n");
        mensagem.append("ID --").append(this.getId());
        mensagem.append("Nome --").append(this.exibirNome());

        return mensagem.toString();

    }

    @Override
    public String exibirNome(){
        return "Nome cliente " + this.getNome();
    }
}
