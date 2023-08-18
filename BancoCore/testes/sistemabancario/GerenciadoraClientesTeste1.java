package sistemabancario;

/**
 * Classe de teste criada para garantir o funcionamento das principais operações
 * 
 * @author Alice London
 * @date 18/08/23
 */

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class GerenciadoraClientesTeste1 {
	/*=====Montagem do cenário de teste====*/
	/**
	 * teste básico da pesquisa de um cliente a partir do seu Id
	 * 
	 * @author Alice London
	 * @date 18/08/23
	 */
	
	@Test
	public void testPesquisaCliente() {
		//Criando clientes
		Cliente cliente01 = new Cliente(1, "Joao da silva", 20, "joao@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "maria da silva", 18, "maria@gmail.com", 2, true);
		
		//inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<Cliente>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		/*====Execução do Teste====*/
		Cliente cliente = gerClientes.pesquisaCliente(1);
		
		/*====Verificação e Avaliação do Teste====*/
		assertThat(cliente.getId(), is(1));
	}
}
