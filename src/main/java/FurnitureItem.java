public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private String furnitureGrade;
    private String color;
    private String furnitureUsage;
    private float price;
    static final int Discount = 5;

    public FurnitureItem() {
        this.furnitureCode = 7788;
        this.furnitureType = "Table";
        this.furnitureGrade = "Grade1";
        this.color = "Red";
        this.furnitureUsage = "Outdoor";
        this.price = 1000f;
    }

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public String getFurnitureGrade() {
        return furnitureGrade;
    }

    public void setFurnitureGrade(String furnitureGrade) {
        this.furnitureGrade = furnitureGrade;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float calculatedDiscount() {
        if (getFurnitureUsage().equals("Outdoor") && getFurnitureGrade().equals("Grade1")) {
            float newFurniturePrice = price - (price * Discount) / 100f;
            return newFurniturePrice;
        }
        return 0.0f;
    }


}
