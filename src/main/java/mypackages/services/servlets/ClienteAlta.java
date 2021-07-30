package mypackages.services.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mypackages.entities.Cliente;
import mypackages.repositories.factories.ClienteRepositoryFactory;
import mypackages.repositories.interfaces.I_ClienteRepository;


public class ClienteAlta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		doGet(request, response);
	}

	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
				response.setContentType("text/plain;charset=UTF-8");
				
				try (PrintWriter out = response.getWriter()){
					
					I_ClienteRepository clienteRepository  
					= ClienteRepositoryFactory.getClienteRepository();
					
					 try {
						 int 	id		 = Integer.parseInt(request.getParameter("id"));
						 String nombre   = request.getParameter("nombre");
						 String apellido = request.getParameter("apellido");
						 String email    = request.getParameter("email");
						 String telefono = request.getParameter("telefono");
						 
						 
						 Cliente cliente=new Cliente(id,nombre,apellido,email,telefono);
						 
						 
						 clienteRepository.save(cliente);

						 
						 out.println(cliente.toString());
						 
						 
					 }catch(Exception ex){
						 
						 System.out.println(ex);
					 }


				}
	}

}
