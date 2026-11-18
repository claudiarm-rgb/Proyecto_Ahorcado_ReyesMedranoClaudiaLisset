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
	
	public void llenarArchivoConPalabras(String[]Palabras, String ruta) {
		
		for(int i=1; i<Palabras.length; i++) {
			String clave=Palabras[i];
			int j=i-1;
			
			while(j>=0 && Palabras[j].compareToIgnoreCase(clave)>0) {
				
				Palabras[j+1]=Palabras[j];
				j=j-1;
			}
			Palabras[j+1]=clave;
		}
		
		try(BufferedReader br=new BufferedReader(new FileReader(ruta))){
			
			
			
		}catch(FileNotFoundException e) {
			
		}catch(IOException e) {
			
		}
	}
	
	public void borrarArchivo() {
		
		
	}
}
