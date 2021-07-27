package mypackages.repositories.jdbc;

import java.sql.Connection;
import java.util.List;

import mypackages.entities.Cliente;
import mypackages.repositories.interfaces.I_ClienteRepository;

public class ClienteRepository implements I_ClienteRepository {
	
	private Connection conexionDB;
	

	public ClienteRepository(Connection conexionDB) {
		this.conexionDB = conexionDB;
	}

	
	@Override
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
