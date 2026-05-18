public class CalculatorTest {
    public static void main(String[] args){

        Calculator cal = new Calculator();
        if(cal.add(2,3)==5){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test Failed");
        }

        Calculator cal1 = new Calculator();
        if(cal1.subtract(5,3)==2){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test Failed");
        }

        Calculator cal2 = new Calculator();
        if(cal2.multiply(2,3)==6){
            System.out.println("Test Passed");
        }
        else{
            System.out.println("Test Failed");
        }

        Calculator cal3 = new Calculator();
        try {
            if(cal3.division(6,2)==3){
                System.out.println("Test Passed");
            }
        } catch (ArithmeticException e) {
            System.out.println("Test Failed");
        }
    }
}

