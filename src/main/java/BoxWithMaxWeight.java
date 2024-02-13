/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author swapn
 */
public class BoxWithMaxWeight extends Box{
    
    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }
    
    @Override
    public void add(Item item){
        if(getCurrentWeight()+item.getWeight() <= this.capacity){
            this.items.add(item);
        }
    }
    
    public int getCurrentWeight(){
        int currentWeight=0;
        for(Item item: this.items){
            currentWeight += item.getWeight();
        }
        return currentWeight;
    }
    
}
