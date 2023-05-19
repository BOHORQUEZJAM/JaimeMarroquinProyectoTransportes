package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Date;
import java.util.Iterator;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

import control.Controller;

public class PanelVentas extends JPanel implements ItemListener, ActionListener {
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
	private JComboBox destinoMunicipioDestino;
	private Object municipio;
	private JComboBox destinoMunicipioDfinal;
	private JButton botonVeiculo;
	private JComboBox comboVehiculos;
	private JButton boton;
	private CustomEvent eventoVentas;
	private String mensaje;
	private String fechaHora;

	private String mensajeRespuesta;
	private String tarifa;

	public PanelVentas(JScrollPane scrollPane) {
		setBorder(new TitledBorder(null, "tiquetes", TitledBorder.CENTER, TitledBorder.TOP, null, java.awt.Color.BLUE));
		setBackground(Color.white);
		setLayout(null);

		String listaDepartamento[] = { "   ", "boyaca", "cundinamarca", "santander", "tolima", "antioquia", "meta",
				"valle del cauca", "nariño" };
		String listaEmpresas[] = { "libertadores", "gasela", "concord", "velociba", "delfines", "cotrabens" };
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
		empresaTranporte = new JComboBox(listaEmpresas);
		empresaTranporte.setBounds(10, 170, 120, 30);
		add(empresaTranporte);
		botonVeiculo = new JButton();
		botonVeiculo.setBounds(140, 170, 30, 30);
		botonVeiculo.setActionCommand("vehiculo");
		botonVeiculo.addActionListener(this);
		add(botonVeiculo);
		etiquetaDestinoDepartamento = new JLabel("elija el destino del cliente ");
		etiquetaDestinoDepartamento.setBounds(10, 220, 200, 25);
		add(etiquetaDestinoDepartamento);
		destinoDepartamento = new JComboBox(listaDepartamento);
		destinoDepartamento.setBounds(10, 255, 110, 30);
		destinoDepartamento.setSelectedItem(new JScrollPane());
		destinoDepartamento.addItemListener(this);
		destinoDepartamento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(destinoDepartamento);
		destinoMunicipioDfinal = new JComboBox();
		destinoMunicipioDfinal.setBounds(170, 255, 120, 60);
		destinoMunicipioDfinal.setBorder(BorderFactory.createTitledBorder("destino de origen"));
		destinoMunicipioDfinal.setSelectedItem(new JScrollPane());
		destinoMunicipioDfinal.setVisible(false);
		add(destinoMunicipioDfinal);
		destinoMunicipioDestino = new JComboBox();
		destinoMunicipioDestino.setBounds(300, 255, 120, 60);
		destinoMunicipioDestino.setBorder(BorderFactory.createTitledBorder("destino final"));
		destinoMunicipioDestino.setSelectedItem(new JScrollPane());
		destinoMunicipioDestino.setVisible(false);
		add(destinoMunicipioDestino);
		etiquetaPasajeros = new JLabel("ingrese numero de pasajeros");
		etiquetaPasajeros.setBounds(10, 330, 200, 25);
		add(etiquetaPasajeros);
		SpinnerNumberModel valor = new SpinnerNumberModel(0, 0, 20, 1);
		numPasajeros = new JSpinner(valor);
		numPasajeros.setBounds(10, 350, 50, 25);
		add(numPasajeros);
		comboVehiculos = new JComboBox();
		comboVehiculos.setBorder(BorderFactory.createTitledBorder("elija vehiculo"));
		comboVehiculos.setBounds(180, 170, 100, 40);
		comboVehiculos.setVisible(false);
		add(comboVehiculos);
		boton = new JButton("ENVIAR");
		boton.setBounds(350, 400, 100, 40);
		boton.setActionCommand("enviar");
		boton.addActionListener(this);
		add(boton);

	}

	@Override
	public void itemStateChanged(ItemEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getStateChange() == ItemEvent.SELECTED) {
			municipio = (String) destinoDepartamento.getSelectedItem();
			if (municipio.equals("boyaca")) {
				String listaMunicipioBoyaca[] = { "Tunja", "Chiquiza", "Chivata", "Cómbita", "Cucaita", "Motavita",
						"Oicata", "Samaca", "Siachoque", "Sora", "Soraca", "Sotaquira", "Toca", "Tuta",
						"Ventaquemada" };
				destinoMunicipioDestino.setModel(new DefaultComboBoxModel(listaMunicipioBoyaca));
				destinoMunicipioDestino.setVisible(true);
				destinoMunicipioDfinal.setModel(new DefaultComboBoxModel(listaMunicipioBoyaca));
				destinoMunicipioDfinal.setVisible(true);
			} else {
				if (evento.getStateChange() == ItemEvent.SELECTED) {
					if (municipio.equals("cundinamarca")) {
						String listaMunicipioCundinamarca[] = { " ", "Albán", "Anapoima", "Anolaima", "Apulo",
								"Beltrán", "Bituima", "Bojacá", "Cabrera", "Cachipay", "Cajicá", "Caparrapí", "Cáqueza",
								"Carmen de Carupa", "Chaguaní", "Chía", "Chipaque", "Choachí", "Chocontá", "Cogua",
								"Cota", "Cucunubá", "El Colegio", "Girardot", "Granada", "Guachetá", "Guaduas",
								"Guasca", "Guataquí", "Guatavita", "Guayabal de Síquima", "Guayabetal", "Gutiérrez",
								"Jerusalén", "Junín", "La Calera", "Sibaté", "Silvania", "Simijaca", "Soacha", "Sopó",
								"Subachoque", "Suesca", "Supatá", "Susa", "Sutatausa", "Tabio", "Tena", "Tenjo",
								"Tibacuy", "Tibirita", "Tocaima", "Tocancipá", "Topaipí", "Ubalá", "Ubaque", "Ubaté",
								"Útica", "Venecia", "Vergara", "Vianí", "Villagómez", "Villapinzón", "Villeta", "Viotá",
								"Yacopí", "Zipacón", "Zipaquirá" };
						destinoMunicipioDestino.setModel(new DefaultComboBoxModel(listaMunicipioCundinamarca));
						destinoMunicipioDestino.setVisible(true);
						destinoMunicipioDfinal.setModel(new DefaultComboBoxModel(listaMunicipioCundinamarca));
						destinoMunicipioDfinal.setVisible(true);
					} else {
						if (evento.getStateChange() == ItemEvent.SELECTED) {
							if (municipio.equals("santander")) {
								String listaMunicipioSantander[] = { "Bucaramanga", "Aguada", "Albania", "Aratoca",
										"Barbosa", "Barichara", "Barrancabermeja", "Betulia", "Bolívar", "Cabrera",
										"California", "Capitanejo", "Carcasí" };
								destinoMunicipioDestino.setModel(new DefaultComboBoxModel(listaMunicipioSantander));
								destinoMunicipioDestino.setVisible(true);
								destinoMunicipioDfinal.setModel(new DefaultComboBoxModel(listaMunicipioSantander));
								destinoMunicipioDfinal.setVisible(true);
							} else {
								if (evento.getStateChange() == ItemEvent.SELECTED) {
									if (municipio.equals("tolima")) {
										String listaMunicipioTolima[] = { "Ibagué", "Espinal", "Melgar", "Honda",
												"Líbano", "Chaparral", "Mariquita", "Cajamarca", "Armero Guayabal",
												"Purificación" };
										destinoMunicipioDestino
												.setModel(new DefaultComboBoxModel(listaMunicipioTolima));
										destinoMunicipioDestino.setVisible(true);
										destinoMunicipioDfinal.setModel(new DefaultComboBoxModel(listaMunicipioTolima));
										destinoMunicipioDfinal.setVisible(true);
									} else {
										if (evento.getStateChange() == ItemEvent.SELECTED) {
											if (municipio.equals("antioquia")) {
												String listaMunicipioAntioquia[] = { "Medellín", "Bello", "Itagüí",
														"Envigado", "Apartadó", "Rionegro", "Turbo", "Caucasia",
														"Caldas", "Chigorodó" };
												destinoMunicipioDestino
														.setModel(new DefaultComboBoxModel(listaMunicipioAntioquia));
												destinoMunicipioDestino.setVisible(true);
												destinoMunicipioDfinal
														.setModel(new DefaultComboBoxModel(listaMunicipioAntioquia));
												destinoMunicipioDfinal.setVisible(true);
											} else {
												if (evento.getStateChange() == ItemEvent.SELECTED) {
													if (municipio.equals("meta")) {
														String listaMunicipioMeta[] = { "Villavicencio", "Acacías",
																"Barranca de Upía", "Cabuyaro", "Castilla la Nueva",
																"Cubarral", "Cumaral", "El Calvario", "El Castillo",
																"El Dorado" };
														destinoMunicipioDestino
																.setModel(new DefaultComboBoxModel(listaMunicipioMeta));
														destinoMunicipioDestino.setVisible(true);
														destinoMunicipioDfinal
																.setModel(new DefaultComboBoxModel(listaMunicipioMeta));
														destinoMunicipioDfinal.setVisible(true);
													} else {
														if (evento.getStateChange() == ItemEvent.SELECTED) {
															if (municipio.equals("valle del cauca")) {
																String listaMunicipioVCauca[] = { "Cali",
																		"Buenaventura", "Palmira", "Tuluá", "Buga",
																		"Cartago", "Jamundí", "Yumbo", "Sevilla",
																		"Roldanill" };
																destinoMunicipioDestino.setModel(
																		new DefaultComboBoxModel(listaMunicipioVCauca));
																destinoMunicipioDestino.setVisible(true);
																destinoMunicipioDfinal.setModel(
																		new DefaultComboBoxModel(listaMunicipioVCauca));
																destinoMunicipioDfinal.setVisible(true);
															} else {
																if (evento.getStateChange() == ItemEvent.SELECTED) {
																	if (municipio.equals("nariño")) {
																		String listamunicipioNariño[] = { "Pasto",
																				"Tumaco", "Ipiales", "La Unión",
																				"Barbacoas", "Cumbal", "El Charco",
																				"La Cruz", "San Lorenzo", "Samaniego" };
																		destinoMunicipioDestino
																				.setModel(new DefaultComboBoxModel(
																						listamunicipioNariño));
																		destinoMunicipioDestino.setVisible(true);
																		destinoMunicipioDfinal
																				.setModel(new DefaultComboBoxModel(
																						listamunicipioNariño));
																		destinoMunicipioDfinal.setVisible(true);
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public void vehiculos() {
		String listaVehiculos[] = { "vsc-123", "hsd-234", "qwe-567", "tyu-789", "mfg-103" };
		comboVehiculos.setModel(new DefaultComboBoxModel(listaVehiculos));
		comboVehiculos.setVisible(true);
	}

	public void obtenerDatos() {
		String nombreString = textoNombre.getText();
		String iDString = textoID.getText();
		String empresa = (String) empresaTranporte.getSelectedItem();
		String vehiculoString = (String) comboVehiculos.getSelectedItem();
		String destinoOrigenString = (String) destinoMunicipioDestino.getSelectedItem();
		String destinoFinalString = (String) destinoMunicipioDfinal.getSelectedItem();
		int valor = (Integer) numPasajeros.getValue();
		String municipio = (String) this.municipio;
		eventoVentas.datosObtenidosVentas(nombreString, iDString, empresa, vehiculoString, municipio, destinoOrigenString,
				destinoFinalString, valor);

	}

	public void respuesta(int precio, String mensaje, String fecha) {
		fechaHora = fecha;
		mensajeRespuesta = mensaje;
		tarifa = String.valueOf(precio);
	}

	private void visivilizarArea() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, fechaHora + mensajeRespuesta + tarifa);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getActionCommand().equals(botonVeiculo.getActionCommand())) {
			vehiculos();
		}
		if (e.getActionCommand().equals(boton.getActionCommand())) {
			obtenerDatos();
			visivilizarArea();
		}
	}

	// metodos get y set
	public CustomEvent getEvento() {
		return eventoVentas;
	}

	public void setEvento(Controller objetoController) {
		this.eventoVentas = (CustomEvent) objetoController;
	}

}
