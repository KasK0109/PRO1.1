package ex1;

import java.util.ArrayList;

public class Opgave1 {
    public static void main(String[] args) {

        ArrayList<String> navne = new ArrayList<>();

        navne.add("Hans");
        navne.add("Viggo");
        navne.add("Jens");
        navne.add("Bente");
        navne.add("Bent");

        System.out.println(navne.size());

        navne.add(2,"Jane");

        System.out.println(navne);

        navne.remove(1);

        navne.set(0,"Pia");
        navne.add("Ib");

        navne.set(2,"Hansi");

        System.out.println(navne.size());

        System.out.println(navne);

        for (int i = 0; i < navne.size(); i++) {
            String navn = navne.get(i);
            System.out.println(navn.length());
        }

        for (String navn : navne) {
            System.out.println(navn.length());
        }
    }
}
