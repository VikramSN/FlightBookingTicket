package org.register;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MRuser
 */
public class ContactUs {
    private String name;
    private String email;
    private String contact;
    private String subject;
    private String msg;

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
     * @return the email
     */
    public String getEmail() {
        return email;
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
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }
    
     public int store() throws ClassNotFoundException, SQLException{
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
         
        String url="jdbc:derby://localhost:1527/PA;create=true;user=areo;password=plane";
        Connection con=DriverManager.getConnection(url);

        PreparedStatement ps = con.prepareStatement("insert into contactus(name,email,contact,subject,msg)values (?,?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, contact);
        ps.setString(4, subject);
        ps.setString(5, msg);
    
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
