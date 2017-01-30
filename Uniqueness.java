
/*
 * Author: Luisa McKenna
 * 
 * Check the characters in a word are unique.
 */
public class Uniqueness {

	public static boolean isUnique(String str){
		char [] chars = str.toCharArray();
		
		for(int i=0; i<chars.length;i++){
			for(int j = 1+i; j<chars.length;j++){
				if(chars[i]==chars[j]){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public static void main (String []args){
		System.out.println(isUnique("LuLis"));
	}
}// efficiency of O(n^2)
