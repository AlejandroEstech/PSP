import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ListarDirectorio {
	
	public void crearProceso() throws IOException, InterruptedException {
		
		ProcessBuilder pb = new ProcessBuilder("CMD" , "/C" , "DIR");
		pb.redirectErrorStream(true);
		
		Process p =  pb.start();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		
		String linea = "";
		
		while( (linea = br.readLine()) != null) {
			System.out.println(linea);
		}
		
		int exitValue = p.waitFor();
		
		if(exitValue == 0) {
			System.out.println("El proceso se ha ejecutado correctamente");
		}
		
		
		
		
		
		
		
	}

}
