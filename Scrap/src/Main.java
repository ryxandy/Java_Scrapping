
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Main {
	  
	         
	        
	public static void main(String[] args) {
		
		File caminho = new File("Aqui você coloca o caminho e extensão que deseja salvar o arquivo");
		String html = "";
		
		try {
				Document documentoSoup = Jsoup.connect("Aqui você coloca a URl a qual deseja extrair o código fonte ").get();	
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
