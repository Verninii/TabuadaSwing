package br.senai.sp.jandira.view;


import br.senai.sp.jandira.model.CalculoTabuada;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;


public class TelaTabuada {
    private JPanel painelBackground = new JPanel();
    private JLabel labelTitulo = new JLabel("Tabuada");
    private JPanel painelTitulo = new JPanel();
    private JLabel lblMultiplicando = new JLabel("Multiplicando:");
    private JTextField campoMultiplicando = new JTextField();
    private JLabel lblMultiplicadorMin = new JLabel("Multiplicador mínimo:");
    private JTextField campoMultiplicadorMin = new JTextField();
    private JLabel lblMultiplicadorMax = new JLabel("Multiplicador máximo:");
    private JTextField campoMultiplicadorMax = new JTextField();
    private JButton btnLimpar = new JButton("Limpar");
    private JButton btnCalcular = new JButton("Calcular");
    private JLabel lblResultado = new JLabel("Resultado: ");
    private JTextArea areaResultado = new JTextArea();
    private CalculoTabuada calculoTabuada = new CalculoTabuada();

    int multiplicando = 0;
    int multiplicadorMin = 0;
    int multiplicadorMax = 0;

    List resultadosList;


    public TelaTabuada() {
        criarTela();
    }

    public void criarTela() {
        JFrame tela = new JFrame();
        tela.setSize(500, 380);
        tela.setTitle("Tabuada");
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.setLayout(null);

        painelBackground.setBounds(0, 50, 500, 310);
        painelBackground.setBackground(new Color(149, 213, 178));

        //Definir o painel de Título
        labelTitulo.setForeground(Color.GRAY);
        labelTitulo.setFont(new Font("Arial", Font.BOLD, 25));
        labelTitulo.setBounds(190, 10, 200, 30);

        painelTitulo.setBackground(Color.GREEN);
        painelTitulo.setBounds(0, 0, 500, 50);
        painelTitulo.setLayout(null);
        painelTitulo.add(labelTitulo);

        lblMultiplicando.setBounds(10, 40, 170, 60);
        lblMultiplicando.setFont(new Font("Arial", Font.BOLD, 18));
        lblMultiplicando.setForeground(Color.GRAY);

        campoMultiplicando.setBounds(10, 80, 200, 40);
        campoMultiplicando.setFont(new Font("Arial", Font.BOLD, 17));
        campoMultiplicando.setForeground(new Color(0, 128, 0));

        lblMultiplicadorMin.setBounds(10, 100, 200, 60);
        lblMultiplicadorMin.setFont(new Font("Arial", Font.BOLD, 18));
        lblMultiplicadorMin.setForeground(Color.GRAY);

        campoMultiplicadorMin.setBounds(10, 140, 200, 40);
        campoMultiplicadorMin.setFont(new Font("Arial", Font.BOLD, 17));
        campoMultiplicadorMin.setForeground(new Color(0, 128, 0));

        lblMultiplicadorMax.setBounds(10, 160, 200, 60);
        lblMultiplicadorMax.setFont(new Font("Arial", Font.BOLD, 18));
        lblMultiplicadorMax.setForeground(Color.GRAY);

        campoMultiplicadorMax.setBounds(10, 200, 200, 40);
        campoMultiplicadorMax.setFont(new Font("Arial", Font.BOLD, 17));
        campoMultiplicadorMax.setForeground(new Color(0, 128, 0));

        btnLimpar.setBounds(10, 270, 100, 50);
        btnLimpar.setBackground(new Color(8, 28, 21));
        btnLimpar.setForeground(new Color(216, 243, 220));
        btnLimpar.setFont(new Font("Arial", Font.BOLD, 12));

        btnCalcular.setBounds(110, 270, 100, 50);
        btnCalcular.setBackground(new Color(8, 28, 21));
        btnCalcular.setForeground(new Color(216, 243, 220));
        btnCalcular.setFont(new Font("Arial", Font.BOLD, 12));

        lblResultado.setForeground(new Color(8, 28, 21));
        lblResultado.setFont(new Font("Arial", Font.BOLD, 20));
        lblResultado.setBounds(300, 55, 140, 30);

        areaResultado.setBounds(270, 80, 160, 240);
        areaResultado.setFont(new Font("Arial", Font.BOLD, 18));
        areaResultado.setForeground(new Color(124, 255, 0));
        areaResultado.setEditable(false);
        areaResultado.setLineWrap(true);

        btnLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                apertarLimpar();

            }
        });


        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                apertarCalcular();
            }
        });

        tela.getContentPane().add(labelTitulo);
        tela.getContentPane().add(painelTitulo);
        tela.getContentPane().add(campoMultiplicando);
        tela.getContentPane().add(lblMultiplicando);
        tela.getContentPane().add(lblMultiplicadorMin);
        tela.getContentPane().add(campoMultiplicadorMin);
        tela.getContentPane().add(lblMultiplicadorMax);
        tela.getContentPane().add(campoMultiplicadorMax);
        tela.getContentPane().add(btnLimpar);
        tela.getContentPane().add(btnCalcular);
        tela.getContentPane().add(lblResultado);
        tela.getContentPane().add(areaResultado);

        tela.getContentPane().add(painelBackground);

        //Sempre no final
        tela.setVisible(true);
    }

    private void apertarLimpar() {
        campoMultiplicando.setText("");
        campoMultiplicadorMin.setText("");
        campoMultiplicadorMax.setText("");
        areaResultado.setText("");
        JOptionPane.showMessageDialog(null, "Apagado!");
    }

    private void apertarCalcular() {

        int multiplicando = Integer.parseInt(campoMultiplicando.getText());
        int multiplicadorMin = Integer.parseInt(campoMultiplicadorMin.getText());
        int multiplicadorMax = Integer.parseInt(campoMultiplicadorMax.getText());

        if (validarDados()){
            calculoTabuada.setMultiplicadorMin(multiplicadorMin);
            calculoTabuada.setMultiplicadorMax(multiplicadorMax);

        }

        List<Integer> resultados = calculoTabuada.calcular(multiplicando, multiplicadorMin, multiplicadorMax);
        StringBuilder resultadosStr = new StringBuilder();  // é utilizado quando essa string será modificada muitas vezes (por exemplo, em loops).

        for (int i = 0; i < resultados.size(); i++) {
            int multiplicadorAtual = multiplicadorMin + i;
            resultadosStr.append(multiplicando).append(" x ").append(multiplicadorAtual).append(" = ").append(resultados.get(i)).append("\n");
        }

        areaResultado.setText(resultadosStr.toString());//  O metodo toString do Stringbuilder é usado para transformar em uma string
        JOptionPane.showMessageDialog(null, "Resultado gerado!");
    }

    private boolean validarDados(){
        try{
            multiplicadorMin = Integer.parseInt(campoMultiplicadorMin.getText().replace(",",".").trim());
        }catch(NumberFormatException erro){
            System.out.println(erro);
            JOptionPane.showMessageDialog(null,"O Multiplicador Mínimo deve ser um valor numérico!","Valor inválido",JOptionPane.ERROR_MESSAGE);
            System.out.println(erro);
            return false;
        }
        try{
            multiplicadorMax = Integer.parseInt(campoMultiplicadorMax.getText().replace(",",".").trim());
        }catch (NumberFormatException erro){
            System.out.println(erro);
            JOptionPane.showMessageDialog(null,"O Multiplicador Máximo deve ser um valor numérico!","Valor inválido",JOptionPane.ERROR_MESSAGE);
        }
        return true;
    }

}
