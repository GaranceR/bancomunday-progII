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
            case 7:
            	crearInsertCuenta();
            	break;
            case 8:
            	crearInsertCliente();
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

        buttonAddConto= new JButton("Insertar cuenta");     
        botones.add(buttonAddConto);
        
        buttonAddUser= new JButton("Insertar cliente");        
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
	
	public void crearInsertCliente() {
		getContentPane().setLayout(new BorderLayout());
		p1 = new JPanel();
		p2 = new JPanel();
		
		// Grid Layout # rows, # columns
		p1.setLayout(new GridLayout(8,3));
		p2.setLayout(new GridLayout(1,2));
		
		// Creating Labels + Textfields + Buttons
		JLabel labelRUT = new JLabel("RUT : ");		
		JTextField tfRUT = new JTextField();

		JLabel labelNombre = new JLabel("Nombre : ");
		JTextField tfNombre = new JTextField();
		
		JLabel labelOcup = new JLabel("Ocupacion : ");
		JTextField tfOCup = new JTextField();
		
		JLabel labelCorreo = new JLabel("Correo : ");
		JTextField tfCorreo = new JTextField();
		
		JLabel labelTel = new JLabel("Telefono : ");
		JTextField tfTel = new JTextField();
		
		JLabel labelNbUsuario = new JLabel("Nombre de Usuario : ");
		JTextField tfNbUsuario = new JTextField();
		
		JLabel labelContr = new JLabel("Contraseña : ");
		JTextField tfContr = new JTextField();
		
		JLabel labelMoros = new JLabel("Morosidad : ");
		JTextField tfMoros = new JTextField();
		
		JButton buttonRegresar = new JButton("Regresar");
		botones.add(buttonRegresar);
        buttonRegresar.setPreferredSize(new Dimension(110,110));

		JButton buttonContinuar = new JButton("Continuar");
		botones.add(buttonContinuar);
		buttonContinuar.setPreferredSize(new Dimension(110,110));
		
		// Adding components to Panel
		p1.add(labelRUT);
		p1.add(tfRUT);
		p1.add(labelNombre);
		p1.add(tfNombre);
		p1.add(labelOcup);
		p1.add(tfOCup);
		p1.add(labelCorreo);
		p1.add(tfCorreo);
		p1.add(labelTel);
		p1.add(tfTel);
		p1.add(labelNbUsuario);
		p1.add(tfNbUsuario);
		p1.add(labelContr);
		p1.add(tfContr);
		p1.add(labelMoros);
		p1.add(tfMoros);
		
		p2.add(buttonRegresar);
		p2.add(buttonContinuar);
		
	    add(p1, BorderLayout.NORTH);
	    add(p2, BorderLayout.SOUTH);
	}
	
	public void crearInsertCuenta() {
		getContentPane().setLayout(new BorderLayout());
		JPanel p0 = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		
		// Grid Layout # rows, # columns
		p0.setLayout(new GridLayout(1,3));
		p1.setLayout(new GridLayout(9,3)); // CHANGE TO ,2 to see if it changes smth ? 
		p2.setLayout(new GridLayout(1,2));
		
		// Creating Labels + Textfields + Buttons
		
		JLabel labelTipo = new JLabel("Tipo de Cuenta : ");
		
		JRadioButton optCredito = new JRadioButton("Crédito (TC)");
		JRadioButton optDebito = new JRadioButton("Débito (CD)");
		ButtonGroup tipoCuenta = new ButtonGroup();
		tipoCuenta.add(optCredito);
		tipoCuenta.add(optDebito);
		
		JLabel labelNumCuenta = new JLabel("Numero de Cuenta : ");		
		JTextField tfNumCuenta = new JTextField();

		JLabel labelCategoria = new JLabel("Categoria : ");
		JTextField tfCategoria = new JTextField();
		
		JLabel labelMontoDispo = new JLabel("Monto Disponible / Saldo : ");
		JTextField tfMontoDispo = new JTextField();
		
		// CD Debito only
		JLabel labelMontoMax = new JLabel("Monto máximo (CD) : ");
		JTextField tfMontoMax = new JTextField();
		
		JLabel labelBloqueado = new JLabel("Bloqueado* : ");
		JTextField tfBloqueado = new JTextField();
		
		// TC Credito only
		JLabel labelDiaPago = new JLabel("Dia de Pago (TC) : ");
		JTextField tfDiaPago = new JTextField();
		
		// TC Credito only
		JLabel labelDeuda = new JLabel("Deuda* (TC) : ");
		JTextField tfDeuda = new JTextField();
		
		JLabel labelInfo = new JLabel("* si NO son nuevas cuentas");
		
		JButton buttonRegresar = new JButton("Regresar");
		botones.add(buttonRegresar);
        buttonRegresar.setPreferredSize(new Dimension(110,110));

		JButton buttonContinuar = new JButton("Continuar");
		botones.add(buttonContinuar);
		buttonContinuar.setPreferredSize(new Dimension(110,110));
		
		// Adding components to panel
		
		p0.add(labelTipo);
		p0.add(optCredito);
		p0.add(optDebito);
		
		p1.add(labelNumCuenta);
		p1.add(tfNumCuenta);
		p1.add(labelCategoria);
		p1.add(tfCategoria);
		p1.add(labelMontoDispo);
		p1.add(tfMontoDispo);
		p1.add(labelMontoMax);
		p1.add(tfMontoMax);
		p1.add(labelBloqueado);
		p1.add(tfBloqueado);
		p1.add(labelDiaPago);
		p1.add(tfDiaPago);
		p1.add(labelDeuda);
		p1.add(tfDeuda);
		p1.add(labelInfo);
		
		p2.add(buttonRegresar);
		p2.add(buttonContinuar);
		
		add(p0, BorderLayout.NORTH);
	    add(p1, BorderLayout.CENTER);
	    add(p2, BorderLayout.SOUTH);

	}
}
