package Proyecto;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Vista extends JFrame {
	
	
	private JButton b;
    private JButton buttonAbonar, buttonRetirar, buttonComprarPagar, 
    buttonComprarInversion, buttonRecibirTransferencia, buttonRealizarTransferencia, 
    buttonGenerarCorte, buttonSimulacion, buttonAddUser, buttonAddConto;
    public ArrayList<JButton> botones = new ArrayList<JButton>();
    public ArrayList<JTextField> textos = new ArrayList<JTextField>();
    private JTextField tf;
    public JLabel labelPanel;
    private JPanel p1,p2,p3;
    private int valido=230;
    
    public int getValido(){
        return valido;
    }
    
    public void setValido(int val){
        valido=val;
    }
    
    // Not used anymore
    private String[] OP={"Abonar","Retirar","Comprar/Pagar","Comprar inversion","Recibir Transferencia","Realizar Transferencia","Generar Corte","Simulacion"};
    
    public Vista(int a){
        switch(a){
            case 1:
                crearAbonar();
                break;
            case 2:
                crearRetirar();
                break;
            case 3:
                crearComPag();
                break;
            case 4:
                crearComInv();
                break;
            case 5:
                crearRecTrans();
                break;
            case 6:
                crearReaTrans();
                break;
            default:
                crearP();
                break;
        }
    }
    
    //**********************************//
    // Create the Window and the layout //
    //**********************************//

    public void crearP(){
    	
        getContentPane().setLayout(new BorderLayout());
        
        // Create two JPanels one on top on the other
        p1 = new JPanel();
        p2 = new JPanel();
        
        // Set the grid layout        
        p1.setLayout(new GridLayout(5,2));
        p2.setLayout(new GridLayout(2,1));
        
        //********************//
        // Create the buttons //
        //********************//
        
        buttonAbonar = new JButton("Abonar");
        botones.add(buttonAbonar);
        
        buttonRetirar = new JButton("Retirar");
        botones.add(buttonRetirar);

        buttonComprarPagar = new JButton("Comprar/Pagar");
        botones.add(buttonComprarPagar);

        buttonComprarInversion = new JButton("Comprar inversion");
        botones.add(buttonComprarInversion);

        buttonRecibirTransferencia = new JButton("Recibir Transferencia");
        botones.add(buttonRecibirTransferencia);

        buttonRealizarTransferencia = new JButton("Realizar Transferencia"); 
        botones.add(buttonRealizarTransferencia);

        buttonGenerarCorte = new JButton("Generar Corte");
        botones.add(buttonGenerarCorte);

        buttonSimulacion= new JButton("Simulacion");        
        botones.add(buttonSimulacion);

        buttonAddConto= new JButton("Add a conto");        
        botones.add(buttonAddConto);
        
        buttonAddUser= new JButton("Add a user");        
        botones.add(buttonAddUser);
        
        // Set the size for the buttons
        for(JButton x:botones){
            x.setMaximumSize(new Dimension(250,250));
            x.setMinimumSize(new Dimension(200,200));
            x.setPreferredSize(new Dimension(200,200));
            // Adding the button to the view
            p1.add(x);
        }
        
        //***************************//
        // Adding a text to a JLabel //
        //***************************//

        labelPanel = new JLabel("  Estado...");
        p2.add(labelPanel);
        
        //*******************************//
        // Adding a text to a JTextField //
        // To display the errors..		 //
        //*******************************//
        
        tf = new JTextField("Detalles del error...");
        textos.add(tf);
        p2.add(textos.get(0));
        
        // Setting the layout of the Panels
        add(p1, BorderLayout.WEST);
        add(p2, BorderLayout.CENTER);
    }
    
    
    //********************//
    
    public void crearAbonar(){
        getContentPane().setLayout(new BorderLayout());
        p1=new JPanel();
		p2=new JPanel();
        String[] a={"Regresar","Continuar"},c={"Cuenta","Monto"};
        p1.setLayout(new GridLayout(1,3));
        for(int x=0;x<c.length;x++){
            tf=new JTextField(c[x]);
            tf.setPreferredSize(new Dimension(10,100));
            textos.add(tf);
            System.out.println(textos.get(0).getText());
            p1.add(textos.get(x));
        }
        add(p1, BorderLayout.NORTH);
        for(int x=0;x<2;x++){
            b=new JButton(a[x]);
            botones.add(b);
        }
        p2.setLayout(new GridLayout(1,2));
        for(JButton x:botones){
            x.setPreferredSize(new Dimension(200,200));
            p2.add(x);
        }
        add(p2, BorderLayout.SOUTH);
    }
    public void crearRetirar(){ // G : Es necesario crear 2 metodos que son exactamente las mismas?? (crearAbonar = crearRetirar) :thinking:
        getContentPane().setLayout(new BorderLayout());
        p1=new JPanel();
		p2=new JPanel();
        String[] a={"Regresar","Continuar"},c={"Cuenta","Monto"};
        p1.setLayout(new GridLayout(1,3));
        for(int x=0;x<c.length;x++){
            tf=new JTextField(c[x]);
            tf.setPreferredSize(new Dimension(10,100));
            textos.add(tf);
            p1.add(textos.get(x));
        }
        add(p1, BorderLayout.NORTH);
        for(int x=0;x<2;x++){
            b=new JButton(a[x]);
            botones.add(b);
        }
        p2.setLayout(new GridLayout(1,2));
        for(JButton x:botones){
            x.setPreferredSize(new Dimension(110,110));
            p2.add(x);
        }
        add(p2, BorderLayout.SOUTH);
    }
    public void crearComPag(){
        getContentPane().setLayout(new BorderLayout());
        p1=new JPanel();
		p2=new JPanel();
        String[] a={"Regresar","Pagar/Comprar"},c={"Cuenta","Monto/Cuotas","Descripcion"}; // G : falta Cuotas (igual TODO en Operaciones)
        p1.setLayout(new GridLayout(1,2));
        for(int x=0;x<2;x++){
            b=new JButton(a[x]);
            botones.add(b);
        }
        for(JButton x:botones){
            x.setPreferredSize(new Dimension(110,110));
            p1.add(x);
        }
        add(p1, BorderLayout.SOUTH);
        p2.setLayout(new GridLayout(1,3));
        for(int x=0;x<3;x++){
            tf=new JTextField(c[x]);
            tf.setPreferredSize(new Dimension(10,100));
            textos.add(tf);
        }
        for(JTextField x:textos){
            p2.add(x);
        }
        add(p2, BorderLayout.NORTH);
    }
    public void crearComInv(){
        getContentPane().setLayout(new BorderLayout());
        p1=new JPanel();
        p2=new JPanel();
        String[] a={"Regresar","Continuar"},c={"Cuenta","Monto"};
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new GridLayout(1,3));
        for(int x=0;x<2;x++){
            b=new JButton(a[x]);
            botones.add(b);
        }
        for(JButton x:botones){
            x.setPreferredSize(new Dimension(110,110));
            p1.add(x);
        }
        add(p1, BorderLayout.SOUTH);
        for(int x=0;x<2;x++){
            tf=new JTextField(c[x]);
            tf.setPreferredSize(new Dimension(10,100));
            textos.add(tf);
            p1.add(textos.get(x));
        }
        add(p2, BorderLayout.NORTH);
    }
    public void crearRecTrans(){
        getContentPane().setLayout(new BorderLayout());
        p1=new JPanel();
        p2=new JPanel();
        String[] a={"Regresar","Continuar"},c={"Cuenta de origen","Monto","Cuenta de destino"};
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new GridLayout(1,3));
        for(int x=0;x<2;x++){
            b=new JButton(a[x]);
            botones.add(b);
        }
        for(JButton x:botones){
            x.setPreferredSize(new Dimension(110,110));
            p1.add(x);
        }
        add(p1, BorderLayout.SOUTH);
        for(int x=0;x<3;x++){
            tf=new JTextField(c[x]);
            tf.setPreferredSize(new Dimension(10,100));
            textos.add(tf);
            p1.add(textos.get(x));
        }
        add(p2, BorderLayout.NORTH);
    }

	public void crearReaTrans(){
	    getContentPane().setLayout(new BorderLayout());
	    p1=new JPanel();
	    p2=new JPanel();
	    String[] a={"Regresar","Continuar"},c={"Cuenta de origen","Monto","Cuenta de destino"};
	    p1.setLayout(new GridLayout(1,2));
	    p2.setLayout(new GridLayout(1,3));
	    for(int x=0;x<2;x++){
	        b=new JButton(a[x]);
	        botones.add(b);
	    }
	    for(JButton x:botones){
	        x.setPreferredSize(new Dimension(110,110));
	        p1.add(x);
	    }
	    add(p1, BorderLayout.SOUTH);
	    for(int x=0;x<3;x++){
	        tf=new JTextField(c[x]);
	        p2.add(tf);
	    }
	    add(p2, BorderLayout.NORTH);
	}
}
