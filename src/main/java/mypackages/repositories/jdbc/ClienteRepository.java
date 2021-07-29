package mypackages.repositories.jdbc;

import java.util.ArrayList;
import java.util.List;

import mypackages.entities.Cliente;
import mypackages.repositories.interfaces.I_ClienteRepository;

public class ClienteRepository implements I_ClienteRepository {
	
	//private Connection conexionDB;

	//public ClienteRepository(Connection conexionDB) {
	//	this.conexionDB = conexionDB;
	//	}

	private List<Cliente> listaClientes=new ArrayList<Cliente>();

	
	@Override
	public void save(Cliente cliente) {
		
		listaClientes.add(cliente);
		
	}

	@Override
	public void remove(Cliente cliente) {

		listaClientes.remove(cliente);
	}

	@Override
	public void update(Cliente cliente) {

		
	}

	@Override
	public List<Cliente> getAll() {
		
		return listaClientes;
	}

}
