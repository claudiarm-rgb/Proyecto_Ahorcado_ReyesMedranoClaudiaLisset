import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;

public class Archivo {
	
	
	public boolean verificarArchivo() {
	
		boolean vacio=true;
		String ruta="src/Palabras.txt";
		File archivo=new File(ruta);
		String linea;
		
		try(BufferedReader br=new BufferedReader(new FileReader(archivo))){
			
			if((linea=br.readLine())!=null) {
				vacio=false;
			}
			
		}catch(FileNotFoundException e){
			System.out.println("No se encontro el archivo");
		}catch(IOException e){
			System.out.println("Ocurrio un error con el archivo");
		}
		return vacio;
	}
	
	public void llenarArchivoConPalabras(String Palabra) {
		
		
	}
	
	public void borrarArchivo() {
		
		
	}
}
