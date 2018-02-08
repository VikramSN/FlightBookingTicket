/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runwayupload;

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
public class runwayinterImpl implements runwayinterface{

 
    public void insert(runwaygettersetter cgs) {
                                             
        
                 try {
            
            Connection conn =load.Load.getInstance().getConnection();
            
            String query = "insert into runway(runwayname,runwaystate,runwayimage,runwaydate) values (?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, cgs.getRunwayName());
            ps.setString(2, cgs.getRunwayState());
            ps.setString(3, cgs.getRunwayImage());
            ps.setString(4, cgs.getRunwayDate());
            
            ps.executeUpdate();
            
        } catch (SQLException e) 
        {
        }
        
    }

    
    
    public void delete(int pid)
    {
        try
        {
            
            Connection conn =load.Load.getInstance().getConnection();
            
            String query = "delete from runway where id = ? ";
            
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
    public List getcar_info() {
        
                    List list= new ArrayList<>();
            try 
            {
            
                Connection conn =load.Load.getInstance().getConnection();
            
                String query = "select * from runway";

                    PreparedStatement ps = conn.prepareStatement(query);

                      
                ResultSet rs =  ps.executeQuery();
                
                while(rs.next() )
                {
          runwaygettersetter cgs = new runwaygettersetter();

                    cgs.setId(rs.getInt(1));
                    cgs.setRunwayName(rs.getString(2));
                    cgs.setRunwayState(rs.getString(3));
                    cgs.setRunwayImage(rs.getString(4));
                    cgs.setRunwayDate(rs.getString(5));
                   
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
    public void update(runwaygettersetter p) {
         try
            {
            
            Connection conn =load.Load.getInstance().getConnection();
            
            String query = "UPDATE  RUNWAY SET RUNWAYNAME=?, RUNWAYSTATE=?,RUNWAYDATE=?, WHERE id ="+p.getId();
            
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            
            ps.setString(1, p.getRunwayName());
            ps.setString(2, p.getRunwayState());
            ps.setString(4, p.getRunwayDate());
             ps.executeUpdate();
                   
                   
                  
    }
       catch(SQLException e)        
    {
       e.printStackTrace();
    }
            
            
    }
    
    
    
     @Override
    public runwaygettersetter getcargettersetter(int pid) {
        try 
            {
            
                Connection conn =load.Load.getInstance().getConnection();
            
                String query = "select * from RUNWAY where id = ?";

                PreparedStatement ps = conn.prepareStatement(query);
                runwaygettersetter p1= new runwaygettersetter();

               ps.setInt(1, pid);
  

                ResultSet rs =  ps.executeQuery();
                
                while(rs.next() )
                {
                    runwaygettersetter p =new runwaygettersetter();

                    p.setId(rs.getInt("ID"));
                    p.setRunwayName(rs.getString("RUNWAYNAME"));
                    p.setRunwayState(rs.getString("RUNWAYSTATE"));
                    p.setRunwayImage(rs.getString("RUNWAYIMAGE"));
                    p.setRunwayDate(rs.getString("RUNWAYDATE"));

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