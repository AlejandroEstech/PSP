
public class CrearCarpeta {
	
	public void getProceso() {
		
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C" , "MD", "ejemplo");
		
		try {
			
			Process p =  pb.start();
			
			if(p.waitFor() == 0) {
				System.out.println("Proceso creado satisfactoriamente");
			}
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}

}
