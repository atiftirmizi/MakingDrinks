/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lewisuniversity.project.drinks.factory;
import lewisuniversity.project.drinks.interfaces.Drink;
import lewisuniversity.project.drinks.SmoothieDrink;
import lewisuniversity.project.drinks.JuiceDrink;
import lewisuniversity.project.drinks.SodaDrink;
import lewisuniversity.project.drinks.SpecialDrink;
import lewisuniversity.project.drinks.interfaces.DrinkFactoryClient;

/**
 *
 * @author ATirmizi
 */
public class DrinkFactory implements DrinkFactoryClient {
    Drink instance = null;
    @Override
    public Drink setInstance(String instanceType){
        if(instanceType.contains("Smoothie")){
            instance = new SmoothieDrink("mango");
            return instance;
        }else if(instanceType.contains("Juice")){
            instance = new JuiceDrink("Orange");
            return instance;
        }else if(instanceType.contains("Soda")){
            instance =new SodaDrink("Pepsi");
            return instance;
        }else{
            instance = new SpecialDrink("Vanilla-Strawberry Shake");
            return instance;
        }        
        
    }
    
    public Drink getInstance(){
        return this.instance;
    }
}
