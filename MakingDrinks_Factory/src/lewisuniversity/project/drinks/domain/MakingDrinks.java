/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisuniversity.project.drinks.domain;
import lewisuniversity.project.drinks.interfaces.DrinkFactoryClient;
import lewisuniversity.project.drinks.interfaces.Drink;
import lewisuniversity.project.drinks.SmoothieDrink;
import lewisuniversity.project.drinks.JuiceDrink;
import lewisuniversity.project.drinks.SodaDrink;
import lewisuniversity.project.drinks.SpecialDrink;
import lewisuniversity.project.drinks.factory.DrinkFactory;

/**
 *
 * @author ATirmizi
 */
public class MakingDrinks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DrinkFactoryClient client = new DrinkFactory();
        Drink drinkChoice = client.setInstance("Soda");
        System.out.println(drinkChoice.getName());
        System.out.println(drinkChoice.getDescription());
        System.out.println(drinkChoice.getName());
        
        Drink drinkChoice2 = client.setInstance("Juice");
        System.out.println(drinkChoice2.getCost());
    }
    
}


