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
public class OneItemBox extends Box{
    
    private final ArrayList<Item> itemInBox;
    
    public OneItemBox(){
        this.itemInBox = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(this.itemInBox.isEmpty()){
            this.itemInBox.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        return this.itemInBox.contains(item);
    }
    
}
