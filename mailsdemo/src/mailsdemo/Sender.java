package mailsdemo;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
public class Sender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String to="bisstudy2018@gmail.com";
		String from ="bisstudy2018@gmail.com";
		final String username="bisstudy2018";
		final String password="test@2014#";
		String host="smtp.gmail.com";
		Properties props=new Properties();
		props.put("mail.smtp.auth", true);
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", 587);
		Session session=Session.getInstance(props,new javax.mail.Authenticator(){
			protected PasswordAuthentication getPasswordAuthentication(){
				return new PasswordAuthentication(username, password);
			}
		});
		try{
			Message message=new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
			message.setSubject("this is a test mail for verfication");
			Transport.send(message);
			System.out.println("your message was sent");
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}

}
