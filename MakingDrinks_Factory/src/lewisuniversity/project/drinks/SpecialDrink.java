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
public class SpecialDrink implements Drink{
   String typeOfSpecialDrink;
   
   public SpecialDrink(){
       
   }
   public SpecialDrink(String typeOfSpecialDrink){
       this.typeOfSpecialDrink = typeOfSpecialDrink;
   } 
   public String getName(){
       
       return typeOfSpecialDrink;
   }
   public int getCost(){
       return 4;
   }
   public String getType(){
       
       return "A specially made beverage of your choice of assorted flavors";
   }
   public String getDescription(){
       
       return "A mixture of your choice of fruits, candies, and artificial flavoring to get a sweet andsavory beverage for dessert.";
   }
    
}
