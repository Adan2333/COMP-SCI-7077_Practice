import java.util.Scanner;

public class Block1_Reppity {

    public static int longestRep (String inputString) {

        int stringMaxLength = 0;
        for(int i =0; i<inputString.length(); i++){
            for(int j = i+1; j< inputString.length();j++){

                String cutString = inputString.substring(i, j+1);

                if (inputString.indexOf(cutString, j+1)!= -1) {
                    stringMaxLength = Math.max(stringMaxLength, cutString.length());
                    
                }
            }

        }

        return stringMaxLength;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please input a string: ");
        String inputString = input.nextLine();
        //test length
        int maxLength = 50;

        while (true) {

            if (inputString.length() <= maxLength) {

                int  result = longestRep(inputString);
                System.out.println(result); 
                break;
            }else{
                System.out.println("Opps!Too long!please input again:");
                inputString = input.nextLine();
            
            }
        
        }

       
        input.close();

        
    }
}