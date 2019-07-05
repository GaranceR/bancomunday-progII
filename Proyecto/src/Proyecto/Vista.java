package Proyecto;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class Vista extends JFrame {
    private JButton b;
    public ArrayList<JButton> botones=new ArrayList<JButton>();
    public JTextField[] tf=new JTextField[3];
    public JLabel l;
    private JPanel p1,p2,p3;
    private int valido=230;
    public int getValido(){
        return valido;
    }
    public void setValido(int val){
        valido=val;
    }
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
    public void crearP(){
        getContentPane().setLayout(new BorderLayout());
        p1=new JPanel();
        p2=new JPanel();
        p1.setLayout(new GridLayout(4,2));
        p2.setLayout(new GridLayout(2,1));
        for(int z=0;z<8;z++){
            b=new JButton(OP[z]);
            botones.add(b);
        }
        for(JButton x:botones){
            x.setMaximumSize(new Dimension(120,120));
            x.setMinimumSize(new Dimension(100,100));
            x.setPreferredSize(new Dimension(110,110));
            p1.add(x);
        }
        l=new JLabel("  Estado...");
        p2.add(l);
        tf[0]=new JTextField("Detalles del error...");
        p2.add(tf[0]);
        add(p1, BorderLayout.WEST);
        add(p2, BorderLayout.CENTER);
    }
    public void crearAbonar(){
        getContentPane().setLayout(new BorderLayout());
        p1=new JPanel();
        p2=new JPanel();
        String[] a={"Regresar","Continuar"};
        tf[0]=new JTextField("Cuenta");
        tf[1]=new JTextField("Monto");
        tf[0].setPreferredSize(new Dimension(10,100));
        tf[1].setPreferredSize(new Dimension(10,100));
        p1.setLayout(new GridLayout(1,3));
        p1.add(tf[0]);
        p1.add(tf[1]);
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
    public void crearRetirar(){ // G : Es necesario crear 2 metodos que son exactamente las mismas?? (crearAbonar = crearRetirar) :thinking:
        getContentPane().setLayout(new BorderLayout());
        p1=new JPanel();
        p2=new JPanel();
        String[] a={"Regresar","Continuar"};
        tf[0]=new JTextField("Cuenta");
        tf[1]=new JTextField("Monto");
        tf[0].setPreferredSize(new Dimension(10,100));
        tf[1].setPreferredSize(new Dimension(10,100));
        p1.setLayout(new GridLayout(1,3));
        p1.add(tf[0]);
        p1.add(tf[1]);
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
        String[] a={"Regresar","Pagar/Comprar"},c={"Cuenta","Monto","Descripcion"}; // G : falta Cuotas (igual TODO en Operaciones)
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
            tf[x]=new JTextField(c[x]);
        }
        for(JTextField x:tf){
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
            tf[x]=new JTextField(c[x]);
            p2.add(tf[x]);
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
            tf[x]=new JTextField(c[x]);
            p2.add(tf[x]);
        }
        add(p2, BorderLayout.NORTH);
    }
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
        tf[x]=new JTextField(c[x]);
        p2.add(tf[x]);
    }
    add(p2, BorderLayout.NORTH);
}
