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

package aed.cnossos;

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
import es.upm.aedlib.Pair;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.indexedlist.*;

import org.apache.bcel.classfile.*;
import java.lang.reflect.Field;

@SuppressWarnings("unused")
public class TesterIndExtra {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";

  static boolean[] results_sofar = {true};
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

    // Permit executing individual tests: 
    // the first argument should be the test number
    if (args.length == 1) {
	try {
	    int testNumber = Integer.parseInt(args[0]);
	    String testName = "test_"+testNumber;
	    java.lang.reflect.Method testMethod = null;
	    try {
		testMethod = TesterIndExtra.class.getDeclaredMethod(testName);
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
    boolean[] general_results = {true};
    boolean ok_sofar = true;
    testsRun = true;

    


    //////////////////////////////////////////////////////////////////////
    //
    // File generated at: 2017/12/15 -- 11:45:35
    // Seed: {1513,333671,265312}
    //
    //////////////////////////////////////////////////////////////////////



    try {
      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_3(), results_sofar, "test_3", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_4(), results_sofar, "test_4", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_15(), results_sofar, "test_15", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_16(), results_sofar, "test_16", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_18(), results_sofar, "test_18", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_31(), results_sofar, "test_31", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_32(), results_sofar, "test_32", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_33(), results_sofar, "test_33", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_34(), results_sofar, "test_34", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_35(), results_sofar, "test_35", "teseo");

      if (results_ok_sofar(results_sofar,"teseo") && local_results_ok_sofar(results_sofar,"teseo"))
        results_sofar =
          combine_results(test_36(), results_sofar, "test_36", "teseo");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          return false;
      }


    report_results("TesterIndExtra",results_sofar,general_results);


    if (results_ok(results_sofar,general_results))
      return true;
    else
      return false;
  }



  static boolean test_1 ()
  {
      
      testName = "test_1" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[1][1] ;
      maze[0][0] = new Punto(21,false,false,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,21) ;
      return ok_sofar ;
  }


  static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[1][6] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,false,false,true,true) ;
      maze[0][2] = new Punto(null,false,false,true,true) ;
      maze[0][3] = new Punto(null,false,false,true,true) ;
      maze[0][4] = new Punto(null,false,false,true,true) ;
      maze[0][5] = new Punto(21,false,false,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,21) ;
      return ok_sofar ;
  }


  static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[6][1] ;
      maze[0][0] = new Punto(null,true,false,false,false) ;
      maze[1][0] = new Punto(null,true,true,false,false) ;
      maze[2][0] = new Punto(null,true,true,false,false) ;
      maze[3][0] = new Punto(null,true,true,false,false) ;
      maze[4][0] = new Punto(null,true,true,false,false) ;
      maze[5][0] = new Punto(21,false,true,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,21) ;
      return ok_sofar ;
  }


  static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[2][2] ;
      maze[0][0] = new Punto(null,true,false,false,true) ;
      maze[0][1] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,false,true,false,false) ;
      maze[1][1] = new Punto(21,false,true,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,21) ;
      return ok_sofar ;
  }


  static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[3][3] ;
      maze[0][0] = new Punto(11,false,false,false,false) ;
      maze[0][1] = new Punto(null,false,false,false,false) ;
      maze[0][2] = new Punto(null,false,false,false,false) ;
      maze[1][0] = new Punto(null,false,false,false,false) ;
      maze[1][1] = new Punto(null,false,false,false,false) ;
      maze[1][2] = new Punto(null,false,false,false,false) ;
      maze[2][0] = new Punto(null,false,false,false,false) ;
      maze[2][1] = new Punto(null,false,false,false,false) ;
      maze[2][2] = new Punto(null,false,false,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,11) ;
      return ok_sofar ;
  }


  static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[3][3] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,false,false,true,true) ;
      maze[0][2] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,true,false,false,true) ;
      maze[1][1] = new Punto(null,false,false,true,true) ;
      maze[1][2] = new Punto(null,false,true,true,false) ;
      maze[2][0] = new Punto(null,false,true,false,true) ;
      maze[2][1] = new Punto(null,false,false,true,true) ;
      maze[2][2] = new Punto(21,false,false,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,21) ;
      return ok_sofar ;
  }


  static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[3][4] ;
      maze[0][0] = new Punto(null,true,false,false,false) ;
      maze[0][1] = new Punto(null,true,false,false,false) ;
      maze[0][2] = new Punto(null,true,false,false,false) ;
      maze[0][3] = new Punto(null,false,false,false,false) ;
      maze[1][0] = new Punto(null,true,true,false,false) ;
      maze[1][1] = new Punto(null,true,true,false,true) ;
      maze[1][2] = new Punto(null,true,true,true,true) ;
      maze[1][3] = new Punto(54,true,false,true,false) ;
      maze[2][0] = new Punto(null,false,true,false,true) ;
      maze[2][1] = new Punto(null,false,true,true,false) ;
      maze[2][2] = new Punto(null,false,true,false,true) ;
      maze[2][3] = new Punto(null,false,true,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,54) ;
      return ok_sofar ;
  }


  static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[3][4] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,true,false,true,true) ;
      maze[0][2] = new Punto(null,false,false,true,false) ;
      maze[0][3] = new Punto(null,true,false,false,false) ;
      maze[1][0] = new Punto(null,true,false,false,true) ;
      maze[1][1] = new Punto(null,true,true,true,true) ;
      maze[1][2] = new Punto(null,false,false,true,true) ;
      maze[1][3] = new Punto(null,false,true,true,false) ;
      maze[2][0] = new Punto(null,false,true,false,true) ;
      maze[2][1] = new Punto(null,false,true,true,true) ;
      maze[2][2] = new Punto(null,false,false,true,true) ;
      maze[2][3] = new Punto(66,false,false,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,66) ;
      return ok_sofar ;
  }


  static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[4][3] ;
      maze[0][0] = new Punto(null,true,false,false,true) ;
      maze[0][1] = new Punto(null,false,false,true,true) ;
      maze[0][2] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,false,true,false,false) ;
      maze[1][1] = new Punto(null,true,false,false,true) ;
      maze[1][2] = new Punto(null,false,true,true,false) ;
      maze[2][0] = new Punto(null,true,false,false,true) ;
      maze[2][1] = new Punto(null,false,true,true,false) ;
      maze[2][2] = new Punto(null,false,false,false,false) ;
      maze[3][0] = new Punto(85,false,true,false,true) ;
      maze[3][1] = new Punto(null,false,false,true,false) ;
      maze[3][2] = new Punto(null,false,false,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,85) ;
      return ok_sofar ;
  }


  static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[5][3] ;
      maze[0][0] = new Punto(null,true,false,false,false) ;
      maze[0][1] = new Punto(null,true,false,false,true) ;
      maze[0][2] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,false,true,false,true) ;
      maze[1][1] = new Punto(null,false,true,true,false) ;
      maze[1][2] = new Punto(null,true,true,false,false) ;
      maze[2][0] = new Punto(null,true,false,false,true) ;
      maze[2][1] = new Punto(null,true,false,true,false) ;
      maze[2][2] = new Punto(null,true,true,false,false) ;
      maze[3][0] = new Punto(null,true,true,false,false) ;
      maze[3][1] = new Punto(null,false,true,false,true) ;
      maze[3][2] = new Punto(null,false,true,true,false) ;
      maze[4][0] = new Punto(null,false,true,false,true) ;
      maze[4][1] = new Punto(null,false,false,true,true) ;
      maze[4][2] = new Punto(77,false,false,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,77) ;
      return ok_sofar ;
  }


  static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[5][3] ;
      maze[0][0] = new Punto(null,true,false,false,true) ;
      maze[0][1] = new Punto(null,true,false,true,true) ;
      maze[0][2] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,false,true,false,true) ;
      maze[1][1] = new Punto(null,true,true,true,true) ;
      maze[1][2] = new Punto(null,true,true,true,false) ;
      maze[2][0] = new Punto(null,false,false,false,true) ;
      maze[2][1] = new Punto(null,true,true,true,false) ;
      maze[2][2] = new Punto(null,false,true,false,false) ;
      maze[3][0] = new Punto(null,true,false,false,false) ;
      maze[3][1] = new Punto(null,false,true,false,true) ;
      maze[3][2] = new Punto(47,false,false,true,false) ;
      maze[4][0] = new Punto(null,false,true,false,false) ;
      maze[4][1] = new Punto(null,false,false,false,false) ;
      maze[4][2] = new Punto(null,false,false,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,47) ;
      return ok_sofar ;
  }


  static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[3][8] ;
      maze[0][0] = new Punto(null,true,false,false,false) ;
      maze[0][1] = new Punto(null,false,false,false,false) ;
      maze[0][2] = new Punto(null,false,false,false,true) ;
      maze[0][3] = new Punto(null,false,false,true,true) ;
      maze[0][4] = new Punto(null,false,false,true,false) ;
      maze[0][5] = new Punto(null,false,false,false,false) ;
      maze[0][6] = new Punto(null,false,false,false,false) ;
      maze[0][7] = new Punto(null,false,false,false,false) ;
      maze[1][0] = new Punto(null,false,true,false,true) ;
      maze[1][1] = new Punto(null,true,false,true,true) ;
      maze[1][2] = new Punto(34,false,false,true,false) ;
      maze[1][3] = new Punto(null,true,false,false,false) ;
      maze[1][4] = new Punto(null,false,false,false,false) ;
      maze[1][5] = new Punto(null,false,false,false,false) ;
      maze[1][6] = new Punto(null,false,false,false,false) ;
      maze[1][7] = new Punto(null,false,false,false,false) ;
      maze[2][0] = new Punto(null,false,false,false,true) ;
      maze[2][1] = new Punto(null,false,true,true,false) ;
      maze[2][2] = new Punto(null,false,false,false,false) ;
      maze[2][3] = new Punto(null,false,true,false,true) ;
      maze[2][4] = new Punto(null,false,false,true,false) ;
      maze[2][5] = new Punto(null,false,false,false,false) ;
      maze[2][6] = new Punto(null,false,false,false,false) ;
      maze[2][7] = new Punto(null,false,false,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,34) ;
      return ok_sofar ;
  }


  static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[7][4] ;
      maze[0][0] = new Punto(null,true,false,false,false) ;
      maze[0][1] = new Punto(null,true,false,false,true) ;
      maze[0][2] = new Punto(null,false,false,true,true) ;
      maze[0][3] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,true,true,false,false) ;
      maze[1][1] = new Punto(null,true,true,false,true) ;
      maze[1][2] = new Punto(null,true,false,true,true) ;
      maze[1][3] = new Punto(null,true,true,true,false) ;
      maze[2][0] = new Punto(null,true,true,false,true) ;
      maze[2][1] = new Punto(null,true,true,true,true) ;
      maze[2][2] = new Punto(null,true,true,true,true) ;
      maze[2][3] = new Punto(null,true,true,true,false) ;
      maze[3][0] = new Punto(null,true,true,false,true) ;
      maze[3][1] = new Punto(null,false,true,true,true) ;
      maze[3][2] = new Punto(null,true,true,true,true) ;
      maze[3][3] = new Punto(null,true,true,true,false) ;
      maze[4][0] = new Punto(null,true,true,false,true) ;
      maze[4][1] = new Punto(null,true,false,true,true) ;
      maze[4][2] = new Punto(null,true,true,true,true) ;
      maze[4][3] = new Punto(null,true,true,true,false) ;
      maze[5][0] = new Punto(null,true,true,false,true) ;
      maze[5][1] = new Punto(null,true,true,true,false) ;
      maze[5][2] = new Punto(null,true,true,false,true) ;
      maze[5][3] = new Punto(null,false,true,true,false) ;
      maze[6][0] = new Punto(48,false,true,false,false) ;
      maze[6][1] = new Punto(null,false,true,false,false) ;
      maze[6][2] = new Punto(null,false,true,false,true) ;
      maze[6][3] = new Punto(null,false,false,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,48) ;
      return ok_sofar ;
  }


  static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[4][7] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,false,false,true,true) ;
      maze[0][2] = new Punto(null,false,false,true,true) ;
      maze[0][3] = new Punto(null,false,false,true,true) ;
      maze[0][4] = new Punto(null,false,false,true,true) ;
      maze[0][5] = new Punto(null,true,false,true,true) ;
      maze[0][6] = new Punto(null,false,false,true,false) ;
      maze[1][0] = new Punto(11,true,false,false,false) ;
      maze[1][1] = new Punto(null,true,false,false,true) ;
      maze[1][2] = new Punto(null,true,false,true,false) ;
      maze[1][3] = new Punto(null,true,false,false,true) ;
      maze[1][4] = new Punto(null,false,false,true,true) ;
      maze[1][5] = new Punto(null,true,true,true,true) ;
      maze[1][6] = new Punto(null,false,false,true,false) ;
      maze[2][0] = new Punto(null,false,true,false,true) ;
      maze[2][1] = new Punto(null,false,true,true,false) ;
      maze[2][2] = new Punto(null,true,true,false,false) ;
      maze[2][3] = new Punto(null,false,true,false,true) ;
      maze[2][4] = new Punto(null,true,false,true,false) ;
      maze[2][5] = new Punto(null,false,true,false,true) ;
      maze[2][6] = new Punto(null,true,false,true,false) ;
      maze[3][0] = new Punto(null,false,false,false,true) ;
      maze[3][1] = new Punto(null,false,false,true,true) ;
      maze[3][2] = new Punto(null,false,true,true,true) ;
      maze[3][3] = new Punto(null,false,false,true,true) ;
      maze[3][4] = new Punto(null,false,true,true,false) ;
      maze[3][5] = new Punto(null,false,false,false,true) ;
      maze[3][6] = new Punto(null,false,true,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,11) ;
      return ok_sofar ;
  }


  static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[10][3] ;
      maze[0][0] = new Punto(null,true,false,false,true) ;
      maze[0][1] = new Punto(null,true,false,true,true) ;
      maze[0][2] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,false,true,false,true) ;
      maze[1][1] = new Punto(null,false,true,true,true) ;
      maze[1][2] = new Punto(null,true,true,true,false) ;
      maze[2][0] = new Punto(null,true,false,false,false) ;
      maze[2][1] = new Punto(null,true,false,false,true) ;
      maze[2][2] = new Punto(null,false,true,true,false) ;
      maze[3][0] = new Punto(null,true,true,false,true) ;
      maze[3][1] = new Punto(null,true,true,true,false) ;
      maze[3][2] = new Punto(null,true,false,false,false) ;
      maze[4][0] = new Punto(null,true,true,false,true) ;
      maze[4][1] = new Punto(null,true,true,true,true) ;
      maze[4][2] = new Punto(null,false,true,true,false) ;
      maze[5][0] = new Punto(null,true,true,false,true) ;
      maze[5][1] = new Punto(null,true,true,true,false) ;
      maze[5][2] = new Punto(48,true,false,false,false) ;
      maze[6][0] = new Punto(null,true,true,false,true) ;
      maze[6][1] = new Punto(null,false,true,true,true) ;
      maze[6][2] = new Punto(null,false,true,true,false) ;
      maze[7][0] = new Punto(null,true,true,false,true) ;
      maze[7][1] = new Punto(null,true,false,true,true) ;
      maze[7][2] = new Punto(null,true,false,true,false) ;
      maze[8][0] = new Punto(null,true,true,false,true) ;
      maze[8][1] = new Punto(null,true,true,true,true) ;
      maze[8][2] = new Punto(null,true,true,true,false) ;
      maze[9][0] = new Punto(null,false,true,false,true) ;
      maze[9][1] = new Punto(null,false,true,true,true) ;
      maze[9][2] = new Punto(null,false,true,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,48) ;
      return ok_sofar ;
  }


  static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[4][7] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,true,false,true,false) ;
      maze[0][2] = new Punto(null,true,false,false,true) ;
      maze[0][3] = new Punto(null,false,false,true,true) ;
      maze[0][4] = new Punto(null,false,false,true,false) ;
      maze[0][5] = new Punto(null,false,false,false,false) ;
      maze[0][6] = new Punto(null,true,false,false,false) ;
      maze[1][0] = new Punto(null,true,false,false,false) ;
      maze[1][1] = new Punto(null,true,true,false,true) ;
      maze[1][2] = new Punto(null,true,true,true,false) ;
      maze[1][3] = new Punto(null,false,false,false,false) ;
      maze[1][4] = new Punto(null,true,false,false,true) ;
      maze[1][5] = new Punto(null,true,false,true,false) ;
      maze[1][6] = new Punto(null,true,true,false,false) ;
      maze[2][0] = new Punto(null,true,true,false,false) ;
      maze[2][1] = new Punto(null,true,true,false,false) ;
      maze[2][2] = new Punto(null,false,true,false,true) ;
      maze[2][3] = new Punto(null,true,false,true,true) ;
      maze[2][4] = new Punto(null,true,true,true,false) ;
      maze[2][5] = new Punto(91,false,true,false,false) ;
      maze[2][6] = new Punto(null,false,true,false,false) ;
      maze[3][0] = new Punto(null,false,true,false,true) ;
      maze[3][1] = new Punto(null,false,true,true,false) ;
      maze[3][2] = new Punto(null,false,false,false,false) ;
      maze[3][3] = new Punto(null,false,true,false,false) ;
      maze[3][4] = new Punto(null,false,true,false,false) ;
      maze[3][5] = new Punto(null,false,false,false,true) ;
      maze[3][6] = new Punto(null,false,false,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,91) ;
      return ok_sofar ;
  }


  static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[5][6] ;
      maze[0][0] = new Punto(null,true,false,false,false) ;
      maze[0][1] = new Punto(null,false,false,false,true) ;
      maze[0][2] = new Punto(null,true,false,true,true) ;
      maze[0][3] = new Punto(31,true,false,true,false) ;
      maze[0][4] = new Punto(null,true,false,false,true) ;
      maze[0][5] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,true,true,false,false) ;
      maze[1][1] = new Punto(null,true,false,false,false) ;
      maze[1][2] = new Punto(null,false,true,false,true) ;
      maze[1][3] = new Punto(null,false,true,true,true) ;
      maze[1][4] = new Punto(null,false,true,true,false) ;
      maze[1][5] = new Punto(null,true,true,false,false) ;
      maze[2][0] = new Punto(null,false,true,false,true) ;
      maze[2][1] = new Punto(null,false,true,true,true) ;
      maze[2][2] = new Punto(null,true,false,true,true) ;
      maze[2][3] = new Punto(null,true,false,true,false) ;
      maze[2][4] = new Punto(null,false,false,false,false) ;
      maze[2][5] = new Punto(null,true,true,false,false) ;
      maze[3][0] = new Punto(null,false,false,false,false) ;
      maze[3][1] = new Punto(null,false,false,false,true) ;
      maze[3][2] = new Punto(null,true,true,true,true) ;
      maze[3][3] = new Punto(null,true,true,true,false) ;
      maze[3][4] = new Punto(null,true,false,false,false) ;
      maze[3][5] = new Punto(null,true,true,false,false) ;
      maze[4][0] = new Punto(null,false,false,false,true) ;
      maze[4][1] = new Punto(null,false,false,true,false) ;
      maze[4][2] = new Punto(null,false,true,false,true) ;
      maze[4][3] = new Punto(null,false,true,true,true) ;
      maze[4][4] = new Punto(null,false,true,true,true) ;
      maze[4][5] = new Punto(null,false,true,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,31) ;
      return ok_sofar ;
  }


  static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[6][5] ;
      maze[0][0] = new Punto(null,true,false,false,false) ;
      maze[0][1] = new Punto(null,true,false,false,true) ;
      maze[0][2] = new Punto(null,false,false,true,true) ;
      maze[0][3] = new Punto(null,false,false,true,true) ;
      maze[0][4] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,false,true,false,true) ;
      maze[1][1] = new Punto(null,false,true,true,true) ;
      maze[1][2] = new Punto(null,true,false,true,false) ;
      maze[1][3] = new Punto(null,true,false,false,true) ;
      maze[1][4] = new Punto(null,true,true,true,false) ;
      maze[2][0] = new Punto(null,true,false,false,false) ;
      maze[2][1] = new Punto(null,false,false,false,true) ;
      maze[2][2] = new Punto(null,false,true,true,false) ;
      maze[2][3] = new Punto(null,true,true,false,true) ;
      maze[2][4] = new Punto(null,true,true,true,false) ;
      maze[3][0] = new Punto(null,false,true,false,true) ;
      maze[3][1] = new Punto(null,true,false,true,true) ;
      maze[3][2] = new Punto(null,false,false,true,true) ;
      maze[3][3] = new Punto(null,false,true,true,true) ;
      maze[3][4] = new Punto(null,false,true,true,false) ;
      maze[4][0] = new Punto(null,false,false,false,false) ;
      maze[4][1] = new Punto(null,true,true,false,false) ;
      maze[4][2] = new Punto(null,true,false,false,false) ;
      maze[4][3] = new Punto(null,true,false,false,true) ;
      maze[4][4] = new Punto(null,true,false,true,false) ;
      maze[5][0] = new Punto(null,false,false,false,true) ;
      maze[5][1] = new Punto(null,false,true,true,true) ;
      maze[5][2] = new Punto(null,false,true,true,true) ;
      maze[5][3] = new Punto(null,false,true,true,false) ;
      maze[5][4] = new Punto(32,false,true,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,32) ;
      return ok_sofar ;
  }


  static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[4][8] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,true,false,true,true) ;
      maze[0][2] = new Punto(null,true,false,true,true) ;
      maze[0][3] = new Punto(null,true,false,true,true) ;
      maze[0][4] = new Punto(17,true,false,true,true) ;
      maze[0][5] = new Punto(null,true,false,true,true) ;
      maze[0][6] = new Punto(null,true,false,true,false) ;
      maze[0][7] = new Punto(null,true,false,false,false) ;
      maze[1][0] = new Punto(null,true,false,false,true) ;
      maze[1][1] = new Punto(null,true,true,true,false) ;
      maze[1][2] = new Punto(null,false,true,false,true) ;
      maze[1][3] = new Punto(null,true,true,true,true) ;
      maze[1][4] = new Punto(null,true,true,true,true) ;
      maze[1][5] = new Punto(null,true,true,true,false) ;
      maze[1][6] = new Punto(null,false,true,false,true) ;
      maze[1][7] = new Punto(null,false,true,true,false) ;
      maze[2][0] = new Punto(null,true,true,false,true) ;
      maze[2][1] = new Punto(null,true,true,true,false) ;
      maze[2][2] = new Punto(null,false,false,false,true) ;
      maze[2][3] = new Punto(null,false,true,true,true) ;
      maze[2][4] = new Punto(null,false,true,true,true) ;
      maze[2][5] = new Punto(null,true,true,true,true) ;
      maze[2][6] = new Punto(null,true,false,true,true) ;
      maze[2][7] = new Punto(null,true,false,true,false) ;
      maze[3][0] = new Punto(null,false,true,false,true) ;
      maze[3][1] = new Punto(null,false,true,true,true) ;
      maze[3][2] = new Punto(null,false,false,true,false) ;
      maze[3][3] = new Punto(null,false,false,false,false) ;
      maze[3][4] = new Punto(null,false,false,false,false) ;
      maze[3][5] = new Punto(null,false,true,false,true) ;
      maze[3][6] = new Punto(null,false,true,true,false) ;
      maze[3][7] = new Punto(null,false,true,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,17) ;
      return ok_sofar ;
  }


  static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[9][4] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,false,false,true,true) ;
      maze[0][2] = new Punto(null,true,false,true,false) ;
      maze[0][3] = new Punto(null,false,false,false,false) ;
      maze[1][0] = new Punto(null,true,false,false,false) ;
      maze[1][1] = new Punto(null,true,false,false,false) ;
      maze[1][2] = new Punto(null,true,true,false,true) ;
      maze[1][3] = new Punto(null,false,false,true,false) ;
      maze[2][0] = new Punto(null,false,true,false,true) ;
      maze[2][1] = new Punto(null,true,true,true,true) ;
      maze[2][2] = new Punto(null,false,true,true,true) ;
      maze[2][3] = new Punto(null,false,false,true,false) ;
      maze[3][0] = new Punto(null,false,false,false,false) ;
      maze[3][1] = new Punto(null,false,true,false,true) ;
      maze[3][2] = new Punto(null,false,false,true,true) ;
      maze[3][3] = new Punto(null,true,false,true,false) ;
      maze[4][0] = new Punto(null,true,false,false,false) ;
      maze[4][1] = new Punto(null,false,false,false,true) ;
      maze[4][2] = new Punto(58,true,false,true,true) ;
      maze[4][3] = new Punto(null,true,true,true,false) ;
      maze[5][0] = new Punto(null,true,true,false,false) ;
      maze[5][1] = new Punto(null,false,false,false,false) ;
      maze[5][2] = new Punto(null,true,true,false,true) ;
      maze[5][3] = new Punto(null,false,true,true,false) ;
      maze[6][0] = new Punto(null,false,true,false,true) ;
      maze[6][1] = new Punto(null,false,false,true,false) ;
      maze[6][2] = new Punto(null,true,true,false,true) ;
      maze[6][3] = new Punto(null,true,false,true,false) ;
      maze[7][0] = new Punto(null,true,false,false,true) ;
      maze[7][1] = new Punto(null,true,false,true,false) ;
      maze[7][2] = new Punto(null,true,true,false,true) ;
      maze[7][3] = new Punto(null,false,true,true,false) ;
      maze[8][0] = new Punto(null,false,true,false,true) ;
      maze[8][1] = new Punto(null,false,true,true,false) ;
      maze[8][2] = new Punto(null,false,true,false,false) ;
      maze[8][3] = new Punto(null,false,false,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,58) ;
      return ok_sofar ;
  }


  static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[7][5] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,false,false,true,true) ;
      maze[0][2] = new Punto(null,false,false,true,true) ;
      maze[0][3] = new Punto(null,true,false,true,false) ;
      maze[0][4] = new Punto(null,false,false,false,false) ;
      maze[1][0] = new Punto(null,true,false,false,true) ;
      maze[1][1] = new Punto(null,false,false,true,true) ;
      maze[1][2] = new Punto(null,false,false,true,true) ;
      maze[1][3] = new Punto(null,false,true,true,true) ;
      maze[1][4] = new Punto(null,true,false,true,false) ;
      maze[2][0] = new Punto(null,true,true,false,false) ;
      maze[2][1] = new Punto(null,false,false,false,false) ;
      maze[2][2] = new Punto(null,false,false,false,false) ;
      maze[2][3] = new Punto(null,false,false,false,true) ;
      maze[2][4] = new Punto(null,true,true,true,false) ;
      maze[3][0] = new Punto(null,true,true,false,false) ;
      maze[3][1] = new Punto(null,true,false,false,true) ;
      maze[3][2] = new Punto(null,true,false,true,false) ;
      maze[3][3] = new Punto(null,false,false,false,false) ;
      maze[3][4] = new Punto(null,true,true,false,false) ;
      maze[4][0] = new Punto(null,false,true,false,true) ;
      maze[4][1] = new Punto(null,false,true,true,false) ;
      maze[4][2] = new Punto(null,true,true,false,false) ;
      maze[4][3] = new Punto(null,true,false,false,false) ;
      maze[4][4] = new Punto(null,false,true,false,false) ;
      maze[5][0] = new Punto(null,true,false,false,true) ;
      maze[5][1] = new Punto(null,true,false,true,false) ;
      maze[5][2] = new Punto(58,true,true,false,false) ;
      maze[5][3] = new Punto(null,false,true,false,false) ;
      maze[5][4] = new Punto(null,true,false,false,false) ;
      maze[6][0] = new Punto(null,false,true,false,true) ;
      maze[6][1] = new Punto(null,false,true,true,false) ;
      maze[6][2] = new Punto(null,false,true,false,true) ;
      maze[6][3] = new Punto(null,false,false,true,true) ;
      maze[6][4] = new Punto(null,false,true,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,58) ;
      return ok_sofar ;
  }


  static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[6][6] ;
      maze[0][0] = new Punto(null,false,false,false,false) ;
      maze[0][1] = new Punto(null,false,false,false,false) ;
      maze[0][2] = new Punto(null,false,false,false,false) ;
      maze[0][3] = new Punto(null,false,false,false,false) ;
      maze[0][4] = new Punto(null,false,false,false,false) ;
      maze[0][5] = new Punto(null,false,false,false,false) ;
      maze[1][0] = new Punto(null,false,false,false,false) ;
      maze[1][1] = new Punto(null,false,false,false,false) ;
      maze[1][2] = new Punto(null,false,false,false,false) ;
      maze[1][3] = new Punto(null,false,false,false,false) ;
      maze[1][4] = new Punto(null,false,false,false,false) ;
      maze[1][5] = new Punto(null,false,false,false,false) ;
      maze[2][0] = new Punto(null,false,false,false,false) ;
      maze[2][1] = new Punto(null,false,false,false,false) ;
      maze[2][2] = new Punto(null,false,false,false,false) ;
      maze[2][3] = new Punto(null,false,false,false,false) ;
      maze[2][4] = new Punto(null,false,false,false,false) ;
      maze[2][5] = new Punto(null,false,false,false,false) ;
      maze[3][0] = new Punto(null,false,false,false,false) ;
      maze[3][1] = new Punto(null,false,false,false,false) ;
      maze[3][2] = new Punto(null,false,false,false,false) ;
      maze[3][3] = new Punto(null,false,false,false,false) ;
      maze[3][4] = new Punto(null,false,false,false,false) ;
      maze[3][5] = new Punto(null,false,false,false,false) ;
      maze[4][0] = new Punto(null,false,false,false,false) ;
      maze[4][1] = new Punto(null,false,false,false,false) ;
      maze[4][2] = new Punto(null,false,false,false,false) ;
      maze[4][3] = new Punto(null,false,false,false,false) ;
      maze[4][4] = new Punto(21,false,false,false,false) ;
      maze[4][5] = new Punto(null,false,false,false,false) ;
      maze[5][0] = new Punto(null,false,false,false,false) ;
      maze[5][1] = new Punto(null,false,false,false,false) ;
      maze[5][2] = new Punto(null,false,false,false,false) ;
      maze[5][3] = new Punto(null,false,false,false,false) ;
      maze[5][4] = new Punto(null,false,false,false,false) ;
      maze[5][5] = new Punto(null,false,false,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,null) ;
      return ok_sofar ;
  }


  static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[8][5] ;
      maze[0][0] = new Punto(null,true,false,false,false) ;
      maze[0][1] = new Punto(null,true,false,false,true) ;
      maze[0][2] = new Punto(null,false,false,true,true) ;
      maze[0][3] = new Punto(3,false,false,true,true) ;
      maze[0][4] = new Punto(null,false,false,true,false) ;
      maze[1][0] = new Punto(null,true,true,false,false) ;
      maze[1][1] = new Punto(null,false,true,false,true) ;
      maze[1][2] = new Punto(null,true,false,true,false) ;
      maze[1][3] = new Punto(null,true,false,false,true) ;
      maze[1][4] = new Punto(null,false,false,true,false) ;
      maze[2][0] = new Punto(null,true,true,false,false) ;
      maze[2][1] = new Punto(null,true,false,false,true) ;
      maze[2][2] = new Punto(null,false,true,true,true) ;
      maze[2][3] = new Punto(null,false,true,true,true) ;
      maze[2][4] = new Punto(null,false,false,true,false) ;
      maze[3][0] = new Punto(null,true,true,false,false) ;
      maze[3][1] = new Punto(null,true,true,false,true) ;
      maze[3][2] = new Punto(null,false,false,true,true) ;
      maze[3][3] = new Punto(null,false,false,true,true) ;
      maze[3][4] = new Punto(null,true,false,true,false) ;
      maze[4][0] = new Punto(null,true,true,false,false) ;
      maze[4][1] = new Punto(null,false,true,false,false) ;
      maze[4][2] = new Punto(null,true,false,false,true) ;
      maze[4][3] = new Punto(null,true,false,true,true) ;
      maze[4][4] = new Punto(null,true,true,true,false) ;
      maze[5][0] = new Punto(null,true,true,false,false) ;
      maze[5][1] = new Punto(null,false,false,false,false) ;
      maze[5][2] = new Punto(null,true,true,false,true) ;
      maze[5][3] = new Punto(null,true,true,true,false) ;
      maze[5][4] = new Punto(null,false,true,false,false) ;
      maze[6][0] = new Punto(null,true,true,false,true) ;
      maze[6][1] = new Punto(null,true,false,true,true) ;
      maze[6][2] = new Punto(null,false,true,true,true) ;
      maze[6][3] = new Punto(null,true,true,true,false) ;
      maze[6][4] = new Punto(null,true,false,false,false) ;
      maze[7][0] = new Punto(null,false,true,false,false) ;
      maze[7][1] = new Punto(null,false,true,false,false) ;
      maze[7][2] = new Punto(null,false,false,false,true) ;
      maze[7][3] = new Punto(null,false,true,true,true) ;
      maze[7][4] = new Punto(null,false,true,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,3) ;
      return ok_sofar ;
  }


  static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[7][6] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,false,false,true,true) ;
      maze[0][2] = new Punto(null,true,false,true,false) ;
      maze[0][3] = new Punto(null,true,false,false,false) ;
      maze[0][4] = new Punto(null,true,false,false,true) ;
      maze[0][5] = new Punto(null,false,false,true,false) ;
      maze[1][0] = new Punto(null,true,false,false,true) ;
      maze[1][1] = new Punto(null,false,false,true,true) ;
      maze[1][2] = new Punto(null,false,true,true,true) ;
      maze[1][3] = new Punto(null,true,true,true,true) ;
      maze[1][4] = new Punto(null,true,true,true,false) ;
      maze[1][5] = new Punto(95,true,false,false,false) ;
      maze[2][0] = new Punto(null,true,true,false,true) ;
      maze[2][1] = new Punto(null,true,false,true,true) ;
      maze[2][2] = new Punto(null,false,false,true,true) ;
      maze[2][3] = new Punto(null,false,true,true,true) ;
      maze[2][4] = new Punto(null,true,true,true,false) ;
      maze[2][5] = new Punto(null,true,true,false,false) ;
      maze[3][0] = new Punto(null,true,true,false,true) ;
      maze[3][1] = new Punto(null,true,true,true,true) ;
      maze[3][2] = new Punto(null,true,false,true,false) ;
      maze[3][3] = new Punto(null,true,false,false,true) ;
      maze[3][4] = new Punto(null,true,true,true,true) ;
      maze[3][5] = new Punto(null,true,true,true,false) ;
      maze[4][0] = new Punto(null,true,true,false,true) ;
      maze[4][1] = new Punto(null,true,true,true,true) ;
      maze[4][2] = new Punto(null,true,true,true,true) ;
      maze[4][3] = new Punto(null,true,true,true,true) ;
      maze[4][4] = new Punto(null,true,true,true,true) ;
      maze[4][5] = new Punto(null,false,true,true,false) ;
      maze[5][0] = new Punto(null,true,true,false,true) ;
      maze[5][1] = new Punto(null,false,true,true,true) ;
      maze[5][2] = new Punto(null,true,true,true,true) ;
      maze[5][3] = new Punto(null,true,true,true,true) ;
      maze[5][4] = new Punto(null,true,true,true,true) ;
      maze[5][5] = new Punto(null,false,false,true,false) ;
      maze[6][0] = new Punto(null,false,true,false,true) ;
      maze[6][1] = new Punto(null,false,false,true,true) ;
      maze[6][2] = new Punto(null,false,true,true,false) ;
      maze[6][3] = new Punto(null,false,true,false,true) ;
      maze[6][4] = new Punto(null,false,true,true,true) ;
      maze[6][5] = new Punto(null,false,false,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,95) ;
      return ok_sofar ;
  }


  static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[7][6] ;
      maze[0][0] = new Punto(null,true,false,false,true) ;
      maze[0][1] = new Punto(null,true,false,true,false) ;
      maze[0][2] = new Punto(null,false,false,false,false) ;
      maze[0][3] = new Punto(null,false,false,false,true) ;
      maze[0][4] = new Punto(null,false,false,true,false) ;
      maze[0][5] = new Punto(null,false,false,false,false) ;
      maze[1][0] = new Punto(null,false,true,false,true) ;
      maze[1][1] = new Punto(null,false,true,true,true) ;
      maze[1][2] = new Punto(null,false,false,true,true) ;
      maze[1][3] = new Punto(null,false,false,true,true) ;
      maze[1][4] = new Punto(null,false,false,true,true) ;
      maze[1][5] = new Punto(null,true,false,true,false) ;
      maze[2][0] = new Punto(null,false,false,false,true) ;
      maze[2][1] = new Punto(null,true,false,true,false) ;
      maze[2][2] = new Punto(null,true,false,false,true) ;
      maze[2][3] = new Punto(null,false,false,true,true) ;
      maze[2][4] = new Punto(null,false,false,true,true) ;
      maze[2][5] = new Punto(null,true,true,true,false) ;
      maze[3][0] = new Punto(90,true,false,false,false) ;
      maze[3][1] = new Punto(null,true,true,false,false) ;
      maze[3][2] = new Punto(null,true,true,false,true) ;
      maze[3][3] = new Punto(null,true,false,true,true) ;
      maze[3][4] = new Punto(null,true,false,true,false) ;
      maze[3][5] = new Punto(null,false,true,false,false) ;
      maze[4][0] = new Punto(null,true,true,false,true) ;
      maze[4][1] = new Punto(null,false,true,true,false) ;
      maze[4][2] = new Punto(null,false,true,false,true) ;
      maze[4][3] = new Punto(null,false,true,true,true) ;
      maze[4][4] = new Punto(null,true,true,true,true) ;
      maze[4][5] = new Punto(null,true,false,true,false) ;
      maze[5][0] = new Punto(null,false,true,false,true) ;
      maze[5][1] = new Punto(null,true,false,true,true) ;
      maze[5][2] = new Punto(null,true,false,true,true) ;
      maze[5][3] = new Punto(null,true,false,true,false) ;
      maze[5][4] = new Punto(null,true,true,false,false) ;
      maze[5][5] = new Punto(null,true,true,false,false) ;
      maze[6][0] = new Punto(null,false,false,false,true) ;
      maze[6][1] = new Punto(null,false,true,true,true) ;
      maze[6][2] = new Punto(null,false,true,true,true) ;
      maze[6][3] = new Punto(null,false,true,true,true) ;
      maze[6][4] = new Punto(null,false,true,true,true) ;
      maze[6][5] = new Punto(null,false,true,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,90) ;
      return ok_sofar ;
  }


  static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[7][6] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,true,false,true,false) ;
      maze[0][2] = new Punto(null,true,false,false,true) ;
      maze[0][3] = new Punto(null,true,false,true,true) ;
      maze[0][4] = new Punto(null,true,false,true,true) ;
      maze[0][5] = new Punto(null,false,false,true,false) ;
      maze[1][0] = new Punto(null,false,false,false,false) ;
      maze[1][1] = new Punto(null,false,true,false,true) ;
      maze[1][2] = new Punto(null,false,true,true,true) ;
      maze[1][3] = new Punto(null,false,true,true,false) ;
      maze[1][4] = new Punto(null,false,true,false,true) ;
      maze[1][5] = new Punto(null,true,false,true,false) ;
      maze[2][0] = new Punto(null,false,false,false,true) ;
      maze[2][1] = new Punto(null,false,false,true,true) ;
      maze[2][2] = new Punto(null,false,false,true,false) ;
      maze[2][3] = new Punto(null,true,false,false,true) ;
      maze[2][4] = new Punto(null,false,false,true,true) ;
      maze[2][5] = new Punto(null,false,true,true,false) ;
      maze[3][0] = new Punto(null,false,false,false,true) ;
      maze[3][1] = new Punto(null,true,false,true,true) ;
      maze[3][2] = new Punto(41,false,false,true,false) ;
      maze[3][3] = new Punto(null,true,true,false,false) ;
      maze[3][4] = new Punto(null,false,false,false,true) ;
      maze[3][5] = new Punto(null,false,false,true,false) ;
      maze[4][0] = new Punto(null,true,false,false,true) ;
      maze[4][1] = new Punto(null,false,true,true,true) ;
      maze[4][2] = new Punto(null,false,false,true,false) ;
      maze[4][3] = new Punto(null,false,true,false,true) ;
      maze[4][4] = new Punto(null,false,false,true,true) ;
      maze[4][5] = new Punto(null,true,false,true,false) ;
      maze[5][0] = new Punto(null,true,true,false,false) ;
      maze[5][1] = new Punto(null,true,false,false,false) ;
      maze[5][2] = new Punto(null,true,false,false,false) ;
      maze[5][3] = new Punto(null,false,false,false,true) ;
      maze[5][4] = new Punto(null,true,false,true,true) ;
      maze[5][5] = new Punto(null,false,true,true,false) ;
      maze[6][0] = new Punto(null,false,true,false,true) ;
      maze[6][1] = new Punto(null,false,true,true,true) ;
      maze[6][2] = new Punto(null,false,true,true,true) ;
      maze[6][3] = new Punto(null,false,false,true,true) ;
      maze[6][4] = new Punto(null,false,true,true,false) ;
      maze[6][5] = new Punto(null,false,false,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,41) ;
      return ok_sofar ;
  }


  static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[9][5] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,true,false,true,true) ;
      maze[0][2] = new Punto(null,false,false,true,false) ;
      maze[0][3] = new Punto(null,true,false,false,true) ;
      maze[0][4] = new Punto(null,false,false,true,false) ;
      maze[1][0] = new Punto(null,true,false,false,true) ;
      maze[1][1] = new Punto(null,true,true,true,true) ;
      maze[1][2] = new Punto(null,true,false,true,true) ;
      maze[1][3] = new Punto(null,true,true,true,false) ;
      maze[1][4] = new Punto(null,false,false,false,false) ;
      maze[2][0] = new Punto(null,false,true,false,false) ;
      maze[2][1] = new Punto(null,false,true,false,true) ;
      maze[2][2] = new Punto(null,false,true,true,false) ;
      maze[2][3] = new Punto(null,true,true,false,false) ;
      maze[2][4] = new Punto(null,true,false,false,false) ;
      maze[3][0] = new Punto(null,false,false,false,true) ;
      maze[3][1] = new Punto(null,true,false,true,true) ;
      maze[3][2] = new Punto(null,true,false,true,true) ;
      maze[3][3] = new Punto(20,true,true,true,true) ;
      maze[3][4] = new Punto(null,true,true,true,false) ;
      maze[4][0] = new Punto(null,true,false,false,false) ;
      maze[4][1] = new Punto(null,true,true,false,false) ;
      maze[4][2] = new Punto(null,true,true,false,true) ;
      maze[4][3] = new Punto(null,true,true,true,false) ;
      maze[4][4] = new Punto(null,false,true,false,false) ;
      maze[5][0] = new Punto(null,true,true,false,false) ;
      maze[5][1] = new Punto(null,false,true,false,true) ;
      maze[5][2] = new Punto(null,true,true,true,true) ;
      maze[5][3] = new Punto(null,false,true,true,true) ;
      maze[5][4] = new Punto(null,true,false,true,false) ;
      maze[6][0] = new Punto(null,false,true,false,true) ;
      maze[6][1] = new Punto(null,false,false,true,true) ;
      maze[6][2] = new Punto(null,false,true,true,true) ;
      maze[6][3] = new Punto(null,true,false,true,false) ;
      maze[6][4] = new Punto(null,false,true,false,false) ;
      maze[7][0] = new Punto(null,true,false,false,true) ;
      maze[7][1] = new Punto(null,true,false,true,true) ;
      maze[7][2] = new Punto(null,true,false,true,true) ;
      maze[7][3] = new Punto(null,true,true,true,true) ;
      maze[7][4] = new Punto(null,true,false,true,false) ;
      maze[8][0] = new Punto(null,false,true,false,true) ;
      maze[8][1] = new Punto(null,false,true,true,false) ;
      maze[8][2] = new Punto(null,false,true,false,true) ;
      maze[8][3] = new Punto(null,false,true,true,true) ;
      maze[8][4] = new Punto(null,false,true,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,20) ;
      return ok_sofar ;
  }


  static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[6][8] ;
      maze[0][0] = new Punto(null,true,false,false,true) ;
      maze[0][1] = new Punto(null,false,false,true,false) ;
      maze[0][2] = new Punto(null,false,false,false,true) ;
      maze[0][3] = new Punto(null,true,false,true,false) ;
      maze[0][4] = new Punto(null,false,false,false,false) ;
      maze[0][5] = new Punto(null,false,false,false,true) ;
      maze[0][6] = new Punto(null,true,false,true,false) ;
      maze[0][7] = new Punto(null,true,false,false,false) ;
      maze[1][0] = new Punto(null,true,true,false,true) ;
      maze[1][1] = new Punto(null,false,false,true,false) ;
      maze[1][2] = new Punto(null,true,false,false,false) ;
      maze[1][3] = new Punto(null,true,true,false,true) ;
      maze[1][4] = new Punto(null,true,false,true,true) ;
      maze[1][5] = new Punto(null,false,false,true,false) ;
      maze[1][6] = new Punto(null,true,true,false,true) ;
      maze[1][7] = new Punto(null,true,true,true,false) ;
      maze[2][0] = new Punto(null,true,true,false,false) ;
      maze[2][1] = new Punto(null,false,false,false,true) ;
      maze[2][2] = new Punto(null,false,true,true,false) ;
      maze[2][3] = new Punto(null,false,true,false,false) ;
      maze[2][4] = new Punto(null,true,true,false,false) ;
      maze[2][5] = new Punto(null,true,false,false,true) ;
      maze[2][6] = new Punto(null,true,true,true,false) ;
      maze[2][7] = new Punto(null,false,true,false,false) ;
      maze[3][0] = new Punto(null,true,true,false,false) ;
      maze[3][1] = new Punto(null,false,false,false,false) ;
      maze[3][2] = new Punto(null,false,false,false,false) ;
      maze[3][3] = new Punto(null,false,false,false,true) ;
      maze[3][4] = new Punto(null,false,true,true,true) ;
      maze[3][5] = new Punto(null,true,true,true,false) ;
      maze[3][6] = new Punto(null,false,true,false,false) ;
      maze[3][7] = new Punto(null,false,false,false,false) ;
      maze[4][0] = new Punto(null,true,true,false,false) ;
      maze[4][1] = new Punto(71,true,false,false,false) ;
      maze[4][2] = new Punto(null,true,false,false,true) ;
      maze[4][3] = new Punto(null,true,false,true,false) ;
      maze[4][4] = new Punto(null,false,false,false,true) ;
      maze[4][5] = new Punto(null,false,true,true,true) ;
      maze[4][6] = new Punto(null,false,false,true,false) ;
      maze[4][7] = new Punto(null,true,false,false,false) ;
      maze[5][0] = new Punto(null,false,true,false,true) ;
      maze[5][1] = new Punto(null,false,true,true,true) ;
      maze[5][2] = new Punto(null,false,true,true,false) ;
      maze[5][3] = new Punto(null,false,true,false,false) ;
      maze[5][4] = new Punto(null,false,false,false,true) ;
      maze[5][5] = new Punto(null,false,false,true,true) ;
      maze[5][6] = new Punto(null,false,false,true,false) ;
      maze[5][7] = new Punto(null,false,true,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,71) ;
      return ok_sofar ;
  }


  static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[5][10] ;
      maze[0][0] = new Punto(null,true,false,false,false) ;
      maze[0][1] = new Punto(null,true,false,false,true) ;
      maze[0][2] = new Punto(null,true,false,true,false) ;
      maze[0][3] = new Punto(null,true,false,false,true) ;
      maze[0][4] = new Punto(null,true,false,true,true) ;
      maze[0][5] = new Punto(null,true,false,true,false) ;
      maze[0][6] = new Punto(null,true,false,false,false) ;
      maze[0][7] = new Punto(null,true,false,false,true) ;
      maze[0][8] = new Punto(null,true,false,true,true) ;
      maze[0][9] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,true,true,false,false) ;
      maze[1][1] = new Punto(null,true,true,false,true) ;
      maze[1][2] = new Punto(null,false,true,true,false) ;
      maze[1][3] = new Punto(null,true,true,false,true) ;
      maze[1][4] = new Punto(null,true,true,true,false) ;
      maze[1][5] = new Punto(null,true,true,false,true) ;
      maze[1][6] = new Punto(null,true,true,true,false) ;
      maze[1][7] = new Punto(null,true,true,false,true) ;
      maze[1][8] = new Punto(null,true,true,true,false) ;
      maze[1][9] = new Punto(null,true,true,false,false) ;
      maze[2][0] = new Punto(null,true,true,false,false) ;
      maze[2][1] = new Punto(null,true,true,false,true) ;
      maze[2][2] = new Punto(null,true,false,true,false) ;
      maze[2][3] = new Punto(null,false,true,false,false) ;
      maze[2][4] = new Punto(null,true,true,false,false) ;
      maze[2][5] = new Punto(null,false,true,false,false) ;
      maze[2][6] = new Punto(null,true,true,false,false) ;
      maze[2][7] = new Punto(null,false,true,false,true) ;
      maze[2][8] = new Punto(null,true,true,true,false) ;
      maze[2][9] = new Punto(null,true,true,false,false) ;
      maze[3][0] = new Punto(null,true,true,false,false) ;
      maze[3][1] = new Punto(null,true,true,false,false) ;
      maze[3][2] = new Punto(null,true,true,false,true) ;
      maze[3][3] = new Punto(null,true,false,true,true) ;
      maze[3][4] = new Punto(null,true,true,true,false) ;
      maze[3][5] = new Punto(null,false,false,false,true) ;
      maze[3][6] = new Punto(null,true,true,true,true) ;
      maze[3][7] = new Punto(null,true,false,true,false) ;
      maze[3][8] = new Punto(null,true,true,false,false) ;
      maze[3][9] = new Punto(4,false,true,false,false) ;
      maze[4][0] = new Punto(null,false,true,false,true) ;
      maze[4][1] = new Punto(null,false,true,true,false) ;
      maze[4][2] = new Punto(null,false,true,false,true) ;
      maze[4][3] = new Punto(null,false,true,true,false) ;
      maze[4][4] = new Punto(null,false,true,false,false) ;
      maze[4][5] = new Punto(null,false,false,false,true) ;
      maze[4][6] = new Punto(null,false,true,true,false) ;
      maze[4][7] = new Punto(null,false,true,false,true) ;
      maze[4][8] = new Punto(null,false,true,true,true) ;
      maze[4][9] = new Punto(null,false,false,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,4) ;
      return ok_sofar ;
  }


  static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[5][10] ;
      maze[0][0] = new Punto(null,true,false,false,false) ;
      maze[0][1] = new Punto(null,true,false,false,true) ;
      maze[0][2] = new Punto(null,true,false,true,false) ;
      maze[0][3] = new Punto(null,true,false,false,true) ;
      maze[0][4] = new Punto(null,true,false,true,true) ;
      maze[0][5] = new Punto(null,true,false,true,true) ;
      maze[0][6] = new Punto(null,true,false,true,false) ;
      maze[0][7] = new Punto(null,true,false,false,true) ;
      maze[0][8] = new Punto(null,true,false,true,true) ;
      maze[0][9] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,false,true,false,true) ;
      maze[1][1] = new Punto(null,false,true,true,true) ;
      maze[1][2] = new Punto(null,false,true,true,true) ;
      maze[1][3] = new Punto(null,false,true,true,true) ;
      maze[1][4] = new Punto(null,true,true,true,true) ;
      maze[1][5] = new Punto(null,true,true,true,true) ;
      maze[1][6] = new Punto(null,true,true,true,true) ;
      maze[1][7] = new Punto(null,true,true,true,true) ;
      maze[1][8] = new Punto(null,false,true,true,true) ;
      maze[1][9] = new Punto(null,false,true,true,false) ;
      maze[2][0] = new Punto(null,true,false,false,false) ;
      maze[2][1] = new Punto(null,true,false,false,true) ;
      maze[2][2] = new Punto(null,true,false,true,false) ;
      maze[2][3] = new Punto(null,true,false,false,true) ;
      maze[2][4] = new Punto(48,true,true,true,false) ;
      maze[2][5] = new Punto(null,true,true,false,true) ;
      maze[2][6] = new Punto(null,true,true,true,false) ;
      maze[2][7] = new Punto(null,true,true,false,true) ;
      maze[2][8] = new Punto(null,false,false,true,false) ;
      maze[2][9] = new Punto(null,true,false,false,false) ;
      maze[3][0] = new Punto(null,true,true,false,true) ;
      maze[3][1] = new Punto(null,false,true,true,true) ;
      maze[3][2] = new Punto(null,false,true,true,true) ;
      maze[3][3] = new Punto(null,false,true,true,false) ;
      maze[3][4] = new Punto(null,false,true,false,true) ;
      maze[3][5] = new Punto(null,true,true,true,true) ;
      maze[3][6] = new Punto(null,true,true,true,true) ;
      maze[3][7] = new Punto(null,true,true,true,false) ;
      maze[3][8] = new Punto(null,true,false,false,false) ;
      maze[3][9] = new Punto(null,true,true,false,false) ;
      maze[4][0] = new Punto(null,false,true,false,true) ;
      maze[4][1] = new Punto(null,false,false,true,true) ;
      maze[4][2] = new Punto(null,false,false,true,true) ;
      maze[4][3] = new Punto(null,false,false,true,false) ;
      maze[4][4] = new Punto(null,false,false,false,true) ;
      maze[4][5] = new Punto(null,false,true,true,true) ;
      maze[4][6] = new Punto(null,false,true,true,true) ;
      maze[4][7] = new Punto(null,false,true,true,true) ;
      maze[4][8] = new Punto(null,false,true,true,true) ;
      maze[4][9] = new Punto(null,false,true,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,48) ;
      return ok_sofar ;
  }


  static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[8][7] ;
      maze[0][0] = new Punto(null,true,false,false,false) ;
      maze[0][1] = new Punto(null,false,false,false,true) ;
      maze[0][2] = new Punto(null,true,false,true,false) ;
      maze[0][3] = new Punto(null,true,false,false,false) ;
      maze[0][4] = new Punto(null,false,false,false,true) ;
      maze[0][5] = new Punto(38,true,false,true,false) ;
      maze[0][6] = new Punto(null,false,false,false,false) ;
      maze[1][0] = new Punto(null,true,true,false,true) ;
      maze[1][1] = new Punto(null,true,false,true,true) ;
      maze[1][2] = new Punto(null,false,true,true,true) ;
      maze[1][3] = new Punto(null,false,true,true,true) ;
      maze[1][4] = new Punto(null,true,false,true,true) ;
      maze[1][5] = new Punto(null,false,true,true,false) ;
      maze[1][6] = new Punto(null,false,false,false,false) ;
      maze[2][0] = new Punto(null,false,true,false,true) ;
      maze[2][1] = new Punto(null,false,true,true,true) ;
      maze[2][2] = new Punto(null,false,false,true,false) ;
      maze[2][3] = new Punto(null,false,false,false,true) ;
      maze[2][4] = new Punto(null,false,true,true,true) ;
      maze[2][5] = new Punto(null,true,false,true,false) ;
      maze[2][6] = new Punto(null,false,false,false,false) ;
      maze[3][0] = new Punto(null,true,false,false,false) ;
      maze[3][1] = new Punto(null,true,false,false,true) ;
      maze[3][2] = new Punto(null,false,false,true,true) ;
      maze[3][3] = new Punto(null,false,false,true,true) ;
      maze[3][4] = new Punto(null,false,false,true,false) ;
      maze[3][5] = new Punto(null,true,true,false,false) ;
      maze[3][6] = new Punto(null,true,false,false,false) ;
      maze[4][0] = new Punto(null,true,true,false,false) ;
      maze[4][1] = new Punto(null,false,true,false,false) ;
      maze[4][2] = new Punto(null,true,false,false,true) ;
      maze[4][3] = new Punto(null,false,false,true,false) ;
      maze[4][4] = new Punto(null,false,false,false,false) ;
      maze[4][5] = new Punto(null,false,true,false,true) ;
      maze[4][6] = new Punto(null,true,true,true,false) ;
      maze[5][0] = new Punto(null,false,true,false,true) ;
      maze[5][1] = new Punto(null,false,false,true,true) ;
      maze[5][2] = new Punto(null,true,true,true,true) ;
      maze[5][3] = new Punto(null,false,false,true,false) ;
      maze[5][4] = new Punto(null,false,false,false,true) ;
      maze[5][5] = new Punto(null,false,false,true,false) ;
      maze[5][6] = new Punto(null,true,true,false,false) ;
      maze[6][0] = new Punto(null,false,false,false,false) ;
      maze[6][1] = new Punto(null,true,false,false,false) ;
      maze[6][2] = new Punto(null,true,true,false,false) ;
      maze[6][3] = new Punto(null,true,false,false,true) ;
      maze[6][4] = new Punto(null,false,false,true,true) ;
      maze[6][5] = new Punto(null,false,false,true,false) ;
      maze[6][6] = new Punto(null,false,true,false,false) ;
      maze[7][0] = new Punto(null,false,false,false,false) ;
      maze[7][1] = new Punto(null,false,true,false,true) ;
      maze[7][2] = new Punto(null,false,true,true,false) ;
      maze[7][3] = new Punto(null,false,true,false,true) ;
      maze[7][4] = new Punto(null,false,false,true,false) ;
      maze[7][5] = new Punto(null,false,false,false,false) ;
      maze[7][6] = new Punto(null,false,false,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,38) ;
      return ok_sofar ;
  }


  static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[8][9] ;
      maze[0][0] = new Punto(null,true,false,false,false) ;
      maze[0][1] = new Punto(null,true,false,false,false) ;
      maze[0][2] = new Punto(null,true,false,false,true) ;
      maze[0][3] = new Punto(null,true,false,true,false) ;
      maze[0][4] = new Punto(null,false,false,false,true) ;
      maze[0][5] = new Punto(null,true,false,true,true) ;
      maze[0][6] = new Punto(null,true,false,true,true) ;
      maze[0][7] = new Punto(null,true,false,true,true) ;
      maze[0][8] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,true,true,false,true) ;
      maze[1][1] = new Punto(null,false,true,true,true) ;
      maze[1][2] = new Punto(null,false,true,true,false) ;
      maze[1][3] = new Punto(null,false,true,false,false) ;
      maze[1][4] = new Punto(null,true,false,false,true) ;
      maze[1][5] = new Punto(null,true,true,true,true) ;
      maze[1][6] = new Punto(null,false,true,true,true) ;
      maze[1][7] = new Punto(null,false,true,true,false) ;
      maze[1][8] = new Punto(null,true,true,false,false) ;
      maze[2][0] = new Punto(null,true,true,false,true) ;
      maze[2][1] = new Punto(null,false,false,true,false) ;
      maze[2][2] = new Punto(null,true,false,false,true) ;
      maze[2][3] = new Punto(null,false,false,true,true) ;
      maze[2][4] = new Punto(null,false,true,true,false) ;
      maze[2][5] = new Punto(null,false,true,false,false) ;
      maze[2][6] = new Punto(null,true,false,false,true) ;
      maze[2][7] = new Punto(null,false,false,true,true) ;
      maze[2][8] = new Punto(null,true,true,true,false) ;
      maze[3][0] = new Punto(null,true,true,false,false) ;
      maze[3][1] = new Punto(null,false,false,false,true) ;
      maze[3][2] = new Punto(null,false,true,true,true) ;
      maze[3][3] = new Punto(null,true,false,true,true) ;
      maze[3][4] = new Punto(null,false,false,true,false) ;
      maze[3][5] = new Punto(null,true,false,false,true) ;
      maze[3][6] = new Punto(null,false,true,true,true) ;
      maze[3][7] = new Punto(null,false,false,true,false) ;
      maze[3][8] = new Punto(null,false,true,false,false) ;
      maze[4][0] = new Punto(null,true,true,false,true) ;
      maze[4][1] = new Punto(null,true,false,true,true) ;
      maze[4][2] = new Punto(null,false,false,true,true) ;
      maze[4][3] = new Punto(null,false,true,true,true) ;
      maze[4][4] = new Punto(null,true,false,true,false) ;
      maze[4][5] = new Punto(null,false,true,false,true) ;
      maze[4][6] = new Punto(null,false,false,true,true) ;
      maze[4][7] = new Punto(null,false,false,true,true) ;
      maze[4][8] = new Punto(null,true,false,true,false) ;
      maze[5][0] = new Punto(null,false,true,false,false) ;
      maze[5][1] = new Punto(null,true,true,false,true) ;
      maze[5][2] = new Punto(null,false,false,true,false) ;
      maze[5][3] = new Punto(null,false,false,false,false) ;
      maze[5][4] = new Punto(null,false,true,false,true) ;
      maze[5][5] = new Punto(null,false,false,true,false) ;
      maze[5][6] = new Punto(null,true,false,false,true) ;
      maze[5][7] = new Punto(null,false,false,true,true) ;
      maze[5][8] = new Punto(null,true,true,true,false) ;
      maze[6][0] = new Punto(null,false,false,false,false) ;
      maze[6][1] = new Punto(null,false,true,false,false) ;
      maze[6][2] = new Punto(null,true,false,false,true) ;
      maze[6][3] = new Punto(null,true,false,true,true) ;
      maze[6][4] = new Punto(null,true,false,true,true) ;
      maze[6][5] = new Punto(null,true,false,true,true) ;
      maze[6][6] = new Punto(null,false,true,true,false) ;
      maze[6][7] = new Punto(null,true,false,false,true) ;
      maze[6][8] = new Punto(null,true,true,true,false) ;
      maze[7][0] = new Punto(null,false,false,false,false) ;
      maze[7][1] = new Punto(null,false,false,false,true) ;
      maze[7][2] = new Punto(null,false,true,true,true) ;
      maze[7][3] = new Punto(null,false,true,true,false) ;
      maze[7][4] = new Punto(16,false,true,false,true) ;
      maze[7][5] = new Punto(null,false,true,true,false) ;
      maze[7][6] = new Punto(null,false,false,false,true) ;
      maze[7][7] = new Punto(null,false,true,true,false) ;
      maze[7][8] = new Punto(null,false,true,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,16) ;
      return ok_sofar ;
  }


  static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[8][10] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,true,false,true,false) ;
      maze[0][2] = new Punto(null,true,false,false,true) ;
      maze[0][3] = new Punto(null,true,false,true,true) ;
      maze[0][4] = new Punto(null,true,false,true,true) ;
      maze[0][5] = new Punto(null,false,false,true,true) ;
      maze[0][6] = new Punto(null,false,false,true,true) ;
      maze[0][7] = new Punto(null,false,false,true,true) ;
      maze[0][8] = new Punto(null,true,false,true,true) ;
      maze[0][9] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,true,false,false,true) ;
      maze[1][1] = new Punto(null,true,true,true,false) ;
      maze[1][2] = new Punto(null,true,true,false,false) ;
      maze[1][3] = new Punto(null,true,true,false,true) ;
      maze[1][4] = new Punto(null,false,true,true,true) ;
      maze[1][5] = new Punto(null,true,false,true,false) ;
      maze[1][6] = new Punto(null,false,false,false,true) ;
      maze[1][7] = new Punto(null,true,false,true,true) ;
      maze[1][8] = new Punto(null,true,true,true,true) ;
      maze[1][9] = new Punto(null,true,true,true,false) ;
      maze[2][0] = new Punto(null,true,true,false,true) ;
      maze[2][1] = new Punto(null,true,true,true,true) ;
      maze[2][2] = new Punto(null,true,true,true,true) ;
      maze[2][3] = new Punto(null,false,true,true,false) ;
      maze[2][4] = new Punto(null,true,false,false,false) ;
      maze[2][5] = new Punto(null,false,true,false,false) ;
      maze[2][6] = new Punto(null,true,false,false,true) ;
      maze[2][7] = new Punto(null,true,true,true,false) ;
      maze[2][8] = new Punto(null,true,true,false,true) ;
      maze[2][9] = new Punto(null,true,true,true,false) ;
      maze[3][0] = new Punto(null,true,true,false,true) ;
      maze[3][1] = new Punto(null,false,true,true,true) ;
      maze[3][2] = new Punto(null,false,true,true,false) ;
      maze[3][3] = new Punto(null,false,false,false,false) ;
      maze[3][4] = new Punto(null,true,true,false,true) ;
      maze[3][5] = new Punto(null,true,false,true,true) ;
      maze[3][6] = new Punto(null,false,true,true,true) ;
      maze[3][7] = new Punto(null,true,true,true,false) ;
      maze[3][8] = new Punto(null,false,true,false,true) ;
      maze[3][9] = new Punto(null,false,true,true,false) ;
      maze[4][0] = new Punto(null,false,true,false,true) ;
      maze[4][1] = new Punto(null,false,false,true,false) ;
      maze[4][2] = new Punto(null,true,false,false,true) ;
      maze[4][3] = new Punto(null,true,false,true,true) ;
      maze[4][4] = new Punto(null,false,true,true,true) ;
      maze[4][5] = new Punto(null,false,true,true,false) ;
      maze[4][6] = new Punto(null,false,false,false,true) ;
      maze[4][7] = new Punto(null,true,true,true,false) ;
      maze[4][8] = new Punto(null,true,false,false,true) ;
      maze[4][9] = new Punto(null,true,false,true,false) ;
      maze[5][0] = new Punto(null,true,false,false,true) ;
      maze[5][1] = new Punto(null,true,false,true,false) ;
      maze[5][2] = new Punto(null,true,true,false,true) ;
      maze[5][3] = new Punto(null,true,true,true,false) ;
      maze[5][4] = new Punto(null,true,false,false,false) ;
      maze[5][5] = new Punto(null,true,false,false,false) ;
      maze[5][6] = new Punto(null,false,false,false,true) ;
      maze[5][7] = new Punto(null,false,true,true,false) ;
      maze[5][8] = new Punto(null,true,true,false,false) ;
      maze[5][9] = new Punto(null,true,true,false,false) ;
      maze[6][0] = new Punto(null,false,true,false,false) ;
      maze[6][1] = new Punto(null,true,true,false,true) ;
      maze[6][2] = new Punto(null,true,true,true,true) ;
      maze[6][3] = new Punto(null,false,true,true,false) ;
      maze[6][4] = new Punto(null,true,true,false,false) ;
      maze[6][5] = new Punto(null,false,true,false,false) ;
      maze[6][6] = new Punto(null,false,false,false,false) ;
      maze[6][7] = new Punto(null,true,false,false,true) ;
      maze[6][8] = new Punto(null,true,true,true,false) ;
      maze[6][9] = new Punto(23,false,true,false,false) ;
      maze[7][0] = new Punto(null,false,false,false,true) ;
      maze[7][1] = new Punto(null,false,true,true,true) ;
      maze[7][2] = new Punto(null,false,true,true,true) ;
      maze[7][3] = new Punto(null,false,false,true,true) ;
      maze[7][4] = new Punto(null,false,true,true,true) ;
      maze[7][5] = new Punto(null,false,false,true,true) ;
      maze[7][6] = new Punto(null,false,false,true,true) ;
      maze[7][7] = new Punto(null,false,true,true,false) ;
      maze[7][8] = new Punto(null,false,true,false,true) ;
      maze[7][9] = new Punto(null,false,false,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,23) ;
      return ok_sofar ;
  }


  static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[10][9] ;
      maze[0][0] = new Punto(null,true,false,false,true) ;
      maze[0][1] = new Punto(null,true,false,true,true) ;
      maze[0][2] = new Punto(null,false,false,true,true) ;
      maze[0][3] = new Punto(null,false,false,true,true) ;
      maze[0][4] = new Punto(null,true,false,true,false) ;
      maze[0][5] = new Punto(null,false,false,false,true) ;
      maze[0][6] = new Punto(null,true,false,true,true) ;
      maze[0][7] = new Punto(null,true,false,true,true) ;
      maze[0][8] = new Punto(null,true,false,true,false) ;
      maze[1][0] = new Punto(null,false,true,false,true) ;
      maze[1][1] = new Punto(null,true,true,true,true) ;
      maze[1][2] = new Punto(null,true,false,true,true) ;
      maze[1][3] = new Punto(null,true,false,true,false) ;
      maze[1][4] = new Punto(null,true,true,false,false) ;
      maze[1][5] = new Punto(null,true,false,false,false) ;
      maze[1][6] = new Punto(null,false,true,false,true) ;
      maze[1][7] = new Punto(null,true,true,true,true) ;
      maze[1][8] = new Punto(null,true,true,true,false) ;
      maze[2][0] = new Punto(1,true,false,false,false) ;
      maze[2][1] = new Punto(null,true,true,false,true) ;
      maze[2][2] = new Punto(null,true,true,true,true) ;
      maze[2][3] = new Punto(null,false,true,true,false) ;
      maze[2][4] = new Punto(null,true,true,false,false) ;
      maze[2][5] = new Punto(null,false,true,false,false) ;
      maze[2][6] = new Punto(null,false,false,false,false) ;
      maze[2][7] = new Punto(null,true,true,false,true) ;
      maze[2][8] = new Punto(null,true,true,true,false) ;
      maze[3][0] = new Punto(null,true,true,false,false) ;
      maze[3][1] = new Punto(null,false,true,false,true) ;
      maze[3][2] = new Punto(null,false,true,true,true) ;
      maze[3][3] = new Punto(null,true,false,true,true) ;
      maze[3][4] = new Punto(null,true,true,true,true) ;
      maze[3][5] = new Punto(null,true,false,true,true) ;
      maze[3][6] = new Punto(null,true,false,true,false) ;
      maze[3][7] = new Punto(null,true,true,false,true) ;
      maze[3][8] = new Punto(null,true,true,true,false) ;
      maze[4][0] = new Punto(null,true,true,false,true) ;
      maze[4][1] = new Punto(null,true,false,true,false) ;
      maze[4][2] = new Punto(null,false,false,false,true) ;
      maze[4][3] = new Punto(null,true,true,true,true) ;
      maze[4][4] = new Punto(null,false,true,true,false) ;
      maze[4][5] = new Punto(null,true,true,false,false) ;
      maze[4][6] = new Punto(null,true,true,false,false) ;
      maze[4][7] = new Punto(null,true,true,false,false) ;
      maze[4][8] = new Punto(null,true,true,false,false) ;
      maze[5][0] = new Punto(null,false,true,false,true) ;
      maze[5][1] = new Punto(null,true,true,true,true) ;
      maze[5][2] = new Punto(null,true,false,true,false) ;
      maze[5][3] = new Punto(null,true,true,false,false) ;
      maze[5][4] = new Punto(null,true,false,false,false) ;
      maze[5][5] = new Punto(null,true,true,false,false) ;
      maze[5][6] = new Punto(null,true,true,false,true) ;
      maze[5][7] = new Punto(null,true,true,true,true) ;
      maze[5][8] = new Punto(null,true,true,true,false) ;
      maze[6][0] = new Punto(null,true,false,false,true) ;
      maze[6][1] = new Punto(null,false,true,true,true) ;
      maze[6][2] = new Punto(null,true,true,true,false) ;
      maze[6][3] = new Punto(null,false,true,false,true) ;
      maze[6][4] = new Punto(null,false,true,true,false) ;
      maze[6][5] = new Punto(null,false,true,false,false) ;
      maze[6][6] = new Punto(null,false,true,false,false) ;
      maze[6][7] = new Punto(null,true,true,false,true) ;
      maze[6][8] = new Punto(null,false,true,true,false) ;
      maze[7][0] = new Punto(null,true,true,false,true) ;
      maze[7][1] = new Punto(null,true,false,true,false) ;
      maze[7][2] = new Punto(null,true,true,false,false) ;
      maze[7][3] = new Punto(null,true,false,false,true) ;
      maze[7][4] = new Punto(null,false,false,true,true) ;
      maze[7][5] = new Punto(null,false,false,true,true) ;
      maze[7][6] = new Punto(null,false,false,true,true) ;
      maze[7][7] = new Punto(null,true,true,true,false) ;
      maze[7][8] = new Punto(null,true,false,false,false) ;
      maze[8][0] = new Punto(null,true,true,false,false) ;
      maze[8][1] = new Punto(null,true,true,false,false) ;
      maze[8][2] = new Punto(null,false,true,false,false) ;
      maze[8][3] = new Punto(null,false,true,false,true) ;
      maze[8][4] = new Punto(null,true,false,true,false) ;
      maze[8][5] = new Punto(null,true,false,false,true) ;
      maze[8][6] = new Punto(null,true,false,true,false) ;
      maze[8][7] = new Punto(null,true,true,false,true) ;
      maze[8][8] = new Punto(null,true,true,true,false) ;
      maze[9][0] = new Punto(null,false,true,false,false) ;
      maze[9][1] = new Punto(null,false,true,false,true) ;
      maze[9][2] = new Punto(null,false,false,true,true) ;
      maze[9][3] = new Punto(null,false,false,true,true) ;
      maze[9][4] = new Punto(null,false,true,true,true) ;
      maze[9][5] = new Punto(null,false,true,true,true) ;
      maze[9][6] = new Punto(null,false,true,true,true) ;
      maze[9][7] = new Punto(null,false,true,true,true) ;
      maze[9][8] = new Punto(null,false,true,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,1) ;
      return ok_sofar ;
  }


  static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[10][9] ;
      maze[0][0] = new Punto(null,false,false,false,true) ;
      maze[0][1] = new Punto(null,true,false,true,true) ;
      maze[0][2] = new Punto(null,false,false,true,true) ;
      maze[0][3] = new Punto(null,true,false,true,true) ;
      maze[0][4] = new Punto(null,true,false,true,false) ;
      maze[0][5] = new Punto(null,true,false,false,true) ;
      maze[0][6] = new Punto(null,true,false,true,false) ;
      maze[0][7] = new Punto(null,false,false,false,false) ;
      maze[0][8] = new Punto(null,true,false,false,false) ;
      maze[1][0] = new Punto(null,true,false,false,true) ;
      maze[1][1] = new Punto(null,true,true,true,true) ;
      maze[1][2] = new Punto(null,false,false,true,false) ;
      maze[1][3] = new Punto(null,true,true,false,true) ;
      maze[1][4] = new Punto(null,false,true,true,false) ;
      maze[1][5] = new Punto(null,true,true,false,false) ;
      maze[1][6] = new Punto(null,true,true,false,true) ;
      maze[1][7] = new Punto(null,false,false,true,true) ;
      maze[1][8] = new Punto(null,true,true,true,false) ;
      maze[2][0] = new Punto(null,false,true,false,false) ;
      maze[2][1] = new Punto(null,true,true,false,true) ;
      maze[2][2] = new Punto(null,false,false,true,false) ;
      maze[2][3] = new Punto(null,false,true,false,false) ;
      maze[2][4] = new Punto(null,true,false,false,true) ;
      maze[2][5] = new Punto(null,true,true,true,false) ;
      maze[2][6] = new Punto(null,false,true,false,false) ;
      maze[2][7] = new Punto(null,true,false,false,true) ;
      maze[2][8] = new Punto(null,false,true,true,false) ;
      maze[3][0] = new Punto(null,false,false,false,true) ;
      maze[3][1] = new Punto(null,false,true,true,true) ;
      maze[3][2] = new Punto(null,true,false,true,false) ;
      maze[3][3] = new Punto(null,true,false,false,true) ;
      maze[3][4] = new Punto(42,true,true,true,false) ;
      maze[3][5] = new Punto(null,true,true,false,false) ;
      maze[3][6] = new Punto(null,true,false,false,false) ;
      maze[3][7] = new Punto(null,false,true,false,true) ;
      maze[3][8] = new Punto(null,true,false,true,false) ;
      maze[4][0] = new Punto(null,true,false,false,false) ;
      maze[4][1] = new Punto(null,true,false,false,true) ;
      maze[4][2] = new Punto(null,false,true,true,false) ;
      maze[4][3] = new Punto(null,true,true,false,true) ;
      maze[4][4] = new Punto(null,true,true,true,false) ;
      maze[4][5] = new Punto(null,true,true,false,false) ;
      maze[4][6] = new Punto(null,true,true,false,true) ;
      maze[4][7] = new Punto(null,false,false,true,true) ;
      maze[4][8] = new Punto(null,false,true,true,false) ;
      maze[5][0] = new Punto(null,true,true,false,true) ;
      maze[5][1] = new Punto(null,true,true,true,false) ;
      maze[5][2] = new Punto(null,true,false,false,false) ;
      maze[5][3] = new Punto(null,false,true,false,true) ;
      maze[5][4] = new Punto(null,false,true,true,true) ;
      maze[5][5] = new Punto(null,false,true,true,false) ;
      maze[5][6] = new Punto(null,true,true,false,true) ;
      maze[5][7] = new Punto(null,false,false,true,false) ;
      maze[5][8] = new Punto(null,false,false,false,false) ;
      maze[6][0] = new Punto(null,true,true,false,true) ;
      maze[6][1] = new Punto(null,false,true,true,true) ;
      maze[6][2] = new Punto(null,true,true,true,false) ;
      maze[6][3] = new Punto(null,true,false,false,false) ;
      maze[6][4] = new Punto(null,false,false,false,true) ;
      maze[6][5] = new Punto(null,true,false,true,false) ;
      maze[6][6] = new Punto(null,true,true,false,false) ;
      maze[6][7] = new Punto(null,true,false,false,true) ;
      maze[6][8] = new Punto(null,true,false,true,false) ;
      maze[7][0] = new Punto(null,true,true,false,true) ;
      maze[7][1] = new Punto(null,false,false,true,true) ;
      maze[7][2] = new Punto(null,false,true,true,true) ;
      maze[7][3] = new Punto(null,false,true,true,true) ;
      maze[7][4] = new Punto(null,false,false,true,false) ;
      maze[7][5] = new Punto(null,true,true,false,true) ;
      maze[7][6] = new Punto(null,false,true,true,false) ;
      maze[7][7] = new Punto(null,true,true,false,true) ;
      maze[7][8] = new Punto(null,true,true,true,false) ;
      maze[8][0] = new Punto(null,true,true,false,true) ;
      maze[8][1] = new Punto(null,false,false,true,true) ;
      maze[8][2] = new Punto(null,true,false,true,true) ;
      maze[8][3] = new Punto(null,true,false,true,true) ;
      maze[8][4] = new Punto(null,false,false,true,true) ;
      maze[8][5] = new Punto(null,true,true,true,false) ;
      maze[8][6] = new Punto(null,false,false,false,false) ;
      maze[8][7] = new Punto(null,true,true,false,true) ;
      maze[8][8] = new Punto(null,true,true,true,false) ;
      maze[9][0] = new Punto(null,false,true,false,false) ;
      maze[9][1] = new Punto(null,false,false,false,false) ;
      maze[9][2] = new Punto(null,false,true,false,false) ;
      maze[9][3] = new Punto(null,false,true,false,true) ;
      maze[9][4] = new Punto(null,false,false,true,true) ;
      maze[9][5] = new Punto(null,false,true,true,false) ;
      maze[9][6] = new Punto(null,false,false,false,false) ;
      maze[9][7] = new Punto(null,false,true,false,false) ;
      maze[9][8] = new Punto(null,false,true,false,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,42) ;
      return ok_sofar ;
  }


  static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      Punto[][] maze = new Punto[9][10] ;
      maze[0][0] = new Punto(null,true,false,false,true) ;
      maze[0][1] = new Punto(null,false,false,true,true) ;
      maze[0][2] = new Punto(null,false,false,true,true) ;
      maze[0][3] = new Punto(null,true,false,true,false) ;
      maze[0][4] = new Punto(null,false,false,false,false) ;
      maze[0][5] = new Punto(null,true,false,false,true) ;
      maze[0][6] = new Punto(null,false,false,true,false) ;
      maze[0][7] = new Punto(null,false,false,false,true) ;
      maze[0][8] = new Punto(null,false,false,true,true) ;
      maze[0][9] = new Punto(null,false,false,true,false) ;
      maze[1][0] = new Punto(null,true,true,false,false) ;
      maze[1][1] = new Punto(null,true,false,false,false) ;
      maze[1][2] = new Punto(null,false,false,false,false) ;
      maze[1][3] = new Punto(null,true,true,false,true) ;
      maze[1][4] = new Punto(null,false,false,true,true) ;
      maze[1][5] = new Punto(null,false,true,true,false) ;
      maze[1][6] = new Punto(null,false,false,false,true) ;
      maze[1][7] = new Punto(null,false,false,true,true) ;
      maze[1][8] = new Punto(null,false,false,true,false) ;
      maze[1][9] = new Punto(null,true,false,false,false) ;
      maze[2][0] = new Punto(null,false,true,false,true) ;
      maze[2][1] = new Punto(null,false,true,true,false) ;
      maze[2][2] = new Punto(null,true,false,false,true) ;
      maze[2][3] = new Punto(null,false,true,true,false) ;
      maze[2][4] = new Punto(null,true,false,false,true) ;
      maze[2][5] = new Punto(null,false,false,true,true) ;
      maze[2][6] = new Punto(null,true,false,true,true) ;
      maze[2][7] = new Punto(null,true,false,true,true) ;
      maze[2][8] = new Punto(null,false,false,true,false) ;
      maze[2][9] = new Punto(null,false,true,false,false) ;
      maze[3][0] = new Punto(null,true,false,false,false) ;
      maze[3][1] = new Punto(null,true,false,false,true) ;
      maze[3][2] = new Punto(null,true,true,true,false) ;
      maze[3][3] = new Punto(null,false,false,false,true) ;
      maze[3][4] = new Punto(null,true,true,true,true) ;
      maze[3][5] = new Punto(null,false,false,true,false) ;
      maze[3][6] = new Punto(null,false,true,false,false) ;
      maze[3][7] = new Punto(87,false,true,false,true) ;
      maze[3][8] = new Punto(null,false,false,true,true) ;
      maze[3][9] = new Punto(null,false,false,true,false) ;
      maze[4][0] = new Punto(null,true,true,false,true) ;
      maze[4][1] = new Punto(null,false,true,true,false) ;
      maze[4][2] = new Punto(null,true,true,false,true) ;
      maze[4][3] = new Punto(null,false,false,true,true) ;
      maze[4][4] = new Punto(null,true,true,true,false) ;
      maze[4][5] = new Punto(null,false,false,false,true) ;
      maze[4][6] = new Punto(null,false,false,true,true) ;
      maze[4][7] = new Punto(null,true,false,true,true) ;
      maze[4][8] = new Punto(null,true,false,true,true) ;
      maze[4][9] = new Punto(null,true,false,true,false) ;
      maze[5][0] = new Punto(null,true,true,false,false) ;
      maze[5][1] = new Punto(null,true,false,false,true) ;
      maze[5][2] = new Punto(null,true,true,true,true) ;
      maze[5][3] = new Punto(null,true,false,true,true) ;
      maze[5][4] = new Punto(null,true,true,true,true) ;
      maze[5][5] = new Punto(null,false,false,true,true) ;
      maze[5][6] = new Punto(null,false,false,true,true) ;
      maze[5][7] = new Punto(null,false,true,true,true) ;
      maze[5][8] = new Punto(null,false,true,true,false) ;
      maze[5][9] = new Punto(null,false,true,false,false) ;
      maze[6][0] = new Punto(null,true,true,false,true) ;
      maze[6][1] = new Punto(null,true,true,true,false) ;
      maze[6][2] = new Punto(null,false,true,false,false) ;
      maze[6][3] = new Punto(null,false,true,false,true) ;
      maze[6][4] = new Punto(null,true,true,true,true) ;
      maze[6][5] = new Punto(null,false,false,true,false) ;
      maze[6][6] = new Punto(null,false,false,false,true) ;
      maze[6][7] = new Punto(null,false,false,true,true) ;
      maze[6][8] = new Punto(null,false,false,true,false) ;
      maze[6][9] = new Punto(null,false,false,false,false) ;
      maze[7][0] = new Punto(null,false,true,false,false) ;
      maze[7][1] = new Punto(null,true,true,false,false) ;
      maze[7][2] = new Punto(null,false,false,false,false) ;
      maze[7][3] = new Punto(null,true,false,false,false) ;
      maze[7][4] = new Punto(null,false,true,false,true) ;
      maze[7][5] = new Punto(null,true,false,true,true) ;
      maze[7][6] = new Punto(null,false,false,true,false) ;
      maze[7][7] = new Punto(null,true,false,false,true) ;
      maze[7][8] = new Punto(null,false,false,true,false) ;
      maze[7][9] = new Punto(null,false,false,false,false) ;
      maze[8][0] = new Punto(null,false,false,false,true) ;
      maze[8][1] = new Punto(null,false,true,true,false) ;
      maze[8][2] = new Punto(null,false,false,false,true) ;
      maze[8][3] = new Punto(null,false,true,true,false) ;
      maze[8][4] = new Punto(null,false,false,false,false) ;
      maze[8][5] = new Punto(null,false,true,false,false) ;
      maze[8][6] = new Punto(null,false,false,false,false) ;
      maze[8][7] = new Punto(null,false,true,false,false) ;
      maze[8][8] = new Punto(null,false,false,false,true) ;
      maze[8][9] = new Punto(null,false,false,true,false) ;
      ok_sofar = TesterIndExtra.check_teseo(maze,87) ;
      return ok_sofar ;
  }



  static int test_type_to_index(String test_type) {
      if (test_type.equals("teseo")) return 0;
      System.out.println("\n*** Error in test setup: unknown test type: "+test_type);
      throw new RuntimeException();
  }

  static String index_to_test_type(int index) {
      if (index == 0) return "teseo";
      else {
	  System.out.println("\n*** Error in test setup: unknown test index: "+index);
	  throw new RuntimeException();
      }
  }

  static int general_test_to_index(String test_type) {
      throw new RuntimeException();
  }

  static String general_index_to_test_type(int index) {
    System.out.println("\n*** Error in test setup: unknown test index: "+index);
    throw new RuntimeException();
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

  static boolean[] combine_general_result(String name, boolean result, boolean general_results[]) {
      int index = general_test_to_index(name);
      general_results[index] = result;
      return general_results;
  }

  static boolean results_ok(boolean results_sofar[], boolean[] general_results) {
    boolean all_true = true;

    for (int i=0; i<results_sofar.length; i++)
      all_true = all_true && results_sofar[i];

    return all_true;
  }

static void report_results(String tester, boolean results_sofar[], boolean[] general_results) {
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

      for (int i=0; i<general_results.length; i++) {
	  if (!general_results[i])
	      printWarning
		  (ExecutionTime.UNRELATED,
		   "no recursive definition found for method "+general_index_to_test_type(i)+"; "+
		   "there is a risk that your solution will receive "+
		   "the grade 0.");
      }

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
      System.out.println("\n*** Warning for "+testName+": ");
      System.out.print(callSeqString(time));
      System.out.println(callSeq);
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

  static boolean check_teseo
    (Punto[][] puntos,
     Integer expected) {
    String methodName = "TeseoExplorador.explora";
    String callString = methodName+"()";

    Pair<Object,PositionList<PuntoCardinal>> pair = null;
    Punto[][] copy = Punto.copy(puntos);
    Laberinto cnossos = new Laberinto(copy,0,0);
    
    try {
      pair = TeseoExplorador.explora(cnossos);
    }  catch ( Throwable exc ) {
      printCallException(callString,exc);
      return false;
    }

    boolean ok_sofar = true;

    if (pair == null) ok_sofar = (expected == null);
    if (!ok_sofar) {
      printError
	(ExecutionTime.UNRELATED,
	 "the call "+callString+" returned null"+
	 " but should have returned a pair with a tesoro "+expected);
    }

    if (pair != null) {
      Object treasure = pair.getLeft();
      PositionList<PuntoCardinal> path = pair.getRight();
	
      if (treasure != null)
	ok_sofar = ok_sofar && treasure.equals(expected);
      else
	ok_sofar = false;

      if (!ok_sofar) {
	printError
	  (ExecutionTime.UNRELATED,
	   "the call "+callString+" returned the tesoror "+treasure+
	   " but should have returned "+expected);
      }
      
      if (ok_sofar && path == null) {
	printError
	  (ExecutionTime.UNRELATED,
	   "the call "+callString+" returned the path null");
	ok_sofar = false;
      }
      
      if (ok_sofar) {
	ok_sofar =
	  checkPCPath(path, treasure, puntos, callString);
      }
    }
    
    if (!ok_sofar) {
      System.out.println("\nLaberinto inicial: (x marca la posicion inicial, $ el tesoro) ");
      Punto.printPuntos(puntos,0,0);
      System.out.println("\nLaberinto despues de la exploracion ($ el tesoro, y con simbol de tiza \".\"):");
      Punto.printPuntos(copy);
      return false;
    }
    return ok_sofar;
  }


  static boolean checkPCPath(PositionList<PuntoCardinal> path, Object treasure, Punto[][] puntos,String callString) {
    Laberinto cnossos = new Laberinto(puntos,0,0);
    Position<PuntoCardinal> cursor = path.first();

    while (cursor != null) {
      PuntoCardinal pathPuntoCardinal = cursor.element();
      if (pathPuntoCardinal == null) {
	printError
	  (ExecutionTime.UNRELATED,
	   "the call "+callString+" returned a path "+path+
	   " that contains a null punto cardinal");
	return false;
      }

      boolean found = false;
      for (PuntoCardinal nextPuntoCardinal : cnossos.caminos()) {
	if (pathPuntoCardinal.equals(nextPuntoCardinal))
	  found = true;
      }
      if (!found) {
	printError
	  (ExecutionTime.UNRELATED,
	   "the call "+callString+" returned a path "+path+
	   " which cannot be taken");
	return false;
      }
      cnossos.ir(pathPuntoCardinal);
      cursor = path.next(cursor);
    }

    if (!cnossos.tieneTesoro()) {
	printError
	  (ExecutionTime.UNRELATED,
	   "the call "+callString+" returned a path "+path+
	   " which terminates in a lugar "+
	   " which does not contain any tesoro ");
	return false;
    }

    if (!cnossos.getTesoro().equals(treasure)) {
	printError
	  (ExecutionTime.UNRELATED,
	   "the call "+callString+" returned a path "+path+
	   " which terminates in a lugar "+
	   " which has a tesoro "+cnossos.getTesoro()+
	   " which is distinct from the tesoro "+
	   " returned by the call to "+callString);
	return false;
    }
    return true;
  }

}



