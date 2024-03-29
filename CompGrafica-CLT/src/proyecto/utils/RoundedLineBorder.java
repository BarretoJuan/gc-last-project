/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.utils;

import javax.swing.border.AbstractBorder;
import javax.swing.*;
import java.awt.*;

public class RoundedLineBorder extends AbstractBorder {
    int lineSize, cornerSize;
    Paint fill;
    Stroke stroke;
    private Object aaHint;

    public RoundedLineBorder(Paint fill, int lineSize, int cornerSize) {
        this.fill = fill;
        this.lineSize = lineSize;
        this.cornerSize = cornerSize;
        stroke = new BasicStroke(lineSize);
    }
    public RoundedLineBorder(Paint fill, int lineSize, int cornerSize, boolean antiAlias) {
        this.fill = fill;
        this.lineSize = lineSize;
        this.cornerSize = cornerSize;
        stroke = new BasicStroke(lineSize);
        aaHint = antiAlias? RenderingHints.VALUE_ANTIALIAS_ON: RenderingHints.VALUE_ANTIALIAS_OFF;
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        int size = Math.max(lineSize, cornerSize);
        if(insets == null) insets = new Insets(size, size, size, size);
        else insets.left = insets.top = insets.right = insets.bottom = size;
        return insets;
    }

    @Override
    public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
        Graphics2D g2d = (Graphics2D)g;
        Paint oldPaint = g2d.getPaint();
        Stroke oldStroke = g2d.getStroke();
        Object oldAA = g2d.getRenderingHint(RenderingHints.KEY_ANTIALIASING);
        try {
            g2d.setPaint(fill!=null? fill: c.getForeground());
            g2d.setStroke(stroke);
            if(aaHint != null) g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, aaHint);
            int off = lineSize >> 1;
            g2d.fillRoundRect(x+off, y+off, width-lineSize, height-lineSize, cornerSize, cornerSize);
        }
        finally {
            g2d.setPaint(oldPaint);
            g2d.setStroke(oldStroke);
            if(aaHint != null) g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, oldAA);
        }
    }
}