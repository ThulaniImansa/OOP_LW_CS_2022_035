package LW03.Q03;


public class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner(){
        ownerName="Unknown";
        phoneNo="Not Available";
    }
    public Owner(String name,String num){
        ownerName=name;
        phoneNo=num;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String toString(){
        return "Owner Name: " + ownerName + ", Phone No: " + phoneNo;
    }
}
