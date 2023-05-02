
import java.util.Scanner;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Tyuumon {
    
    public static void main(String[] args) {
       
        System.out.println("注文をお選びください");
        System.out.println("ご希望の数字を選択してください");
        

        int sold = 0;
        while(true) {
            System.out.println("1.にぎり 2.軍艦 3.その他 4.デザート 5.ドリンク 6.おあいそ 7.注文履歴");
            Scanner scanner =  new Scanner(System.in);
            int i= scanner.nextInt();
        if(i == 1) {
            Nigiri n =new Nigiri ();
            n.mentu();
            n.neta();
            System.out.println();
            sold += 110;
        }if(i ==2) {
            Gunnkann g =new Gunnkann ();
            g.mentu();
            g.neta();
            System.out.println();
            sold += 110;
        }if(i ==3) {
            Sonota s = new Sonota ();
            s.mentu();
            s.neta();
            System.out.println();
            sold += 110;
        }if(i ==4) {
            Deza d1 = new Deza();
            d1.mentu();
            d1.neta();
            System.out.println();
            sold += 110;
        }if(i ==5) {
            Dori d2 = new Dori();
            d2.mentu();
            d2.neta();
            System.out.println();
            sold += 110;
        }if(i ==6){
            System.out.println(sold);
            break;
        }if(i == 7){
            System.out.println("ご注文履歴を表示します");
            try(
                BufferedReader r = Files.newBufferedReader(
                    Paths.get(".","rireki.txt"),
                    StandardCharsets.UTF_8))
                    {
                    String line;
                    while((line  = r.readLine())!= null) {
                        System.out.println(line);
                    }
                }catch(IOException ex) {
            ex.printStackTrace(); 
        }

        }
        else{}



    }}
    
}
class Nigiri {
    String a;
    String b;
    String c;
    String m;
    int buy =0;
    
    public Nigiri() {
        this.m = "nigiri";
    }
    
    public void mentu(){
        try(
                BufferedReader r = Files.newBufferedReader(
                    Paths.get(".", m + ".txt"),
                    StandardCharsets.UTF_8))
                    {
                    String line;
                    while((line  = r.readLine())!= null) {
                        System.out.println(line);
                    }
                }catch(IOException ex) {
            ex.printStackTrace(); 
        }
    }
    
    public void neta(){
        Scanner scanner =  new Scanner(System.in);
        int ans2 = scanner.nextInt();
        try(
                BufferedReader r = Files.newBufferedReader(
                    Paths.get(".", m + ".txt"),
                    StandardCharsets.UTF_8))
                    {
                    String line;
                    for( int i = 0; i < (ans2 -1); i++) {
                        line = r.readLine();
                    }
                    line = r.readLine();
                    if(line == null) {
                    }else{
                    System.out.println(line +  "をお届けします");
                    }
                }catch(IOException ex) {
            ex.printStackTrace(); }

        try(BufferedWriter writer = Files.newBufferedWriter(
            Paths.get(".","rireki.txt"), 
            StandardCharsets.UTF_8,
            StandardOpenOption.APPEND) 
            ){
            try(BufferedReader r = Files.newBufferedReader(
                Paths.get(".", m + ".txt"),
                StandardCharsets.UTF_8)){
                String line;
                for( int i = 0; i < (ans2 -1); i++) {
                    line = r.readLine();
                }
                line = r.readLine();
                writer.write(line);
                writer.newLine();

        } catch (IOException e){
            e.printStackTrace();
        }
    } catch (IOException e){
        e.printStackTrace();
    }
}
}

    class Gunnkann extends Nigiri {
        
        public Gunnkann() { 
            this.m = "gunnkann"; 
        }
    }
    class Sonota extends Nigiri {

        public Sonota() {
            this.m = "sonota";
        }
    }
    class Deza extends Nigiri {
        public Deza() {
            this.m = "deza";
        }
    }
    class Dori extends Nigiri {
        public Dori() {
            this.m = "dori";
        }
    }

                      