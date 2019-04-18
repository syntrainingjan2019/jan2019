package javamaildemo;
import java.util.Properties;
import javax.mail.*;
public class Reader {
public static void check(String host,String storeType,String user,String password){
	try{
		Properties props=new Properties();
		props.put("mail.pop3.host",host);
		props.put("mail.pop3.port",110);
		props.put("mail.pop3.starttls.enable","true");
		Session emailSession=Session.getDefaultInstance(props);
		Store store=emailSession.getStore("pop3s");
		store.connect(host,user,password);
		Folder emailFolder=store.getFolder("Inbox");
		emailFolder.open(Folder.READ_ONLY);
		Message[] messages=emailFolder.getMessages();
		System.out.println("Messages length ----"+messages.length);
		for(int i=0;i<messages.length;i++){
			Message message=messages[i];
			System.out.println("Email no :"+(i+1));
			System.out.println("subject :"+message.getSubject());
			System.out.println("From :"+message.getFrom()[0]);
			System.out.println("Text :"+message.getContent().toString());
		}
		emailFolder.close(false);
		store.close();
	}
	catch(Exception ex){
		System.out.println(ex.getMessage());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host="pop.rediffmail.com";
		String mailStoreType="pop3";
		String username="bisstudy2015@rediff.com";
		String password="test@2014#";
		check(host,mailStoreType,username,password);
	}

}
