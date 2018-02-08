package profiles;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



 
public class ProfileDaoIMPl implements ProfileDAO{

    
    @Override
    public void insert(Profiles p) {
         try {
            
            Connection conn =load.Load.getInstance().getConnection();
            
            String query = "insert into register(name,contact,email,pass,repass) values (?,?,?,?,?)";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, p.getName());
            ps.setString(2, p.getContact());
            ps.setString(3, p.getEmail());
            ps.setString(4, p.getPass());
            ps.setString(5, p.getRepass());
            
            ps.executeUpdate();
            
        } catch (SQLException e) 
        {
        }
    }

    /**
     *
     * @param p
     */
    
    @Override
    public void update(Profiles p) {
         try
            {
            
            Connection conn =load.Load.getInstance().getConnection();
            
            String query = "UPDATE  REGISTER SET name=?, Email=?, Contact=? WHERE id ="+p.getId();
            
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            
                
             
            ps.setString(1, p.getName());
            ps.setString(2, p.getContact());
            ps.setString(3, p.getEmail());
            
             ps.executeUpdate();
                   
                   
                  
    }
       catch(SQLException e)        
    {
       e.printStackTrace();
    }
            
            
    }

    
    @Override
    public Profiles getProfiles(int pid) {
        try 
            {
            
                Connection conn =load.Load.getInstance().getConnection();
            
                String query = "select * from Register where id = ?";

                PreparedStatement ps = conn.prepareStatement(query);
                Profiles p1= new Profiles();

               ps.setInt(1, pid);
  

                ResultSet rs =  ps.executeQuery();
                
                while(rs.next() )
                {
                    Profiles p =new Profiles();

                    p.setId(rs.getInt("ID"));
                    p.setName(rs.getString("NAME"));
                    p.setEmail(rs.getString("EMAIl"));
                    p.setContact(rs.getString("CONTACT"));
                    p.setPass(rs.getString("PASS"));
                    p.setRepass(rs.getString("REPASS"));

                    System.out.println(p.getName());      
                   System.out.println(p.getEmail());
                    return p;


                 }

        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
            
        return null;
    }

    @Override
    public void delete(int pid)
    {
        try
        {
            
            Connection conn =load.Load.getInstance().getConnection();
            
            String query = "delete from Register where id = ? ";
            
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
    public List<Profiles> getProfiles() {
        
            List<Profiles> list= new ArrayList<>();
            try 
            {
            
                Connection conn =load.Load.getInstance().getConnection();
            
                String query = "select * from Register";

                PreparedStatement ps = conn.prepareStatement(query);

                      
                ResultSet rs =  ps.executeQuery();
                
                while(rs.next() )
                {
                    Profiles p =new Profiles();

                    p.setId(rs.getInt("ID"));
                    p.setName(rs.getString("NAME"));
                    p.setEmail(rs.getString("EMAIl"));
                    p.setContact(rs.getString("CONTACT"));
                    p.setPass(rs.getString("PASS"));
                    p.setRepass(rs.getString("REPASS"));

                    System.out.println(p.getName());      
                    list.add(p);



                 }

        }
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
            
        return list;
    }

}