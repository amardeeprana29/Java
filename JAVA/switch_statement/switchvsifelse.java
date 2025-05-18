public class switchvsifelse {
    public static void main(String[] args) {
        
        int mon = 4;

        // Switch case : Compare a single expression against a list of value.

        switch (mon) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }    
        // If else statement : check multiple condition

        if(mon == 1){
            System.out.println("January");
        } else if(mon == 2){
            System.out.println("February");
        } else if(mon == 3){
            System.out.println("March");
        } else {
            System.out.println("Invalid month");
        }
        
    }
}
