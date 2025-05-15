package bignum;

import java.math.BigDecimal;

/**
 * @author 司志俊
 * @version 1.0
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        double d = 122.671674618946191141;
        System.out.println(d);
        BigDecimal bigDecimal = new BigDecimal("122.671674618946191142");
        BigDecimal bigDecimal1 = new BigDecimal("1.3");
        System.out.println(bigDecimal);

        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));//可能抛出异常（除不尽）
        System.out.println(bigDecimal.multiply(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));

    }

}
