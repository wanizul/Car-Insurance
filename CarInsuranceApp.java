public class CarInsuranceApp {

    public static void main(String args[]) {
        // declare array of objects
        CarInsurance customers[] = new CarInsurance[5];

        // test data - start
        customers[0] = new CarInsurance("WVT9737", 37800, true);
        customers[1] = new CarInsurance("JTL4125", 56200, false);
        customers[2] = new CarInsurance("WXK4651", 19500, true);
        customers[3] = new CarInsurance("MCQ5121", 43600, true);
        customers[4] = new CarInsurance("MBA1251", 25600, false);
        // test data - end

        // calculate and print sum of market values
        double sum = 0.0;
        for (int i=0; i<customers.length; i++) {
            sum = sum + customers[i].getMarketValue();
        }
        System.out.println("Sum of market values: RM" + sum);

        // print details of car from Malacca
        for (int i=0; i<customers.length; i++) {
            // get first character of the plate no
            char fc = customers[i].getPlateNo().charAt(0);

            // check if the first character is 'M'
            if (fc == 'M') {
                System.out.println(customers[i]);
            }
        }
    }
}
