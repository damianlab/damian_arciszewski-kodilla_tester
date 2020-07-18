
public class LeapYear {

    int year;
    boolean leapYear;

    public LeapYear(int year) {
        this.year = year;
    }
    public void checkLeapYear() {
        leapYear = (this.year % 4 == 0 && this.year % 100 != 0 || this.year % 400 == 0);


        if(leapYear == true) {
            System.out.println(this.year + " " + "Is a loop year");}

        else {
            System.out.println(this.year + " " + "Is not a loop year");}
    }
}