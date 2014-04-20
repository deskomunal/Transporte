import javax.swing.*;


public class HiloTaxi extends Thread{
	private Taxi taxi;
	private Fondo fondo;
	private int a;
	private int b;
	
	public HiloTaxi(Taxi taxi, Fondo fondo, int a, int b){
		this.taxi=taxi;
		this.fondo=fondo;
		this.a=a;
		this.b=b;
	}
	public void run(){
		for(int j=1;j<=3;j++){
		System.out.println("taxi va" );
		/*int x=Integer.parseInt(a.getText());
		int y=Integer.parseInt(b.getText());*/
		
		vaDerecho(a,b);
		}
	}
	public void vaDerecho(int x, int y){
		taxi.CambiarImagDerecho();
		try{
			for(int i=x;i<y;i++){
		
			taxi.setLocation(i, y);
			fondo.add(taxi);
			Thread.sleep(5);
			fondo.repaint();
			}
			
		}
		catch (InterruptedException e){}
		
			
		

		
	}
	public void vaArriba(int x, int y){
		
	}
	public void vaAbajo(int x, int y){
		
	}
	public void vaAtras(int x, int y){
		
	}

}
