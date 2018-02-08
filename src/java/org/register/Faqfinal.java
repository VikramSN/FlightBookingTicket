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
public class Faqfinal {
    private String qname;
    private String qemail;
    private String qmsg;

   
    /**
     * @return the qname
     */
    public String getQname() {
        return qname;
    }

    /**
     * @param qname the qname to set
     */
    public void setQname(String qname) {
        this.qname = qname;
    }

    /**
     * @return the qemail
     */
    public String getQemail() {
        return qemail;
    }

    /**
     * @param qemail the qemail to set
     */
    public void setQemail(String qemail) {
        this.qemail = qemail;
    }

    /**
     * @return the qmsg
     */
    public String getQmsg() {
        return qmsg;
    }

    /**
     * @param qmsg the qmsg to set
     */
    public void setQmsg(String qmsg) {
        this.qmsg = qmsg;
    }
    
     public int store() throws ClassNotFoundException, SQLException{
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");   
        String url="jdbc:derby://localhost:1527/PA;create=true;user=areo;password=plane";
        Connection con=DriverManager.getConnection(url);

        PreparedStatement ps = con.prepareStatement("insert into faq(name,email,msg)values (?,?,?)");
        
        ps.setString(1, qname);
        ps.setString(2, qemail);
        ps.setString(3, qmsg);
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
