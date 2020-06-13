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

package aed.cache;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.lang.reflect.*;

import java.util.Iterator;
import java.util.Comparator;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collections;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.Version;
import es.upm.aedlib.Entry;
import es.upm.aedlib.EntryImpl;
import es.upm.aedlib.map.Map;

@SuppressWarnings("unused")
public class TesterLab7 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";

  static boolean[] results_sofar = {true};
  static boolean general_results = true;
  static boolean testsRun = false;
  static boolean testResult = false;

  static Field mapField;
  static Storage<Integer,String> storage = null;
  static Cache<Integer,String> cache = null;
  static PositionList<Integer> lru = null;
  static Map<Integer,CacheCell<Integer,String>> map = null;
  
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
		testMethod = TesterLab7.class.getDeclaredMethod(testName);
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
	|| (Version.major() == 1 && Version.minor() < 2) 
	|| (Version.major() == 1 && Version.minor() == 2) && Version.patchlevel() < 0) {
      System.out.println
	("\n*** Warning: aedlib.jar is too old; the Tester may not work correctly.\nPlease install a newer version "+
	 "of the library.\nMinimum acceptable version: 1.2.0");
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
    // File generated at: 2017/12/14 -- 23:17:44
    // Seed: {1513,289862,873569}
    //
    //////////////////////////////////////////////////////////////////////



    try {
      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_3(), results_sofar, "test_3", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_4(), results_sofar, "test_4", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_15(), results_sofar, "test_15", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_16(), results_sofar, "test_16", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_18(), results_sofar, "test_18", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_31(), results_sofar, "test_31", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_32(), results_sofar, "test_32", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_33(), results_sofar, "test_33", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_34(), results_sofar, "test_34", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_35(), results_sofar, "test_35", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_36(), results_sofar, "test_36", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_37(), results_sofar, "test_37", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_38(), results_sofar, "test_38", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_39(), results_sofar, "test_39", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_40(), results_sofar, "test_40", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_41(), results_sofar, "test_41", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_42(), results_sofar, "test_42", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_43(), results_sofar, "test_43", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_44(), results_sofar, "test_44", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_45(), results_sofar, "test_45", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_46(), results_sofar, "test_46", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_47(), results_sofar, "test_47", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_48(), results_sofar, "test_48", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_49(), results_sofar, "test_49", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_50(), results_sofar, "test_50", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_51(), results_sofar, "test_51", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_52(), results_sofar, "test_52", "cache");

      if (results_ok_sofar(results_sofar,"cache") && local_results_ok_sofar(results_sofar,"cache"))
        results_sofar =
          combine_results(test_53(), results_sofar, "test_53", "cache");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          return false;
      }


    report_results("TesterLab7",results_sofar,general_results);


    if (results_ok(results_sofar,general_results))
      return true;
    else
      return false;
  }



  static boolean test_1 ()
  {
      
      testName = "test_1" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      return ok_sofar ;
  }


  static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","kaixo","hi","ciao","hallo","dobry den","salaam","hei","hola","privet","zdravo" }) ;
      return ok_sofar ;
  }


  static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","bon dia","namaste","ola","hei","zdravo","hallo","dobry den","privet" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"ola",3,new Integer[] { 4 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","bon dia","namaste","ola","hei","zdravo","hallo","dobry den","privet" },new Integer[] { 4 }) ;
      return ok_sofar ;
  }


  static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hej","hello","hola","zdravo","dobry den","rimaykullayki","salaam","hallo","kaixo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"kaixo",3,new Integer[] { 9 },new String[] { "kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hej","hello","hola","zdravo","dobry den","rimaykullayki","salaam","hallo","kaixo" },new Integer[] { 9 }) ;
      return ok_sofar ;
  }


  static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","kaixo","hello","hola","zdravo","rimaykullayki","hi","hallo","privet","namaste","ola","dobry den" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"hi",4,new Integer[] { 7 },new String[] { "hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","kaixo","hello","hola","zdravo","rimaykullayki","hi","hallo","privet","namaste","ola","dobry den" },new Integer[] { 7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"dobry den",4,new Integer[] { 6,7 },new String[] { "dobry den","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hei","kaixo","hello","hola","zdravo","rimaykullayki","hi","hallo","privet","namaste","ola","dobry den" },new Integer[] { 6,7 }) ;
      return ok_sofar ;
  }


  static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","hi","hei","privet","hej","zdravo","kaixo","dobry den","salaam","hallo","hola","hello","namaste","ciao","rimaykullayki" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"rimaykullayki",5,new Integer[] { 15 },new String[] { "rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","hi","hei","privet","hej","zdravo","kaixo","dobry den","salaam","hallo","hola","hello","namaste","ciao","rimaykullayki" },new Integer[] { 15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"hola",5,new Integer[] { 12,15 },new String[] { "hola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","hi","hei","privet","hej","zdravo","kaixo","dobry den","salaam","hallo","hola","hello","namaste","ciao","rimaykullayki" },new Integer[] { 12,15 }) ;
      return ok_sofar ;
  }


  static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","hi","hallo","privet","rimaykullayki","hej" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hi",2,new Integer[] { 2 },new String[] { "hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","hi","hallo","privet","rimaykullayki","hej" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hi",2,new Integer[] { 2 },new String[] { "hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","hi","hallo","privet","rimaykullayki","hej" },new Integer[] { 2 }) ;
      return ok_sofar ;
  }


  static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","hei","hej","ola","dobry den","kaixo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"ciao",2,new Integer[] { 2 },new String[] { "ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","hei","hej","ola","dobry den","kaixo" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"ola",2,new Integer[] { 2 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","hei","hej","ola","dobry den","kaixo" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"ola",2,new Integer[] { 4,2 },new String[] { "ola","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","hei","hej","ola","dobry den","kaixo" },new Integer[] { 4,2 }) ;
      return ok_sofar ;
  }


  static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","salaam","kaixo","ciao","rimaykullayki","ola","hej","bon dia","hola","hi","hei","namaste","privet","zdravo","dobry den" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hallo",5,new Integer[] { 1 },new String[] { "hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","salaam","kaixo","ciao","rimaykullayki","ola","hej","bon dia","hola","hi","hei","namaste","privet","zdravo","dobry den" },new Integer[] { 1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"hallo",5,new Integer[] { 15,1 },new String[] { "hallo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","salaam","kaixo","ciao","rimaykullayki","ola","hej","bon dia","hola","hi","hei","namaste","privet","zdravo","dobry den" },new Integer[] { 15,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hi",5,new Integer[] { 10,15,1 },new String[] { "hi","hallo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hallo","salaam","kaixo","ciao","rimaykullayki","ola","hej","bon dia","hola","hi","hei","namaste","privet","zdravo","dobry den" },new Integer[] { 10,15,1 }) ;
      return ok_sofar ;
  }


  static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","salaam","privet","hello","namaste","kaixo","rimaykullayki","ola","zdravo","hi","hej","hallo","hola","ciao","bon dia" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"ola",5,new Integer[] { 8 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","salaam","privet","hello","namaste","kaixo","rimaykullayki","ola","zdravo","hi","hej","hallo","hola","ciao","bon dia" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(14,"ciao",5,new Integer[] { 14,8 },new String[] { "ciao","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","salaam","privet","hello","namaste","kaixo","rimaykullayki","ola","zdravo","hi","hej","hallo","hola","ciao","bon dia" },new Integer[] { 14,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"ola",5,new Integer[] { 3,14,8 },new String[] { "ola","ciao","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","salaam","privet","hello","namaste","kaixo","rimaykullayki","ola","zdravo","hi","hej","hallo","hola","ciao","bon dia" },new Integer[] { 3,14,8 }) ;
      return ok_sofar ;
  }


  static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","hallo","hello","hei","ciao","rimaykullayki","hola","hi","ola","hej","privet","namaste","dobry den","bon dia" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(13,"ola",5,new Integer[] { 13 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","hallo","hello","hei","ciao","rimaykullayki","hola","hi","ola","hej","privet","namaste","dobry den","bon dia" },new Integer[] { 13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"rimaykullayki",5,new Integer[] { 15,13 },new String[] { "rimaykullayki","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","hallo","hello","hei","ciao","rimaykullayki","hola","hi","ola","hej","privet","namaste","dobry den","bon dia" },new Integer[] { 15,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(13,"ola",5,new Integer[] { 15,13 },new String[] { "rimaykullayki","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","hallo","hello","hei","ciao","rimaykullayki","hola","hi","ola","hej","privet","namaste","dobry den","bon dia" },new Integer[] { 13,15 }) ;
      return ok_sofar ;
  }


  static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hej","dobry den","salaam","ola","privet","hola","kaixo","namaste","bon dia","zdravo","ciao","hello","hi","hallo","rimaykullayki" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"namaste",5,new Integer[] { 15 },new String[] { "namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hej","dobry den","salaam","ola","privet","hola","kaixo","namaste","bon dia","zdravo","ciao","hello","hi","hallo","rimaykullayki" },new Integer[] { 15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(14,"hallo",5,new Integer[] { 14,15 },new String[] { "hallo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hej","dobry den","salaam","ola","privet","hola","kaixo","namaste","bon dia","zdravo","ciao","hello","hi","hallo","rimaykullayki" },new Integer[] { 14,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"bon dia",5,new Integer[] { 8,14,15 },new String[] { "bon dia","hallo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hej","dobry den","salaam","ola","privet","hola","kaixo","namaste","bon dia","zdravo","ciao","hello","hi","hallo","rimaykullayki" },new Integer[] { 8,14,15 }) ;
      return ok_sofar ;
  }


  static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","rimaykullayki","hei","ola","hi","hola" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"rimaykullayki",2,new Integer[] { 2 },new String[] { "rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","rimaykullayki","hei","ola","hi","hola" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hallo",2,new Integer[] { 1,2 },new String[] { "hallo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","rimaykullayki","hei","ola","hi","hola" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hei",2,new Integer[] { 3,1 },new String[] { "hei","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","rimaykullayki","hei","ola","hi","hola" },new Integer[] { 3,1 }) ;
      return ok_sofar ;
  }


  static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","ciao","kaixo","hej","hallo","rimaykullayki" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"d1",2,new Integer[] { 2 },new String[] { "d1" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","ciao","kaixo","hej","hallo","rimaykullayki" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"d2",2,new Integer[] { 1,2 },new String[] { "d2","d1" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","ciao","kaixo","hej","hallo","rimaykullayki" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"d3",2,new Integer[] { 3,1 },new String[] { "d3","d2" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","d1","kaixo","hej","hallo","rimaykullayki" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"d1",2,new Integer[] { 2,3 },new String[] { "d1","d3" },new Integer[] { 1,2,3,4,5,6 },new String[] { "d2","d1","kaixo","hej","hallo","rimaykullayki" },new Integer[] { 2,3 }) ;
      return ok_sofar ;
  }


  static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","bon dia","ciao","rimaykullayki","hei","ola","zdravo","hi","hallo","salaam","hola","dobry den" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"hello",4,new Integer[] { 12 },new String[] { "hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","bon dia","ciao","rimaykullayki","hei","ola","zdravo","hi","hallo","salaam","hola","dobry den" },new Integer[] { 12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hej",4,new Integer[] { 1,12 },new String[] { "hej","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","bon dia","ciao","rimaykullayki","hei","ola","zdravo","hi","hallo","salaam","hola","dobry den" },new Integer[] { 1,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"salaam",4,new Integer[] { 10,1,12 },new String[] { "salaam","hej","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","bon dia","ciao","rimaykullayki","hei","ola","zdravo","hi","hallo","salaam","hola","dobry den" },new Integer[] { 10,1,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"rimaykullayki",4,new Integer[] { 4,10,1,12 },new String[] { "rimaykullayki","salaam","hej","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","bon dia","ciao","rimaykullayki","hei","ola","zdravo","hi","hallo","salaam","hola","dobry den" },new Integer[] { 4,10,1,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"namaste",4,new Integer[] { 4,10,1,12 },new String[] { "namaste","salaam","hej","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hej","bon dia","ciao","rimaykullayki","hei","ola","zdravo","hi","hallo","salaam","hola","dobry den" },new Integer[] { 4,10,1,12 }) ;
      return ok_sofar ;
  }


  static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","dobry den","hello","hallo","hej","privet","bon dia","namaste","kaixo","ciao","rimaykullayki","salaam" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"bon dia",4,new Integer[] { 3 },new String[] { "bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","dobry den","hello","hallo","hej","privet","bon dia","namaste","kaixo","ciao","rimaykullayki","salaam" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hej",4,new Integer[] { 5,3 },new String[] { "hej","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","dobry den","hello","hallo","hej","privet","bon dia","namaste","kaixo","ciao","rimaykullayki","salaam" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hello",4,new Integer[] { 2,5,3 },new String[] { "hello","hej","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","dobry den","hello","hallo","hej","privet","bon dia","namaste","kaixo","ciao","rimaykullayki","salaam" },new Integer[] { 2,5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"namaste",4,new Integer[] { 8,2,5,3 },new String[] { "namaste","hello","hej","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","dobry den","hello","hallo","hej","privet","bon dia","namaste","kaixo","ciao","rimaykullayki","salaam" },new Integer[] { 8,2,5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"ciao",4,new Integer[] { 10,8,2,5 },new String[] { "ciao","namaste","hello","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","dobry den","bon dia","hallo","hej","privet","bon dia","namaste","kaixo","ciao","rimaykullayki","salaam" },new Integer[] { 10,8,2,5 }) ;
      return ok_sofar ;
  }


  static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ola","hei","zdravo","dobry den","ciao","hej","privet","bon dia" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hello",3,new Integer[] { 1 },new String[] { "hello" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ola","hei","zdravo","dobry den","ciao","hej","privet","bon dia" },new Integer[] { 1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"ciao",3,new Integer[] { 6,1 },new String[] { "ciao","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ola","hei","zdravo","dobry den","ciao","hej","privet","bon dia" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"namaste",3,new Integer[] { 7,6,1 },new String[] { "namaste","ciao","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","ola","hei","zdravo","dobry den","ciao","hej","privet","bon dia" },new Integer[] { 7,6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"zdravo",3,new Integer[] { 2,7,6 },new String[] { "zdravo","namaste","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hello","ola","hei","zdravo","dobry den","ciao","hej","privet","bon dia" },new Integer[] { 2,7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"namaste",3,new Integer[] { 2,7,6 },new String[] { "zdravo","namaste","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hello","ola","hei","zdravo","dobry den","ciao","hej","privet","bon dia" },new Integer[] { 7,2,6 }) ;
      return ok_sofar ;
  }


  static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","kaixo","privet","rimaykullayki","zdravo","ola" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"kaixo",2,new Integer[] { 2 },new String[] { "kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","kaixo","privet","rimaykullayki","zdravo","ola" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"new",2,new Integer[] { 2 },new String[] { "new" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","kaixo","privet","rimaykullayki","zdravo","ola" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"privet",2,new Integer[] { 3,2 },new String[] { "privet","new" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","kaixo","privet","rimaykullayki","zdravo","ola" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"rimaykullayki",2,new Integer[] { 4,3 },new String[] { "rimaykullayki","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","new","privet","rimaykullayki","zdravo","ola" },new Integer[] { 4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"new",2,new Integer[] { 2,4 },new String[] { "new","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","new","privet","rimaykullayki","zdravo","ola" },new Integer[] { 2,4 }) ;
      return ok_sofar ;
  }


  static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hola","hello","salaam","bon dia","namaste","privet","ola","dobry den","ciao","hej","rimaykullayki" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"dobry den",4,new Integer[] { 7 },new String[] { "dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hola","hello","salaam","bon dia","namaste","privet","ola","dobry den","ciao","hej","rimaykullayki" },new Integer[] { 7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hej",4,new Integer[] { 11,7 },new String[] { "hej","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hola","hello","salaam","bon dia","namaste","privet","ola","dobry den","ciao","hej","rimaykullayki" },new Integer[] { 11,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hej",4,new Integer[] { 11,7 },new String[] { "hej","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hola","hello","salaam","bon dia","namaste","privet","ola","dobry den","ciao","hej","rimaykullayki" },new Integer[] { 11,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"hola",4,new Integer[] { 8,11,7 },new String[] { "hola","hej","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hola","hello","salaam","bon dia","namaste","privet","ola","dobry den","ciao","hej","rimaykullayki" },new Integer[] { 8,11,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hej",4,new Integer[] { 8,11,7 },new String[] { "hola","hej","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hola","hello","salaam","bon dia","namaste","privet","ola","dobry den","ciao","hej","rimaykullayki" },new Integer[] { 11,8,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hallo",4,new Integer[] { 1,8,11,7 },new String[] { "hallo","hola","hej","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","hola","hello","salaam","bon dia","namaste","privet","ola","dobry den","ciao","hej","rimaykullayki" },new Integer[] { 1,11,8,7 }) ;
      return ok_sofar ;
  }


  static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hej","bon dia","hola","zdravo","hallo","salaam","hi","privet","dobry den","hello","namaste","ciao","kaixo","hei","rimaykullayki" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"hola",5,new Integer[] { 12 },new String[] { "hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hej","bon dia","hola","zdravo","hallo","salaam","hi","privet","dobry den","hello","namaste","ciao","kaixo","hei","rimaykullayki" },new Integer[] { 12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"dobry den",5,new Integer[] { 9,12 },new String[] { "dobry den","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hej","bon dia","hola","zdravo","hallo","salaam","hi","privet","dobry den","hello","namaste","ciao","kaixo","hei","rimaykullayki" },new Integer[] { 9,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(13,"kaixo",5,new Integer[] { 13,9,12 },new String[] { "kaixo","dobry den","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hej","bon dia","hola","zdravo","hallo","salaam","hi","privet","dobry den","hello","namaste","ciao","kaixo","hei","rimaykullayki" },new Integer[] { 13,9,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"privet",5,new Integer[] { 8,13,9,12 },new String[] { "privet","kaixo","dobry den","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hej","bon dia","hola","zdravo","hallo","salaam","hi","privet","dobry den","hello","namaste","ciao","kaixo","hei","rimaykullayki" },new Integer[] { 8,13,9,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"dobry den",5,new Integer[] { 11,8,13,9,12 },new String[] { "dobry den","privet","kaixo","dobry den","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hej","bon dia","hola","zdravo","hallo","salaam","hi","privet","dobry den","hello","namaste","ciao","kaixo","hei","rimaykullayki" },new Integer[] { 11,8,13,9,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"namaste",5,new Integer[] { 3,11,8,13,9 },new String[] { "namaste","dobry den","privet","kaixo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hej","bon dia","hola","zdravo","hallo","salaam","hi","privet","dobry den","hello","namaste","hola","kaixo","hei","rimaykullayki" },new Integer[] { 3,11,8,13,9 }) ;
      return ok_sofar ;
  }


  static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","ola","hej","kaixo","hello","hi","bon dia","rimaykullayki","salaam" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"ciao",3,new Integer[] { 5 },new String[] { "ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","ola","hej","kaixo","hello","hi","bon dia","rimaykullayki","salaam" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hola",3,new Integer[] { 1,5 },new String[] { "hola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","ola","hej","kaixo","hello","hi","bon dia","rimaykullayki","salaam" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"hei",3,new Integer[] { 9,1,5 },new String[] { "hei","hola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","ola","hej","kaixo","hello","hi","bon dia","rimaykullayki","salaam" },new Integer[] { 9,1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"privet",3,new Integer[] { 6,9,1 },new String[] { "privet","hei","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","ola","hej","kaixo","ciao","hi","bon dia","rimaykullayki","salaam" },new Integer[] { 6,9,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"ciao",3,new Integer[] { 6,9,1 },new String[] { "ciao","hei","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","ola","hej","kaixo","ciao","hi","bon dia","rimaykullayki","salaam" },new Integer[] { 6,9,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hallo",3,new Integer[] { 2,6,9 },new String[] { "hallo","ciao","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","ola","hej","kaixo","ciao","hi","bon dia","rimaykullayki","salaam" },new Integer[] { 2,6,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"bon dia",3,new Integer[] { 7,2,6 },new String[] { "bon dia","hallo","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","ola","hej","kaixo","ciao","hi","bon dia","rimaykullayki","hei" },new Integer[] { 7,2,6 }) ;
      return ok_sofar ;
  }


  static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","dobry den","rimaykullayki","ola","privet","ciao" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"bon dia",2,new Integer[] { 3 },new String[] { "bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","dobry den","rimaykullayki","ola","privet","ciao" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hi",2,new Integer[] { 1,3 },new String[] { "hi","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","dobry den","rimaykullayki","ola","privet","ciao" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"privet",2,new Integer[] { 5,1 },new String[] { "privet","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","dobry den","bon dia","ola","privet","ciao" },new Integer[] { 5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"dobry den",2,new Integer[] { 2,5 },new String[] { "dobry den","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","dobry den","bon dia","ola","privet","ciao" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hi",2,new Integer[] { 1,2 },new String[] { "hi","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","dobry den","bon dia","ola","privet","ciao" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hi",2,new Integer[] { 1,2 },new String[] { "hi","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","dobry den","bon dia","ola","privet","ciao" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"dobry den",2,new Integer[] { 1,2 },new String[] { "hi","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","dobry den","bon dia","ola","privet","ciao" },new Integer[] { 2,1 }) ;
      return ok_sofar ;
  }


  static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "zdravo","hi","hei","salaam","kaixo","privet","bon dia","rimaykullayki","dobry den","ciao","namaste","hola" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"salaam",4,new Integer[] { 4 },new String[] { "salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "zdravo","hi","hei","salaam","kaixo","privet","bon dia","rimaykullayki","dobry den","ciao","namaste","hola" },new Integer[] { 4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"rimaykullayki",4,new Integer[] { 6,4 },new String[] { "rimaykullayki","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "zdravo","hi","hei","salaam","kaixo","privet","bon dia","rimaykullayki","dobry den","ciao","namaste","hola" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"rimaykullayki",4,new Integer[] { 12,6,4 },new String[] { "rimaykullayki","rimaykullayki","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "zdravo","hi","hei","salaam","kaixo","privet","bon dia","rimaykullayki","dobry den","ciao","namaste","hola" },new Integer[] { 12,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"kaixo",4,new Integer[] { 12,6,4 },new String[] { "kaixo","rimaykullayki","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "zdravo","hi","hei","salaam","kaixo","privet","bon dia","rimaykullayki","dobry den","ciao","namaste","hola" },new Integer[] { 12,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"ciao",4,new Integer[] { 10,12,6,4 },new String[] { "ciao","kaixo","rimaykullayki","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "zdravo","hi","hei","salaam","kaixo","privet","bon dia","rimaykullayki","dobry den","ciao","namaste","hola" },new Integer[] { 10,12,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hi",4,new Integer[] { 2,10,12,6 },new String[] { "hi","ciao","kaixo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "zdravo","hi","hei","salaam","kaixo","privet","bon dia","rimaykullayki","dobry den","ciao","namaste","hola" },new Integer[] { 2,10,12,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"rimaykullayki",4,new Integer[] { 1,2,10,12 },new String[] { "rimaykullayki","hi","ciao","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "zdravo","hi","hei","salaam","kaixo","rimaykullayki","bon dia","rimaykullayki","dobry den","ciao","namaste","hola" },new Integer[] { 1,2,10,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"bon dia",4,new Integer[] { 7,1,2,10 },new String[] { "bon dia","rimaykullayki","hi","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "zdravo","hi","hei","salaam","kaixo","rimaykullayki","bon dia","rimaykullayki","dobry den","ciao","namaste","kaixo" },new Integer[] { 7,1,2,10 }) ;
      return ok_sofar ;
  }


  static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","hej","hei","dobry den","ciao","hola" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"hola",2,new Integer[] { 6 },new String[] { "hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","hej","hei","dobry den","ciao","hola" },new Integer[] { 6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hello",2,new Integer[] { 1,6 },new String[] { "hello","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","hej","hei","dobry den","ciao","hola" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"dobry den",2,new Integer[] { 1,6 },new String[] { "hello","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","hej","hei","dobry den","ciao","hola" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"rimaykullayki",2,new Integer[] { 1,6 },new String[] { "hello","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","hej","hei","dobry den","ciao","hola" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"privet",2,new Integer[] { 2,6 },new String[] { "privet","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","hej","hei","dobry den","ciao","hola" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"rimaykullayki",2,new Integer[] { 2,6 },new String[] { "privet","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","hej","hei","dobry den","ciao","hola" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hello",2,new Integer[] { 1,6 },new String[] { "hello","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","privet","hei","dobry den","ciao","hola" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"dobry den",2,new Integer[] { 4,1 },new String[] { "dobry den","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","privet","hei","dobry den","ciao","rimaykullayki" },new Integer[] { 4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hei",2,new Integer[] { 3,4 },new String[] { "hei","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","privet","hei","dobry den","ciao","rimaykullayki" },new Integer[] { 3,4 }) ;
      return ok_sofar ;
  }


  static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","rimaykullayki","zdravo","hallo","ola","hei" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"rimaykullayki",2,new Integer[] { 2 },new String[] { "rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","rimaykullayki","zdravo","hallo","ola","hei" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"bon dia",2,new Integer[] { 1,2 },new String[] { "bon dia","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","rimaykullayki","zdravo","hallo","ola","hei" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"bon dia",2,new Integer[] { 1,2 },new String[] { "bon dia","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","rimaykullayki","zdravo","hallo","ola","hei" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"bon dia",2,new Integer[] { 1,2 },new String[] { "bon dia","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","rimaykullayki","zdravo","hallo","ola","hei" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hello",2,new Integer[] { 3,2 },new String[] { "hello","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","rimaykullayki","zdravo","hallo","ola","hei" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hei",2,new Integer[] { 6,3 },new String[] { "hei","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","bon dia","zdravo","hallo","ola","hei" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hallo",2,new Integer[] { 4,6 },new String[] { "hallo","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","bon dia","hello","hallo","ola","hei" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hello",2,new Integer[] { 3,4 },new String[] { "hello","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","bon dia","hello","hallo","ola","hei" },new Integer[] { 3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hi",2,new Integer[] { 2,3 },new String[] { "hi","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","bon dia","hello","hallo","ola","hei" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"ola",2,new Integer[] { 5,2 },new String[] { "ola","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","bon dia","hello","hallo","ola","hei" },new Integer[] { 5,2 }) ;
      return ok_sofar ;
  }


  static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","ciao","privet","kaixo","bon dia","hej","namaste","rimaykullayki","hello","dobry den","salaam","zdravo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hola",4,new Integer[] { 1 },new String[] { "hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","ciao","privet","kaixo","bon dia","hej","namaste","rimaykullayki","hello","dobry den","salaam","zdravo" },new Integer[] { 1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"salaam",4,new Integer[] { 4,1 },new String[] { "salaam","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","ciao","privet","kaixo","bon dia","hej","namaste","rimaykullayki","hello","dobry den","salaam","zdravo" },new Integer[] { 4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"rimaykullayki",4,new Integer[] { 4,1 },new String[] { "salaam","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","ciao","privet","kaixo","bon dia","hej","namaste","rimaykullayki","hello","dobry den","salaam","zdravo" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hi",4,new Integer[] { 5,4,1 },new String[] { "hi","salaam","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","ciao","privet","kaixo","bon dia","hej","namaste","rimaykullayki","hello","dobry den","salaam","zdravo" },new Integer[] { 5,1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"rimaykullayki",4,new Integer[] { 8,5,4,1 },new String[] { "rimaykullayki","hi","salaam","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","ciao","privet","kaixo","bon dia","hej","namaste","rimaykullayki","hello","dobry den","salaam","zdravo" },new Integer[] { 8,5,1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"namaste",4,new Integer[] { 7,8,5,1 },new String[] { "namaste","rimaykullayki","hi","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","ciao","privet","salaam","bon dia","hej","namaste","rimaykullayki","hello","dobry den","salaam","zdravo" },new Integer[] { 7,8,5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"zdravo",4,new Integer[] { 12,7,8,5 },new String[] { "zdravo","namaste","rimaykullayki","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ciao","privet","salaam","bon dia","hej","namaste","rimaykullayki","hello","dobry den","salaam","zdravo" },new Integer[] { 12,7,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"hola",4,new Integer[] { 12,7,8,5 },new String[] { "hola","namaste","rimaykullayki","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ciao","privet","salaam","bon dia","hej","namaste","rimaykullayki","hello","dobry den","salaam","zdravo" },new Integer[] { 12,7,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"namaste",4,new Integer[] { 10,12,7,8 },new String[] { "namaste","hola","namaste","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ciao","privet","salaam","hi","hej","namaste","rimaykullayki","hello","dobry den","salaam","zdravo" },new Integer[] { 10,12,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"rimaykullayki",4,new Integer[] { 10,12,7,8 },new String[] { "namaste","hola","namaste","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","ciao","privet","salaam","hi","hej","namaste","rimaykullayki","hello","dobry den","salaam","zdravo" },new Integer[] { 8,10,12,7 }) ;
      return ok_sofar ;
  }


  static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hola","privet","ciao","hallo","bon dia","salaam","kaixo","rimaykullayki","hi","hello","hej","hei","dobry den","namaste","zdravo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"kaixo",5,new Integer[] { 7 },new String[] { "kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hola","privet","ciao","hallo","bon dia","salaam","kaixo","rimaykullayki","hi","hello","hej","hei","dobry den","namaste","zdravo" },new Integer[] { 7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"hello",5,new Integer[] { 9,7 },new String[] { "hello","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hola","privet","ciao","hallo","bon dia","salaam","kaixo","rimaykullayki","hi","hello","hej","hei","dobry den","namaste","zdravo" },new Integer[] { 9,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hi",5,new Integer[] { 2,9,7 },new String[] { "hi","hello","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hola","privet","ciao","hallo","bon dia","salaam","kaixo","rimaykullayki","hi","hello","hej","hei","dobry den","namaste","zdravo" },new Integer[] { 2,9,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"rimaykullayki",5,new Integer[] { 8,2,9,7 },new String[] { "rimaykullayki","hi","hello","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hola","privet","ciao","hallo","bon dia","salaam","kaixo","rimaykullayki","hi","hello","hej","hei","dobry den","namaste","zdravo" },new Integer[] { 8,2,9,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hola",5,new Integer[] { 1,8,2,9,7 },new String[] { "hola","rimaykullayki","hi","hello","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hola","privet","ciao","hallo","bon dia","salaam","kaixo","rimaykullayki","hi","hello","hej","hei","dobry den","namaste","zdravo" },new Integer[] { 1,8,2,9,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(14,"namaste",5,new Integer[] { 14,1,8,2,9 },new String[] { "namaste","hola","rimaykullayki","hi","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hola","privet","ciao","hallo","bon dia","salaam","kaixo","rimaykullayki","hi","hello","hej","hei","dobry den","namaste","zdravo" },new Integer[] { 14,1,8,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"hello",5,new Integer[] { 14,1,8,2,9 },new String[] { "namaste","hola","rimaykullayki","hi","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hola","privet","ciao","hallo","bon dia","salaam","kaixo","rimaykullayki","hi","hello","hej","hei","dobry den","namaste","zdravo" },new Integer[] { 9,14,1,8,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"ola",5,new Integer[] { 7,14,1,8,9 },new String[] { "ola","namaste","hola","rimaykullayki","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hola","hi","ciao","hallo","bon dia","salaam","kaixo","rimaykullayki","hi","hello","hej","hei","dobry den","namaste","zdravo" },new Integer[] { 7,9,14,1,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hi",5,new Integer[] { 2,7,14,1,9 },new String[] { "hi","ola","namaste","hola","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hola","hi","ciao","hallo","bon dia","salaam","kaixo","rimaykullayki","hi","hello","hej","hei","dobry den","namaste","zdravo" },new Integer[] { 2,7,9,14,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hola",5,new Integer[] { 2,7,14,1,9 },new String[] { "hi","ola","namaste","hola","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hola","hi","ciao","hallo","bon dia","salaam","kaixo","rimaykullayki","hi","hello","hej","hei","dobry den","namaste","zdravo" },new Integer[] { 1,2,7,9,14 }) ;
      return ok_sofar ;
  }


  static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","salaam","namaste","kaixo","ciao","dobry den","hola","ola","hi" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"ola",3,new Integer[] { 5 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","salaam","namaste","kaixo","ciao","dobry den","hola","ola","hi" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"zdravo",3,new Integer[] { 6,5 },new String[] { "zdravo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","salaam","namaste","kaixo","ciao","dobry den","hola","ola","hi" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hallo",3,new Integer[] { 6,5 },new String[] { "hallo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","salaam","namaste","kaixo","ciao","dobry den","hola","ola","hi" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"salaam",3,new Integer[] { 2,6,5 },new String[] { "salaam","hallo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","salaam","namaste","kaixo","ciao","dobry den","hola","ola","hi" },new Integer[] { 2,6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"hallo",3,new Integer[] { 2,6,5 },new String[] { "salaam","hallo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","salaam","namaste","kaixo","ciao","dobry den","hola","ola","hi" },new Integer[] { 6,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"hallo",3,new Integer[] { 2,6,5 },new String[] { "salaam","hallo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","salaam","namaste","kaixo","ciao","dobry den","hola","ola","hi" },new Integer[] { 6,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"hola",3,new Integer[] { 7,2,6 },new String[] { "hola","salaam","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","salaam","namaste","kaixo","ola","dobry den","hola","ola","hi" },new Integer[] { 7,6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hi",3,new Integer[] { 3,7,6 },new String[] { "hi","hola","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","salaam","namaste","kaixo","ola","dobry den","hola","ola","hi" },new Integer[] { 3,7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hi",3,new Integer[] { 3,7,6 },new String[] { "hi","hola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","salaam","namaste","kaixo","ola","dobry den","hola","ola","hi" },new Integer[] { 6,3,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"namaste",3,new Integer[] { 3,7,6 },new String[] { "hi","hola","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","salaam","namaste","kaixo","ola","dobry den","hola","ola","hi" },new Integer[] { 6,3,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hi",3,new Integer[] { 3,7,6 },new String[] { "hi","hola","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "rimaykullayki","salaam","namaste","kaixo","ola","dobry den","hola","ola","hi" },new Integer[] { 3,6,7 }) ;
      return ok_sofar ;
  }


  static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ciao","namaste","salaam","dobry den","privet","hello","bon dia" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"ola",5,new Integer[] { 9 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ciao","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"rimaykullayki",5,new Integer[] { 3,9 },new String[] { "rimaykullayki","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ciao","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 3,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(14,"hello",5,new Integer[] { 14,3,9 },new String[] { "hello","rimaykullayki","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ciao","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 14,3,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"salaam",5,new Integer[] { 11,14,3,9 },new String[] { "salaam","hello","rimaykullayki","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ciao","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 11,14,3,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"bon dia",5,new Integer[] { 15,11,14,3,9 },new String[] { "bon dia","salaam","hello","rimaykullayki","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ciao","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 15,11,14,3,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hei",5,new Integer[] { 5,15,11,14,3 },new String[] { "hei","bon dia","salaam","hello","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ola","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 5,15,11,14,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"ola",5,new Integer[] { 6,5,15,11,14 },new String[] { "ola","hei","bon dia","salaam","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ola","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 6,5,15,11,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"salaam",5,new Integer[] { 6,5,15,11,14 },new String[] { "ola","hei","bon dia","salaam","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ola","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 11,6,5,15,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"ciao",5,new Integer[] { 12,6,5,15,11 },new String[] { "ciao","ola","hei","bon dia","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ola","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 12,11,6,5,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"rimaykullayki",5,new Integer[] { 1,12,6,5,11 },new String[] { "rimaykullayki","ciao","ola","hei","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ola","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 1,12,11,6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"hi",5,new Integer[] { 1,12,6,5,11 },new String[] { "rimaykullayki","hi","ola","hei","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ola","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 12,1,11,6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"hej",5,new Integer[] { 8,1,12,6,11 },new String[] { "hej","rimaykullayki","hi","ola","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ola","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 8,12,1,11,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(14,"hello",5,new Integer[] { 14,8,1,12,11 },new String[] { "hello","hej","rimaykullayki","hi","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "kaixo","hallo","rimaykullayki","hola","hei","ola","zdravo","hej","ola","namaste","salaam","dobry den","privet","hello","bon dia" },new Integer[] { 14,8,12,1,11 }) ;
      return ok_sofar ;
  }


  static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","hei","namaste","hello","kaixo","zdravo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hello",2,new Integer[] { 6 },new String[] { "hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","hei","namaste","hello","kaixo","zdravo" },new Integer[] { 6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hi",2,new Integer[] { 4,6 },new String[] { "hi","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","hei","namaste","hello","kaixo","zdravo" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hej",2,new Integer[] { 1,4 },new String[] { "hej","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","hei","namaste","hello","kaixo","hello" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"zdravo",2,new Integer[] { 3,1 },new String[] { "zdravo","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","hei","namaste","hi","kaixo","hello" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hej",2,new Integer[] { 3,1 },new String[] { "zdravo","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","hei","namaste","hi","kaixo","hello" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hej",2,new Integer[] { 5,1 },new String[] { "hej","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","hei","zdravo","hi","kaixo","hello" },new Integer[] { 5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"rimaykullayki",2,new Integer[] { 3,5 },new String[] { "rimaykullayki","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hei","zdravo","hi","kaixo","hello" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"rimaykullayki",2,new Integer[] { 3,5 },new String[] { "rimaykullayki","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hei","zdravo","hi","kaixo","hello" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hej",2,new Integer[] { 2,3 },new String[] { "hej","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hei","zdravo","hi","hej","hello" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hej",2,new Integer[] { 6,2 },new String[] { "hej","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hei","rimaykullayki","hi","hej","hello" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hej",2,new Integer[] { 6,2 },new String[] { "hej","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hei","rimaykullayki","hi","hej","hello" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hello",2,new Integer[] { 6,2 },new String[] { "hello","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hei","rimaykullayki","hi","hej","hello" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"hello",2,new Integer[] { 6,2 },new String[] { "hello","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hej","hei","rimaykullayki","hi","hej","hello" },new Integer[] { 6,2 }) ;
      return ok_sofar ;
  }


  static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","dobry den","kaixo","hola","hello","zdravo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"zdravo",3,new Integer[] { 6 },new String[] { "zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","dobry den","kaixo","hola","hello","zdravo" },new Integer[] { 6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"hei",3,new Integer[] { 7,6 },new String[] { "hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","dobry den","kaixo","hola","hello","zdravo" },new Integer[] { 7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"hei",3,new Integer[] { 7,6 },new String[] { "hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","dobry den","kaixo","hola","hello","zdravo" },new Integer[] { 7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hei",3,new Integer[] { 3,7,6 },new String[] { "hei","hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","dobry den","kaixo","hola","hello","zdravo" },new Integer[] { 3,7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"zdravo",3,new Integer[] { 3,7,6 },new String[] { "hei","hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","dobry den","kaixo","hola","hello","zdravo" },new Integer[] { 6,3,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"zdravo",3,new Integer[] { 5,3,6 },new String[] { "zdravo","hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","dobry den","kaixo","hei","hello","zdravo" },new Integer[] { 5,6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"bon dia",3,new Integer[] { 7,5,6 },new String[] { "bon dia","zdravo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","dobry den","kaixo","hei","hello","zdravo" },new Integer[] { 7,5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"kaixo",3,new Integer[] { 7,5,6 },new String[] { "bon dia","kaixo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","dobry den","kaixo","hei","hello","zdravo" },new Integer[] { 5,7,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hallo",3,new Integer[] { 1,7,5 },new String[] { "hallo","bon dia","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","dobry den","zdravo","hei","hello","zdravo" },new Integer[] { 1,5,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"bon dia",3,new Integer[] { 4,1,5 },new String[] { "bon dia","hallo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","dobry den","zdravo","bon dia","hello","zdravo" },new Integer[] { 4,1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"kaixo",3,new Integer[] { 2,4,1 },new String[] { "kaixo","bon dia","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","kaixo","zdravo","bon dia","hello","zdravo" },new Integer[] { 2,4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hei",3,new Integer[] { 3,2,4 },new String[] { "hei","kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","kaixo","zdravo","bon dia","hello","zdravo" },new Integer[] { 3,2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hei",3,new Integer[] { 3,2,4 },new String[] { "hei","kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","kaixo","zdravo","bon dia","hello","zdravo" },new Integer[] { 3,2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"kaixo",3,new Integer[] { 5,3,2 },new String[] { "kaixo","hei","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","privet","hei","bon dia","kaixo","zdravo","bon dia","hello","zdravo" },new Integer[] { 5,3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"zdravo",3,new Integer[] { 6,5,3 },new String[] { "zdravo","kaixo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hallo","kaixo","hei","bon dia","kaixo","zdravo","bon dia","hello","zdravo" },new Integer[] { 6,5,3 }) ;
      return ok_sofar ;
  }


  static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","kaixo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"privet",5,new Integer[] { 15 },new String[] { "privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","kaixo" },new Integer[] { 15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(14,"hola",5,new Integer[] { 14,15 },new String[] { "hola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","kaixo" },new Integer[] { 14,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"ciao",5,new Integer[] { 8,14,15 },new String[] { "ciao","hola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","kaixo" },new Integer[] { 8,14,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"dobry den",5,new Integer[] { 10,8,14,15 },new String[] { "dobry den","ciao","hola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","kaixo" },new Integer[] { 10,8,14,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"ola",5,new Integer[] { 12,10,8,14,15 },new String[] { "ola","dobry den","ciao","hola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","kaixo" },new Integer[] { 12,10,8,14,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"bon dia",5,new Integer[] { 11,12,10,8,14 },new String[] { "bon dia","ola","dobry den","ciao","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","privet" },new Integer[] { 11,12,10,8,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"kaixo",5,new Integer[] { 11,12,10,8,14 },new String[] { "bon dia","ola","kaixo","ciao","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","privet" },new Integer[] { 10,11,12,8,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"privet",5,new Integer[] { 15,11,12,10,8 },new String[] { "privet","bon dia","ola","kaixo","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","privet" },new Integer[] { 15,10,11,12,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"privet",5,new Integer[] { 15,11,12,10,8 },new String[] { "privet","bon dia","ola","kaixo","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","privet" },new Integer[] { 15,10,11,12,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"bon dia",5,new Integer[] { 15,11,12,10,8 },new String[] { "privet","bon dia","ola","kaixo","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","privet" },new Integer[] { 11,15,10,12,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hei",5,new Integer[] { 3,15,11,12,10 },new String[] { "hei","privet","bon dia","ola","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","privet" },new Integer[] { 3,11,15,10,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hej",5,new Integer[] { 5,3,15,11,10 },new String[] { "hej","hei","privet","bon dia","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","privet" },new Integer[] { 5,3,11,15,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"dobry den",5,new Integer[] { 5,3,15,11,10 },new String[] { "hej","hei","privet","bon dia","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","privet" },new Integer[] { 10,5,3,11,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(13,"salaam",5,new Integer[] { 13,5,3,11,10 },new String[] { "salaam","hej","hei","bon dia","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","privet" },new Integer[] { 13,10,5,3,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"ciao",5,new Integer[] { 7,13,5,3,10 },new String[] { "ciao","salaam","hej","hei","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "hei","hello","hi","namaste","hej","privet","rimaykullayki","ciao","hallo","dobry den","bon dia","ola","salaam","hola","privet" },new Integer[] { 7,13,10,5,3 }) ;
      return ok_sofar ;
  }


  static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hallo","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hi",4,new Integer[] { 3 },new String[] { "hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hallo","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hi",4,new Integer[] { 3 },new String[] { "hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hallo","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hola",4,new Integer[] { 1,3 },new String[] { "hola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hallo","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"privet",4,new Integer[] { 7,1,3 },new String[] { "privet","hola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hallo","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 7,1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"salaam",4,new Integer[] { 6,7,1,3 },new String[] { "salaam","privet","hola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hallo","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 6,7,1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hej",4,new Integer[] { 4,6,7,1 },new String[] { "hej","salaam","privet","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hi","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 4,6,7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"zdravo",4,new Integer[] { 9,4,6,7 },new String[] { "zdravo","hej","salaam","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hi","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 9,4,6,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"namaste",4,new Integer[] { 5,9,4,6 },new String[] { "namaste","zdravo","hej","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hi","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 5,9,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"rimaykullayki",4,new Integer[] { 2,5,9,4 },new String[] { "rimaykullayki","namaste","zdravo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hi","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 2,5,9,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"ciao",4,new Integer[] { 8,2,5,9 },new String[] { "ciao","rimaykullayki","namaste","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hi","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 8,2,5,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"ciao",4,new Integer[] { 8,2,5,9 },new String[] { "ciao","rimaykullayki","namaste","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hi","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 8,2,5,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hei",4,new Integer[] { 4,8,2,5 },new String[] { "hei","ciao","rimaykullayki","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hi","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 4,8,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"salaam",4,new Integer[] { 10,4,8,2 },new String[] { "salaam","hei","ciao","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hi","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 10,4,8,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hello",4,new Integer[] { 5,10,4,8 },new String[] { "hello","salaam","hei","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hi","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 5,10,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"kaixo",4,new Integer[] { 5,10,4,8 },new String[] { "hello","kaixo","hei","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hi","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 10,5,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hola",4,new Integer[] { 3,5,10,4 },new String[] { "hola","hello","kaixo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hi","hej","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 3,10,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"hi",4,new Integer[] { 11,3,5,10 },new String[] { "hi","hola","hello","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","rimaykullayki","hi","hei","namaste","salaam","privet","ciao","zdravo","dobry den","kaixo","hello" },new Integer[] { 11,3,10,5 }) ;
      return ok_sofar ;
  }


  static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","namaste","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"rimaykullayki",4,new Integer[] { 12 },new String[] { "rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","namaste","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"ola",4,new Integer[] { 9,12 },new String[] { "ola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","namaste","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 9,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hola",4,new Integer[] { 2,9,12 },new String[] { "hola","ola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","namaste","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 2,9,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"privet",4,new Integer[] { 6,2,9,12 },new String[] { "privet","hola","ola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","namaste","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 6,2,9,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"dobry den",4,new Integer[] { 1,6,2,9 },new String[] { "dobry den","privet","hola","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","namaste","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 1,6,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"privet",4,new Integer[] { 1,6,2,9 },new String[] { "dobry den","privet","hola","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","namaste","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 6,1,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"bon dia",4,new Integer[] { 3,1,6,2 },new String[] { "bon dia","dobry den","privet","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","namaste","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 3,6,1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"kaixo",4,new Integer[] { 5,3,1,6 },new String[] { "kaixo","bon dia","dobry den","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hola","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 5,3,6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"kaixo",4,new Integer[] { 5,3,1,6 },new String[] { "kaixo","bon dia","dobry den","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hola","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 5,3,6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"ola",4,new Integer[] { 12,5,3,6 },new String[] { "ola","kaixo","bon dia","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hola","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 12,5,3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hej",4,new Integer[] { 12,5,3,6 },new String[] { "ola","kaixo","hej","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hola","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 3,12,5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"namaste",4,new Integer[] { 12,5,3,6 },new String[] { "ola","kaixo","namaste","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hola","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 3,12,5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"namaste",4,new Integer[] { 12,5,3,6 },new String[] { "ola","kaixo","namaste","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hola","bon dia","salaam","kaixo","hola","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 3,12,5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"privet",4,new Integer[] { 1,12,5,3 },new String[] { "privet","ola","kaixo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hola","bon dia","salaam","kaixo","privet","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 1,3,12,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"hola",4,new Integer[] { 9,1,12,3 },new String[] { "hola","privet","ola","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hola","bon dia","salaam","kaixo","privet","zdravo","hello","ola","privet","hi","rimaykullayki" },new Integer[] { 9,1,3,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"zdravo",4,new Integer[] { 7,9,1,3 },new String[] { "zdravo","hola","privet","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hola","bon dia","salaam","kaixo","privet","zdravo","hello","ola","privet","hi","ola" },new Integer[] { 7,9,1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hola",4,new Integer[] { 6,7,9,1 },new String[] { "hola","zdravo","hola","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hola","namaste","salaam","kaixo","privet","zdravo","hello","ola","privet","hi","ola" },new Integer[] { 6,7,9,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"rimaykullayki",4,new Integer[] { 6,7,9,1 },new String[] { "hola","zdravo","hola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hola","namaste","salaam","kaixo","privet","zdravo","hello","ola","privet","hi","ola" },new Integer[] { 1,6,7,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"hello",4,new Integer[] { 8,6,7,1 },new String[] { "hello","hola","zdravo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hola","namaste","salaam","kaixo","privet","zdravo","hello","hola","privet","hi","ola" },new Integer[] { 8,1,6,7 }) ;
      return ok_sofar ;
  }


  static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","zdravo","hei","salaam","ciao","bon dia","hi","dobry den","hola","hello","rimaykullayki" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"ola",4,new Integer[] { 11 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","zdravo","hei","salaam","ciao","bon dia","hi","dobry den","hola","hello","rimaykullayki" },new Integer[] { 11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"zdravo",4,new Integer[] { 7,11 },new String[] { "zdravo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","zdravo","hei","salaam","ciao","bon dia","hi","dobry den","hola","hello","rimaykullayki" },new Integer[] { 7,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"ciao",4,new Integer[] { 3,7,11 },new String[] { "ciao","zdravo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","zdravo","hei","salaam","ciao","bon dia","hi","dobry den","hola","hello","rimaykullayki" },new Integer[] { 3,7,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"zdravo",4,new Integer[] { 3,7,11 },new String[] { "ciao","zdravo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","zdravo","hei","salaam","ciao","bon dia","hi","dobry den","hola","hello","rimaykullayki" },new Integer[] { 7,3,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"hej",4,new Integer[] { 3,7,11 },new String[] { "ciao","zdravo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","zdravo","hei","salaam","ciao","bon dia","hi","dobry den","hola","hello","rimaykullayki" },new Integer[] { 11,7,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"ola",4,new Integer[] { 4,3,7,11 },new String[] { "ola","ciao","zdravo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","zdravo","hei","salaam","ciao","bon dia","hi","dobry den","hola","hello","rimaykullayki" },new Integer[] { 4,11,7,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"salaam",4,new Integer[] { 5,4,7,11 },new String[] { "salaam","ola","zdravo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","ciao","hei","salaam","ciao","bon dia","hi","dobry den","hola","hello","rimaykullayki" },new Integer[] { 5,4,11,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"kaixo",4,new Integer[] { 1,5,4,11 },new String[] { "kaixo","salaam","ola","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","ciao","hei","salaam","ciao","zdravo","hi","dobry den","hola","hello","rimaykullayki" },new Integer[] { 1,5,4,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"privet",4,new Integer[] { 2,1,5,4 },new String[] { "privet","kaixo","salaam","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","ciao","hei","salaam","ciao","zdravo","hi","dobry den","hola","hej","rimaykullayki" },new Integer[] { 2,1,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"zdravo",4,new Integer[] { 7,2,1,5 },new String[] { "zdravo","privet","kaixo","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","ciao","ola","salaam","ciao","zdravo","hi","dobry den","hola","hej","rimaykullayki" },new Integer[] { 7,2,1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"kaixo",4,new Integer[] { 7,2,1,5 },new String[] { "zdravo","privet","kaixo","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","ciao","ola","salaam","ciao","zdravo","hi","dobry den","hola","hej","rimaykullayki" },new Integer[] { 1,7,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"privet",4,new Integer[] { 3,7,2,1 },new String[] { "privet","zdravo","privet","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","namaste","ciao","ola","salaam","ciao","zdravo","hi","dobry den","hola","hej","rimaykullayki" },new Integer[] { 3,1,7,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hello",4,new Integer[] { 4,3,7,1 },new String[] { "hello","privet","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","ciao","ola","salaam","ciao","zdravo","hi","dobry den","hola","hej","rimaykullayki" },new Integer[] { 4,3,1,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hi",4,new Integer[] { 6,4,3,1 },new String[] { "hi","hello","privet","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","ciao","ola","salaam","ciao","zdravo","hi","dobry den","hola","hej","rimaykullayki" },new Integer[] { 6,4,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hallo",4,new Integer[] { 6,4,3,1 },new String[] { "hi","hello","privet","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","ciao","ola","salaam","ciao","zdravo","hi","dobry den","hola","hej","rimaykullayki" },new Integer[] { 1,6,4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hola",4,new Integer[] { 10,6,4,1 },new String[] { "hola","hi","hello","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","ola","salaam","ciao","zdravo","hi","dobry den","hola","hej","rimaykullayki" },new Integer[] { 10,1,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"rimaykullayki",4,new Integer[] { 10,6,4,1 },new String[] { "hola","rimaykullayki","hello","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","ola","salaam","ciao","zdravo","hi","dobry den","hola","hej","rimaykullayki" },new Integer[] { 6,10,1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hej",4,new Integer[] { 11,10,6,1 },new String[] { "hej","hola","rimaykullayki","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","privet","privet","hello","salaam","ciao","zdravo","hi","dobry den","hola","hej","rimaykullayki" },new Integer[] { 11,6,10,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hola",4,new Integer[] { 2,11,10,6 },new String[] { "hola","hej","hola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hallo","privet","privet","hello","salaam","ciao","zdravo","hi","dobry den","hola","hej","rimaykullayki" },new Integer[] { 2,11,6,10 }) ;
      return ok_sofar ;
  }


  static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","hej","rimaykullayki","zdravo","dobry den","salaam","bon dia","kaixo","privet" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"rimaykullayki",3,new Integer[] { 3 },new String[] { "rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","hej","rimaykullayki","zdravo","dobry den","salaam","bon dia","kaixo","privet" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hei",3,new Integer[] { 2,3 },new String[] { "hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","hej","rimaykullayki","zdravo","dobry den","salaam","bon dia","kaixo","privet" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"ola",3,new Integer[] { 7,2,3 },new String[] { "ola","hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","hej","rimaykullayki","zdravo","dobry den","salaam","bon dia","kaixo","privet" },new Integer[] { 7,2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"rimaykullayki",3,new Integer[] { 7,2,3 },new String[] { "ola","rimaykullayki","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","hej","rimaykullayki","zdravo","dobry den","salaam","bon dia","kaixo","privet" },new Integer[] { 2,7,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"privet",3,new Integer[] { 9,7,2 },new String[] { "privet","ola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","hej","rimaykullayki","zdravo","dobry den","salaam","bon dia","kaixo","privet" },new Integer[] { 9,2,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"namaste",3,new Integer[] { 8,9,2 },new String[] { "namaste","privet","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","hej","rimaykullayki","zdravo","dobry den","salaam","ola","kaixo","privet" },new Integer[] { 8,9,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"ciao",3,new Integer[] { 5,8,9 },new String[] { "ciao","namaste","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","zdravo","dobry den","salaam","ola","kaixo","privet" },new Integer[] { 5,8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"ola",3,new Integer[] { 7,5,8 },new String[] { "ola","ciao","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","zdravo","dobry den","salaam","ola","kaixo","privet" },new Integer[] { 7,5,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"zdravo",3,new Integer[] { 4,7,5 },new String[] { "zdravo","ola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","zdravo","dobry den","salaam","ola","namaste","privet" },new Integer[] { 4,7,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"hej",3,new Integer[] { 4,7,5 },new String[] { "zdravo","hej","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","zdravo","dobry den","salaam","ola","namaste","privet" },new Integer[] { 7,4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hello",3,new Integer[] { 4,7,5 },new String[] { "hello","hej","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","zdravo","dobry den","salaam","ola","namaste","privet" },new Integer[] { 4,7,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"rimaykullayki",3,new Integer[] { 2,4,7 },new String[] { "rimaykullayki","hello","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","zdravo","ciao","salaam","ola","namaste","privet" },new Integer[] { 2,4,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"ciao",3,new Integer[] { 5,2,4 },new String[] { "ciao","rimaykullayki","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","zdravo","ciao","salaam","hej","namaste","privet" },new Integer[] { 5,2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"privet",3,new Integer[] { 5,2,4 },new String[] { "privet","rimaykullayki","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","zdravo","ciao","salaam","hej","namaste","privet" },new Integer[] { 5,2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"dobry den",3,new Integer[] { 8,5,2 },new String[] { "dobry den","privet","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","hello","ciao","salaam","hej","namaste","privet" },new Integer[] { 8,5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hej",3,new Integer[] { 6,8,5 },new String[] { "hej","dobry den","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","hello","ciao","salaam","hej","namaste","privet" },new Integer[] { 6,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"kaixo",3,new Integer[] { 6,8,5 },new String[] { "hej","kaixo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","hello","ciao","salaam","hej","namaste","privet" },new Integer[] { 8,6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"kaixo",3,new Integer[] { 6,8,5 },new String[] { "hej","kaixo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","hello","ciao","salaam","hej","namaste","privet" },new Integer[] { 8,6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"hej",3,new Integer[] { 6,8,5 },new String[] { "hej","kaixo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","hello","ciao","salaam","hej","namaste","privet" },new Integer[] { 6,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"ciao",3,new Integer[] { 7,6,8 },new String[] { "ciao","hej","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","hello","privet","salaam","hej","namaste","privet" },new Integer[] { 7,6,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"ola",3,new Integer[] { 7,6,8 },new String[] { "ciao","hej","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "namaste","rimaykullayki","rimaykullayki","hello","privet","salaam","hej","namaste","privet" },new Integer[] { 8,7,6 }) ;
      return ok_sofar ;
  }


  static boolean test_37 ()
  {
      
      testName = "test_37" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(3,new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","hola","hei","kaixo","salaam","dobry den","hej","hi" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"hi",3,new Integer[] { 9 },new String[] { "hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","hola","hei","kaixo","salaam","dobry den","hej","hi" },new Integer[] { 9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"hej",3,new Integer[] { 8,9 },new String[] { "hej","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","hola","hei","kaixo","salaam","dobry den","hej","hi" },new Integer[] { 8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"dobry den",3,new Integer[] { 7,8,9 },new String[] { "dobry den","hej","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","hola","hei","kaixo","salaam","dobry den","hej","hi" },new Integer[] { 7,8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"kaixo",3,new Integer[] { 7,8,9 },new String[] { "dobry den","hej","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","hola","hei","kaixo","salaam","dobry den","hej","hi" },new Integer[] { 9,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"hej",3,new Integer[] { 7,8,9 },new String[] { "dobry den","hej","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","hola","hei","kaixo","salaam","dobry den","hej","hi" },new Integer[] { 8,9,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hola",3,new Integer[] { 1,8,9 },new String[] { "hola","hej","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","hola","hei","kaixo","salaam","dobry den","hej","hi" },new Integer[] { 1,8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hola",3,new Integer[] { 3,1,8 },new String[] { "hola","hola","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","hola","hei","kaixo","salaam","dobry den","hej","kaixo" },new Integer[] { 3,1,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hej",3,new Integer[] { 6,3,1 },new String[] { "hej","hola","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "ciao","hallo","hola","hei","kaixo","salaam","dobry den","hej","kaixo" },new Integer[] { 6,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hei",3,new Integer[] { 4,6,3 },new String[] { "hei","hej","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hallo","hola","hei","kaixo","salaam","dobry den","hej","kaixo" },new Integer[] { 4,6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hola",3,new Integer[] { 1,4,6 },new String[] { "hola","hei","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hallo","hola","hei","kaixo","salaam","dobry den","hej","kaixo" },new Integer[] { 1,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"kaixo",3,new Integer[] { 9,1,4 },new String[] { "kaixo","hola","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hallo","hola","hei","kaixo","hej","dobry den","hej","kaixo" },new Integer[] { 9,1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hola",3,new Integer[] { 9,1,4 },new String[] { "kaixo","hola","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hallo","hola","hei","kaixo","hej","dobry den","hej","kaixo" },new Integer[] { 1,9,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hej",3,new Integer[] { 6,9,1 },new String[] { "hej","kaixo","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hallo","hola","hei","kaixo","hej","dobry den","hej","kaixo" },new Integer[] { 6,1,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hola",3,new Integer[] { 3,6,1 },new String[] { "hola","hej","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hallo","hola","hei","kaixo","hej","dobry den","hej","kaixo" },new Integer[] { 3,6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"hej",3,new Integer[] { 8,3,6 },new String[] { "hej","hola","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hallo","hola","hei","kaixo","hej","dobry den","hej","kaixo" },new Integer[] { 8,3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"ola",3,new Integer[] { 2,8,3 },new String[] { "ola","hej","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hallo","hola","hei","kaixo","hej","dobry den","hej","kaixo" },new Integer[] { 2,8,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hello",3,new Integer[] { 2,8,3 },new String[] { "hello","hej","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hallo","hola","hei","kaixo","hej","dobry den","hej","kaixo" },new Integer[] { 2,8,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hej",3,new Integer[] { 1,2,8 },new String[] { "hej","hello","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hallo","hola","hei","kaixo","hej","dobry den","hej","kaixo" },new Integer[] { 1,2,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"kaixo",3,new Integer[] { 5,1,2 },new String[] { "kaixo","hej","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hallo","hola","hei","kaixo","hej","dobry den","hej","kaixo" },new Integer[] { 5,1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"dobry den",3,new Integer[] { 7,5,1 },new String[] { "dobry den","kaixo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hello","hola","hei","kaixo","hej","dobry den","hej","kaixo" },new Integer[] { 7,5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"hallo",3,new Integer[] { 7,5,1 },new String[] { "hallo","kaixo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9 },new String[] { "hola","hello","hola","hei","kaixo","hej","dobry den","hej","kaixo" },new Integer[] { 7,5,1 }) ;
      return ok_sofar ;
  }


  static boolean test_38 ()
  {
      
      testName = "test_38" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","salaam","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(13,"rimaykullayki",5,new Integer[] { 13 },new String[] { "rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","salaam","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" },new Integer[] { 13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"bon dia",5,new Integer[] { 10,13 },new String[] { "bon dia","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","salaam","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" },new Integer[] { 10,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hello",5,new Integer[] { 2,10,13 },new String[] { "hello","bon dia","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","salaam","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" },new Integer[] { 2,10,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"bon dia",5,new Integer[] { 4,2,10,13 },new String[] { "bon dia","hello","bon dia","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","salaam","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" },new Integer[] { 4,2,10,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"dobry den",5,new Integer[] { 8,4,2,10,13 },new String[] { "dobry den","bon dia","hello","bon dia","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","salaam","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" },new Integer[] { 8,4,2,10,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"bon dia",5,new Integer[] { 8,4,2,10,13 },new String[] { "dobry den","bon dia","hello","bon dia","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","salaam","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" },new Integer[] { 4,8,2,10,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"kaixo",5,new Integer[] { 15,8,4,2,10 },new String[] { "kaixo","dobry den","bon dia","hello","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","salaam","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" },new Integer[] { 15,4,8,2,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hello",5,new Integer[] { 15,8,4,2,10 },new String[] { "kaixo","dobry den","bon dia","hello","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","salaam","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" },new Integer[] { 2,15,4,8,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"bon dia",5,new Integer[] { 15,8,4,2,10 },new String[] { "kaixo","bon dia","bon dia","hello","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","salaam","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" },new Integer[] { 8,2,15,4,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"bon dia",5,new Integer[] { 15,8,4,2,10 },new String[] { "kaixo","bon dia","bon dia","hello","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","salaam","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" },new Integer[] { 8,2,15,4,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"kaixo",5,new Integer[] { 9,15,8,4,2 },new String[] { "kaixo","kaixo","bon dia","bon dia","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","salaam","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" },new Integer[] { 9,8,2,15,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hallo",5,new Integer[] { 11,9,15,8,2 },new String[] { "hallo","kaixo","kaixo","bon dia","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","privet" },new Integer[] { 11,9,8,2,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(14,"bon dia",5,new Integer[] { 14,11,9,8,2 },new String[] { "bon dia","hallo","kaixo","bon dia","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","kaixo" },new Integer[] { 14,11,9,8,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"kaixo",5,new Integer[] { 5,14,11,9,8 },new String[] { "kaixo","bon dia","hallo","kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","kaixo" },new Integer[] { 5,14,11,9,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"bon dia",5,new Integer[] { 5,14,11,9,8 },new String[] { "kaixo","bon dia","hallo","kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","kaixo" },new Integer[] { 8,5,14,11,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hei",5,new Integer[] { 3,5,14,11,8 },new String[] { "hei","kaixo","bon dia","hallo","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","kaixo" },new Integer[] { 3,8,5,14,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"kaixo",5,new Integer[] { 15,3,5,14,8 },new String[] { "kaixo","hei","kaixo","bon dia","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","ola","kaixo" },new Integer[] { 15,3,8,5,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hallo",5,new Integer[] { 11,15,3,5,8 },new String[] { "hallo","kaixo","hei","kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","bon dia","kaixo" },new Integer[] { 11,15,3,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hallo",5,new Integer[] { 11,15,3,5,8 },new String[] { "hallo","kaixo","hei","kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","hej","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","bon dia","kaixo" },new Integer[] { 11,15,3,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"namaste",5,new Integer[] { 12,11,15,3,8 },new String[] { "namaste","hallo","kaixo","hei","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","kaixo","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","bon dia","kaixo" },new Integer[] { 12,11,15,3,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"namaste",5,new Integer[] { 12,11,15,3,8 },new String[] { "namaste","hallo","namaste","hei","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","kaixo","namaste","hei","dobry den","kaixo","bon dia","hallo","hola","rimaykullayki","bon dia","kaixo" },new Integer[] { 15,12,11,3,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"rimaykullayki",5,new Integer[] { 10,12,11,15,3 },new String[] { "rimaykullayki","namaste","hallo","namaste","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","kaixo","namaste","hei","bon dia","kaixo","bon dia","hallo","hola","rimaykullayki","bon dia","kaixo" },new Integer[] { 10,15,12,11,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hi",5,new Integer[] { 10,12,11,15,3 },new String[] { "rimaykullayki","namaste","hallo","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","kaixo","namaste","hei","bon dia","kaixo","bon dia","hallo","hola","rimaykullayki","bon dia","kaixo" },new Integer[] { 3,10,15,12,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"ciao",5,new Integer[] { 1,10,12,15,3 },new String[] { "ciao","rimaykullayki","namaste","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","kaixo","namaste","hei","bon dia","kaixo","bon dia","hallo","hola","rimaykullayki","bon dia","kaixo" },new Integer[] { 1,3,10,15,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(14,"bon dia",5,new Integer[] { 14,1,10,15,3 },new String[] { "bon dia","ciao","rimaykullayki","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ciao","hello","zdravo","bon dia","kaixo","namaste","hei","bon dia","kaixo","bon dia","hallo","namaste","rimaykullayki","bon dia","kaixo" },new Integer[] { 14,1,3,10,15 }) ;
      return ok_sofar ;
  }


  static boolean test_39 ()
  {
      
      testName = "test_39" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","hola","ola","rimaykullayki","privet","kaixo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"privet",2,new Integer[] { 5 },new String[] { "privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","hola","ola","rimaykullayki","privet","kaixo" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"bon dia",2,new Integer[] { 4,5 },new String[] { "bon dia","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","hola","ola","rimaykullayki","privet","kaixo" },new Integer[] { 4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"kaixo",2,new Integer[] { 6,4 },new String[] { "kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","hola","ola","rimaykullayki","privet","kaixo" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ola",2,new Integer[] { 3,6 },new String[] { "ola","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","hola","ola","bon dia","privet","kaixo" },new Integer[] { 3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"privet",2,new Integer[] { 3,6 },new String[] { "ola","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","hola","ola","bon dia","privet","kaixo" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"dobry den",2,new Integer[] { 2,6 },new String[] { "dobry den","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","hola","ola","bon dia","privet","kaixo" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"privet",2,new Integer[] { 5,2 },new String[] { "privet","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","hola","ola","bon dia","privet","privet" },new Integer[] { 5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"bon dia",2,new Integer[] { 4,5 },new String[] { "bon dia","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","ola","bon dia","privet","privet" },new Integer[] { 4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"namaste",2,new Integer[] { 3,4 },new String[] { "namaste","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","ola","bon dia","privet","privet" },new Integer[] { 3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"namaste",2,new Integer[] { 3,4 },new String[] { "namaste","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","ola","bon dia","privet","privet" },new Integer[] { 3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"kaixo",2,new Integer[] { 5,3 },new String[] { "kaixo","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","ola","bon dia","privet","privet" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"namaste",2,new Integer[] { 5,3 },new String[] { "kaixo","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","ola","bon dia","privet","privet" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"namaste",2,new Integer[] { 5,3 },new String[] { "kaixo","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","ola","bon dia","privet","privet" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"dobry den",2,new Integer[] { 2,3 },new String[] { "dobry den","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","ola","bon dia","kaixo","privet" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"kaixo",2,new Integer[] { 5,2 },new String[] { "kaixo","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","namaste","bon dia","kaixo","privet" },new Integer[] { 5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hi",2,new Integer[] { 6,5 },new String[] { "hi","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","namaste","bon dia","kaixo","privet" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"hi",2,new Integer[] { 6,5 },new String[] { "hi","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","namaste","bon dia","kaixo","privet" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"dobry den",2,new Integer[] { 2,6 },new String[] { "dobry den","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","namaste","bon dia","kaixo","privet" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"bon dia",2,new Integer[] { 1,2 },new String[] { "bon dia","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","namaste","bon dia","kaixo","hi" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hola",2,new Integer[] { 6,1 },new String[] { "hola","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "zdravo","dobry den","namaste","bon dia","kaixo","hi" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"zdravo",2,new Integer[] { 4,6 },new String[] { "zdravo","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","dobry den","namaste","bon dia","kaixo","hi" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"kaixo",2,new Integer[] { 5,4 },new String[] { "kaixo","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","dobry den","namaste","bon dia","kaixo","hola" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"namaste",2,new Integer[] { 2,5 },new String[] { "namaste","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","dobry den","namaste","zdravo","kaixo","hola" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hi",2,new Integer[] { 4,2 },new String[] { "hi","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","dobry den","namaste","zdravo","kaixo","hola" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"ola",2,new Integer[] { 6,4 },new String[] { "ola","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","namaste","namaste","zdravo","kaixo","hola" },new Integer[] { 6,4 }) ;
      return ok_sofar ;
  }


  static boolean test_40 ()
  {
      
      testName = "test_40" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","ciao","kaixo","ola","salaam","hallo","dobry den","hei","namaste" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"zdravo",4,new Integer[] { 4 },new String[] { "zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","ciao","kaixo","ola","salaam","hallo","dobry den","hei","namaste" },new Integer[] { 4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hei",4,new Integer[] { 5,4 },new String[] { "hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","ciao","kaixo","ola","salaam","hallo","dobry den","hei","namaste" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"hello",4,new Integer[] { 12,5,4 },new String[] { "hello","hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","ciao","kaixo","ola","salaam","hallo","dobry den","hei","namaste" },new Integer[] { 12,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hei",4,new Integer[] { 11,12,5,4 },new String[] { "hei","hello","hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","ciao","kaixo","ola","salaam","hallo","dobry den","hei","namaste" },new Integer[] { 11,12,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"dobry den",4,new Integer[] { 10,11,12,5 },new String[] { "dobry den","hei","hello","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","ciao","kaixo","ola","salaam","hallo","dobry den","hei","namaste" },new Integer[] { 10,11,12,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hei",4,new Integer[] { 10,11,12,5 },new String[] { "dobry den","hei","hello","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","ciao","kaixo","ola","salaam","hallo","dobry den","hei","namaste" },new Integer[] { 11,10,12,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"bon dia",4,new Integer[] { 3,10,11,12 },new String[] { "bon dia","dobry den","hei","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","hei","kaixo","ola","salaam","hallo","dobry den","hei","namaste" },new Integer[] { 3,11,10,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"ola",4,new Integer[] { 7,3,10,11 },new String[] { "ola","bon dia","dobry den","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","hei","kaixo","ola","salaam","hallo","dobry den","hei","hello" },new Integer[] { 7,3,11,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"kaixo",4,new Integer[] { 6,7,3,11 },new String[] { "kaixo","ola","bon dia","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","hei","kaixo","ola","salaam","hallo","dobry den","hei","hello" },new Integer[] { 6,7,3,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"privet",4,new Integer[] { 9,6,7,3 },new String[] { "privet","kaixo","ola","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","hei","kaixo","ola","salaam","hallo","dobry den","hei","hello" },new Integer[] { 9,6,7,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"hello",4,new Integer[] { 12,9,6,7 },new String[] { "hello","privet","kaixo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","hei","kaixo","ola","salaam","hallo","dobry den","hei","hello" },new Integer[] { 12,9,6,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hello",4,new Integer[] { 3,12,9,6 },new String[] { "hello","hello","privet","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","hei","kaixo","ola","salaam","hallo","dobry den","hei","hello" },new Integer[] { 3,12,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"dobry den",4,new Integer[] { 10,3,12,9 },new String[] { "dobry den","hello","hello","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","hei","kaixo","ola","salaam","hallo","dobry den","hei","hello" },new Integer[] { 10,3,12,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"ola",4,new Integer[] { 1,10,3,12 },new String[] { "ola","dobry den","hello","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","hei","kaixo","ola","salaam","privet","dobry den","hei","hello" },new Integer[] { 1,10,3,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"salaam",4,new Integer[] { 8,1,10,3 },new String[] { "salaam","ola","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","hei","kaixo","ola","salaam","privet","dobry den","hei","hello" },new Integer[] { 8,1,10,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"dobry den",4,new Integer[] { 8,1,10,3 },new String[] { "salaam","ola","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","hei","kaixo","ola","salaam","privet","dobry den","hei","hello" },new Integer[] { 10,8,1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"salaam",4,new Integer[] { 8,1,10,3 },new String[] { "salaam","ola","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","bon dia","zdravo","hei","kaixo","ola","salaam","privet","dobry den","hei","hello" },new Integer[] { 8,10,1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"hei",4,new Integer[] { 7,8,1,10 },new String[] { "hei","salaam","ola","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","hello","zdravo","hei","kaixo","ola","salaam","privet","dobry den","hei","hello" },new Integer[] { 7,8,10,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"namaste",4,new Integer[] { 7,8,1,10 },new String[] { "hei","salaam","ola","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hola","hi","hello","zdravo","hei","kaixo","ola","salaam","privet","dobry den","hei","hello" },new Integer[] { 10,7,8,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hei",4,new Integer[] { 11,7,8,10 },new String[] { "hei","hei","salaam","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ola","hi","hello","zdravo","hei","kaixo","ola","salaam","privet","dobry den","hei","hello" },new Integer[] { 11,10,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"zdravo",4,new Integer[] { 4,11,7,10 },new String[] { "zdravo","hei","hei","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ola","hi","hello","zdravo","hei","kaixo","ola","salaam","privet","dobry den","hei","hello" },new Integer[] { 4,11,10,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"bon dia",4,new Integer[] { 1,4,11,10 },new String[] { "bon dia","zdravo","hei","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ola","hi","hello","zdravo","hei","kaixo","hei","salaam","privet","dobry den","hei","hello" },new Integer[] { 1,4,11,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"hello",4,new Integer[] { 12,1,4,11 },new String[] { "hello","bon dia","zdravo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ola","hi","hello","zdravo","hei","kaixo","hei","salaam","privet","namaste","hei","hello" },new Integer[] { 12,1,4,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hallo",4,new Integer[] { 12,1,4,11 },new String[] { "hello","hallo","zdravo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ola","hi","hello","zdravo","hei","kaixo","hei","salaam","privet","namaste","hei","hello" },new Integer[] { 1,12,4,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hallo",4,new Integer[] { 5,12,1,4 },new String[] { "hallo","hello","hallo","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ola","hi","hello","zdravo","hei","kaixo","hei","salaam","privet","namaste","hei","hello" },new Integer[] { 5,1,12,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"bon dia",4,new Integer[] { 6,5,12,1 },new String[] { "bon dia","hallo","hello","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "ola","hi","hello","zdravo","hei","kaixo","hei","salaam","privet","namaste","hei","hello" },new Integer[] { 6,5,1,12 }) ;
      return ok_sofar ;
  }


  static boolean test_41 ()
  {
      
      testName = "test_41" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","privet","dobry den","hallo","ciao" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"salaam",2,new Integer[] { 2 },new String[] { "salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","privet","dobry den","hallo","ciao" },new Integer[] { 2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"ciao",2,new Integer[] { 6,2 },new String[] { "ciao","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","privet","dobry den","hallo","ciao" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hej",2,new Integer[] { 3,6 },new String[] { "hej","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","privet","dobry den","hallo","ciao" },new Integer[] { 3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hallo",2,new Integer[] { 5,3 },new String[] { "hallo","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","privet","dobry den","hallo","ciao" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hallo",2,new Integer[] { 4,5 },new String[] { "hallo","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hej","dobry den","hallo","ciao" },new Integer[] { 4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"kaixo",2,new Integer[] { 4,5 },new String[] { "hallo","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hej","dobry den","hallo","ciao" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hi",2,new Integer[] { 1,5 },new String[] { "hi","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hej","hallo","hallo","ciao" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"kaixo",2,new Integer[] { 1,5 },new String[] { "hi","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hej","hallo","hallo","ciao" },new Integer[] { 5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hej",2,new Integer[] { 3,5 },new String[] { "hej","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hej","hallo","hallo","ciao" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hi",2,new Integer[] { 1,3 },new String[] { "hi","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hej","hallo","kaixo","ciao" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hello",2,new Integer[] { 1,3 },new String[] { "hi","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hej","hallo","kaixo","ciao" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"salaam",2,new Integer[] { 2,3 },new String[] { "salaam","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hej","hallo","kaixo","ciao" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"kaixo",2,new Integer[] { 5,2 },new String[] { "kaixo","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","kaixo","ciao" },new Integer[] { 5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hej",2,new Integer[] { 5,2 },new String[] { "hej","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","kaixo","ciao" },new Integer[] { 5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hi",2,new Integer[] { 1,5 },new String[] { "hi","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","kaixo","ciao" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hello",2,new Integer[] { 3,1 },new String[] { "hello","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","hej","ciao" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"salaam",2,new Integer[] { 5,3 },new String[] { "salaam","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","hej","ciao" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"salaam",2,new Integer[] { 2,5 },new String[] { "salaam","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","hej","ciao" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"ciao",2,new Integer[] { 6,2 },new String[] { "ciao","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","salaam","ciao" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hei",2,new Integer[] { 5,6 },new String[] { "hei","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","salaam","ciao" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hello",2,new Integer[] { 3,5 },new String[] { "hello","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","salaam","ciao" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hello",2,new Integer[] { 3,5 },new String[] { "hello","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","salaam","ciao" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"ola",2,new Integer[] { 2,3 },new String[] { "ola","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","hei","ciao" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hallo",2,new Integer[] { 4,2 },new String[] { "hallo","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","hei","ciao" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"ola",2,new Integer[] { 4,2 },new String[] { "hallo","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","hei","ciao" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hola",2,new Integer[] { 1,2 },new String[] { "hola","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hi","salaam","hello","hallo","hei","ciao" },new Integer[] { 1,2 }) ;
      return ok_sofar ;
  }


  static boolean test_42 ()
  {
      
      testName = "test_42" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"bon dia",4,new Integer[] { 8 },new String[] { "bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"hi",4,new Integer[] { 7,8 },new String[] { "hi","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hallo",4,new Integer[] { 5,7,8 },new String[] { "hallo","hi","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 5,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"kaixo",4,new Integer[] { 6,5,7,8 },new String[] { "kaixo","hallo","hi","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 6,5,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hallo",4,new Integer[] { 6,5,7,8 },new String[] { "kaixo","hallo","hi","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 5,6,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hello",4,new Integer[] { 2,6,5,7 },new String[] { "hello","kaixo","hallo","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 2,5,6,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"privet",4,new Integer[] { 8,2,6,5 },new String[] { "privet","hello","kaixo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 8,2,5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"namaste",4,new Integer[] { 8,2,6,5 },new String[] { "privet","namaste","kaixo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 2,8,5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"namaste",4,new Integer[] { 9,8,2,5 },new String[] { "namaste","privet","namaste","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 9,2,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"namaste",4,new Integer[] { 9,8,2,5 },new String[] { "namaste","privet","namaste","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 2,9,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"namaste",4,new Integer[] { 9,8,2,5 },new String[] { "namaste","privet","namaste","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 9,2,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hei",4,new Integer[] { 9,8,2,5 },new String[] { "namaste","privet","hei","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","ola","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 2,9,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hello",4,new Integer[] { 4,9,8,2 },new String[] { "hello","namaste","privet","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","hallo","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 4,2,9,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hello",4,new Integer[] { 4,9,8,2 },new String[] { "hello","namaste","privet","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","hallo","kaixo","hi","bon dia","namaste","zdravo","hej","ciao" },new Integer[] { 4,2,9,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"rimaykullayki",4,new Integer[] { 3,4,9,2 },new String[] { "rimaykullayki","hello","namaste","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","hallo","kaixo","hi","privet","namaste","zdravo","hej","ciao" },new Integer[] { 3,4,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"hej",4,new Integer[] { 3,4,9,2 },new String[] { "rimaykullayki","hello","hej","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hello","rimaykullayki","hallo","hallo","kaixo","hi","privet","namaste","zdravo","hej","ciao" },new Integer[] { 9,3,4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"ola",4,new Integer[] { 8,3,4,9 },new String[] { "ola","rimaykullayki","hello","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hei","rimaykullayki","hallo","hallo","kaixo","hi","privet","namaste","zdravo","hej","ciao" },new Integer[] { 8,9,3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"rimaykullayki",4,new Integer[] { 1,8,3,9 },new String[] { "rimaykullayki","ola","rimaykullayki","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hei","rimaykullayki","hello","hallo","kaixo","hi","privet","namaste","zdravo","hej","ciao" },new Integer[] { 1,8,9,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"hi",4,new Integer[] { 7,1,8,9 },new String[] { "hi","rimaykullayki","ola","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hei","rimaykullayki","hello","hallo","kaixo","hi","privet","namaste","zdravo","hej","ciao" },new Integer[] { 7,1,8,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hello",4,new Integer[] { 4,7,1,8 },new String[] { "hello","hi","rimaykullayki","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hei","rimaykullayki","hello","hallo","kaixo","hi","privet","hej","zdravo","hej","ciao" },new Integer[] { 4,7,1,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"hej",4,new Integer[] { 9,4,7,1 },new String[] { "hej","hello","hi","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hei","rimaykullayki","hello","hallo","kaixo","hi","ola","hej","zdravo","hej","ciao" },new Integer[] { 9,4,7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hola",4,new Integer[] { 9,4,7,1 },new String[] { "hej","hola","hi","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "dobry den","hei","rimaykullayki","hello","hallo","kaixo","hi","ola","hej","zdravo","hej","ciao" },new Integer[] { 4,9,7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hallo",4,new Integer[] { 5,9,4,7 },new String[] { "hallo","hej","hola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hei","rimaykullayki","hello","hallo","kaixo","hi","ola","hej","zdravo","hej","ciao" },new Integer[] { 5,4,9,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"ola",4,new Integer[] { 8,5,9,4 },new String[] { "ola","hallo","hej","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hei","rimaykullayki","hello","hallo","kaixo","hi","ola","hej","zdravo","hej","ciao" },new Integer[] { 8,5,4,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hej",4,new Integer[] { 3,8,5,4 },new String[] { "hej","ola","hallo","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hei","rimaykullayki","hello","hallo","kaixo","hi","ola","hej","zdravo","hej","ciao" },new Integer[] { 3,8,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"zdravo",4,new Integer[] { 9,3,8,5 },new String[] { "zdravo","hej","ola","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hei","rimaykullayki","hola","hallo","kaixo","hi","ola","hej","zdravo","hej","ciao" },new Integer[] { 9,3,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"ciao",4,new Integer[] { 2,9,3,8 },new String[] { "ciao","zdravo","hej","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hei","rimaykullayki","hola","hallo","kaixo","hi","ola","hej","zdravo","hej","ciao" },new Integer[] { 2,9,3,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"zdravo",4,new Integer[] { 2,9,3,8 },new String[] { "ciao","zdravo","hej","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "rimaykullayki","hei","rimaykullayki","hola","hallo","kaixo","hi","ola","hej","zdravo","hej","ciao" },new Integer[] { 9,2,3,8 }) ;
      return ok_sofar ;
  }


  static boolean test_43 ()
  {
      
      testName = "test_43" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hi","privet","rimaykullayki","hei","hej" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hallo",2,new Integer[] { 1 },new String[] { "hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hi","privet","rimaykullayki","hei","hej" },new Integer[] { 1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hei",2,new Integer[] { 2,1 },new String[] { "hei","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hi","privet","rimaykullayki","hei","hej" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hello",2,new Integer[] { 4,2 },new String[] { "hello","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hi","privet","rimaykullayki","hei","hej" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hei",2,new Integer[] { 5,4 },new String[] { "hei","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","privet","rimaykullayki","hei","hej" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"namaste",2,new Integer[] { 1,5 },new String[] { "namaste","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","privet","hello","hei","hej" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"ciao",2,new Integer[] { 6,1 },new String[] { "ciao","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","privet","hello","hei","hej" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"zdravo",2,new Integer[] { 6,1 },new String[] { "zdravo","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","privet","hello","hei","hej" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hei",2,new Integer[] { 5,6 },new String[] { "hei","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","privet","hello","hei","hej" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hei",2,new Integer[] { 2,5 },new String[] { "hei","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","privet","hello","hei","zdravo" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"ola",2,new Integer[] { 3,2 },new String[] { "ola","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","privet","hello","hei","zdravo" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ola",2,new Integer[] { 3,2 },new String[] { "ola","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","privet","hello","hei","zdravo" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hallo",2,new Integer[] { 3,2 },new String[] { "hallo","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","privet","hello","hei","zdravo" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"zdravo",2,new Integer[] { 6,3 },new String[] { "zdravo","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","privet","hello","hei","zdravo" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hallo",2,new Integer[] { 6,3 },new String[] { "hallo","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","privet","hello","hei","zdravo" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hi",2,new Integer[] { 6,3 },new String[] { "hallo","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","privet","hello","hei","zdravo" },new Integer[] { 3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hello",2,new Integer[] { 5,3 },new String[] { "hello","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","privet","hello","hei","hallo" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hello",2,new Integer[] { 4,5 },new String[] { "hello","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","hello","hei","hallo" },new Integer[] { 4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"namaste",2,new Integer[] { 1,4 },new String[] { "namaste","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","hello","hello","hallo" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hei",2,new Integer[] { 2,1 },new String[] { "hei","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","hello","hello","hallo" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hi",2,new Integer[] { 3,2 },new String[] { "hi","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","hello","hello","hallo" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hello",2,new Integer[] { 4,3 },new String[] { "hello","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","hello","hello","hallo" },new Integer[] { 4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"hallo",2,new Integer[] { 6,4 },new String[] { "hallo","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","hello","hello","hallo" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hello",2,new Integer[] { 6,4 },new String[] { "hallo","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","hello","hello","hallo" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"hallo",2,new Integer[] { 6,4 },new String[] { "hallo","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","hello","hello","hallo" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hallo",2,new Integer[] { 6,4 },new String[] { "hallo","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","hello","hello","hallo" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"salaam",2,new Integer[] { 6,4 },new String[] { "hallo","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","hello","hello","hallo" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hei",2,new Integer[] { 2,4 },new String[] { "hei","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","hello","hello","hallo" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hi",2,new Integer[] { 3,2 },new String[] { "hi","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","salaam","hello","hallo" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hi",2,new Integer[] { 3,2 },new String[] { "hi","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","salaam","hello","hallo" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"hallo",2,new Integer[] { 6,3 },new String[] { "hallo","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","salaam","hello","hallo" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"salaam",2,new Integer[] { 4,6 },new String[] { "salaam","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "namaste","hei","hi","salaam","hello","hallo" },new Integer[] { 4,6 }) ;
      return ok_sofar ;
  }


  static boolean test_44 ()
  {
      
      testName = "test_44" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","zdravo","hallo","hello","privet" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"privet",2,new Integer[] { 6 },new String[] { "privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","zdravo","hallo","hello","privet" },new Integer[] { 6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"rimaykullayki",2,new Integer[] { 2,6 },new String[] { "rimaykullayki","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","zdravo","hallo","hello","privet" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hej",2,new Integer[] { 2,6 },new String[] { "hej","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","zdravo","hallo","hello","privet" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hej",2,new Integer[] { 2,6 },new String[] { "hej","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","zdravo","hallo","hello","privet" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"ciao",2,new Integer[] { 2,6 },new String[] { "ciao","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","zdravo","hallo","hello","privet" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"salaam",2,new Integer[] { 1,2 },new String[] { "salaam","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","zdravo","hallo","hello","privet" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"zdravo",2,new Integer[] { 4,1 },new String[] { "zdravo","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","ciao","zdravo","hallo","hello","privet" },new Integer[] { 4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"privet",2,new Integer[] { 6,4 },new String[] { "privet","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","zdravo","hallo","hello","privet" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hei",2,new Integer[] { 1,6 },new String[] { "hei","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","zdravo","zdravo","hello","privet" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"privet",2,new Integer[] { 1,6 },new String[] { "hei","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","zdravo","zdravo","hello","privet" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"zdravo",2,new Integer[] { 3,6 },new String[] { "zdravo","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","ciao","zdravo","zdravo","hello","privet" },new Integer[] { 3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"salaam",2,new Integer[] { 1,3 },new String[] { "salaam","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","ciao","zdravo","zdravo","hello","privet" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"salaam",2,new Integer[] { 1,3 },new String[] { "salaam","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","ciao","zdravo","zdravo","hello","privet" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"salaam",2,new Integer[] { 1,3 },new String[] { "salaam","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","ciao","zdravo","zdravo","hello","privet" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hi",2,new Integer[] { 1,3 },new String[] { "salaam","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","ciao","zdravo","zdravo","hello","privet" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"zdravo",2,new Integer[] { 4,3 },new String[] { "zdravo","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","zdravo","zdravo","hello","privet" },new Integer[] { 4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hola",2,new Integer[] { 5,4 },new String[] { "hola","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hi","zdravo","hello","privet" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"ciao",2,new Integer[] { 2,5 },new String[] { "ciao","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hi","zdravo","hello","privet" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"salaam",2,new Integer[] { 1,2 },new String[] { "salaam","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hi","zdravo","hola","privet" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"bon dia",2,new Integer[] { 5,1 },new String[] { "bon dia","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hi","zdravo","hola","privet" },new Integer[] { 5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"bon dia",2,new Integer[] { 6,5 },new String[] { "bon dia","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hi","zdravo","hola","privet" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"bon dia",2,new Integer[] { 6,5 },new String[] { "bon dia","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hi","zdravo","hola","privet" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"kaixo",2,new Integer[] { 1,5 },new String[] { "kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hi","zdravo","hola","bon dia" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hola",2,new Integer[] { 3,1 },new String[] { "hola","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "salaam","ciao","hi","zdravo","bon dia","bon dia" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"bon dia",2,new Integer[] { 5,3 },new String[] { "bon dia","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","ciao","hi","zdravo","bon dia","bon dia" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"ciao",2,new Integer[] { 2,5 },new String[] { "ciao","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","ciao","hola","zdravo","bon dia","bon dia" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"bon dia",2,new Integer[] { 6,2 },new String[] { "bon dia","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","ciao","hola","zdravo","bon dia","bon dia" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"ciao",2,new Integer[] { 6,2 },new String[] { "bon dia","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","ciao","hola","zdravo","bon dia","bon dia" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"bon dia",2,new Integer[] { 6,2 },new String[] { "bon dia","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","ciao","hola","zdravo","bon dia","bon dia" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hallo",2,new Integer[] { 3,6 },new String[] { "hallo","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","ciao","hola","zdravo","bon dia","bon dia" },new Integer[] { 3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hei",2,new Integer[] { 5,3 },new String[] { "hei","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","ciao","hola","zdravo","bon dia","bon dia" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"ciao",2,new Integer[] { 2,5 },new String[] { "ciao","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","ciao","hallo","zdravo","bon dia","bon dia" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hei",2,new Integer[] { 2,5 },new String[] { "ciao","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","ciao","hallo","zdravo","bon dia","bon dia" },new Integer[] { 5,2 }) ;
      return ok_sofar ;
  }


  static boolean test_45 ()
  {
      
      testName = "test_45" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","bon dia" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"hi",4,new Integer[] { 8 },new String[] { "hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","bon dia" },new Integer[] { 8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"namaste",4,new Integer[] { 7,8 },new String[] { "namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","bon dia" },new Integer[] { 7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hallo",4,new Integer[] { 10,7,8 },new String[] { "hallo","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","bon dia" },new Integer[] { 10,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"rimaykullayki",4,new Integer[] { 4,10,7,8 },new String[] { "rimaykullayki","hallo","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","bon dia" },new Integer[] { 4,10,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hallo",4,new Integer[] { 4,10,7,8 },new String[] { "rimaykullayki","hallo","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","bon dia" },new Integer[] { 10,4,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hallo",4,new Integer[] { 4,10,7,8 },new String[] { "rimaykullayki","hallo","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","bon dia" },new Integer[] { 10,4,7,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"privet",4,new Integer[] { 12,4,10,7 },new String[] { "privet","rimaykullayki","hallo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","bon dia" },new Integer[] { 12,10,4,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"hello",4,new Integer[] { 9,12,4,10 },new String[] { "hello","privet","rimaykullayki","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","bon dia" },new Integer[] { 9,12,10,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"privet",4,new Integer[] { 9,12,4,10 },new String[] { "hello","privet","privet","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","bon dia" },new Integer[] { 4,9,12,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"privet",4,new Integer[] { 3,9,12,4 },new String[] { "privet","hello","privet","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","bon dia" },new Integer[] { 3,4,9,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"kaixo",4,new Integer[] { 10,3,9,4 },new String[] { "kaixo","privet","hello","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","privet" },new Integer[] { 10,3,4,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"namaste",4,new Integer[] { 12,10,3,4 },new String[] { "namaste","kaixo","privet","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","rimaykullayki","kaixo","hola","namaste","hi","hello","hallo","hej","privet" },new Integer[] { 12,10,3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"hola",4,new Integer[] { 6,12,10,3 },new String[] { "hola","namaste","kaixo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","privet","kaixo","hola","namaste","hi","hello","hallo","hej","privet" },new Integer[] { 6,12,10,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hello",4,new Integer[] { 1,6,12,10 },new String[] { "hello","hola","namaste","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","privet","kaixo","hola","namaste","hi","hello","hallo","hej","privet" },new Integer[] { 1,6,12,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"hello",4,new Integer[] { 7,1,6,12 },new String[] { "hello","hello","hola","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","privet","kaixo","hola","namaste","hi","hello","kaixo","hej","privet" },new Integer[] { 7,1,6,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"hi",4,new Integer[] { 8,7,1,6 },new String[] { "hi","hello","hello","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","privet","kaixo","hola","namaste","hi","hello","kaixo","hej","namaste" },new Integer[] { 8,7,1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"kaixo",4,new Integer[] { 10,8,7,1 },new String[] { "kaixo","hi","hello","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","privet","kaixo","hola","namaste","hi","hello","kaixo","hej","namaste" },new Integer[] { 10,8,7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"privet",4,new Integer[] { 10,8,7,1 },new String[] { "kaixo","hi","privet","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "salaam","ola","privet","privet","kaixo","hola","namaste","hi","hello","kaixo","hej","namaste" },new Integer[] { 7,10,8,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"namaste",4,new Integer[] { 12,10,8,7 },new String[] { "namaste","kaixo","hi","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","privet","privet","kaixo","hola","namaste","hi","hello","kaixo","hej","namaste" },new Integer[] { 12,7,10,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"bon dia",4,new Integer[] { 9,12,10,7 },new String[] { "bon dia","namaste","kaixo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","privet","privet","kaixo","hola","namaste","hi","hello","kaixo","hej","namaste" },new Integer[] { 9,12,7,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hej",4,new Integer[] { 11,9,12,7 },new String[] { "hej","bon dia","namaste","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","privet","privet","kaixo","hola","namaste","hi","hello","kaixo","hej","namaste" },new Integer[] { 11,9,12,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hello",4,new Integer[] { 3,11,9,12 },new String[] { "hello","hej","bon dia","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","privet","privet","kaixo","hola","privet","hi","hello","kaixo","hej","namaste" },new Integer[] { 3,11,9,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"kaixo",4,new Integer[] { 10,3,11,9 },new String[] { "kaixo","hello","hej","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","privet","privet","kaixo","hola","privet","hi","hello","kaixo","hej","namaste" },new Integer[] { 10,3,11,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"privet",4,new Integer[] { 7,10,3,11 },new String[] { "privet","kaixo","hello","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","privet","privet","kaixo","hola","privet","hi","bon dia","kaixo","hej","namaste" },new Integer[] { 7,10,3,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"namaste",4,new Integer[] { 7,10,3,11 },new String[] { "privet","kaixo","hello","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","privet","privet","kaixo","hola","privet","hi","bon dia","kaixo","hej","namaste" },new Integer[] { 11,7,10,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"salaam",4,new Integer[] { 8,7,10,11 },new String[] { "salaam","privet","kaixo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","hello","privet","kaixo","hola","privet","hi","bon dia","kaixo","hej","namaste" },new Integer[] { 8,11,7,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"privet",4,new Integer[] { 4,8,7,11 },new String[] { "privet","salaam","privet","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","hello","privet","kaixo","hola","privet","hi","bon dia","kaixo","hej","namaste" },new Integer[] { 4,8,11,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"namaste",4,new Integer[] { 4,8,7,11 },new String[] { "privet","salaam","privet","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","hello","privet","kaixo","hola","privet","hi","bon dia","kaixo","hej","namaste" },new Integer[] { 11,4,8,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"kaixo",4,new Integer[] { 5,4,8,11 },new String[] { "kaixo","privet","salaam","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","hello","privet","kaixo","hola","privet","hi","bon dia","kaixo","hej","namaste" },new Integer[] { 5,11,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"kaixo",4,new Integer[] { 5,4,8,11 },new String[] { "kaixo","privet","salaam","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","hello","privet","kaixo","hola","privet","hi","bon dia","kaixo","hej","namaste" },new Integer[] { 5,11,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hello",4,new Integer[] { 3,5,4,11 },new String[] { "hello","kaixo","privet","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","hello","privet","kaixo","hola","privet","salaam","bon dia","kaixo","hej","namaste" },new Integer[] { 3,5,11,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"hello",4,new Integer[] { 10,3,5,11 },new String[] { "hello","hello","kaixo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","hello","privet","kaixo","hola","privet","salaam","bon dia","kaixo","hej","namaste" },new Integer[] { 10,3,5,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"kaixo",4,new Integer[] { 10,3,5,11 },new String[] { "hello","kaixo","kaixo","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","hello","privet","kaixo","hola","privet","salaam","bon dia","kaixo","hej","namaste" },new Integer[] { 3,10,5,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"privet",4,new Integer[] { 4,10,3,5 },new String[] { "privet","hello","kaixo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","hello","privet","kaixo","hola","privet","salaam","bon dia","kaixo","namaste","namaste" },new Integer[] { 4,3,10,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"kaixo",4,new Integer[] { 4,10,3,5 },new String[] { "privet","hello","kaixo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ola","hello","privet","kaixo","hola","privet","salaam","bon dia","kaixo","namaste","namaste" },new Integer[] { 5,4,3,10 }) ;
      return ok_sofar ;
  }


  static boolean test_46 ()
  {
      
      testName = "test_46" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","hi","hello","hallo","dobry den","privet" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hello",2,new Integer[] { 3 },new String[] { "hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","hi","hello","hallo","dobry den","privet" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"rimaykullayki",2,new Integer[] { 2,3 },new String[] { "rimaykullayki","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","hi","hello","hallo","dobry den","privet" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"privet",2,new Integer[] { 6,2 },new String[] { "privet","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","hi","hello","hallo","dobry den","privet" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hello",2,new Integer[] { 4,6 },new String[] { "hello","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","hello","hallo","dobry den","privet" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hei",2,new Integer[] { 4,6 },new String[] { "hello","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","hello","hallo","dobry den","privet" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hello",2,new Integer[] { 3,6 },new String[] { "hello","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","hello","hello","dobry den","privet" },new Integer[] { 3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hello",2,new Integer[] { 3,6 },new String[] { "hello","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","hello","hello","dobry den","privet" },new Integer[] { 3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"ciao",2,new Integer[] { 1,3 },new String[] { "ciao","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","hello","hello","dobry den","hei" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"ciao",2,new Integer[] { 5,1 },new String[] { "ciao","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","hello","hello","dobry den","hei" },new Integer[] { 5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"ciao",2,new Integer[] { 5,1 },new String[] { "ciao","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","hello","hello","dobry den","hei" },new Integer[] { 5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"ciao",2,new Integer[] { 5,1 },new String[] { "ciao","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","hello","hello","dobry den","hei" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"bon dia",2,new Integer[] { 2,1 },new String[] { "bon dia","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","hello","hello","ciao","hei" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hei",2,new Integer[] { 2,1 },new String[] { "bon dia","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","hello","hello","ciao","hei" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"bon dia",2,new Integer[] { 2,1 },new String[] { "bon dia","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "ciao","rimaykullayki","hello","hello","ciao","hei" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"bon dia",2,new Integer[] { 6,2 },new String[] { "bon dia","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","rimaykullayki","hello","hello","ciao","hei" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"ola",2,new Integer[] { 3,6 },new String[] { "ola","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","bon dia","hello","hello","ciao","hei" },new Integer[] { 3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ola",2,new Integer[] { 3,6 },new String[] { "ola","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","bon dia","hello","hello","ciao","hei" },new Integer[] { 3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"privet",2,new Integer[] { 1,3 },new String[] { "privet","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","bon dia","hello","hello","ciao","bon dia" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"dobry den",2,new Integer[] { 1,3 },new String[] { "privet","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hei","bon dia","hello","hello","ciao","bon dia" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"dobry den",2,new Integer[] { 6,3 },new String[] { "dobry den","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "privet","bon dia","hello","hello","ciao","bon dia" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"privet",2,new Integer[] { 1,6 },new String[] { "privet","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "privet","bon dia","dobry den","hello","ciao","bon dia" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hallo",2,new Integer[] { 1,6 },new String[] { "hallo","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "privet","bon dia","dobry den","hello","ciao","bon dia" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hallo",2,new Integer[] { 1,6 },new String[] { "hallo","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "privet","bon dia","dobry den","hello","ciao","bon dia" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"dobry den",2,new Integer[] { 1,6 },new String[] { "hallo","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "privet","bon dia","dobry den","hello","ciao","bon dia" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"bon dia",2,new Integer[] { 2,6 },new String[] { "bon dia","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","bon dia","dobry den","hello","ciao","bon dia" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"bon dia",2,new Integer[] { 2,6 },new String[] { "bon dia","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","bon dia","dobry den","hello","ciao","bon dia" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"privet",2,new Integer[] { 2,6 },new String[] { "bon dia","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","bon dia","dobry den","hello","ciao","bon dia" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"ciao",2,new Integer[] { 5,6 },new String[] { "ciao","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","bon dia","dobry den","hello","ciao","bon dia" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"privet",2,new Integer[] { 5,6 },new String[] { "ciao","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","bon dia","dobry den","hello","ciao","bon dia" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hola",2,new Integer[] { 5,6 },new String[] { "hola","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","bon dia","dobry den","hello","ciao","bon dia" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hei",2,new Integer[] { 5,6 },new String[] { "hola","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","bon dia","dobry den","hello","ciao","bon dia" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hello",2,new Integer[] { 4,6 },new String[] { "hello","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","bon dia","dobry den","hello","hola","bon dia" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"zdravo",2,new Integer[] { 4,6 },new String[] { "zdravo","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","bon dia","dobry den","hello","hola","bon dia" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"rimaykullayki",2,new Integer[] { 3,4 },new String[] { "rimaykullayki","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","bon dia","dobry den","hello","hola","hei" },new Integer[] { 3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"bon dia",2,new Integer[] { 5,3 },new String[] { "bon dia","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","bon dia","dobry den","zdravo","hola","hei" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"rimaykullayki",2,new Integer[] { 5,3 },new String[] { "bon dia","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","bon dia","dobry den","zdravo","hola","hei" },new Integer[] { 3,5 }) ;
      return ok_sofar ;
  }


  static boolean test_47 ()
  {
      
      testName = "test_47" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","ola","hi","kaixo","bon dia","ciao","rimaykullayki","privet","hei","hello" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"dobry den",5,new Integer[] { 11 },new String[] { "dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","ola","hi","kaixo","bon dia","ciao","rimaykullayki","privet","hei","hello" },new Integer[] { 11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"hello",5,new Integer[] { 15,11 },new String[] { "hello","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","ola","hi","kaixo","bon dia","ciao","rimaykullayki","privet","hei","hello" },new Integer[] { 15,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"salaam",5,new Integer[] { 4,15,11 },new String[] { "salaam","hello","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","ola","hi","kaixo","bon dia","ciao","rimaykullayki","privet","hei","hello" },new Integer[] { 4,15,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"hello",5,new Integer[] { 4,15,11 },new String[] { "salaam","hello","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","ola","hi","kaixo","bon dia","ciao","rimaykullayki","privet","hei","hello" },new Integer[] { 15,4,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"bon dia",5,new Integer[] { 7,4,15,11 },new String[] { "bon dia","salaam","hello","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","ola","hi","kaixo","bon dia","ciao","rimaykullayki","privet","hei","hello" },new Integer[] { 7,15,4,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"namaste",5,new Integer[] { 1,7,4,15,11 },new String[] { "namaste","bon dia","salaam","hello","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","ola","hi","kaixo","bon dia","ciao","rimaykullayki","privet","hei","hello" },new Integer[] { 1,7,15,4,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"salaam",5,new Integer[] { 12,1,7,4,15 },new String[] { "salaam","namaste","bon dia","salaam","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","ola","hi","kaixo","bon dia","dobry den","rimaykullayki","privet","hei","hello" },new Integer[] { 12,1,7,15,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"hello",5,new Integer[] { 12,1,7,4,15 },new String[] { "salaam","namaste","bon dia","salaam","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","ola","hi","kaixo","bon dia","dobry den","rimaykullayki","privet","hei","hello" },new Integer[] { 15,12,1,7,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hola",5,new Integer[] { 3,12,1,7,15 },new String[] { "hola","salaam","namaste","bon dia","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","ola","hi","kaixo","bon dia","dobry den","rimaykullayki","privet","hei","hello" },new Integer[] { 3,15,12,1,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"namaste",5,new Integer[] { 3,12,1,7,15 },new String[] { "hola","salaam","namaste","bon dia","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","ola","hi","kaixo","bon dia","dobry den","rimaykullayki","privet","hei","hello" },new Integer[] { 1,3,15,12,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"salaam",5,new Integer[] { 4,3,12,1,15 },new String[] { "salaam","hola","salaam","namaste","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","bon dia","hi","kaixo","bon dia","dobry den","rimaykullayki","privet","hei","hello" },new Integer[] { 4,1,3,15,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hola",5,new Integer[] { 4,3,12,1,15 },new String[] { "salaam","hola","salaam","namaste","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","bon dia","hi","kaixo","bon dia","dobry den","rimaykullayki","privet","hei","hello" },new Integer[] { 3,4,1,15,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"dobry den",5,new Integer[] { 11,4,3,1,15 },new String[] { "dobry den","salaam","hola","namaste","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","bon dia","hi","kaixo","bon dia","dobry den","salaam","privet","hei","hello" },new Integer[] { 11,3,4,1,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"kaixo",5,new Integer[] { 10,11,4,3,1 },new String[] { "kaixo","dobry den","salaam","hola","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","bon dia","hi","kaixo","bon dia","dobry den","salaam","privet","hei","hello" },new Integer[] { 10,11,3,4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"dobry den",5,new Integer[] { 10,11,4,3,1 },new String[] { "kaixo","dobry den","salaam","hola","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","bon dia","hi","kaixo","bon dia","dobry den","salaam","privet","hei","hello" },new Integer[] { 11,10,3,4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hello",5,new Integer[] { 10,11,4,3,1 },new String[] { "kaixo","dobry den","salaam","hello","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","bon dia","hi","kaixo","bon dia","dobry den","salaam","privet","hei","hello" },new Integer[] { 3,11,10,4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"kaixo",5,new Integer[] { 9,10,11,4,3 },new String[] { "kaixo","kaixo","dobry den","salaam","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","bon dia","hi","kaixo","bon dia","dobry den","salaam","privet","hei","hello" },new Integer[] { 9,3,11,10,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"hej",5,new Integer[] { 9,10,11,4,3 },new String[] { "kaixo","hej","dobry den","salaam","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","bon dia","hi","kaixo","bon dia","dobry den","salaam","privet","hei","hello" },new Integer[] { 10,9,3,11,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"kaixo",5,new Integer[] { 6,9,10,11,3 },new String[] { "kaixo","kaixo","hej","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","bon dia","hi","kaixo","bon dia","dobry den","salaam","privet","hei","hello" },new Integer[] { 6,10,9,3,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"salaam",5,new Integer[] { 12,6,9,10,3 },new String[] { "salaam","kaixo","kaixo","hej","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hola","salaam","hallo","dobry den","bon dia","hi","kaixo","bon dia","dobry den","salaam","privet","hei","hello" },new Integer[] { 12,6,10,9,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"ciao",5,new Integer[] { 15,12,6,9,10 },new String[] { "ciao","salaam","kaixo","kaixo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","salaam","hallo","dobry den","bon dia","hi","kaixo","bon dia","dobry den","salaam","privet","hei","hello" },new Integer[] { 15,12,6,10,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hello",5,new Integer[] { 3,15,12,6,10 },new String[] { "hello","ciao","salaam","kaixo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","salaam","hallo","dobry den","bon dia","hi","kaixo","bon dia","dobry den","salaam","privet","hei","hello" },new Integer[] { 3,15,12,6,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"rimaykullayki",5,new Integer[] { 4,3,15,12,6 },new String[] { "rimaykullayki","hello","ciao","salaam","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","salaam","hallo","dobry den","bon dia","hi","kaixo","hej","dobry den","salaam","privet","hei","hello" },new Integer[] { 4,3,15,12,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"ola",5,new Integer[] { 9,4,3,15,12 },new String[] { "ola","rimaykullayki","hello","ciao","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","salaam","hallo","kaixo","bon dia","hi","kaixo","hej","dobry den","salaam","privet","hei","hello" },new Integer[] { 9,4,3,15,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"dobry den",5,new Integer[] { 6,9,4,3,15 },new String[] { "dobry den","ola","rimaykullayki","hello","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","salaam","hallo","kaixo","bon dia","hi","kaixo","hej","dobry den","salaam","privet","hei","hello" },new Integer[] { 6,9,4,3,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"salaam",5,new Integer[] { 12,6,9,4,3 },new String[] { "salaam","dobry den","ola","rimaykullayki","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","salaam","hallo","kaixo","bon dia","hi","kaixo","hej","dobry den","salaam","privet","hei","ciao" },new Integer[] { 12,6,9,4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"hei",5,new Integer[] { 8,12,6,9,4 },new String[] { "hei","salaam","dobry den","ola","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","salaam","hallo","kaixo","bon dia","hi","kaixo","hej","dobry den","salaam","privet","hei","ciao" },new Integer[] { 8,12,6,9,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"namaste",5,new Integer[] { 15,8,12,6,9 },new String[] { "namaste","hei","salaam","dobry den","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","kaixo","bon dia","hi","kaixo","hej","dobry den","salaam","privet","hei","ciao" },new Integer[] { 15,8,12,6,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hej",5,new Integer[] { 10,15,8,12,6 },new String[] { "hej","namaste","hei","salaam","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","kaixo","bon dia","hi","ola","hej","dobry den","salaam","privet","hei","ciao" },new Integer[] { 10,15,8,12,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"namaste",5,new Integer[] { 1,10,15,8,12 },new String[] { "namaste","hej","namaste","hei","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","dobry den","bon dia","hi","ola","hej","dobry den","salaam","privet","hei","ciao" },new Integer[] { 1,10,15,8,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(13,"hello",5,new Integer[] { 13,1,10,15,8 },new String[] { "hello","namaste","hej","namaste","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","dobry den","bon dia","hi","ola","hej","dobry den","salaam","privet","hei","ciao" },new Integer[] { 13,1,10,15,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(13,"zdravo",5,new Integer[] { 13,1,10,15,8 },new String[] { "zdravo","namaste","hej","namaste","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","dobry den","bon dia","hi","ola","hej","dobry den","salaam","privet","hei","ciao" },new Integer[] { 13,1,10,15,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"kaixo",5,new Integer[] { 11,13,1,10,15 },new String[] { "kaixo","zdravo","namaste","hej","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","dobry den","bon dia","hei","ola","hej","dobry den","salaam","privet","hei","ciao" },new Integer[] { 11,13,1,10,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"salaam",5,new Integer[] { 12,11,13,1,10 },new String[] { "salaam","kaixo","zdravo","namaste","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","dobry den","bon dia","hei","ola","hej","dobry den","salaam","privet","hei","namaste" },new Integer[] { 12,11,13,1,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hej",5,new Integer[] { 12,11,13,1,10 },new String[] { "salaam","kaixo","zdravo","namaste","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","dobry den","bon dia","hei","ola","hej","dobry den","salaam","privet","hei","namaste" },new Integer[] { 10,12,11,13,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"kaixo",5,new Integer[] { 2,12,11,13,10 },new String[] { "kaixo","salaam","kaixo","zdravo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","dobry den","bon dia","hei","ola","hej","dobry den","salaam","privet","hei","namaste" },new Integer[] { 2,10,12,11,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(14,"rimaykullayki",5,new Integer[] { 14,2,12,11,10 },new String[] { "rimaykullayki","kaixo","salaam","kaixo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","dobry den","bon dia","hei","ola","hej","dobry den","salaam","zdravo","hei","namaste" },new Integer[] { 14,2,10,12,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hello",5,new Integer[] { 3,14,2,12,10 },new String[] { "hello","rimaykullayki","kaixo","salaam","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","dobry den","bon dia","hei","ola","hej","kaixo","salaam","zdravo","hei","namaste" },new Integer[] { 3,14,2,10,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(13,"zdravo",5,new Integer[] { 13,3,14,2,10 },new String[] { "zdravo","hello","rimaykullayki","kaixo","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","dobry den","bon dia","hei","ola","hej","kaixo","salaam","zdravo","hei","namaste" },new Integer[] { 13,3,14,2,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"hei",5,new Integer[] { 13,3,14,2,10 },new String[] { "zdravo","hello","rimaykullayki","kaixo","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","hej","hello","rimaykullayki","hallo","dobry den","bon dia","hei","ola","hej","kaixo","salaam","zdravo","hei","namaste" },new Integer[] { 10,13,3,14,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"namaste",5,new Integer[] { 15,13,3,14,10 },new String[] { "namaste","zdravo","hello","rimaykullayki","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "namaste","kaixo","hello","rimaykullayki","hallo","dobry den","bon dia","hei","ola","hej","kaixo","salaam","zdravo","hei","namaste" },new Integer[] { 15,10,13,3,14 }) ;
      return ok_sofar ;
  }


  static boolean test_48 ()
  {
      
      testName = "test_48" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","rimaykullayki","namaste","hello","salaam","kaixo","hola","hallo","bon dia","ciao","hej" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"salaam",5,new Integer[] { 9 },new String[] { "salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","rimaykullayki","namaste","hello","salaam","kaixo","hola","hallo","bon dia","ciao","hej" },new Integer[] { 9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"dobry den",5,new Integer[] { 2,9 },new String[] { "dobry den","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","rimaykullayki","namaste","hello","salaam","kaixo","hola","hallo","bon dia","ciao","hej" },new Integer[] { 2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"zdravo",5,new Integer[] { 6,2,9 },new String[] { "zdravo","dobry den","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","rimaykullayki","namaste","hello","salaam","kaixo","hola","hallo","bon dia","ciao","hej" },new Integer[] { 6,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(13,"salaam",5,new Integer[] { 13,6,2,9 },new String[] { "salaam","zdravo","dobry den","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","rimaykullayki","namaste","hello","salaam","kaixo","hola","hallo","bon dia","ciao","hej" },new Integer[] { 13,6,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"privet",5,new Integer[] { 8,13,6,2,9 },new String[] { "privet","salaam","zdravo","dobry den","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","rimaykullayki","namaste","hello","salaam","kaixo","hola","hallo","bon dia","ciao","hej" },new Integer[] { 8,13,6,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"ciao",5,new Integer[] { 11,8,13,6,2 },new String[] { "ciao","privet","salaam","zdravo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","rimaykullayki","namaste","hello","salaam","kaixo","hola","hallo","bon dia","ciao","hej" },new Integer[] { 11,8,13,6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"privet",5,new Integer[] { 11,8,13,6,2 },new String[] { "ciao","privet","salaam","privet","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","rimaykullayki","namaste","hello","salaam","kaixo","hola","hallo","bon dia","ciao","hej" },new Integer[] { 6,11,8,13,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"ciao",5,new Integer[] { 11,8,13,6,2 },new String[] { "ciao","privet","salaam","privet","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","rimaykullayki","namaste","hello","salaam","kaixo","hola","hallo","bon dia","ciao","hej" },new Integer[] { 11,6,8,13,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"hej",5,new Integer[] { 15,11,8,13,6 },new String[] { "hej","ciao","privet","salaam","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","rimaykullayki","namaste","hello","salaam","kaixo","hola","hallo","bon dia","ciao","hej" },new Integer[] { 15,11,6,8,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hi",5,new Integer[] { 5,15,11,8,6 },new String[] { "hi","hej","ciao","privet","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","rimaykullayki","namaste","hello","salaam","kaixo","hola","hallo","salaam","ciao","hej" },new Integer[] { 5,15,11,6,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"hola",5,new Integer[] { 12,5,15,11,6 },new String[] { "hola","hi","hej","ciao","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","rimaykullayki","namaste","privet","salaam","kaixo","hola","hallo","salaam","ciao","hej" },new Integer[] { 12,5,15,11,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"salaam",5,new Integer[] { 10,12,5,15,11 },new String[] { "salaam","hola","hi","hej","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","privet","salaam","kaixo","hola","hallo","salaam","ciao","hej" },new Integer[] { 10,12,5,15,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"ciao",5,new Integer[] { 8,10,12,5,15 },new String[] { "ciao","salaam","hola","hi","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","privet","salaam","kaixo","ciao","hallo","salaam","ciao","hej" },new Integer[] { 8,10,12,5,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"zdravo",5,new Integer[] { 4,8,10,12,5 },new String[] { "zdravo","ciao","salaam","hola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","privet","salaam","kaixo","ciao","hallo","salaam","ciao","hej" },new Integer[] { 4,8,10,12,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"ola",5,new Integer[] { 4,8,10,12,5 },new String[] { "zdravo","ciao","ola","hola","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","privet","salaam","kaixo","ciao","hallo","salaam","ciao","hej" },new Integer[] { 10,4,8,12,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(13,"salaam",5,new Integer[] { 13,4,8,10,12 },new String[] { "salaam","zdravo","ciao","ola","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","privet","salaam","kaixo","ciao","hallo","salaam","ciao","hej" },new Integer[] { 13,10,4,8,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(14,"zdravo",5,new Integer[] { 14,13,4,8,10 },new String[] { "zdravo","salaam","zdravo","ciao","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","privet","salaam","kaixo","ciao","hola","salaam","ciao","hej" },new Integer[] { 14,13,10,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(14,"hei",5,new Integer[] { 14,13,4,8,10 },new String[] { "hei","salaam","zdravo","ciao","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","privet","salaam","kaixo","ciao","hola","salaam","ciao","hej" },new Integer[] { 14,13,10,4,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"dobry den",5,new Integer[] { 12,14,13,4,10 },new String[] { "dobry den","hei","salaam","zdravo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","kaixo","ciao","hola","salaam","ciao","hej" },new Integer[] { 12,14,13,10,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"salaam",5,new Integer[] { 9,12,14,13,10 },new String[] { "salaam","dobry den","hei","salaam","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","kaixo","ciao","hola","salaam","ciao","hej" },new Integer[] { 9,12,14,13,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"zdravo",5,new Integer[] { 4,9,12,14,13 },new String[] { "zdravo","salaam","dobry den","hei","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","hola","salaam","ciao","hej" },new Integer[] { 4,9,12,14,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"ola",5,new Integer[] { 1,4,9,12,14 },new String[] { "ola","zdravo","salaam","dobry den","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","hola","salaam","ciao","hej" },new Integer[] { 1,4,9,12,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(14,"zdravo",5,new Integer[] { 1,4,9,12,14 },new String[] { "ola","zdravo","salaam","dobry den","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","hola","salaam","ciao","hej" },new Integer[] { 14,1,4,9,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"dobry den",5,new Integer[] { 1,4,9,12,14 },new String[] { "ola","zdravo","salaam","dobry den","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","hola","salaam","ciao","hej" },new Integer[] { 12,14,1,4,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"dobry den",5,new Integer[] { 15,1,4,12,14 },new String[] { "dobry den","ola","zdravo","dobry den","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","hola","salaam","ciao","hej" },new Integer[] { 15,12,14,1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hei",5,new Integer[] { 3,15,1,12,14 },new String[] { "hei","dobry den","ola","dobry den","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","hola","salaam","ciao","hej" },new Integer[] { 3,15,12,14,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"bon dia",5,new Integer[] { 2,3,15,12,14 },new String[] { "bon dia","hei","dobry den","dobry den","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","hola","salaam","ciao","hej" },new Integer[] { 2,3,15,12,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(13,"salaam",5,new Integer[] { 13,2,3,15,12 },new String[] { "salaam","bon dia","hei","dobry den","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","hola","salaam","zdravo","hej" },new Integer[] { 13,2,3,15,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"zdravo",5,new Integer[] { 13,2,3,15,12 },new String[] { "salaam","bon dia","hei","zdravo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","hola","salaam","zdravo","hej" },new Integer[] { 15,13,2,3,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(13,"salaam",5,new Integer[] { 13,2,3,15,12 },new String[] { "salaam","bon dia","hei","zdravo","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","hola","salaam","zdravo","hej" },new Integer[] { 13,15,2,3,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"bon dia",5,new Integer[] { 7,13,2,3,15 },new String[] { "bon dia","salaam","bon dia","hei","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","hej" },new Integer[] { 7,13,15,2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(14,"zdravo",5,new Integer[] { 14,7,13,2,15 },new String[] { "zdravo","bon dia","salaam","bon dia","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","dobry den","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","hej" },new Integer[] { 14,7,13,15,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"namaste",5,new Integer[] { 1,14,7,13,15 },new String[] { "namaste","zdravo","bon dia","salaam","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","bon dia","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","hej" },new Integer[] { 1,14,7,13,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"ola",5,new Integer[] { 10,1,14,7,13 },new String[] { "ola","namaste","zdravo","bon dia","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","bon dia","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","zdravo" },new Integer[] { 10,1,14,7,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(14,"zdravo",5,new Integer[] { 10,1,14,7,13 },new String[] { "ola","namaste","zdravo","bon dia","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","bon dia","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","zdravo" },new Integer[] { 14,10,1,7,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(13,"salaam",5,new Integer[] { 10,1,14,7,13 },new String[] { "ola","namaste","zdravo","bon dia","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","bon dia","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","zdravo" },new Integer[] { 13,14,10,1,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"namaste",5,new Integer[] { 10,1,14,7,13 },new String[] { "ola","namaste","zdravo","bon dia","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","bon dia","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","zdravo" },new Integer[] { 1,13,14,10,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(13,"hallo",5,new Integer[] { 10,1,14,7,13 },new String[] { "ola","namaste","zdravo","bon dia","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","bon dia","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","zdravo" },new Integer[] { 13,1,14,10,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(13,"hallo",5,new Integer[] { 10,1,14,7,13 },new String[] { "ola","namaste","zdravo","bon dia","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","bon dia","hei","zdravo","hi","privet","namaste","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","zdravo" },new Integer[] { 13,1,14,10,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"salaam",5,new Integer[] { 9,10,1,14,13 },new String[] { "salaam","ola","namaste","zdravo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","bon dia","hei","zdravo","hi","privet","bon dia","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","zdravo" },new Integer[] { 9,13,1,14,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"bon dia",5,new Integer[] { 7,9,1,14,13 },new String[] { "bon dia","salaam","namaste","zdravo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","bon dia","hei","zdravo","hi","privet","bon dia","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","zdravo" },new Integer[] { 7,9,13,1,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(14,"zdravo",5,new Integer[] { 7,9,1,14,13 },new String[] { "bon dia","salaam","namaste","zdravo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","bon dia","hei","zdravo","hi","privet","bon dia","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","zdravo" },new Integer[] { 14,7,9,13,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"zdravo",5,new Integer[] { 7,9,1,14,13 },new String[] { "bon dia","zdravo","namaste","zdravo","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","bon dia","hei","zdravo","hi","privet","bon dia","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","zdravo" },new Integer[] { 9,14,7,13,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(13,"kaixo",5,new Integer[] { 7,9,1,14,13 },new String[] { "bon dia","zdravo","namaste","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "ola","bon dia","hei","zdravo","hi","privet","bon dia","ciao","salaam","ola","ciao","dobry den","salaam","zdravo","zdravo" },new Integer[] { 13,9,14,7,1 }) ;
      return ok_sofar ;
  }


  static boolean test_49 ()
  {
      
      testName = "test_49" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(5,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","dobry den","ola","ciao","salaam","namaste","rimaykullayki","hola","hei","privet","bon dia","hello","hi","kaixo","hej" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hei",5,new Integer[] { 5 },new String[] { "hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","dobry den","ola","ciao","salaam","namaste","rimaykullayki","hola","hei","privet","bon dia","hello","hi","kaixo","hej" },new Integer[] { 5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"hej",5,new Integer[] { 15,5 },new String[] { "hej","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","dobry den","ola","ciao","salaam","namaste","rimaykullayki","hola","hei","privet","bon dia","hello","hi","kaixo","hej" },new Integer[] { 15,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"dobry den",5,new Integer[] { 2,15,5 },new String[] { "dobry den","hej","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","dobry den","ola","ciao","salaam","namaste","rimaykullayki","hola","hei","privet","bon dia","hello","hi","kaixo","hej" },new Integer[] { 2,15,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"salaam",5,new Integer[] { 4,2,15,5 },new String[] { "salaam","dobry den","hej","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","dobry den","ola","ciao","salaam","namaste","rimaykullayki","hola","hei","privet","bon dia","hello","hi","kaixo","hej" },new Integer[] { 4,2,15,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"salaam",5,new Integer[] { 8,4,2,15,5 },new String[] { "salaam","salaam","dobry den","hej","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","dobry den","ola","ciao","salaam","namaste","rimaykullayki","hola","hei","privet","bon dia","hello","hi","kaixo","hej" },new Integer[] { 8,4,2,15,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"salaam",5,new Integer[] { 8,4,2,15,5 },new String[] { "salaam","salaam","salaam","hej","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","dobry den","ola","ciao","salaam","namaste","rimaykullayki","hola","hei","privet","bon dia","hello","hi","kaixo","hej" },new Integer[] { 2,8,4,15,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"dobry den",5,new Integer[] { 8,4,2,15,5 },new String[] { "salaam","salaam","salaam","dobry den","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","dobry den","ola","ciao","salaam","namaste","rimaykullayki","hola","hei","privet","bon dia","hello","hi","kaixo","hej" },new Integer[] { 15,2,8,4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"dobry den",5,new Integer[] { 8,4,2,15,5 },new String[] { "salaam","salaam","salaam","dobry den","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","dobry den","ola","ciao","salaam","namaste","rimaykullayki","hola","hei","privet","bon dia","hello","hi","kaixo","hej" },new Integer[] { 15,2,8,4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"salaam",5,new Integer[] { 8,4,2,15,5 },new String[] { "salaam","salaam","salaam","dobry den","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","dobry den","ola","ciao","salaam","namaste","rimaykullayki","hola","hei","privet","bon dia","hello","hi","kaixo","hej" },new Integer[] { 4,15,2,8,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(14,"kaixo",5,new Integer[] { 14,8,4,2,15 },new String[] { "kaixo","salaam","salaam","salaam","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","dobry den","ola","ciao","hei","namaste","rimaykullayki","hola","hei","privet","bon dia","hello","hi","kaixo","hej" },new Integer[] { 14,4,15,2,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"dobry den",5,new Integer[] { 11,14,4,2,15 },new String[] { "dobry den","kaixo","salaam","salaam","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","dobry den","ola","ciao","hei","namaste","rimaykullayki","salaam","hei","privet","bon dia","hello","hi","kaixo","hej" },new Integer[] { 11,14,4,15,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"zdravo",5,new Integer[] { 1,11,14,4,15 },new String[] { "zdravo","dobry den","kaixo","salaam","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","ciao","hei","namaste","rimaykullayki","salaam","hei","privet","bon dia","hello","hi","kaixo","hej" },new Integer[] { 1,11,14,4,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ola",5,new Integer[] { 3,1,11,14,4 },new String[] { "ola","zdravo","dobry den","kaixo","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","ciao","hei","namaste","rimaykullayki","salaam","hei","privet","bon dia","hello","hi","kaixo","dobry den" },new Integer[] { 3,1,11,14,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(14,"kaixo",5,new Integer[] { 3,1,11,14,4 },new String[] { "ola","zdravo","dobry den","kaixo","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","ciao","hei","namaste","rimaykullayki","salaam","hei","privet","bon dia","hello","hi","kaixo","dobry den" },new Integer[] { 14,3,1,11,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"salaam",5,new Integer[] { 8,3,1,11,14 },new String[] { "salaam","ola","zdravo","dobry den","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","bon dia","hello","hi","kaixo","dobry den" },new Integer[] { 8,14,3,1,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(13,"rimaykullayki",5,new Integer[] { 13,8,3,1,14 },new String[] { "rimaykullayki","salaam","ola","zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","hi","kaixo","dobry den" },new Integer[] { 13,8,14,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"salaam",5,new Integer[] { 2,13,8,3,14 },new String[] { "salaam","rimaykullayki","salaam","ola","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","hi","kaixo","dobry den" },new Integer[] { 2,13,8,14,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(14,"hello",5,new Integer[] { 2,13,8,3,14 },new String[] { "salaam","rimaykullayki","salaam","ola","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","hi","kaixo","dobry den" },new Integer[] { 14,2,13,8,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"dobry den",5,new Integer[] { 15,2,13,8,14 },new String[] { "dobry den","salaam","rimaykullayki","salaam","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","hi","kaixo","dobry den" },new Integer[] { 15,14,2,13,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"ciao",5,new Integer[] { 7,15,2,13,14 },new String[] { "ciao","dobry den","salaam","rimaykullayki","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","hi","kaixo","dobry den" },new Integer[] { 7,15,14,2,13 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"salaam",5,new Integer[] { 8,7,15,2,14 },new String[] { "salaam","ciao","dobry den","salaam","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","rimaykullayki","kaixo","dobry den" },new Integer[] { 8,7,15,14,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"dobry den",5,new Integer[] { 8,7,15,2,14 },new String[] { "salaam","ciao","dobry den","salaam","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","rimaykullayki","kaixo","dobry den" },new Integer[] { 15,8,7,14,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"salaam",5,new Integer[] { 1,8,7,15,14 },new String[] { "salaam","salaam","ciao","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","rimaykullayki","kaixo","dobry den" },new Integer[] { 1,15,8,7,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"ciao",5,new Integer[] { 1,8,7,15,14 },new String[] { "salaam","salaam","ciao","dobry den","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","rimaykullayki","kaixo","dobry den" },new Integer[] { 7,1,15,8,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"zdravo",5,new Integer[] { 9,1,8,7,15 },new String[] { "zdravo","salaam","salaam","ciao","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 9,7,1,15,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ola",5,new Integer[] { 3,9,1,7,15 },new String[] { "ola","zdravo","salaam","ciao","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 3,9,7,1,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(15,"dobry den",5,new Integer[] { 3,9,1,7,15 },new String[] { "ola","zdravo","salaam","ciao","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 15,3,9,7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"hello",5,new Integer[] { 3,9,1,7,15 },new String[] { "ola","hello","salaam","ciao","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "zdravo","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 9,15,3,7,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"privet",5,new Integer[] { 10,3,9,7,15 },new String[] { "privet","ola","hello","ciao","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 10,9,15,3,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"ola",5,new Integer[] { 10,3,9,7,15 },new String[] { "privet","ola","hello","ciao","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","rimaykullayki","salaam","hei","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 15,10,9,3,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"dobry den",5,new Integer[] { 11,10,3,9,15 },new String[] { "dobry den","privet","ola","hello","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hei","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 11,15,10,9,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"salaam",5,new Integer[] { 4,11,10,9,15 },new String[] { "salaam","dobry den","privet","hello","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hei","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 4,11,15,10,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(15,"rimaykullayki",5,new Integer[] { 4,11,10,9,15 },new String[] { "salaam","dobry den","privet","hello","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hei","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 15,4,11,10,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"salaam",5,new Integer[] { 4,11,10,9,15 },new String[] { "salaam","dobry den","privet","hello","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hei","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 4,15,11,10,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"salaam",5,new Integer[] { 4,11,10,9,15 },new String[] { "salaam","dobry den","privet","hello","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hei","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 4,15,11,10,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"privet",5,new Integer[] { 5,4,11,10,15 },new String[] { "privet","salaam","dobry den","privet","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hello","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 5,4,15,11,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"hello",5,new Integer[] { 12,5,4,11,15 },new String[] { "hello","privet","salaam","dobry den","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hello","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 12,5,4,15,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(14,"hello",5,new Integer[] { 14,12,5,4,15 },new String[] { "hello","hello","privet","salaam","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hello","privet","dobry den","hello","rimaykullayki","hello","dobry den" },new Integer[] { 14,12,5,4,15 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"namaste",5,new Integer[] { 6,14,12,5,4 },new String[] { "namaste","hello","hello","privet","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hello","privet","dobry den","hello","rimaykullayki","hello","rimaykullayki" },new Integer[] { 6,14,12,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"salaam",5,new Integer[] { 2,6,14,12,5 },new String[] { "salaam","namaste","hello","hello","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hello","privet","dobry den","hello","rimaykullayki","hello","rimaykullayki" },new Integer[] { 2,6,14,12,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"bon dia",5,new Integer[] { 2,6,14,12,5 },new String[] { "bon dia","namaste","hello","hello","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hello","privet","dobry den","hello","rimaykullayki","hello","rimaykullayki" },new Integer[] { 2,6,14,12,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"privet",5,new Integer[] { 2,6,14,12,5 },new String[] { "bon dia","namaste","hello","hello","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hello","privet","dobry den","hello","rimaykullayki","hello","rimaykullayki" },new Integer[] { 5,2,6,14,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(13,"rimaykullayki",5,new Integer[] { 13,2,6,14,5 },new String[] { "rimaykullayki","bon dia","namaste","hello","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hello","privet","dobry den","hello","rimaykullayki","hello","rimaykullayki" },new Integer[] { 13,5,2,6,14 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"hello",5,new Integer[] { 9,13,2,6,5 },new String[] { "hello","rimaykullayki","bon dia","namaste","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15 },new String[] { "salaam","salaam","ola","salaam","hei","namaste","ciao","salaam","hello","privet","dobry den","hello","rimaykullayki","hello","rimaykullayki" },new Integer[] { 9,13,5,2,6 }) ;
      return ok_sofar ;
  }


  static boolean test_50 ()
  {
      
      testName = "test_50" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","hallo","ola","hei","privet","zdravo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ola",2,new Integer[] { 3 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","hallo","ola","hei","privet","zdravo" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ola",2,new Integer[] { 3 },new String[] { "ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","hallo","ola","hei","privet","zdravo" },new Integer[] { 3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hallo",2,new Integer[] { 1,3 },new String[] { "hallo","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","hallo","ola","hei","privet","zdravo" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"ciao",2,new Integer[] { 1,3 },new String[] { "hallo","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","hallo","ola","hei","privet","zdravo" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ciao",2,new Integer[] { 1,3 },new String[] { "hallo","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","hallo","ola","hei","privet","zdravo" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"dobry den",2,new Integer[] { 5,3 },new String[] { "dobry den","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hallo","ola","hei","privet","zdravo" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"zdravo",2,new Integer[] { 6,5 },new String[] { "zdravo","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hallo","ciao","hei","privet","zdravo" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"salaam",2,new Integer[] { 2,6 },new String[] { "salaam","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hallo","ciao","hei","dobry den","zdravo" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hallo",2,new Integer[] { 4,2 },new String[] { "hallo","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hallo","ciao","hei","dobry den","zdravo" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hallo",2,new Integer[] { 1,4 },new String[] { "hallo","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","salaam","ciao","hei","dobry den","zdravo" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hei",2,new Integer[] { 2,1 },new String[] { "hei","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","salaam","ciao","hallo","dobry den","zdravo" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"bon dia",2,new Integer[] { 3,2 },new String[] { "bon dia","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","salaam","ciao","hallo","dobry den","zdravo" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hallo",2,new Integer[] { 1,3 },new String[] { "hallo","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","ciao","hallo","dobry den","zdravo" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hej",2,new Integer[] { 6,1 },new String[] { "hej","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","bon dia","hallo","dobry den","zdravo" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hallo",2,new Integer[] { 4,6 },new String[] { "hallo","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","bon dia","hallo","dobry den","zdravo" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"hej",2,new Integer[] { 4,6 },new String[] { "hallo","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","bon dia","hallo","dobry den","zdravo" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"hej",2,new Integer[] { 4,6 },new String[] { "hallo","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","bon dia","hallo","dobry den","zdravo" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hei",2,new Integer[] { 5,6 },new String[] { "hei","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","bon dia","hallo","dobry den","zdravo" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hallo",2,new Integer[] { 1,5 },new String[] { "hallo","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","bon dia","hallo","dobry den","hej" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"ola",2,new Integer[] { 2,1 },new String[] { "ola","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","bon dia","hallo","hei","hej" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hi",2,new Integer[] { 6,2 },new String[] { "hi","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","hei","bon dia","hallo","hei","hej" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hi",2,new Integer[] { 3,6 },new String[] { "hi","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","ola","bon dia","hallo","hei","hej" },new Integer[] { 3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hei",2,new Integer[] { 5,3 },new String[] { "hei","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","ola","bon dia","hallo","hei","hi" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"privet",2,new Integer[] { 2,5 },new String[] { "privet","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","ola","hi","hallo","hei","hi" },new Integer[] { 2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hallo",2,new Integer[] { 3,2 },new String[] { "hallo","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","ola","hi","hallo","hei","hi" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hallo",2,new Integer[] { 1,3 },new String[] { "hallo","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","privet","hi","hallo","hei","hi" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hei",2,new Integer[] { 5,1 },new String[] { "hei","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","privet","hallo","hallo","hei","hi" },new Integer[] { 5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"rimaykullayki",2,new Integer[] { 6,5 },new String[] { "rimaykullayki","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","privet","hallo","hallo","hei","hi" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hei",2,new Integer[] { 1,6 },new String[] { "hei","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","privet","hallo","hallo","hei","hi" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hi",2,new Integer[] { 5,1 },new String[] { "hi","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","privet","hallo","hallo","hei","rimaykullayki" },new Integer[] { 5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hi",2,new Integer[] { 5,1 },new String[] { "hi","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","privet","hallo","hallo","hei","rimaykullayki" },new Integer[] { 5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"dobry den",2,new Integer[] { 5,1 },new String[] { "hi","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","privet","hallo","hallo","hei","rimaykullayki" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"dobry den",2,new Integer[] { 5,1 },new String[] { "hi","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","privet","hallo","hallo","hei","rimaykullayki" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"ciao",2,new Integer[] { 3,1 },new String[] { "ciao","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","privet","hallo","hallo","hi","rimaykullayki" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"zdravo",2,new Integer[] { 6,3 },new String[] { "zdravo","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","privet","hallo","hallo","hi","rimaykullayki" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hallo",2,new Integer[] { 4,6 },new String[] { "hallo","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","privet","ciao","hallo","hi","rimaykullayki" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hallo",2,new Integer[] { 4,6 },new String[] { "hallo","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","privet","ciao","hallo","hi","rimaykullayki" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ciao",2,new Integer[] { 3,4 },new String[] { "ciao","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","privet","ciao","hallo","hi","zdravo" },new Integer[] { 3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ciao",2,new Integer[] { 3,4 },new String[] { "ciao","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","privet","ciao","hallo","hi","zdravo" },new Integer[] { 3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hallo",2,new Integer[] { 2,3 },new String[] { "hallo","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","privet","ciao","hallo","hi","zdravo" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hallo",2,new Integer[] { 2,3 },new String[] { "hallo","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","privet","ciao","hallo","hi","zdravo" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hola",2,new Integer[] { 2,3 },new String[] { "hola","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","privet","ciao","hallo","hi","zdravo" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hi",2,new Integer[] { 5,2 },new String[] { "hi","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","privet","ciao","hallo","hi","zdravo" },new Integer[] { 5,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ciao",2,new Integer[] { 3,5 },new String[] { "ciao","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","hola","ciao","hallo","hi","zdravo" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"zdravo",2,new Integer[] { 3,5 },new String[] { "zdravo","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","hola","ciao","hallo","hi","zdravo" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"dobry den",2,new Integer[] { 1,3 },new String[] { "dobry den","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","hola","ciao","hallo","hi","zdravo" },new Integer[] { 1,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hola",2,new Integer[] { 4,1 },new String[] { "hola","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","hola","zdravo","hallo","hi","zdravo" },new Integer[] { 4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"namaste",2,new Integer[] { 2,4 },new String[] { "namaste","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","hola","zdravo","hallo","hi","zdravo" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"ciao",2,new Integer[] { 3,2 },new String[] { "ciao","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","hola","zdravo","hola","hi","zdravo" },new Integer[] { 3,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"dobry den",2,new Integer[] { 6,3 },new String[] { "dobry den","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","namaste","zdravo","hola","hi","zdravo" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"dobry den",2,new Integer[] { 6,3 },new String[] { "dobry den","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","namaste","zdravo","hola","hi","zdravo" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ciao",2,new Integer[] { 6,3 },new String[] { "dobry den","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","namaste","zdravo","hola","hi","zdravo" },new Integer[] { 3,6 }) ;
      return ok_sofar ;
  }


  static boolean test_51 ()
  {
      
      testName = "test_51" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","salaam","dobry den" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"bon dia",4,new Integer[] { 12 },new String[] { "bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","salaam","dobry den" },new Integer[] { 12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"ola",4,new Integer[] { 11,12 },new String[] { "ola","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","salaam","dobry den" },new Integer[] { 11,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hola",4,new Integer[] { 3,11,12 },new String[] { "hola","ola","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","salaam","dobry den" },new Integer[] { 3,11,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"kaixo",4,new Integer[] { 8,3,11,12 },new String[] { "kaixo","hola","ola","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","salaam","dobry den" },new Integer[] { 8,3,11,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"ciao",4,new Integer[] { 9,8,3,11 },new String[] { "ciao","kaixo","hola","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","salaam","bon dia" },new Integer[] { 9,8,3,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"ola",4,new Integer[] { 9,8,3,11 },new String[] { "ciao","kaixo","hola","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","salaam","bon dia" },new Integer[] { 11,9,8,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"salaam",4,new Integer[] { 5,9,8,11 },new String[] { "salaam","ciao","kaixo","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","salaam","bon dia" },new Integer[] { 5,11,9,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"bon dia",4,new Integer[] { 1,5,9,11 },new String[] { "bon dia","salaam","ciao","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","salaam","bon dia" },new Integer[] { 1,5,11,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hi",4,new Integer[] { 2,1,5,11 },new String[] { "hi","bon dia","salaam","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","salaam","bon dia" },new Integer[] { 2,1,5,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hola",4,new Integer[] { 3,2,1,5 },new String[] { "hola","hi","bon dia","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","ola","bon dia" },new Integer[] { 3,2,1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hello",4,new Integer[] { 3,2,1,5 },new String[] { "hola","hi","hello","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","ola","bon dia" },new Integer[] { 1,3,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hola",4,new Integer[] { 3,2,1,5 },new String[] { "hola","hi","hello","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","ola","bon dia" },new Integer[] { 3,1,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hola",4,new Integer[] { 3,2,1,5 },new String[] { "hola","hi","hello","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","hei","hallo","ola","kaixo","ciao","hello","ola","bon dia" },new Integer[] { 3,1,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"hej",4,new Integer[] { 7,3,2,1 },new String[] { "hej","hola","hi","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","salaam","hallo","ola","kaixo","ciao","hello","ola","bon dia" },new Integer[] { 7,3,1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hello",4,new Integer[] { 10,7,3,1 },new String[] { "hello","hej","hola","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","salaam","hallo","ola","kaixo","ciao","hello","ola","bon dia" },new Integer[] { 10,7,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hello",4,new Integer[] { 10,7,3,1 },new String[] { "hello","hej","hola","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","hola","namaste","salaam","hallo","ola","kaixo","ciao","hello","ola","bon dia" },new Integer[] { 10,7,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"ola",4,new Integer[] { 12,10,7,3 },new String[] { "ola","hello","hej","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","hi","hola","namaste","salaam","hallo","ola","kaixo","ciao","hello","ola","bon dia" },new Integer[] { 12,10,7,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"salaam",4,new Integer[] { 5,12,10,7 },new String[] { "salaam","ola","hello","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","hi","hola","namaste","salaam","hallo","ola","kaixo","ciao","hello","ola","bon dia" },new Integer[] { 5,12,10,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"ciao",4,new Integer[] { 2,5,12,10 },new String[] { "ciao","salaam","ola","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","hi","hola","namaste","salaam","hallo","hej","kaixo","ciao","hello","ola","bon dia" },new Integer[] { 2,5,12,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"zdravo",4,new Integer[] { 6,2,5,12 },new String[] { "zdravo","ciao","salaam","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","hi","hola","namaste","salaam","hallo","hej","kaixo","ciao","hello","ola","bon dia" },new Integer[] { 6,2,5,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hello",4,new Integer[] { 1,6,2,5 },new String[] { "hello","zdravo","ciao","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","hi","hola","namaste","salaam","hallo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 1,6,2,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"ciao",4,new Integer[] { 9,1,6,2 },new String[] { "ciao","hello","zdravo","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","hi","hola","namaste","salaam","hallo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 9,1,6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hola",4,new Integer[] { 3,9,1,6 },new String[] { "hola","ciao","hello","zdravo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","hallo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 3,9,1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"salaam",4,new Integer[] { 5,3,9,1 },new String[] { "salaam","hola","ciao","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 5,3,9,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hello",4,new Integer[] { 5,3,9,1 },new String[] { "salaam","hola","ciao","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 1,5,3,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hola",4,new Integer[] { 5,3,9,1 },new String[] { "salaam","hola","ciao","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 3,1,5,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"bon dia",4,new Integer[] { 5,3,9,1 },new String[] { "salaam","hola","bon dia","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 9,3,1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"hej",4,new Integer[] { 11,3,9,1 },new String[] { "hej","hola","bon dia","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 11,9,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"hei",4,new Integer[] { 11,3,9,1 },new String[] { "hei","hola","bon dia","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 11,9,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"kaixo",4,new Integer[] { 6,11,3,9 },new String[] { "kaixo","hei","hola","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 6,11,9,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"kaixo",4,new Integer[] { 6,11,3,9 },new String[] { "kaixo","hei","hola","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 6,11,9,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"namaste",4,new Integer[] { 10,6,11,9 },new String[] { "namaste","kaixo","hei","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 10,6,11,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"privet",4,new Integer[] { 10,6,11,9 },new String[] { "namaste","privet","hei","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","ciao","hello","ola","ola" },new Integer[] { 6,10,11,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hallo",4,new Integer[] { 5,10,6,11 },new String[] { "hallo","namaste","privet","hei" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","bon dia","hello","ola","ola" },new Integer[] { 5,6,10,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"hej",4,new Integer[] { 7,5,10,6 },new String[] { "hej","hallo","namaste","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","bon dia","hello","hei","ola" },new Integer[] { 7,5,6,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"hola",4,new Integer[] { 8,7,5,6 },new String[] { "hola","hej","hallo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","zdravo","hej","kaixo","bon dia","namaste","hei","ola" },new Integer[] { 8,7,5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hei",4,new Integer[] { 11,8,7,5 },new String[] { "hei","hola","hej","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","privet","hej","kaixo","bon dia","namaste","hei","ola" },new Integer[] { 11,8,7,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hallo",4,new Integer[] { 11,8,7,5 },new String[] { "hei","hola","hej","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","privet","hej","kaixo","bon dia","namaste","hei","ola" },new Integer[] { 5,11,8,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"hola",4,new Integer[] { 10,11,8,5 },new String[] { "hola","hei","hola","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","privet","hej","kaixo","bon dia","namaste","hei","ola" },new Integer[] { 10,5,11,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"dobry den",4,new Integer[] { 10,11,8,5 },new String[] { "hola","dobry den","hola","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","privet","hej","kaixo","bon dia","namaste","hei","ola" },new Integer[] { 11,10,5,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"privet",4,new Integer[] { 6,10,11,5 },new String[] { "privet","hola","dobry den","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","privet","hej","hola","bon dia","namaste","hei","ola" },new Integer[] { 6,11,10,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"privet",4,new Integer[] { 6,10,11,5 },new String[] { "privet","hola","dobry den","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","salaam","privet","hej","hola","bon dia","namaste","hei","ola" },new Integer[] { 6,11,10,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"ciao",4,new Integer[] { 2,6,10,11 },new String[] { "ciao","privet","hola","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","hallo","privet","hej","hola","bon dia","namaste","hei","ola" },new Integer[] { 2,6,11,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"bon dia",4,new Integer[] { 4,2,6,11 },new String[] { "bon dia","ciao","privet","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","hallo","privet","hej","hola","bon dia","hola","hei","ola" },new Integer[] { 4,2,6,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"hola",4,new Integer[] { 8,4,2,6 },new String[] { "hola","bon dia","ciao","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","hallo","privet","hej","hola","bon dia","hola","dobry den","ola" },new Integer[] { 8,4,2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"ciao",4,new Integer[] { 8,4,2,6 },new String[] { "hola","bon dia","ciao","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","hallo","privet","hej","hola","bon dia","hola","dobry den","ola" },new Integer[] { 2,8,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"dobry den",4,new Integer[] { 11,8,4,2 },new String[] { "dobry den","hola","bon dia","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","namaste","hallo","privet","hej","hola","bon dia","hola","dobry den","ola" },new Integer[] { 11,2,8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"hej",4,new Integer[] { 9,11,8,2 },new String[] { "hej","dobry den","hola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","bon dia","hallo","privet","hej","hola","bon dia","hola","dobry den","ola" },new Integer[] { 9,11,2,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hello",4,new Integer[] { 1,9,11,2 },new String[] { "hello","hej","dobry den","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","bon dia","hallo","privet","hej","hola","bon dia","hola","dobry den","ola" },new Integer[] { 1,9,11,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"hej",4,new Integer[] { 1,9,11,2 },new String[] { "hello","hej","dobry den","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","bon dia","hallo","privet","hej","hola","bon dia","hola","dobry den","ola" },new Integer[] { 9,1,11,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"privet",4,new Integer[] { 6,1,9,11 },new String[] { "privet","hello","hej","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","bon dia","hallo","privet","hej","hola","bon dia","hola","dobry den","ola" },new Integer[] { 6,9,1,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"hej",4,new Integer[] { 6,1,9,11 },new String[] { "privet","hello","hej","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","bon dia","hallo","privet","hej","hola","bon dia","hola","dobry den","ola" },new Integer[] { 9,6,1,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"ciao",4,new Integer[] { 2,6,1,9 },new String[] { "ciao","privet","hello","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","bon dia","hallo","privet","hej","hola","bon dia","hola","dobry den","ola" },new Integer[] { 2,9,6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"ola",4,new Integer[] { 12,2,6,9 },new String[] { "ola","ciao","privet","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","bon dia","hallo","privet","hej","hola","bon dia","hola","dobry den","ola" },new Integer[] { 12,2,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"ciao",4,new Integer[] { 7,12,2,9 },new String[] { "ciao","ola","ciao","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hola","bon dia","hallo","privet","hej","hola","bon dia","hola","dobry den","ola" },new Integer[] { 7,12,2,9 }) ;
      return ok_sofar ;
  }


  static boolean test_52 ()
  {
      
      testName = "test_52" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(4,new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","bon dia","hallo","rimaykullayki","namaste","salaam","hej","ciao","ola","hi","privet","hola" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hola",4,new Integer[] { 6 },new String[] { "hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","bon dia","hallo","rimaykullayki","namaste","salaam","hej","ciao","ola","hi","privet","hola" },new Integer[] { 6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"rimaykullayki",4,new Integer[] { 4,6 },new String[] { "rimaykullayki","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","bon dia","hallo","rimaykullayki","namaste","salaam","hej","ciao","ola","hi","privet","hola" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"zdravo",4,new Integer[] { 9,4,6 },new String[] { "zdravo","rimaykullayki","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","bon dia","hallo","rimaykullayki","namaste","salaam","hej","ciao","ola","hi","privet","hola" },new Integer[] { 9,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hello",4,new Integer[] { 1,9,4,6 },new String[] { "hello","zdravo","rimaykullayki","hola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","bon dia","hallo","rimaykullayki","namaste","salaam","hej","ciao","ola","hi","privet","hola" },new Integer[] { 1,9,4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"ciao",4,new Integer[] { 8,1,9,4 },new String[] { "ciao","hello","zdravo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","bon dia","hallo","rimaykullayki","namaste","hola","hej","ciao","ola","hi","privet","hola" },new Integer[] { 8,1,9,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"ciao",4,new Integer[] { 8,1,9,4 },new String[] { "ciao","hello","ciao","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","bon dia","hallo","rimaykullayki","namaste","hola","hej","ciao","ola","hi","privet","hola" },new Integer[] { 9,8,1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"privet",4,new Integer[] { 6,8,1,9 },new String[] { "privet","ciao","hello","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","bon dia","hallo","rimaykullayki","namaste","hola","hej","ciao","ola","hi","privet","hola" },new Integer[] { 6,9,8,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"ciao",4,new Integer[] { 6,8,1,9 },new String[] { "privet","ciao","hello","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "kaixo","bon dia","hallo","rimaykullayki","namaste","hola","hej","ciao","ola","hi","privet","hola" },new Integer[] { 9,6,8,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hi",4,new Integer[] { 10,6,8,9 },new String[] { "hi","privet","ciao","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","bon dia","hallo","rimaykullayki","namaste","hola","hej","ciao","ola","hi","privet","hola" },new Integer[] { 10,9,6,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hello",4,new Integer[] { 1,10,6,9 },new String[] { "hello","hi","privet","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","bon dia","hallo","rimaykullayki","namaste","hola","hej","ciao","ola","hi","privet","hola" },new Integer[] { 1,10,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"ciao",4,new Integer[] { 8,1,10,9 },new String[] { "ciao","hello","hi","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","bon dia","hallo","rimaykullayki","namaste","privet","hej","ciao","ola","hi","privet","hola" },new Integer[] { 8,1,10,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"ciao",4,new Integer[] { 8,1,10,9 },new String[] { "ciao","hello","hi","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","bon dia","hallo","rimaykullayki","namaste","privet","hej","ciao","ola","hi","privet","hola" },new Integer[] { 9,8,1,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"ciao",4,new Integer[] { 2,8,1,9 },new String[] { "ciao","ciao","hello","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","bon dia","hallo","rimaykullayki","namaste","privet","hej","ciao","ola","hi","privet","hola" },new Integer[] { 2,9,8,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"rimaykullayki",4,new Integer[] { 4,2,8,9 },new String[] { "rimaykullayki","ciao","ciao","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","bon dia","hallo","rimaykullayki","namaste","privet","hej","ciao","ola","hi","privet","hola" },new Integer[] { 4,2,9,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"salaam",4,new Integer[] { 4,2,8,9 },new String[] { "rimaykullayki","ciao","salaam","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","bon dia","hallo","rimaykullayki","namaste","privet","hej","ciao","ola","hi","privet","hola" },new Integer[] { 8,4,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"salaam",4,new Integer[] { 4,2,8,9 },new String[] { "rimaykullayki","ciao","salaam","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","bon dia","hallo","rimaykullayki","namaste","privet","hej","ciao","ola","hi","privet","hola" },new Integer[] { 8,4,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hi",4,new Integer[] { 10,4,2,8 },new String[] { "hi","rimaykullayki","ciao","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","bon dia","hallo","rimaykullayki","namaste","privet","hej","ciao","ciao","hi","privet","hola" },new Integer[] { 10,8,4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"kaixo",4,new Integer[] { 11,10,4,8 },new String[] { "kaixo","hi","rimaykullayki","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","privet","hej","ciao","ciao","hi","privet","hola" },new Integer[] { 11,10,8,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"hej",4,new Integer[] { 7,11,10,8 },new String[] { "hej","kaixo","hi","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","privet","hej","ciao","ciao","hi","privet","hola" },new Integer[] { 7,11,10,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hello",4,new Integer[] { 1,7,11,10 },new String[] { "hello","hej","kaixo","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","privet","hej","salaam","ciao","hi","privet","hola" },new Integer[] { 1,7,11,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"salaam",4,new Integer[] { 8,1,7,11 },new String[] { "salaam","hello","hej","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","privet","hej","salaam","ciao","hi","privet","hola" },new Integer[] { 8,1,7,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hi",4,new Integer[] { 10,8,1,7 },new String[] { "hi","salaam","hello","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","privet","hej","salaam","ciao","hi","kaixo","hola" },new Integer[] { 10,8,1,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"rimaykullayki",4,new Integer[] { 4,10,8,1 },new String[] { "rimaykullayki","hi","salaam","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","privet","hej","salaam","ciao","hi","kaixo","hola" },new Integer[] { 4,10,8,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"kaixo",4,new Integer[] { 11,4,10,8 },new String[] { "kaixo","rimaykullayki","hi","salaam" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","privet","hej","salaam","ciao","hi","kaixo","hola" },new Integer[] { 11,4,10,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"dobry den",4,new Integer[] { 6,11,4,10 },new String[] { "dobry den","kaixo","rimaykullayki","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","privet","hej","salaam","ciao","hi","kaixo","hola" },new Integer[] { 6,11,4,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"ciao",4,new Integer[] { 9,6,11,4 },new String[] { "ciao","dobry den","kaixo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","privet","hej","salaam","ciao","hi","kaixo","hola" },new Integer[] { 9,6,11,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"ciao",4,new Integer[] { 9,6,11,4 },new String[] { "ciao","dobry den","kaixo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","privet","hej","salaam","ciao","hi","kaixo","hola" },new Integer[] { 9,6,11,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"ciao",4,new Integer[] { 2,9,6,11 },new String[] { "ciao","ciao","dobry den","kaixo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","privet","hej","salaam","ciao","hi","kaixo","hola" },new Integer[] { 2,9,6,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"namaste",4,new Integer[] { 8,2,9,6 },new String[] { "namaste","ciao","ciao","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","privet","hej","salaam","ciao","hi","kaixo","hola" },new Integer[] { 8,2,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(12,"ola",4,new Integer[] { 12,8,2,9 },new String[] { "ola","namaste","ciao","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","hej","salaam","ciao","hi","kaixo","hola" },new Integer[] { 12,8,2,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"namaste",4,new Integer[] { 7,12,8,2 },new String[] { "namaste","ola","namaste","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","hej","salaam","ciao","hi","kaixo","hola" },new Integer[] { 7,12,8,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hi",4,new Integer[] { 10,7,12,8 },new String[] { "hi","namaste","ola","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","hej","salaam","ciao","hi","kaixo","hola" },new Integer[] { 10,7,12,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"dobry den",4,new Integer[] { 6,10,7,12 },new String[] { "dobry den","hi","namaste","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","hej","namaste","ciao","hi","kaixo","hola" },new Integer[] { 6,10,7,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"rimaykullayki",4,new Integer[] { 4,6,10,7 },new String[] { "rimaykullayki","dobry den","hi","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","hej","namaste","ciao","hi","kaixo","ola" },new Integer[] { 4,6,10,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"dobry den",4,new Integer[] { 4,6,10,7 },new String[] { "rimaykullayki","dobry den","hi","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","hej","namaste","ciao","hi","kaixo","ola" },new Integer[] { 6,4,10,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(9,"ciao",4,new Integer[] { 9,4,6,10 },new String[] { "ciao","rimaykullayki","dobry den","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","ciao","hi","kaixo","ola" },new Integer[] { 9,6,4,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"ola",4,new Integer[] { 12,9,4,6 },new String[] { "ola","ciao","rimaykullayki","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","ciao","hi","kaixo","ola" },new Integer[] { 12,9,6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(10,"hi",4,new Integer[] { 10,12,9,6 },new String[] { "hi","ola","ciao","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","ciao","hi","kaixo","ola" },new Integer[] { 10,12,9,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"namaste",4,new Integer[] { 8,10,12,9 },new String[] { "namaste","hi","ola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","ciao","hi","kaixo","ola" },new Integer[] { 8,10,12,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"hi",4,new Integer[] { 11,8,10,12 },new String[] { "hi","namaste","hi","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","ciao","hi","kaixo","ola" },new Integer[] { 11,8,10,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"privet",4,new Integer[] { 9,11,8,10 },new String[] { "privet","hi","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","ciao","hi","kaixo","ola" },new Integer[] { 9,11,8,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"hej",4,new Integer[] { 9,11,8,10 },new String[] { "hej","hi","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","ciao","hi","kaixo","ola" },new Integer[] { 9,11,8,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hi",4,new Integer[] { 9,11,8,10 },new String[] { "hej","hi","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","ciao","hi","kaixo","ola" },new Integer[] { 10,9,11,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hallo",4,new Integer[] { 3,9,11,10 },new String[] { "hallo","hej","hi","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","ciao","hi","kaixo","ola" },new Integer[] { 3,10,9,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"ola",4,new Integer[] { 12,3,9,10 },new String[] { "ola","hallo","hej","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","ciao","hi","hi","ola" },new Integer[] { 12,3,10,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"hej",4,new Integer[] { 7,12,3,10 },new String[] { "hej","ola","hallo","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","hej","hi","hi","ola" },new Integer[] { 7,12,3,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"rimaykullayki",4,new Integer[] { 4,7,12,3 },new String[] { "rimaykullayki","hej","ola","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","hej","hi","hi","ola" },new Integer[] { 4,7,12,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"namaste",4,new Integer[] { 5,4,7,12 },new String[] { "namaste","rimaykullayki","hej","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","hej","hi","hi","ola" },new Integer[] { 5,4,7,12 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"bon dia",4,new Integer[] { 1,5,4,7 },new String[] { "bon dia","namaste","rimaykullayki","hej" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","namaste","namaste","hej","hi","hi","ola" },new Integer[] { 1,5,4,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"privet",4,new Integer[] { 3,1,5,4 },new String[] { "privet","bon dia","namaste","rimaykullayki" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","hej","namaste","hej","hi","hi","ola" },new Integer[] { 3,1,5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"zdravo",4,new Integer[] { 2,3,1,5 },new String[] { "zdravo","privet","bon dia","namaste" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","hej","namaste","hej","hi","hi","ola" },new Integer[] { 2,3,1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"namaste",4,new Integer[] { 9,2,3,1 },new String[] { "namaste","zdravo","privet","bon dia" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "hello","ciao","hallo","rimaykullayki","namaste","dobry den","hej","namaste","hej","hi","hi","ola" },new Integer[] { 9,2,3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"hallo",4,new Integer[] { 11,9,2,3 },new String[] { "hallo","namaste","zdravo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","ciao","hallo","rimaykullayki","namaste","dobry den","hej","namaste","hej","hi","hi","ola" },new Integer[] { 11,9,2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"privet",4,new Integer[] { 11,9,2,3 },new String[] { "hallo","namaste","zdravo","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","ciao","hallo","rimaykullayki","namaste","dobry den","hej","namaste","hej","hi","hi","ola" },new Integer[] { 3,11,9,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"hi",4,new Integer[] { 11,9,2,3 },new String[] { "hallo","namaste","hi","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","ciao","hallo","rimaykullayki","namaste","dobry den","hej","namaste","hej","hi","hi","ola" },new Integer[] { 2,3,11,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(7,"hej",4,new Integer[] { 7,11,2,3 },new String[] { "hej","hallo","hi","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","ciao","hallo","rimaykullayki","namaste","dobry den","hej","namaste","namaste","hi","hi","ola" },new Integer[] { 7,2,3,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"namaste",4,new Integer[] { 4,7,2,3 },new String[] { "namaste","hej","hi","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","ciao","hallo","rimaykullayki","namaste","dobry den","hej","namaste","namaste","hi","hallo","ola" },new Integer[] { 4,7,2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hi",4,new Integer[] { 4,7,2,3 },new String[] { "namaste","hej","hi","privet" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","ciao","hallo","rimaykullayki","namaste","dobry den","hej","namaste","namaste","hi","hallo","ola" },new Integer[] { 2,4,7,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"ciao",4,new Integer[] { 6,4,7,2 },new String[] { "ciao","namaste","hej","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","ciao","privet","rimaykullayki","namaste","dobry den","hej","namaste","namaste","hi","hallo","ola" },new Integer[] { 6,2,4,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(10,"hi",4,new Integer[] { 10,6,4,2 },new String[] { "hi","ciao","namaste","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","ciao","privet","rimaykullayki","namaste","dobry den","hej","namaste","namaste","hi","hallo","ola" },new Integer[] { 10,6,2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(8,"namaste",4,new Integer[] { 8,10,6,2 },new String[] { "namaste","hi","ciao","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","ciao","privet","namaste","namaste","dobry den","hej","namaste","namaste","hi","hallo","ola" },new Integer[] { 8,10,6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(8,"hello",4,new Integer[] { 8,10,6,2 },new String[] { "hello","hi","ciao","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","ciao","privet","namaste","namaste","dobry den","hej","namaste","namaste","hi","hallo","ola" },new Integer[] { 8,10,6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(11,"hallo",4,new Integer[] { 11,8,10,6 },new String[] { "hallo","hello","hi","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","privet","namaste","namaste","dobry den","hej","namaste","namaste","hi","hallo","ola" },new Integer[] { 11,8,10,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"hi",4,new Integer[] { 2,11,8,10 },new String[] { "hi","hallo","hello","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","privet","namaste","namaste","ciao","hej","namaste","namaste","hi","hallo","ola" },new Integer[] { 2,11,8,10 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(7,"dobry den",4,new Integer[] { 7,2,11,8 },new String[] { "dobry den","hi","hallo","hello" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","privet","namaste","namaste","ciao","hej","namaste","namaste","hi","hallo","ola" },new Integer[] { 7,2,11,8 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"kaixo",4,new Integer[] { 9,7,2,11 },new String[] { "kaixo","dobry den","hi","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","privet","namaste","namaste","ciao","hej","hello","namaste","hi","hallo","ola" },new Integer[] { 9,7,2,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(9,"ciao",4,new Integer[] { 9,7,2,11 },new String[] { "ciao","dobry den","hi","hallo" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","privet","namaste","namaste","ciao","hej","hello","namaste","hi","hallo","ola" },new Integer[] { 9,7,2,11 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(12,"ola",4,new Integer[] { 12,9,7,2 },new String[] { "ola","ciao","dobry den","hi" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","privet","namaste","namaste","ciao","hej","hello","namaste","hi","hallo","ola" },new Integer[] { 12,9,7,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hi",4,new Integer[] { 6,12,9,7 },new String[] { "hi","ola","ciao","dobry den" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","privet","namaste","namaste","ciao","hej","hello","namaste","hi","hallo","ola" },new Integer[] { 6,12,9,7 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hello",4,new Integer[] { 1,6,12,9 },new String[] { "hello","hi","ola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","privet","namaste","namaste","ciao","dobry den","hello","namaste","hi","hallo","ola" },new Integer[] { 1,6,12,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hello",4,new Integer[] { 1,6,12,9 },new String[] { "hello","hello","ola","ciao" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","privet","namaste","namaste","ciao","dobry den","hello","namaste","hi","hallo","ola" },new Integer[] { 6,1,12,9 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(11,"salaam",4,new Integer[] { 11,1,6,12 },new String[] { "salaam","hello","hello","ola" },new Integer[] { 1,2,3,4,5,6,7,8,9,10,11,12 },new String[] { "bon dia","hi","privet","namaste","namaste","ciao","dobry den","hello","ciao","hi","hallo","ola" },new Integer[] { 11,6,1,12 }) ;
      return ok_sofar ;
  }


  static boolean test_53 ()
  {
      
      testName = "test_53" ;
      callSeq = "" ;
      cache = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab7.constructor(2,new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","ola","hej","privet","hola","kaixo" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hei",2,new Integer[] { 1 },new String[] { "hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","ola","hej","privet","hola","kaixo" },new Integer[] { 1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"ola",2,new Integer[] { 2,1 },new String[] { "ola","hei" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","ola","hej","privet","hola","kaixo" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hallo",2,new Integer[] { 2,1 },new String[] { "ola","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","ola","hej","privet","hola","kaixo" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"kaixo",2,new Integer[] { 6,1 },new String[] { "kaixo","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","ola","hej","privet","hola","kaixo" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hola",2,new Integer[] { 5,6 },new String[] { "hola","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","ola","hej","privet","hola","kaixo" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"kaixo",2,new Integer[] { 5,6 },new String[] { "hola","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","ola","hej","privet","hola","kaixo" },new Integer[] { 6,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hej",2,new Integer[] { 5,6 },new String[] { "hej","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","ola","hej","privet","hola","kaixo" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"privet",2,new Integer[] { 4,5 },new String[] { "privet","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","ola","hej","privet","hola","kaixo" },new Integer[] { 4,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"hallo",2,new Integer[] { 1,4 },new String[] { "hallo","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","ola","hej","privet","hej","kaixo" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"dobry den",2,new Integer[] { 1,4 },new String[] { "dobry den","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","ola","hej","privet","hej","kaixo" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"ola",2,new Integer[] { 2,1 },new String[] { "ola","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hallo","ola","hej","privet","hej","kaixo" },new Integer[] { 2,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hallo",2,new Integer[] { 4,2 },new String[] { "hallo","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","ola","hej","privet","hej","kaixo" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hallo",2,new Integer[] { 4,2 },new String[] { "hallo","ola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","ola","hej","privet","hej","kaixo" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"dobry den",2,new Integer[] { 4,2 },new String[] { "hallo","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","ola","hej","privet","hej","kaixo" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(6,"kaixo",2,new Integer[] { 6,2 },new String[] { "kaixo","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","ola","hej","hallo","hej","kaixo" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"rimaykullayki",2,new Integer[] { 6,2 },new String[] { "rimaykullayki","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","ola","hej","hallo","hej","kaixo" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"kaixo",2,new Integer[] { 1,6 },new String[] { "kaixo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","dobry den","hej","hallo","hej","kaixo" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"kaixo",2,new Integer[] { 1,6 },new String[] { "kaixo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","dobry den","hej","hallo","hej","kaixo" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hej",2,new Integer[] { 3,1 },new String[] { "hej","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "dobry den","dobry den","hej","hallo","hej","rimaykullayki" },new Integer[] { 3,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hi",2,new Integer[] { 5,3 },new String[] { "hi","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","dobry den","hej","hallo","hej","rimaykullayki" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"hello",2,new Integer[] { 1,5 },new String[] { "hello","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","dobry den","hej","hallo","hej","rimaykullayki" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"privet",2,new Integer[] { 6,1 },new String[] { "privet","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","dobry den","hej","hallo","hi","rimaykullayki" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"ciao",2,new Integer[] { 6,1 },new String[] { "ciao","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "kaixo","dobry den","hej","hallo","hi","rimaykullayki" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"dobry den",2,new Integer[] { 2,6 },new String[] { "dobry den","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","dobry den","hej","hallo","hi","rimaykullayki" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"ola",2,new Integer[] { 4,2 },new String[] { "ola","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","dobry den","hej","hallo","hi","ciao" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"ola",2,new Integer[] { 4,2 },new String[] { "ola","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","dobry den","hej","hallo","hi","ciao" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"kaixo",2,new Integer[] { 4,2 },new String[] { "ola","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","dobry den","hej","hallo","hi","ciao" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"namaste",2,new Integer[] { 4,2 },new String[] { "namaste","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","dobry den","hej","hallo","hi","ciao" },new Integer[] { 4,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"privet",2,new Integer[] { 1,4 },new String[] { "privet","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","kaixo","hej","hallo","hi","ciao" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"namaste",2,new Integer[] { 1,4 },new String[] { "privet","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","kaixo","hej","hallo","hi","ciao" },new Integer[] { 4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(1,"bon dia",2,new Integer[] { 1,4 },new String[] { "bon dia","namaste" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","kaixo","hej","hallo","hi","ciao" },new Integer[] { 1,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hello",2,new Integer[] { 6,1 },new String[] { "hello","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "hello","kaixo","hej","namaste","hi","ciao" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hallo",2,new Integer[] { 4,6 },new String[] { "hallo","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","kaixo","hej","namaste","hi","ciao" },new Integer[] { 4,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hej",2,new Integer[] { 3,4 },new String[] { "hej","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","kaixo","hej","namaste","hi","hello" },new Integer[] { 3,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"kaixo",2,new Integer[] { 3,4 },new String[] { "hej","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","kaixo","hej","namaste","hi","hello" },new Integer[] { 4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"privet",2,new Integer[] { 2,4 },new String[] { "privet","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","kaixo","hej","namaste","hi","hello" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"privet",2,new Integer[] { 2,4 },new String[] { "privet","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","kaixo","hej","namaste","hi","hello" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"ciao",2,new Integer[] { 2,4 },new String[] { "ciao","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","kaixo","hej","namaste","hi","hello" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"bon dia",2,new Integer[] { 1,2 },new String[] { "bon dia","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","kaixo","hej","kaixo","hi","hello" },new Integer[] { 1,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"privet",2,new Integer[] { 4,1 },new String[] { "privet","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","ciao","hej","kaixo","hi","hello" },new Integer[] { 4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"salaam",2,new Integer[] { 6,4 },new String[] { "salaam","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","ciao","hej","kaixo","hi","hello" },new Integer[] { 6,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"bon dia",2,new Integer[] { 1,6 },new String[] { "bon dia","salaam" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","ciao","hej","privet","hi","hello" },new Integer[] { 1,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hi",2,new Integer[] { 5,1 },new String[] { "hi","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","ciao","hej","privet","hi","salaam" },new Integer[] { 5,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"bon dia",2,new Integer[] { 5,1 },new String[] { "hi","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","ciao","hej","privet","hi","salaam" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"privet",2,new Integer[] { 4,1 },new String[] { "privet","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","ciao","hej","privet","hi","salaam" },new Integer[] { 4,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(2,"ciao",2,new Integer[] { 2,4 },new String[] { "ciao","privet" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","ciao","hej","privet","hi","salaam" },new Integer[] { 2,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"rimaykullayki",2,new Integer[] { 6,2 },new String[] { "rimaykullayki","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","ciao","hej","privet","hi","salaam" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"ciao",2,new Integer[] { 6,2 },new String[] { "ciao","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","ciao","hej","privet","hi","salaam" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"hej",2,new Integer[] { 3,6 },new String[] { "hej","ciao" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","ciao","hej","privet","hi","salaam" },new Integer[] { 3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"bon dia",2,new Integer[] { 2,3 },new String[] { "bon dia","hej" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","ciao","hej","privet","hi","ciao" },new Integer[] { 2,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"zdravo",2,new Integer[] { 6,2 },new String[] { "zdravo","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","ciao","hej","privet","hi","ciao" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(5,"hi",2,new Integer[] { 5,6 },new String[] { "hi","zdravo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","bon dia","hej","privet","hi","ciao" },new Integer[] { 5,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(1,"bon dia",2,new Integer[] { 1,5 },new String[] { "bon dia","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","bon dia","hej","privet","hi","zdravo" },new Integer[] { 1,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"kaixo",2,new Integer[] { 6,1 },new String[] { "kaixo","bon dia" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","bon dia","hej","privet","hi","zdravo" },new Integer[] { 6,1 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(2,"zdravo",2,new Integer[] { 2,6 },new String[] { "zdravo","kaixo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","bon dia","hej","privet","hi","zdravo" },new Integer[] { 2,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"hi",2,new Integer[] { 2,6 },new String[] { "zdravo","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","bon dia","hej","privet","hi","zdravo" },new Integer[] { 6,2 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hello",2,new Integer[] { 3,6 },new String[] { "hello","hi" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hej","privet","hi","zdravo" },new Integer[] { 3,6 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"namaste",2,new Integer[] { 4,3 },new String[] { "namaste","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hej","privet","hi","hi" },new Integer[] { 4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(4,"hola",2,new Integer[] { 4,3 },new String[] { "hola","hello" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hej","privet","hi","hi" },new Integer[] { 4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"dobry den",2,new Integer[] { 5,4 },new String[] { "dobry den","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hello","privet","hi","hi" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"kaixo",2,new Integer[] { 3,5 },new String[] { "kaixo","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hello","hola","hi","hi" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hola",2,new Integer[] { 3,5 },new String[] { "hola","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hello","hola","hi","hi" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hola",2,new Integer[] { 4,3 },new String[] { "hola","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hello","hola","dobry den","hi" },new Integer[] { 4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(4,"hola",2,new Integer[] { 4,3 },new String[] { "hola","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hello","hola","dobry den","hi" },new Integer[] { 4,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"dobry den",2,new Integer[] { 5,4 },new String[] { "dobry den","hola" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hola","hola","dobry den","hi" },new Integer[] { 5,4 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"hello",2,new Integer[] { 3,5 },new String[] { "hello","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hola","hola","dobry den","hi" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"ola",2,new Integer[] { 3,5 },new String[] { "ola","dobry den" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hola","hola","dobry den","hi" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(5,"hallo",2,new Integer[] { 3,5 },new String[] { "ola","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hola","hola","dobry den","hi" },new Integer[] { 5,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.get(3,"ola",2,new Integer[] { 3,5 },new String[] { "ola","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hola","hola","dobry den","hi" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(3,"rimaykullayki",2,new Integer[] { 3,5 },new String[] { "rimaykullayki","hallo" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hola","hola","dobry den","hi" },new Integer[] { 3,5 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"zdravo",2,new Integer[] { 6,3 },new String[] { "zdravo","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hola","hola","hallo","hi" },new Integer[] { 6,3 }) ;
      if (ok_sofar)
          ok_sofar = TesterLab7.put(6,"dobry den",2,new Integer[] { 6,3 },new String[] { "dobry den","rimaykullayki" },new Integer[] { 1,2,3,4,5,6 },new String[] { "bon dia","zdravo","hola","hola","hallo","hi" },new Integer[] { 6,3 }) ;
      return ok_sofar ;
  }



  @SuppressWarnings("unchecked")
  static boolean constructor(int cacheSize,
                             Integer[] storageKeys,
                             String[] storageValues) {
      boolean ok_sofar = true;

      Storage<Integer,String> storage =
        new Storage<Integer,String>(storageKeys,storageValues);
      TesterLab7.storage = storage;

      callSeq += "\n  Initial storage:";
      callSeq += "\n    "+TesterLab7.storage+"\n";
      callSeq += "\n  Cache<..> cache = new Cache<..>("+cacheSize+");";

      try {
        cache = new Cache<Integer,String>(cacheSize, storage);
      } catch ( Throwable exc ) {
	  printCallException(exc);
	  ok_sofar = false;
      }

      if (ok_sofar) {
	  try {
	      mapField = cache.getClass().getDeclaredField("map");
	      mapField.setAccessible(true);
	      TesterLab7.map =
                (Map<Integer,CacheCell<Integer,String>>)
                mapField.get(cache);
	  } catch ( Throwable exc ) {
	      printCallException("access the field map",exc);
	      ok_sofar = false;
	      return false;
	  }

	  try {
	      mapField = cache.getClass().getDeclaredField("lru");
	      mapField.setAccessible(true);
	      TesterLab7.lru = (PositionList<Integer>) mapField.get(cache);
	  } catch ( Throwable exc ) {
	      printCallException("access the field lru",exc);
	      ok_sofar = false;
	      return false;
	  }
      }

      return true;
  }

  static boolean get(int key,
                     String expected,
                     int cacheSize,
                     Integer[] cacheKeys,
                     String[] cacheValues,
                     Integer[] storageKeys,
                     String[] storageValues,
                     Integer[] lruKeys) {
      boolean ok_sofar = true;

      String call = "cache.get("+key+")";
      callSeq += "\n  "+call+";";

      try {
        String result = cache.get(key);
        if (!expected.equals(result)) {
          printError
            (ExecutionTime.LAST,
             "\nthe call "+call+" returned the value "+result+
             " but should have returned "+expected);
          ok_sofar = false;
          return ok_sofar;
        }
      } catch ( Throwable exc ) {
	  printCallException(exc);
          System.out.println
            ("\nMap contents: "+TesterLab7.map+"\n"+
             "lru contents: "+TesterLab7.lru);
	  ok_sofar = false;
          return ok_sofar;
      }

      ok_sofar =
        checkLRUandMapStorage(callSeq,
                              cacheKeys,
                              cacheValues,
                              storageKeys,
                              storageValues,
                              lruKeys);

      return ok_sofar;
  }

  static boolean put(int key,
                     String value,
                     int cacheSize,
                     Integer[] cacheKeys,
                     String[] cacheValues,
                     Integer[] storageKeys,
                     String[] storageValues,
                     Integer[] lruKeys) {
      boolean ok_sofar = true;

      callSeq += "\n  cache.put("+key+",\""+value+"\");";

      try {
        cache.put(key,value);
      } catch ( Throwable exc ) {
	  printCallException(exc);
          System.out.println
            ("\nMap contents: "+TesterLab7.map+"\n"+
             "lru contents: "+TesterLab7.lru);
	  ok_sofar = false;
          return ok_sofar;
      }

      ok_sofar =
        checkLRUandMapStorage(callSeq,
                              cacheKeys,
                              cacheValues,
                              storageKeys,
                              storageValues,
                              lruKeys);

      return ok_sofar;
  }

  static boolean checkLRUandMapStorage(String callSeq,
                                       Integer[] cacheKeys,
                                       String[] cacheValues,
                                       Integer[] storageKeys,
                                       String[] storageValues,
                                       Integer[] lruKeys) {
    boolean ok_sofar = true;

    if (ok_sofar)
      ok_sofar =
        checkExternallyConsistent(callSeq, cacheKeys, cacheValues, lruKeys);

    if (ok_sofar)
      ok_sofar =
        checkStorageExternallyConsistent(callSeq, storageKeys, storageValues);

    return ok_sofar;
  }

  static boolean checkExternallyConsistent(String callSeq,
                                           Integer[] cacheKeys,
                                           String[] cacheValues,
                                           Integer[] lruKeys) {
    boolean ok_sofar = true;

    HashSet<Entry<Integer,String>> expected =
      new HashSet<Entry<Integer,String>>();
    HashSet<Entry<Integer,String>> lru =
      new HashSet<Entry<Integer,String>>();

    if (TesterLab7.lru.size() != TesterLab7.map.size()) {
      printError
        (ExecutionTime.AFTER,
         "\nthe size of the map and the lru differ:\n\n"+
         "Map contents: "+TesterLab7.map+"\n"+
         "lru contents: "+TesterLab7.lru);
      ok_sofar = false;
      return false;
    }

    if (lruKeys.length != TesterLab7.lru.size()) {
      printError
        (ExecutionTime.AFTER,
         "\nlru should contain entries with the keys "+printArray(lruKeys)+
         " but contains the entries "+TesterLab7.lru+"\n\n"+
         "Map contents: "+TesterLab7.map+"\n"+
         "lru contents: "+TesterLab7.lru);
      return false;
    }

    Position<Integer> cursor = TesterLab7.lru.first();
    for (int i=0; i<lruKeys.length; i++) {
      Integer key = cursor.element();
      if (key == null) {
        printError
          (ExecutionTime.AFTER,
           "\nlru contains a null key: "+TesterLab7.lru+"\n"+
           "Map contents: "+TesterLab7.map+"\n"+
           "lru contents: "+TesterLab7.lru);
        return false;
      }

      if (!lruKeys[i].equals(key)) {
        printError
          (ExecutionTime.AFTER,
           "\nlru should contain keys in the order "+printArray(lruKeys)+"\n"+
           "lru contents: "+TesterLab7.lru+"\n"+
           "Map contents: "+TesterLab7.map+"\n");
        return false;
      }

      CacheCell<Integer,String> cell = TesterLab7.map.get(key);
      if (cell == null) {
        printError
          (ExecutionTime.AFTER,
           "\nlru contains a key "+key+" that has no entry in map\n"+
           "lru contents: "+TesterLab7.lru+"\n"+
           "Map contents: "+TesterLab7.map+"\n");
        return false;
      }

      if (cell.getPos() != cursor) {
        printError
          (ExecutionTime.AFTER,
           "\nthe call get("+key+") returns a cell "+cell+
           " with a position that is different from the lru position"+
           " which has key "+key+" as an element\n"+
           "lru contents: "+TesterLab7.lru+"\n"+
           "Map contents: "+TesterLab7.map+"\n");
        return false;
      }

      lru.add(new EntryImpl<Integer,String>(key, cell.getValue()));
      cursor = TesterLab7.lru.next(cursor);
    }

    for (int i=0; i<cacheKeys.length; i++) {
      expected.add(new EntryImpl<Integer,String>(cacheKeys[i], cacheValues[i]));
    }

    ok_sofar =
      ok_sofar && expected.equals(lru);

    if (!ok_sofar) {
      printError
        (ExecutionTime.AFTER,
         "\nmap contains key-value pairs: "+lru+
         "\nbut should contain "+expected+"\n"+
         "\nlru contents: "+TesterLab7.lru+"\n"+
         "Map contents: "+TesterLab7.map+"\n");
      ok_sofar = false;
    }

    return ok_sofar;
  }
  
  static boolean checkStorageExternallyConsistent(String callSeq,
                                                  Integer[] cacheKeys,
                                                  String[] cacheValues) {
    boolean ok_sofar = true;

    HashSet<Entry<Integer,String>> expected =
      new HashSet<Entry<Integer,String>>();
    HashSet<Entry<Integer,String>> storage =
      new HashSet<Entry<Integer,String>>();

    for (int i=0; i<cacheKeys.length; i++) {
      expected.add(new EntryImpl<Integer,String>(cacheKeys[i], cacheValues[i]));
    }

    for (java.util.Map.Entry<Integer,String> entry : TesterLab7.storage.entrySet()) {
      storage.add(new EntryImpl<Integer,String>(entry.getKey(), entry.getValue()));
    }

    ok_sofar =
      ok_sofar && expected.equals(storage);

    ArrayList<Entry<Integer,String>> expectedList =
      new ArrayList<Entry<Integer,String>>();
    ArrayList<Entry<Integer,String>> storageList =
      new ArrayList<Entry<Integer,String>>();

    for (java.util.Map.Entry<Integer,String> expectedEntry : TesterLab7.storage.entrySet()) {
      storageList.add(new EntryImpl<Integer,String>(expectedEntry.getKey(), expectedEntry.getValue()));
    }

    for (int i=0; i<cacheKeys.length; i++) {
      expectedList.add(new EntryImpl<Integer,String>(cacheKeys[i], cacheValues[i]));
    }

    Collections.sort(storageList, new EntryComparator());
    Collections.sort(expectedList, new EntryComparator());

    if (!ok_sofar) {
      printError
        (ExecutionTime.AFTER,
         "\nstorage contains   "+storageList+
         "\nbut should contain "+expectedList);
      ok_sofar = false;
      return false;
    }

    return ok_sofar;
  }
  
  static int test_type_to_index(String test_type) {
      if (test_type.equals("cache")) return 0;
      System.out.println("*** Error: test "+test_type+" unknown.");
      throw new RuntimeException();
  }

  static boolean results_ok_sofar(boolean[] ok_sofar, String test_type) {
      return true;
  }

  static boolean local_results_ok_sofar(boolean[] results_sofar, String test_type) {
      int index = test_type_to_index(test_type);
      return results_sofar[index];
  }

  static boolean[] combine_results(boolean result, boolean results_sofar[], String id, String test_type) {
      int index = test_type_to_index(test_type);
      results_sofar[index] = results_sofar[index] && result;
      return results_sofar;
  }

  static boolean results_ok(boolean results_sofar[], boolean general_results) {
      int successes = 0;
      for (int i=0; i<results_sofar.length; i++) {
	  if (results_sofar[i])
	      ++successes;
      }
      return successes >= results_sofar.length;
  }

static void report_results(String tester, boolean results_sofar[], boolean general_results) {
      System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");

      for (int i=0; i<results_sofar.length; i++) {
	  String testName="";
	  if (i==0) testName = "cache";

	  System.out.print("Testing results for "+testName+": ");
	  if (results_sofar[i])
	      System.out.println("succeeded");
	  else
	      System.out.println("failed");

      }

      System.out.println("\n------------------------------------------");
      if (results_ok(results_sofar,general_results)) {
	  System.out.println("\n"+tester+": Test finalizado correctamente.");
	  System.out.println("\n\n");
	  System.out.println("                                                        *");
	  System.out.println("     *                                                          *");
	  System.out.println("                                  *                  *        .--.");
	  System.out.println("      \\/ \\/  \\/  \\/                                        ./   /=*");
	  System.out.println("        \\/     \\/      *            *                ...  (_____)");
	  System.out.println("         \\ ^ ^/                                       \\ \\_((^o^))-.    *");
	  System.out.println("         (o)(O)--)--------\\.                           \\   (   ) \\ \\._.");
	  System.out.println("         |    |  ||================((~~~~~~~~~~~~~~~~~))|   ( )   | \\");
System.out.println("          \\__/             ,|        \\. * * * * * * ./  (~~~~~~~~~~)    \\");
	  System.out.println("   *        ||^||\\.____./|| |          \\___________/     ~||~~~~|~'\\____/ *");
	  System.out.println("            || ||     || || A            ||    ||         ||    |   ");
	  System.out.println("     *      <> <>     <> <>          (___||____||_____)  ((~~~~~|   *");
	  System.out.println("\n\n");
      }
      else
	  System.out.println("\n"+tester+": errores detectados.\n");
  }


  static void printWarning(String TestName) {
      System.out.println("\n*** Warning in "+TestName+":\n");
  }

  static void printError(String TestName) {
      System.out.println("\n*** Error in "+TestName+":\n");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

    static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n*** Error in "+testName+":\n");

      if (!callSeq.equals("")) {
	  System.out.print(callSeqString(time));
	  System.out.println();
	  System.out.println(callSeq);
          
      }

      switch (time) {
      case AFTER:
	  System.out.println("\nthe call to "+msg+" raised the exception "+exc+
			     " although it should not have\n");
	  break;
      default:
	  System.out.println("\nthe exception "+exc+" was raised although it "+
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
      System.out.println("\n*** Error in "+testName+":\n");
      System.out.print(callSeqString(time));
      System.out.println();
      System.out.println(callSeq);
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

  static String printArray(int[] arr) {
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

class EntryComparator implements Comparator<Entry<Integer,String>> {
  public int compare(Entry<Integer,String> e1, Entry<Integer,String> e2) {
    if (e1 == e2) return 0;
    if (e1.getKey() == null) return -1;
    if (e2.getKey() == null) return 1;
    return e1.getKey() - e2.getKey();
  }
}




