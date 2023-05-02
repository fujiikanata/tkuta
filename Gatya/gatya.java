import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.nio.file.StandardOpenOption;
public class gatya {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("モードを選択してください");
        System.out.println("1.通常 2.Gフェス");
        int syu = scanner.nextInt();
        if(syu == 1){
            System.out.println("10連ガチャ");
            scanner.nextLine();
        for(int i =0; i<=9; i++){
            double score = Math.floor(Math.random()*100);
            if(score <4) {
                SSR ssr = new SSR();
                ssr.kyara();
            }if(score >=4 && score < 19){
                SR sr = new SR ();
                sr.kyara();
            }if(score >=19) {
                R r = new R ();
                r.kyara();
            }

        }
    }if(syu == 2){
        System.out.println("フェス10連ガチャ");
        scanner.nextLine();
        for(int i =0; i<=9; i++){
            double score = Math.floor(Math.random()*100);
            if(score <7) {
                SSR ssr = new SSR();
                    GFSSR gfssr = new GFSSR ();
                    gfssr.kyara();
            }if(score >=7 && score < 22){
                SR sr = new SR ();
                sr.kyara();
            }if(score >=22) {
                R r = new R ();
                r.kyara();
            }

    }

    }
    
}
}
class SSR {
    String m;
    int a;
    public SSR(){
        this.m = "ssr";
        this.a = 219;
    }
    public void kyara(){
        double score = Math.floor(Math.random()*a);
        try(BufferedWriter writer = Files.newBufferedWriter(
            Paths.get(".","kekka.txt"), 
            StandardCharsets.UTF_8,StandardOpenOption.APPEND) 
        ){
            try(
                BufferedReader r = Files.newBufferedReader(
                    Paths.get(".", m + ".txt"),
                    StandardCharsets.UTF_8))
                    {
                    String line;
                    for( int i = 0; i < (score -1); i++) {
                        line = r.readLine();
                    }
                    line = r.readLine();
                    writer.write(line);
                    writer.newLine();
                    System.out.println(m +" "+ line);
                }catch(IOException ex) {
            ex.printStackTrace(); }
            } catch (IOException e){
            e.printStackTrace();
        }
    }
}
class SR extends SSR {
    public SR(){
        this.m = "sr";
        this.a = 112;
    }
}
class R extends SSR {
    public R(){
        this.m = "r";
        this.a = 59;
    }
}
class GFSSR extends SSR {
    public GFSSR(){
        this.m = "gfssr";
        this.a = 363;
    }
}
