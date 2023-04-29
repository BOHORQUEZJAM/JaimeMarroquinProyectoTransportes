package view;


import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class IOManager extends JFrame {

	private JPanel panelUno;
	private JPanel panelVenta;
	private JScrollPane scrollPane;

	public IOManager() {
		setSize(800, 600);
		setTitle("PANTALLA DE INICIO");
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		scrollPane = new JScrollPane();
		panelUno = new PanelPrincipal();
		panelUno.setBounds(200, 70, 400, 400);
		panelUno.setVisible(false);
		add(panelUno);
		panelVenta= new PanelVentas(scrollPane);
		panelVenta.setBounds(180,20,400,500);
		
		add(panelVenta);
		
	}
	
}