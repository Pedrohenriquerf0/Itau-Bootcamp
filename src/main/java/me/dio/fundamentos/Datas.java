package itau.bootcamp.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Datas {
    public static void main(String[] args) {
        Date data = new Date();
        DateFormat fomart = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");
        System.out.println(data);
        System.out.println(fomart.format(data));


        System.out.println("======================");


    }

}
