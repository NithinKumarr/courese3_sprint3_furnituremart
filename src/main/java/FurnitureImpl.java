public class FurnitureImpl {
    public static void main(String[] args) {
        FurnitureItem furnitureitem=new FurnitureItem();
        float discountedPrice=furnitureitem.calculatedDiscount();
        System.out.println("New Furniture price:-  " +discountedPrice);
    }
}
