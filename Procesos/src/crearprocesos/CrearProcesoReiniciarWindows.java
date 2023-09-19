package crearprocesos;

import java.io.IOException;

public class CrearProcesoReiniciarWindows {
	
	public void getProceso() throws IOException, InterruptedException {
		
		String[] comando = {"shutdown", "-r", "-t" , "5"};
		
		ProcessBuilder pb = new ProcessBuilder(comando);
		
		pb.redirectErrorStream(true);
		
		Process p = pb.start();
		
		System.out.println("El PID del proceso es:"+p.pid());
		
		int exitValue = p.waitFor();
		
		if(exitValue == 0)
			System.out.println("Proceso ejecutado correctamente");
		
	}

}
