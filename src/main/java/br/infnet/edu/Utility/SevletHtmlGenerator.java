package br.infnet.edu.Utility;

import br.infnet.edu.Domain.Usuario;

public class SevletHtmlGenerator {
	
	public String GenerateResponseHtml(Usuario user) {
		
		String htmlRespone = "<html>";
		htmlRespone += "<meta charset='utf-8'>";
        htmlRespone += "<h2>Seu nome é: " + user.getName() + "<br/>";      
        htmlRespone += "Seu Email é: " + user.getEmail() ;
        htmlRespone += "Sua senha é.. pera vai mostrar pra todo mundo mesmo?: " + user.getPassword() + "</h2>";
        htmlRespone += "</html>";
		
        
		return htmlRespone;
		
	}
}
