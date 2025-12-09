package criandoarquivo;

import java.io.File;
import java.util.Scanner;

public class LerArquivos {

	public static void main(String[] args) {
		File meuArquivo = new File("Arquivo.txt");
		
		try (Scanner lerDados = new Scanner(meuArquivo)){
			
			while (lerDados.hasNextLine()) {
				String data = lerDados.nextLine();
				System.out.println(data);				
			}
			
		} catch (Exception e) {
			System.out.println("Erro ao ler o arquivo.");
			e.printStackTrace();
		}

	}

}
