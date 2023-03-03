class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        
        if(slice >= 2 && slice <= 10){
            answer = (int)(Math.ceil((double)n/slice));
        }
        
        return answer;
    }
}