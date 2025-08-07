class Bicycle {
    private String ownerName;
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
public class BicycleRegistration {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        bike1.setOwnerName("Maaz");
        bike2.setOwnerName("Ahmer");
        System.out.println("Bicycle 1 is owned by " + bike1.getOwnerName());
        System.out.println("Bicycle 2 is owned by " + bike2.getOwnerName());
    }
}
