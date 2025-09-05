import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TelaInterativa extends JFrame {

    // Construtor da tela
    public TelaInterativa() {
        // Define o título da janela
        super("Tela Interativa Java");

        // COnfigura o tamanho da janela (largura=400px, altura=200px)
        setSize(300, 400);

        // Fecha o programa ao clicar no X da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Define um layout para organizar os elementos
        setLayout(new FlowLayout());

        // --- Criando os Componentes ---
        JLabel label = new JLabel("Digite seu nome:");
        // JLabel = texto fixo que aparece na tela

        JTextField campoTexto = new JTextField(15);
        // JTextField = campo onde o usuário digita (15 colunas de largura)

        JButton botao = new JButton("Enviar");
        // JButton = botão clicável

        JLabel resposta = new JLabel("");
        // Outro JLabel, mas vazio no inicio, para mostrar respostas

        // --- Evento do botão ---
        botao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Pega o que o usuário digitou
                String nome = campoTexto.getText();

                // Atualiza o JLabel resposta dinamicamente
                resposta.setText("Olá, " + nome + "! Seja bem-vindo/a!");
            }
        });

        // --- Adicionando componentes na janela ---
        add(label);
        add(campoTexto);
        add(botao);
        add(resposta);

        // Torna a janela visivel
        setVisible(true);
    }

}
