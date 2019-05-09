package ba.unsa.etf.rs;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite listu brojeva: \t (0 za kraj)");
        ArrayList<Integer> listaBrojeva = new ArrayList<>();
        int pomocna;
        while(unos.hasNextInt()) {
            pomocna = unos.nextInt();
            listaBrojeva.add(pomocna);
            if(pomocna==0) break;
        }

        listaBrojeva.sort((prvi, drugi) -> {
            int sumaPrvog = 0;
            while (prvi != 0) {
                sumaPrvog += prvi % 10;
                prvi /= 10;
            }

            int sumaDrugog = 0;
            while (drugi != 0) {
                sumaDrugog += drugi % 10;
                drugi /= 10;
            }
            return sumaPrvog - sumaDrugog;
        });
        System.out.print("Sortirani brojevi: ");
        for(int x : listaBrojeva) {
            System.out.println(x);
        }
    }
}
