package metier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreditMetierImlpTest {

    @Test
    void calculerMensualiteCredit() {
        CreditMetierImlp metier = new CreditMetierImlp();
        double capital=200000;
        int duree=240;
        double taux=4.5;
        Assertions.assertEquals(1265.2987524399416 , metier.calculerMensualiteCredit(capital,taux, duree ));

    }
}