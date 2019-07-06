package Proyecto;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Vista extends JFrame {
	
	private JButton b;
    private JButton buttonAbonar, buttonRetirar, buttonComprarPagar, 
    buttonComprarInversion, buttonRecibirTransferencia, buttonRealizarTransferencia, 
    buttonGenerarCorte, buttonSimulacion, buttonAddUser, buttonAddConto, buttonMonto, buttonCuenta, buttonRegresar, buttonContinuar;
    public ArrayList<JButton> botones = new ArrayList<JButton>();
    public ArrayList<JRadioButton> radioButtons = new ArrayList<JRadioButton>();
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
            	crearInsCuentaDetail("TC");
            	break;
            case 8:
            	crearInsCuentaDetail("CD");
            	break;
            case 9:
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

        buttonAddConto= new JButton("Insertar cuenta Credito");     
        botones.add(buttonAddConto);
        buttonAddConto= new JButton("Insertar cuenta Debito");     
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
    
    
    //**************************//
    // View for the Abonar part //
    //**************************//

    public void crearAbonar(){
    	
        getContentPane().setLayout(new BorderLayout());
        
        p1 = new JPanel();
		p2 = new JPanel();
        
		// Not used anymore
		//String[] a={"Regresar","Continuar"},c={"Cuenta","Monto"};
        
		// Layout : 1 row and 3 columns
		p1.setLayout(new GridLayout(1,2));
        
		// Create the JTextField : Cuenta
		// And add it to the panel
        tf = new JTextField("Cuenta");
        textos.add(tf);
        tf.setPreferredSize(new Dimension(200,200));
        //System.out.println(textos.get(0).getText());
        p1.add(tf);

		// Create the JTextField : Monto
		// And add it to the panel
        tf = new JTextField("Monto");
        textos.add(tf);
        tf.setPreferredSize(new Dimension(200,200));
        //System.out.println(textos.get(0).getText());
        p1.add(tf);
        
        // Add the panel to the Frame layout
        add(p1, BorderLayout.NORTH);
        
        // Create the button Regresar
        buttonRegresar = new JButton("Regresar");
        botones.add(buttonRegresar);

        // Create the button Continuar
        buttonContinuar = new JButton("Continuar");
        botones.add(buttonContinuar);
        
        // Layout : 1 row, 2 columns
        p2.setLayout(new GridLayout(1,2));
        
        // Add the buttons to the layout
        for(JButton x:botones){
            x.setPreferredSize(new Dimension(200,200));
            p2.add(x);
        }
        
        // Add the panel to the Frame layout
        add(p2, BorderLayout.SOUTH);
    }
    
    //***************************//
    // View for the Retirar part //
    //***************************//
    
    public void crearRetirar(){ // G : Es necesario crear 2 metodos que son exactamente las mismas?? (crearAbonar = crearRetirar) :thinking:
     	
        getContentPane().setLayout(new BorderLayout());
        
        p1 = new JPanel();
		p2 = new JPanel();
        
		// Not used anymore
		//String[] a={"Regresar","Continuar"},c={"Cuenta","Monto"};
        
		// Layout : 1 row and 3 columns
		p1.setLayout(new GridLayout(1,3));
        
		// Create the JTextField : Cuenta
		// And add it to the panel
        tf = new JTextField("Cuenta");
        textos.add(tf);
        tf.setPreferredSize(new Dimension(200,200));
        //System.out.println(textos.get(0).getText());
        p1.add(tf);

		// Create the JTextField : Monto
		// And add it to the panel
        tf = new JTextField("Monto");
        textos.add(tf);
        tf.setPreferredSize(new Dimension(200,200));
        //System.out.println(textos.get(0).getText());
        p1.add(tf);
        
        // Add the panel to the Frame layout
        add(p1, BorderLayout.NORTH);
        
        // Create the button Regresar
        buttonRegresar = new JButton("Regresar");
        botones.add(buttonRegresar);

        // Create the button Continuar
        buttonContinuar = new JButton("Continuar");
        botones.add(buttonContinuar);
        
        // Layout : 1 row, 2 columns
        p2.setLayout(new GridLayout(1,2));
        
        // Add the buttons to the layout
        for(JButton x:botones){
            x.setPreferredSize(new Dimension(200,200));
            p2.add(x);
        }
        
        // Add the panel to the Frame layout
        add(p2, BorderLayout.SOUTH);
    }
    
    
    //*********************************//
    // View for the Pagar/Comprar part //
    //*********************************//
    
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
	        // TO ADD ??  textos.add(tf);
	        p2.add(tf);
	    }
	    add(p2, BorderLayout.NORTH);
	}
	
	public void crearInsertCliente() {
		getContentPane().setLayout(new BorderLayout());
		
		JPanel p0 = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
				
		// Grid Layout # rows, # columns
		p0.setLayout(new GridLayout(8,1));
		p1.setLayout(new GridLayout(8,2));
		//p1.setLayout(new GridLayout(8,3));
		p2.setLayout(new GridLayout(1,2));
		
		/*
		 *  Creating Textfields, adding them to list of 
		 *  textfields textos to be able to get them in 
		 *  the Controller + adding textfields to panel
		 */
		for (int i=0; i<8; i++) {
			tf = new JTextField();
            textos.add(tf);
			p1.add(tf);
		}
		
		// Creating Labels + Textfields + Buttons

		JLabel labelRUT = new JLabel("RUT : ");		
		//JTextField tfRUT = new JTextField();

		JLabel labelNombre = new JLabel("Nombre : ");
		//JTextField tfNombre = new JTextField();
		
		JLabel labelOcup = new JLabel("Ocupacion : ");
		//JTextField tfOCup = new JTextField();
		
		JLabel labelCorreo = new JLabel("Correo : ");
		//JTextField tfCorreo = new JTextField();
		
		JLabel labelTel = new JLabel("Telefono : ");
		//JTextField tfTel = new JTextField();
		
		JLabel labelNbUsuario = new JLabel("Nombre de Usuario : ");
		//JTextField tfNbUsuario = new JTextField();
		
		JLabel labelContr = new JLabel("Contraseña : ");
		//JTextField tfContr = new JTextField();
		
		JLabel labelMoros = new JLabel("Morosidad (false/ true) : "); // G
		//JTextField tfMoros = new JTextField();
		
		JButton buttonRegresar = new JButton("Regresar");
		botones.add(buttonRegresar);
        buttonRegresar.setPreferredSize(new Dimension(110,110));

		JButton buttonContinuar = new JButton("Continuar");
		botones.add(buttonContinuar);
		buttonContinuar.setPreferredSize(new Dimension(110,110));
		
		// Adding components to Panel
		// TODO : REFACTOR with for loop?!
		
		p0.add(labelRUT);
		//p1.add(tfRUT);
		p0.add(labelNombre);
		//p1.add(tfNombre);
		p0.add(labelOcup);
		//p1.add(tfOCup);
		p0.add(labelCorreo);
		//p1.add(tfCorreo);
		p0.add(labelTel);
		//p1.add(tfTel);
		p0.add(labelNbUsuario);
		//p1.add(tfNbUsuario);
		p0.add(labelContr);
		//p1.add(tfContr);
		p0.add(labelMoros);
		//p1.add(tfMoros);
		
		p2.add(buttonRegresar);
		p2.add(buttonContinuar);
		
		// Add panels to general Layouts
		add(p0, BorderLayout.WEST);
		add(p1, BorderLayout.CENTER);
	    //add(p1, BorderLayout.NORTH);
	    add(p2, BorderLayout.SOUTH);
	}
	
	/*
	public void crearInsertCuenta() {
		getContentPane().setLayout(new BorderLayout());
		
		JPanel p0 = new JPanel();
		
		// Grid Layout # rows, # columns
		p0.setLayout(new GridLayout(1,3));
		
		// Creating Radiobuttons
		
		JLabel labelTipo = new JLabel("Tipo de Cuenta : ");
		
		JRadioButton optCredito = new JRadioButton("Crédito (TC)");
		JRadioButton optDebito = new JRadioButton("Débito (CD)");
		radioButtons.add(optCredito);
		radioButtons.add(optDebito);
		ButtonGroup tipoCuenta = new ButtonGroup();
		// adding Radio buttons to the list of Radiobuttons to be able 
		// to handle them in the Controller
		tipoCuenta.add(optCredito);
		tipoCuenta.add(optDebito);
		
		// adding RadioButtons to panel
		p0.add(labelTipo);
		p0.add(optCredito);
		p0.add(optDebito);

		// Adding panels to main frame
		add(p0, BorderLayout.NORTH);
	}
	*/
	
	public void crearInsCuentaDetail(String choice) {
		getContentPane().setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
		JPanel p3 = new JPanel();
		
		// Grid Layout # rows, # columns
		p1.setLayout(new GridLayout(8,1));
		p2.setLayout(new GridLayout(8,1));
		//p1.setLayout(new GridLayout(8,3)); // CHANGE TO ,2 to see if it changes smth ? 
		p3.setLayout(new GridLayout(1,2));
		
		/*
		 *  Creating Textfields, adding them to list of 
		 *  textfields textos to be able to get them in 
		 *  the Controller + adding textfields to panel
		 */
		int nbTf=0;
		if (choice.equals("CD")) nbTf = 4;
		else if (choice.equals("TC")) nbTf = 6;
		
		for (int i=0; i<nbTf; i++) {
			tf = new JTextField();
            textos.add(tf);
			p2.add(tf);
		}
		
		// Creating Labels + Buttons
		
		// Creating common labels
		JLabel labelNumCuenta = new JLabel("Numero de Cuenta : ");		
		JLabel labelCategoria = new JLabel("Categoria : ");
		JLabel labelMontoDispo = new JLabel("Monto Disponible / Saldo : ");
		JLabel labelBloqueado = new JLabel("Bloqueado* : ");
		
		// adding common labels to panel
		p1.add(labelNumCuenta);
		p1.add(labelCategoria);
		p1.add(labelMontoDispo);
		p1.add(labelBloqueado);
		
		//if (optCredito.isSelected()) {
		if (choice.equals("TC")) {
		// Bug : textfields already created + doesn't reload page
			// TC Credito only
			JLabel labelDiaPago = new JLabel("Dia de Pago (TC) : ");
			JLabel labelDeuda = new JLabel("Deuda* (TC) : ");
			
			p1.add(labelDiaPago);
			p1.add(labelDeuda);
		}
		
		// Todas cuentas
		JLabel labelInfo = new JLabel("* si NO son nuevas cuentas");
		p1.add(labelInfo);

		JButton buttonRegresar = new JButton("Regresar");
		botones.add(buttonRegresar);
        buttonRegresar.setPreferredSize(new Dimension(110,110));

		JButton buttonContinuar = new JButton("Continuar");
		botones.add(buttonContinuar);
		buttonContinuar.setPreferredSize(new Dimension(110,110));
		
		// Adding buttons to panel
		p3.add(buttonRegresar);
		p3.add(buttonContinuar);
		
		// Adding panels to main frame
		add(p1, BorderLayout.WEST);
		add(p2, BorderLayout.CENTER);
	    add(p3, BorderLayout.SOUTH);

	}
}
