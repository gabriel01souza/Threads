package Module01;

import javax.swing.*;

public class TelaCalculador {

    JFrame janela = new JFrame("Multiplicação Demorada");
    JPanel painel = new JPanel();
    JTextField primeiro = new JTextField(10);
    JTextField segundo = new JTextField(10);
    JButton botao = new JButton(" = ");
    JLabel resultado = new JLabel("           ?          ");

    public void inicializarCampos() {
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));
        //quando clica no botão será executado a classe Multiplicador
        botao.addActionListener(new AcaoBotao(primeiro, segundo, resultado));

        painel.add(primeiro);
        painel.add(new JLabel("x"));
        painel.add(segundo);
        painel.add(botao);
        painel.add(resultado);

        janela.add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        janela.pack();
        janela.setVisible(true);
    }
}