package Email;

import javax.mail.*;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMultipart;
import java.io.*;
import java.util.Properties;

public class ReadGmail {


    public static void main(String[] args) {


        GmailInbox.getOTPCode();

    }

    public void read() {

        Properties props = new Properties();

        try {
            props.load(new FileInputStream(new File("smtp.properties")));
            Session session = Session.getDefaultInstance(props, null);

            Store store = session.getStore("imaps");
            store.connect("smtp.gmail.com", "javaemailtest01@gmail.com", "Test_1234");

            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_ONLY);
            int messageCount = inbox.getMessageCount();

            System.out.println("Total Messages:- " + messageCount);

            Message[] messages;
            messages = inbox.getMessages();
            for (int i = 0; i < messages.length; i++) {
                Message message = messages[i];
                System.out.println("==============================");
                System.out.println("Email #" + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Text: " + message.getContent());

                Object mp;
                try {
                    mp = message.getContent();

                    if (mp instanceof String) {
                        String body = (String) mp;
                        System.out.println("MSG Body : " + body);
                    } else if (mp instanceof MimeMultipart) {
                        MimeMultipart mpp = (MimeMultipart) mp;
                        for (int count = 0; count < mpp.getCount(); count++) {
                            MimeBodyPart bp = (MimeBodyPart) mpp.getBodyPart(count);
                            InputStream fileNme = bp.getInputStream();
                            StringWriter writer = new StringWriter();
                            //IOUtils.copy(fileNme, writer, "UTF-8");
                            String theString = writer.toString();
                            System.out.println("Text: " + theString);
                        }
                    } else if (mp instanceof Multipart) {
                        Multipart mpp = (Multipart) mp;
                        for (int count = 0; count < mpp.getCount(); count++) {
                            MimeBodyPart bp = (MimeBodyPart) mpp.getBodyPart(count);
                            InputStream fileNme = bp.getInputStream();
                            StringWriter writer = new StringWriter();
                            //IOUtils.copy(fileNme, writer, "UTF-8");
                            String theString = writer.toString();
                            System.out.println("Text: " + theString);
                        }
                    }
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (MessagingException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


}

