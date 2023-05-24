package model;

/*
 * JAIME MARROQUIN
 * PROYECTO TRANSPORTES(POO)
 */
import javax.swing.JOptionPane;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Terminal {
	// DECLARACION DE VARIABLES
	private int suma;
	private String mensaje;
	private String fechaString;

	// METODO CONSTRUCTOR
	public Terminal() {
		obtenerHoraFecha();

	}

	// METODOS PROPIOS
	public void datosRecibidos(String nombreString, String iDString, String empresa, String vehiculoString,
			String municipio, String destinoOrigenString, String destinoFinalString, Integer valor) {
		if(municipio.equals("boyaca")){
			if (destinoOrigenString.equalsIgnoreCase("tunja") && destinoFinalString.equalsIgnoreCase("chivata")
					|| destinoOrigenString.equalsIgnoreCase("chivata") && destinoFinalString.equalsIgnoreCase("tunja")) {
				suma = 6500 * valor;
				mensaje = "\n nombre del cliente= " + nombreString + "\nidentificacion del cliente= " + iDString
						+ "\n empresa tranportadora= " + empresa + "\nplaca del veiculo= " + vehiculoString + "\ntramo= "
						+ destinoOrigenString + "-" + destinoFinalString + "\nnuemro de pasajeros= " + valor + "\n";
			} else {
				if (destinoOrigenString.equalsIgnoreCase("tunja") && destinoFinalString.equalsIgnoreCase("chiquiza")
						|| destinoOrigenString.equalsIgnoreCase("chiquiza")
						&& destinoFinalString.equalsIgnoreCase("tunja")) {
					suma = 5000 * valor;
					mensaje = "\nnombre del cliente= " + nombreString + "\nidentificacion del cliente= " + iDString
							+ "\n empresa tranportadora= " + empresa + "\nplaca del veiculo= " + vehiculoString
							+ "\ntramo= " + destinoOrigenString + "-" + destinoFinalString + "\nnuemro de pasajeros= "
							+ valor + "\n";
					JOptionPane.showMessageDialog(null, mensaje);
				} else {
					if (destinoOrigenString.equalsIgnoreCase("tunja") && destinoFinalString.equalsIgnoreCase("combita")
							|| destinoOrigenString.equalsIgnoreCase("combita")
							&& destinoFinalString.equalsIgnoreCase("tunja")) {
						suma = 7000 * valor;
						mensaje = "\nnombre del cliente= " + nombreString + "\nidentificacion del cliente= " + iDString
								+ "\n empresa tranportadora= " + empresa + "\nplaca del veiculo= " + vehiculoString
								+ "\ntramo= " + destinoOrigenString + "-" + destinoFinalString + "\nnuemro de pasajeros= "
								+ valor + "\n";
					} else {
						if (destinoOrigenString.equalsIgnoreCase("tunja") && destinoFinalString.equalsIgnoreCase("cucaita")
								|| destinoOrigenString.equalsIgnoreCase("cucaita")
								&& destinoFinalString.equalsIgnoreCase("tunja")) {
							suma = 5500 * valor;
							mensaje = "\nnombre del cliente= " + nombreString + "\nidentificacion del cliente= " + iDString
									+ "\n empresa tranportadora= " + empresa + "\nplaca del veiculo= " + vehiculoString
									+ "\ntramo= " + destinoOrigenString + "-" + destinoFinalString
									+ "\nnuemro de pasajeros= " + valor + "\n";
						} else {
							if (destinoOrigenString.equalsIgnoreCase("chiquiza")
									&& destinoFinalString.equalsIgnoreCase("chivata")
									|| destinoOrigenString.equalsIgnoreCase("chivata")
									&& destinoFinalString.equalsIgnoreCase("chiquiza")) {
								suma = 8000 * valor;
								mensaje = "\nnobre del cliente= " + nombreString + "\nidentificacion del cliente= "
										+ iDString + "\n empresa tranportadora= " + empresa + "\nplaca del veiculo= "
										+ vehiculoString + "\ntramo= " + destinoOrigenString + "-" + destinoFinalString
										+ "\nnuemro de pasajeros= " + valor + "\n";
							} else {
								if (destinoOrigenString.equalsIgnoreCase("chiquiza")
										&& destinoFinalString.equalsIgnoreCase("combita")
										|| destinoOrigenString.equalsIgnoreCase("combita")
										&& destinoFinalString.equalsIgnoreCase("chiquiza")) {
									suma = 9000 * valor;
									mensaje = "\nnobre del cliente= " + nombreString + "\nidentificacion del cliente= "
											+ iDString + "\n empresa tranportadora= " + empresa + "\nplaca del veiculo= "
											+ vehiculoString + "\ntramo= " + destinoOrigenString + "-" + destinoFinalString
											+ "\nnuemro de pasajeros= " + valor + "\n";
								} else {
									if (destinoOrigenString.equalsIgnoreCase("chiquiza")
											&& destinoFinalString.equalsIgnoreCase("cucaita")
											|| destinoOrigenString.equalsIgnoreCase("cucaita")
											&& destinoFinalString.equalsIgnoreCase("chiquiza")) {

									} else {
										if (destinoOrigenString.equalsIgnoreCase("chivata")
												&& destinoFinalString.equalsIgnoreCase("combita")
												|| destinoOrigenString.equalsIgnoreCase("combita")
												&& destinoFinalString.equalsIgnoreCase("chivata")) {

										} else {
											if (destinoOrigenString.equalsIgnoreCase("chivata")
													&& destinoFinalString.equalsIgnoreCase("cucaita")
													|| destinoOrigenString.equalsIgnoreCase("cucaita")
													&& destinoFinalString.equalsIgnoreCase("chivata")) {

											} else {
												if (destinoOrigenString.equalsIgnoreCase("combita")
														&& destinoFinalString.equalsIgnoreCase("cucaita")
														|| destinoOrigenString.equalsIgnoreCase("cucaita")
														&& destinoFinalString.equalsIgnoreCase("combita")) {

												} else {
													if (destinoOrigenString.equalsIgnoreCase("alban")
															&& destinoFinalString.equalsIgnoreCase("anapoima")
															|| destinoOrigenString.equalsIgnoreCase("anapoima")
															&& destinoFinalString.equalsIgnoreCase("alban")) {

													} else {
														if (destinoOrigenString.equalsIgnoreCase("alban")
																&& destinoFinalString.equalsIgnoreCase("anolaima")
																|| destinoOrigenString.equalsIgnoreCase("anolaima")
																&& destinoFinalString.equalsIgnoreCase("alban")) {

														} else {
															if (destinoOrigenString.equalsIgnoreCase("alban")
																	&& destinoFinalString.equalsIgnoreCase("caqueza")
																	|| destinoOrigenString.equalsIgnoreCase("caqueza")
																	&& destinoFinalString
																	.equalsIgnoreCase("alban")) {

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
		}else {
//			mensaje="ruta no seleccionada";
		}
	}

	public String obtenerHoraFecha() {
		Date fechayHora = new Date();
		SimpleDateFormat formato = new SimpleDateFormat();
		fechaString = formato.format(fechayHora);

		return fechaString;
	}

	// METODOS GET Y SET
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
