/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sevletDU;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import profiles.ProfileDAO;
import profiles.ProfileDaoIMPl;
import profiles.Profiles;
/**
 *
 * @author MD. SALMAN
 */
public class DoUpDate extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
    String val[]=req.getParameterValues("UpDate");
        System.out.println("data");
        
        
        
        ProfileDAO pdao=new ProfileDaoIMPl();
        Profiles p=new Profiles();
        for(int i=0; i<val.length; i++)
        {
        switch(i)
        {
            case 0 : p.setId(Integer.parseInt(val[i])); break;
            case 1 : p.setName(val[i]); break;
            case 2 : p.setContact(val[i]); break;
            case 3 : p.setEmail(val[i]); break;
            
        }
        }

        pdao.update(p);
        resp.sendRedirect("View_User.jsp");
    }
    }

