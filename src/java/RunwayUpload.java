/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import runwayupload.runwaygettersetter;
import runwayupload.runwayinterImpl;
import javax.servlet.annotation.MultipartConfig;

/**
 *
 * @author hp1
 */
@MultipartConfig(maxFileSize = 10*1024*1024,maxRequestSize = 20*1024*1024,fileSizeThreshold = 5*1024*10)

public class RunwayUpload extends HttpServlet {

       
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet carupload</title>");            
            out.println("</head>");
            out.println("<body>");
            String runname=request.getParameter("runwayName");
           String runstate=request.getParameter("runwayState");
           String rundate=request.getParameter("runwayDate");
           
             
            
            Part p = request.getPart("runwayImage");
        
        byte b[] =new byte [p.getInputStream().available()];
        
        p.getInputStream().read(b);
        
    System.out.println(this.getServletContext().getRealPath("/"));
    
    
    File f = new File(this.getServletContext().getRealPath("/")+"/image.jpg");
    
    FileOutputStream fos = new FileOutputStream(f);
   
    fos.write(b);
    
    fos.close();
    
    //this is a cloudnery file
        Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name","homemate-com",
                "api_key", "713527897337554",
                "api_secret","M-kILmSewoL7RMcuSUs57M5Li2Y"));
        
        Map uploadResult = cloudinary.uploader().upload(f, ObjectUtils.emptyMap());
       System.out.println( uploadResult.get("secure_url"));
        
        
        
        String image=uploadResult.get("secure_url").toString();
        
          runwaygettersetter cgs = new runwaygettersetter();
            cgs.setRunwayName(runname);
            cgs.setRunwayState(runstate);
            cgs.setRunwayImage(image);
   cgs.setRunwayDate(rundate);
            runwayinterImpl impl=new runwayinterImpl();
            impl.insert(cgs);
            
            
            
    response.sendRedirect("Upload_Runways.jsp");
        
           
             out.println("</body>");
            out.println("</html>");
        }
    }
    
   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}