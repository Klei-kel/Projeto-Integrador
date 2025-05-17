import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaQuestionario {

    public TelaQuestionario(String nome) {
        // Criar a janela do questionário
        JFrame frame = new JFrame("Questionário de Feedback");
        frame.setSize(600, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Painel de rolagem para acomodar muitas perguntas
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Obter as perguntas
        List<String> perguntas = FeedbackQuestionario.obterPerguntas();
        JTextField[] respostas = new JTextField[perguntas.size()];

        // Adicionar perguntas e campos de resposta
        for (int i = 0; i < perguntas.size(); i++) {
            panel.add(new JLabel(perguntas.get(i)));
            respostas[i] = new JTextField();
            respostas[i].setMaximumSize(new Dimension(Integer.MAX_VALUE, 25));
            panel.add(respostas[i]);
            panel.add(Box.createRigidArea(new Dimension(0, 10))); // Espaço entre os campos
        }

        // Botão Finalizar
        JButton buttonFinalizar = new JButton("Finalizar");
        panel.add(buttonFinalizar);

        // Ação do botão
        buttonFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder resumo = new StringBuilder();
                resumo.append("Nome: ").append(nome).append("\n\n");
                for (int i = 0; i < perguntas.size(); i++) {
                    resumo.append(perguntas.get(i)).append("\nResposta: ").append(respostas[i].getText()).append("\n\n");
                }
                JOptionPane.showMessageDialog(frame, "Obrigado pelo feedback!\n\n" + resumo.toString());
                frame.dispose();
            }
        });

        // Adicionar painel à janela com barra de rolagem
        JScrollPane scrollPane = new JScrollPane(panel);
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
