/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frontend;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jimon
 */
public class Console extends JFrame{
    private JTextArea textArea;
    private JTextField inputField;  // Nuevo campo de texto para la entrada del usuario

    public Console() {
        super("Consola Virtual");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);

        this.textArea = new JTextArea();
        this.textArea.setEditable(false);
        this.textArea.setBackground(Color.BLACK);
        this.textArea.setForeground(Color.WHITE);
        this.textArea.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));

        this.inputField = new JTextField();  // Inicializa el campo de texto
        this.getContentPane().add(this.inputField, BorderLayout.SOUTH);  // Agrega el campo de texto a la ventana

        this.getContentPane().add(new JScrollPane(textArea), BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void write(String text) {
        this.textArea.append(text + "\n");
        this.textArea.setCaretPosition(this.textArea.getDocument().getLength());
    }
    
    // Getter para obtener el inputField desde otras clases
    public JTextField getInputField() {
        return this.inputField;
    }
}
