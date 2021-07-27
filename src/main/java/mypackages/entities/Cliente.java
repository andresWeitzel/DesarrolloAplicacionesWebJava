package mypackages.entities;

import mypackages.enums.TipoDocumento;

public class Cliente {
	int 	id;
	String nombre;
	String apellido;
	int edad;
	String direccion;
	String email;
	String telefono;
	TipoDocumento tipoDocumento;
	String numeroDocumento;

	
	public Cliente() {
	
	}
	
	
	
	public Cliente(int id, String nombre, String apellido, String email, String telefono) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
	}



	public Cliente(int id,String nombre, String apellido, int edad, String direccion
			, String email, String telefono
			,TipoDocumento tipoDocumento, String numeroDocumento) {
		
		this.id=id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
	}
	
	
	



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	
	
	@Override
	public String toString() {
		return "Cliente [ Id= "+id+", nombre=" + nombre + ", apellido=" + apellido 
				+ ", edad=" + edad + ", direccion=" + direccion
				+ ", email=" + email + ", telefono=" + telefono + ", tipoDocumento="
				+ tipoDocumento + ", numeroDocumento=" + numeroDocumento + "]";
	}

	
	
}

