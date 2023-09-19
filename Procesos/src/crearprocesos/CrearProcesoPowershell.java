package crearprocesos;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class CrearProcesoPowershell {
	
	public void getProceso() throws IOException {
		
		// Creación de la ventana
		JFrame frame = new JFrame();
		
		//Damos tamaño a la ventana
		frame.setSize(800,500);
		
		//Creamos un área de texto
		JTextArea areaText = new JTextArea();
		
		//Creamos un panel tipo scroll y lo ponemos el area de texto
		JScrollPane scrollPane = new JScrollPane(areaText);
		
		// Actualizamos el tamaño del panel de scroll en función del scroll
		scrollPane.setSize(scrollPane.getSize());
		
		// Hacemos editable el ára de texto
		areaText.setEditable(true);
		
		// Damos un color de fondo al área de texto
		areaText.setBackground(Color.blue);
		
		// Damos un color de texto al área de texto
		areaText.setForeground(Color.white);
		
		// Damos un tipo de fuente al área de texto y lo hacemos en relación al tamaño de la ventana
		areaText.setFont(new Font("Arial", Font.BOLD, frame.getHeight() / 30));
		
		//Añadimos el panel de scroll a la ventana
		frame.add(scrollPane);
		
		// Hacemos que cuando se cierre la ventana, se cierre el programa
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		// Ponemos la ventana en el centro de la pantalla del pc
		frame.setLocationRelativeTo(null);
		
		// Declaración de variables
		String ibm850 = "ibm850";
		String pws = "poweshell";
		String commandHelp = "help";
		
		// Creamos el proceso
		Process process = new ProcessBuilder(pws, commandHelp).redirectErrorStream(true).start();
		
		// Almacenamos el flujo de bytes del proceso
		InputStream inputStream = process.getInputStream();
		
		// Creamos un lector para almacenar flujos en el buffer
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, ibm850));
		
		//Obtenemos todas las líneas del buffer
		var lines = br.lines();
		
		// Añadimos las líneas al área de texto
		areaText.append( lines.collect(Collectors.joining("\n")));
		
		// Hacemos visible la ventana
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
				
		
		
		
		
	}

}
