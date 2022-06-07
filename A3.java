/*class reverse {
    public static void main (String[] args) {
       
        String str= "cdac kharger", rev="";
        char ch;
       
      System.out.println("Original word: "+str);
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        rev= ch+rev;
      }
      System.out.println("Reversed word: "+ rev);
    }
}*/
/*
class palindrome {
    public static void main (String[] args) {
       
        String str1= "ama";
		String str2="";
        char ch;
       
      System.out.println("Original word: "+str1);
       
      for (int i=0; i<str1.length(); i++)
      {
        ch= str1.charAt(i); 
        str2= ch+str2;
      }
      System.out.println("Reversed word: "+ str2);
		if(str1.equals(str2)){
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
	}

}*/

class replace{
	public static void main(String[] args){
		String s = "abcd";
		String s2= "";
		System.out.println(s);
		for(int i=0; i<s.length();i=i+2){
			s2+=s.charAt (i+1);
			s2+=s.charAt (i);
		}	
		System.out.println(s2);
	}
}