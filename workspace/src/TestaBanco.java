
public class TestaBanco {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCpf("111.111.111-12");
		cliente.setNome("Paulo Silveira");
		cliente.setProfissao("Gerente");
		
		Conta clienteConta = new Conta(1227, 1492);
		
		clienteConta.setTitular(cliente);
		
		clienteConta.depositar(100);
		clienteConta.saca(90);	
		
		System.out.println(clienteConta.getTitular().getNome());
		
		clienteConta.getTitular().setProfissao("Desenvolvedor");
		System.out.println(clienteConta.getTitular().getProfissao());
		
		System.out.println("Total de contas: " + Conta.getTotal());
	}
	
}
