package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

public class PanelVentas extends JPanel implements ItemListener {
	private JLabel etiquetaNombre;
	private JLabel etiquetaID;
	private JLabel etiquetaDestinoDepartamento;
	private JLabel etiquetaPasajeros;
	private JLabel etiquetaDestinoMunicipio;
	private JLabel etiquetaEmpresa;
	private JTextField textoNombre;
	private JTextField textoID;
	private JSpinner numPasajeros;
	private JComboBox destinoDepartamento;
	private JComboBox empresaTranporte;
	private JComboBox destinoMunicipio;
	private Object municipio;

	public PanelVentas(JScrollPane scrollPane) {
		setBorder(new TitledBorder(null, "tiquetes", TitledBorder.CENTER, TitledBorder.TOP, null, java.awt.Color.BLUE));
		setBackground(Color.white);
		setLayout(null);

		String listaDepartamento[] = { "   ", "boyaca", "cundinamarca", "santander", "tolima", "antioquia", "meta",
				"valle del cauca", "nariño" };
		etiquetaNombre = new JLabel("ingrese el nombre del cliente");
		etiquetaNombre.setBounds(10, 50, 200, 25);
		add(etiquetaNombre);
		textoNombre = new JTextField("nombre");
		textoNombre.setBounds(10, 70, 150, 30);
		add(textoNombre);
		etiquetaID = new JLabel("ingrese el id del cliente ");
		etiquetaID.setBounds(10, 90, 200, 25);
		add(etiquetaID);
		textoID = new JTextField("id");
		textoID.setBounds(10, 110, 100, 30);
		add(textoID);
		etiquetaEmpresa = new JLabel("elija la empresa");
		etiquetaEmpresa.setBounds(10, 140, 150, 30);
		add(etiquetaEmpresa);
		empresaTranporte = new JComboBox();
		empresaTranporte.setBounds(10, 170, 120, 30);
		add(empresaTranporte);
		etiquetaDestinoDepartamento = new JLabel("elija el destino del cliente ");
		etiquetaDestinoDepartamento.setBounds(10, 200, 200, 25);
		add(etiquetaDestinoDepartamento);
		destinoDepartamento = new JComboBox(listaDepartamento);
		destinoDepartamento.setBounds(10, 235, 120, 30);
		destinoDepartamento.setSelectedItem(new JScrollPane());
		destinoDepartamento.addItemListener(this);
		destinoDepartamento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(destinoDepartamento);
		destinoMunicipio = new JComboBox();
		destinoMunicipio.setBounds(240,235, 120, 30);
		destinoMunicipio.setSelectedItem(new JScrollPane());
		destinoMunicipio.setVisible(false);
		add(destinoMunicipio);
		etiquetaPasajeros = new JLabel("ingrese numero de pasajeros");
		etiquetaPasajeros.setBounds(10, 300, 200, 25);
		add(etiquetaPasajeros);
		SpinnerNumberModel valor = new SpinnerNumberModel(0, 0, 20, 1);
		numPasajeros = new JSpinner(valor);
		numPasajeros.setBounds(10, 320, 50, 25);
		add(numPasajeros);

	}

	@Override
	public void itemStateChanged(ItemEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getStateChange() == ItemEvent.SELECTED) {
			municipio = destinoDepartamento.getSelectedItem();
			if (municipio.equals("boyaca")) {
				String listaMunicipioBoyaca[] = { "Tunja", "Chíquiza", "Chivatá", "Cómbita", "Cucaita", "Motavita",
						"Oicatá", "Samaca", "Siachoque", "Sora", "Soracá", "Sotaquirá", "Toca", "Tuta",
						"Ventaquemada" };
				destinoMunicipio.setModel(new DefaultComboBoxModel(listaMunicipioBoyaca));
				destinoMunicipio.setVisible(true);
			} else {
				if (evento.getStateChange() == ItemEvent.SELECTED) {
					if (municipio.equals("cundinamarca")) {
						String listaMunicipioCundinamarca[] = { "Agua de Dios", "Albán", "Anapoima", "Anolaima",
								"Apulo", "Beltrán", "Bituima", "Bojacá", "Cabrera", "Cachipay", "Cajicá", "Caparrapí",
								"Cáqueza", "Carmen de Carupa", "Chaguaní", "Chía", "Chipaque", "Choachí", "Chocontá",
								"Cogua", "Cota", "Cucunubá", "El Colegio", "El Peñón", "El Rosal", "Facatativá",
								"Fómeque", "Fosca", "Funza", "Fúquene", "Fusagasugá", "Gachalá", "Gachancipá",
								"Gachetá", "Gama", "Girardot", "Granada", "Guachetá", "Guaduas", "Guasca", "Guataquí",
								"Guatavita", "Guayabal de Síquima", "Guayabetal", "Gutiérrez", "Jerusalén", "Junín",
								"La Calera", "La Mesa", "La Palma", "La Peña", "La Vega", "Lenguazaque", "Machetá",
								"Madrid", "Manta", "Medina", "Mosquera", "Nariño", "Nemocón", "Nilo", "Nimaima",
								"Nocaima", "Pacho", "Paime", "Pandi", "Paratebueno", "Pasca", "Puerto Salgar", "Pulí",
								"Quebradanegra", "Quetame", "Quipile", "Ricaurte", "San Antonio del Tequendama",
								"San Bernardo", "San Cayetano", "San Francisco", "San Juan de Rioseco", "Sasaima",
								"Sesquilé", "Sibaté", "Silvania", "Simijaca", "Soacha", "Sopó", "Subachoque", "Suesca",
								"Supatá", "Susa", "Sutatausa", "Tabio", "Tausa", "Tena", "Tenjo", "Tibacuy", "Tibirita",
								"Tocaima", "Tocancipá", "Topaipí", "Ubalá", "Ubaque", "Ubaté", "Útica", "Venecia",
								"Vergara", "Vianí", "Villagómez", "Villapinzón", "Villeta", "Viotá", "Yacopí",
								"Zipacón", "Zipaquirá" };
						destinoMunicipio.setModel(new DefaultComboBoxModel(listaMunicipioCundinamarca));
						destinoMunicipio.setVisible(true);
					}
				}
			}
		}
	}

}
