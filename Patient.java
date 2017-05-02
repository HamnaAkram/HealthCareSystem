import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Patient extends Record{
    static String tempstring;
    static ArrayList<Patient>patientlist = new <Patient>ArrayList();
    String diseas;
    boolean donor=false;
    
    public void setdiseas(String a)
    {
        if(a.length()>0&&a.length()<20)
        {
            diseas=a;
        }
    }
    public String getdiseas()
    {
        return diseas;
    }
    public void setdonor(boolean a)
    {
        donor=a;
    }
    public boolean getdonor()
    {
        return donor;
    }
    public void addpatients(String n, String e, String u, String p, String c, Integer a,String d,boolean f)
    {
        Patient pat= new Patient();
        pat.setname(n);
        pat.setemail(e);
        pat.setusername(u);
        pat.setage(a);
        pat.setpassword(p);
        pat.setcontactno(c);
        pat.setdiseas(d);
        donor=f;
        patientlist.add(pat);
        JOptionPane.showMessageDialog(null,"Account created successfully.");
        
    }
    
    public Patient getpatientdetails(String u)
    {
        Patient t=new Patient();
        String a=" ";
      for(Patient temp: patientlist)
      {
          if(temp.getusername().equalsIgnoreCase(u))
          {
              t=temp;
          }
          else JOptionPane.showMessageDialog(null,"Acoount doesn't exist");
      }
      return t;
    }
     public void deletepatient(String u)
    {
        Patient temp;
        for(int i=0;i<patientlist.size();i++)
        {
            temp=(Patient)patientlist.get(i);
            
            if(temp.getusername()==u)
            {
                patientlist.remove(i);
            }
            else JOptionPane.showMessageDialog(null,"Account not found");
        }
    }
    public String toString(Patient x)
    {
        String a;
        a="Name: "+x.getname()+"\n Username: "+x.getusername()+" \n Contact No.: " +x.getcontactno()+ "\n Email: "+x.getemail()+"\n Disease: "+x.getdiseas()+"\n Age: "+x.getage()+"\nDonor: "+x.getdonor();
        return a;
    }
     public ArrayList searchPatientdisease(String n)
     {
         ArrayList<Patient> templist = new ArrayList<Patient>();
         for(Patient t: patientlist)
         {
             if(t.getdiseas().toLowerCase().contains(n))
             {
                 templist.add(t);
             }
         }
         
         return templist;
     }
     public ArrayList searchPatientdonor(boolean n)
     {
         ArrayList<Patient> templist = new ArrayList<Patient>();
         for(Patient t: patientlist)
         {
             if(t.getdonor()==n)
             {
                 templist.add(t);
             }
         }
         
         return templist;
     }
     public ArrayList searchPatient(String n,boolean a)
     {
         ArrayList<Patient> templist = new ArrayList<Patient>();
         for(Patient t: patientlist)
         {
             if(t.getdiseas().toLowerCase().contains(n))
             {
                 if(t.getdonor()==a)
                 {
                 templist.add(t);
                 }
             }
         }
         
         return templist;
     }
    public void editPatient(String p, String e, String c,String u)
    {
        for(Patient temp: patientlist)
        {
            if(temp.getusername()==u)
            {
                temp.setpassword(p);
                temp.setemail(e);
                temp.setcontactno(c);
            }
        }
    }
   
}
