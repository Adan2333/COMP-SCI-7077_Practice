public class AlternateColors{

    public static String getColor(long r, long g, long b, long k){
        long total =r+g+b;

        while (true) {
            if (r>0) {
                r--;
                k--;
                if (k==0) {
                    return "RED";
                    
                }
                
            }

            if (g>0) {
                g--;
                k--;
                if (k==0) {
                    return "GREEN";

                    
                }
                
            }

            if (b>0) {
                b--;
                k--;
                if (k==0) {
                    return "BLUE";
                    
                }
                
            }

            if (total==0) {
                break;
                
            }
            
        }
        return "";
    }

    public static void main(String[] args) {
        long r =3;
        long g =4;
        long b =5;
        long k =4;

        String result =getColor(r, g, b, k);

        System.out.println(result);
    }
}