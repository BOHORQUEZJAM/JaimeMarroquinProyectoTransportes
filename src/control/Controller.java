package control;

import java.util.Date;

import javax.swing.JOptionPane;

import model.Terminal;

import view.CustomEvent;
import view.CustomEventResponce;
import view.IOManager;

public class Controller implements CustomEvent{
	private Terminal objetotTerminal;
private CustomEventResponce objetoResponce;
	public Controller() {
		// TODO Auto-generated constructor stub
		objetotTerminal = new Terminal();
	}
	public void init () {
		IOManager objetoIoManager = new IOManager();
		objetoIoManager.setVisible(true);
	}
	@Override
	public void datosObtenidos(String nombreString, String iDString, String empresa, String vehiculoString,String municipio,
			String destinoOrigenString, String destinoFinalString, Integer valor) {
		objetotTerminal.datosRecibidos(nombreString,iDString,empresa,vehiculoString,municipio,destinoOrigenString,destinoFinalString,valor);
		int precio = objetotTerminal.getSuma();
		String mensaje = objetotTerminal.getMensaje();
		String fecha = objetotTerminal.obtenerHoraFecha();
		objetoResponce.recibirRespuestas(precio,mensaje,fecha);
//		String respuesta = objetotTerminal.mesajeRespuesta();
//		eventoResponce.recibirRespuesta(respuesta);
		
	}
	public CustomEventResponce getObjetoResponce() {
		return objetoResponce;
	}
	public void setObjetoResponce(CustomEventResponce objetoResponce) {
		this.objetoResponce = objetoResponce;
	}
	

}
