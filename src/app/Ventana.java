package app;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Ventana extends JFrame implements ActionListener{

    PanelRebote lamina;

    JPanel panelBotones;
    JButton start;
    public Ventana() throws InterruptedException{
        //INICIALIZAR CONFIG JFRAME
        setTitle("POO Protector Pantalla");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(5,5));

        panelBotones = new JPanel();
        start = new JButton("Start");
        start.addActionListener(this);
        panelBotones.add(start);

        lamina = new PanelRebote();

        this.add(panelBotones, BorderLayout.SOUTH);
        this.add(lamina, BorderLayout.CENTER);

    
        //CONFIGURACION DEL FRAME
        //pack();
        setSize(650,500);
        setResizable(false);
        setVisible(true);

        while (true) {
			lamina.mover();
			lamina.repaint();
			Thread.sleep(4);
		}
    }

    //USO DE BOTONES
    public void actionPerformed (ActionEvent e) {
        JButton actionSource = (JButton) e.getSource();

        if(actionSource.equals(start)){
           
        }
    }
}
