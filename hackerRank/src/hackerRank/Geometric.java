package hackerRank;


import java.util.*;

public class Geometric {

	public static void main(String[] args) {

		
	String name = "ccaccbbbaccccca";
        String[] str = {"a","b","c"};
        if(name.contains("a") && name.contains("b") && name.contains("c"))
        	System.out.println("haa");
        	
        Map<String, List<Integer>> wc = new HashMap<String, List<Integer>>();
        
        //single character index positions
        for(int i = 0;i<3;i++){
        	List<Integer> li = new ArrayList<Integer>();
        	int index = name.indexOf(str[i]);
        	while (index >= 0) {
        		li.add(index);
        		index = name.indexOf(str[i], index + 1);
        	}
        	wc.put(str[i],li);
        }
 
        int a = 0;
        int b = 0;
        int c = 0;
        String temp = "";
        
	//ascending order of index values
        if(wc.get(str[0]).size()<wc.get(str[1]).size() && wc.get(str[0]).size()<wc.get(str[2]).size()){
        	a = wc.get(str[0]).size();
        	temp+= "a";
        	if(wc.get(str[1]).size()<wc.get(str[2]).size()){
        		b = wc.get(str[1]).size();
        		temp+="b";
        		c = wc.get(str[2]).size();
        		temp+= "c";
        	}
        	else{
        		b = wc.get(str[2]).size();
        		temp += "c";
        		c = wc.get(str[1]).size();
        		temp += "b";
        	}
        }
        else if(wc.get(str[1]).size()<wc.get(str[0]).size() && wc.get(str[1]).size()<wc.get(str[2]).size()){
        	a = wc.get(str[1]).size();
        	temp += "b";
        	if(wc.get(str[0]).size()<wc.get(str[2]).size()){
        		b = wc.get(str[0]).size();
        		temp += "a";
        		c = wc.get(str[2]).size();
        		temp += "c";
        	}
        	else{
        		b = wc.get(str[2]).size();
        		temp += "c";
        		c = wc.get(str[0]).size();
        		temp += "a";
        	}
        }
        else if(wc.get(str[2]).size()<wc.get(str[0]).size() && wc.get(str[2]).size()<wc.get(str[1]).size()){
        	a = wc.get(str[2]).size();
        	temp += "c";
        	if(wc.get(str[0]).size()<wc.get(str[1]).size()){
        		b = wc.get(str[0]).size();
        		temp += "a";
        		c = wc.get(str[1]).size();
        		temp += "b";
        	}
        	else{
        		b = wc.get(str[1]).size();
        		temp += "b";
        		c = wc.get(str[0]).size();
        		temp += "a";
        	}
        }
        else if(wc.get(str[0]).size() == wc.get(str[1]).size()){
        	temp += "abc";
        	a = wc.get(str[0]).size();
        	b = a;
        	c = wc.get(str[2]).size();
        }
        else if(wc.get(str[0]).size() == wc.get(str[2]).size()){
        	temp +="acb";
        	a = wc.get(str[0]).size();
        	c = a;
        	b = wc.get(str[1]).size();
        }
        else{
        	temp += "bca";
        	b = wc.get(str[1]).size();
        	c = b;
        	a = wc.get(str[0]).size();
        }
        
        int count = 0;
        int x = 0;
        int y = 0; 
        int z = 0;
       
	 //check the geometric tricks......
        for(int n = 0;n<a;n++){
        	int i = wc.get(""+temp.charAt(0)).get(n)+1;
        
        	for(int m = 0;m<b;m++){
        		int j = wc.get(""+temp.charAt(1)).get(m)+1;
        		
        		for(int l = 0;l<c;l++){
        			int k = wc.get(""+temp.charAt(2)).get(l)+1;
        			
        			if(n == 0 || m == 0 || l == 0){
        				
        				if( ((j*j) == (i*k))){	
        				
        					count++;
        					x = wc.get(""+temp.charAt(0)).get(n);
        					y = wc.get(""+temp.charAt(1)).get(m);
        					z = wc.get(""+temp.charAt(2)).get(l);
        				}
        			}
        			else{
        				if((j*j) == (i*k) && (x != n && y != m && z != l)){
        					count++;
        					x = wc.get(""+temp.charAt(0)).get(n);
        					y = wc.get(""+temp.charAt(1)).get(m);
        					z = wc.get(""+temp.charAt(2)).get(l);
        				}
        			}
        		}
        	}
        }
        
        //print the count of geometric values.....
        System.out.println("Number of values "+count);
        
	}

}
