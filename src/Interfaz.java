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
	private JTextField txt_origen;
	private JTextField txt_destino;
	private Taxi taxi;
	
	private HiloRuta ruta;
	private HiloTaxi hilo;
	
	
	
	private JScrollPane scroll;
	
	
	
	public Interfaz(){
		super("Transporte y Diseño");
		setBounds(140,140,800,600);
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
		
		txt_origen=new JTextField();
		txt_destino=new JTextField();
		jlb_origen=new JLabel("Origen:");
		jlb_destino=new JLabel("Destino:");
		
		panel=new Fondo();
		panel.setLayout(new BorderLayout());
		color=color.black;
		borde=new MatteBorder(2,2,2,2,color);
		panel.setBorder(borde);
		
		
		jlb_origen.setBounds(630,50,60,20);
		jlb_destino.setBounds(630,80,60,20);
		txt_origen.setBounds(680,50, 30, 20);
		txt_destino.setBounds(680,80, 30, 20);
		
		jbt_aceptar.setBounds(630,130, 85, 20);
		jbt_cancelar.setBounds(630,160, 85, 20);

		scroll=new JScrollPane(panel);
		//scroll.setViewportView(panel);
		
		scroll.setBounds(50,50,542,437);
		
		
		
		
		add(jlb_origen);
		add(jlb_destino);
		add(txt_origen);
		add(txt_destino);
		add(jbt_aceptar);
		add(jbt_cancelar);
		add(scroll);

		
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jbt_aceptar){
			int origen=Integer.parseInt(txt_origen.getText());
			int destino=Integer.parseInt(txt_destino.getText());
			ruta=new HiloRuta(panel,Color.green,origen,destino);
			System.err.println(origen+","+destino+","+"aceptar");
			
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
			txt_origen.setText("");
			txt_destino.setText("");
		}
	
}
}
