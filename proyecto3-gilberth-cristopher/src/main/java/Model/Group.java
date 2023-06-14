/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jimon
 */
public class Group {
    private String groupName;
    private List<User> members;
    
    public Group(String groupName) {
        setGroupName(groupName);
        setMembers(new ArrayList<>());
    }
    
    public Group(String groupName, List<User> members) {
        setGroupName(groupName);
        setMembers(members);
    }
    
    public void addUser(User user) {
        this.members.add(user);
    }

    public String getGroupName() {
        return groupName;
    }

    public List<User> getMembers() {
        return members;
    }

    private void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    private void setMembers(List<User> members) {
        this.members = members;
    }
    
    
}
