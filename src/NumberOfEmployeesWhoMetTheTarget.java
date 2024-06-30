public class NumberOfEmployeesWhoMetTheTarget {
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {

        int c=0;

        for(int i=0;i<hours.length;i++)
        {
            if(hours[i]>=target){
                c++;
            }
        }

        return c;
    }
    public static void main(String[] args) {

        int[] hours = {0,1,2,3,4};
        int target = 2;

        int res =  numberOfEmployeesWhoMetTarget(hours, target);

        System.out.println("The number of Employees who met the target are: " + res);

    }
}
