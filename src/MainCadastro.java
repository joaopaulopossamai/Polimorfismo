public class MainCadastro {

    public static void main(String[] args) {

        CadastroCliente form = new CadastroCliente();
        form.setContentPane(form.formCliente);
        form.setVisible(true);
        form.setSize(500,500);
        form.setTitle("Cadastro Cliente");


    }
}
