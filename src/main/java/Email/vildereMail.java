package Email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.search.FromTerm;
import javax.mail.search.SearchTerm;
import java.util.Properties;

public class vildereMail {


    public boolean match(Message message) {
        try {
            if (message.getSubject().contains("Ordretest")) {
                System.out.println("match found");
                return true;
            }
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
        return false;
    };
    public static void main(String[] args) {
        Properties props = System.getProperties();
        props.setProperty("mail.store.protocol", "imaps");
        props.put("mail.imap-mail.outlook.com.ssl.enable", "true");
        props.put("mail.pop3.host", "outlook.com");
        props.put("mail.pop3.port", "995");
        props.put("mail.pop3.starttls.enable", "true");
        try {
            Session session = Session.getInstance(props, null);
            Store store = session.getStore();
            store.connect("imap-mail.outlook.com", "myEmail@live.dk", "MyPassword");
            session.setDebug(true);
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);


            SearchTerm sender = new FromTerm(new InternetAddress("myMail@live.dk"));

            Message[] messages = inbox.search(sender);
            System.out.println(messages);

            for (int i = 0 ; i < messages.length ; i++) {

                System.out.println(messages[i].getSubject());
                if (messages[i].getSubject().equals(null)) {
                    System.out.println("null in subject");
                    break;
                }
                else if (messages[i].getSubject().contains("Ordretest")){
                    System.out.println("1 match found");
                }
                else {
                    System.out.println("no match");
                }
            }
            System.out.println("no more messages");
            store.close();

        } catch (Exception mex) {
            mex.printStackTrace();
        }
    }
}

