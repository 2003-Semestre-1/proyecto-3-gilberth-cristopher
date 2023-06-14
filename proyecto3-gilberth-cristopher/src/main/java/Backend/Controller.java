/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import Frontend.Console;
import Model.FileSystem;
import Model.User;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author jimon
 */
public class Controller {
    
    private FileSystem fileSystem;
    private Console console;

    public Controller() {
        this.fileSystem = new FileSystem();
        this.console = new Console();
        // Agrega un ActionListener a tu inputField
        this.console.getInputField().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("0");
                String command = console.getInputField().getText();
                executeCommand(command);
                console.getInputField().setText("");  // Limpiar el inputField después de cada comando
            }
        });
    }

    public void executeCommand(String command) {
        String[] parts = command.split(" ");
        String cmd = parts[0];
        switch(cmd) {
            case "useradd":
                User newUser = new User("asdasd","asdas","asdasd");
                fileSystem.addUser(newUser);
                console.write("Usuario añadido exitosamente");
                break;
            default:
                console.write("Comando no reconocido");
        }
    }
    
}
