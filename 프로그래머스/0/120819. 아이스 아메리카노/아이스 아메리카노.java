class Solution {
    public int[] solution(int money) {
        int[] answer = {0, 0};
        int cup = 0;
        
        cup = (int) (money / 5500);
        
        answer[0] = cup;
        answer[1] = money - cup * 5500;
        
        return answer;
    }
}