/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisuniversity.project.drinks;
import lewisuniversity.project.drinks.interfaces.Drink;

/**
 *
 * @author ATirmizi
 */
public class JuiceDrink implements Drink{
   String typeOfJuice;
   
   public JuiceDrink(){
       
   }
   public JuiceDrink(String typeOfJuice){
       this.typeOfJuice = typeOfJuice;
   }  
   public String getName(){
       
       return typeOfJuice;
   }
   public int getCost(){
       return 2;
   }
   public String getType(){
       
       return "A freshly squeezed fruit juice";
   }
   public String getDescription(){
       
       return "Cool, fresh and strong taste thats made with freshly-squeezed fruit and milk";
   }
    
}
