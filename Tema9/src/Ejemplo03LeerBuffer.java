import java.io.*;
public class Ejemplo03LeerBuffer {

	
	
	public static void main(String[] args) {
		
		try {
		FileInputStream archivo = new FileInputStream("ficheros/archivo1.txt");
		BufferedInputStream buffer = new BufferedInputStream(archivo);
		boolean eof = false;
		int byteLeido = 0;
		while (!eof) {
			byteLeido=buffer.read();
			if (byteLeido == -1) {
				eof = true;
			}else {
				System.out.println(byteLeido + " ");
			}
		}
		
		buffer.close();
		
		}catch(IOException e) {
			System.out.println("Error : ");
			e.printStackTrace();
		}
		
	}

}
