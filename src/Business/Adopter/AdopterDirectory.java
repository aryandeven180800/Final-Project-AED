/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Adopter;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author shrey
 */
public class AdopterDirectory {
    List<Adopter> adoptersList;
    private static AdopterDirectory adopterdirectory;
    
    public static AdopterDirectory getInstance(){
       
        if(adopterdirectory==null){
            adopterdirectory=new AdopterDirectory();
        }
        return adopterdirectory;  
    }

    public List<Adopter> getAdoptersList() {
        return adoptersList;
    }

    public void setAdoptersList(List<Adopter> adoptersList) {
        this.adoptersList = adoptersList;
    }
    
    public AdopterDirectory() {
        adoptersList = new ArrayList<Adopter>();
    }
    
    public Adopter addAdopter(){
     Adopter adopter = new Adopter();
        adoptersList.add(adopter);
      return adopter;
    }
}

    

