package clientews.ws.client;

import javax.swing.JOptionPane;

import clientews.ws.service.CalculadoraPercursoImpl;
import clientews.ws.service.CalculadoraPercursoImplService;
import clientews.ws.service.Exception_Exception;

public class Cliente {

	public static void main(String[] args) throws Exception_Exception {
		CalculadoraPercursoImplService service = new CalculadoraPercursoImplService();
		CalculadoraPercursoImpl port = service.getCalculadoraPercursoImplPort();
		
		String origem = JOptionPane.showInputDialog("Digite o endereço de Origem");
		String destino = JOptionPane.showInputDialog("Digite o endereço de Destino");
		String moeda = JOptionPane.showInputDialog("Em qual moeda Deseja pagar?\n"
				+ "1-Real, 2-Dólar, 3-Euro");
		double valorTotal = port.calculaValorTotalDoPercurso(origem, destino, Integer.parseInt(moeda));
		int showConfirmDialog = JOptionPane.showConfirmDialog(null,"O valor total é "+valorTotal+"\nConfirmar?");
		if(showConfirmDialog == 0){
			String opcaoPagamento = JOptionPane.showInputDialog("De qual forma deseja pagar?\n"
					+ "1-DINHEIRO, 2-CARTÃO DÉBITO, 3-CARTÃO CRÉDITO");
			JOptionPane.showMessageDialog(null, "Obrigado pela prefêrencia. Boa Viagem!");
		}
		System.exit(0);
	}

}
