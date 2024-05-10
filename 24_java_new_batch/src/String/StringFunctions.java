package String;

public class StringFunctions {
	static void valueOfFunction()
	{
		long b=10l;
		String a= String.valueOf(b);
		System.out.println("type of a after using value of: "+ ((Object) a).getClass().getSimpleName());
		System.out.println(a+20);
		char c='c';
		System.out.println(c+b);
	}
	static void trimFunction()
	{
		String a="    jaVa is a pROGramminG LANGuagE     ";
		System.out.println(a.length());
		System.out.println(a.trim().length());
	}
	
	static void toUpperCaseFunction()
	{
		String a="jaVa is a pROGramminG LANGuagE";
		System.out.println(a.toUpperCase());
	}
	static void toLowerCaseFunction()
	{
		String a="jaVa is a pROGramminG LANGuagE";
		System.out.println(a.toLowerCase());
	}
	
	static void internFunction()
	{
		String a=new String("This is Java Programming");
		String b=new String("This is Java Programming");
		String c="This is Java Programming";
		String d=a.intern();
		String e=c.intern();
		System.out.println(a==b);
		System.out.println(c==d);
		System.out.println(c==e);
		System.out.println(d==a.intern());  //false
		
	}
	

	
	
	
	
	
	static void indexOfFunction()
	{
		String a="this is index of function";
		int index1=a.indexOf("is");
		System.out.println("index1: "+index1);
		int index2=a.indexOf("index");
		System.out.println("index2: "+index2);
		
		int index3=a.indexOf("is",3);
		System.out.println("index3: "+index3);
		
		String b="Index is a function of String";
		int index4=b.indexOf("i");
		int index5=b.indexOf("i",index4+1);
		int index6=b.indexOf("y");
		System.out.println("index4: "+index4);
		System.out.println("index5: "+index5);
		System.out.println("index6: "+index6);
		
	}
	
	
	static void splitFunction()
	{
		String a="Java is a programming language";
		String[] words=a.split(" ");
		System.out.println(words);
		
		System.out.println("returning words:");
		for(String w:words)
		{
			System.out.println(w);
		}
		
		System.out.println("returning words:");
		String[] words1=a.split(" ",0);
		for(String w:words1)
		{
			System.out.println(w);
		}
		
		System.out.println("returning words:");
		String[] words2=a.split(" ",1);
		for(String w:words2)
		{
			System.out.println(w);
		}
		System.out.println("returning words:");
		String[] words3=a.split(" ",2);
		for(String w:words3)
		{
			System.out.println(w);
		}
		System.out.println("returning words:");
		String[] words4=a.split(" ",3);
		for(String w:words4)
		{
			System.out.println(w);
		}
	}
	
	static void replaceFunction()
	{
		String a="Java is a programming language";
		System.out.println("Original String: "+a);
		String rs=a.replace('o', 'e');
		System.out.println(rs);
		
		String rs1=a.replace("a", "an");
		System.out.println(rs1);
		
		String rs2=a.replace("is a", "was an");
		System.out.println(rs2);
		
		String rs3=a.replace("z", "y");
		System.out.println(rs3);
	}
	static void concatFunction()
	{
		String a="Java";  
		String b="is a";
		String c="STRING";
		
		String d=a.concat(c);
		System.out.println(d);
		String e=a.concat(b).concat(c);
		String f=a+" "+b+" "+c;
		System.out.println(e);
		System.out.println(f);
		
		System.out.println(1+"a");
		System.out.println(1+(2+"a"));
		System.out.println("a"+1+2);
		System.out.println("a"+(1+2));

	}
	static void isEmptyFunction()
	{
		String a=" ";  
		String b="";
		String c="STRING";
		
		System.out.println(a.isEmpty());  //space is a character
		System.out.println(b.isEmpty());
		System.out.println(c.isEmpty());
	}
	static void equalsIgnoreCaseFunction()
	{
		String a="string";
		
		String c="STRING";
		
	
		System.out.println("a.equals(c)"+" "+a.equalsIgnoreCase(c));
		System.out.println("(a==c)"+"" +(a==c));		
	}
	
	static void equalsFunction()
	{
		String a="string";
		String b="string";
		String c="STRING";
		String d="equals";
		String e=new String("a");
		String f="a";
		Character g=new Character('a');  //char  //
		String h="false";
		Boolean i=false;

		
		System.out.println("a.equals(b)"+" "+a.equals(b));
		System.out.println("(a==b)"+"" +(a==b));
		System.out.println("a.equals(c)"+" "+a.equals(c));
		System.out.println("(a==c)"+"" +(a==c));
		System.out.println("a.equals(d)"+" "+a.equals(d));
		System.out.println("(a==d)"+"" +(a==d));
		System.out.println("a.equals(e)"+" : "+a.equals(e));
		System.out.println("(a==e)"+" : " +(a==e));
		System.out.println("f.equals(g)"+" : "+f.equals(g));
		System.out.println("e.equals(g)"+" : "+e.equals(g));
		System.out.println("e.equals(g.toString)"+" : "+e.equals(g.toString()));
		System.out.println("h.equals(i)"+" : "+h.equals(i));	
		System.out.println("h.equals(i.toString)"+" : "+h.equals(i.toString()));	
	}
	
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
		String sf4=String.format("value is %f", 22f);
		System.out.println(sf4);
		String sf5=String.format("value is %22.1f", 22.33333);
		System.out.println(sf5);
		String sf6=String.format("value is %22.0f", 22.33333);
		System.out.println(sf6);
	}
	static void substrFunction()
	{
		String a="Yashvi";
		String b="student";
		
		System.out.println(a.substring(2,5)); //from 2 to 4
		System.out.println(a.substring(2));
	}
}
