package br.com.fiap.view;
import br.com.fiap.model.Endereco;
import br.com.fiap.model.Plantacao;
import br.com.fiap.model.Pessoa;
import javax.swing.JOptionPane;

public class Terminal {
	public static void main(String[] args) {
		Endereco enderecoUsuario = new Endereco(JOptionPane.showInputDialog("Entre aqui com o logradouro : "), 
				Short.parseShort(JOptionPane.showInputDialog("Entre aqui com o numero da residencia : ")), JOptionPane.showInputDialog("Entre aqui com a cidade : "),
				JOptionPane.showInputDialog("Entre aqui com o bairro : "), JOptionPane.showInputDialog("Entre aqui com o estado : ")
				);
		Plantacao plantacaoUsuario = new Plantacao(JOptionPane.showInputDialog("Entre aqui com o nome do alimento : "),
					JOptionPane.showInputDialog("Entre aqui com a data de validade do alimento : "),
					Integer.parseInt((JOptionPane.showInputDialog("Entre aqui com a quantidade disponivel : "))),
					Double.parseDouble((JOptionPane.showInputDialog("Entre aqui com o preco de custo : "))),
					Integer.parseInt((JOptionPane.showInputDialog("Entre aqui com a quantidade obtida por colheita : "))),
					Integer.parseInt((JOptionPane.showInputDialog("Entre aqui com quantos meses a plantacao demora para crescer : " + "\n" + "Utilize apenas numeros e redondos, exemplo : 3 (para se referir a tres meses")))
							);
		Pessoa Usuario = new Pessoa(JOptionPane.showInputDialog("Entre aqui com o seu nome : "),
				JOptionPane.showInputDialog("Entre aqui com seu cpf : "), enderecoUsuario, plantacaoUsuario);
		
		JOptionPane.showConfirmDialog(null, "Confirme seus dados " + enderecoUsuario.retornarEndereco());
		JOptionPane.showConfirmDialog(null, "Confirme seus dados " + plantacaoUsuario.retornarPlantacao());
		JOptionPane.showConfirmDialog(null, "Confirme seus dados " + Usuario.exibirCadastro());
		
		while(true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 caso queira analisar o crescimento de sua plantacao" + "\n" + 
		"Digite 2 caso queira alterar os dados informados de sua plantacao" + "\n" + "Digite 3 caso queira calcular seu lucro com base na porcentagem" + "\n" + "Digite 4 caso queira encerrar o servico"));
			if (numero == 1) {
				plantacaoUsuario.Analisar(Integer.parseInt(JOptionPane.showInputDialog("Digite aqui daqui a quantos meses você quer saber o resultado")));
				JOptionPane.showMessageDialog(null, "Será obtido : " + "\n" + plantacaoUsuario.getQuantidadeMeses());
			}
			if (numero == 2) {
				plantacaoUsuario.alterarDados(JOptionPane.showInputDialog("Entre aqui com o nome do alimento : "),
						JOptionPane.showInputDialog("Entre aqui com a data de validade do alimento : "),
						Integer.parseInt((JOptionPane.showInputDialog("Entre aqui com a quantidade disponivel : "))),
						Double.parseDouble((JOptionPane.showInputDialog("Entre aqui com o preco de custo : "))),
						Integer.parseInt((JOptionPane.showInputDialog("Entre aqui com a quantidade obtida por colheita : "))),
						Integer.parseInt((JOptionPane.showInputDialog("Entre aqui com quantos meses a plantacao demora para crescer : " + "\n" + "Utilize apenas numeros e redondos, exemplo : 3 (para se referir a tres meses")))
						);
			JOptionPane.showConfirmDialog(null, "Confirme seus novos dados " + plantacaoUsuario.retornarPlantacao());
			}
			if (numero == 3) {
				plantacaoUsuario.calcularLucro(Double.parseDouble(JOptionPane.showInputDialog("Digite aqui a porcentagem de lucro desejada: ")));
				JOptionPane.showMessageDialog(null, "Preço total de lucro (preco de custo + lucro) : " + "\n" + plantacaoUsuario.getPrecoLucro());
			}
			if (numero == 4) {
				break;
			}
		}
		
	}
}
