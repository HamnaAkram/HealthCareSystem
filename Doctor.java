import javax.swing.*;
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.*;


public class Doctor extends Record {
    
    static ArrayList<Doctor>doctorlist = new<Doctor>ArrayList();
    String address,qualifications,speciality;
    
    public void setaddress(String a)
    {
        if(a.length()>0&&a.length()<50)
        {
            address=a;
        }
    }
    public String getaddress()
    {
        return address;
    }
    public void setqualifications(String a)
    {
        if(a.length()>0&&a.length()<30)
        {
            qualifications=a;
        }
    }
    public String getqualifications()
    {
        return qualifications;
    }
    public void setspeciality(String a)
    {
        if(a.length()>0&&a.length()<30)
        {
            speciality=a;
        }
    }
    public String getspeciality()
    {
        return speciality;
    }
    
    public void adddoctor(String n, String e, String u, String p, String c, String q, String s,String a, Integer b)
    {
        Doctor doc = new Doctor();
        doc.setname(n);
        doc.setemail(e);
        doc.setusername(u);
        doc.setage(b);
        doc.setpassword(p);
        doc.setcontactno(c);
        doc.setqualifications(q);
        doc.setspeciality(s);
        doc.setaddress(a);
        doctorlist.add(doc);
        JOptionPane.showMessageDialog(null,"Account created successfully.");
    }
    
    public void deletedoctor(String u)
    {
        Doctor temp;
        for(int i=0;i<doctorlist.size();i++)
        {
            temp=(Doctor)doctorlist.get(i);
            
            if(temp.getusername()==u)
            {
                doctorlist.remove(i);
            }
            else JOptionPane.showMessageDialog(null,"Account not found");
        }
    }
     public void editDoctor(String p, String e, String c,String u)
    {
        for(Doctor temp: doctorlist)
        {
            if(temp.getusername()==u)
            {
                temp.setpassword(p);
                temp.setemail(e);
                temp.setcontactno(c);
            }
        }
        
        JOptionPane.showMessageDialog(null,"Details saved successfully");
    }
     
     
     public Doctor getdoctordetails(String u)
    {
        Doctor t=new Doctor();
        String a=" ";
      for(Doctor temp: doctorlist)
      {
          if(temp.getusername().equalsIgnoreCase(u))
          {
              t=temp;
          }
          else JOptionPane.showMessageDialog(null,"Acoount doesn't exist");
      }
      return t;
    }
     public String toString(Doctor x)
     {
        String a;
        a="Name: "+x.getname()+"\n Username: "+x.getusername()+" \n Contact No.: " +x.getcontactno()+ "\n Email: "+x.getemail()+"\n Qualification: "+getqualifications()+"\n Age: "+getage()+"\nSpeciality "+getspeciality();
        return a;
     }
     
     public ArrayList searchDoctorName(String n)
     {
         ArrayList<Doctor> templist = new ArrayList<Doctor>();
         for(Doctor t: doctorlist)
         {
             if(t.getname().toLowerCase().contains(n))
             {
                 templist.add(t);
             }
         }
         
         return templist;
     }
     public ArrayList searchDoctorspeciality(String n)
     {
         ArrayList<Doctor> templist = new ArrayList<Doctor>();
         for(Doctor t: doctorlist)
         {
             if(t.getspeciality().toLowerCase().contains(n))
             {
                 templist.add(t);
             }
         }
         
         return templist;
     }
     public ArrayList searchDoctorAddress(String n)
     {
         ArrayList<Doctor> templist = new ArrayList<Doctor>();
         for(Doctor t: doctorlist)
         {
             if(t.getaddress().toLowerCase().contains(n))
             {
                 templist.add(t);
             }
         }
         
         return templist;
     }
     public ArrayList searchDoctor(String n,String s, String a)
     {
         ArrayList<Doctor> templist = new ArrayList<Doctor>();
         for(Doctor t: doctorlist)
         {
             if(t.getname().toLowerCase().contains(n))
             {
                if(t.getspeciality().toLowerCase().contains(s))
                {
                    if(t.getaddress().toLowerCase().contains(a))
                    {
                        templist.add(t);
                    }
                }
             }
         }
         
         return templist;
     }
     
     public String toString()
     {
         return "Name: "+getname()+"\n Username: "+getusername()+" \n Contact No.: " +getcontactno()+ "\n Email: "+getemail()+"\n Qualification: "+getqualifications()+"\n Age: "+getage()+"\nSpeciality "+getspeciality();
     }
}
