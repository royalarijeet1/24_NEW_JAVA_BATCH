package String;

public class StringFunctions {
	
	static void joinFunction()
	{
		String js=String.join("-", "welcome","to","royal");
		System.out.println(js);
		String date=String.join("/", "25","06","2023");
		System.out.println(date);
//		String date=String.join(null, "25","06","2023");
//		System.out.println(date);
		String str=String.join("","Welcome to","country");
		System.out.println(str);
	}
	
	static void containsFunction()
	{
		String a="what do you know about us";
		System.out.println(a.contains("do you"));
		System.out.println(a.contains("now abou"));		
		System.out.println(a.contains("Now abou"));		
		System.out.println(a.contains("hi"));
		System.out.println(a.contains(" "));	
		System.out.println(a.contains(""));
	}
	
	
	static void charAtFunction()
	{
		String a="string";
		String b="yashvi";
		char ch=a.charAt(4); 
	
		char ch1=b.charAt(b.length()-1);   //find the last character
		System.out.println(ch);
		System.out.println(ch1);
	}
	static void lengthFunction()
	{
		String a="sauban";
		String b="yashvi";
		String c=null;
		String d="";
		
		System.out.println(a.length());//6
		System.out.println(b.length());//6
//		System.out.println(c.length());//exception
		System.out.println(d.length()); //0
	}
	
	static void formatFunction()
	{
		String a="Yashvi";
		String b="student";
		String sf1=String.format("name is %s", a);
		System.out.println(sf1);
		String sf2=String.format("I am a %s", b);
		System.out.println(sf2);
		String sf3=String.format("value is %d", 32);
		System.out.println(sf3);
		String sf4=String.format("value is %f", 32f);
		System.out.println(sf4);
		String sf5=String.format("value is %32.1f", 32.33333);
		System.out.println(sf5);
	}
	static void substrFunction()
	{
		String a="Yashvi";
		String b="student";
		
		System.out.println(a.substring(2,5)); //from 2 to 4
		System.out.println(a.substring(2));
	}
}
