package persistencia;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class JSON implements Gravacao {

	public List<Pessoa> ler() throws ParseException, FileNotFoundException{
		GsonBuilder builder = new GsonBuilder();
		Gson gson = builder.create();
		BufferedReader bufferedReader = new BufferedReader(new FileReader("agenda.json"));

		    Type listType = new TypeToken<ArrayList<Pessoa>>(){}.getType();

		    List<Pessoa> lista = new ArrayList<Pessoa>();
		   
		    return lista = new Gson().fromJson(bufferedReader, listType);
	}
	
	public boolean gravar(List<Pessoa> lista) throws IOException{
		GsonBuilder builder = new GsonBuilder();
	    Gson gson = builder.create();
	    FileWriter writer = new FileWriter("agenda.json");
	    writer.write(gson.toJson(lista));
	    writer.close();
	    return true;
	}
}
