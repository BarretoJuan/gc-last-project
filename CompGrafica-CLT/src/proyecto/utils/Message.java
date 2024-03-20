package proyecto.utils;

import javax.swing.JOptionPane;

public class Message {
	private boolean status;
	private String content;
	
	public Message(boolean status, String content) {
		this.status = status;
		this.content = content;
                JOptionPane.showMessageDialog(null, content, "Alerta:", JOptionPane.WARNING_MESSAGE);
	}
        
        public boolean getStatus() {
            return this.status;
        }
}
