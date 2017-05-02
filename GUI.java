import java.util.*;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI extends JFrame implements ActionListener{
JLabel health;
JLabel usern;
JTextField userna;
JLabel pasword;
JTextField pasword1;
JLabel nam;
JTextField name1;
JLabel username;
JTextField username1;
JLabel contact;
JTextField contact1;
JLabel E_mail;
JTextField E_mail1;
JLabel age;
JTextField age1 ;
JButton login;
JLabel signup;
JLabel signupas;
JRadioButton doc;
JRadioButton pati;
JLabel pract_lo;
JTextField pract_lo1;
JLabel spec;
JTextField spec1;
JLabel qulaif;
JTextField qulaif1;
JButton save;
JButton exit;
JLabel disease;
JTextField disease1;
JLabel donor;
JRadioButton donor1,patient;
JRadioButton donor2,doctor,speciality1;
JButton save1;
JButton exit1;
JButton search;
JButton settings;
JButton logout;
JButton search1;
JButton settings1;
JButton logout1;
JLabel patient_s;
JLabel doctor_n;
JTextField doctor_n1;
JLabel speci;
JTextField speci1;
JLabel diseas;
JTextField diseas1;
JLabel  location1;
JTextField location;
JButton save2;
JButton exit2;
JLabel doctor_s1;
JLabel doctorn;
JTextField doctorn1,paswordd;
JLabel pass;
JTextField specia1;
JLabel password1;
JLabel diseae;
JTextField diseasee1;
JLabel locat;
JTextField locat1;
JLabel password2;
JTextField password3;
JLabel email1;
JTextField email2;
JButton save3;
JButton exit3;
JLabel patient_se;
JLabel passwordd;
JTextField passwordd1;
JLabel e_mai;
JTextField e_mai1;
JLabel contact_n;
JTextField contact_n1;
JButton save4;
JButton exit4;
JLabel conta_n;
JTextField conta_n1;
JButton save5;
JButton exit5;
JLabel  doctor_s;
JLabel user,user1;
JTextField username3,username4;
JTextArea area;
JButton signupb;
JFrame main,Pmain,Dmain,Psettings,Dsettings,Psearch,Dsearch,Psignup,Dsignup;
    public void mainScreen() {
        main = new JFrame("HEALTH CARE SYSTEM");
        Font h= new Font("Times New Roman",55,100);
        main.setFont(h); 
        main.setSize(850, 600);
        health = new JLabel("HEALTH CARE SYSTEM");
        Font hcs= new Font("Times New Roman",55,20);
        health.setFont(hcs); 
        health.setBounds(6, 5, 200, 15);
        main.add(health);
        patient= new JRadioButton("Patient");
        patient.setBounds(400,70,100,30);
        main.add(patient);
        doctor=new JRadioButton("Doctor");
        doctor.setBounds(500,70,100,30);
        main.add(doctor);
        usern = new JLabel("USERNAME");
        usern.setBounds(340, 5, 140, 15);
        main.add(usern);
        userna = new JTextField();
        userna.setBounds(340, 30, 140, 30);
        main.add(userna);
        pasword = new JLabel("PASSWORD");
        pasword.setBounds(500, 5, 120, 15);
        main.add(pasword);
        pasword1 = new JTextField();
        pasword1.setBounds(500, 30, 140, 30);
        main.add(pasword1);
        nam = new JLabel("NAME");
        nam.setBounds(400, 105, 150, 80);
        main.add(nam);
        name1 = new JTextField();
        name1.setBounds(500, 125, 310, 40);
        main.add(name1);
        username = new JLabel("USERNAME");
        username.setBounds(400, 160, 100, 80);
        main.add(username);
        pass=new JLabel("PASSWORD");
        pass.setBounds(580,320,200,80);
        main.add(pass);
        paswordd=new JTextField();
        paswordd.setBounds(660,340,150,40);
        main.add(paswordd);
        username1 = new JTextField();
        username1.setBounds(500, 180, 310, 40);
        main.add(username1);
        contact = new JLabel("CONTACT");
        contact.setBounds(400, 210, 200, 80);
        main.add(contact);
        contact1 = new JTextField();
        contact1.setBounds(500, 230, 310, 40);
        main.add(contact1);
        E_mail = new JLabel("E-MAIL");
        E_mail.setBounds(400, 260, 200, 80);
        main.add(E_mail);
        E_mail1 = new JTextField();
        E_mail1.setBounds(500, 280, 310, 40);
        main.add(E_mail1);
        login = new JButton("LOGIN");
        login.setBounds(660, 30, 80, 30);
        main.add(login);
        age = new JLabel("AGE");
        age.setBounds(400, 320, 200, 80);
        main.add(age);
        age1 = new JTextField();
        age1.setBounds(500, 340, 60, 40);
        main.add(age1);
        signup = new JLabel("SIGN-UP :");
        signup.setBounds(340, 40, 150, 80);
        main.add(signup);
        signupas = new JLabel("SIGN UP AS: ");
        signupas.setBounds(460, 400, 200, 20);
        main.add(signupas);
        doc = new JRadioButton("DOCTOR");
        pati = new JRadioButton("PATIENT");
        doc.setBounds(550, 440, 100, 30);
        pati.setBounds(650, 440, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(doc);
        bg.add(pati);
        main.add(doc);
        main.add(pati);
        main.setLayout(null);
        main.setVisible(true);
        signupb = new JButton("SIGN-UP");
        signupb.setBounds(600, 500, 90, 40);
        main.add(signupb);
                
        login.addActionListener(this);
        signupb.addActionListener(this);
    }  
    public void SignupDoctor() {
        Dsignup= new JFrame("SIGNUP AS DOCTOR");
        pract_lo = new JLabel("PRACTICE LOCATION");
        pract_lo.setBounds(50, 100, 300, 100);
        Dsignup.add(pract_lo);
        pract_lo1 = new JTextField();
        pract_lo1.setBounds(200, 130, 230, 40);
        Dsignup.add(pract_lo1);
        spec = new JLabel("SPECIALITY");
        spec.setBounds(50, 150, 300, 100);
        Dsignup.add(spec);
        spec1 = new JTextField();
        spec1.setBounds(200, 180, 230,40);
        Dsignup.add(spec1);
        qulaif = new JLabel("QUALIFICAION");
        qulaif.setBounds(50, 200, 300, 80);
        Dsignup.add(qulaif);
        qulaif1 = new JTextField();
        qulaif1.setBounds(200, 230, 230, 40);
        Dsignup.add(qulaif1);
        save= new JButton("SAVE");
        save.setBounds(100,300,100,50);
        Dsignup.add(save);
        exit= new JButton("EXIT");
        exit.setBounds(250,300,100,50);
        Dsignup.add(exit);
        Dsignup.setSize(500, 500);
        Dsignup.setLayout(null);
        Dsignup.setVisible(true);
        
        save.addActionListener(this);
        exit.addActionListener(this);
    }
    public void Setupaspatient()
    {
       Psignup= new JFrame("SIGNUP AS PATIENT");
        disease = new JLabel("DISEASE");
        disease.setBounds(50, 100, 300, 80);
        Psignup.add(disease); 
        disease1 = new JTextField();
        disease1.setBounds(200, 130, 200, 20);
        Psignup.add(disease1);
        donor = new JLabel("DONOR");
        donor.setBounds(50, 200, 100, 30);
        Psignup.add(donor); 
        donor1 = new JRadioButton("YES");
        donor2 = new JRadioButton("NO");
        donor1.setBounds(200, 200, 100, 30);
        donor2.setBounds(200, 250, 100, 30);
        ButtonGroup bg = new ButtonGroup();
        bg.add(donor1);
        bg.add(donor2);
        Psignup.add(donor1);
        Psignup.add(donor2);
        save1= new JButton("SAVE");
        save1.setBounds(100,300,100,40);
        Psignup.add(save1);
        exit1= new JButton("EXIT");
        exit1.setBounds(250,300,100,40);
        Psignup.add(exit1);
        Psignup.setSize(500, 500);
        Psignup.setLayout(null);
        Psignup.setVisible(true);
        save1.addActionListener(this);
        exit1.addActionListener(this);
    }
    public void PatientMain()
    {
        Pmain = new JFrame("Main Menu-Patient");
        search = new JButton("SEARCH");
        search.setBounds(150,130,100,40);
        Pmain.add(search);
        settings= new JButton("SETTINGS");
        settings.setBounds(150,180,100,40);
        Pmain.add(settings);
        logout= new JButton("LOGOUT");
        logout.setBounds(150,230,100,40);
        Pmain.add(logout);
        Pmain.setSize(470, 500);
        Pmain.setLayout(null);
        Pmain.setVisible(true);
        
        search.addActionListener(this);
        settings.addActionListener(this);
        logout.addActionListener(this);
    }
    public void DoctorMain()
    {
        Dmain = new JFrame("Main Menu-Doctor");
        search1= new JButton("SEARCH");
        search1.setBounds(150,130,100,40);
        Dmain.add(search1);
        settings1= new JButton("SETTINGS");
        settings1.setBounds(150,180,100,40);
        Dmain.add(settings1);
        logout1= new JButton("LOGOUT");
        logout1.setBounds(150,230,100,40);
        Dmain.add(logout1);
        Dmain.setSize(480, 500);
        Dmain.setLayout(null);
        Dmain.setVisible(true);
        
        
        search1.addActionListener(this);
        logout1.addActionListener(this);
        settings1.addActionListener(this);
    }
     public void PATIENTsearch()
    {
        Psearch=new JFrame();
        Psearch.setSize(400,500);
        patient_s=new JLabel("PATIENT SEARCH");
        patient_s.setBounds(120,1,100,30);
        Psearch.add(patient_s);
        doctor_n=new JLabel("DOCTOR NAME");
        doctor_n.setBounds(5,50,100,15);
        Psearch.add(doctor_n);
        doctor_n1= new JTextField();
        doctor_n1.setBounds(100,50,100,20);
        Psearch.add(doctor_n1);
        speci=new JLabel("SPECIALITY");
        speci.setBounds(5,100,100,15);
        Psearch.add(speci);
        speci1= new JTextField();
        speci1.setBounds(100,100,100,20);
        Psearch.add(speci1);
        location1=new JLabel("LOCATION");
        location1.setBounds(5,150,100,15);
        Psearch.add(location1);
        location= new JTextField();
        location.setBounds(100,150,100,20);
        Psearch.add(location);
        Psearch.setLayout(null);
        Psearch.setVisible(true);
         save2= new JButton("Search");
        save2.setBounds(50,250,70,20);
        Psearch.add(save2);
        exit2= new JButton("Exit");
        exit2.setBounds(150,250,70,20);
        Psearch.add(exit2);
        
        save2.addActionListener(this);
        exit2.addActionListener(this);
    }
     public void DOCTORsearch()
    {
        Dsearch=new JFrame();
        Dsearch.setSize(400,500);
        doctor_s1=new JLabel("DOCTOR SEARCH");
        doctor_s1.setBounds(120,1,100,30);
        Dsearch.add(doctor_s1);
         speciality1=new JRadioButton("Donor");
        speciality1.setBounds(5,100,100,15);
        Dsearch.add(speciality1);
         diseae=new JLabel("DISEASE");
        diseae.setBounds(5,150,100,15);
        Dsearch.add(diseae);
        diseasee1= new JTextField();
        diseasee1.setBounds(100,150,100,20);
        Dsearch.add(diseasee1);
      Dsearch.setLayout(null);
        Dsearch.setVisible(true);
        save3 = new JButton("Save");
        save3.setBounds(50,250,70,20);
        Dsearch.add(save3);
        exit3= new JButton("Exit");
        exit3.setBounds(150,250,70,20);
       Dsearch.add(exit3);   
       
       save3.addActionListener(this);
       exit3.addActionListener(this);
    }
     public void Patientsettings()
     {
        Psettings=new JFrame();
        Psettings.setSize(400,500);
        patient_se=new JLabel("PATIENT SETTINGS");
        patient_se.setBounds(120,1,200,30);
        Psettings.add(patient_se);
        passwordd=new JLabel("PASSWORD");
        passwordd.setBounds(5,50,100,15);
        Psettings.add(passwordd);
        passwordd1= new JTextField();
        passwordd1.setBounds(100,50,100,20);
        Psettings.add(passwordd1);
        e_mai=new JLabel("E-MAIL");
        e_mai.setBounds(5,100,100,15);
        Psettings.add(e_mai);
        e_mai1= new JTextField();
        e_mai1.setBounds(100,100,100,20);
        Psettings.add(e_mai1);
        contact_n=new JLabel("CONTACT");
        contact_n.setBounds(5,150,100,15);
        Psettings.add(contact_n);
        contact_n1= new JTextField();
        contact_n1.setBounds(100,150,100,20);
        Psettings.add(contact_n1);
        user=new JLabel("UserName");
        user.setBounds(5,200,100,15);
        Psettings.add(user);
        username3=new JTextField();
        username3.setBounds(100,200,100,20);
        Psettings.add(username3);
        save4= new JButton("Save");
        save4.setBounds(50,250,70,20);
        Psettings.add(save4);
        exit4= new JButton("Exit");
        exit4.setBounds(150,250,70,20);
        Psettings.add(exit4); 
         Psettings.setLayout(null);
        Psettings.setVisible(true);
        
        save4.addActionListener(this);
        exit4.addActionListener(this);
     }
     public void Doctorsettings()
     {
        Dsettings=new JFrame();
        Dsettings.setSize(400,500);
        doctor_s=new JLabel("DOCTOR SETTINGS");
        doctor_s.setBounds(120,1,200,30);
        Dsettings.add(doctor_s);
         password2=new JLabel("PASSWORD");
        password2.setBounds(5,50,100,15);
        Dsettings.add(password2);
         password3= new JTextField();
        password3.setBounds(100,50,100,20);
        Dsettings.add(password3);
        email1=new JLabel("E-MAIL");
        email1.setBounds(5,100,100,15);
        Dsettings.add(email1);
        email2= new JTextField();
        email2.setBounds(100,100,100,20);
        Dsettings.add(email2);
        conta_n=new JLabel("CONTACT");
        conta_n.setBounds(5,150,100,15);
        Dsettings.add(conta_n);
        conta_n1= new JTextField();
        conta_n1.setBounds(100,150,100,20);
        Dsettings.add(conta_n1);
        user1=new JLabel("USERNAME");
        user1.setBounds(5,200,100,15);
        Dsettings.add(user1);
        username4=new JTextField("Please enter your Username");
        username4.setBounds(100,200,100,20);
        Dsettings.add(username4);
        save5= new JButton("Save");
        save5.setBounds(50,250,70,20);
        Dsettings.add(save5);
        exit5= new JButton("Exit");
        exit5.setBounds(150,250,70,20);
        Dsettings.add(exit5); 
         Dsettings.setLayout(null);
        Dsettings.setVisible(true);
        
        save5.addActionListener(this);
        exit5.addActionListener(this);
     }
     public void displaysearch(ArrayList l)
     {
         JFrame f= new JFrame();
         area= new JTextArea();
         area.setBounds(5,5,300,300);
         area.setText(l.toString());
         f.add(area);
         f.setSize(300,300);
         f.setLayout(null);
         f.setVisible(true);
     }
     public void actionPerformed(ActionEvent e){
      if(e.getSource()==login){
          boolean a=false;
          if(patient.isSelected())
          {
              a=true;
          }
          else if(doctor.isSelected())
          {
              a=false;
          }
          login(userna.getText(),pasword1.getText(),a);
      }
      else if(e.getSource()==settings)
      {
          Patientsettings();
      }
      else if(e.getSource()==save4)
      {
          new Patient().editPatient(passwordd1.getText(),e_mai1.getText(),contact_n1.getText(),username3.getText());
      }
      else if(e.getSource()==save2)
      {
          String a,b,c;
          a=doctor_n1.getText();
          b=speci1.getText();
          c=location.getText();
          if(a.length()!=0&&b.length()==0&&c.length()==0)
          {
              displaysearch(new Doctor().searchDoctorName(a));
          }
          else if(a.length()==0&&b.length()!=0&&c.length()==0)
          {
              displaysearch(new Doctor().searchDoctorspeciality(b));
          }
          else if(a.length()==0&&b.length()==0&&c.length()!=0)
          {
              displaysearch(new Doctor().searchDoctorAddress(c));
          }
          else displaysearch(new Doctor().searchDoctor(a, b, c));          
      }
      else if(e.getSource()==logout)
      {
          Pmain.setVisible(false);
          mainScreen();
      }
      else if (e.getSource()==search)
      {
         PATIENTsearch();
      }
      else if(e.getSource()==exit2)
      {
        Psearch.setVisible(false);
        mainScreen();
      }
      else if(e.getSource()==signupb)
      {
          String a,b,c,d,h,f,g,p;
          Integer l;
          boolean m=false;
          a=name1.getText();
          b=username1.getText();
          c=contact1.getText();
          d=E_mail.getText();
          l=Integer.parseInt(age1.getText());
          p=paswordd.getText();
          if(doc.isSelected())
          {
              main.setVisible(false);
              SignupDoctor();
              if(e.getSource()==save)
              {
                  h=pract_lo1.getText();
                  f=spec1.getText();
                  g=qulaif1.getText();
                  
                  new Doctor().adddoctor(a, d, b, p, c, g, f, h, l);
              }
              else if(e.getSource()==exit)
              {
                  Dsignup.setVisible(false);
                  mainScreen();
              }
          }
          else if(pati.isSelected())
          {
              main.setVisible(false);
              Setupaspatient();
              if(e.getSource()==save1)
              {
                  h=disease1.getText();
                  if(donor1.isSelected())
                  m=true;
                  else if(donor2.isSelected())
                  m=false;
                  
                  new Patient().addpatients(a,d,b,p,c,l,h,m);
              }
              else if(e.getSource()==exit1)
              {
                  Psignup.setVisible(false);
                  mainScreen();
              }
              else if(e.getSource()==exit4)
              {
                  Psettings.setVisible(false);
                  Patientsettings();
              }
              else if(e.getSource()==exit5)
              {
                  Dsettings.setVisible(false);
                  Doctorsettings();
              }
          }
          
      }
      
      else if(e.getSource()==settings1)
      {
          Doctorsettings();
      }
      else if(e.getSource()==save5)
      {
          new Doctor().editDoctor(password3.getText(),email2.getText(),conta_n1.getText(),username4.getText());
      }
      else if(e.getSource()==logout1)
      {
          Dmain.setVisible(false);
          mainScreen();
      }
      else if(e.getSource()==search1)
      {
          
           DOCTORsearch();
      }
      else if(e.getSource()==save3)
      {
          String a=diseasee1.getText();
          boolean b = false;
          
          if(a.length()!=0&& speciality1.isSelected())
          {
              displaysearch(new Patient().searchPatient(a,true));
          }
          else if(a.length()!=0&&speciality1.isSelected()==false)
          {
              displaysearch(new Patient().searchPatientdisease(a));
          }
          else if(a.length()==0&&speciality1.isSelected()==true)
          {
              displaysearch(new Patient(). searchPatientdonor(true));
          }
      }
  }
    public static void main(String args[]) {
        GUI s = new GUI();
        Patient x=new Patient();
        x.addpatients("Hamna", "Hamna.akram@gmail.com","hamna_ak12","123123","03335947528",19,"fever", true);
        
        Doctor a= new Doctor();
        a.adddoctor("hamza","hamza@gmail.com","hamx123","123123","03325136173","MBBS","ENT","Islamabad",35);
        s.mainScreen();
      
    }
    
    public void login(String x, String p,boolean m)
{
    Doctor temp= new Doctor();
    Patient temp1= new Patient();
    if(m==false)
    {
    for(Doctor d: temp.doctorlist)
    {
        if(d.getusername()==x)
        {
            if(d.getpassword()==p)
            {
                new GUI(). DoctorMain();
            }
             else JOptionPane.showMessageDialog(null,"Please enter correct combination of password and username");
        }
    }
    }
    else if(m==true)
    {
    for(Patient d: temp1.patientlist)
    {
        if(d.getusername()==x)
        {
            if(d.getpassword()==p)
            {
                new GUI(). PatientMain();
            }
            else JOptionPane.showMessageDialog(null,"Please enter correct combination of password and username");
        }
    }
    }
}
}
