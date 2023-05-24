package model;
/*
 * JAIME MARROQUIN
 * PROYECTO TRANSPORTES(POO)
 */
public class CafeteriaTerminal  {
	private String mensajeCafeteria;
	private String respuesta;
	public CafeteriaTerminal() {
		// TODO Auto-generated constructor stub
	}
	public String menuSeleccionado(String contenico) {
		return mensajeCafeteria=contenico;
	}
	public String datosCafeteria(String variable, String variableDos) {
		respuesta="señor "+variable+"  su pedido  es:"+mensajeCafeteria;
		return respuesta;
	}
}
