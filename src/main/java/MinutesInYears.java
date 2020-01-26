public class MinutesInYears {

    public static void main(String[] args) {

        MinutesInYears.minutesInYears(60);

    }
    public static void minutesInYears(long minutes){

        if (minutes < 0L){
            System.out.println("Invalid value: " + minutes);
        } else {
            long years = minutes / 525600;
            long remMinInYear = minutes % 525600;
            long day = remMinInYear / 1440;
            long remMinInDay = day % 1440;
            long hour = remMinInDay / 60;
            long remMinInHour = hour % 60;
            System.out.println(years + " " + day + " " + hour + " " + remMinInHour);
        }


    }
}

