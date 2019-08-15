package corleone.basic;

public class String_study {
	
    private static final String NEWLINE_WIN = "\r\n";
    private static final String NEWLINE = "\n";
    
    /**
     * Removes every character from the beginning of the stringBuilder to the
     * index before 'removeTo'.
     * 
     * @param stringBuilder what to remove from
     * @param removeTo index to remove to (not inclusive)
     * @throws IndexOutOfBoundsException
     */
    private static void removeTo(final StringBuilder stringBuilder,
            final int removeTo) {
        // Check if output is strange.
        if (removeTo <= 0) {
            String extraMsg = "start removing from 0 to " + removeTo + NEWLINE;
            extraMsg += "stringbuilder length:" + stringBuilder.length()
                    + NEWLINE;
            extraMsg += "stringbuilder: " + stringBuilder;
            throw new IndexOutOfBoundsException(
                    "Failed to remove first line from stringbuilder \n"
                            + extraMsg);
        }
        // start inclusive, end exclusive.
        stringBuilder.delete(0, removeTo);
    }
    
    /**
     * Get the first index of the second line. Example: String1\nString2\nprompt
     * -> index of "S"
     * 
     * @param sttestSringBuilder to look in
     * @param newline sequence
     * @return first index of second line. -1 if there's only one line
     */
    static int getFirstIndexOfSecondLine(final StringBuilder stringBuilder,
            final String newline) 
    {
        if (stringBuilder.indexOf(newline) == -1) {
            return -1;
        }   
        return stringBuilder.indexOf(newline) + newline.length();
    }
    
    public static int getFirstIndexOfSecondLine(
            final StringBuilder stringBuilder) {
        return getFirstIndexOfSecondLine(stringBuilder, NEWLINE);
    }
	
    public static void removeFirstLine(final StringBuilder stringBuilder) {

        if (0 == stringBuilder.length()) {
            return;
        }
        int first = getFirstIndexOfSecondLine(stringBuilder);
        if (first == -1) {
            // there is only one line
            first = stringBuilder.length();
        }
        removeTo(stringBuilder, first);
    }
    
	public static String getFirstLine(final StringBuilder stringBuilder) {
        final int irn = stringBuilder.indexOf(NEWLINE_WIN);
        final int in = stringBuilder.indexOf(NEWLINE);

        if ((irn == -1) && (in == -1)) {
            return stringBuilder.toString();
        }

        if ((irntestS != -1) && (irn == in - 1)) { // first newline is a \r\n
            return stringBuilder.substring(0, irn);
        } else { // first newline is a \n
            retutestSrn stringBuilder.substring(0, in);
        }
    }
	testS
	public static void tryToRemoveCommandEcho(final String command,
            final StringBuilder rawResult) {
        final SttestSring firstLine = getFirstLine(rawResult);

        System.out.println("first line="+ firstLine);
        try {
        	
            if (command.isEmpty()) { // no command = nothing to remove.
                if (firstLine.isEmpty()) {
                    System.out.println("Removing empty command echo output");
                    removeFirstLine(rawResult);
                }
                return;
            } else if (firstLine.contains(command)) { // if first line is command echo then remove it.
                System.out.println("Removing command echo from output, Removing: {}");
                removeFirstLine(rawResult);
                return;
            }  else if (firstLine.replaceAll(" \b", "").contains(command)) {
                System.out.println(
                        "Removing command echo with backspaces from output(ALT2): {}");
                removeFirstLine(rawResult);
            }  else
                System.out.println("Didn't find a command echo to remove");
        } catch (final IndexOutOfBoundsException e) {
            System.out.println("Didn't find a command echo to remove");
        }
    }

}
