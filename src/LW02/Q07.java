package LW02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q07 {
    public static void main(String[] args) {
      Date date=new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("EEEE,MMMM dd, yyyy");
        System.out.print(sdf.format(date));
    }
}
