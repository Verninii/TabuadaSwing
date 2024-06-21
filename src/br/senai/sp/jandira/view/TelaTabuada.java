package br.senai.sp.jandira.view;

import javax.swing.*;
import java.awt.*;

public class TelaTabuada {
    private JLabel labelTitulo = new JLabel("Tabuada");
    private JPanel painelTitulo = new JPanel();
    private JTextField campoMultiplicando = new JTextField();
    private JTextField campoMultiplicandoMin = new JTextField();
    private JTextField campoMultiplicandoMax = new JTextField();

    public TelaTabuada(){
        criarTela();
    }

    public void criarTela(){
        JFrame tela = new JFrame();
        tela.setSize(500,300);
        tela.setTitle("Tabuada");
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.setLayout(null);

        //Definir o painel de Título
        labelTitulo.setForeground(Color.GRAY);
        labelTitulo.setFont(new Font("Arial",Font.BOLD,25));
        labelTitulo.setBounds(190,10,200,30);

        painelTitulo.setBackground(Color.GREEN);
        painelTitulo.setBounds(0,0,500,50);
        painelTitulo.setLayout(null);
        painelTitulo.add(labelTitulo);

        campoMultiplicando.setBounds(10,70,170,40);
        campoMultiplicando.setFont(new Font("Arial",Font.BOLD,17));
        campoMultiplicando.setForeground(new Color(0,128,0));

        tela.getContentPane().add(labelTitulo);
        tela.getContentPane().add(painelTitulo);
        tela.getContentPane().add(campoMultiplicando);



        //Sempre no final
        tela.setVisible(true);
    }
}
