import java.util.Scanner;

    class Pachinnko {
        
        int money;

        public Pachinnko(String money) {
            this.money = 1000;
        
    double score = Math.floor(Math.random() * 100);
    
    Scanner scan = new Scanner(System.in);
    System.out.println("あなたの所持金は" + this.money + "です。");
for(int i = 1000; i > 100;)   {

    i = this.money ;

    scan.nextLine();
    this.money -=100;
        System.out.println("あなたの所持金は" + this.money + "です。");
        scan.nextLine();
    if(score <10) {
        System.out.println("期待値大です");
        
        double score01 = Math.floor(Math.random() * 100);
        scan.nextLine();
        if(score01 <80) {
            System.out.println("激アツ");
            double score02 = Math.floor(Math.random() * 100);
            scan.nextLine();
        if(score02 <30) {
            System.out.println("あたり");
            this.money *= (1+((100 - score01)/100));
            System.out.println("あなたの所持金は" + this.money + "です。");
        } else {System.out.println("残念");}
        } else {System.out.println("残念");}
    } else { if(score >=10 && score <= 30) {
        System.out.println("期待あり");
        scan.nextLine();
        double score03 = Math.floor(Math.random() * 100);

        if(score03 <50) {
            System.out.println("激アツ");
            scan.nextLine();
            double score04 = Math.floor(Math.random() * 100);
             
        if(score04 <30) {
            System.out.println("あたり");
            this.money *= (1+((100 - score03)/100));
            System.out.println("あなたの所持金は" + this.money + "です。");
        } else {System.out.println("残念");}
        } else {System.out.println("残念");}

    } else { if(score >30 && score <= 60) {
        System.out.println("まあまあかな");
        scan.nextLine();
        double score05 = Math.floor(Math.random() * 100);

        if(score05 <30) {
            System.out.println("激アツ");
            scan.nextLine();
            double score06 = Math.floor(Math.random() * 100);
             
        if(score06 <20) {
            System.out.println("あたり");
            this.money *= (1+((100 - score05)/100));
            System.out.println("あなたの所持金は" + this.money + "です。");
        } else {System.out.println("残念");}
        } else {System.out.println("残念");}

    }else { if(score >60 && score <= 100) {
        System.out.println("びみょ");
        scan.nextLine();
        double score07 = Math.floor(Math.random() * 100);

        if(score07 <20) {
            System.out.println("激アツ");
            scan.nextLine();
            double score08 = Math.floor(Math.random() * 100);
             
        if(score08 <10) {
            System.out.println("あたり");
            this.money *= (1+((100 - score07)/100));
            System.out.println("あなたの所持金は" + this.money + "です。");

        } else {System.out.println("残念");}
        } else {System.out.println("残念");}
    
    }
        }
    } 
}
    }
    System.out.println("お金が足りないよ");}
}

class Itipati {


    public static void main(String[] args) {

        Pachinnko pachinnko = new Pachinnko("所持金");
  
    }
}


