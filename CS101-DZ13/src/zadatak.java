
import java.util.Scanner;


public class zadatak {

    public static void main(String[] args) {
        System.out.println("Unesi prvi broj");
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        System.out.println("Unesi drugi broj");
        int B=sc.nextInt();
        System.out.println("Unesi neki od 4 osnovna operatora (+,-,*,/)");
        String operator=sc.next();
        
        int rezultat;
        try
        {
            rezultat=racunaj(A,B,operator);
            System.out.println("Rezultat je : "+rezultat);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch(NoOperandException e)
        {
            e.printStackTrace();
        }
        catch(InvalidOperatorException e)
        {
            e.printStackTrace();
        }
        
    }
    
    public static int racunaj(int x,int y,String znak) throws ArithmeticException,InvalidOperatorException,NoOperandException
    {
        int resenje = 0;
        if(znak.equals("+"))
        {
            resenje=x+y;
        }
        else if(znak.equals("-"))
        {
            resenje=x-y;
        }
        else if(znak.equals("*"))
        {
            resenje=x*y;
        }
        else if(znak.equals("/"))
        {
            if(y==0)
            {
                throw new ArithmeticException("Ne mozete da delite nulom");
            }
            else 
                resenje=x/y;
        }
        else if(znak.equals(" "))
        {
            throw new NoOperandException("Niste uneli ispravan operator");
        }
        else if(znak.contains("[a-zA-Z]+"))
        {
            throw new NoOperandException("Niste uneli ispravan operator");
        }
        else
            throw new InvalidOperatorException("Niste uneli ispravan operator (+,*,-,/)");
        return resenje;
    }
    
}
