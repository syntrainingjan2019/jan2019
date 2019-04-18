package javagmaildemo;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class SendMails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String username="ddemo2185@gmail.com";
		final String password="demo@123";
		Properties properties=new Properties();
		properties.put("mail.smtp.auth", "true");		
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.port", "587");
		Session session=Session.getInstance(properties,new javax.mail.Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(username,password);
			}
		});
		try{
			Message message=new MimeMessage(session);
			message.setFrom(new InternetAddress("ddemo2185@gmail.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("ddemo2185@gmail.com"));
			message.setSubject("test mail from java");
			message.setText("Dear user \nThis is a test mail from Java" );
			Transport.send(message);
			System.out.println("Your mail has been sent successfully");
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
