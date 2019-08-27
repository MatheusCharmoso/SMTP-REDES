package teste;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class Teste {

	public static void main(String[] args) {
		
		String meuEmail = "lokidethorkk@gmail.com";
		String minhaSenha = "trollteemo";
		String deleEmail = "lokidethorkk@gmail.com";
		
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator (meuEmail, minhaSenha));
		email.setSSLOnConnect(true);
		
		try {
			email.setFrom(meuEmail);
			email.setSubject("ASSUNTO");
			email.setMsg("MENSAGEM ");
			email.addTo(deleEmail);
			email.send();
			System.out.println("Sucesso!");
			
			
		} 
		
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
		
	}

}
