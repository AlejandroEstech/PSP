package crearprocesos;
import java.io.IOException;

public class CrearProcesoProcessBuilder {
	
	
	public void getProceso() throws IOException, InterruptedException {
		
		ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Google\\\\Chrome\\Application\\chrome.exe");
		Process p =  pb.start();
		
		System.out.println("El identificador del proceso es " + p.pid());
		
		int valorSalida = p.waitFor();
		
		if(valorSalida == 0) {
			System.out.println("El proceso se ha ejecutado correctamente");
		}
	
	
		
	}

}
