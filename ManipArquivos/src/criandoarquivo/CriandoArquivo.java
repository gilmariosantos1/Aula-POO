package criandoarquivo;

import java.io.File;
import java.io.FileWriter;

public class CriandoArquivo {

	public static void main(String[] args) {
		try {
			File arquivo = new File("D:\\Gilmario\\UC 7 - Back-end\\Arquivo_dir_Gil.txt");
			FileWriter lerArquivo = new FileWriter("Arquivo.txt");
			
			if(arquivo.createNewFile()) {
				System.out.println("Arquivo criado: " + arquivo.getName());
				
			}else {
				System.out.println("O arquivo já existe!");
			}
			
			if(arquivo.exists()) {
				lerArquivo.write("Gravando dados no arquivo");
				lerArquivo.close();
			}else {
				System.out.println("Erro ao escrever no arquivo");
			}
		} catch (Exception e) {
			System.out.println("Erro ao criar o arquivo");
			e.printStackTrace();
		}

	}

}
