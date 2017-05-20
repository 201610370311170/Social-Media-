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
        
        
        
        System.out.println("\n--DAFTAR TEMAN GRUP 1--");
        
       //INI SORTING   
        System.out.println();
        Collections.sort(grup1);
        for(data d : grup1){ 
            System.out.println(d.getNama());
        }

        
            System.out.println("\n--DAFTAR TEMAN GRUP 2--");
        System.out.println();
        Collections.sort(grup2);
        for(data d : grup2){
            System.out.println(d.getNama());
           
        }
        
        
        //INI BUAT LINKED (HASHMAP)
        HashMap<String, data> objek1 = new HashMap<>();
        objek1.put("Arin", grup1.get(0));
        objek1.put("Denis", grup1.get(1));
        objek1.put("Ropip", grup1.get(2));
        objek1.put("Sugiono", grup1.get(3));
        objek1.put("Yudi", grup1.get(4));
        System.out.println("");
        
        
        objek1.put("Debora", grup2.get(0));
        objek1.put("Freya", grup2.get(1));
        objek1.put("Irhaz", grup2.get(2));
        objek1.put("Rere", grup2.get(3));
        objek1.put("Valhalla", grup2.get(4));
         
    }
    
}
