package persistencia;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListaPessoa  {
	 List<Pessoa> lista = new ArrayList<Pessoa>();
	
	 public List<Pessoa> getLista() {
		return lista;
	}

	public void setLista(List<Pessoa> lista) {
		this.lista = lista;
	}

	public void inserir(Pessoa p)throws IOException {
		lista.add(p);
	}
	
	public void excluir(int cod) throws IOException{
		for (Pessoa pessoa : lista) {
			if (pessoa.getCodigo() == cod) {
				lista.remove(pessoa);
			}
		}
	}
	
	public void alterar(Pessoa p, Pessoa p1) throws IOException {
		for (Pessoa pessoa : lista) {
			if (p.equals(pessoa)) {
				p.setCodigo(p1.getCodigo());
				p.setNome(p1.getNome());
				p.setEmail(p1.getEmail());
				p.setTelefone(p1.getTelefone());
				p.setDataNasc(p1.getDataNasc());
			}
		}
	}
	
	public static String retornaData(Date data) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		String dataString = format.format(data);
		return dataString;
	}
	
	public static Date retornaDate(String data) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		Date dataDate = format.parse(data);
		return dataDate;
	}
	
	public List<Pessoa> nome(String nome){
		List<Pessoa> retornaNome = new ArrayList<Pessoa>(); 
		for (Pessoa pessoa : lista) {
			String aux = pessoa.getNome().toLowerCase();
		    	if (aux.substring(0,1).contains(nome.toLowerCase())) {
		    		retornaNome.add(pessoa);
		    	}
		    }
		return retornaNome;
	}
	
	public List<Pessoa> email(String email){
		List<Pessoa> retornaEmail = new ArrayList<Pessoa>();
		 for (Pessoa pessoa : lista) {
		    	if (pessoa.getEmail().toLowerCase().contains(email.toLowerCase())) {
		    		retornaEmail.add(pessoa);
		    	}
		    }
		return retornaEmail;
	}
	
	@SuppressWarnings("deprecation")
	public List<Pessoa> aniversario(int mes){
		List<Pessoa> retornaAniver = new ArrayList<Pessoa>();
		 for (Pessoa pessoa : lista) {
		    	if (pessoa.getDataNasc().getMonth() == mes) {
		    		retornaAniver.add(pessoa);
		    	}
		    }
		return retornaAniver;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ListaPessoa [lista=");
		builder.append(lista);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
