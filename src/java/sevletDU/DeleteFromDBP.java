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
import runwayupload.runwayinterface;
import runwayupload.runwayinterImpl;

/**
 *
 * @author hp1
 */
@WebServlet(name = "DeleteFromDBP", urlPatterns = {"/DeleteFromDBP"})
public class DeleteFromDBP extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        int id = Integer.parseInt(req.getParameter("id") );
        
        runwayinterface pdao = new runwayinterImpl();
       
        pdao.delete(id);
         
        resp.sendRedirect("View_Runways.jsp");
        
    }
    
    
    
}