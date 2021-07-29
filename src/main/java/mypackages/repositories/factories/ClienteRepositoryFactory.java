package mypackages.repositories.factories;

import mypackages.repositories.jdbc.ClienteRepository;

public class ClienteRepositoryFactory {
	
	
	private ClienteRepositoryFactory() {
			
		}
		
	
	private static ClienteRepository clienteRepository 
	= new ClienteRepository();
	
	

	//Aplicamos patron Singleton
	public static ClienteRepository getClienteRepository() {
		
		return clienteRepository;
	}
	
	
}
