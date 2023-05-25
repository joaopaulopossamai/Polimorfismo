import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroCliente extends JFrame {
    private JTextField textId;
    private JTextField textNome;
    private JFormattedTextField textCPF;
    private JTextField textLimite;
    private JTextField textScore;
    private JComboBox cbSituacao;
    private JButton btnCADASTRAR;
    private JButton btnLIMPAR;
    private JLabel id;
    private JLabel nome;
    private JLabel cpf;
    private JLabel Limite;
    private JLabel textSituacao;
    private JLabel score;
    public JPanel formCliente;

    public void limparCampos() {
        textId.setText(" ");
        textNome.setText(" ");
        textScore.setText(" ");
        textLimite.setText(" ");
        textCPF.setText(" ");
        cbSituacao.setSelectedIndex(0);


        JOptionPane.showMessageDialog(btnLIMPAR,"Limpou");
    }
public CadastroCliente() {
    btnCADASTRAR.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Cliente cliente = new Cliente();
            cliente.setId(Integer.valueOf(textId.getText()));
            cliente.setNome(textNome.getText());
            cliente.setCpf(textCPF.getText());
            cliente.setLimite(Double.valueOf(textLimite.getText()));
            cliente.setScore(Integer.valueOf(textScore.getText()));
            cliente.setSituacao(cbSituacao.getSelectedItem().toString());

            JOptionPane.showMessageDialog(btnCADASTRAR,cliente.exibirDados());
            limparCampos();
        }
    });
    btnLIMPAR.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            limparCampos();
        }
    });
}


}
