/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Pet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shrey
 */
public class PetDirectory {
    List<Child> childList;
    private static ChildDirectory childdirectory;

    public static ChildDirectory getInstance() {
        if (childdirectory == null) {
            childdirectory = new ChildDirectory();
        }
        return childdirectory;
    }

    public List<Child> getChildList() {
        return childList;
    }

    public void setChildList(List<Child> childList) {
        this.childList = childList;
    }

    public ChildDirectory() {
        childList = new ArrayList<Child>();
    }

    public Child addChild() {
        Child ch = new Child();
        childList.add(ch);
        return ch;
    }

    public void removeChild(Child ch) {
        childList.remove(ch);
    }

}

    
}
