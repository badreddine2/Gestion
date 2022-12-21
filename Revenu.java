import java.util.*;
import java.sql.* ;

public class Revenu {
    public int salaire ;
    public String mois ;
    public int loyer ;
    public int fun = 20+30+18+30 ;
    public int bouf;
    public int mom ;
    public int dette;




    public Revenu(String mois ,int salaire, int loyer, int fun, int bouf, int mom, int dette) {
        this.mois = mois ;
        this.salaire = salaire;
        this.loyer = loyer;
        this.bouf = bouf;
        this.fun = fun;
        this.mom = mom;
        this.dette=dette ;

    }
    public int getMom() {
        return mom;
    }
    public int getBouf() {
        return bouf;
    }
    public int getFun() {
        return fun;
    }
    public int getSalaire() {
        return salaire;
    }
    public int getLoyer() {
        return loyer;
    }
    public int getDette() {
        return dette;
    }
    public String getMois() {
        return mois;
    }
    public int charge(){
        int cal=fun+bouf+mom ;
        return cal ;
    }
    public int chargeFixe(){
        return charge()+loyer ;
    }
    public int epargne(){
        return 500 ;
    }

    public int netto() {
        return  (salaire-chargeFixe()-dette-epargne()) ;
    }


    public static void main(String[] args) {
        //ArrayList<Revenu> teller = new ArrayList<>() ;
        int dt = 0 ;
        int ep = 0 ;
        int rest = 0 ;
        Revenu decembre = new Revenu("decembre",2200,850,98,250,160, 80) ;
        Revenu janvier = new Revenu("janvier",2200,850,98,250,160, 180) ;
        Revenu fevrier = new Revenu("fevrier",2200,850,98,250,160, 150) ;
        Revenu mars = new Revenu("mars",2200,850,98,250,160, 50) ;
        Revenu avril = new Revenu("avril",2200,850,98,250,160, 0) ;
        Revenu mai = new Revenu("mai",2200,850,98,250,160, 50) ;
        Revenu juin = new Revenu("juin",2200,850,98,250,160, 0) ;
        Revenu juillet = new Revenu("juillet",2200,850,98,250,160, 0) ;
        Revenu aout = new Revenu("aout",2200,850,98,250,160, 50) ;
        Revenu septembre = new Revenu("septembre",2200,850,98,250,160, 0) ;
        Revenu octobre = new Revenu("octobre",2200,850,98,250,160, 50) ;
        Revenu novembre = new Revenu("novembre",2200,850,98,250,160, 50) ;
        ArrayList<Revenu> teller = new ArrayList<Revenu>() ;
        teller.add(decembre);
        teller.add(janvier);
        teller.add(fevrier);
        teller.add(mars);
        teller.add(avril);
        teller.add(mai);
        teller.add(juin);
        teller.add(juillet);
        teller.add(aout);
        teller.add(septembre);
        teller.add(octobre);
        teller.add(novembre);
        int x=teller.get(0).epargne() ;
        System.out.println(x);
        for( int i = 0 ; i<teller.size() ; i++){
            //System.out.println( "Epargne -> " + teller.get(i).mois+" : "+teller.get(i).epargne()+ "€");

           dt += teller.get(i).dette ;
           ep += teller.get(i).epargne() ;
            System.out.println("Le reste du mois "+teller.get(i).mois+" est "+teller.get(i).netto());
            if(teller.get(i).mois=="mars"){
                System.out.println("somme d'épargne jusqua Mars "+ ep+"€");
            }
        }
        //System.out.println("somme de dette "+ dt+"€");
        System.out.println("somme d'épargne "+ ep+"€");

    }
}
