/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import userinterface.FundingFinanceRole.FundingWorkArea;


/**
 *
 * @author anushree_j
 */
public class FundingFinanceRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UAcc account, Organization organization, Enterprise enterprise, EcoSystem business, ChildDirectory childdirectory, AdpDirec adopterdirectory,DonorDirectory donorDirectory) {
        return new FundingWorkArea(userProcessContainer, account, organization, enterprise, business, childdirectory);
    }
     @Override
    public String toString(){
        return (RoleType.Finance.getValue());
    }
}
