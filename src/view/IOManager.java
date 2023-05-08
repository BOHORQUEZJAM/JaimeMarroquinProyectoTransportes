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
	private JPanel panelDos;
	private JPanel panelTres;
	private JPanel panelCuatro;
	private JPanel panelCinco;
	private JPanel panelSeis;
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
		panelUno.setBorder(new LineBorder(Color.decode("#0C5172"), 40));
		add(panelUno);
		panelVenta = new PanelVentas(scrollPane);
		panelVenta.setBounds(180, 20, 400, 500);
		panelVenta.setVisible(false);
		add(panelVenta);
		panelDos = new PanelRutas();
		panelDos.setBounds(30, 30, 600, 500);
		panelDos.setVisible(false);
		add(panelDos);
		panelTres = new PanelComidas();
		panelTres.setBounds(30, 30, 600, 500);
		panelTres.setVisible(false);
		add(panelTres);
		panelCuatro = new PanelHospedaje();
		panelCuatro.setBounds(30, 30, 600, 500);
		panelCuatro.setVisible(false);
		add(panelCuatro);
		panelCinco = new PanelInformacion();
		panelCinco.setBounds(30, 30, 600, 500);
		panelCinco.setVisible(false);
		add(panelCinco);
		panelSeis = new PanelEmergencias();
		panelSeis.setBounds(30, 30, 600, 500);
		panelSeis.setVisible(false);
		add(panelSeis);
		iconoUno = new ImageIcon("src/imagenes/terminal-de-punto-de-venta.png");
		iconoDos = new ImageIcon("src/imagenes/ruta.png");
		iconoTres = new ImageIcon("src/imagenes/comedor.png");
		iconoCuatro = new ImageIcon("src/imagenes/cama-del-hotel.png");
		iconoCinco = new ImageIcon("src/imagenes/informacion.png");
		iconoSeis = new ImageIcon("src/imagenes/kit-de-primeros-auxilios.png");
		btonUno = new JButton(iconoUno);
		btonUno.setBorder(null);
		btonUno.setActionCommand("hola");
		btonUno.addActionListener(this);
		btonUno.setBounds(60, 60, 66, 66);
		panelUno.add(btonUno);
		btonDos = new JButton(iconoDos);
		btonDos.setBorder(null);
		btonDos.setActionCommand("milo");
		btonDos.addActionListener(this);
		btonDos.setBounds(160, 60, 66, 66);
		panelUno.add(btonDos);
		btonTres = new JButton(iconoTres);
		btonTres.setBounds(260, 60, 66, 66);
		btonTres.setActionCommand("eeeyyyy");
		btonTres.addActionListener(this);
		panelUno.add(btonTres);
		btonCuatro = new JButton(iconoCuatro);
		btonCuatro.setBounds(60, 140, 66, 66);
		btonCuatro.setActionCommand("oeeeee");
		btonCuatro.addActionListener(this);
		panelUno.add(btonCuatro);
		btonCinco = new JButton(iconoCinco);
		btonCinco.setBounds(160, 140, 66, 66);
		btonCinco.setActionCommand("millos");
		btonCinco.addActionListener(this);
		panelUno.add(btonCinco);
		btonSeis = new JButton(iconoSeis);
		btonSeis.setBounds(260, 140, 66, 66);
		btonSeis.addActionListener(this);
		panelUno.add(btonSeis);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals(btonUno.getActionCommand())) {
			panelUno.setVisible(false);
			panelVenta.setVisible(true);
		}
		if (e.getActionCommand().equals(btonDos.getActionCommand())) {
			panelUno.setVisible(false);
			panelCinco.setVisible(false);
			panelDos.setVisible(true);
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			panelDos.setSize(1300,600);
		}
		if (e.getActionCommand().equals(btonTres.getActionCommand())) {
			panelUno.setVisible(false);
			panelDos.setVisible(false);
			panelTres.setVisible(true);
		}
		if (e.getActionCommand().equals(btonCuatro.getActionCommand())) {
			panelUno.setVisible(false);
			panelTres.setVisible(false);
			panelCuatro.setVisible(true);
		}
		if (e.getActionCommand().equals(btonCinco.getActionCommand())) {
			panelUno.setVisible(false);
			panelCuatro.setVisible(false);
			panelCinco.setVisible(true);
		}
		if (e.getActionCommand().equals(btonSeis.getActionCommand())) {
			panelUno.setVisible(false);
			panelCinco.setVisible(false);
			panelSeis.setVisible(true);
		}
	}

}