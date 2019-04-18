package mailsdemo;
import java.util.*;
import javax.mail.*;
public class Reader {
public static void check(String host,String storeType,String user,String password){
	try{
		Properties props=new Properties();
		props.put("mail.prop3.host",host);
		props.put("mail.pop3.port", 110);
		props.put("mail.pop3.starttls.enable", "true");
		Session emailSession=Session.getDefaultInstance(props);
		Store store=emailSession.getStore("pop3s");
		store.connect(host, user, password);
		Folder emailFolder=store.getFolder("inbox");
		emailFolder.open(Folder.READ_ONLY);
		Message[] messages=emailFolder.getMessages();
		System.out.println("messages length ---------------"+messages.length);
		for(int i=0;i<messages.length;i++){
			Message message=messages[i];
			System.out.println("Email no :"+i);
			System.out.println("subject :"+message.getSubject());
			System.out.println("from :"+message.getFrom()[0]);
			System.out.println("text :"+message.getContent().toString());
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
		String host="smtp.gmail.com";
		final String username="bisstudy2018";
		final String password="test@2014#";
		String mailStoretype="pop3";
		check(host,mailStoretype,username,password);
	}

}
