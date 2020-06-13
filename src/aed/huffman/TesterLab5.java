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

package aed.huffman;

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
import es.upm.aedlib.tree.*;
import es.upm.aedlib.Version;



@SuppressWarnings("unused")
public class TesterLab5 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";

  static boolean[] results_sofar = {true,true,true};
  static boolean general_results = true;
  static boolean testsRun = false;
  static boolean testResult = false;

  static Huffman huffman;
  static Field treeField;
  static BinaryTree<Character> tree;


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
		testMethod = TesterLab5.class.getDeclaredMethod(testName);
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
    // File generated at: 2017/11/23 -- 10:13:13
    // Seed: {1511,428392,324331}
    //
    //////////////////////////////////////////////////////////////////////



    try {
      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_3(), results_sofar, "test_3", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_4(), results_sofar, "test_4", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "constructor");

      if (results_ok_sofar(results_sofar,"constructor") && local_results_ok_sofar(results_sofar,"constructor"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "constructor");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
         combine_results(test_15(), results_sofar, "test_15", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
       results_sofar =
         combine_results(test_16(), results_sofar, "test_16", "encode");

     if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "encode");

     if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
         combine_results(test_18(), results_sofar, "test_18", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_31(), results_sofar, "test_31", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_32(), results_sofar, "test_32", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_33(), results_sofar, "test_33", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_34(), results_sofar, "test_34", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_35(), results_sofar, "test_35", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_36(), results_sofar, "test_36", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_37(), results_sofar, "test_37", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_38(), results_sofar, "test_38", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_39(), results_sofar, "test_39", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_40(), results_sofar, "test_40", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_41(), results_sofar, "test_41", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_42(), results_sofar, "test_42", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_43(), results_sofar, "test_43", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_44(), results_sofar, "test_44", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_45(), results_sofar, "test_45", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_46(), results_sofar, "test_46", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_47(), results_sofar, "test_47", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_48(), results_sofar, "test_48", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_49(), results_sofar, "test_49", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_50(), results_sofar, "test_50", "encode");

      if (results_ok_sofar(results_sofar,"encode") && local_results_ok_sofar(results_sofar,"encode"))
        results_sofar =
          combine_results(test_51(), results_sofar, "test_51", "encode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_52(), results_sofar, "test_52", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_53(), results_sofar, "test_53", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_54(), results_sofar, "test_54", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_55(), results_sofar, "test_55", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_56(), results_sofar, "test_56", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_57(), results_sofar, "test_57", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_58(), results_sofar, "test_58", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_59(), results_sofar, "test_59", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_60(), results_sofar, "test_60", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_61(), results_sofar, "test_61", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_62(), results_sofar, "test_62", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_63(), results_sofar, "test_63", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_64(), results_sofar, "test_64", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_65(), results_sofar, "test_65", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_66(), results_sofar, "test_66", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_67(), results_sofar, "test_67", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_68(), results_sofar, "test_68", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_69(), results_sofar, "test_69", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_70(), results_sofar, "test_70", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_71(), results_sofar, "test_71", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_72(), results_sofar, "test_72", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_73(), results_sofar, "test_73", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_74(), results_sofar, "test_74", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_75(), results_sofar, "test_75", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_76(), results_sofar, "test_76", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_77(), results_sofar, "test_77", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_78(), results_sofar, "test_78", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_79(), results_sofar, "test_79", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_80(), results_sofar, "test_80", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_81(), results_sofar, "test_81", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_82(), results_sofar, "test_82", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_83(), results_sofar, "test_83", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_84(), results_sofar, "test_84", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_85(), results_sofar, "test_85", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_86(), results_sofar, "test_86", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_87(), results_sofar, "test_87", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_88(), results_sofar, "test_88", "decode");

      if (results_ok_sofar(results_sofar,"decode") && local_results_ok_sofar(results_sofar,"decode"))
        results_sofar =
          combine_results(test_89(), results_sofar, "test_89", "decode");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          return false;
      }


    report_results("TesterLab5",results_sofar,general_results);


    if (results_ok(results_sofar,general_results))
      return true;
    else
      return false;
  }



  private static boolean test_1 ()
  {
      
      testName = "test_1" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)98)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(97,"0"),new CharCode(98,"1") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(97,"0"),new CharCode(98,"10"),new CharCode(99,"11") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(97,"01"),new CharCode(98,"00"),new CharCode(99,"1") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)100)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)116)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)101)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)104)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)71)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)111)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(71,"110"),new CharCode(100,"000"),new CharCode(116,"001"),new CharCode(111,"111"),new CharCode(104,"10"),new CharCode(101,"01") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)97)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)109)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)104)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)114)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)101)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)116)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)100)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(116,"110"),new CharCode(109,"0001"),new CharCode(114,"01"),new CharCode(97,"0000"),new CharCode(100,"111"),new CharCode(101,"10"),new CharCode(104,"001") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)100)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)87)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)110)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)101)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)109)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)111)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)119)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(100,"00"),new CharCode(111,"1101"),new CharCode(87,"01"),new CharCode(109,"1100"),new CharCode(119,"111"),new CharCode(110,"100"),new CharCode(101,"101") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)121)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)98)) ;
      Position<Character> var6 = tree.insertRight(var2,((char)101)) ;
      Position<Character> var7 = tree.insertRight(var1,((char)104)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)105)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)118)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)116)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)108)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(98,"00001"),new CharCode(116,"110"),new CharCode(118,"10"),new CharCode(105,"01"),new CharCode(101,"0001"),new CharCode(121,"00000"),new CharCode(108,"111"),new CharCode(104,"001") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)100)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)117)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)104)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)111)) ;
      Position<Character> var10 = tree.insertRight(var6,((char)119)) ;
      Position<Character> var11 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)115)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)110)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(119,"1011"),new CharCode(117,"100"),new CharCode(97,"01"),new CharCode(115,"110"),new CharCode(110,"111"),new CharCode(104,"10100"),new CharCode(111,"10101"),new CharCode(100,"00") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)111)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)103)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)108)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)118)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)100)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)97)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)105)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)101)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(111,"00"),new CharCode(118,"110"),new CharCode(97,"111100"),new CharCode(108,"10"),new CharCode(103,"01"),new CharCode(100,"1110"),new CharCode(101,"11111"),new CharCode(105,"111101") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)114)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)111)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)97)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)121)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)110)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)105)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)116)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)117)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(110,"100"),new CharCode(116,"110"),new CharCode(121,"0111"),new CharCode(111,"010"),new CharCode(114,"00"),new CharCode(105,"101"),new CharCode(117,"111"),new CharCode(97,"0110") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)101)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)121)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)97)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)99)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)111)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)117)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)110)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)114)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)116)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(97,"010"),new CharCode(101,"000"),new CharCode(116,"111"),new CharCode(117,"101"),new CharCode(110,"1100"),new CharCode(99,"011"),new CharCode(114,"1101"),new CharCode(121,"001"),new CharCode(111,"100") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)109)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)101)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)111)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)99)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)116)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)110)) ;
      Position<Character> var12 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)97)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)114)) ;
      Position<Character> var15 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)119)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)104)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(97,"101110"),new CharCode(116,"101100"),new CharCode(99,"1010"),new CharCode(104,"111"),new CharCode(109,"00"),new CharCode(110,"101101"),new CharCode(119,"110"),new CharCode(114,"101111"),new CharCode(101,"01"),new CharCode(111,"100") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)108)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)110)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)101)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)100)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)115)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)112)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)99)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)114)) ;
      Position<Character> var16 = tree.insertRight(var12,((char)119)) ;
      Position<Character> var17 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)105)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)111)) ;
      ok_sofar = TesterLab5.checkConstructor(new CharCode[] { new CharCode(108,"000"),new CharCode(100,"011"),new CharCode(119,"1101"),new CharCode(111,"1111"),new CharCode(99,"11000"),new CharCode(110,"001"),new CharCode(115,"100"),new CharCode(105,"1110"),new CharCode(114,"11001"),new CharCode(112,"101"),new CharCode(101,"010") },tree) ;
      return ok_sofar ;
  }


  private static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)98)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"a","0") ;
      return ok_sofar ;
  }


  private static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)98)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"b","1") ;
      return ok_sofar ;
  }


  private static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"a","0") ;
      return ok_sofar ;
  }


  private static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"b","10") ;
      return ok_sofar ;
  }


  private static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"c","11") ;
      return ok_sofar ;
  }


  private static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"a","01") ;
      return ok_sofar ;
  }


  private static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"b","00") ;
      return ok_sofar ;
  }


  private static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"c","1") ;
      return ok_sofar ;
  }


  private static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)110)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)111)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)116)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)45)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)105)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"not","010110") ;
      return ok_sofar ;
  }


  private static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)104)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)111)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)121)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)101)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)116)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)97)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"to","110101") ;
      return ok_sofar ;
  }


  private static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)110)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)104)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)105)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)111)) ;
      Position<Character> var8 = tree.insertRight(var4,((char)116)) ;
      Position<Character> var9 = tree.insertRight(var3,((char)101)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"one","10010011") ;
      return ok_sofar ;
  }


  private static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)104)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)105)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)111)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)110)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)121)) ;
      Position<Character> var9 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)119)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)117)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"in","011010") ;
      return ok_sofar ;
  }


  private static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)101)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)111)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)114)) ;
      Position<Character> var6 = tree.insertRight(var2,((char)116)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)102)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)97)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)104)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"to","0110100") ;
      return ok_sofar ;
  }


  private static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)101)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)109)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)111)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)104)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)105)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)110)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)119)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"who","111010011") ;
      return ok_sofar ;
  }


  private static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)117)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)104)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)78)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)97)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)118)) ;
      Position<Character> var10 = tree.insertRight(var4,((char)111)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)101)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)121)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"No","01000011") ;
      return ok_sofar ;
  }


  private static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)110)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)115)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)121)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)97)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)111)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)117)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)100)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"sound","011101110001111") ;
      return ok_sofar ;
  }


  private static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)116)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)104)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)105)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)101)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)110)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)115)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)100)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)97)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"and","111100110") ;
      return ok_sofar ;
  }


  private static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)108)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)97)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)116)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)105)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)101)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)104)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)118)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)119)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"with","11101001101") ;
      return ok_sofar ;
  }


  private static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)110)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)105)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)111)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)97)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)116)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)101)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)114)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)104)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"that","01111010011") ;
      return ok_sofar ;
  }


  private static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)101)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)121)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)104)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)116)) ;
      Position<Character> var8 = tree.insertRight(var2,((char)111)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)114)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)97)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)115)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)117)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"you","01000011111") ;
      return ok_sofar ;
  }


  private static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)100)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)117)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)110)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)104)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)115)) ;
      Position<Character> var10 = tree.insertRight(var6,((char)111)) ;
      Position<Character> var11 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)108)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)119)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"would","11110101011000") ;
      return ok_sofar ;
  }


  private static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)111)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)116)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)104)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)118)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)97)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)100)) ;
      Position<Character> var12 = tree.insertRight(var8,((char)101)) ;
      Position<Character> var13 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)114)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)110)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"not","11100010") ;
      return ok_sofar ;
  }


  private static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)109)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)100)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)121)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)114)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)119)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)111)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)108)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)99)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"world","100101011100001") ;
      return ok_sofar ;
  }


  private static boolean test_37 ()
  {
      
      testName = "test_37" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)114)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)101)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)100)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)111)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)97)) ;
      Position<Character> var10 = tree.insertRight(var4,((char)109)) ;
      Position<Character> var11 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)121)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)110)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)116)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"more","101100100001") ;
      return ok_sofar ;
  }


  private static boolean test_38 ()
  {
      
      testName = "test_38" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)121)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)110)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)104)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)116)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)98)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)111)) ;
      Position<Character> var12 = tree.insertRight(var4,((char)99)) ;
      Position<Character> var13 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)114)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)101)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)117)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"be","1001011101") ;
      return ok_sofar ;
  }


  private static boolean test_39 ()
  {
      
      testName = "test_39" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)110)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)119)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)117)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)111)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)100)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)114)) ;
      Position<Character> var12 = tree.insertRight(var6,((char)116)) ;
      Position<Character> var13 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)108)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)121)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"world","00110001001111010010") ;
      return ok_sofar ;
  }


  private static boolean test_40 ()
  {
      
      testName = "test_40" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)115)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)70)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)101)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)104)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)97)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)111)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)112)) ;
      Position<Character> var14 = tree.insertRight(var10,((char)114)) ;
      Position<Character> var15 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)107)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)116)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"the","111100011") ;
      return ok_sofar ;
  }


  private static boolean test_41 ()
  {
      
      testName = "test_41" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)102)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)110)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)119)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)114)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)109)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)100)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)101)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)111)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"women","100111111011101011") ;
      return ok_sofar ;
  }


  private static boolean test_42 ()
  {
      
      testName = "test_42" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)102)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)116)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)110)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)104)) ;
      Position<Character> var8 = tree.insertRight(var4,((char)114)) ;
      Position<Character> var9 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)101)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)111)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"therefore","01100111010111000111101110") ;
      return ok_sofar ;
  }


  private static boolean test_43 ()
  {
      
      testName = "test_43" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)117)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)114)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)116)) ;
      Position<Character> var7 = tree.insertRight(var1,((char)100)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)101)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)111)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)70)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)103)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)115)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)110)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"For","0111011000010") ;
      return ok_sofar ;
  }


  private static boolean test_44 ()
  {
      
      testName = "test_44" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)101)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)102)) ;
      Position<Character> var6 = tree.insertRight(var2,((char)114)) ;
      Position<Character> var7 = tree.insertRight(var1,((char)97)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)121)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)109)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)116)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)100)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)110)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)104)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"need","110100000000001100") ;
      return ok_sofar ;
  }


  private static boolean test_45 ()
  {
      
      testName = "test_45" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)115)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)111)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)105)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)100)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)104)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)110)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)99)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)101)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)116)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"honest","100001010111100001111") ;
      return ok_sofar ;
  }


  private static boolean test_46 ()
  {
      
      testName = "test_46" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)115)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)101)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)105)) ;
      Position<Character> var8 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)121)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)102)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)114)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)107)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)110)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)109)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)104)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"if","01010111") ;
      return ok_sofar ;
  }


  private static boolean test_47 ()
  {
      
      testName = "test_47" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)100)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)105)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)119)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)117)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)111)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)108)) ;
      Position<Character> var14 = tree.insertRight(var10,((char)97)) ;
      Position<Character> var15 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)110)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)116)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"obtain","101000011110110110110") ;
      return ok_sofar ;
  }


  private static boolean test_48 ()
  {
      
      testName = "test_48" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)116)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)105)) ;
      Position<Character> var6 = tree.insertRight(var2,((char)102)) ;
      Position<Character> var7 = tree.insertRight(var1,((char)104)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)110)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)117)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)97)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)101)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)100)) ;
      Position<Character> var17 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)99)) ;
      Position<Character> var20 = tree.insertRight(var18,((char)108)) ;
      Position<Character> var21 = tree.insertRight(var17,((char)114)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"faithful","0001100000010000000100010111101") ;
      return ok_sofar ;
  }


  private static boolean test_49 ()
  {
      
      testName = "test_49" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)108)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)109)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)101)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)114)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)104)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)97)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)117)) ;
      Position<Character> var13 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)99)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)119)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)110)) ;
      Position<Character> var20 = tree.insertRight(var16,((char)105)) ;
      Position<Character> var21 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)111)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)32)) ;
      Position<Character> var24 = tree.insertLeft(var23,((char)116)) ;
      Position<Character> var25 = tree.insertRight(var23,((char)102)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"what","110100100101011110") ;
      return ok_sofar ;
  }


  private static boolean test_50 ()
  {
      
      testName = "test_50" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)110)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)100)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)103)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)114)) ;
      Position<Character> var8 = tree.insertRight(var4,((char)99)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)101)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)111)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)116)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)121)) ;
      Position<Character> var19 = tree.insertRight(var17,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)104)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)102)) ;
      Position<Character> var22 = tree.insertRight(var16,((char)97)) ;
      Position<Character> var23 = tree.insertRight(var13,((char)105)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"father","110101111011110011010101000101") ;
      return ok_sofar ;
  }


  private static boolean test_51 ()
  {
      
      testName = "test_51" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)100)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)104)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)116)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)97)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)114)) ;
      Position<Character> var10 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)105)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)101)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)109)) ;
      Position<Character> var16 = tree.insertRight(var14,((char)111)) ;
      Position<Character> var17 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var18 = tree.insertLeft(var17,((char)32)) ;
      Position<Character> var19 = tree.insertLeft(var18,((char)99)) ;
      Position<Character> var20 = tree.insertRight(var18,((char)102)) ;
      Position<Character> var21 = tree.insertRight(var17,((char)110)) ;
      ok_sofar = TesterLab5.checkEncode(tree,"democratic","0000111001011100001110011010011000101100") ;
      return ok_sofar ;
  }


  private static boolean test_52 ()
  {
      
      testName = "test_52" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)98)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"0","a") ;
      return ok_sofar ;
  }


  private static boolean test_53 ()
  {
      
      testName = "test_53" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)98)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"1","b") ;
      return ok_sofar ;
  }


  private static boolean test_54 ()
  {
      
      testName = "test_54" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"0","a") ;
      return ok_sofar ;
  }


  private static boolean test_55 ()
  {
      
      testName = "test_55" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"1","c") ;
      return ok_sofar ;
  }


  private static boolean test_56 ()
  {
      
      testName = "test_56" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"10","b") ;
      return ok_sofar ;
  }


  private static boolean test_57 ()
  {
      
      testName = "test_57" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)97)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"11","c") ;
      return ok_sofar ;
  }


  private static boolean test_58 ()
  {
      
      testName = "test_58" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"01","a") ;
      return ok_sofar ;
  }


  private static boolean test_59 ()
  {
      
      testName = "test_59" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)97)) ;
      Position<Character> var3 = tree.insertRight(root,((char)99)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"00","b") ;
      return ok_sofar ;
  }


  private static boolean test_60 ()
  {
      
      testName = "test_60" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)116)) ;
      Position<Character> var1 = tree.insertRight(root,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)111)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)73)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)110)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"111100","not") ;
      return ok_sofar ;
  }


  private static boolean test_61 ()
  {
      
      testName = "test_61" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)121)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)104)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)116)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)101)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)111)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"10111","to") ;
      return ok_sofar ;
  }


  private static boolean test_62 ()
  {
      
      testName = "test_62" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)116)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)110)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)111)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)102)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)103)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"1110000","got") ;
      return ok_sofar ;
  }


  private static boolean test_63 ()
  {
      
      testName = "test_63" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)116)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)115)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)101)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)111)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)100)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)97)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)110)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)104)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"1110","a") ;
      return ok_sofar ;
  }


  private static boolean test_64 ()
  {
      
      testName = "test_64" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)117)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)111)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)101)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)104)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)121)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)116)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"111110010","the") ;
      return ok_sofar ;
  }


  private static boolean test_65 ()
  {
      
      testName = "test_65" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)97)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)98)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)104)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)116)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)105)) ;
      Position<Character> var9 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)99)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)101)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)117)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)115)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"1011111","is") ;
      return ok_sofar ;
  }


  private static boolean test_66 ()
  {
      
      testName = "test_66" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)110)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)98)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)115)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)101)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)111)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)97)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)109)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)117)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)99)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)100)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"111010","do") ;
      return ok_sofar ;
  }


  private static boolean test_67 ()
  {
      
      testName = "test_67" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)114)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)97)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)121)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)111)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)102)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)117)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)100)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)110)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"0001111110","and") ;
      return ok_sofar ;
  }


  private static boolean test_68 ()
  {
      
      testName = "test_68" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)98)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)116)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)97)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)101)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)119)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)104)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)73)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"101100110010","what") ;
      return ok_sofar ;
  }


  private static boolean test_69 ()
  {
      
      testName = "test_69" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)111)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)101)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)110)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)98)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)97)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)105)) ;
      Position<Character> var12 = tree.insertRight(var6,((char)121)) ;
      Position<Character> var13 = tree.insertRight(var5,((char)116)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"1100001101","by") ;
      return ok_sofar ;
  }


  private static boolean test_70 ()
  {
      
      testName = "test_70" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)111)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)117)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)110)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)121)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)108)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)116)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)114)) ;
      Position<Character> var14 = tree.insertRight(var6,((char)100)) ;
      Position<Character> var15 = tree.insertRight(var3,((char)119)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"101000001","you") ;
      return ok_sofar ;
  }


  private static boolean test_71 ()
  {
      
      testName = "test_71" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)111)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)73)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)117)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)101)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)106)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)103)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)100)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"11000000000111","good") ;
      return ok_sofar ;
  }


  private static boolean test_72 ()
  {
      
      testName = "test_72" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)114)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)104)) ;
      Position<Character> var5 = tree.insertRight(var1,((char)116)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)111)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)117)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)119)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"0010000100010001","truth") ;
      return ok_sofar ;
  }


  private static boolean test_73 ()
  {
      
      testName = "test_73" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)114)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)108)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)97)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)101)) ;
      Position<Character> var8 = tree.insertRight(var4,((char)115)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)102)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)111)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)104)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)116)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"1111100101","the") ;
      return ok_sofar ;
  }


  private static boolean test_74 ()
  {
      
      testName = "test_74" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)105)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)114)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)102)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)97)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)109)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)111)) ;
      Position<Character> var12 = tree.insertRight(var8,((char)100)) ;
      Position<Character> var13 = tree.insertRight(var7,((char)110)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"110111111101","and") ;
      return ok_sofar ;
  }


  private static boolean test_75 ()
  {
      
      testName = "test_75" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)97)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)100)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)101)) ;
      Position<Character> var6 = tree.insertRight(var2,((char)114)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)111)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)116)) ;
      Position<Character> var11 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)104)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)70)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)110)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"101110000101","that") ;
      return ok_sofar ;
  }


  private static boolean test_76 ()
  {
      
      testName = "test_76" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)107)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)111)) ;
      Position<Character> var4 = tree.insertRight(var2,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)116)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)109)) ;
      Position<Character> var8 = tree.insertRight(var4,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)71)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)108)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)97)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)101)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)100)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"011011000110","make") ;
      return ok_sofar ;
  }


  private static boolean test_77 ()
  {
      
      testName = "test_77" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)114)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)121)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)111)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)109)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)116)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)105)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)110)) ;
      Position<Character> var14 = tree.insertRight(var10,((char)101)) ;
      Position<Character> var15 = tree.insertRight(var9,((char)104)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"111001100110","not") ;
      return ok_sofar ;
  }


  private static boolean test_78 ()
  {
      
      testName = "test_78" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)111)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)115)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)108)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)100)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)117)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)101)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)110)) ;
      Position<Character> var14 = tree.insertRight(var10,((char)66)) ;
      Position<Character> var15 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)121)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)97)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"1111001010","and") ;
      return ok_sofar ;
  }


  private static boolean test_79 ()
  {
      
      testName = "test_79" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)101)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)114)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)110)) ;
      Position<Character> var5 = tree.insertRight(root,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)111)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)104)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)116)) ;
      Position<Character> var11 = tree.insertRight(var5,((char)109)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"10010111010000001","other") ;
      return ok_sofar ;
  }


  private static boolean test_80 ()
  {
      
      testName = "test_80" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)101)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)111)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)100)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)116)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)73)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)104)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)115)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"11011110011111100","those") ;
      return ok_sofar ;
  }


  private static boolean test_81 ()
  {
      
      testName = "test_81" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)104)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)101)) ;
      Position<Character> var3 = tree.insertRight(root,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)117)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)110)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)114)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)115)) ;
      Position<Character> var12 = tree.insertRight(var8,((char)111)) ;
      Position<Character> var13 = tree.insertRight(var7,((char)116)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"1111000111100001","there") ;
      return ok_sofar ;
  }


  private static boolean test_82 ()
  {
      
      testName = "test_82" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)105)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)118)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)121)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)101)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)111)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)102)) ;
      Position<Character> var11 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)110)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)116)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"00111100010000101","envy") ;
      return ok_sofar ;
  }


  private static boolean test_83 ()
  {
      
      testName = "test_83" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)109)) ;
      Position<Character> var2 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var3 = tree.insertLeft(var2,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)114)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)99)) ;
      Position<Character> var7 = tree.insertRight(var3,((char)102)) ;
      Position<Character> var8 = tree.insertRight(var2,((char)100)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)97)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)111)) ;
      Position<Character> var13 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)101)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)108)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"0100110111110101000","color") ;
      return ok_sofar ;
  }


  private static boolean test_84 ()
  {
      
      testName = "test_84" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)104)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)99)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)100)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)117)) ;
      Position<Character> var10 = tree.insertRight(var6,((char)108)) ;
      Position<Character> var11 = tree.insertRight(var5,((char)101)) ;
      Position<Character> var12 = tree.insertRight(var4,((char)103)) ;
      Position<Character> var13 = tree.insertRight(root,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)32)) ;
      Position<Character> var15 = tree.insertLeft(var14,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)110)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)114)) ;
      Position<Character> var18 = tree.insertRight(var14,((char)111)) ;
      Position<Character> var19 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)105)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)121)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"011101101010000","good") ;
      return ok_sofar ;
  }


  private static boolean test_85 ()
  {
      
      testName = "test_85" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)104)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)114)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)115)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)101)) ;
      Position<Character> var8 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)87)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)111)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)102)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)97)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)108)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)99)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"1110000110110011000111","choose") ;
      return ok_sofar ;
  }


  private static boolean test_86 ()
  {
      
      testName = "test_86" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)104)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)108)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)100)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)111)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)102)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)98)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)105)) ;
      Position<Character> var14 = tree.insertRight(var10,((char)115)) ;
      Position<Character> var15 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)121)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)101)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"1010001001000110010110","boldly") ;
      return ok_sofar ;
  }


  private static boolean test_87 ()
  {
      
      testName = "test_87" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)98)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)97)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)32)) ;
      Position<Character> var6 = tree.insertLeft(var5,((char)119)) ;
      Position<Character> var7 = tree.insertRight(var5,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)110)) ;
      Position<Character> var9 = tree.insertRight(var7,((char)100)) ;
      Position<Character> var10 = tree.insertRight(var4,((char)117)) ;
      Position<Character> var11 = tree.insertRight(root,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)114)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)115)) ;
      Position<Character> var15 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)111)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)78)) ;
      Position<Character> var19 = tree.insertRight(var15,((char)104)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"1110111010000010101001011","husband") ;
      return ok_sofar ;
  }


  private static boolean test_88 ()
  {
      
      testName = "test_88" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)110)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)102)) ;
      Position<Character> var4 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var5 = tree.insertLeft(var4,((char)105)) ;
      Position<Character> var6 = tree.insertRight(var4,((char)116)) ;
      Position<Character> var7 = tree.insertRight(root,((char)32)) ;
      Position<Character> var8 = tree.insertLeft(var7,((char)32)) ;
      Position<Character> var9 = tree.insertLeft(var8,((char)100)) ;
      Position<Character> var10 = tree.insertRight(var8,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)115)) ;
      Position<Character> var12 = tree.insertRight(var10,((char)32)) ;
      Position<Character> var13 = tree.insertLeft(var12,((char)97)) ;
      Position<Character> var14 = tree.insertRight(var12,((char)109)) ;
      Position<Character> var15 = tree.insertRight(var7,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)32)) ;
      Position<Character> var17 = tree.insertLeft(var16,((char)101)) ;
      Position<Character> var18 = tree.insertRight(var16,((char)117)) ;
      Position<Character> var19 = tree.insertRight(var15,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)32)) ;
      Position<Character> var21 = tree.insertLeft(var20,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)114)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)108)) ;
      Position<Character> var24 = tree.insertRight(var20,((char)104)) ;
      Position<Character> var25 = tree.insertRight(var19,((char)98)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"10011100011001011010111","dream") ;
      return ok_sofar ;
  }


  private static boolean test_89 ()
  {
      
      testName = "test_89" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      LinkedBinaryTree<Character> tree = new LinkedBinaryTree<Character>() ;
      Position<Character> root = tree.addRoot(((char)32)) ;
      Position<Character> var0 = tree.insertLeft(root,((char)32)) ;
      Position<Character> var1 = tree.insertLeft(var0,((char)32)) ;
      Position<Character> var2 = tree.insertLeft(var1,((char)101)) ;
      Position<Character> var3 = tree.insertRight(var1,((char)32)) ;
      Position<Character> var4 = tree.insertLeft(var3,((char)103)) ;
      Position<Character> var5 = tree.insertRight(var3,((char)100)) ;
      Position<Character> var6 = tree.insertRight(var0,((char)32)) ;
      Position<Character> var7 = tree.insertLeft(var6,((char)115)) ;
      Position<Character> var8 = tree.insertRight(var6,((char)114)) ;
      Position<Character> var9 = tree.insertRight(root,((char)32)) ;
      Position<Character> var10 = tree.insertLeft(var9,((char)32)) ;
      Position<Character> var11 = tree.insertLeft(var10,((char)32)) ;
      Position<Character> var12 = tree.insertLeft(var11,((char)97)) ;
      Position<Character> var13 = tree.insertRight(var11,((char)32)) ;
      Position<Character> var14 = tree.insertLeft(var13,((char)108)) ;
      Position<Character> var15 = tree.insertRight(var13,((char)32)) ;
      Position<Character> var16 = tree.insertLeft(var15,((char)111)) ;
      Position<Character> var17 = tree.insertRight(var15,((char)119)) ;
      Position<Character> var18 = tree.insertRight(var10,((char)116)) ;
      Position<Character> var19 = tree.insertRight(var9,((char)32)) ;
      Position<Character> var20 = tree.insertLeft(var19,((char)104)) ;
      Position<Character> var21 = tree.insertRight(var19,((char)32)) ;
      Position<Character> var22 = tree.insertLeft(var21,((char)117)) ;
      Position<Character> var23 = tree.insertRight(var21,((char)109)) ;
      ok_sofar = TesterLab5.checkDecode(tree,"01010101111100010001010010000","struggle") ;
      return ok_sofar ;
  }



  static int test_type_to_index(String test_type) {
      if (test_type.equals("constructor")) return 0;
      if (test_type.equals("encode")) return 1;
      if (test_type.equals("decode")) return 2;
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
      for (int i=0; i<3; i++) {
	  if (results_sofar[i])
	      ++successes;
      }
      return successes >= 3;
  }

static void report_results(String tester, boolean results_sofar[], boolean general_results) {
      System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");

      for (int i=0; i<=2; i++) {
	  String testName="";
	  if (i==0) testName = "constructor";
	  else if (i==1) testName = "encode";
	  else if (i==2) testName = "decode";

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

  @SuppressWarnings("unchecked")
  static boolean checkConstructor(CharCode[] charCodes, BinaryTree<Character>bt) {
      String callString = "new Huffman("+printArray(charCodes)+")";

      boolean ok_sofar = true;

      if (ok_sofar) {
	  try {
	      huffman = new Huffman(charCodes);
	  } catch ( Throwable exc ) {
	      printCallException(callString,exc);
	      System.out.print("\nThe tree generated by  "+callString);
	      System.out.println("\nshould have the shape\n");
	      System.out.println(bt.toString());
	      ok_sofar = false;
	      return false;
	  }
      }

      if (ok_sofar) {
	  try {
	      treeField = huffman.getClass().getDeclaredField("huffmanTree");
	      treeField.setAccessible(true);
	      TesterLab5.tree = (BinaryTree<Character>)treeField.get(huffman);
	  } catch ( Throwable exc ) {
	      printCallException("access the field huffmanTree",exc);
	      ok_sofar = false;
	      return false;
	  }
      }

      if (ok_sofar) {
        ok_sofar = checkTree(callString,TesterLab5.tree,bt);
      }

      return ok_sofar;
  }

  static boolean checkEncode(LinkedBinaryTree<Character>bt, String text, String expected) {
    boolean ok_sofar = true;

    if (ok_sofar) {

	String callString = "huffman.encode(\""+text+"\")";
	
	try {
          Huffman huffman = new Huffman(bt);
	    String result = huffman.encode(text);
	    if (result == null || !result.equals(expected)) {
	      printError
		  (ExecutionTime.UNRELATED,
		   callString+" should have returned \""+
		   expected+"\" but returned \""+result+"\"");
	      System.out.print("\n The three has the shape\n");
	      System.out.println(bt);
	      return false;
	  }
      } catch ( Throwable exc ) {
	  printCallException(callString,exc);
          System.out.print("\nThe three has the shape\n");
	  System.out.println(bt);
	  return false;
      }

    }
    return ok_sofar;
  }

  static boolean checkDecode(LinkedBinaryTree<Character>bt, String codedText, String expected) {

    boolean ok_sofar = true;
    
    if (ok_sofar) {

	String callString = "huffman.decode(\""+codedText+"\")";
	
	try {
            Huffman huffman = new Huffman(bt);
	    String result = huffman.decode(codedText);
	    if (result == null || !result.equals(expected)) {
	      printError
		  (ExecutionTime.UNRELATED,
		   callString+" should have returned \""+
		   expected+"\" but returned \""+result+"\"");
	      System.out.print("\nThe tree has the shape\n");
	      System.out.println(bt);
	      return false;
	  }
      } catch ( Throwable exc ) {
	  printCallException(callString,exc);
	  System.out.print("\nThe tree has the shape\n");
	  System.out.println(bt);
	  return false;
      }
    }

    return ok_sofar;
  }


static boolean checkTree(String callString, BinaryTree<Character> tree, BinaryTree<Character>expt) {
	boolean ok_sofar = true;
	
	if (ok_sofar && (expt.isEmpty() != tree.isEmpty()))
	    ok_sofar = false;

	if (ok_sofar)
          ok_sofar =
            checkTreePos(callString, tree, tree.root(), expt, expt.root());

	if (!ok_sofar) {
	    System.out.println("\n*** Error for "+testName+": ");
	    System.out.print("\nThe tree generated by "+callString);
	    System.out.println("\nhas the shape\n");
	    System.out.println(tree);
	    System.out.println("\nbut should have the shape\n");
	    System.out.println(expt);
	}

	return ok_sofar;
    }

    static boolean checkTreePos(String callString,
				BinaryTree<Character> tree,
				Position<Character> pos,
				BinaryTree<Character>expt,
                                Position<Character> exppos) {
	boolean ok_sofar = true;

	if (ok_sofar && (expt.isExternal(exppos) != tree.isExternal(pos))) {
	    ok_sofar = false;
	}

	if (ok_sofar && expt.isExternal(exppos)) {
          if (!exppos.element().equals(pos.element())) {
		ok_sofar = false;
	    }
	}

	if (ok_sofar && !expt.isExternal(exppos)) {
	    if (ok_sofar && (expt.hasLeft(exppos) != tree.hasLeft(pos))) {
		ok_sofar = false;
	    }

	    if (ok_sofar && (expt.hasRight(exppos) != tree.hasRight(pos))) {
		ok_sofar = false;
	    }
	}

	if (ok_sofar && !expt.isExternal(exppos)) {
	    if (ok_sofar && expt.hasLeft(exppos))
              ok_sofar = checkTreePos(callString,tree,tree.left(pos),expt,expt.left(exppos));

	    if (ok_sofar && expt.hasRight(exppos))
              ok_sofar = checkTreePos(callString,tree,tree.right(pos),expt,expt.right(exppos));
	}

      return ok_sofar;
    }

    static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n*** Error for "+testName+": ");

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
      System.out.println("\n*** Error for "+testName+": ");
      System.out.print(callSeqString(time));
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

  static String printArray(Object[] arr) {
      StringBuilder arrString = new StringBuilder("[");
      
      for (int i = 0; i < arr.length; i++) {
	  arrString.append(arr[i].toString());
	  if (i < arr.length-1)
	      arrString.append(" ");
      }
      arrString.append("]");
      return arrString.toString();
  }
}

