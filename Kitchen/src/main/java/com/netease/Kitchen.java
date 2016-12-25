package com.netease;

public class Kitchen {
    public static String makeNoodles(String vegetable){
                  if (vegetable==null){
			vegetable="Tomato";
	          }
                  
		StringBuffer s=new StringBuffer();
		s.append("Noodles with")
		.append(vegetable);
		return s.toString();
	}
 } 
