public class Funcionario extends Pessoa{

    private String numeroPis;

    private Double salario;

    public String getNumeroPis() {
        return numeroPis;
    }

    public void setNumeroPis(String numeroPis) {
        this.numeroPis = numeroPis;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String exibirNome() {
        return "Nome Funcionario " + this.getNome();
    }
}
