/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OORestaurants;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class SecondClass {
    
    
    public double MorogPolao;
    public double KachchiBiryani;
    public double GrilledChickenwithNaanRoti; 
    public double Pasta;
    
     public double Pepsi;
    public double Cocacola;
    public double Sprite; 
    public double Mineralwater;
    
    
    public double Meals;
    public double Drinks; 
    public double TotalofMD;
    
     public double AllTotalofMD;
    
    public double GetAmount(){
        
    Meals = MorogPolao + KachchiBiryani + GrilledChickenwithNaanRoti + Pasta ;
        
    Drinks  = Pepsi + Cocacola + Sprite + Mineralwater;
        
    TotalofMD = Meals + Drinks;
        
    AllTotalofMD =   TotalofMD;
             
    return AllTotalofMD ;
    }
        
     private JFrame frame;
     
     public void iExitSystem(){
         frame = new JFrame("Exit");
     
         if (JOptionPane.showConfirmDialog(frame, "confim if you want to exit","Restaurant Billing Systems",
         JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
         
         System.exit(0);
         
        }
     }
     
     
     //========================================price===========================================
     
      public double pMorogPolao = 150;
    public double pKachchiBiryani = 250;
    public double pGrilledChickenwithNaanRoti = 90; 
    public double pPasta = 70;
    
     public double pPepsi = 25;
    public double pCocacola = 30;
    public double pSprite = 30; 
    public double pMineralwater = 20;
     
     
     
     
     //==============================================tax============================================
     
     public double mcTax = 0.90;
       public Double cFindTax( double cAmount){
               
               double FindTax = cAmount -(cAmount * mcTax);
               
               return FindTax;
     
       }
     //==========================================================================================================
     
     }
     
    
    
    
    

    
    
    
    
    
    

