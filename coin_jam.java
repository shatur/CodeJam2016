import java.io.*;
import java.util.*;

public class coin_jam {

	static FileReader fi;
	static BufferedReader br;
	static FileWriter fo;
	static Double val;
	static int val1, val2, val3;
	static char ch[], rvar[];
	static String str, str1, str2, vstr, str3;
	static Stack<Integer> st; 
	
	static boolean isPrime(int val){
		for(int i=2;i<val/2;i++){
			if ((val%i)==0)
				return false;
		}	
		return true;
	}
	
	static boolean convert(){
		vstr=Integer.toString(val3);
		
		if(!isPrime(Integer.valueOf(vstr, 2)))
			return false;
		if(!isPrime(Integer.valueOf(vstr, 3)))
			return false;
		if(!isPrime(Integer.valueOf(vstr, 4)))
			return false;
		if(!isPrime(Integer.valueOf(vstr, 5)))
			return false;
		if(!isPrime(Integer.valueOf(vstr, 6)))
			return false;
		if(!isPrime(Integer.valueOf(vstr, 7)))
			return false;
		if(!isPrime(Integer.valueOf(vstr, 8)))
			return false;
		if(!isPrime(Integer.valueOf(vstr, 9)))
			return false;
		if(!isPrime(Integer.valueOf(vstr, 10)))
			return false;
		return true;
		
	}
	
	static void find_divisor(){
		
	}
	
	static void generate_number() throws IOException{		
		int val1=Integer.parseInt(str1);
		int val2=Integer.parseInt(str2);
		for(int i=val1;i<val2;i++){
			val=Math.pow(2, val1);
			val3=val.intValue();			
			while(!convert()){
				val++;
				val3=val.intValue();
			}
			find_divisor();
			str
			fo.write(str);
		}		
}
	
	
	public static void main(String[] arg) throws IOException{
			
		fi = new FileReader("/home/shatur/workspace/Coin_Jam/bin/sample.in");
		br = new BufferedReader(fi);
		fo = new FileWriter("/home/shatur/workspace/Coin_Jam/bin/sample.out");
			
		
		int T=Integer.parseInt(br.readLine());
		str=br.readLine();
		int index=str.indexOf(' ');
		str1=str.substring(0,index);
		str2=str.substring(index+1, str.length());

		
		for(int i=1; i<=T; i++){
			fo.write("Case #"+i+"\n");
			generate_number();
		}
		fi.close();
		fo.close();
	}
}

