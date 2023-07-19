import java.util.Arrays;

public class Kata217 {
    public static void main(String[] args) {
        Day day = Day.MONDAY;

        System.out.println(day.getRusName());
        System.out.println(day.isWeekend());
    }

    public enum Day {
        MONDAY("Пнедельник", false),
        TUESDAY("Вторник", false),
        WEDNESDAY("Среда", false),
        THURSDAY("Четверг", false),
        FRIDAY("Пятница", false),
        SATURDAY("Суббота", true),
        SUNDAY("Воскресенье", true);
        String rusName;
        boolean isWeek;

        Day(String rusTranslation, boolean isWeek) {
            this.rusName = rusTranslation;
            this.isWeek = isWeek;
        }

        public boolean isWeekend() {
            return isWeek;
        }

        public String getRusName() {
            return rusName;
        }
    }
}