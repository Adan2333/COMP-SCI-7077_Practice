public class Reppity {

    public static int longestRep(String input) {
        int stringMaxLength = 0;
        for (int i=0; i<input.length(); i++) {
            for (int j=i+1; j<input.length(); j++) {

                String cutString = input.substring(i, j+1);

                if (input.indexOf(cutString,j+1)!=-1) {
                    stringMaxLength = Math.max(stringMaxLength, cutString.length());
                }
            }
        }
        return stringMaxLength;
    }

    public static void main(String[] args) {
        String input = "againANDagainANDagainANDagainANDagainANDagain";
        int result = longestRep(input);
        System.out.println(result);
    }
}
