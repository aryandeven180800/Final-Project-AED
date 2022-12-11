/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UAcc.UAcc;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public abstract class WorkRequest {

    private String message;
    private UAcc sender;
    private UAcc receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private int childId;
    private int userId;
    private String childName;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UAcc getSender() {
        return sender;
    }

    public void setSender(UAcc sender) {
        this.sender = sender;
    }

    public UAcc getReceiver() {
        return receiver;
    }

    public void setReceiver(UAcc receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }
    
    @Override
    public String toString(){
        return message;
    }
    
}
