package daos.faces;

import java.io.Serializable;
import java.util.List;

import models.Pessoa;


public interface PessoaDAOint<I extends Serializable> {
	public Pessoa save(Pessoa pessoa);
	public void remove(I idPessoa);
	public Pessoa buscaId(I idPessoa);
	public List<Pessoa> buscaNome(String nome);

}
