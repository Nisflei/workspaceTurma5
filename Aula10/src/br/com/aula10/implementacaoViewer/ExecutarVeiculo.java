package br.com.aula10.implementacaoViewer;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.aula10.beansModel.Veiculo;
import br.com.aula10.daoController.VeiculoDao;

public class ExecutarVeiculo {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		VeiculoDao veiculoDao = new VeiculoDao();
		
		
		char opc = ' ';
		
		do {
			System.out.println("Controle de Veiculo \n");
			System.out.println("Escolha opção: <C>reat <R>ead <U>pdate <D>elete <L>ist <E>xit");

			opc = s.nextLine().toUpperCase().charAt(0);

			switch (opc) {
			case 'C':
				// fazer inclusão
				try {
				Veiculo vei= new Veiculo(JOptionPane.showInputDialog("Placa:"),
										 JOptionPane.showInputDialog("Modelo:"),
										 Integer.parseInt(JOptionPane.showInputDialog("Potencia:")),
										 JOptionPane.showInputDialog("Proprietario:"),
										 Integer.parseInt(JOptionPane.showInputDialog("AnoFabrica:")));
				if (veiculoDao.incluir(vei))
					System.out.println("Salvo com sucesso..!!");
				} catch (Exception e) {
					System.out.println("Dados invalidos..! Processo cancelado.");
				}
				break;
			case 'R':
				// fazer consulta
				String placaPesq = JOptionPane.showInputDialog("Digite a Placa: ");
				Veiculo ve = veiculoDao.consultarPorPlaca(placaPesq);
				JOptionPane.showMessageDialog(null, "------ Dados do Veiculo --------" +
									"\n Placa: " + ve.getPlaca()+
									"\n Modelo: " + ve.getModelo() +
									"\n Potencia: " + ve.getPotencia()+
									"\n Proprietario: " + ve.getProprietario()); 
				break;
			case 'U':
				// Alterar
				String placaAlterar = JOptionPane.showInputDialog("Digite a Placa: ");
				Veiculo veiculoAlterar = veiculoDao.consultarPorPlaca(placaAlterar);

				veiculoAlterar.setModelo(JOptionPane.showInputDialog("Modelo:",veiculoAlterar.getModelo()));
				veiculoAlterar.setPotencia(Integer.parseInt(JOptionPane.showInputDialog("Potencia:",veiculoAlterar.getPotencia())));
				veiculoAlterar.setProprietario(JOptionPane.showInputDialog("Proprietario", veiculoAlterar.getProprietario()));
				
				veiculoDao.alterar(veiculoAlterar);
				
				break;
			case 'D':
				// Apagar veiculo
				String placa = JOptionPane.showInputDialog("Digite a Placa: ");
				Veiculo v = veiculoDao.consultarPorPlaca(placa);
				if (veiculoDao.apagar(v)) {
					System.out.println("Removido com sucesso..!!");
				} else {
					System.out.println("Não Localizado..!!");
				}

				break;
			case 'L':
				// Listar todos os veiculos no banco]
				System.out.println(veiculoDao.listarVeiculos()+"\n\n" );
				
				break;
			case 'E':
				// Listar todos os veiculos no banco]

				break;
			default:
				System.out.println("Digite as iniciais do menu");
				break;
			}
		} while (opc != 'E');
		s.close();
	}

}
