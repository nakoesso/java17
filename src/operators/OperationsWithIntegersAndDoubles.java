package operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class OperationsWithIntegersAndDoubles {
    public static void main(String[] args) {
        BigDecimal rideFee  = new BigDecimal(20).setScale(0, RoundingMode.HALF_DOWN);
        BigDecimal amountOfPeople = new BigDecimal(3).setScale(0, RoundingMode.HALF_DOWN);
        BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, 2, RoundingMode.HALF_DOWN);
        System.out.println("Charge per person: " + chargePerPerson);
    }
}
