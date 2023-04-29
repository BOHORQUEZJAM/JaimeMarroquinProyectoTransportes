package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.TitledBorder;

public class PanelVentas extends JPanel implements ActionListener,ItemListener{
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
	public PanelVentas(JScrollPane scrollPane) {
		setBorder(new TitledBorder(null,"tiquetes",TitledBorder.CENTER,TitledBorder.TOP,null,java.awt.Color.BLUE));
		setBackground(Color.white);
		setLayout(null);

		String lista []= {"   ","boyaca","cundinamarca","santander","tolima","antioquia","meta","valle del cauca","nariño"};
		etiquetaNombre = new JLabel("ingrese el nombre del cliente");
		etiquetaNombre.setBounds(10,50,200,25);
		add(etiquetaNombre);
		textoNombre = new JTextField("nombre");
		textoNombre.setBounds(10,70,150,30);
		add(textoNombre);
		etiquetaID= new JLabel("ingrese el id del cliente ");
		etiquetaID.setBounds(10,90,200,25);
		add(etiquetaID);
		textoID = new JTextField("id");
		textoID.setBounds(10,110,100,30);
		add(textoID);
		etiquetaEmpresa = new JLabel("elija la empresa");
		etiquetaEmpresa.setBounds(10,140,150,30);
		add(etiquetaEmpresa);
		empresaTranporte = new JComboBox();
		empresaTranporte.setBounds(10,170,120,30);
		add(empresaTranporte);
		etiquetaDestinoDepartamento= new JLabel("elija el destino del cliente ");
		etiquetaDestinoDepartamento.setBounds(10,200,200,25);
		add(etiquetaDestinoDepartamento);
		destinoDepartamento = new JComboBox(lista);
		destinoDepartamento.setBounds(10,235,120,30);
		destinoDepartamento.setSelectedItem(new JScrollPane());
		destinoDepartamento.setSelectedIndex(0);
		destinoDepartamento.addActionListener(this);
		destinoDepartamento.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		add(destinoDepartamento);
		etiquetaPasajeros = new JLabel("ingrese numero de pasajeros");
		etiquetaPasajeros.setBounds(10,300,200,25);
		add(etiquetaPasajeros);
		SpinnerNumberModel  valor  = new  SpinnerNumberModel(0,0,20,1);
		numPasajeros = new JSpinner(valor);
		numPasajeros.setBounds(10,320,50,25);
		add(numPasajeros);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("este es un mensaje nuevo");
	}
	@Override
	public void itemStateChanged(ItemEvent evento) {
		// TODO Auto-generated method stub
		if (evento.getStateChange()==ItemEvent.SELECTED) {
			
		}
	}

}
