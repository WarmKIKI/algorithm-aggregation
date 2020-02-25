package leetcode.top100;

// [1,2,3] 2
// [1,2] [2,1]
// [1,2,3] [1,3,2] [3,1,2] [2,1,3] [2,3,1] [3,2,1]
// [1,2,3,4]  4*(3*2) result = 6  9/6 = 1
// [1,2] [2,1]
// [1,2,3] [1,3,2] [3,1,2] [2,1,3] [2,3,1] [3,2,1]
// [1,2,3,4] [1,2,4,3] [1,4,2,3] [4,1,2,3] [1,3,2,4] [1,3,4,2] [1,4,3,2] [4,1,3,2]
// [3,1,2,4] [3,1,4,2] [3,4,1,2] [4,3,1,2] [2,1,3,4] [2,1,4,3] [2,4,1,3] [4,2,1,3]
// [2,3,1,4] [2,3,4,1] [2,4,3,1] [4,2,3,1] [3,2,1,4] [3,2,4,1] [3,4,2,1] [4,3,2,1]

import java.util.ArrayList;
import java.util.List;

// 根据数学规律
public class GetPermutation {
    public String getPermutation(int n, int k) {
        List<String> result = new ArrayList<>();
        List<Integer> s=new ArrayList<>();
        List<Integer> rs=new ArrayList<>();
        for(int i=1;i<=n;i++)
            s.add(i);
        pl(s,rs,result);
        for (String elem : result) {
            System.out.println(elem);
        }
        return result.get(k-1).replace("[","").replace("]","").replace(",","").replaceAll(" ","");
    }

    public static void pl(List<Integer> s,List<Integer> rs,List<String> result){
        if(s.size()==1)
        {
            rs.add(s.get(0));
            result.add(rs.toString());
            rs.remove(rs.size()-1);
        }else{
            for(int i=0;i<s.size();i++){
                rs.add(s.get(i));
                List<Integer> tmp=new ArrayList<Integer>();
                for(Integer a:s)
                    tmp.add(a);
                tmp.remove(i);
                pl(tmp,rs,result);
                rs.remove(rs.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        GetPermutation getPermutation = new GetPermutation();
        String ans = getPermutation.getPermutation(4,9);
        System.out.println(ans);
    }
}
