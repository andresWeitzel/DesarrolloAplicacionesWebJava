package mypackages.tests;

import mypackages.entities.Cliente;
import mypackages.enums.TipoDocumento;
import mypackages.repositories.factories.ClienteRepositoryFactory;
import mypackages.repositories.interfaces.I_ClienteRepository;

public class TestClienteRepository {
	
	public static void main(String[] args) {

		I_ClienteRepository clienteRepository 
		= ClienteRepositoryFactory.getClienteRepository();

		
		clienteRepository.save(new Cliente(
				1
				,"Jaime"
				,"Paez"
				,"jaimeEcPaez@gmail.com"
				,"4532456789"
				));
		
		clienteRepository.save(new Cliente(
				2
				,"Gabriela"
				,"Sanchez"
				,45
				,"Las Piedras 789"
				,"gabrielaSnachez768@gmail.com"
				,"1178690567"
				,TipoDocumento.valueOf("DNI")
				,"8978987678"
				));
	
		
		//=============SELECT====================
		
		
		System.out.println("\n----------------LISTA CLIENTES------------------------");
		
		clienteRepository.getAll().forEach(System.out::println);
	
		
		System.out.println("\n----------------LISTA CLIENTE/S POR NOMBRE------------------------");
		
		clienteRepository.getLikeNombre("Gabriela").forEach(System.out::println);
	
		
		System.out.println("\n----------------LISTA CLIENTE/S POR APELLIDO------------------------");
		
		clienteRepository.getLikeApellido("PAEZ").forEach(System.out::println);
		
		System.out.println("\n----------------LISTA CLIENTE/S POR EDAD------------------------");
		
		clienteRepository.getByEdad(45).forEach(System.out::println);
	
		System.out.println("\n----------------LISTA CLIENTE/S POR EDAD MAYOR QUE------------------------");
		
		clienteRepository.getByEdadMayorQue(28).forEach(System.out::println);
		

		System.out.println("\n----------------LISTA CLIENTE/S POR EDAD MENOR QUE------------------------");
			
		clienteRepository.getByEdadMenorQue(28).forEach(System.out::println);
			
		
		System.out.println("\n----------------LISTA CLIENTE/S POR EMAIL------------------------");
		
		clienteRepository.getLikeEmail("@gmail").forEach(System.out::println);
		
		
		System.out.println("\n----------------LISTA CLIENTE/S POR TELEFONO------------------------");
		
		clienteRepository.getLikeTelefono("11").forEach(System.out::println);
		
	
		System.out.println("\n----------------LISTA CLIENTE/S POR TIPO DE DOCUMENTO------------------------");
		
		clienteRepository.getLikeTipoDocumento(TipoDocumento.DNI).forEach(System.out::println);
		
	
		System.out.println("\n----------------LISTA CLIENTE/S POR NUMERO DE DOCUMENTO------------------------");
		
		clienteRepository.getLikeNumeroDocumento("89").forEach(System.out::println);
		
	
	}

 
}
