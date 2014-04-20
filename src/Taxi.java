import javax.swing.*;


public class Taxi extends JLabel{
	private ImageIcon taxi;
	public Taxi(){
		taxi=new ImageIcon("imagenes/taxi_derecho.png");
		taxi=new ImageIcon(taxi.getImage().getScaledInstance(80, 80, 1));
		setIcon(taxi);
		setSize(50,50);
		
		
	}
	public void CambiarImagDerecho() {
		taxi = new ImageIcon("imagenes/taxi_derecho.png");
		taxi = new ImageIcon(taxi.getImage().getScaledInstance(80,
				80, 1));
		setIcon(taxi);
		setSize(5,3 );
	}
	public void CambiarImagAbajo() {
		taxi = new ImageIcon("imagenes/taxi_abajo.png");
		taxi = new ImageIcon(taxi.getImage().getScaledInstance(80,
				80, 1));
		setIcon(taxi);
		setSize(50, 50);
	}
	public void CambiarImagArriba() {
		taxi = new ImageIcon("imagenes/taxi_arriba.png");
		taxi = new ImageIcon(taxi.getImage().getScaledInstance(80,
				80, 1));
		setIcon(taxi);
		setSize(50, 50);
	}
	public void CambiarImagAtras() {
		taxi = new ImageIcon("imagenes/taxi_atras.png");
		taxi = new ImageIcon(taxi.getImage().getScaledInstance(80,
				80, 1));
		setIcon(taxi);
		setSize(50, 50);
	}
	public void CambiarImagRuta() {
		taxi = new ImageIcon("imagenes/ruta.png");
		taxi = new ImageIcon(taxi.getImage().getScaledInstance(80,
				80, 1));
		setIcon(taxi);
		setSize(50, 50);
	}
	public void cambiarFalso() {
		taxi = new ImageIcon("");
		setIcon(taxi);
		setSize(50,50);
	}
	

}
