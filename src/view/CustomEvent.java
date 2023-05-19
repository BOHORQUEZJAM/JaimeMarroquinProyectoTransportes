package view;

public interface CustomEvent {
	public void datosObtenidosVentas(String nombreString, String iDString, String empresa, String vehiculoString,
			String destinoOrigenString, String destinoFinalString, String municipio, Integer valor);
	public void recibircheck(String contenido);
	public void recibirDatosComidas(String variable, String variableDos);
	
}
