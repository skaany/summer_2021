package Email;

import javax.mail.*;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;


public class GmailInbox {

    public static void main(String[] args) {


       getOTPCode();

    }

    public static List<Message> getEmails() {


        Properties props = new Properties();
        List<Message> emails = new ArrayList<>();

        try {
            props.load(new FileInputStream(new File("smtp.properties")));
            Session session = Session.getDefaultInstance(props, null);

            Store store = session.getStore("imaps");
            store.connect("smtp.gmail.com", "javaemailtest01@gmail.com", "Test_1234");

            Folder inbox = store.getFolder("inbox");
            inbox.open(Folder.READ_ONLY);
            emails = Arrays.asList(inbox.getMessages());


            //inbox.close(true);
            //store.close();

        } catch (Exception e) {
            e.printStackTrace();
        }


        return emails;


    }

    public static String readEmail() {

        String emailBody = "";

        try {

            List<Message> messages = getEmails();


            List<Message> emailSubjects = messages.stream().filter(e -> {
                try {
                    return e.getSubject().contains(" ");
                } catch (MessagingException messagingException) {
                    messagingException.printStackTrace();
                }
                return false;
            }).collect(Collectors.toList());


            Collections.reverse(emailSubjects);

            MimeMultipart body = (MimeMultipart) emailSubjects.get(0).getContent();
            final BodyPart bodyPart = body.getBodyPart(0);
            emailBody = (String) bodyPart.getContent();

        } catch (IOException | MessagingException ioException) {
            ioException.printStackTrace();
        }

        return emailBody;


    }

    public static String getOTPCode(){

        String emailBody = readEmail();
        emailBody = emailBody.substring(emailBody.indexOf("Access"), emailBody.indexOf("turned on"));
        System.out.println(emailBody);
        return emailBody;

    }

}