package fractionNumbers;

/**
 * Created by Dimaster on 25.06.2017.*
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("--------------- Sum ---------------");
        FractionNumber num1 = null;
        try {
             num1 = new FractionNumber(-2,0);
        }catch (IllegalArgumentException e){
            System.out.println("Divisor must not be ");
        }
        FractionNumber num2 = new FractionNumber(3, 5);
        FractionNumber num3 = new FractionNumber(5,7);
        FractionNumber num4 = new FractionNumber(23,44);
        FractionNumber num5 = new FractionNumber(108,174);
        FractionNumber num6 = new FractionNumber(540, 678);
        FractionNumber num7 = new FractionNumber(-54,66);
        FractionNumber num8 = new FractionNumber(18, -26);
        FractionNumber num9 = new FractionNumber(10568,12349);
        FractionNumber num10 = new FractionNumber(30418,42522);

        FractionNumberOperations res1 = new FractionNumberOperations();

        try{
            FractionNumber result1 = res1.add(num1,num2);
            result1.printToConsole();
        }catch (NullPointerException e){
            System.out.println("a == null || b == null");
        }
        FractionNumber result2 = res1.add(num3,num4);
        result2.printToConsole();
        FractionNumber result3 = res1.add(num5, num6);
        result3.printToConsole();
        FractionNumber result4 = res1.add(num7,num8);
        result4.printToConsole();
        FractionNumber result5 = res1.add(num9,num10);
        result5.printToConsole();

        System.out.println("--------------- Minus --------------");

        FractionNumber num11 = new FractionNumber(-2,4);
        FractionNumber num12 = new FractionNumber(3,5);
        FractionNumber num13 = new FractionNumber(5,7);
        FractionNumber num14 = new FractionNumber(23,44);
        FractionNumber num15 = new FractionNumber(108,174);
        FractionNumber num16 = new FractionNumber(540, 678);
        FractionNumber num17 = new FractionNumber(-54,66);
        FractionNumber num18 = new FractionNumber(18, -26);
        FractionNumber num19 = new FractionNumber(10568,12349);
        FractionNumber num20 = new FractionNumber(30418,42522);

        FractionNumberOperations res6 = new FractionNumberOperations();
        FractionNumber result6 = res6.sub(num11,num12);
        result6.printToConsole();
        FractionNumberOperations res7 = new FractionNumberOperations();
        FractionNumber result7 = res7.sub(num13,num14);
        result7.printToConsole();
        FractionNumberOperations res8 = new FractionNumberOperations();
        FractionNumber result8 = res8.sub(num15,num16);
        result8.printToConsole();
        FractionNumberOperations res9 = new FractionNumberOperations();
        FractionNumber result9 = res9.sub(num17,num18);
        result9.printToConsole();
        FractionNumberOperations res10 = new FractionNumberOperations();
        FractionNumber result10 = res10.sub(num19,num20);
        result10.printToConsole();

        System.out.println("--------------- Multiplication --------------");

        FractionNumber num21 = new FractionNumber(-2,4);
        FractionNumber num22 = new FractionNumber(3,5);
        FractionNumber num23 = new FractionNumber(5,7);
        FractionNumber num24 = new FractionNumber(23,44);
        FractionNumber num25 = new FractionNumber(108,174);
        FractionNumber num26 = new FractionNumber(540, 678);
        FractionNumber num27 = new FractionNumber(-54,66);
        FractionNumber num28 = new FractionNumber(18, -26);
        FractionNumber num29 = new FractionNumber(10568,12349);
        FractionNumber num30 = new FractionNumber(30418,42522);

        FractionNumberOperations res11 = new FractionNumberOperations();
        FractionNumber result11 = res11.mul(num21,num22);
        result11.printToConsole();
        FractionNumberOperations res12 = new FractionNumberOperations();
        FractionNumber result12 = res12.mul(num23,num24);
        result12.printToConsole();
        FractionNumberOperations res13 = new FractionNumberOperations();
        FractionNumber result13 = res13.mul(num25,num26);
        result13.printToConsole();
        FractionNumberOperations res14 = new FractionNumberOperations();
        FractionNumber result14 = res14.mul(num27,num28);
        result14.printToConsole();
        FractionNumberOperations res15 = new FractionNumberOperations();
        FractionNumber result15 = res15.mul(num29,num30);
        result15.printToConsole();

        System.out.println("--------------- Division --------------");

        FractionNumber num31 = new FractionNumber(-2,4);
        FractionNumber num32 = new FractionNumber(3,5);
        FractionNumber num33 = new FractionNumber(5,7);
        FractionNumber num34 = new FractionNumber(23,44);
        FractionNumber num35 = new FractionNumber(108,174);
        FractionNumber num36 = new FractionNumber(540, 678);
        FractionNumber num37 = new FractionNumber(-54,66);
        FractionNumber num38 = new FractionNumber(18, -26);
        FractionNumber num39 = new FractionNumber(10568,12349);
        FractionNumber num40 = new FractionNumber(30418,42522);

        FractionNumberOperations res16 = new FractionNumberOperations();
        FractionNumber result16 = res16.div(num31,num32);
        result16.printToConsole();
        FractionNumberOperations res17 = new FractionNumberOperations();
        FractionNumber result17 = res17.div(num33,num34);
        result17.printToConsole();
        FractionNumberOperations res18 = new FractionNumberOperations();
        FractionNumber result18 = res18.div(num35,num36);
        result18.printToConsole();
        FractionNumberOperations res19 = new FractionNumberOperations();
        FractionNumber result19 = res19.div(num37,num38);
        result19.printToConsole();
        FractionNumberOperations res20 = new FractionNumberOperations();
        FractionNumber result20 = res20.div(num39,num40);
        result20.printToConsole();
    }
}
