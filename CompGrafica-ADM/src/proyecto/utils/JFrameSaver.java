package proyecto.utils;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFrameSaver {

    public static void saveJFrameAsPNG(JFrame frame) {
        try {
            // Capture the JFrame contents as a BufferedImage
            Robot robot = new Robot();
            Rectangle area = new Rectangle(frame.getX(), frame.getY(), frame.getWidth(), frame.getHeight());
            BufferedImage bufferedImage = robot.createScreenCapture(area);

            // Prompt user to choose a save location using a file chooser
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Guardar Reporte como PNG");
            int result = fileChooser.showSaveDialog(frame);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();

                // Ensure the file has a .png extension
                if (!selectedFile.getName().endsWith(".png")) {
                    selectedFile = new File(selectedFile.getAbsolutePath() + ".png");
                }

                // Write the image to the selected file
                ImageIO.write(bufferedImage, "png", selectedFile);
                JOptionPane.showMessageDialog(null, "Reporte guardado como PNG satisfactoriamente", "Exportar Reporte:", JOptionPane.INFORMATION_MESSAGE); 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

