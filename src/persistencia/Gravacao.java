package persistencia;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;

public interface Gravacao {
	
	public boolean gravar(List<Pessoa> list) throws IOException;
	public List<Pessoa> ler() throws ParseException, FileNotFoundException;

}
