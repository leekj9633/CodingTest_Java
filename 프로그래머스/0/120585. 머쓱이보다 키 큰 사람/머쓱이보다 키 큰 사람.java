class Solution {
    public int solution(int[] array, int height) {
        int num = 0;
        
        for (int i = 0 ; i < array.length ; i = i + 1){
            if (array[i] > height){
                num = num + 1;
            }
        }
        return num;
    }
}