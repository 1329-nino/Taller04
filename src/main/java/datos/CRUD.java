package datos;

import java.io.*;
import java.util.ArrayList;

public class CRUD {

	public static File crear(String ruta) {
		var archivo = new File(ruta);
		try {

			if(!archivo.exists()) {
				if (!archivo.createNewFile()) {
					throw new IOException();
				}
			}
		} catch (IOException e) {
			System.err.println("Fallo al crear el archivo: " + e.getMessage());
			return null;
		}
		return archivo;
	}

	public static ArrayList<String> leer(File archivo) {

		var informacion = new ArrayList<String>();
		String[] lineas;
		String cadena;

		try {
			if (!archivo.exists()) {
				throw new FileNotFoundException();
			}

			var lector = new BufferedReader(new FileReader(archivo));

			while ((cadena = lector.readLine()) != null) {
				lineas = cadena.split("\n");
				informacion.add(lineas[0]);
			}

			lector.close();

		} catch (FileNotFoundException e) {
			System.err.println("No se ha encontrado el archivo: " + e.getMessage());
			return null;
		} catch (IOException e) {
			System.err.println("Fallo al leer el archivo: " + e.getMessage());
		}

		return informacion;
	}

	public void actualizar() {
		throw new UnsupportedOperationException();
	}



}