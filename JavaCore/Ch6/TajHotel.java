package Ch6;

class TajHotel {

    String[] room_types = {"Luxury","A/C", "Non-A/C", "Deluxe", "General"};
    int[] cost_per_day = {2500, 2000, 1500, 1200, 500};
    int[] total_bill = new int[cost_per_day.length];

    void calculateBill() {

        int no_of_days = 30;

        for (int i = 0; i < cost_per_day.length; i++) {

            total_bill[i] = cost_per_day[i] * no_of_days;
        }
    }

    void display() {

        System.out.println();
        System.out.println("\t\t\t\t\tThe Taj Hotel");
        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.format("%15s %15s %15s", "Room type", "Cost per day", "Total bill");
        System.out.println();
        System.out.println();

        for (int i = 0; i < cost_per_day.length; i++) {

//            System.out.println("\t" + room_types[i] + "\t\t\t" + cost_per_day[i] + "\t\t\t" + total_bill[i]);
            System.out.format("%15s %15s %15s", room_types[i], cost_per_day[i], total_bill[i]);
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {

        TajHotel ob = new TajHotel();

        ob.calculateBill();
        ob.display();
    }
}