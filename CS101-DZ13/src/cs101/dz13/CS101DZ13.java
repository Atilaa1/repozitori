package cs101.dz13;

import java.util.*;

public class CS101DZ13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Korisnici k1 = new Korisnici("peroperic", "pero123");
        Korisnici k2 = new Korisnici("atilak", "atila123");
        Korisnici k3 = new Korisnici("ucenik", "nastava");

        try {  
            
            System.out.println("Unesi vase korisnicko ime: ");
            String Username = sc.nextLine();
            System.out.println("Unesite vasu lozinku: ");
            String Password = sc.nextLine();
            provera(Username, Password);
          
        } catch (LoginException | FormException e) {
            e.printStackTrace();

        }

    }

    public static void provera(String a, String b) throws LoginException, FormException {
        if (a.equals("peroperic") && b.equals("pero123")) {
            System.out.println("Dobro dosao");

        } else if (!a.equals("peroperic") && b.equals("pero123")) {
            throw new UsernameException("Los unos username-a");

        } else if (a.equals("peroperic") && !b.equals("pero123")) {
            throw new PasswordException("Los unos passworda-a");
        } else if (!a.equals("peroperic") && !b.equals("pero123")) {
            throw new LoginException("Los unos podataka");

        }
        if (a.equals("atilak") && b.equals("atila123")) {
            System.out.println("Dobro dosao");
        } else if (!a.equals("atilak") && b.equals("atila123")) {
            throw new UsernameException("Los unos username-a");
        } else if (a.equals("atilak") && !b.equals("atila123")) {
            throw new PasswordException("Los unos password-a");
        } else if (!a.equals("atilak") && !b.equals("atila123")) {
            throw new LoginException("Los unos podataka");
        }

        if (a.equals("ucenik") && b.equals("nastava")) {
            System.out.println("Dobro dosao");
        } else if (!a.equals("ucenik") && b.equals("nastava")) {
            throw new UsernameException("Los unos username-a");
        } else if (a.equals("ucenik") && !b.equals("nastava")) {
            throw new PasswordException("Los unos password-a");
        } else if (!a.equals("ucenik") && !b.equals("nastava")) {
            throw new LoginException("Los unos podataka");
        } else {
        }
    }

}
