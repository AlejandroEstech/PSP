import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException , InterruptedException{
		
		
		//CrearProcesoRuntime crearProcesoRuntime = new CrearProcesoRuntime();
		//crearProcesoRuntime.getProceso();
		
		//CrearProcesoProcessBuilder crearProcesoProcessBuilder = new CrearProcesoProcessBuilder();
		//crearProcesoProcessBuilder.getProceso();
		
		//ListarDirectorio listarDirectorio = new ListarDirectorio();
		//listarDirectorio.crearProceso();
		
		//CrearCarpeta carpeta = new CrearCarpeta();
		//carpeta.getProceso();
		
		//ReiniciarWindows reiniciarWindows = new ReiniciarWindows();
		//reiniciarWindows.getProceso();
		
		Powershell powershell = new Powershell();
		powershell.getProceso();
	

	}

}
