public class RomanToInteger {
    public int romanToInt(String s) {
        String[] roman = {"I","V", "X", "L", "C", "D", "M"};
        int[]  nums = {1,5,10,50,100,500,1000};
        String[] stringToNum = s.split("");
        int[] indexArray = new int[stringToNum.length];
        for(int i = 0 ; i <stringToNum.length; i++){
            for(int j = 0 ; j < roman.length; j++){
                if(stringToNum[i].equals(roman[j])){
                    indexArray[i] = j;
                }
            }
        }
        int right = indexArray.length-1;
        int output = 0;
        while(right>= 0){
            if(right> 0){
                if(indexArray[right]>indexArray[right-1]){
                    output += nums[indexArray[right]] -nums[indexArray[right -1]];
                    right -= 2;
                }else{
                    output += nums[indexArray[right]];
                    right --;
                }
            }else{
                output += nums[indexArray[right]];
                right --;
            }
        }

        return output;
    };
}
