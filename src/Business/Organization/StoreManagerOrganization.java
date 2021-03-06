/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.StoreManagerRole;
import java.util.ArrayList;

/**
 *
 * @author aman9
 */
public class StoreManagerOrganization extends Organization {
    
    public StoreManagerOrganization() {
        super(Organization.Type.StoreManager.getValue());
        
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new StoreManagerRole());
        return roles;
    }
    
}
