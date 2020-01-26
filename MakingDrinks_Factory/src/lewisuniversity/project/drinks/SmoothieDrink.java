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
 public class SmoothieDrink implements Drink{
   String typeOfSmoothie;
   
   public SmoothieDrink(){
       
   }
   public SmoothieDrink(String typeOfSmoothie){
       this.typeOfSmoothie = typeOfSmoothie;
   } 
   public String getName(){
       
       return typeOfSmoothie;
   }
   public int getCost(){
       return 3;
   }
   public String getType(){
       
       return "A sweet and savory beverage made with milk of your choice of flavor.";
   }
   public String getDescription(){
       
       return "A drink that contains freshly squeezed fruit with ice-cream of your choice and milk";
   }
}
