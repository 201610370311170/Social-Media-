package sosmed;


import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Collections;

public class Sosmed {
    public static void main(String[] args) {
        
      System.out.println("        LOGIN  ");
        System.out.print("Username\t: ");
        String login = input.nextLine();
        
        System.out.print("Password\t: ");
        String login2 = input.nextLine();
        
        
        if(login.equals("user") && login2.equals("user")){
        
        //INI GRUP 1 
        ArrayList<data> grup1 = new ArrayList<>();
        grup1.add(new data("Denis", "Laki-laki", "MALANG", "Denis@gmail.com"));
        grup1.add(new data("Ropip", "Laki-laki", "SURABAYA", "Ropip@gmail.com"));
        grup1.add(new data("Yudi", "Laki-laki", "MADURA", "Yudi@gmail.com"));
        grup1.add(new data("Sugiono", "Laki-laki", "JAKARTA", "Sugiono@gmail.com"));
        grup1.add(new data("Arin", "Perempuan", "BBANYUWANGI", "Arin@gmail.com"));
                
        ArrayList<data> grup2 = new ArrayList<>();
        grup2.add(new data("Irhaz", "Laki-laki", "LAMPUNG", "Irhza@gmail.com"));
        grup2.add(new data("Freya", "Perempuan", "KALIMANTAN", "Freya@gmail.com"));
        grup2.add(new data("Valhalla", "Laki-laki", "KEDIRI", "Valhalla@gmail.com"));
        grup2.add(new data("Rere", "Perempuan", "MOJOKERTO", "Rere@gmail.com"));
        grup2.add(new data("Debora", "Perempuan", "MALANG", "Debora@gmail.com"));
        
        
    }
    
}
