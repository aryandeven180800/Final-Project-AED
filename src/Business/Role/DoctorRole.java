/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Adopter.AdpDirec;
import Business.Child.ChildDirectory;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UAcc.UAcc;
import javax.swing.JPanel;
import userinterface.DoctorOrg.DoctorWorkArea;

/**
 *
 * @author LENOVO
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UAcc account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory, AdpDirec adopterdirectory, DonorDirectory donorDirectory) {
        return new DoctorWorkArea(userProcessContainer, account, (DoctorOrganization) organization, enterprise, business, childdirectory);
    }
    
    @Override
    public String toString(){
        return (RoleType.Doctor.getValue());
    }
}
