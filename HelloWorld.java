public class HelloWorld {
	public static void main (String[] Args) {
	
	String text="?немного? и #тоже есть#";
	String newtext=text.replace("?", "HELLO");
	String newtext1=newtext.replace("#"," ");
	
	System.out.println(newtext1);
		
		}

	
}


