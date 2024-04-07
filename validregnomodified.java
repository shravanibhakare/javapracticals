import java.util.Random;

class sybit048 {
    public static int count1 = 0;
    public static int count2 = 0;

    public static void main(String[] args) {
        //String[] array = generate_array();
        int i = 0;
        long[] timearr1 = new long[5];
        long[] timearr2 = new long[5];
        while (i < 5) {
         String[] array = generate_array();
            long startTime1 = System.nanoTime();
            System.out.println("starting time of approach1 "+ startTime1);
            for (String Str : array) {
                int result1 = approach1(Str);
                if (result1 == 1) {
                    count1++;
                }
            }
            System.out.println("valid number of registration numbers in approach1 are " + count1 );
            long endTime1 = System.nanoTime();
            System.out.println("ending time of approach1 "+ endTime1);
            long time_diff1 = endTime1 - startTime1;
           System.out.println("time difference of approach1 "+ time_diff1);
            timearr1[i] = time_diff1; 
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");
            

            long startTime2 = System.nanoTime();
            System.out.println("starting time of approach2 "+ startTime2);
            for (String Str : array) {
                int result2 = approach2(Str);
                if (result2 == 1) {
                    count2++;
                }
            }
            System.out.println("valid number of registration numbers in approach1 are " + count1 );
            long endTime2 = System.nanoTime();
            System.out.println("ending time of approach2 "+ endTime2);
            long time_diff2 = endTime2 - startTime2;
            System.out.println("time difference of approach2 "+ time_diff2);
            timearr2[i] = time_diff2;
            System.out.println("  ");
            System.out.println("  ");
            System.out.println("  ");

            i++;
            count1 = 0;
            count2 = 0;
        }
        long sum1 = 0;
        long sum2 = 0;
        for (int j = 0; j < 5; j++) {
            sum1 += timearr1[j];
            sum2 += timearr2[j];
        }
        long avgsum1 = sum1 / 5;
        long avgsum2 = sum2 / 5;
        if (avgsum1 < avgsum2) {
            System.out.println("First approach takes less time");
        } else {
            System.out.println("Second approach takes less time");
        }
    }

    static String[] generate_array() {
        String[] array = new String[1000000];
        for (int i = 0; i < 1000000; i++) {
            array[i] = "2022bit" + randomnumgenerate();
        }
        return array;
    }

    public static String randomnumgenerate() {
        Random rand = new Random();
        int num = rand.nextInt(1000); // Generate a random number between 0 and 999
        return String.format("%03d", num); // Ensure the number has 3 digits
    }

    static int approach1(String arr) {
        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(arr.charAt(i))) {
                return 0;
            }
        }
        if (arr.charAt(7) == '0' && (arr.charAt(8) < '5') && Character.isDigit(arr.charAt(9))) {
            return 1;
        }
        return 0;
    }

    static int approach2(String arr) {
        int length = arr.length();
        String last3digits = arr.substring(length - 3);
        if (Integer.parseInt(last3digits) < 50) {
            return 1;
        } else {
            return 0;
        }
    }
}

