import java.awt.*;

import javax.swing.*;


public class HiloRuta extends Thread{

	private JComponent d;
	private Color color;
	private int origen;
	private int destino;
	
	public HiloRuta(JComponent d, Color color, int inicio, int destino){
		this.d=d;
		this.color=color;
		this.origen=inicio;
		this.destino=destino;
		
	}
	public void run(){
		Graphics g=d.getGraphics();
		try {
			
			for(int i=origen;i<destino;i++){
				g.setColor(color);
				g.fillOval(i,60,8,8);
				Thread.sleep(5);
				 /*g.setColor (Color.white);
			    g.fillOval (i, 30, 5, 5);
			    if (i == 399)
			    {
				i = 0;
			    }*/
		     
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	
}
