package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        if (year == 2004 || year == 2000){
            System.out.println("leap");
        }else {
            System.out.println("not leap");
        }
    }
}
