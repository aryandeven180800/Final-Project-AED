/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pet;
import java.util.Date;


/**
 *
 * @author shrey
 */
public class Pet {
    int childId;
    String name;
    int childAge;
    String status;
    String imageDetails;
    String identificationMark;
    String gender;
    private static int count = 1;
    Date registrationDate;
    String medicalStatus;
    private double BP;
    private double pulseRate;
    private double respirationRate;
    private double bodytemp;
    private boolean financialHelp;
    private String amt;
    private boolean medicalHelp;
    private boolean isSpecialChild;

    public double getBP() {
        return BP;
    }

    public void setBP(double BP) {
        this.BP = BP;
    }
    
}
