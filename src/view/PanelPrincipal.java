//package view;
//
//import java.awt.CardLayout;
//import java.awt.Color;
//import java.awt.Component;
//import java.awt.Graphics;
//import java.awt.Insets;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//
//import javax.imageio.ImageIO;
//import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JOptionPane;
//import javax.swing.JPanel;
//import javax.swing.border.Border;
//import javax.swing.border.LineBorder;
//
//public class PanelPrincipal extends JPanel implements ActionListener {
//	private JButton btonUno;
//	private JButton btonDos;
//	private JButton btonTres;
//	private JButton btonCuatro;
//	private JButton btonCinco;
//	private JButton btonSeis;
//	private ImageIcon iconoUno;
//	private ImageIcon iconoDos;
//	private ImageIcon iconoTres;
//	private ImageIcon iconoCuatro;
//	private ImageIcon iconoCinco;
//	private ImageIcon iconoSeis;
//	
//		iconoUno = new ImageIcon("src/imagenes/terminal-de-punto-de-venta.png");
//		iconoDos = new ImageIcon("src/imagenes/ruta.png");
//		iconoTres= new ImageIcon("src/imagenes/comedor.png");
//		iconoCuatro = new ImageIcon("src/imagenes/cama-del-hotel.png");
//		iconoCinco=  new ImageIcon("src/imagenes/informacion.png");
//		btonUno = new JButton(iconoUno);
//		btonUno.setBorder(null);
//		btonUno.setActionCommand("hola");
//		btonUno.addActionListener(this);
//		btonUno.setBounds(60, 60, 66, 66);
//		add(btonUno);
//		btonDos = new JButton(iconoDos);
//		btonDos.setBorder(null);
//		btonDos.setBounds(160,60, 66, 66);
//		add(btonDos);
//		btonTres = new JButton(iconoTres);
//		btonTres.setBounds(260,60,66,66);
//		add(btonTres);
//		btonCuatro = new JButton(iconoCuatro);
//		btonCuatro.setBounds(60,140,66,66);
//		add(btonCuatro);
//		btonCinco = new JButton(iconoCinco);
//		btonCinco.setBounds(160,140,66,66);
//		add(btonCinco);
//		btonSeis = new JButton();
//		btonSeis.setBounds(260,140, 66,66);
//		add(btonSeis);
//		
//	}
//	
//
//
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (e.getActionCommand().equals(btonUno.getActionCommand())) {
//			PanelVentas obVentas = new PanelVentas(null);
//			obVentas.setVisible(true);
//		} else {
//
//		}
//	}
//
//}
