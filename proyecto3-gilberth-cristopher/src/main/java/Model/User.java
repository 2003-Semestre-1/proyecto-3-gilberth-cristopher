/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jimon
 */
public class User {
    private String username;
    private String fullName;
    private String password;
    
    
    public User(String username, String fullName, String password) {
        setUsername(username);
        setFullName(fullName);
        setPassword(password);
    }

    public String getUsername() {
        return username;
    }

    public String getFullName() {
        return fullName;
    }
    
    public String getPassword() {
        return password;
    }

    private void setUsername(String username) {
        this.username = username;
    }

    private void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    private void setPassword(String password) {
        this.password = password;
    }
    
    
}
