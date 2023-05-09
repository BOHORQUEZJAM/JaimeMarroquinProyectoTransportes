package view;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PanelRutas extends JPanel implements ItemListener, ActionListener {
	private JComboBox lista;
	private JComboBox destinoOrigen;
	private JComboBox destinoFinal;
	private Object municipio;
	private String origen;
	private String dFinal;
	private BufferedImage imagen;
	private JLabel etiqueta;
	private JButton boton;

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
		// destinoOrigen.setActionCommand("hola");
		// destinoOrigen.addItemListener(this);
		destinoOrigen.setVisible(false);
		add(destinoOrigen);
		destinoFinal = new JComboBox<>();
		destinoFinal.setBounds(360, 40, 150, 30);
		destinoFinal.setVisible(false);
		add(destinoFinal);
		etiqueta = new JLabel();
		etiqueta.setBounds(5, 5, 550, 370);
		etiqueta.setVisible(false);
		add(etiqueta);
		boton = new JButton("MOSTRAR");
		boton.setBounds(540, 40, 100, 30);
		boton.setVisible(false);
		boton.addActionListener(this);
		add(boton);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange() == ItemEvent.SELECTED) {
			municipio = lista.getSelectedItem();
			if (municipio.equals("boyaca")) {
				String[] municipioBoyaca = { "", "Tunja", "Chiquiza", "Chivata", "Combita", "Cucaita", "Motavita",
						"Oicatá", "Samaca", "Siachoque", "Sora", "Soracá", "Sotaquirá", "Toca", "Tuta",
						"Ventaquemada" };
				destinoOrigen.setModel(new DefaultComboBoxModel<>(municipioBoyaca));
				destinoOrigen.setVisible(true);
				destinoFinal.setModel(new DefaultComboBoxModel<>(municipioBoyaca));
				destinoFinal.setVisible(true);
				boton.setVisible(true);
			}
			if (municipio.equals("cundinamarca")) {
				String listaMunicipioCundinamarca[] = { " ", "Albán", "Anapoima", "Anolaima", "Apulo", "Beltrán",
						"Bituima", "Bojacá", "Cabrera", "Cachipay", "Cajicá", "Caparrapí", "Cáqueza",
						"Carmen de Carupa", "Chaguaní", "Chía", "Chipaque", "Choachí", "Chocontá", "Cogua", "Cota",
						"Cucunubá", "El Colegio", "Girardot", "Granada", "Guachetá", "Guaduas", "Guasca", "Guataquí",
						"Guatavita", "Guayabal de Síquima", "Guayabetal", "Gutiérrez", "Jerusalén", "Junín",
						"La Calera", "Sibaté" };
				destinoOrigen.setModel(new DefaultComboBoxModel<>(listaMunicipioCundinamarca));
				destinoOrigen.setVisible(true);
				destinoFinal.setModel(new DefaultComboBoxModel<>(listaMunicipioCundinamarca));
				destinoFinal.setVisible(true);
				boton.setVisible(true);
			}
			if (municipio.equals("santander")) {
				String listaMunicipioSantander[] = { "Bucaramanga", "Aguada", "Albania", "Aratoca", "Barbosa",
						"Barichara", "Barrancabermeja", "Betulia", "Bolívar", "Cabrera", "California", "Capitanejo",
						"Carcasí" };
				destinoOrigen.setModel(new DefaultComboBoxModel<>(listaMunicipioSantander));
				destinoOrigen.setVisible(true);
				destinoFinal.setModel(new DefaultComboBoxModel<>(listaMunicipioSantander));
				destinoFinal.setVisible(true);
				boton.setVisible(true);
			}
			if (municipio.equals("tolima")) {
				String listaMunicipioTolima[] = { "Ibagué", "Espinal", "Melgar", "Honda", "Líbano", "Chaparral",
						"Mariquita", "Cajamarca", "Armero Guayabal", "Purificación" };
				destinoOrigen.setModel(new DefaultComboBoxModel(listaMunicipioTolima));
				destinoOrigen.setVisible(true);
				destinoFinal.setModel(new DefaultComboBoxModel<>(listaMunicipioTolima));
				destinoFinal.setVisible(true);
				boton.setVisible(true);
			}
			if (municipio.equals("antioquia")) {
				String listaMunicipioAntioquia[] = { "Medellín", "Bello", "Itagüí", "Envigado", "Apartadó", "Rionegro",
						"Turbo", "Caucasia", "Caldas", "Chigorodó" };
				destinoOrigen.setModel(new DefaultComboBoxModel<>(listaMunicipioAntioquia));
				destinoOrigen.setVisible(true);
				destinoFinal.setModel(new DefaultComboBoxModel<>(listaMunicipioAntioquia));
				destinoFinal.setVisible(true);
				boton.setVisible(true);
			}
		}
	}

	public void mostrarImagenes() {
		origen = (String) destinoOrigen.getSelectedItem();
		dFinal = (String) destinoFinal.getSelectedItem();
		if (origen.equalsIgnoreCase("tunja") && dFinal.equalsIgnoreCase("chivata")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoTunja-Chivata.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("tunja") && dFinal.equalsIgnoreCase("chiquiza")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoTunja-chiquiza.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("tunja") && dFinal.equalsIgnoreCase("combita")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoTunja-combita.jpg"));
			etiqueta.setVisible(true);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mostrarImagenes();
	}

}
