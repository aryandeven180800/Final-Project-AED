/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Adopter.AdopterDirectory;
import Business.Child.ChildDirectory;
import Business.Donor.DonorDirectory;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private ChildDirectory childdirectory;
    private AdopterDirectory adopterdirectory;
    private DonorDirectory donorDirectory;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        childdirectory = new ChildDirectory();
        adopterdirectory = new AdopterDirectory();
        donorDirectory = new DonorDirectory();
      
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
         if(this.business!=null){
           for (Network network : business.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equalsIgnoreCase(userName)) {
                        return false;
                    }
                }
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                        if (ua.getUsername().equalsIgnoreCase(userName)) {
                            return false;
                        }
                    }
                }
            }
        }

       }
        
        return true;
        
       
    }
    
    public boolean isUnique(String name){
        for(Network network : networkList){
            if(network.getName().equalsIgnoreCase(name)){
                return false;
            }
        }
        return true;
    }
    public static void setInstance(EcoSystem system) {
        business = system;
    }
    
        public ChildDirectory getChilddirectory() {
        return childdirectory;
    }

    public void setChilddirectory(ChildDirectory childdirectory) {
        this.childdirectory = childdirectory;
    }

    public AdopterDirectory getAdopterdirectory() {
        return adopterdirectory;
    }

    public void setAdopterdirectory(AdopterDirectory adopterdirectory) {
        this.adopterdirectory = adopterdirectory;
    }
    
    public DonorDirectory getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(DonorDirectory donorDirectory) {
        this.donorDirectory = donorDirectory;
    }
    
}
