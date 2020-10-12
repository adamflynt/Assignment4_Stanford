import acm.program.*;

public class DeleteCharacters extends ConsoleProgram {
	
	public void run() {
		while (true) {
			String str = readLine("Enter a phrase: ");
			if (str.length() == 0) {
				println("You must enter a phrase. Try again.");
			} else {
				String getChar = readLine("Enter a character you want to remove: ");
				char ch = getChar.charAt(0);
				println(removeAllOccurences (str, ch));
				}
			}
		}
	
	private String removeAllOccurences(String str, char ch) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ch) {
				result = result + str.charAt(i);
			}
		}
		
		return result;
	
	}
}
