
public class Main {
	static Jsmaz smaz = new Jsmaz();
	public static void main(String[] args){
	String testString = "#test de compresion abracadabra";
	byte[] compressed = smaz.compress(testString);
	String uncompressedString = smaz.decompress(compressed);
	System.out.println(compressed);
	System.out.println(uncompressedString);
	}
}
