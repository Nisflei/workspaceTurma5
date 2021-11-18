package br.com.aula9.beans;

public class Login {
	private String usuario;
	private String senha;

	// construtor
	public Login() {
	}

	public Login(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}

	// getter setter
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean fazeLogin(String usuario, String senha) {
		String user = "root";
		String pwd = "java";

		try {
			if (usuario.equalsIgnoreCase(user) && senha.equalsIgnoreCase(pwd)) {
				return true;
			} else {
				throw new Exception("credenciais invalidas:" + usuario);
			}
		} catch (Exception ex) {
			System.out.println("Log:" + ex.getMessage());
			return false;
		}

	}
}
