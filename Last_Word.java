import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Last_Word {
	
	static FileReader fi;
	static BufferedReader br;
	static FileWriter fo;
	static String str;
	static char[] cr,cr1;
	static char ch, temp, temp1;
	
	static void push_front(){
		for(int i=cr.length-1;i>0;i--){
			cr1[i]=cr1[i-1];			
		}
		cr1[0]=ch;
	}

	static void push_back(){
		int i;
		for(i=0;i<cr.length;i++){
			if(cr1[i]=='\0'){
				break;
			}
		}
		cr1[i]=ch;
	}
	
	static String generate_word() throws IOException{
		cr=br.readLine().toCharArray();
		
		ch=cr[0];
		cr1=new char[cr.length];
		cr1[0]=ch;
		for(int i=1;i<cr.length;i++){
			ch=cr[i];
			if(cr[i]<cr1[0]){
				push_back();
			}
			else{
				ch=cr[i];
				push_front();
			}
		}
		str=new String(cr1);
		return str;
	}
	
	public static void main(String[] arg) throws IOException{
		
		fi = new FileReader("/home/shatur/workspace/Last_Word_code_jam/bin/A-large.in");
		br = new BufferedReader(fi);
		fo = new FileWriter("/home/shatur/workspace/Last_Word_code_jam/bin/A-large.out");
			
		
		int T=Integer.parseInt(br.readLine());
		
		for(int i=1; i<=T; i++){
			fo.write("Case #"+i+": ");
			fo.write(generate_word()+"\n");
		}
		fi.close();
		fo.close();
	}

}
