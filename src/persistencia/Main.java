package persistencia;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws IOException {
		ListaPessoa pessoa = new ListaPessoa();
		//GravarCSV csv = new GravarCSV();
		//JSON json = new JSON();
		XML xml = new XML();
		Persistencia pers = new Persistencia(xml);
		Pessoa p = new Pessoa();
		
		Calendar calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 21);
		calendario.set(Calendar.MONTH, 11);
		calendario.set(Calendar.YEAR, 2000);
		Date dt = calendario.getTime();
		
		p.setCodigo(1);
		p.setNome("Vinicius");
		p.setEmail("Vinigoulartalmeida@gmail.com");
		p.setTelefone("49992015953");
		p.setDataNasc(dt);
		pessoa.inserir(p);
		
		Pessoa p1 = new Pessoa();
		p1.setCodigo(3);
		p1.setNome("Vinicius");
		p1.setEmail("Vinigoulartalmeida@gmail.com");
		p1.setTelefone("49992015953");
		p1.setDataNasc(dt);
		pessoa.alterar(p, p1);
		
		calendario = Calendar.getInstance();
		calendario.set(Calendar.DAY_OF_MONTH, 2);
		calendario.set(Calendar.MONTH, 1);
		calendario.set(Calendar.YEAR, 1999);
		dt = calendario.getTime();
		p = new Pessoa();
		p.setCodigo(2);
		p.setNome("Caio");
		p.setEmail("caio@hotmail.com");
		p.setTelefone("999856515");
		p.setDataNasc(dt);
		pessoa.inserir(p);
		
		
		
		pers.gravar(pessoa.getLista());
		
		System.out.println(pessoa);
		System.out.println(pessoa.nome("C"));
		System.out.println(pessoa.aniversario(11));
		System.out.println(pessoa.email("gmail"));
		
		pessoa.excluir(3);
		
		System.out.println(pessoa);

	}

}
