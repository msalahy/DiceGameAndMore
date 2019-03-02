
package inventorydemo;


public class item {


    public static void main(String[] args) {
        
        
        InventoryItem  item1, item2, item3;
        item1 = new InventoryItem();
        item2 = new InventoryItem("Wrench");
        item3 = new InventoryItem("Hammer", 40);
        
        
        
        item1.setDescription("Mohammad");
        item1.setUnits(34);
        
       // item.setUnits(14);
        
        System.out.println("Item 1 description equals "+item1.getDescription()+" Item 1 unit equals "+item1.getUnits());
        System.out.println("Item 2 description equals "+item2.getDescription()+" Item 2 unit equals "+item2.getUnits());
        System.out.println("Item 3 description equals "+item3.getDescription()+" Item 3 unit equals "+item3.getUnits());
        
        
        //displayItem(item);
       // changeItem(item);
         System.out.println("Item 2 description equals "+item2.getDescription()+" Item 2 unit equals "+item2.getUnits());
        
    }
    
    
    
    public static void displayItem(InventoryItem i){
        System.out.println("Despcription: "+i.getDescription());
        System.out.println("Units: "+i.getUnits());  
    }
    public static void changeItem(InventoryItem i){
        i.setDescription("Hello World");
        i.setUnits(787);
    }
    
}
