package proyecto;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.*;

public class BackgroundPanel extends JPanel {
        private Image imagen;
        private String url;
        
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource(url)).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
            
        }
    }

