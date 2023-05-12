
package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Reception  extends JFrame implements ActionListener{
    JButton newCustomer,rooms, department,AllEmployee,ManagerInfo,customer,searchroom ,  Update ,  roomstatus , Pickup ,   checkout ,  logout;
        Reception(){
            
            
             getContentPane().setBackground(Color.WHITE);
             setLayout(null);
             
             newCustomer= new JButton("New Customer Form");
             newCustomer.setBounds(10,30,200,30);
             newCustomer.setBackground(Color.BLACK);
             newCustomer.setForeground(Color.WHITE);
               newCustomer.setFont(new Font("Raleway",Font.PLAIN ,20));
             newCustomer.addActionListener(this);
             add(newCustomer);
             
             rooms= new JButton("Rooms");
             rooms.setBounds(10,70,200,30);
             rooms.setBackground(Color.BLACK);
            rooms.setForeground(Color.WHITE);
              rooms.setFont(new Font("Raleway",Font.PLAIN ,20));
             rooms.addActionListener(this);
             add(rooms);
             
             department= new JButton("Department");
             department.setBounds(10,110,200,30);
             department.setBackground(Color.BLACK);
             department.setForeground(Color.WHITE);
              department.setFont(new Font("Raleway",Font.PLAIN ,20));
             department.addActionListener(this);
             add(department);
             
             AllEmployee= new JButton("AllEmployee");
             AllEmployee.setBounds(10,150,200,30);
             AllEmployee.setBackground(Color.BLACK);
             AllEmployee.setForeground(Color.WHITE);
              AllEmployee.setFont(new Font("Raleway",Font.PLAIN ,20));
            AllEmployee  .addActionListener(this);
             add(AllEmployee);
             
             
            customer= new JButton("Customer Info");
             customer.setBounds(10,190,200,30);
             customer.setBackground(Color.BLACK);
             customer.setForeground(Color.WHITE);
              customer.setFont(new Font("Raleway",Font.PLAIN ,20));
             customer.addActionListener(this);
             add(customer);
             
              ManagerInfo= new JButton("ManagerInfo");
             ManagerInfo.setBounds(10,230,200,30);
             ManagerInfo.setBackground(Color.BLACK);
             ManagerInfo.setForeground(Color.WHITE);
              ManagerInfo.setFont(new Font("Raleway",Font.PLAIN ,20));
             ManagerInfo .addActionListener(this);
             add(ManagerInfo);
               
             
              checkout= new JButton("CheckOut");
             checkout.setBounds(10,270,200,30);
             checkout.setBackground(Color.BLACK);
             checkout.setForeground(Color.WHITE);
             checkout.setFont(new Font("Raleway",Font.PLAIN ,20));
             checkout .addActionListener(this);
             add(checkout);
             
             
              Update= new JButton("Update Status");
             Update.setBounds(10,310,200,30);
             Update.setBackground(Color.BLACK);
             Update.setForeground(Color.WHITE);
              Update.setFont(new Font("Raleway",Font.PLAIN ,20));
              Update.addActionListener(this);
             add(Update);
             
               
              roomstatus= new JButton("Update Room Status");
             roomstatus.setBounds(10,350,200,30);
             roomstatus.setBackground(Color.BLACK);
             roomstatus.setForeground(Color.WHITE);
              roomstatus.setFont(new Font("Raleway",Font.PLAIN ,20));
              roomstatus.addActionListener(this);
             add(roomstatus);
             
             
             Pickup= new JButton("Pickup Service");
             Pickup.setBounds(10,390,200,30);
             Pickup.setBackground(Color.BLACK);
             Pickup.setForeground(Color.WHITE);
             Pickup.setFont(new Font("Raleway",Font.PLAIN ,20));
             Pickup.addActionListener(this);
             add(Pickup);
             
             searchroom= new JButton("Search Room");
             searchroom.setBounds(10,430,200,30);
             searchroom.setBackground(Color.BLACK);
             searchroom.setForeground(Color.WHITE);
              searchroom.setFont(new Font("Raleway",Font.PLAIN ,20));
             searchroom.addActionListener(this);
             add(searchroom);

             
             logout= new JButton("Logout");
             logout.setBounds(10,470,200,30);
             logout.setBackground(Color.BLACK);
             logout.setForeground(Color.WHITE);
             logout.setFont(new Font("Raleway",Font.PLAIN ,20));
             logout.addActionListener(this);
             add(logout);
             
              ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/fourth.jpg"));
              JLabel image = new JLabel(i1);
              image.setBounds(250,30,500,470);
              add(image); 
            setBounds(350,200,800,570);
            setVisible(true);
            
    }
        
        public void actionPerformed(ActionEvent ae){
            if (ae.getSource() == newCustomer){
               setVisible(false); 
               new AddCustomer();
            } else if(ae.getSource()==rooms){
               setVisible(false);
               new Room();
            } else if(ae.getSource()==department){
                setVisible(false);
               new Department();

                
            } else if(ae.getSource()==AllEmployee){
                setVisible(false);
               new EmployeeInfo();

            }  else if(ae.getSource()==AllEmployee){
                setVisible(false);
               new EmployeeInfo();

            }   else if(ae.getSource()==ManagerInfo){
                setVisible(false);
               new ManagerInfo();
            }  else if(ae.getSource()==customer){
                setVisible(false);
               new CustomerInfo();
               
        }  else if(ae.getSource()==searchroom){
                setVisible(false);
               new SearchRoom();
        }  else if(ae.getSource()== Update){
                setVisible(false);
               new UpdateCheck();

        }  else if(ae.getSource()== roomstatus){
                setVisible(false);
               new UpdateRoom();
        } else if(ae.getSource()== Pickup){
                setVisible(false);
               new Pickup();
           } else if(ae.getSource()== checkout){
            setVisible(false);
            new Checkout();
                    
           } else if(ae.getSource()== logout){
            setVisible(false);
            System.exit(0);

        }
        }
        public static void main(String[] args){
            new Reception();
        }
    
}
