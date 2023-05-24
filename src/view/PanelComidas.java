package view;
/*
 * JAIME MARROQUIN
 * PROYECTO  TRANPORTE (POO)
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelComidas extends JPanel implements ItemListener, ActionListener {
	//DECLARACION DE VARIABLES
	private JRadioButton desayuno;
	private JRadioButton almuerzo;
	private JRadioButton sena;
	private String contenido;
	private ButtonGroup grupo;
	private JCheckBox unoBox;
	private JCheckBox dosBox;
	private JCheckBox tresBox;
	private JCheckBox cuatroBox;
	private JCheckBox cincoBox;
	private JCheckBox seisBox;
	private JCheckBox sieteBox;
	private JCheckBox ochoBox;;
	private JCheckBox nueveBox;
	private JCheckBox diezBox;
	private JButton botonEnviar;
	private JTextField textoNombre;
	private JTextField textoID;
	private String variable;
	private String variableDos;
	// private String variableTres;
	// private String variableCuatro;
	// private String variableCinco;
	// private String variSeis;
	// private String variSiete;
	// private String variOcho;
	// private String variNueve;
	// private String variDiez;
	private CustomEvent eventComidas;
//METODO CONSTRUCTOR
	public PanelComidas() {
		setLayout(null);
		setBorder(BorderFactory.createTitledBorder("panel de comidas"));

		desayuno = new JRadioButton("DESAYUNO");
		almuerzo = new JRadioButton("ALMUERZO");
		sena = new JRadioButton("SENA");
		desayuno.setBounds(30, 30, 100, 40);
		almuerzo.setBounds(180, 30, 100, 40);
		sena.setBounds(350, 30, 100, 40);
		desayuno.setActionCommand("desayuno");
		almuerzo.setActionCommand("almuerzo");
		sena.setActionCommand("sena");
		desayuno.addItemListener(this);
		almuerzo.addItemListener(this);
		sena.addItemListener(this);
		add(desayuno);
		add(almuerzo);
		add(sena);
		grupo = new ButtonGroup();
		grupo.add(desayuno);
		grupo.add(almuerzo);
		grupo.add(sena);
		unoBox = new JCheckBox("caldo de costilla");
		unoBox.setBounds(30, 90, 150, 20);
		unoBox.addItemListener(this);
		unoBox.setVisible(false);
		add(unoBox);
		dosBox = new JCheckBox("changua");
		dosBox.setBounds(30, 110, 100, 20);
		dosBox.addItemListener(this);
		dosBox.setVisible(false);
		add(dosBox);
		tresBox = new JCheckBox("cafe");
		tresBox.setBounds(30, 130, 100, 20);
		tresBox.addItemListener(this);
		tresBox.setVisible(false);
		add(tresBox);
		cuatroBox = new JCheckBox("chocolate");
		cuatroBox.setBounds(30, 150, 150, 20);
		cuatroBox.addItemListener(this);
		cuatroBox.setVisible(false);
		add(cuatroBox);
		cincoBox = new JCheckBox("huevo frito");
		cincoBox.setBounds(30, 170, 100, 20);
		cincoBox.addItemListener(this);
		cincoBox.setVisible(false);
		add(cincoBox);
		seisBox = new JCheckBox("fruta");
		seisBox.setBounds(190, 90, 100, 20);
		seisBox.addItemListener(this);
		seisBox.setVisible(false);
		add(seisBox);
		sieteBox = new JCheckBox("queso");
		sieteBox.setBounds(190, 110, 100, 20);
		sieteBox.addItemListener(this);
		sieteBox.setVisible(false);
		add(sieteBox);
		ochoBox = new JCheckBox("pan");
		ochoBox.setBounds(190, 130, 150, 20);
		ochoBox.addItemListener(this);
		ochoBox.setVisible(false);
		add(ochoBox);
		nueveBox = new JCheckBox("arepa");
		nueveBox.setBounds(190, 150, 100, 20);
		nueveBox.addItemListener(this);
		nueveBox.setVisible(false);
		add(nueveBox);
		diezBox = new JCheckBox("empanada");
		diezBox.setBounds(190, 170, 150, 20);
		diezBox.addItemListener(this);
		diezBox.setVisible(false);
		add(diezBox);
		botonEnviar = new JButton("enviar pedido");
		botonEnviar.setBounds(360, 200, 150, 20);
		botonEnviar.setActionCommand("enviar");
		botonEnviar.addActionListener(this);
		add(botonEnviar);
		textoNombre = new JTextField("nombre");
		textoNombre.setBounds(30, 200, 150, 60);
		textoNombre.setBorder(BorderFactory.createTitledBorder("nombre y apellido"));
		textoNombre.setVisible(false);
		add(textoNombre);
		textoID = new JTextField("id");
		textoID.setBounds(30, 260, 100, 60);
		textoID.setBorder(BorderFactory.createTitledBorder("identificacion"));
		textoID.setVisible(false);
		add(textoID);
	}
//METODOS PROPIOS
	public void seleccionCheck() {
		contenido = "";
		JCheckBox[] asignaturas = { unoBox, dosBox, tresBox, cuatroBox, cincoBox, seisBox, sieteBox, ochoBox, nueveBox,
				diezBox };
		for (int i = 0; i < asignaturas.length; i++) {
			if (asignaturas[i].isSelected() == true) { // aqui envio al modelo
				contenido = asignaturas[i].getText() + "\n";
				eventComidas.recibircheck(contenido);
			} else {
				if (asignaturas[i].isSelected() == false) {
					System.out.println("seleccione un check");
				}

			}

		}
	}

	public void eventoRadiobutton() {

		if (desayuno.isSelected()) {
			contenido = desayuno.getText();
			unoBox.setVisible(true);
			dosBox.setVisible(true);
			tresBox.setVisible(true);
			cuatroBox.setVisible(true);
			cincoBox.setVisible(true);
			seisBox.setVisible(true);
			sieteBox.setVisible(true);
			ochoBox.setVisible(true);
			nueveBox.setVisible(true);
			diezBox.setVisible(true);
			unoBox.getText();
			dosBox.getText();
			tresBox.getText();
			cuatroBox.getText();
			cincoBox.getText();
			seisBox.getText();
			sieteBox.getText();
			ochoBox.getText();
			nueveBox.getText();
			diezBox.getText();
			textoNombre.setVisible(true);
			textoID.setVisible(true);

		}
		if (almuerzo.isSelected()) {
			contenido = almuerzo.getText();
			unoBox.setVisible(false);
			dosBox.setVisible(false);
			tresBox.setVisible(false);
			cuatroBox.setVisible(false);
			cincoBox.setVisible(false);
			seisBox.setVisible(false);
			sieteBox.setVisible(false);
			ochoBox.setVisible(false);
			nueveBox.setVisible(false);
			diezBox.setVisible(false);
			unoBox.setText("frijol");
			dosBox.setText("lenteja");
			tresBox.setText("arroz");
			cuatroBox.setText("carne");
			cincoBox.setText("pollo");
			seisBox.setText("cerdo");
			sieteBox.setText("papa");
			ochoBox.setText("platano");
			nueveBox.setText("ensalada fria");
			diezBox.setText("ensalada caliente");
			unoBox.setVisible(true);
			dosBox.setVisible(true);
			tresBox.setVisible(true);
			cuatroBox.setVisible(true);
			cincoBox.setVisible(true);
			seisBox.setVisible(true);
			sieteBox.setVisible(true);
			ochoBox.setVisible(true);
			nueveBox.setVisible(true);
			diezBox.setVisible(true);
			textoNombre.setVisible(true);
			textoID.setVisible(true);
			
		}
		if (sena.isSelected()) {
			contenido = sena.getText();
			unoBox.setVisible(false);
			dosBox.setVisible(false);
			tresBox.setVisible(false);
			cuatroBox.setVisible(false);
			cincoBox.setVisible(false);
			seisBox.setVisible(false);
			sieteBox.setVisible(false);
			ochoBox.setVisible(false);
			nueveBox.setVisible(false);
			diezBox.setVisible(false);
			unoBox.setText("agua de panela");
			dosBox.setText("gaseosa");
			tresBox.setText("calentillo");
			cuatroBox.setText("perro caliente");
			cincoBox.setText("empanada");
			seisBox.setText("pizza");
			sieteBox.setText("jugo natural");
			ochoBox.setText("papas de paquete");
			nueveBox.setText("dulces");
			diezBox.setText("helado");
			unoBox.setVisible(true);
			dosBox.setVisible(true);
			tresBox.setVisible(true);
			cuatroBox.setVisible(true);
			cincoBox.setVisible(true);
			seisBox.setVisible(true);
			sieteBox.setVisible(true);
			ochoBox.setVisible(true);
			nueveBox.setVisible(true);
			diezBox.setVisible(true);
			textoNombre.setVisible(true);
			textoID.setVisible(true);
		
		}
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() instanceof JRadioButton) {
			eventoRadiobutton();
		}
		if (e.getSource() instanceof JCheckBox) {

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		seleccionCheck();
		variable = textoNombre.getText();
		variableDos = textoID.getText();
		eventComidas.recibirDatosComidas(variable,variableDos);
		// JOptionPane.showMessageDialog(null,variable+variableDos+variableTres+variableCuatro+variableCinco+variSeis+variSiete+variOcho+variNueve+variDiez);
	}

	public void respuestaMenu(String mensajeRespuestaaCafeteria) {
		
//		JOptionPane.showMessageDialog(null, mensajeRespuestaaCafeteria);
	}
	public void respuestaCliente(String respuesta) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, respuesta);
	}
	//METODOS GET  Y SET
	public CustomEvent getEventComidas() {
		return eventComidas;
	}

	public void setEventComidas(CustomEvent eventComidas) {
		this.eventComidas = eventComidas;
	}

	

}
