import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        var pathArray = path.split("/");
        var stack = new Stack<>();
        var out = new StringBuffer();

        for(int i=0;i<pathArray.length;i++){
            var pathI = pathArray[i];
            if(!pathI.equals(""))
            {
                if(pathI.equals("..")){
                    if(!stack.isEmpty())
                        stack.pop();
                }else if(!path.equals("") && !pathI.equals(".")){
                    stack.push(pathI);
                }
            }
        }

        while(!stack.isEmpty()){
            out.insert(0, "/" + stack.pop());
        }

        if(out.length() == 0){
            return "/";
        }
        
        return out.toString();
    }
}

// https://leetcode.com/problems/simplify-path/?envType=study-plan-v2&envId=top-interview-150