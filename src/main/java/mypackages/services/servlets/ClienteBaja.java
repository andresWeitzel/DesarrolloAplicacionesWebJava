package mypackages.services.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import mypackages.repositories.factories.ClienteRepositoryFactory;
import mypackages.repositories.interfaces.I_ClienteRepository;


public class ClienteBaja extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
				response.setContentType("text/plain;charset=UTF-8");
				
				try (PrintWriter out = response.getWriter()){
					
					I_ClienteRepository clienteRepository  
					= ClienteRepositoryFactory.getClienteRepository();
					
					 try {
						 
						int id = Integer.parseInt(request.getParameter("id"));
						
						clienteRepository.remove(clienteRepository.getById(id));
						
						out.println("Cliente Dado de Baja de Forma Exitosa!!");
						 
						 
					 }catch(Exception ex){
						 
						 System.out.println(ex);
						 
						 out.println("No se ha podido dar de Baja el Cliente!!");
						 
					 }


				}
	}

}
