
public class CrearProcesoRuntime {
	
	
	public void getProceso() {
		
		String rutaChrome = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		
		try {
			Process p = Runtime.getRuntime().exec(rutaChrome);
			
			System.out.println("El identificador del proceso es " + p.pid());
			System.out.println(p.info().startInstant());
			System.out.println("El proceso toma " + p.info().totalCpuDuration().get().getNano()+" ns " + "de tiempo en CPU" );
			
			
		}catch (Exception e) {
			 System.out.println(e.getMessage());
		}
		
	}

}
