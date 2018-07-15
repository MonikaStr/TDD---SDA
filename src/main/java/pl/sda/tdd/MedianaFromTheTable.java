package pl.sda.tdd;

public class MedianaFromTheTable {
    /*jeżeli tablica jest:
    - nullem, to metoda zwraca Integera (a w teście rzutować go na inta)
    - empty, to metoda zwraca 0
    - even, to metoda zwraca liczbę z indeksem (i+1)
     */

    //jedna metoda z tablicą w parametrze

    public static int showMedian(int[] tab){
        int p = tab[(tab.length-1)/2];
        return p;
    }

}
/*
w metodzie, z zajęć

public Integer find(int[] tab) {
if (tab == null || tab.length ==0) {
return null;
}
if (tablength % 2 == 0) {
return tab[tab.length - 1 / 2]
}
return tab[tab.length / 2];
}
 */