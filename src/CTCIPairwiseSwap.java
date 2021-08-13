public class CTCIPairwiseSwap {
    public static void main(String[] args) {
        try{
            CTCIPairwiseSwap obj = new CTCIPairwiseSwap();
            obj.run(args);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void run(String[] args){
        //Prints the result of swapping the even and odd bits of a number
        System.out.println("109 With Flipped bits: " + swapBits(109));
    }
    public int swapBits(int a){
        String binaryA = Integer.toString(a,2);
        char[] charArray = binaryA.toCharArray();
        for(int x=binaryA.length()-2;x>=0;x-=2){
            char tempChar = charArray[x];
            charArray[x] = charArray[x+1];
            charArray[x+1] = tempChar;
        }
        String flippedString = String.valueOf(charArray);
        int flippedInt = Integer.parseInt(flippedString,2);
        return flippedInt;
    }
}