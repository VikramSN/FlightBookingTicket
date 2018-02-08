/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flightupload;
import java.util.List;
/**
 *
 * @author MD. SALMAN
 */
public interface flightinterface {
 
public void insert(flightgettersetter cgs);
        List  getcar_info();
        void delete(int pid);
        void update(flightgettersetter p);
flightgettersetter getflightgettersetter(int p);
}
