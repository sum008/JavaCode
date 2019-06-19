package def;

public class FindTheClue {

	public static void main(String[] args) {
		
		String a = "illusion never changed "
				+ "into something real wide "
				+ "awake and i can see the "
				+ "perfect sky ees reven torn youre a "
				+ "little late im "
				+ "already torn$";
		
		String[] b=a.split(" ");
		String temp1="";
		l1:
		for(int j=a.length()-2; j>=0;j--){
			if(!Character.toString(a.charAt(j)).equals(" ")){
				temp1=temp1+a.charAt(j);
			}else{
				for(int i=0; i<b.length; i++){
					if(b[i].length()==temp1.length()){
						if(temp1.length()>1){
						if(b[i].equals(temp1)){
							System.out.println(b[i]);
							break l1;
						}
					}
				}
			}
				temp1="";
		}
	}
}

}
