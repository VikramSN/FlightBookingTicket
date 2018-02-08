/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runwayupload;
import java.util.List;
/**
 *
 * @author MD. SALMAN
 */
public interface runwayinterface {
 
public void insert(runwaygettersetter cgs);
        List  getcar_info();
        void delete(int pid);
        void update(runwaygettersetter p);
runwaygettersetter getcargettersetter(int p);
}
