package awt;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import static com.sun.java.accessibility.util.AWTEventMonitor.addWindowListener;
import java.awt.event.*;
import java.awt.*;

public class Attendance 
{
    public static void main(String args[])
    {
        Frame f=new Frame();
        Button b1=new Button("USER");
        Button b2=new Button("ADMIN");
        
        b1.setBounds(50,120,150,40);
        b2.setBounds(250,120,150,40);
        
         b1.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                 Frame f=new Frame("Attendance");
                 Label l=new Label("Attendance Form");
                 Label l1=new Label("NAME : ");
                 Label l2=new Label("ID   : ");
                 Label l3=new Label("TIME : ");
                 Label l4=new Label("DATE : ");
                 
                 TextField t1=new TextField();
                 TextField t2=new TextField();
                 TextField t3=new TextField();
                 TextField t4=new TextField();
                 
                 Button b=new Button("Submit");
                 Button b1=new Button("Reset Data");
                 
                   l.setBounds(140,30,150,40);
                   l1.setBounds(30,100,120,40);
                   l2.setBounds(30,150,120,40);
                   l3.setBounds(30,200,120,40);
                   l4.setBounds(30,250,120,40);
        
                   t1.setBounds(170,100,120,40);
                   t2.setBounds(170,150,120,40);
                   t3.setBounds(170,200,120,40);
                   t4.setBounds(170,250,120,40);
                   
                   b.setBounds(100,400,140,50);
                   b1.setBounds(250,400,140,50);
                   
                   b.addActionListener(new ActionListener()
                   {
                       public void actionPerformed(ActionEvent e)
                       {
                          f.dispose();
                           
                       }
                       
                   });
                   
                   b1.addActionListener(new ActionListener()
                   {
                       public void actionPerformed(ActionEvent e)
                       {
                           t1.setText(" ");
                           t2.setText(" ");
                           t3.setText(" ");
                           t4.setText(" ");
                       }
                               
                   });
                  
                   
                   f.add(l1);f.add(l2);f.add(l3);
                   f.add(t1);f.add(t2);f.add(t3);f.add(b);f.add(l);
                   f.add(l4);f.add(t4);f.add(b1);
                   
                   f.setSize(500,500);
                   f.setLayout(null);
                   f.setVisible(true); 
                   
                   f.addWindowListener(new WindowAdapter()
                   {
                     public void windowClosing(WindowEvent windowEvent){
                     System.exit(0);
                   }        
                  });   
            }
            
        });
         
         
         b2.addActionListener(new ActionListener()
         {
             public void actionPerformed(ActionEvent e)
             {
                 Frame f=new Frame("Attendance");
                 Label l=new Label("Attendance Form");
                 Label l1=new Label("NAME : ");
                 Label l2=new Label("ID   : ");
                 Label l3=new Label("TIME : ");
                 Label l4=new Label("DATE : ");
                 
                 TextField t1=new TextField();
                 TextField t2=new TextField();
                 TextField t3=new TextField();
                 TextField t4=new TextField();
                 
                 Button b=new Button("Submit");
                 Button b1=new Button("Reset Data");
                 
                 l.setBounds(140,30,150,40);
                 l1.setBounds(30,100,120,40);
                 l2.setBounds(30,150,120,40);
                 l3.setBounds(30,200,120,40);
                 l4.setBounds(30,250,120,40);
                 
                  t1.setBounds(170,100,120,40);
                  t2.setBounds(170,150,120,40);
                  t3.setBounds(170,200,120,40);
                  
                  t4.setBounds(170,250,120,40);
                   
                  b.setBounds(100,400,140,50);
                  b1.setBounds(250,400,140,50);
                  
                  b.addActionListener(new ActionListener()
                   {
                       public void actionPerformed(ActionEvent e)
                       {
                          f.dispose();
                           
                       }
                       
                   });
                  
                  b1.addActionListener(new ActionListener()
                   {
                       public void actionPerformed(ActionEvent e)
                       {
                           t1.setText(" ");
                           t2.setText(" ");
                           t3.setText(" ");
                           t4.setText(" ");
                       }
                               
                   });
                 
                  
                  f.add(l1);f.add(l2);f.add(l3);
                  f.add(t1);f.add(t2);f.add(t3);f.add(b);f.add(l);
                  f.add(l4);f.add(t4);f.add(b1);
        
                  f.setSize(500,500);
                  f.setLayout(null);
                  f.setVisible(true);
                  
                  f.addWindowListener(new WindowAdapter()
                  {
                     public void windowClosing(WindowEvent windowEvent){
                     System.exit(0);
                  }        
                 });   
                 
             }
             
         });
         
         f.add(b1);f.add(b2);
         
          f.setSize(500,500);
          f.setLayout(null);
          f.setVisible(true);
          
        
        f.addWindowListener(new WindowAdapter()
        {
           public void windowClosing(WindowEvent windowEvent){
           System.exit(0);
            }        
        }); 
        
    }
    
}
