import java.util.Date;

public class StringFormatPractice {
    public static void main(String[] args) {
        // Syntax
        /***
         * % [argument number] [flags] [width] [.precision] type
         *
         * % and type is mandatory
         *
         * [argument number] - number of argument by order in string
         *
         * [flags] - special formatting options like comma, negative number in parentheses...
         *
         * [width] - minimum number of chars
         *
         * [.precision] - with dot number, sets number of decimal places
         *
         * type - type of number, d - decimal, f - double or floating number, x - hexadecimal, etc.
         ***/

        System.out.println("Example 1");
        // Let's get text 'Bank: 1 234 203.20'
        double cash = 1234203.20;
        String formattedString = String.format("Bank: %,.2f$", cash);
        System.out.println(formattedString);

        System.out.println("Example 2");
        // Let's get text 'Bank: 1 234 203.20, Spent: 100 000'
        int spent = 100000;
        formattedString = String.format("Bank: %,.2f$, Spent:%,d$", cash, spent);
        System.out.println(formattedString);

        System.out.println("Example 3");
        Date today = new Date();

        String dateAndTimeFormat = String.format("Date and time: %tc", today);
        System.out.println(dateAndTimeFormat);
        String justTimeFormat = String.format("Time: %tr", today);
        System.out.println(justTimeFormat);
        String weekDayNameMonthNameDay = String.format(
                "Week day name: %tA\nMonth name: %<tB\nDay: %<td", today);
        System.out.println(weekDayNameMonthNameDay);
    }
}
