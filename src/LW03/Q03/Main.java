package LW03.Q03;



public class Main {
    public static void main(String[] args) {
        Bicycle bike1=new Bicycle("Thulani","0770625997");
        bike1.displayOwnerInfo();
        Owner person=new Owner("Imansa","0772345634");
        Bicycle bike2=new Bicycle();
        bike2.setOwner(person);
        System.out.println("\nBike 2 details:");
        bike2.displayOwnerInfo();
    }
}
