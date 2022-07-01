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
        
        f.setBackground(Color.ORANGE);
        
        Button b1=new Button("USER");
        Button b2=new Button("ADMIN");
        Label l=new Label("Select Type : ");
        l.setForeground(Color.red);
                
        
        b1.setBounds(50,120,150,40);
        b2.setBounds(250,120,150,40);
        
        b1.setBackground(Color.CYAN);
        b1.setForeground(Color.black);
        b2.setBackground(Color.CYAN);
        b2.setForeground(Color.black);
        

        l.setBounds(200,40,200,40);
        
         b1.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                 Frame f=new Frame("Attendance");
                 f.setBackground(Color.WHITE);
                 
                 Label l=new Label("Attendance Form");
                 l.setForeground(Color.red);
                 Label l1=new Label("NAME : ");
                 l1.setForeground(Color.red);
                 Label l2=new Label("ID   : ");
                 l2.setForeground(Color.red);
                 Label l3=new Label("TIME : ");
                 l3.setForeground(Color.red);
                 Label l4=new Label("DATE : ");
                 l4.setForeground(Color.red);
                             
                 
                 TextField t1=new TextField();
                 t1.setBackground(Color.CYAN);
                 TextField t2=new TextField();
                 t2.setBackground(Color.CYAN);
                 TextField t3=new TextField();
                 t3.setBackground(Color.CYAN);
                 TextField t4=new TextField();
                 t4.setBackground(Color.CYAN);
                 
                 
                 Button b=new Button("Submit");
                 Button b1=new Button("Reset Data");
                 Button b2=new Button("Back");
                 
                 b.setBackground(Color.CYAN);
                 b.setForeground(Color.black);
                 
                 b1.setBackground(Color.CYAN);
                 b1.setForeground(Color.black);
                 b2.setBackground(Color.CYAN);
                 b2.setForeground(Color.black);
                 
                 
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
                   b2.setBounds(190,500,140,50);
                   
                   
                   
                   b.addActionListener(new ActionListener()
                   {
                       public void actionPerformed(ActionEvent e)
                       {
                          Frame f=new Frame();
                          f.setBackground(Color.YELLOW);
                          
                          
                          Label l=new Label("DATA ENTERED SUCCESSFULLY");
                          l.setForeground(Color.red);
                          Label l1=new Label();
                          l.setForeground(Color.red);
                          Label l2=new Label();
                          l.setForeground(Color.red);
                          Label l3=new Label();
                          l.setForeground(Color.red);
                          Label l4=new Label();
                          l.setForeground(Color.red);
                          
                          
                          Button b=new Button("Done");
                          Button b1=new Button("Back");
                          
                          b.setBackground(Color.CYAN);
                          b.setForeground(Color.black);
                          b1.setBackground(Color.CYAN);
                          b1.setForeground(Color.black);
                          
                          l.setBounds(140,40,250,40);
                          l1.setBounds(30,100,180,40);
                          l2.setBounds(30,150,190,40);
                          l3.setBounds(30,200,190,40);
                          l4.setBounds(30,250,180,40);
                          
                          b.setBounds(100,400,120,40);
                          b1.setBounds(250,400,120,40);
                          
                          f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l);f.add(b);f.add(b1);
                   
                          
                          String s1="Name"+"  :    "+t1.getText();
                          l1.setText(s1);
                          l1.setForeground(Color.red);
                          String s2="Id"+"    :    "+t2.getText();
                          l2.setText(s2);
                          l2.setForeground(Color.red);
                          String s3="Time"+"  :    "+t3.getText();
                          l3.setText(s3);
                          l3.setForeground(Color.red);
                          String s4="Date"+"  :    "+t4.getText();
                          l4.setText(s4);
                          l4.setForeground(Color.red);
                          
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
                                   f.dispose();
                                  
                              }
                          });
                          
                          f.setSize(500,700);
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
                   
                    b2.addActionListener(new ActionListener()
                   {
                       public void actionPerformed(ActionEvent e)
                       {
                           f.dispose();
                           
                       }
                   });
                  
                   
                   f.add(l1);f.add(l2);f.add(l3);
                   f.add(t1);f.add(t2);f.add(t3);f.add(b);f.add(l);
                   f.add(l4);f.add(t4);f.add(b1);f.add(b2);
                   
                   f.setSize(500,700);
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
                 f.setBackground(Color.yellow);
                 
                 Label l=new Label("Attendance Form");
                 l.setForeground(Color.red);
                 Label l1=new Label("NAME : ");
                 l1.setForeground(Color.red);
                 Label l2=new Label("ID   : ");
                 l2.setForeground(Color.red);
                 Label l3=new Label("TIME : ");
                 l3.setForeground(Color.red);
                 Label l4=new Label("DATE : ");
                 l4.setForeground(Color.red);
                 
                 TextField t1=new TextField();
                 t1.setBackground(Color.CYAN);
                 TextField t2=new TextField();
                 t2.setBackground(Color.CYAN);
                 TextField t3=new TextField();
                 t3.setBackground(Color.CYAN);
                 TextField t4=new TextField();
                 t4.setBackground(Color.CYAN);
                 
                 
                
                 Button b=new Button("Submit");
                 Button b1=new Button("Reset Data");
                 Button b2=new Button("Back");
                 
                  b.setBackground(Color.CYAN);
                  b.setForeground(Color.black);
                 
                  b1.setBackground(Color.CYAN);
                  b1.setForeground(Color.black);
                  b2.setBackground(Color.CYAN);
                  b2.setForeground(Color.black);
                 
                  
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
                  b2.setBounds(190,500,140,50);
                  
                  b.addActionListener(new ActionListener()
                   {
                       public void actionPerformed(ActionEvent e)
                       {
                          Frame f=new Frame();
                          f.setBackground(Color.LIGHT_GRAY);
                          
                          Label l=new Label("DATA ENTERED SUCCESSFULLY");
                          
                          Label l1=new Label();
                           l1.setForeground(Color.red);
                          Label l2=new Label();
                           l2.setForeground(Color.red);
                          Label l3=new Label();
                           l3.setForeground(Color.red);
                          Label l4=new Label();
                           l4.setForeground(Color.red);
                           
                          Button b=new Button("Done");
                          Button b1=new Button("Back");
                          
                          l.setBounds(140,40,250,40);
                          l1.setBounds(30,100,180,40);
                          l2.setBounds(30,150,190,40);
                          l3.setBounds(30,200,190,40);
                          l4.setBounds(30,250,180,40);
                  
                           b.setBounds(100,400,120,40);
                           b1.setBounds(250,400,120,40);
                           
                           b.setBackground(Color.CYAN);
                           b.setForeground(Color.black);
                           b1.setBackground(Color.CYAN);
                           b1.setForeground(Color.black);
                           
                           
                           
                          
                          f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l);f.add(b);f.add(b1);
                   
                          
                          String s1="Name"+"  :    "+t1.getText();
                          l1.setText(s1);
                          l1.setForeground(Color.red);
                          String s2="Id"+"    :    "+t2.getText();
                          l2.setText(s2);
                          l2.setForeground(Color.red);
                          String s3="Time"+"  :    "+t3.getText();
                          l3.setText(s3);
                          l3.setForeground(Color.red);
                          String s4="Date"+"  :    "+t4.getText();
                          l4.setText(s4);
                          l4.setForeground(Color.red);
                  
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
                                   f.dispose();
                                  
                              }
                          });
                          
                          f.setSize(500,700);
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
                  f.add(l4);f.add(t4);f.add(b1);f.add(b2);
        
                  f.setSize(500,700);
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
         
         f.add(b1);f.add(b2);f.add(l);
         
          f.setSize(500,700);
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
