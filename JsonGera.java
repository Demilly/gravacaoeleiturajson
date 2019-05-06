import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class JsonGera {

	public static void main(String[] args) throws IOException {

		Gson gsonGera = new Gson();

		try {

			BufferedReader br = new BufferedReader(new FileReader("CervejaTeste.json"));
			while (br.ready()) {
				String linhaAlinhaDoArquivoVaiLer = br.readLine();
				System.out.println(linhaAlinhaDoArquivoVaiLer);
			}

		} catch (FileNotFoundException e) {
			System.out.println("errou");

		}
	}
}
