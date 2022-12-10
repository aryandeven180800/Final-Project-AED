/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Donor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shrey
 */
public class DonorDirectory {
    List<Donor> donorsList;
    private static DonorDirectory donordirectory;
    
    public static DonorDirectory getInstance(){
       
        if(donordirectory==null){
            donordirectory=new DonorDirectory();
        }
        return donordirectory;  
    }

    public List<Donor> getDonorsList() {
        return donorsList;
    }

    public void setDonorsList(List<Donor> donorsList) {
        this.donorsList = donorsList;
    }

   
    public static DonorDirectory getDirectory() {
        return donordirectory;
    }

    public static void setDirectory(DonorDirectory directory) {
        DonorDirectory.donordirectory = directory;
    }
    
    public DonorDirectory() {
        donorsList = new ArrayList<Donor>();
    }
    
    public Donor addDonor(){
     Donor donor = new Donor();
        donorsList.add(donor);
      return donor;
    }
    
}
