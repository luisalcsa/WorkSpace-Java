package section10.application;

import java.util.ArrayList;
import java.util.List;

public class Program3 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("maria");
        list.add("jose");
        list.add("ana");
        list.add(2, "marcos");

        System.out.println(list.size());
        System.out.println("Posicão Maria = " + list.indexOf("maria"));

        list.remove("ana");
        list.remove(1);
        for(String x : list){
            System.out.println(x);
        }

    }
}
