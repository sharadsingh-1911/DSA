class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int [] answer = new int [n];
        Stack<Integer> st = new Stack<>();
        for(int i  = n-1 ; i>=0 ; i--){
            //2.popping all smaller and eqaul temperatures 
            while(!st.isEmpty() && temperatures[st.peek()] <= temperatures[i]){
                st.pop();
            }
            //3. storing distance 
            if(!st.isEmpty()){
                answer[i] = st.peek() -i ;
            }
            //1.pushing index
            st.push(i);
        }
        return answer;
    }
}