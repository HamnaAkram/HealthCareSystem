import javax.swing.JOptionPane;

public class Record {
   private String username,password,name,email,contactno;
    private Integer age;
    
    public static boolean stringCheck(String n)
    {
        boolean found=false;
        for(char c: n.toCharArray())
        {
            if(Character.isDigit(c))
            {
                found =true;
            }
            else if(found)
               break;
        }
        return found;
    }
    
    public void setname(String n)
    {
        if(n.length()>0 && n.length()<20)
        {
            if(stringCheck(n)==false)
            {
                name=n;
            }
            else JOptionPane.showMessageDialog(null,"Name can not contain any numbers");
        }
        else JOptionPane.showMessageDialog(null,"Name can not be left empty and must not be greater than 20 characters");
    }
    public String getname()
    {
        return name;
    }
    public void setusername(String n)
    {
        if(n.length()>=5&&n.length()<=15)
        {
            if(stringCheck(n)==true)
            {
                
                username=n;
            }
            else JOptionPane.showMessageDialog(null,"Username must contain numbers");
        }
        else JOptionPane.showMessageDialog(null,"Username must be at least of length 5");
    }
    public String getusername()
    {
        return username;
    }
    
    public void setpassword(String n)
    {
        if(n.length()>5)
        {
            if(stringCheck(n)==true)
            {
                password=n;
            }
        }
    }
    public String getpassword()
    {
        return password;
    }
    public void setemail(String n)
    {
        boolean f=false;
        if(n.length()>0)
        {
        for(char c: n.toCharArray())
        {
            if(c=='@')
                f=true;
        }
        if(n.contains(".com")&&f==true)
        {
            email=n;
        }
        else 
            JOptionPane.showMessageDialog(null,"Please enter valid email address");
        }
        else JOptionPane.showMessageDialog(null,"Email can not be left empty");
    }
    public String getemail()
    {
        return email;
    }
    public void setage(Integer a)
    {
        if(a>18)
        {
            age=a;
        }
        else JOptionPane.showMessageDialog(null,"You must be 18 year old age to signup");
    }
    public Integer getage()
    {
        return age;
    }
    public void setcontactno(String a)
    {
        if(a.length()==11)
        {
            contactno=a;
        }
        else JOptionPane.showMessageDialog(null,"Contact Number must contain 11 numbers");
    }
    public String getcontactno()
    {
        return contactno;
    }
    
}
