package profiles;

import java.util.List;

public interface ProfileDAO {
 
     void insert(Profiles p);
    void update(Profiles p);
    void delete(int pid);
    
    
    Profiles getProfiles(int pid);
    List<Profiles> getProfiles();
}
