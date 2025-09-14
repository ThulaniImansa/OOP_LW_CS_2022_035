package LW02;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Q06 {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf.format(date));
    }
}
