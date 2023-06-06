package eksperimen;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SilentPhotoGUI {

    static {
        // Load the OpenCV library
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    private JFrame frame;
    private JPanel panel;
    private JButton captureButton;
    private JLabel imageLabel;

    public SilentPhotoGUI() {
        // Create the GUI components
        frame = new JFrame("Silent Photo");
        panel = new JPanel();
        captureButton = new JButton(new ImageIcon("camera.png"));
        imageLabel = new JLabel();
        
        // Add the components to the panel
        panel.add(captureButton);
        panel.add(imageLabel);

        // Add the panel to the frame
        frame.add(panel);

        // Set the frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        // Add a listener to the capture button
        captureButton.addActionListener(e -> {
            // Create a new video capture object
            VideoCapture capture = new VideoCapture(0);

            // Check if the camera is opened successfully
            if (capture.isOpened()) {
                // Create a new Mat object to store the captured image
                Mat image = new Mat();

                // Capture a frame from the camera
                capture.read(image);

                // Convert the Mat object to a BufferedImage
                BufferedImage bufferedImage = new BufferedImage(image.width(), image.height(), BufferedImage.TYPE_3BYTE_BGR);
                image.get(0, 0, ((DataBufferByte) bufferedImage.getRaster().getDataBuffer()).getData());

                // Set the image to the label
                imageLabel.setIcon(new ImageIcon(bufferedImage));

                // Save the image to a file
                File file = new File("silentPhoto/image.png");
                try {
                    ImageIO.write(bufferedImage, "png", file);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            } else {
                System.err.println("Could not open camera");
            }

            // Release the video capture object
            capture.release();
        });
    }

    public static void main(String[] args) {
        new SilentPhotoGUI();
    }
}

