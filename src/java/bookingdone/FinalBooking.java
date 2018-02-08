/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingdone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MRuser
 */
public class FinalBooking {
private String name;
private String email;
private String contact;
private String nop;
private String selectclass;
private String totalprice;
private String totalseat;

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
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return the nop
     */
    public String getNop() {
        return nop;
    }

    /**
     * @param nop the nop to set
     */
    public void setNop(String nop) {
        this.nop = nop;
    }

    /**
     * @return the selectclass
     */
    public String getSelectclass() {
        return selectclass;
    }

    /**
     * @param selectclass the selectclass to set
     */
    public void setSelectclass(String selectclass) {
        this.selectclass = selectclass;
    }

    /**
     * @return the totalprice
     */
    public String getTotalprice() {
        return totalprice;
    }

    /**
     * @param totalprice the totalprice to set
     */
    public void setTotalprice(String totalprice) {
        this.totalprice = totalprice;
    }

    /**
     * @return the totalseat
     */
    public String getTotalseat() {
        return totalseat;
    }

    /**
     * @param totalseat the totalseat to set
     */
    public void setTotalseat(String totalseat) {
        this.totalseat = totalseat;
    }

    public int store() throws ClassNotFoundException, SQLException{
        
        Class.forName("org.apache.derby.jdbc.ClientDriver");
         
        String url="jdbc:derby://localhost:1527/PA;create=true;user=areo;password=plane";
        Connection con=DriverManager.getConnection(url);

        PreparedStatement ps = con.prepareStatement("insert into finalbook(name,email,contact,nop,selectclass,totalprice,totalseat)values (?,?,?,?,?,?,?)");
        ps.setString(1, name);
        ps.setString(2, email);
        ps.setString(3, contact);
        ps.setString(4, nop);
        ps.setString(5, selectclass);
    ps.setString(6, totalprice);
    ps.setString(7, totalseat);
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
