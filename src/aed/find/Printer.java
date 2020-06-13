package aed.find;

import es.upm.aedlib.indexedlist.*;


public class Printer {
  static boolean testingMode = false;
  static private IndexedList<String> printedLines =
    new ArrayIndexedList<String>();

  public static void init(boolean testingModeArg) {
    testingMode = testingModeArg;
    printedLines = new ArrayIndexedList<String>();
  }

  public static void enableOutput() {
    testingMode = false;
  }

  public static void println(String line) {
    if (line.length()==0) {
      System.out.println
	("\n*** Error: Printer.println called with an empty line");
      throw new RuntimeException();
    }
    if (containsWhiteSpace(line)) {
      System.out.println
	("\n*** Error: Printer.println called with a line which contains whitespace characters (space, tab, etc): \""+line+"\"");
      throw new RuntimeException();
    }

    if (!testingMode) System.out.println(line);
    printedLines.add(printedLines.size(),line);
  }

  public static String[] getPrintedLines() {
    return printedLines.toArray(new String[printedLines.size()]);
  }

  private static boolean containsWhiteSpace(String str) {
    for (int i=0; i<str.length(); i++)
      if (Character.isWhitespace(str.charAt(i)))
	return true;
    return false;
  }
}
