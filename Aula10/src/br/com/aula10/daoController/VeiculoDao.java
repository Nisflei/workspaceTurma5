package br.com.aula10.daoController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.aula10.beansModel.Veiculo;

public class VeiculoDao {

	List<Veiculo> bancoDeVeiculos = new ArrayList<Veiculo>();

	public VeiculoDao() {
	};

	public boolean incluir(Veiculo v) {
		try {
			DateFormat dtf = new SimpleDateFormat("yyyy");
			Date data = new Date();
			
			if (v.getAnoFabrica() > Integer.parseInt(dtf.format(data))) {
				throw new Exception("Erro ano Fabricação");
			}
			
			
			bancoDeVeiculos.add(v);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean apagar(Veiculo v) {
		return bancoDeVeiculos.remove(v);
	}

	public String listarVeiculos() {
		String resultado = "";

		for (Veiculo v : bancoDeVeiculos) {
			resultado = resultado + " \n" + v.getPlaca() + "-" + v.getProprietario();
		}
		return resultado;
	}

	public Veiculo consultarPorPlaca(String placa) {
		for (Veiculo v : bancoDeVeiculos) {
			if (v.getPlaca().equalsIgnoreCase(placa))
				return v;
		}

		return null;
	}

	public boolean alterar(Veiculo veiculo) {
		for (Veiculo v : bancoDeVeiculos) {
			if (v.getPlaca().equalsIgnoreCase(veiculo.getPlaca())) {
				bancoDeVeiculos.remove(v);
				bancoDeVeiculos.add(veiculo);
				return true;
			}
		}
		return false;

	}

}
