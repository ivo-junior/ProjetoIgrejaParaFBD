package br.com.SistemaIgreja.sql;

public class SQLUtil {
	
	public static String URL_POSTGRES = "jdbc:postgresql://localhost:5432/postgres";
	public static String USUARIO_POSTGRES = "postgres";
	public static String SENHA_POSTGRES = "Ivojr123";
	
	
	public static class Pessoa{
		public static String INSERT_ALL = "insert into pessoa (nome, sexo, cpf, observacoes, email, qualidade, tipopessoa, telefone)" + 
				"valudes(?,?,?,?,?,?,?,?)";
		public static String SELECT_ID = "select * from pessoa where id = ?";
		public static String SELECT_PESSOA_CPF = "select * from pessoa p, endereco e where p.endereco_id=e.id and cpf = ?";
		public static String EDITAR_PESSOA = "uptade pesosa set nome=?, cpf=? .... WHERE id = ?";
	}
	
	public static class Endereco{
		public static String INSERT_ALL = "insert into endereco (endereco, bairro, numero, complemento, cep, cidade, estado) values (?,?,?,?,?,?,?) ";
	}
	
	public static class Conta{
		public static String INSERT_ALL = "insert into contas_pagar (nomedespesa, vencimento, valor)" + 
				"valudes(?,?,?)";
		public static String SELECT_ID = "select * from contas_pagar where id = ?";
		
	}

}
