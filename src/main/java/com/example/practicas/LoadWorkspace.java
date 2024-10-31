package com.example.practicas;

import javax.swing.Timer;
import java.io.IOException;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class LoadWorkspace {
    public static void main(String[] args){
        try {

            ProcessBuilder vsCode = new ProcessBuilder("C:\\Users\\Admin\\AppData\\Local\\Programs\\Microsoft VS Code\\Code.exe");
            vsCode.start();

            ProcessBuilder gitBash = new ProcessBuilder("C:\\Program Files\\Git\\git-bash.exe");
            gitBash.start();

            ProcessBuilder brave = new ProcessBuilder("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
            brave.start();

            Thread.sleep(2000);

            mostrarVentanaBienvenida();

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    private static void mostrarVentanaBienvenida() {
        JFrame frame = new JFrame("Loading...");
        frame.setSize(500, 400); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("¡Welcome Luis Felipe!", SwingConstants.CENTER);
        label.setBounds(150, 20, 200, 30);
        label.setFont(new Font("Serif", Font.BOLD, 20));
        frame.add(label);

        JTextArea logoArea = new JTextArea();
        logoArea.setEditable(false);
        logoArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        logoArea.setText(
                "      _.._..,_,_\n" +
                "     (          )\n" +
                "      ]~,\"-.-~~[\n" +
                "    .=])' (;  ( [\n" +
                "    | ]:: '    [)\n" +
                "    '=]): .)  ( [\n" +
                "      |:: '    |\n" +
                "       ~~----~~\n\n" +
                "    ¡Salud!"
        );
        logoArea.setBounds(100, 80, 300, 250);
        frame.add(logoArea);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    Timer timer = new Timer(5000, e -> frame.dispose());
    timer.setRepeats(false);
    timer.start();
    }
}
