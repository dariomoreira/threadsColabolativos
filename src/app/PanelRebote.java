package app;
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

@SuppressWarnings("serial")
public class PanelRebote extends JPanel{
    Integer x;
    Integer y;
    Integer dx=2;
    Integer dy=1;

    Integer alto = 400;
    Integer ancho = 600;

    public PanelRebote(){
        x = 0;
        y = 0;

    }

    public void mover() {
		x+=dx;
        y+=dy;
    
        if(y>=alto)
            dy = -dy;
        if(x>=ancho)
            dx = -dx;
        if(y<0)
            dy = -dy;
        if(x<0)
            dx = -dx;
    }

    @Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.fillOval(x, y, 20, 20);
    }
    
}