
class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // push opening brackets
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            }
            else {
                // edge case: no opening bracket
                if (st.isEmpty()) return false;

                char top = st.peek();

                // correct matching cases
                if ((ch == ')' && top == '(') ||
                    (ch == '}' && top == '{') ||
                    (ch == ']' && top == '[')) {
                    st.pop();
                }
                else {
                    // mismatch case
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}