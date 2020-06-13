/*
 * Teachers: WARNING - this file is generated automatically, please do not
 * changes directly in this file, instead communicate needed changes
 * to the person responsable for the Tester.
 *
 * Students: you are welcome to make changes to this file if it helps
 * you to better debug your programs. Just REMEMBER that any changes made
 * by you will not change the Tester program used for the "entrega system".
 *
 */

package aed.find;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.tree.*;
import es.upm.aedlib.lifo.*;
import es.upm.aedlib.Version;



@SuppressWarnings("unused")
public class TesterInd6 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";

  static boolean[] results_sofar = {true};
  static boolean[] general_results = {true,true,true};
  static boolean testsRun = false;
  static boolean testResult = false;

  public static void main(String[] args) {

    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    checkAedlibVersion();
    
    // Permit executing individual tests: 
    // the first argument should be the test number
    if (args.length == 1) {
	try {
	    int testNumber = Integer.parseInt(args[0]);
	    String testName = "test_"+testNumber;
	    java.lang.reflect.Method testMethod = null;
	    try {
		testMethod = TesterInd6.class.getDeclaredMethod(testName);
		testMethod.setAccessible(true);
	    } catch (SecurityException exc) {
		System.out.println("\n*** Error: test "+testName+" is not accessible");
		System.exit(24);
	    } catch (NoSuchMethodException exc) {
		System.out.println("\n*** Error: test "+testName+" does not exist");
		System.exit(24);
	    }

	    Object result = null;

	    try {
		result = testMethod.invoke(null);
	    } catch (IllegalAccessException exc) {
		System.out.println("\n*** Error: not permitted to access "+testName);
		System.exit(24);
	    } catch (InvocationTargetException exc) {
		System.out.println("\n*** Error: cannot invoke "+testName);
		System.exit(24);
	    }
	    
	    if (result instanceof Boolean) {
		Boolean booleanResult = (Boolean) result;
		if (booleanResult)
		    System.out.println("\n*** Error: test "+testName+" succeeded.");
		else
		    System.out.println("\n*** Error: test "+testName+" failed.");

		System.exit(booleanResult ? 0 : 24);
	    }
	} catch (NumberFormatException exc) {
	    System.out.println("\n*** Error: argument should be an integer but is "+args[0]);
	    System.exit(24);
	}
    } else {
	if (getTestResult()) System.exit(0);
	else System.exit(24);
    }
  }
    
  private static void checkAedlibVersion() {
    // Check version of aedlib -- we want a version >= 1.1.0
    if (Version.major() < 1
	|| (Version.major() == 1 && Version.minor() < 1) 
	|| (Version.major() == 1 && Version.minor() == 1) && Version.patchlevel() < 0) {
      System.out.println
	("\n*** Warning: aedlib.jar is too old; the Tester may not work correctly.\nPlease install a newer version "+
	 "of the library.\nMinimum acceptable version: 1.1.0");
      System.out.println
	("Current aedlib version = "
	 +Version.major()+"."+Version.minor()+"."+Version.patchlevel());
    }
  }
  
  public static boolean getTestResult() {
      if (!testsRun) testResult = runTests();
      return testResult;
  }

  public static int getNota() {
      return getTestResult() ? 10 : 0;
  }

  public static boolean getTestResult(String testName) {
      getTestResult();
      
      int testIndex = test_type_to_index(testName);
      return results_sofar[testIndex];
  }

  public static boolean runTests() {
    boolean ok_sofar = true;
    testsRun = true;

    


    //////////////////////////////////////////////////////////////////////
    //
    // File generated at: 2017/11/17 -- 10:26:40
    // Seed: {1510,910797,613023}
    //
    //////////////////////////////////////////////////////////////////////



    try {
      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "find");

     if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "find");

     if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
         combine_results(test_3(), results_sofar, "test_3", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_4(), results_sofar, "test_4", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_15(), results_sofar, "test_15", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_16(), results_sofar, "test_16", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_18(), results_sofar, "test_18", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "find");

      if (results_ok_sofar(results_sofar,"find") && local_results_ok_sofar(results_sofar,"find"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "find");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          return false;
      }


    report_results("TesterInd6",results_sofar,general_results);


    if (results_ok(results_sofar,general_results))
      return true;
    else
      return false;
  }



  static boolean test_1 ()
  {
      
      testName = "test_1" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("Tester.java")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      ok_sofar = TesterInd6.check_find("HashTable.java",tree,new String[] {  }) ;
      return ok_sofar ;
  }


  static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("examen-AED.pdf")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      ok_sofar = TesterInd6.check_find("examen-AED.pdf",tree,new String[] { "/examen-AED.pdf" }) ;
      return ok_sofar ;
  }


  static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("pelis")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("src")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      ok_sofar = TesterInd6.check_find("281929.JPEG",tree,new String[] { "/pelis/src/281929.JPEG" }) ;
      return ok_sofar ;
  }


  static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("privado")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      ok_sofar = TesterInd6.check_find("Tester.java",tree,new String[] { "/privado/junk/Tester.java" }) ;
      return ok_sofar ;
  }


  static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("pelis")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      ok_sofar = TesterInd6.check_find("TicketsMundialRusia2018.txt",tree,new String[] {  }) ;
      return ok_sofar ;
  }


  static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("classes")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("java")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      ok_sofar = TesterInd6.check_find("PlanificacionFiesta.doc",tree,new String[] { "/classes/privado/PlanificacionFiesta.doc" }) ;
      return ok_sofar ;
  }


  static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("junk")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("classes")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      ok_sofar = TesterInd6.check_find("Tester.java",tree,new String[] {  }) ;
      return ok_sofar ;
  }


  static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("src")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("classes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      ok_sofar = TesterInd6.check_find("peli.mkv",tree,new String[] { "/src/classes/peli.mkv" }) ;
      return ok_sofar ;
  }


  static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("various")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("musica")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("pelis")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      ok_sofar = TesterInd6.check_find("HashTable.java",tree,new String[] { "/various/viajes/pelis/HashTable.java" }) ;
      return ok_sofar ;
  }


  static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("tmp")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("pelis")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("classes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("musica")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      ok_sofar = TesterInd6.check_find("viva_las_vegas.mp3",tree,new String[] { "/tmp/pelis/tmp/viva_las_vegas.mp3","/tmp/classes/various/viva_las_vegas.mp3" }) ;
      return ok_sofar ;
  }


  static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("viajes")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("pelis")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("src")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("java")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("musica")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      ok_sofar = TesterInd6.check_find("TicketsMundialRusia2018.txt",tree,new String[] { "/viajes/pelis/src/TicketsMundialRusia2018.txt","/viajes/musica/privado/TicketsMundialRusia2018.txt" }) ;
      return ok_sofar ;
  }


  static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("various")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("java")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      ok_sofar = TesterInd6.check_find("PlanificacionFiesta.doc",tree,new String[] { "/various/java/junk/PlanificacionFiesta.doc" }) ;
      return ok_sofar ;
  }


  static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("musica")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("pelis")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("java")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("pelis")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("classes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      ok_sofar = TesterInd6.check_find("peli.mkv",tree,new String[] { "/musica/tmp/pelis/peli.mkv","/musica/junk/junk/peli.mkv","/musica/junk/java/peli.mkv" }) ;
      return ok_sofar ;
  }


  static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("junk")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("classes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      ok_sofar = TesterInd6.check_find("Tester.java",tree,new String[] { "/junk/trash/privado/Tester.java","/junk/trash/classes/Tester.java" }) ;
      return ok_sofar ;
  }


  static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("pelis")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("java")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      ok_sofar = TesterInd6.check_find("Tester.java",tree,new String[] { "/pelis/trash/tmp/Tester.java" }) ;
      return ok_sofar ;
  }


  static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("java")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("musica")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("src")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      ok_sofar = TesterInd6.check_find("PlanificacionFiesta.doc",tree,new String[] { "/java/musica/src/trash/PlanificacionFiesta.doc" }) ;
      return ok_sofar ;
  }


  static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("src")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("java")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("src")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      ok_sofar = TesterInd6.check_find("examen-AED.pdf",tree,new String[] { "/src/various/java/src/examen-AED.pdf" }) ;
      return ok_sofar ;
  }


  static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("java")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("pelis")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("src")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      ok_sofar = TesterInd6.check_find("PlanificacionFiesta.doc",tree,new String[] { "/java/tmp/viajes/junk/PlanificacionFiesta.doc","/java/privado/various/pelis/PlanificacionFiesta.doc" }) ;
      return ok_sofar ;
  }


  static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("classes")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("classes")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("java")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      ok_sofar = TesterInd6.check_find("peli.mkv",tree,new String[] { "/classes/trash/classes/java/peli.mkv" }) ;
      return ok_sofar ;
  }


  static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("java")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("src")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("classes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      ok_sofar = TesterInd6.check_find("281929.JPEG",tree,new String[] { "/java/various/trash/src/281929.JPEG" }) ;
      return ok_sofar ;
  }


  static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("junk")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("pelis")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("java")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("pelis")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("java")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("classes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      ok_sofar = TesterInd6.check_find("peli.mkv",tree,new String[] { "/junk/junk/pelis/various/peli.mkv" }) ;
      return ok_sofar ;
  }


  static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("tmp")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("src")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("musica")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      ok_sofar = TesterInd6.check_find("281929.JPEG",tree,new String[] { "/tmp/viajes/musica/various/281929.JPEG","/tmp/viajes/musica/tmp/281929.JPEG" }) ;
      return ok_sofar ;
  }


  static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("java")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      ok_sofar = TesterInd6.check_find("281929.JPEG",tree,new String[] { "/java/viajes/various/tmp/281929.JPEG","/java/tmp/trash/privado/281929.JPEG" }) ;
      return ok_sofar ;
  }


  static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("privado")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("pelis")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("src")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("musica")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      ok_sofar = TesterInd6.check_find("TicketsMundialRusia2018.txt",tree,new String[] { "/privado/pelis/viajes/src/privado/TicketsMundialRusia2018.txt" }) ;
      return ok_sofar ;
  }


  static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("viajes")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("musica")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("java")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("java")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("classes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viva_las_vegas.mp3")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      ok_sofar = TesterInd6.check_find("Tester.java",tree,new String[] { "/viajes/tmp/privado/musica/junk/Tester.java","/viajes/tmp/privado/musica/java/Tester.java","/viajes/tmp/trash/java/classes/Tester.java" }) ;
      return ok_sofar ;
  }


  static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("junk")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      ok_sofar = TesterInd6.check_find("Tester.java",tree,new String[] {  }) ;
      return ok_sofar ;
  }


  static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("musica")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("src")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("peli.mkv")) ;
      ok_sofar = TesterInd6.check_find("PlanificacionFiesta.doc",tree,new String[] { "/musica/src/trash/junk/various/PlanificacionFiesta.doc" }) ;
      return ok_sofar ;
  }


  static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("various")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("pelis")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("classes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("src")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("examen-AED.pdf")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      ok_sofar = TesterInd6.check_find("HashTable.java",tree,new String[] { "/various/pelis/various/various/trash/HashTable.java" }) ;
      return ok_sofar ;
  }


  static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("trash")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("pelis")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("privado")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("java")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("junk")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("various")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("musica")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("musica")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("HashTable.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("TicketsMundialRusia2018.txt")) ;
      ok_sofar = TesterInd6.check_find("281929.JPEG",tree,new String[] { "/trash/various/junk/viajes/privado/281929.JPEG","/trash/various/junk/java/junk/281929.JPEG" }) ;
      return ok_sofar ;
  }


  static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      boolean ok_sofar ;
      LinkedGeneralTree<String> tree = new LinkedGeneralTree<String>() ;
      Position<String> cursor = tree.addRoot(new String("trash")) ;
      LIFO<Position<String>> stack = new LIFOArray<Position<String>>() ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("viajes")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("tmp")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("pelis")) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("PlanificacionFiesta.doc")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("trash")) ;
      stack.push(cursor) ;
      stack.push(cursor) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("Tester.java")) ;
      cursor = stack.pop() ;
      cursor = tree.addChildLast(cursor,new String("281929.JPEG")) ;
      ok_sofar = TesterInd6.check_find("Tester.java",tree,new String[] { "/trash/viajes/trash/tmp/trash/Tester.java" }) ;
      return ok_sofar ;
  }



  static int test_type_to_index(String test_type) {
      if (test_type.equals("find")) return 0;
      System.out.println("\n*** Error in test setup: unknown test type: "+test_type);
      throw new RuntimeException();
  }

  static String index_to_test_type(int index) {
      if (index == 0) return "find";
      else {
	  System.out.println("\n*** Error in test setup: unknown test index: "+index);
	  throw new RuntimeException();
      }
  }

  static boolean results_ok_sofar(boolean[] ok_sofar, String test_type) {
      return true;
  }

  static boolean local_results_ok_sofar(boolean[] results_sofar, String test_type) {
      int index = test_type_to_index(test_type);
      if (index >= results_sofar.length) {
	  System.out.println("\n*** Error in test setup: results_sofar cannot handle test_type "+test_type);
	  throw new RuntimeException();
      }
      return results_sofar[index];
  }

  static boolean[] combine_results(boolean result, boolean results_sofar[], String id, String test_type) {
      int index = test_type_to_index(test_type);
      results_sofar[index] = results_sofar[index] && result;
      return results_sofar;
  }

  static boolean results_ok(boolean results_sofar[], boolean[] general_results) {
    boolean all_true = true;

    for (int i=0; i<results_sofar.length; i++)
      all_true = all_true && results_sofar[i];

    return all_true;
  }

static void report_results(String tester, boolean results_sofar[], boolean general_results[]) {
      testName = "";
      callSeq = "";

      System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");

      for (int i=0; i<results_sofar.length; i++) {
	  String testName=index_to_test_type(i);

	  System.out.print("Testing results for "+testName+": ");
	  if (results_sofar[i])
	      System.out.println("succeeded");
	  else
	      System.out.println("failed");
      }

      System.out.println("\n------------------------------------------");
      if (results_ok(results_sofar,general_results))
	  System.out.println("\n"+tester+": Test finalizado correctamente.");
      else
	  System.out.println("\n"+tester+": errores detectados.\n");
  }


  static void printWarning(String TestName) {
      System.out.println("\n*** Warning in "+TestName+":");
  }

  static void printError(String TestName) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+TestName+":");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

  static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+testName+": ");

      if (!callSeq.equals("")) {
	  System.out.print(callSeqString(time));
	  System.out.println(callSeq);
      }

      switch (time) {
      case AFTER:
	  System.out.println("the call to "+msg+" raised the exception "+exc+
			     " although it should not have\n");
	  break;
      default:
	  System.out.println("the exception "+exc+" was raised although it "+
			     "should not have been\n");
	  break;
      }
      exc.printStackTrace();
    }

  static void printCallException(String msg, Throwable exc) {
    printCallException(ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(Throwable exc) {
    printCallException(ExecutionTime.LAST,"",exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
    if (testName != "") {
      System.out.println("\n*** Warning for "+testName+": ");
    } else
      System.out.println("\n*** Warning:");

    if (callSeq != "") {
      System.out.print(callSeqString(time));
      System.out.println(callSeq);
    }
    System.out.println(msg+"\n");
  }

  static void printError(ExecutionTime time, String msg) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+testName+": ");

      if (!callSeq.equals("")) {
        System.out.print(callSeqString(time));
        System.out.println(callSeq);
      }
      System.out.println(msg+"\n");
  }

  static String callSeqString(ExecutionTime time) {
      switch(time) {
      case AFTER:
	  return "after executing the call sequence ";
      case LAST:
	  return "while executing the last statement of call sequence ";
      case DURING:
	  return "while executing the call sequence ";
      case UNRELATED:
	  return "";
      }
      return "";
  }

  static boolean check_find
    (String fileName,
     Tree<String> tree,
     String[] expected) {

    String methodName = "find";
    String callString = methodName+"(\""+fileName+"\",tree)";
    callString += "\nwith the tree:\n";
    callString += tree.toString();
    callString += "\n";

    Printer.init(true);

    try {
      Find.find(fileName,tree);

      String[] printedLines = Printer.getPrintedLines();

      HashSet<String> ts1 = new HashSet<String>();
      HashSet<String> ts2 = new HashSet<String>();

      for (String path : printedLines)
	ts1.add(path);

      for (String path : expected)
	ts2.add(path);

      if (!ts1.equals(ts2)) {
	printError
	  (ExecutionTime.LAST,
	   "\nthe call "+callString+
	   "printed a set of paths:\n"+printArray(printedLines)+
	   "\n\nwhich are different from the expected set of paths:\n"+ts2);
	return false;
      }
      return true;
    } catch ( Throwable exc ) {
      printCallException(callString,exc);
      return false;
    }
  }

  static String printArray(Object[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(", ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }
}



