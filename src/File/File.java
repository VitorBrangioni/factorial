package File;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;

/**
 * Class for management a File
 * 
 * @author vitorbrangioni
 *
 */
public class File {

	private InputStream is;
	private InputStreamReader isr;
	private BufferedReader br;
	
	private String file;
	
	public File(String file) {
		this.setFile(file);
		init();
	}
	/**
	 * Prepare file for management
	 */
	private void init() {
		try {
			this.is = new FileInputStream(getFile());
			this.isr = new InputStreamReader(this.is);
			this.br = new BufferedReader(isr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Reads and returns all everything that is written in the file
	 * 
	 * @return String with all file lines
	 */
	public String readFile() {
		String allLines = "";
		try {
			String line = this.br.readLine();
			
			while(line != null) {
				allLines += line;
				line = this.br.readLine();
			}
			this.br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return allLines;
	}
	
	/**
	 * @return file String
	 */
	public String getFile() {
		return file;
	}

	/**
	 * Alter file string
	 * @param file
	 */
	@SuppressWarnings("unused")
	public void setFile(String file) {
		if(file.isEmpty() && file == null) {
			throw new InvalidParameterException("It's not possible create a File without your name");
		}
		this.file = file;
	}
}
