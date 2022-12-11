/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UAcc;

import Business.Employee.Employee;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class UserAccountDirectory {
    
    private ArrayList<UAcc> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UAcc> getUserAccountList() {
        return userAccountList;
    }
    
    public UAcc authenticateUser(String username, String password){
        for (UAcc ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UAcc createUserAccount(String username, String password, Employee employee, Role role){
        UAcc userAccount = new UAcc();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UAcc ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
