import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
            cliente.setId(1);
            cliente.setNome("Joao");
            cliente.setCpf("123.456.789-10");
            cliente.setScore(100);
            cliente.setLimite(1000d);

            System.out.println(cliente.exibirDados());

            Funcionario funcionario =new Funcionario();
            funcionario.setId(1);
            funcionario.setNome("Cleiton");
            funcionario.setCpf("222.222.222-22");
            funcionario.setNumeroPis("51561561");
            funcionario.setSalario(46516d);

            System.out.println(funcionario.exibirDados());

    }
}