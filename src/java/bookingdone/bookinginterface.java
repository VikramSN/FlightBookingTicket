/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingdone;
import java.util.List;
/**
 *
 * @author MD. SALMAN
 */
public interface bookinginterface {
 
public void insert(bookinggettersetter cgs);
        List  getbooking_info();
        void delete(int pid);
        void update(bookinggettersetter p);
bookinggettersetter getcargettersetter(int p);
}
