import java.io.IOException;

public class ReiniciarWindows {
	
	
	public void getProceso() throws IOException, InterruptedException {
		
		String[] comando = {"shutdown" , "-r" ,"-t", "5"};
		
		ProcessBuilder pb = new ProcessBuilder(comando);
		
		Process p = pb.start();
		
	
		System.out.println("El identificador del proceso es " + p.pid());
		
		
		if(p.waitFor() == 0) {
			System.out.println("El proceso se ha ejecutado correctamente");
		
		}
	}

}
