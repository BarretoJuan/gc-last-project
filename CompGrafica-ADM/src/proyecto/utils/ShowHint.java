package proyecto.utils;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
// import TextPrompt from swingx located at java-swing-project/lib/swingx-all-1.6.4.jar

public class ShowHint {

            public static void setHint(String hint, JTextField field) {
        TextPrompt textHint = new TextPrompt(hint, field);
        textHint.setFont(field.getFont());
        textHint.setForeground(Colors.darkBlue);
        textHint.changeAlpha(0.5f);

    }

}