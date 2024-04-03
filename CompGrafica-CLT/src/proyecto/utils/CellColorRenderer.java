package proyecto.utils;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.*;
import java.awt.*;
import proyecto.utils.Colors;


public class CellColorRenderer extends DefaultTableCellRenderer {

  private int targetColumn; // The column index you want to color

  public CellColorRenderer(int targetColumn) {
    this.targetColumn = targetColumn;
  }

  @Override
  public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                                                 boolean hasFocus, int row, int column) {
    JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
    if (column == targetColumn) {
      // Set the foreground color based on your logic (e.g., value)
      label.setForeground(value.toString().contains("No") ? Colors.notAnsweredColor : Colors.answeredColor);
    }
    return label;
  }
}


