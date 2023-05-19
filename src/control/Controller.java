package control;

import java.util.Date;

import javax.swing.JOptionPane;


import model.CafeteriaTerminal;
import model.Terminal;

import view.CustomEvent;
import view.CustomEventResponce;
import view.IOManager;

public class Controller implements CustomEvent{
	private Terminal objetotTerminal;
	private CafeteriaTerminal objetoCafeteriaTerminal;
private CustomEventResponce objetoResponce;
private Archivos objetoArchivos;
	public Controller() {
		// TODO Auto-generated constructor stub
		objetoArchivos = new Archivos();
		objetotTerminal = new Terminal();
		objetoCafeteriaTerminal= new CafeteriaTerminal();
	}
	@Override
	public void datosObtenidosVentas(String nombreString, String iDString, String empresa, String vehiculoString,
			String destinoOrigenString, String destinoFinalString, String municipio, Integer valor) {
		objetotTerminal.datosRecibidos(nombreString,iDString,empresa,vehiculoString,municipio,destinoOrigenString,destinoFinalString,valor);
		int precio = objetotTerminal.getSuma();
		String mensaje = objetotTerminal.getMensaje();
		String fecha = objetotTerminal.obtenerHoraFecha();
		objetoResponce.recibirRespuestas(precio,mensaje,fecha);
		objetoArchivos.crearFactura(nombreString,iDString,empresa,vehiculoString,destinoOrigenString,destinoFinalString,municipio,valor,precio,fecha,mensaje);
	}
	@Override
	public void recibircheck(String contenico) {
		// TODO Auto-generated method stub
		String mensajeRespuestaaCafeteria = objetoCafeteriaTerminal.menuSeleccionado(contenico);
		objetoResponce.recibirResCafeteria(mensajeRespuestaaCafeteria);
	}
	@Override
	public void recibirDatosComidas(String variable, String variableDos) {
		// TODO Auto-generated method stub
		String respuesta =objetoCafeteriaTerminal.datosCafeteria(variable,variableDos);
		objetoResponce.respuestaCliente(respuesta);
	}
	
	public void init () {
		IOManager objetoIoManager = new IOManager();
		objetoIoManager.setVisible(true);
		
	}
	
	
	public CustomEventResponce getObjetoResponce() {
		return objetoResponce;
	}
	public void setObjetoResponce(CustomEventResponce objetoResponce) {
		this.objetoResponce = objetoResponce;
	}
	
	
}
