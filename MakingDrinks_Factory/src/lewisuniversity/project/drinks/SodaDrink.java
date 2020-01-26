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
public class SodaDrink implements Drink{
   String typeOfSoda;
   
   public SodaDrink(){
       
   }
   public SodaDrink(String typeOfSoda){
       this.typeOfSoda = typeOfSoda;
   } 
   public String getName(){
       
       return typeOfSoda;
   }
   public int getCost(){
       return 1;
   }
   public String getType(){
       
       return "An ice-cold classic soda.";
   }
   public String getDescription(){
       
       return "A refreshing beverage of your choice.";
   }
    
}
