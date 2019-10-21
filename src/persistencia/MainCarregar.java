package persistencia;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MainCarregar {

	public static void main(String[] args) throws FileNotFoundException, ParseException { 
		List<Pessoa> pessoa = new ArrayList<Pessoa>();
		GravarCSV csv = new GravarCSV();
		//JSON json = new JSON();
		//XML xml = new XML();
		Persistencia pers = new Persistencia(csv);
		 pessoa = (ArrayList<Pessoa>)pers.ler();
		 
		 System.out.println(pessoa);
	}

}
