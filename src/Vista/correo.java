package Vista;

import java.util.Properties;
import java.util.Random;
import javax.activation.DataHandler;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

public class correo {

    private static String USER_NAME = "vinirj79@gmail.com";
    private static String PASSWORD = "ricardo999";
    private static String RECIPIENT = "gabudp27@gmail.com";

    public static void main(String[] args) {
        String from = USER_NAME;
        String pass = PASSWORD;
        String[] to = {RECIPIENT};
        String subject = "CONTRASEÑA DEL SISTEMA";
        String  contra = "";
        for (int i = 0; i < 10; i++) {
            int valorDado = (int) Math.floor(Math.random()*6+1);
            contra += valorDado+"";
        }
        JOptionPane.showMessageDialog(null, contra);
        String body = contra;

        sendFromGMail(from, pass, to, subject, body);
        System.out.println("sent");
    }

    private static void sendFromGMail(String correoEnvia, String pass, String[] correoResive, String subject, String body) {
        Properties props = System.getProperties();
        String host = "smtp.gmail.com";
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", host);
        props.put("mail.smtp.user", correoEnvia);
        props.put("mail.smtp.password", pass);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(new InternetAddress(correoEnvia));
            InternetAddress[] toAddress = new InternetAddress[correoResive.length];

            for (int i = 0; i < correoResive.length; i++) {
                toAddress[i] = new InternetAddress(correoResive[i]);
            }

            for (int i = 0; i < toAddress.length; i++) {
                message.addRecipient(Message.RecipientType.TO, toAddress[i]);
            }

            message.setSubject(subject);
            message.setText(body);
            Transport transport = session.getTransport("smtp");
            transport.connect(host, correoEnvia, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (AddressException ae) {
            ae.printStackTrace();
        } catch (MessagingException me) {
            me.printStackTrace();
        }
    }
    
    public void enviarCorreo(){
        
    }
}
