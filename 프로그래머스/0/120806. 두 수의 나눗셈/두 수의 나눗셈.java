class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = (int) (((float) num1) / ((float) num2) * 1000);
        return answer;
        
        // int answer = 0;
        // float pr = 0;
        // pr = (float) num1 / (float) num2 * 1000; 정수를 실수로 타입캐스팅
        // answer = (int) pr; 실수를 정수로 타입캐스팅
        // return answer;
        
    }
}