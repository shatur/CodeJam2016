import java.io.*;


public class revenge_of_pancakes {
	static FileReader fi;
	static BufferedReader br;
	static FileWriter fo;
	static String str;	
	static char ch[];
	static int countval=0;
	static int flag=0;
	
	static boolean allbad(){
		for(int i=0;i<str.length();i++){
			if(ch[i]=='+')
				return false;
		}
		return true;
	}
	
	static boolean check(){
		if(allbad()){
			countval++;
		}
		for(int i=0;i<str.length();i++){
			if(ch[i]=='-')
				return false;
		}
		return true;
	}
	
	static void swap(){
		for(int i=0;i<flag;i++){
			if(ch[i]=='-'){
				ch[i]='+';
			}
			else{
				ch[i]='-';
			}
		}
		countval++;
	}
	
	static void order(){
		for(int i=1;i<str.length();i++){
			if(ch[i-1]!=ch[i]){
				flag=i;
				swap();
				i=0;
			}
			
		}
	}
	
	static int count() throws IOException{
		str = br.readLine();
		ch=str.toCharArray();		
		order();
		if(check())
			return countval;
		
		
		return countval;
	}
	
	public static void main(String[] str) throws IOException{
		
		fi = new FileReader("/home/shatur/workspace/Code_Jam/bin/B-large.in");
		br = new BufferedReader(fi);
		fo = new FileWriter("/home/shatur/workspace/Code_Jam/bin/B-large.out");
		
	
		int T=Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++){
			fo.write("Case #"+i+": "+count()+"\n");	
			countval=0;
		}
		fi.close();
		fo.close();
	}
}
