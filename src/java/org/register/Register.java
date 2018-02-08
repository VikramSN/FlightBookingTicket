/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.register;

/**
 *
 * @author MD. SALMAN
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
public class Register {
 
    private String name;
    private String contact;
    private String email;
    private String pass;
    private String repass;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the contact
     */
    public String getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return the repass
     */
    public String getRepass() {
        return repass;
    }

    /**
     * @param repass the repass to set
     */
    public void setRepass(String repass) {
        this.repass = repass;
    }
    
 public int store() throws ClassNotFoundException, SQLException{
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
         
        String url="jdbc:derby://localhost:1527/PA;create=true;user=areo;password=plane";
        Connection con=DriverManager.getConnection(url);

        PreparedStatement ps = con.prepareStatement("insert into register(name,contact,email,pass,repass)values (?,?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, contact);
        ps.setString(3, email);
        ps.setString(4, pass);
        ps.setString(5, repass);
    
        int a=ps.executeUpdate();
    
        
//            //Mail Code===================================================================================================
//            
//            try{
//            String host ="smtp.gmail.com" ;
//            String user = "viki.aryan.negi@gmail.com";
//            String password = "vikramsuli@123";
//            String to = email;
//            String from = "viki.aryan.negi@gmail.com";
//            String subject = "Registered Successfully on www.CarLiker.com";
//            String messageText = "Dear "+name+"\n\nThank you for Registration on www.CarLiker.com.\n\nYour password is : "+pass+"\n\n\nAuthor by Vikram Singh Negi";
//            boolean sessionDebug = false;
//
//            Properties props = System.getProperties();
//
//            props.put("mail.smtp.starttls.enable", "true");
//            props.put("mail.smtp.host", host);
//            props.put("mail.smtp.port", "587");
//            props.put("mail.smtp.auth", "true");
//            props.put("mail.smtp.starttls.required", "true");
//
//            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
//            Session mailSession = Session.getDefaultInstance(props, null);
//            mailSession.setDebug(sessionDebug);
//            Message msg = new MimeMessage(mailSession);
//            msg.setFrom(new InternetAddress(from));
//            InternetAddress[] address = {new InternetAddress(to)};
//            msg.setRecipients(Message.RecipientType.TO, address);
//            msg.setSubject(subject); msg.setSentDate(new Date());
//            msg.setText(messageText);
//
//           Transport transport=mailSession.getTransport("smtp");
//           transport.connect(host, user, password);
//           transport.sendMessage(msg, msg.getAllRecipients());
//           transport.close();
//           System.out.println("message send successfully");
//        }catch(MessagingException ex)
//        {
//            System.out.println("=============================================="+ex);
//        }
//            
// ==============================================================================================================   
        
        if(a==1) {
            return a;
        }else {
            return a;
        }
    }
    
    
}
