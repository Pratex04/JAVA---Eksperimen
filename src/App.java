import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame {

   public App() {
      super("Buka WhatsApp");
      setLayout(new FlowLayout());
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // buat tombol yang dapat diklik
      JButton button = new JButton("Buka WhatsApp");
      button.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            try {
               // Temukan file shortcut WhatsApp di desktop
               File desktop = new File(System.getProperty("user.home"), "Desktop");
               File whatsappShortcut = new File(desktop, "WhatsApp.lnk");
               if (!whatsappShortcut.exists()) {
                   System.out.println("File shortcut WhatsApp tidak ditemukan di desktop");
                   return;
               }

               // Buka file shortcut dengan Desktop API
               Desktop.getDesktop().open(whatsappShortcut);
            } catch (IOException ex) {
               System.out.println("Tidak dapat membuka WhatsApp");
            }
         }
      });
      add(button);

      setSize(200, 200);
      setVisible(true);
   }

   public static void main(String[] args) {
      new App();
   }
}
