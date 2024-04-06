package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class staticp {
    public static void main(String[] args) {
        System.out.println("version statique");
        DaoImpl d = new DaoImpl();
        MetierImpl metier = new MetierImpl(d);
        System.out.println(metier.calcul());

    }


}
