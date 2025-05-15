package bignum;

import java.math.BigInteger;

/**
 * @author 司志俊
 * @version 1.0
 */
public class BigInteger_ {
    public static void main(String[] args) {
        //long i = 10098238297733893462398472;
        //System.out.println(i);
        BigInteger bigInteger = new BigInteger("1399210904782304731298751282941094109");
        System.out.println(bigInteger);
        BigInteger bigInteger1 = new BigInteger("2178948613416");
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);
    }

}
