package mypackages.repositories.interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import mypackages.entities.Cliente;
import mypackages.enums.TipoDocumento;

public interface I_ClienteRepository {
	
	void save(Cliente cliente);
	
	void remove(Cliente cliente);
	
	void update(Cliente cliente);
	
	List <Cliente> getAll();	
	
	default Stream<Cliente> getStream(){
		return getAll().stream();
	}
	
	//====== GET BY ID ===========
	
	default Cliente getById(int id) {
		return getStream()
				.filter(objeto->objeto.getId() == id)
				.findAny()
				.orElse(new Cliente());
	}
	
	//====== GET LIKE NOMBRE ===========
	
	default List<Cliente> getLikeNombre(String nombre){
		
		if(nombre == null) {
			return new ArrayList<Cliente>();
		}
		
		return getStream()
				.filter(objeto ->String.valueOf(
							objeto.getNombre().toLowerCase()
							)
				.contains(nombre.toLowerCase()))
				.collect(Collectors.toList());
		
	}
	
	//====== GET LIKE APELLIDO ===========

	default List<Cliente> getLikeApellido(String apellido){
		
		if(apellido == null) {
			return new ArrayList<Cliente>();
		}
		
		return getStream()
				.filter(objeto ->String.valueOf(
							objeto.getApellido().toLowerCase()
							)
				.contains(apellido.toLowerCase()))
				.collect(Collectors.toList());
		
	}
	
	//====== GET BY EDAD ===========

	default List<Cliente> getByEdad(int edad){
		
		return getStream()
				.filter(objeto ->objeto.getEdad() == edad)
				.collect(Collectors.toList());
		
	}
	
	//====== GET LIKE DIRECCION ===========

	default List<Cliente> getLikeDireccion(String direccion){
		
		if(direccion == null) {
			return new ArrayList<Cliente>();
		}
		
		return getStream()
				.filter(objeto ->String.valueOf(
							objeto.getDireccion().toLowerCase()
							)
				.contains(direccion.toLowerCase()))
				.collect(Collectors.toList());
		
	}
	
	//====== GET LIKE EMAIL ===========

	default List<Cliente> getLikeEmail(String email){
		
		if(email == null) {
			return new ArrayList<Cliente>();
		}
		
		return getStream()
				.filter(objeto ->String.valueOf(
							objeto.getEmail().toLowerCase()
							)
				.contains(email.toLowerCase()))
				.collect(Collectors.toList());
		
	}
	
	//====== GET LIKE TELEFONO ===========

	default List<Cliente> getLikeTelefono(String telefono){
		
		if(telefono == null) {
			return new ArrayList<Cliente>();
		}
		
		return getStream()
				.filter(objeto ->String.valueOf(
						objeto.getTelefono()
							)
				.contains(telefono))
				.collect(Collectors.toList());
		
	}
	
	//====== GET LIKE TIPO DE DOCUMENTO (ENUMERADO) ===========

	default List<Cliente> getLikeTipoDocumento(TipoDocumento tipoDocumento){
		
		if(tipoDocumento == null) {
			return new ArrayList<Cliente>();
		}
		
		return getStream()
				.filter(objeto ->objeto.getTipoDocumento() == tipoDocumento)
				.collect(Collectors.toList());
		
	}
	
	//====== GET LIKE NUMERO DE DOCUMENTO ===========

	default List<Cliente> getLikeNumeroDocumento(String numeroDocumento){
		
		if(numeroDocumento == null) {
			return new ArrayList<Cliente>();
		}
		
		return getStream()
				.filter(objeto ->String.valueOf(
						objeto.getNumeroDocumento()
							)
				.contains(numeroDocumento))
				.collect(Collectors.toList());
		
	}
	


}
