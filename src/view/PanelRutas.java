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
				String listaMunicipioCundinamarca[] = { " ", "Alban", "Anapoima", "Anolaima","Cajica","Caqueza",
						"Carmen de Carupa", "Chía","Choconta", "Cota", "El Colegio", "Girardot", "Granada",
						"Guatavita","La Calera","Sibate" };
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
		if (origen.equalsIgnoreCase("tunja") && dFinal.equalsIgnoreCase("chivata")||origen.equalsIgnoreCase("chivata")&&dFinal.equalsIgnoreCase("tunja")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoTunja-Chivata.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("tunja") && dFinal.equalsIgnoreCase("chiquiza")||origen.equalsIgnoreCase("chiquiza")&&dFinal.equalsIgnoreCase("tunja")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoTunja-chiquiza.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("tunja") && dFinal.equalsIgnoreCase("combita")||origen.equalsIgnoreCase("combita")&&dFinal.equalsIgnoreCase("tunja")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoTunja-combita.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("tunja")&&dFinal.equalsIgnoreCase("cucaita")||origen.equalsIgnoreCase("cucaita")&&dFinal.equalsIgnoreCase("tunja")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoTunja-cucaita.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("chiquiza")&&dFinal.equalsIgnoreCase("chivata")||origen.equalsIgnoreCase("chivata")&&dFinal.equalsIgnoreCase("chiquiza")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoChiquiza-chivata.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("chiquiza")&&dFinal.equalsIgnoreCase("combita")||origen.equalsIgnoreCase("combita")&&dFinal.equalsIgnoreCase("chiquiza")){
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoChiquiza-combita.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("chiquiza")&&dFinal.equalsIgnoreCase("cucaita")||origen.equalsIgnoreCase("cucaita")&&dFinal.equalsIgnoreCase("chiquiza")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src\\imagenes\\destinoChiquiza-cucaita.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("chivata")&&dFinal.equalsIgnoreCase("combita")||origen.equalsIgnoreCase("combita")&&dFinal.equalsIgnoreCase("chivata")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoChivata-combita.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("chivata")&&dFinal.equalsIgnoreCase("cucaita")||origen.equalsIgnoreCase("cucaita")&&dFinal.equalsIgnoreCase("chivata")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoChivata-cucaita.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("combita")&&dFinal.equalsIgnoreCase("cucaita")||origen.equalsIgnoreCase("cucaita")&&dFinal.equalsIgnoreCase("combita")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoCombita-cucaita.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("alban")&&dFinal.equalsIgnoreCase("anapoima")||origen.equalsIgnoreCase("anapoima")&&dFinal.equalsIgnoreCase("alban")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAlban-anapoima.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("alban")&&dFinal.equalsIgnoreCase("anolaima")||origen.equalsIgnoreCase("anolaima")&&dFinal.equalsIgnoreCase("alban")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAlban-anolaima.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("alban")&&dFinal.equalsIgnoreCase("cajica")||origen.equalsIgnoreCase("cajica")&&dFinal.equalsIgnoreCase("alban")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAlban-cajica.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("alban")&&dFinal.equalsIgnoreCase("caqueza")||origen.equalsIgnoreCase("caqueza")&&dFinal.equalsIgnoreCase("alban")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAlban-caqueza.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("alban")&&dFinal.equalsIgnoreCase("choconta")||origen.equalsIgnoreCase("choconta")&&dFinal.equalsIgnoreCase("alban")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAlban-choconta.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("alban")&&dFinal.equalsIgnoreCase("granada")||origen.equalsIgnoreCase("granada")&&dFinal.equalsIgnoreCase("alban")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAlban-granada.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("alban")&&dFinal.equalsIgnoreCase("sibate")||origen.equalsIgnoreCase("sibate")&&dFinal.equalsIgnoreCase("alban")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAlban-sibate.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("anapoima")&&dFinal.equalsIgnoreCase("sibate")||origen.equalsIgnoreCase("sibate")&&dFinal.equalsIgnoreCase("anapoima")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAnapoima-sibate.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("anapoima")&&dFinal.equalsIgnoreCase("cajica")||origen.equalsIgnoreCase("cajica")&&dFinal.equalsIgnoreCase("anapoima")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAnapoima-cajica.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("anapoima")&&dFinal.equalsIgnoreCase("carmen de carupa")||origen.equalsIgnoreCase("carmen de carupa")&&dFinal.equalsIgnoreCase("anapoima")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAnapoima-carmendecarupa.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("anapoima")&&dFinal.equalsIgnoreCase("girardot")||origen.equalsIgnoreCase("girardot")&&dFinal.equalsIgnoreCase("anapoima")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAnapoima-girardot.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("anolaima")&&dFinal.equalsIgnoreCase("cajica")||origen.equalsIgnoreCase("cajica")&&dFinal.equalsIgnoreCase("anolaima")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAnolaima-cajica.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("anolaima")&&dFinal.equalsIgnoreCase("caqueza")||origen.equalsIgnoreCase("caqueza")&&dFinal.equalsIgnoreCase("anolaima")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAnolaima-caqueza.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("anolaima")&&dFinal.equalsIgnoreCase("choconta")||origen.equalsIgnoreCase("choconta")&&dFinal.equalsIgnoreCase("anolaima")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAnolaima-choconta.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("anolaima")&&dFinal.equalsIgnoreCase("cota")||origen.equalsIgnoreCase("cota")&&dFinal.equalsIgnoreCase("anolaima")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAnolaima-cota.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("anolaima")&&dFinal.equalsIgnoreCase("sibate")||origen.equalsIgnoreCase("sibate")&&dFinal.equalsIgnoreCase("anolaima")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoAnolaima-sibate.jpg"));
			etiqueta.setVisible(true);
		}if (origen.equalsIgnoreCase("carmen de carupa")&&dFinal.equalsIgnoreCase("sibate")||origen.equalsIgnoreCase("sibate")&&dFinal.equalsIgnoreCase("carmen de carupa")) {
			etiqueta.setIcon(new javax.swing.ImageIcon("src//imagenes//destinoCarmenCarupa-sibate.jpg"));
			etiqueta.setVisible(true);
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		mostrarImagenes();
	}

}
