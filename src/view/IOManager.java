package view;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import control.Controller;

public class IOManager extends JFrame implements ActionListener, CustomEventResponce {

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
	private JButton btonVolver;
	private Image imagen;

	public IOManager() {
		setSize(800, 600);
		setTitle("PANTALLA DE INICIO");
		setLocationRelativeTo(null);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Controller objeController = new Controller();
		objeController.setObjetoResponce(this);

		scrollPane = new JScrollPane();
		btonVolver = new JButton("volver");
		btonVolver.setBounds(300, 480, 60, 30);
		btonVolver.setVisible(false);
		add(btonVolver);
		panelUno = new JPanel();
		panelUno.setBounds(200, 70, 400, 400);
		panelUno.setLayout(null);
		panelUno.setBackground(Color.decode("#0C5172"));
		panelUno.setBorder(new LineBorder(Color.decode("#0C5172"), 40));
		panelUno.add(btonVolver);
		;
		add(panelUno);
		panelVenta = new PanelVentas(scrollPane);
		panelVenta.setBounds(180, 20, 460, 540);
		panelVenta.setVisible(false);
		panelVenta.setBackground(Color.decode("#110442"));
		((PanelVentas) panelVenta).setEvento(objeController);
		add(panelVenta);
		panelDos = new PanelRutas();
		panelDos.setBounds(30, 30, 600, 500);
		panelDos.setBackground(Color.decode("#0C5172"));
		panelDos.setVisible(false);
		add(panelDos);
		panelTres = new PanelComidas();
		panelTres.setBounds(30, 30, 600, 500);
		panelTres.setBackground(Color.decode("#16A085"));
		panelTres.setVisible(false);
		((PanelComidas)panelTres).setEventComidas(objeController);
		add(panelTres);
		panelCuatro = new PanelHospedaje();
		panelCuatro.setBounds(30, 30, 600, 500);
		panelCuatro.setBackground(Color.decode("#110442"));
		panelCuatro.setVisible(false);
		add(panelCuatro);
		panelCinco = new PanelInformacion();
		panelCinco.setBounds(30, 30, 600, 500);
		panelCinco.setVisible(false);
		add(panelCinco);
		panelSeis = new PanelEmergencias();
		panelSeis.setBounds(30, 30, 490,490);
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
		btonSeis.setActionCommand("info");
		btonSeis.addActionListener(this);
		panelUno.add(btonSeis);
		JLabel etiqueta= new JLabel();
		etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//800007124.jpg"));
		etiqueta.setBounds(5, 5,1900,900);
		add(etiqueta);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals(btonUno.getActionCommand())) {
			panelUno.setVisible(false);
			panelVenta.setVisible(true);
			btonVolver.setActionCommand("volver");
			btonVolver.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					panelVenta.setVisible(false);
					panelUno.setVisible(true);
				}
			});
			panelVenta.add(btonVolver);
			btonVolver.setVisible(true);
		}
		if (e.getActionCommand().equals(btonDos.getActionCommand())) {
			panelUno.setVisible(false);
			panelCinco.setVisible(false);
			panelDos.setVisible(true);
			btonVolver.setBounds(380, 400,100,30);
			setExtendedState(JFrame.MAXIMIZED_BOTH);
			panelDos.setSize(1300, 600);
			btonVolver.setActionCommand("volver");
			btonVolver.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					panelDos.setVisible(false);
					panelUno.setVisible(true);
				}
			});
			panelDos.add(btonVolver);
			btonVolver.setVisible(true);
		}
		if (e.getActionCommand().equals(btonTres.getActionCommand())) {
			panelUno.setVisible(false);
			panelDos.setVisible(false);
			panelTres.setVisible(true);
			btonVolver.setBounds(380, 400,100,30);
			btonVolver.setActionCommand("volver");
			btonVolver.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					panelTres.setVisible(false);
					panelUno.setVisible(true);
				}
			});
			panelTres.add(btonVolver);
			btonVolver.setVisible(true);
		}
		if (e.getActionCommand().equals(btonCuatro.getActionCommand())) {
			panelUno.setVisible(false);
			panelTres.setVisible(false);
			panelCuatro.setVisible(true);
			btonVolver.setBounds(380, 400,100,30);
			btonVolver.setActionCommand("volver");
			btonVolver.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					panelCuatro.setVisible(false);
					panelUno.setVisible(true);
				}
			});
			panelCuatro.add(btonVolver);
			btonVolver.setVisible(true);
		}
		if (e.getActionCommand().equals(btonCinco.getActionCommand())) {
			panelUno.setVisible(false);
			panelCuatro.setVisible(false);
			panelCinco.setVisible(true);
			btonVolver.setBounds(380, 400,100,30);
			btonVolver.setActionCommand("volver");
			btonVolver.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					panelCinco.setVisible(false);
					panelUno.setVisible(true);
				}
			});
			panelCinco.add(btonVolver);
			btonVolver.setVisible(true);
		}
		if (e.getActionCommand().equals(btonSeis.getActionCommand())) {
			panelUno.setVisible(false);
			panelCinco.setVisible(false);
			panelSeis.setVisible(true);
			btonVolver.setBounds(380, 400,100,30);
			btonVolver.setActionCommand("volver");
			btonVolver.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					panelSeis.setVisible(false);
					panelUno.setVisible(true);
				}
			});
			panelSeis.add(btonVolver);
			btonVolver.setVisible(true);
		}
	}
	

	@Override
	public void recibirRespuestas(int precio, String mensaje, String fecha) {
		// TODO Auto-generated method stub
		((PanelVentas) panelVenta).respuesta(precio, mensaje, fecha);
	}


	@Override
	public void recibirResCafeteria(String mensajeRespuestaaCafeteria) {
		// TODO Auto-generated method stub
		((PanelComidas)panelTres).respuestaMenu(mensajeRespuestaaCafeteria);
		
	}


	@Override
	public void respuestaCliente(String respuesta) {
		// TODO Auto-generated method stub
		((PanelComidas)panelTres).respuestaCliente(respuesta);
	}

}