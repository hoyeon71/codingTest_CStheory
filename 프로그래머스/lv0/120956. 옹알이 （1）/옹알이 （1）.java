class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        if(babbling.length <= 100){
            for(int i = 0; i < babbling.length;i++){
                if(babbling[i].length() <= 15){
                    String[] said = babbling[i].split("aya|ye|woo|ma");
                    if(said.length == 0){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}