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
import Business.Organization.Organization;
import Business.UAcc.UAcc;

import javax.swing.JPanel;
import userinterface.labOrganisation.LabWorkArea;

/**
 *
 * @author anushree_j
 */
public class LabAssistantRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UAcc account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory, AdpDirec adopterdirectory, DonorDirectory donorDirectory) {
        return new LabWorkArea(userProcessContainer, account, organization, business);
    }
    
    @Override
    public String toString(){
        return (RoleType.LabAssistant.getValue());
    }
     
}
