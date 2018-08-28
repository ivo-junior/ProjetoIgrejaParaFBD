package br.com.SistemaIgreja.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLConection {

	public static final String NOME_BD_CONNECTION_POSTGRESS = "POSTGRES";
	public static final String NOME_BD_CONNECTION_MYSQL = "MYSQL";

	private static Connection conexao = null;

	private SQLConection() {}

	public static synchronized Connection getConectionInstance(String bd){
		try {
			if (conexao == null || conexao.isClosed()) {

				switch (bd) {
				case NOME_BD_CONNECTION_POSTGRESS: {

					conexao = DriverManager.getConnection(
							SQLUtil.URL_POSTGRES,
							SQLUtil.USUARIO_POSTGRES,
							SQLUtil.SENHA_POSTGRES
							);
				}
				break;
				case NOME_BD_CONNECTION_MYSQL:
					break;
				}

			}
		} catch (SQLException ex) {
			Logger.getLogger(SQLConection.class.getName()).log(Level.SEVERE, null, ex);
			ex.printStackTrace();
		}
		return conexao;

	}
}
