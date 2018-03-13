import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Desenhar2 extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Desenhar2 (){
		setSize(1200,900);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D)g;
		
		
		g2.setRenderingHint (RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		
		g2.setColor(Color.BLACK);
		
		g2.fillOval(10, 10, 200, 200);
		
		
		g2.setColor(Color.WHITE);
		
		g2.fillOval(80, 40, 100, 100);
		
		
		g2.setFont(new Font("Tohama", Font.BOLD, 64));
		
		g2.setColor(Color.BLACK);
		
		g2.drawString("8", 112, 110);
	}
	

}
