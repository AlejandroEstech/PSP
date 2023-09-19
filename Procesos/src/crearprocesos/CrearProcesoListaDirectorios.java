package crearprocesos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CrearProcesoListaDirectorios {
	
	public void getProceso() throws IOException, InterruptedException {
		
		ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "dir");
		pb.redirectErrorStream(true);
		
		Process p = pb.start();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		
		String line = "";
		
		while( (line = br.readLine())!= null) {
			System.out.println(line);	
		}
		
		int exitValue = p.waitFor();
		
		if(exitValue == 0) 
			System.out.println("Proceso ejecutado correctamente");
		
		
		
		
		
		
		
	}
	
	

}
