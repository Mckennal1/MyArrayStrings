
/*
 * Author: Luisa McKenna
 * 
 * Given a sentence replace the spaces with "%20"
 */
public class MyURLify {
	
	public static char[] replaceSpace(String a, int len){
		//putting string into character array
		char[] chars = a.toCharArray();
		int spaceCount = 0, newLength, i;
		
		//looping through the array using the given true length
		for(i = 0; i<len; i++){
			if(chars[i]==' '){
				
				//counting the amount of spaces
					spaceCount++;
			}
		}
		
		newLength = len + spaceCount * 2;
		chars[newLength]='\0';
		
		//Looping through starting at the end
		for(i=len-1;i>=0;i--){
			if(chars[i]==' '){
				chars[newLength-1]='0';
				chars[newLength-2]='2';
				chars[newLength-3]='%';
				newLength=newLength-3;
			}else{
				chars[newLength-1]=chars[i];
				newLength=newLength-1;
			}
		}
		return chars;
		
//	My first attempt at this exercise!
//		char[] chars = a.toCharArray();
//		for(int i = 0; i<chars.length; i++){
//			if(chars[i]==' '&& chars[i+1]==){
//				for(int j = i+1; j<chars.length; j++){
//					chars[j+1]=chars[j];
//				}
//				a.replace(chars[i], '%');
//				a.replace(chars[i+1],'2');
//				a.replace(chars[i+2],'0');
//			}
//		}
//		String s = a;
//		char[] char1 = s.toCharArray();
//		//char[] chars = a.replace(' ','%').toCharArray();
//		return char1;
	}

	public static void main(String []args){
		System.out.println(replaceSpace("Mr John Smith      ", 13));
	}
}
