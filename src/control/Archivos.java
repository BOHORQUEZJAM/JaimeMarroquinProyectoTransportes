package control;
/*
 * JAIME MARROQUIN
 * PROYECTO TRANSPORTES(POO)
 */
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class Archivos {
	private File objetoFile;

	private BufferedWriter escribir;

	public  String crearFactura(String nombreString, String iDString, String empresa, String vehiculoString, String destinoOrigenString, String destinoFinalString, String municipio, Integer valor, int precio, String fecha, String mensaje) {
		objetoFile = new File("src\\CarpetaFacturas\\Fact.txt");

		if (objetoFile.exists()) {
			String nombreArchivo=objetoFile.getName();
    		String ruta=objetoFile.getAbsolutePath();
    		long peso=objetoFile.length();
    		System.out.println(nombreArchivo);
    		System.out.println(ruta);
    		System.out.println(peso + " bytes");
		} else {
			String ruta = "src\\CarpetaFacturas\\FACTURA.txt";
			objetoFile = new File(ruta);
		}
		try {
			escribir=new BufferedWriter(new FileWriter(objetoFile));
			escribir.write("-----------------------"+empresa+"------------------------------");
			escribir.newLine();
			escribir.write("-------------------------------------fecha"+fecha+"---------------------------------\n");
			escribir.write("---------------------------------------------------------------------------------\n");
			escribir.write("                                                                              \n");
			escribir.write("                     Datos del inscrito                                        \n");
			escribir.write("-----------------------------nombres y apellidos--------------------------------\n");
			escribir.write("------------------------"+nombreString+  "-------------------------------------\n");
			escribir.write("numero de identipicacion-----------"+iDString+"------------------------------------------------\n");
			escribir.write("-------------------------------vehiculo y placa:"+vehiculoString+"--------------------------------------\n");
			escribir.write("-----------------------------------"+destinoOrigenString+"--------------------------------------------\n");
			escribir.write("--------------------------------------------"+destinoFinalString+"--------------------------------------------------\n");
			escribir.write("---------------------------------------"+valor+"-------------------------------------------------------------\n");
			escribir.write("----------------------------------------"+precio+"-------------------------------------------------");
			escribir.write("-----------------------------------"+mensaje+"--------------------------------------------");
			escribir.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			JOptionPane.showMessageDialog(null,"no  se creo elaarchivo");
		}
		return null;
	}
}
