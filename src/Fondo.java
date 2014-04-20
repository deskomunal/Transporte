import java.awt.Graphics;

import javax.swing.*;


public class Fondo extends JPanel{
	ImageIcon imagen_fondo;
	public Fondo(){
		super();
		inicializar();
		imagen_fondo=new ImageIcon("imagenes/fondo1.gif");
		setSize(imagen_fondo.getIconWidth(),imagen_fondo.getIconHeight());
	}
	public void paint(Graphics g){
		g.drawImage(imagen_fondo.getImage(),0,0,getWidth(),getHeight(),null);
		this.setOpaque(false);
		super.paint(g);
	}
	private void inicializar(){
		this.setSize(100,100);
	}

}
