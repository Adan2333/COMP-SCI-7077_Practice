public class RugSizes {

    

    public static int rugCount(int area){
        
        if (area<1||area>100000){
            throw new IllegalAccessError();
        }
       
        int count =0;

        for(int w=2; w<=area;w+=2){
            int l =area/w;

            if (l*w==area) {
                count++;
                if (l%2==0&&w%2==0&&l!=w) {
                    count--;
                    
                }

            }

        }
        return count;

    }

  
    public static void main(String[] args) {
        int area =4;
        int result =rugCount(area);
        System.out.println(result);
    }
}