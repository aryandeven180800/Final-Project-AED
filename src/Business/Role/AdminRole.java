/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.Adopter.AdopterDirectory;
import Business.Child.ChildDirectory;
import Business.Donor.DonorDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;

import javax.swing.JPanel;
import userinterface.AdministrativeRole.AdminWorkAreaJPanel;

/**
 *
 * @author shrey
 */
public class AdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory, AdopterDirectory adopterdirectory,DonorDirectory donorDirectory) {
       return new AdminWorkAreaJPanel(userProcessContainer,account,organization, enterprise, business,childdirectory,adopterdirectory,donorDirectory);
       
    }

    
    
}
