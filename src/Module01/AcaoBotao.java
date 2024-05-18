package Module01;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AcaoBotao implements ActionListener {

    private final JTextField primeiro;
    private final JTextField segundo;
    private final JLabel resultado;
    private final TelaCalculador telaCalculador = new TelaCalculador();

    public AcaoBotao(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.resultado.setText("Calculating");

        TarefaMulticacao tarefa = new TarefaMulticacao(primeiro, segundo, resultado);
        Thread thread = new Thread(tarefa, "Thread calculadora");
        thread.start();
    }

}