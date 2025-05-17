import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class TelaLogin {

    public TelaLogin() {
        // Criar a janela de login
        JFrame frame = new JFrame("Login");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Nome Label e Campo
        JLabel labelNome = new JLabel("Nome:");
        labelNome.setBounds(50, 30, 80, 25);
        frame.add(labelNome);

        JTextField textNome = new JTextField();
        textNome.setBounds(130, 30, 150, 25);
        frame.add(textNome);

        // Senha Label e Campo
        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setBounds(50, 70, 80, 25);
        frame.add(labelSenha);

        JPasswordField textSenha = new JPasswordField();
        textSenha.setBounds(130, 70, 150, 25);
        frame.add(textSenha);

        // Botão de Login
        JButton buttonLogin = new JButton("Entrar");
        buttonLogin.setBounds(130, 110, 150, 25);
        frame.add(buttonLogin);

        // Ação do botão de login
        buttonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = textNome.getText();
                String senha = new String(textSenha.getPassword());

                // Validação simples (substitua por verificação com banco de dados ou arquivo)
                if (
                    (nome.equalsIgnoreCase("Kleiton") && senha.equals("12345")) ||
                    (nome.equalsIgnoreCase("Fernanda") && senha.equals("1234567")) ||
                    (nome.equalsIgnoreCase("Beatriz") && senha.equals("12345678")) ||
                    (nome.equalsIgnoreCase("Caio") && senha.equals("593350"))
                ) {
                    JOptionPane.showMessageDialog(frame, "Login bem-sucedido!");
                    new TelaQuestionario(nome); // Passa o nome para a próxima tela
                    frame.dispose(); // Fecha a tela de login
                } else {
                    JOptionPane.showMessageDialog(frame, "Nome ou senha inválidos.");
                }
            }
        });

        // Tornar visível (deixe aqui, fora do listener)
        frame.setVisible(true);
    }
}