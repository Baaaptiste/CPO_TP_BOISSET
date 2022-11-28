/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_boisset_bouzidi;

/**
 *
 * @author bapti
 */
public class CelluleDeGrille {
    private Jeton jetonCourant;
    private boolean avoirTrouNoir;
    private boolean avoirDesintegrateur;

    public CelluleDeGrille() {
        this.jetonCourant = null;
        this.avoirTrouNoir = false;
        this.avoirDesintegrateur = false;
    }
    
    public boolean presenceJeton(){
        if (jetonCourant==null){
            return false ;
        }
        else{
            return true ;
        }
    }

    public void affecterJeton(Jeton jeton) {
        this.jetonCourant = jeton;
    }
    
    public String lireCouleurDuJeton(){
       if ( jetonCourant!=null){
           return jetonCourant.lireCouleur();
       }
       else{
           return "vide" ;
       }
    }
    
    public Jeton recupererJeton(){
        Jeton stock = jetonCourant;
        jetonCourant = null ;
        return stock;       
    }
    
    public void placerTrouNoir(){
        avoirTrouNoir = true;
    }
    
    public void supprimerTrouNoir(){
        avoirTrouNoir = false;      
    }
    
    public boolean presenceTrouNoir(){
        if (avoirTrouNoir==true){
            return true ;
        }
        else{
            return false ;
        }
    }
     
    public void supprimerJeton(){
        jetonCourant=null;
    }
    
    public boolean presenceDesintegrateur(){
        if (avoirDesintegrateur==true){
            return true ;
        }
        else{
            return false ;
        }
    }
    
    public void placerDesintegrateur(){
        avoirDesintegrateur = true;
    }
    
    public void supprimerDesintegrateur(){
        avoirDesintegrateur = false;   
    }
    
    public void activerTrouNoir(){
       supprimerJeton() ;
       supprimerTrouNoir();
    }

    @Override
    public String toString() {
        if ("J".equals(jetonCourant)||"R".equals(jetonCourant)){
            return jetonCourant.lireCouleur();
        }
        else if (avoirTrouNoir == true){
            return"@";
        }
        else if (avoirDesintegrateur == true && avoirTrouNoir == false){
            return"D";
        }
        else{
            return".";
        }
        }
    
    
}
