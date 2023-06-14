/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Group;
import Model.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jimon
 */
public class FileSystem {
    private String name;
    private List<User> users;
    private List<Group> groups;
    private User currentUser;

     public FileSystem() {
        this.users = new ArrayList<>();
        this.groups = new ArrayList<>();
    }
     
    public void addUser(User user) {
        this.users.add(user);
    }

    public void addGroup(Group group) {
        this.groups.add(group);
    }

    
    public void switchUser(String username, String password) {
        for (User user : this.users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                this.currentUser = user;
                return;
            }
        }
        throw new IllegalArgumentException("Usuario o contraseña incorrecta");
    }
}
