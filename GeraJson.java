import java.io.FileWriter;

import com.google.gson.Gson;

public class GeraJson {

	public static void main(String[] args) {

		Cerveja skol = new Cerveja();
		skol.setAno(2019);
		skol.setMalte("Puro Malte");
		skol.setMarca("SKOL");
		skol.setNome("Skol Ice Blue Red");

		Gson gson = new Gson();
		String cervejaJson = gson.toJson(skol);

		System.out.println(cervejaJson);

		try {
			FileWriter fw = new FileWriter("CervejaTeste.json");
			fw.write(cervejaJson);
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		{

		}
	}
}
