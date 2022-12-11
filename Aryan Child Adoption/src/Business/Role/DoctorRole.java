/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Adopter.AdopterDirectory;
import Business.Child.ChildDirectory;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.DoctorOrg.DoctorWorkArea;

/**
 *
 * @author raunak
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory, AdopterDirectory adopterdirectory, DonorDirectory donorDirectory) {
        return new DoctorWorkArea(userProcessContainer, account, (DoctorOrganization) organization, enterprise, business, childdirectory);
    }
    
    @Override
    public String toString(){
        return (RoleType.Doctor.getValue());
    }
}
