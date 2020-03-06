import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
	private char mode;
	private BufferedReader reader;
	private BufferedWriter writer;
	public File(String filename, char mode) throws IOException {
		this.mode = 'R';
		if (mode == 'W' || mode == 'w') {
			this.mode = 'W';
			writer = new BufferedWriter(new FileWriter(filename));
		}
		else {
			reader = new BufferedReader(new FileReader(filename));
		}
	}
	public void toFile (String line) throws FileException,IOException {
		if (this.mode == 'R') throw new FileException("Read-only"+"file!");	
		writer.write(line);
		writer.newLine();
	}
	
	public String fromFile() throws FileException,IOException {
		String app;
		if (this.mode == 'W') throw new FileException("Write-only"+"file!");
		app = reader.readLine();
	//	System.out.println(app);
		if (app == null) throw new FileException("End of File");
		if (app.contains(";") || app.contains("13")) { //13=RETURN
			reader.readLine();
		}
		return app;
	}
	
	public void close() throws IOException {
		if (this.mode == 'W') 
			writer.close();
		else
			reader.close();
	}
	
	public void Scrivi(String nomeFile, Listaprodotti media){
	    try {
	        BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile));
	        writer.write("" + media);
	        writer.close();
	    } catch (IOException ex) {
	        System.out.println("OPS!! QUALCOSA E' ANDATO STORTO RIPROVARE PIU' TARDI");
	    }
	}
}
