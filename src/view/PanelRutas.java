package view;

import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelRutas extends JPanel implements ItemListener {
	private JComboBox lista;
	private JComboBox destinoOrigen;
	private JComboBox destinoFinal;
	private Object municipio;
	private String origen;
	private String dFinal;
	private BufferedImage imagen;
	private JLabel etiqueta;

	public PanelRutas() {
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder("panel de rutas"));

		String listaDepartamento[] = { "   ", "boyaca", "cundinamarca", "santander", "tolima", "antioquia", "meta",
				"valle del cauca", "nariño" };
		lista = new JComboBox<>(listaDepartamento);
		lista.setBounds(20, 40, 150, 30);
		lista.addItemListener(this);
		add(lista);
		destinoOrigen = new JComboBox<>();
		destinoOrigen.setBounds(190, 40, 150, 30);
//		destinoOrigen.setActionCommand("hola");
//		destinoOrigen.addItemListener(this);
		destinoOrigen.setVisible(false);
		add(destinoOrigen);
		destinoFinal = new JComboBox<>();
		destinoFinal.setBounds(360, 40, 150, 30);
		destinoFinal.setVisible(false);
		add(destinoFinal);
		etiqueta = new JLabel();
		etiqueta.setBounds(5, 5,550,370);
//		etiqueta.setVisible(false);
		add(etiqueta);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {
			municipio = lista.getSelectedItem();
			if (municipio.equals("boyaca")) {
				String[] municipioBoyaca = {"", "Tunja", "Chíquiza", "Chivatá", "Cómbita", "Cucaita", "Motavita", "Oicatá",
						"Samaca", "Siachoque", "Sora", "Soracá", "Sotaquirá", "Toca", "Tuta", "Ventaquemada" };
				destinoOrigen.setModel(new DefaultComboBoxModel<>(municipioBoyaca));
				destinoOrigen.setVisible(true);
				destinoFinal.setModel(new DefaultComboBoxModel<>(municipioBoyaca));
				destinoFinal.setVisible(true);
				
				
				origen=(String)destinoOrigen.getSelectedItem();
				dFinal = (String)destinoFinal.getSelectedItem();
				etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoTunja-Chivata.jpg"));
				
			}

		}
	}

}
