package model;

import javax.swing.JOptionPane;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Terminal {

	private int suma;
	private String mensaje;
	private String fechaString;

	public Terminal() {
		obtenerHoraFecha();
	}

	public void datosRecibidos(String nombreString, String iDString, String empresa, String vehiculoString,
			String municipio, String destinoOrigenString, String destinoFinalString, Integer valor) {
		if (municipio.equalsIgnoreCase("boyaca")) {
			//			JOptionPane.showMessageDialog(null,municipio);
			//			JOptionPane.showMessageDialog(null,destinoOrigenString);
			//			JOptionPane.showMessageDialog(null,destinoFinalString);
			if (destinoOrigenString.equalsIgnoreCase("tunja") && destinoFinalString.equalsIgnoreCase("chiquiza")
					|| destinoOrigenString.equalsIgnoreCase("chiquiza")
					&& destinoFinalString.equalsIgnoreCase("tunja")) {
				suma = 5000 * valor;
				setMensaje("\nnobre del cliente= " + nombreString + "\nidentificacion del cliente= " + iDString
						+ "\n empresa tranportadora= " + empresa + "\nplaca del veiculo= " + vehiculoString + "\ntramo= "
						+ destinoOrigenString + "-" + destinoFinalString + "\nnuemro de pasajeros= " + valor+"\n");
				JOptionPane.showMessageDialog(null, suma);
			}

		}
	}

	public String obtenerHoraFecha() {
		Date fechayHora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat();
		fechaString=formato.format(fechayHora);
		
		return fechaString;
	}

	public int getSuma() {
		return suma;
	}

	public void setSuma(int suma) {
		this.suma = suma;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

}
