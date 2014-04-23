import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.MatteBorder;



public class Interfaz extends JFrame implements ActionListener{
	
	private Fondo panel;
	private MatteBorder borde;
	private Color color;

	private ImageIcon imagen;
	private JButton jbt_aceptar;
	private JButton jbt_cancelar;
	private JLabel jlb_origen;
	private JLabel jlb_destino;
	
	private JComboBox jcb_oriVer;
	private String [] vertical={"Av. Ayacucho","Nataniel Aguirre",
			"Esteban Arce", "25 de Mayo"," San Martin"," Lanza",
			" Antezana"," 16 de Julio"," Av. Oquendo "};
	private JComboBox jcb_oriHori;
	private String [] horizontal={"Av. Heroinas","Bolivar","Sucre",
			"Jordan","Calama","Ladislao Cabrera","Uruguay","Aroma"};
	private JComboBox jcb_desVer;
	private JComboBox jcb_desHori;
	
	private JTextArea area; 

	private Taxi taxi;
	
	private HiloRuta ruta;
	private HiloTaxi hilo;
	
	
	
	private JScrollPane scroll;
	
	
	
	public Interfaz(){
		super("Transporte y Diseño");
		setBounds(140,140,800,650);
		setLayout(null);
		
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addComponent();
		setVisible(true);
		jbt_aceptar.addActionListener(this);
		jbt_cancelar.addActionListener(this);
		

		
		
		
	}

	
	private void addComponent() {
		
		
		jbt_aceptar=new JButton("aceptar");
		jbt_cancelar=new JButton("cancelar");
		
		
		jcb_oriVer=new JComboBox(vertical);
		jcb_oriHori=new JComboBox(horizontal);
		jcb_desVer=new JComboBox(vertical);
		jcb_desHori=new JComboBox(horizontal);
		
		jlb_origen=new JLabel("Origen:");
		jlb_destino=new JLabel("Destino:");
		
		panel=new Fondo();
		panel.setLayout(new BorderLayout());
		color=color.black;
		borde=new MatteBorder(2,2,2,2,color);
		panel.setBorder(borde);
		area=new JTextArea();
		area.setLayout(new BorderLayout());
		area.setBorder(borde);
		scroll=new JScrollPane(area);
		scroll.setBounds(50,500,542,100);

		
		
		jlb_origen.setBounds(610,50,60,20);
		jlb_destino.setBounds(610,110,60,20);
		
		jcb_oriVer.setBounds(660,50, 118, 20);
		jcb_oriHori.setBounds(660,80, 118, 20);
		
		jcb_desVer.setBounds(660,110, 118, 20);
		jcb_desHori.setBounds(660,140, 118, 20);
		
		jbt_aceptar.setBounds(610,180, 85, 20);
		jbt_cancelar.setBounds(610,210, 85, 20);

		
		
		panel.setBounds(50,50,542,437);
		
		
		
		
		add(jlb_origen);
		add(jlb_destino);
		add(jcb_oriVer);
		add(jcb_oriHori);
		add(jcb_desVer);
		add(jcb_desHori);
		add(jbt_aceptar);
		add(jbt_cancelar);
		add(panel);
		add(scroll);

		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbt_aceptar){
			Object x = jcb_oriHori.getSelectedItem();
			Object y = jcb_oriVer.getSelectedItem();
			Object z = jcb_desHori.getSelectedItem();
			Object k = jcb_desVer.getSelectedItem();
			
			ruta=new HiloRuta(panel,Color.green,11,520);
			System.err.println(jcb_oriVer+","+jcb_oriHori+","+jcb_desVer+","+jcb_desHori+","+"aceptar");
			
			/*hilo=new HiloTaxi(taxi, panel,origen, destino);
			hilo.start();*/
			
			if(ruta.isAlive()){//&& hilo.isAlive()){
				ruta.resume();
				//hilo.resume();
			}
			else
				ruta.start();
				//hilo.start();
				
		
		}
		else if(e.getSource()==jbt_cancelar){
			
			panel.repaint();
			
		}
	
}
}
