
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
	  
	         
	        
	public static void main(String[] args) {
		
		File caminho = new File("C:\\Users\\RyXan\\Desktop\\Arquivo.html");
		
		String html = "";
		
		
		try {
				

				Document documentoSoup = Jsoup.connect("https://ksilaudo.paineldeconsultas.com.br/rdrv2/consulta/215F48EFA5421A51598615461A7FLPOIRCD2KM599V2BS1DDCV").get();
		
				html = documentoSoup.toString();
				
				BufferedWriter bw = new BufferedWriter(new FileWriter(caminho));
				
				bw.write(html);
				bw.close();
				
				System.out.println("A extração foi feita com sucesso! ");
				
				
		} catch (IOException e) {
			e.getMessage();
			System.out.println("Site indisponinvel ou requisição não aceita");
		} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
