public class Continue_statement {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){

            if (i == 5) {
                continue;
            }else if(i % 2 == 0){
                continue; // it is used to skip the current iteration of loop and continue with the next one. 
            }
            System.out.println(i);
        }
    }
}
