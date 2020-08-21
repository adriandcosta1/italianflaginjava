
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;


public class flagFrame extends Frame {

	private PolandFlagCanvas polandFlagCanvas = null;
	private static final long serialVersionUID = 1L;
	/**
	 * @param args
	 */
	

	/**
	 * This is the default constructor
	 */
	public flagFrame() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setLayout(null);
		this.setSize(576, 398);
		this.setTitle("National Flag of Italy");
		polandFlagCanvas = getPolandFlagCanvas();
		this.add(polandFlagCanvas);
		final flagFrame polishFlag = this;
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				System.exit(0);
			}

		});
	this.repaint();
	}
	
	/**
	 * Initializes Bangladesh Flag Canvas.
	 * 
	 * @return BdeshFlagCanvas
	 */
	private PolandFlagCanvas getPolandFlagCanvas() {
		if (polandFlagCanvas == null) {
			polandFlagCanvas = new PolandFlagCanvas();
			polandFlagCanvas.setSize(new Dimension(520, 420));
		}
		return polandFlagCanvas;
	}

	public static void main(String[] args){
		flagFrame Poland = new flagFrame();
		Poland.setVisible(true);
	}
}


/**
 * A canvas to draw national flag of Bangladesh.
 * 
 * @author Adrian D'Costa
 * @version 1.0
 *
 */
class PolandFlagCanvas extends Canvas {
	public static final long serialVersionUID = 1L;

	/**
	 * A method to paint the flag and draw String.
	 * 
	 * @param g
	 * 			Graphics
	 */
	public void paint(Graphics g) {

		super.paint(g);
		
		int R = 0;
		int G = 146;
		int B = 70;
		Color rectColor = new Color(R, G, B);
		g.setColor(rectColor);
		g.fillRect(60, 85, 133,250);
		
		
		int R1 = 255;
		int G1 = 255;
		int B1 = 255;
		Color rectColor1 = new Color(R1, G1, B1);
		g.setColor(rectColor1);
		g.fillRect(193, 85, 133, 250);
		
		int R2 = 206;
		int G2 = 43;
		int B2 = 55;
		Color rectColor2 = new Color(R2, G2, B2);
		g.setColor(rectColor2);
		g.fillRect(326, 85, 133, 250);
		
		Font myFont = new Font("Monospaced", Font.BOLD, 20);
		g.setFont(myFont);
		g.setColor(Color.BLUE);
		g.drawString("National Flag of Italy", 130, 370);

	}
}