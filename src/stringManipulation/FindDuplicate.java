package stringManipulation;

public class FindDuplicate {

    public static void main(String[] args) {        
        String word = "appleroara";
        char[] wordarr = word.toCharArray();
        int length = word.length();
        
/*        String str2="12";    
        int num2 = Integer.parseInt(str2);
        
        int num3 = 56;
        String str3 = String.valueOf(num3);
 */   
        String str = "Automation";
        System.out.println(str);
        str = str.substring(3,6);
        System.out.println(str);
		/*
		 * char ch = str.charAt(1); str = str+ch; System.out.println(str);
		 * System.out.println(ch);
		 */     
        
 /*       for (int i = 0; i < length; i++) {    
            int count = 0;
            
            for (int j = i + 1; j < length; j++) { // Changed 'i' to 'i + 1'
                if (wordarr[i] == wordarr[j] && wordarr[i] != ' ') {
                    count++;
                    wordarr[j] = '0';
                }
            }   
            
            if (count > 0 && wordarr[i] != '0') { // Changed 'count > 1' to 'count > 0'
                System.out.println(wordarr[i] + " is printed " + (count+1) + " times");
            }
        }   */
    }
}
