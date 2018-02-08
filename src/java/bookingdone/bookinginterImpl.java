/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingdone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp1
 */
public class bookinginterImpl implements bookinginterface{

 
    @Override
    public void insert(bookinggettersetter cgs) {
                                             
        
                 try {
            
            Connection conn =load.Load.getInstance().getConnection();
            
            String query = "insert into finalbook(name,email,contact,nop,selectclass,totalprice,totalseat) values (?,?,?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, cgs.getName());
            ps.setString(2, cgs.getEmail());
            ps.setString(3, cgs.getContact());
            ps.setString(4, cgs.getNop());
            ps.setString(5, cgs.getSelectclass());
            ps.setString(6, cgs.getTotalprice());
            ps.setString(7, cgs.getTotalseat());
            ps.executeUpdate();
            
        } catch (SQLException e) 
        {
        }
        
    }

    
    
    @Override
    public void delete(int pid)
    {
        try
        {
            
            Connection conn =load.Load.getInstance().getConnection();
            
            String query = "delete from finalbook where id = ? ";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, pid);
            
            ps.executeUpdate();
            
        }
        catch(SQLException e) 
        {
            e.printStackTrace();
        }
    }
    
    
    @Override
    public List getbooking_info() {
        
                    List list= new ArrayList<>();
            try 
            {
            
                Connection conn =load.Load.getInstance().getConnection();
            
                String query = "select * from finalbook";

                    PreparedStatement ps = conn.prepareStatement(query);

                      
                ResultSet rs =  ps.executeQuery();
                
                while(rs.next() )
                {
          bookinggettersetter cgs = new bookinggettersetter();

                    cgs.setId(rs.getInt(1));
                    cgs.setName(rs.getString(2));
                    cgs.setEmail(rs.getString(3));
                    cgs.setContact(rs.getString(4));
                    cgs.setNop(rs.getString(5));
                   cgs.setSelectclass(rs.getString(6));
                   cgs.setTotalprice(rs.getString(7));
                   cgs.setTotalseat(rs.getString(8));
                    list.add(cgs);



                 }

        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
            
        return list;

        
        
     }
    
    
    //update code ============================================
    @Override
    public void update(bookinggettersetter p) {
         try
            {
            
            Connection conn =load.Load.getInstance().getConnection();
            
            String query = "UPDATE  FINALBOOK SET NAME=?, EMAIL=?,CONTACT=?,NOP=?,SELECTCLASS=?,TOTALPRICE=?,TOTALSEAT=? WHERE id ="+p.getId();
            
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            
            ps.setString(1, p.getName());
            ps.setString(2, p.getEmail());
            ps.setString(3, p.getContact());
            ps.setString(4, p.getNop());
            ps.setString(5, p.getSelectclass());
            ps.setString(6, p.getTotalprice());
            ps.setString(7, p.getTotalseat());
             ps.executeUpdate();
                   
                   
                  
    }
       catch(SQLException e)        
    {
       e.printStackTrace();
    }
            
            
    }
    
    
    
     @Override
    public bookinggettersetter getcargettersetter(int pid) {
        try 
            {
            
                Connection conn =load.Load.getInstance().getConnection();
            
                String query = "select * from Finalbook where id = ?";

                PreparedStatement ps = conn.prepareStatement(query);
                bookinggettersetter p1= new bookinggettersetter();

               ps.setInt(1, pid);
  

                ResultSet rs =  ps.executeQuery();
                
                while(rs.next() )
                {
                    bookinggettersetter p =new bookinggettersetter();

                    p.setId(rs.getInt("ID"));
                    p.setName(rs.getString("NAME"));
                    p.setEmail(rs.getString("EMAIL"));
                    p.setContact(rs.getString("CONTACT"));
                    p.setNop(rs.getString("NOP"));
                    p.setSelectclass(rs.getString("SELECTCLASS"));
                    p.setTotalprice(rs.getString("TOTALPRICE"));
                    p.setTotalseat(rs.getString("TOTALSEAT"));
                    return p;


                 }

        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
            
        return null;
    }
    
}