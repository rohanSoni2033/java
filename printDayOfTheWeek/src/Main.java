public class Main {
    public static void main(String []args){
        String dayOfTheWeek=printDayOfTheWeek(5);
        String dayOfTheWeekSecond = printDayOfTheWeekSecond(3);
        String dayOfTheWeekFirst = printDayOfTheWeekFirst(2);

        System.out.println(dayOfTheWeek);
        System.out.println(dayOfTheWeekSecond);
        System.out.println(dayOfTheWeekFirst);
    }

    public static String printDayOfTheWeek(int day){
        // enhanced switch statement
        return switch (day) {
            case 0 -> "sunday";
            case 1 -> "monday";
            case 2 -> "tuesday";
            case 3 -> "wednesday";
            case 4 -> "thursday";
            case 5 -> "friday";
            case 6 -> "saturday";
            default -> null;
        };
    }
    public static String printDayOfTheWeekFirst(int day){
        switch (day){
            case 0:
                // by introducing a local variable
                String sunday="sunday";
                return sunday;

            case 1:
                // by introducing a local variable
                return "monday";

            case 2:return "tuesday";

            case 3:return "wednesday";

            case 4:return "thursday";

            case 5:return "friday";

            case 6:return "saturday";
        }
        return "invalid number";
    }
    public static String printDayOfTheWeekSecond(int day){
        String dayName=null;
        switch (day){
            // normal switch statement
            case 0:dayName="sunday";
            break;
            case 1:dayName="monday";
            break;
            case 2:dayName="tuesday";
            break;
            case 3:dayName="wednesday";
            break;
            case 4:dayName="thursday";
            break;
            case 5:dayName="friday";
            break;
            case 6:dayName="saturday";
            break;
        }
        return dayName;
    }
}
