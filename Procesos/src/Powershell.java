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

public class Powershell {

	public void getProceso() throws IOException {
		
		JFrame frame = new JFrame();
		frame.setSize(800,500);
		JTextArea areaTxt = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(areaTxt);
		scrollPane.setSize(scrollPane.getSize());
		areaTxt.setEditable(true);
		areaTxt.setBackground(Color.blue);
		areaTxt.setForeground(Color.white);
		areaTxt.setFont(new Font("Arial", Font.BOLD, frame.getHeight() / 30));
		frame.add(scrollPane);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		String ibm850 = "ibm850";
		String pws = "powershell";
		String commandHelp = "help";
		
		Process proceso = new ProcessBuilder(pws, commandHelp).redirectErrorStream(true).start();
		
		InputStream inputStream = proceso.getInputStream();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream, ibm850));
		var lines = br.lines();
		areaTxt.append( lines.collect(Collectors.joining("\n")));
		frame.setVisible(true);
	}
}
