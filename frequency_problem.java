package ayushi1;


// This was  one of my assignment in AU training: 
// I have to find the frequency of occurrence of each alphabet in String. 
// Output should be like: I/P:"ABBB" O/P:"A#B###"
import java.util.Scanner;

public class frequency_problem {
	/**public static void main(String args[])
	{
		System.out.println(freqcount("AAB"));
	}*/
	public String freqcount(String str)
	{
String res="";
int count[]=new int[26];

for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)>=65 && str.charAt(i)<=90)
count[str.charAt(i)-65]=count[str.charAt(i)-65]+1;
}
for(int i=0;i<26;i++)
{
	if(count[i]!=0)
	{
		//System.out.print((char)(i+65));
		res=res+(char)(i+65);
	for(int j=0;j<count[i];j++)
		res=res+"#";
		//System.out.print("#");
	//System.out.println();
	}
}
return res;	}
	
	}


