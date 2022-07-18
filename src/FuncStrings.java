
public class FuncStrings {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC DEFG";
		
		System.out.println("ORIGINAL: - "+ original +" -");
		System.out.println("toLowerCase: - "+ original.toLowerCase() +" -");
		System.out.println("toUpperCase: - "+ original.toUpperCase() +" -");
		System.out.println("trim: - "+ original.trim() +"-");
		System.out.println("substring: - "+ original.substring(2) +" -");
		System.out.println("substring sobrecarregado: - "+ original.substring(2, 9) +"-");
		System.out.println("replace char: - "+ original.replace('A', 'X') +" -");
		System.out.println("replace string: - "+ original.replace("ABC", "XY") +" -");
		System.out.println("Index of 'bc' : - "+ original.indexOf("BC") +" -");
		System.out.println("LastIndex of 'bc' : - "+ original.lastIndexOf("BC") +" -");
		
		
		String s = "POTATO APPLE LEMON";
		
		String [] vect = s.split(" ");
		String vect0 = vect[0]; 
		String vect1 = vect[1];
		String vect2 = vect[2];
		
		System.out.println(vect0);
		System.out.println(vect1);
		System.out.println(vect2);
	}

}
