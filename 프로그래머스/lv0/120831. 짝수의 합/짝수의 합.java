class Solution {
    public int solution(int n) {
        int answer = 0;
        int amount = 0;
        
        if(amount < n){
            for(int i = 0; i <= n; i++){
                if(i % 2 == 0){
                    amount += i;
                    System.out.println(amount);
                }
            }            
        }
        answer = amount;
        return answer;
    }
}