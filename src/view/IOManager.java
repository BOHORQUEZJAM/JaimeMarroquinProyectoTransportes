package view;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class IOManager extends JFrame implements ActionListener {

	private JPanel panelUno;
	private JPanel panelVenta;
	private JScrollPane scrollPane;
	private JButton btonUno;
	private JButton btonDos;
	private JButton btonTres;
	private JButton btonCuatro;
	private JButton btonCinco;
	private JButton btonSeis;
	private ImageIcon iconoUno;
	private ImageIcon iconoDos;
	private ImageIcon iconoTres;
	private ImageIcon iconoCuatro;
	private ImageIcon iconoCinco;
	private ImageIcon iconoSeis;

	public IOManager() {
		setSize(800, 600);
		setTitle("PANTALLA DE INICIO");
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		scrollPane = new JScrollPane();
		panelUno = new JPanel();
		panelUno.setBounds(200, 70, 400, 400);
		panelUno.setLayout(null);
		panelUno.setBorder(new LineBorder(Color.decode("#0C5172"),40));
		add(panelUno);
		iconoUno = new ImageIcon("src/imagenes/terminal-de-punto-de-venta.png");
		iconoDos = new ImageIcon("src/imagenes/ruta.png");
		iconoTres= new ImageIcon("src/imagenes/comedor.png");
		iconoCuatro = new ImageIcon("src/imagenes/cama-del-hotel.png");
		iconoCinco=  new ImageIcon("src/imagenes/informacion.png");
		btonUno = new JButton(iconoUno);
		btonUno.setBorder(null);
		btonUno.setActionCommand("hola");
		btonUno.addActionListener(this);
		btonUno.setBounds(60, 60, 66, 66);
		panelUno.add(btonUno);
		btonDos = new JButton(iconoDos);
		btonDos.setBorder(null);
		btonDos.setBounds(160,60, 66, 66);
		panelUno.add(btonDos);
		btonTres = new JButton(iconoTres);
		btonTres.setBounds(260,60,66,66);
		panelUno.add(btonTres);
		btonCuatro = new JButton(iconoCuatro);
		btonCuatro.setBounds(60,140,66,66);
		panelUno.add(btonCuatro);
		btonCinco = new JButton(iconoCinco);
		btonCinco.setBounds(160,140,66,66);
		panelUno.add(btonCinco);
		btonSeis = new JButton();
		btonSeis.setBounds(260,140, 66,66);
		panelUno.add(btonSeis);
		panelVenta= new PanelVentas(scrollPane);
		panelVenta.setBounds(180,20,400,500);
		panelVenta.setVisible(false);
		add(panelVenta);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals(btonUno.getActionCommand())) {
			panelUno.setVisible(false);
			panelVenta.setVisible(true);
		} else {


		}

	}
}