/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;
import Business.Role.CriminalCheckRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shrey
 */

    public class BackgroundAndCriminalCheckOrganization extends Organization{
    String name;
    public BackgroundAndCriminalCheckOrganization(String name) {
        super(name);
        this.name=name;
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CriminalCheckRole());
        return roles;
    }
    
    @Override
    public Type getType() {
        return  Organization.Type.CriminalCheck;
    }
    
}
