package LW03.Q03;



public class Bicycle {
    Owner owner;

    public Bicycle(){
        owner=new Owner();
    }
    public Bicycle(String name,String num){
        owner=new Owner(name,num);
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    public void displayOwnerInfo(){
        System.out.println(owner.toString());
    }
}
