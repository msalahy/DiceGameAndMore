
package javaapplication86;


public class RoomCarpet {
    private Area size;
    private double carpetCost;
    private double totalCarpetCost;
    public RoomCarpet(Area size, double carpetCost) {
        this.size = size;
        this.carpetCost=carpetCost;
        this.totalCarpetCost = carpetCost*size.length*size.width;
    }

    @Override
    public String toString() {
        return "RoomCarpet{" + "size=" + size + ", carpetCost=" + carpetCost + ", totalCarpetCost=" + totalCarpetCost + '}';
    }

    
}
