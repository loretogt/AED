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

package aed.recursion;

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
import es.upm.aedlib.indexedlist.*;

import org.apache.bcel.classfile.*;
import java.lang.reflect.Field;


@SuppressWarnings("unused")
public class TesterInd5 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";

  static boolean[] results_sofar = {true,true,true};
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

    // Permit executing individual tests: 
    // the first argument should be the test number
    if (args.length == 1) {
	try {
	    int testNumber = Integer.parseInt(args[0]);
	    String testName = "test_"+testNumber;
	    java.lang.reflect.Method testMethod = null;
	    try {
		testMethod = TesterInd5.class.getDeclaredMethod(testName);
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
    boolean ok_sofar = true;
    testsRun = true;

    


    //////////////////////////////////////////////////////////////////////
    //
    // File generated at: 2017/10/25 -- 14:50:52
    // Seed: {1508,935850,412929}
    //
    //////////////////////////////////////////////////////////////////////



    try {
    general_results =
      combine_general_result("rec_power", checkRecursive("aed.recursion.RecursiveUtils.power"), general_results);

    general_results =
      combine_general_result("rec_allNonNull", checkRecursive("aed.recursion.RecursiveUtils.allNonNull"), general_results);

    general_results =
      combine_general_result("rec_countNonNull", checkRecursive("aed.recursion.RecursiveUtils.countNonNull"), general_results);

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_3(), results_sofar, "test_3", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_4(), results_sofar, "test_4", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_15(), results_sofar, "test_15", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_16(), results_sofar, "test_16", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_18(), results_sofar, "test_18", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_31(), results_sofar, "test_31", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_32(), results_sofar, "test_32", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_33(), results_sofar, "test_33", "power");

      if (results_ok_sofar(results_sofar,"power") && local_results_ok_sofar(results_sofar,"power"))
        results_sofar =
          combine_results(test_34(), results_sofar, "test_34", "power");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_35(), results_sofar, "test_35", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_36(), results_sofar, "test_36", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_37(), results_sofar, "test_37", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_38(), results_sofar, "test_38", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_39(), results_sofar, "test_39", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_40(), results_sofar, "test_40", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_41(), results_sofar, "test_41", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_42(), results_sofar, "test_42", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_43(), results_sofar, "test_43", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_44(), results_sofar, "test_44", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_45(), results_sofar, "test_45", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_46(), results_sofar, "test_46", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_47(), results_sofar, "test_47", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_48(), results_sofar, "test_48", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_49(), results_sofar, "test_49", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_50(), results_sofar, "test_50", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_51(), results_sofar, "test_51", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_52(), results_sofar, "test_52", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_53(), results_sofar, "test_53", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_54(), results_sofar, "test_54", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_55(), results_sofar, "test_55", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_56(), results_sofar, "test_56", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_57(), results_sofar, "test_57", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_58(), results_sofar, "test_58", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_59(), results_sofar, "test_59", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_60(), results_sofar, "test_60", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_61(), results_sofar, "test_61", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_62(), results_sofar, "test_62", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_63(), results_sofar, "test_63", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_64(), results_sofar, "test_64", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_65(), results_sofar, "test_65", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_66(), results_sofar, "test_66", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_67(), results_sofar, "test_67", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_68(), results_sofar, "test_68", "allNonNull");

      if (results_ok_sofar(results_sofar,"allNonNull") && local_results_ok_sofar(results_sofar,"allNonNull"))
        results_sofar =
          combine_results(test_69(), results_sofar, "test_69", "allNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_70(), results_sofar, "test_70", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_71(), results_sofar, "test_71", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_72(), results_sofar, "test_72", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_73(), results_sofar, "test_73", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_74(), results_sofar, "test_74", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_75(), results_sofar, "test_75", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_76(), results_sofar, "test_76", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_77(), results_sofar, "test_77", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_78(), results_sofar, "test_78", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_79(), results_sofar, "test_79", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_80(), results_sofar, "test_80", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_81(), results_sofar, "test_81", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_82(), results_sofar, "test_82", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_83(), results_sofar, "test_83", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_84(), results_sofar, "test_84", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_85(), results_sofar, "test_85", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_86(), results_sofar, "test_86", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_87(), results_sofar, "test_87", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_88(), results_sofar, "test_88", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_89(), results_sofar, "test_89", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_90(), results_sofar, "test_90", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_91(), results_sofar, "test_91", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_92(), results_sofar, "test_92", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_93(), results_sofar, "test_93", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_94(), results_sofar, "test_94", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_95(), results_sofar, "test_95", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_96(), results_sofar, "test_96", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_97(), results_sofar, "test_97", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_98(), results_sofar, "test_98", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_99(), results_sofar, "test_99", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_100(), results_sofar, "test_100", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_101(), results_sofar, "test_101", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_102(), results_sofar, "test_102", "countNonNull");

      if (results_ok_sofar(results_sofar,"countNonNull") && local_results_ok_sofar(results_sofar,"countNonNull"))
        results_sofar =
          combine_results(test_103(), results_sofar, "test_103", "countNonNull");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          return false;
      }


    report_results("TesterInd5",results_sofar,general_results);


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
      ok_sofar = TesterInd5.check_power(0,2,0) ;
      return ok_sofar ;
  }


  static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(0,1,0) ;
      return ok_sofar ;
  }


  static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(1,17,1) ;
      return ok_sofar ;
  }


  static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(13,0,1) ;
      return ok_sofar ;
  }


  static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(1,3,1) ;
      return ok_sofar ;
  }


  static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(9,0,1) ;
      return ok_sofar ;
  }


  static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(1,11,1) ;
      return ok_sofar ;
  }


  static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(0,0,1) ;
      return ok_sofar ;
  }


  static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(1,0,1) ;
      return ok_sofar ;
  }


  static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(1,1,1) ;
      return ok_sofar ;
  }


  static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(5,1,5) ;
      return ok_sofar ;
  }


  static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(23,1,23) ;
      return ok_sofar ;
  }


  static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(5,2,25) ;
      return ok_sofar ;
  }


  static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(3,3,27) ;
      return ok_sofar ;
  }


  static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(39,1,39) ;
      return ok_sofar ;
  }


  static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(4,3,64) ;
      return ok_sofar ;
  }


  static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(3,4,81) ;
      return ok_sofar ;
  }


  static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(2,7,128) ;
      return ok_sofar ;
  }


  static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(22,2,484) ;
      return ok_sofar ;
  }


  static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(26,2,676) ;
      return ok_sofar ;
  }


  static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(32,2,1024) ;
      return ok_sofar ;
  }


  static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(15,3,3375) ;
      return ok_sofar ;
  }


  static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(18,3,5832) ;
      return ok_sofar ;
  }


  static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(2,14,16384) ;
      return ok_sofar ;
  }


  static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(22,4,234256) ;
      return ok_sofar ;
  }


  static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(18,5,1889568) ;
      return ok_sofar ;
  }


  static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(19,5,2476099) ;
      return ok_sofar ;
  }


  static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(3,15,14348907) ;
      return ok_sofar ;
  }


  static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(32,5,33554432) ;
      return ok_sofar ;
  }


  static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(4,13,67108864) ;
      return ok_sofar ;
  }


  static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(22,6,113379904) ;
      return ok_sofar ;
  }


  static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(24,6,191102976) ;
      return ok_sofar ;
  }


  static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(11,8,214358881) ;
      return ok_sofar ;
  }


  static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_power(16,7,268435456) ;
      return ok_sofar ;
  }


  static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] {  },true) ;
      return ok_sofar ;
  }


  static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 5 },true) ;
      return ok_sofar ;
  }


  static boolean test_37 ()
  {
      
      testName = "test_37" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 10 },true) ;
      return ok_sofar ;
  }


  static boolean test_38 ()
  {
      
      testName = "test_38" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 1 },true) ;
      return ok_sofar ;
  }


  static boolean test_39 ()
  {
      
      testName = "test_39" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 2 },true) ;
      return ok_sofar ;
  }


  static boolean test_40 ()
  {
      
      testName = "test_40" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { null },false) ;
      return ok_sofar ;
  }


  static boolean test_41 ()
  {
      
      testName = "test_41" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 0 },true) ;
      return ok_sofar ;
  }


  static boolean test_42 ()
  {
      
      testName = "test_42" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 9,10 },true) ;
      return ok_sofar ;
  }


  static boolean test_43 ()
  {
      
      testName = "test_43" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 5,7 },true) ;
      return ok_sofar ;
  }


  static boolean test_44 ()
  {
      
      testName = "test_44" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 6,4 },true) ;
      return ok_sofar ;
  }


  static boolean test_45 ()
  {
      
      testName = "test_45" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 2,9 },true) ;
      return ok_sofar ;
  }


  static boolean test_46 ()
  {
      
      testName = "test_46" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 8,9 },true) ;
      return ok_sofar ;
  }


  static boolean test_47 ()
  {
      
      testName = "test_47" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { null,null },false) ;
      return ok_sofar ;
  }


  static boolean test_48 ()
  {
      
      testName = "test_48" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 0,null },false) ;
      return ok_sofar ;
  }


  static boolean test_49 ()
  {
      
      testName = "test_49" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 9,4,null },false) ;
      return ok_sofar ;
  }


  static boolean test_50 ()
  {
      
      testName = "test_50" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 9,6,9 },true) ;
      return ok_sofar ;
  }


  static boolean test_51 ()
  {
      
      testName = "test_51" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 2,9,10 },true) ;
      return ok_sofar ;
  }


  static boolean test_52 ()
  {
      
      testName = "test_52" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 0,null,0 },false) ;
      return ok_sofar ;
  }


  static boolean test_53 ()
  {
      
      testName = "test_53" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 3,4,2,5 },true) ;
      return ok_sofar ;
  }


  static boolean test_54 ()
  {
      
      testName = "test_54" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 5,2,3,4 },true) ;
      return ok_sofar ;
  }


  static boolean test_55 ()
  {
      
      testName = "test_55" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 2,10,null,10 },false) ;
      return ok_sofar ;
  }


  static boolean test_56 ()
  {
      
      testName = "test_56" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 4,8,5,8 },true) ;
      return ok_sofar ;
  }


  static boolean test_57 ()
  {
      
      testName = "test_57" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 5,4,8,7,1 },true) ;
      return ok_sofar ;
  }


  static boolean test_58 ()
  {
      
      testName = "test_58" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 7,2,8,null,4 },false) ;
      return ok_sofar ;
  }


  static boolean test_59 ()
  {
      
      testName = "test_59" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 9,7,1,5,6 },true) ;
      return ok_sofar ;
  }


  static boolean test_60 ()
  {
      
      testName = "test_60" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 4,3,8,5,7,1 },true) ;
      return ok_sofar ;
  }


  static boolean test_61 ()
  {
      
      testName = "test_61" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 2,7,null,8,3,null },false) ;
      return ok_sofar ;
  }


  static boolean test_62 ()
  {
      
      testName = "test_62" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 9,9,7,1,4,null,9 },false) ;
      return ok_sofar ;
  }


  static boolean test_63 ()
  {
      
      testName = "test_63" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 7,2,null,8,9,9,7 },false) ;
      return ok_sofar ;
  }


  static boolean test_64 ()
  {
      
      testName = "test_64" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 7,7,7,4,3,4,9,1 },true) ;
      return ok_sofar ;
  }


  static boolean test_65 ()
  {
      
      testName = "test_65" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 2,9,8,2,9,6,4,10 },true) ;
      return ok_sofar ;
  }


  static boolean test_66 ()
  {
      
      testName = "test_66" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 7,9,6,5,null,2,10,4 },false) ;
      return ok_sofar ;
  }


  static boolean test_67 ()
  {
      
      testName = "test_67" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 9,9,2,1,1,7,4,null,2,3,5 },false) ;
      return ok_sofar ;
  }


  static boolean test_68 ()
  {
      
      testName = "test_68" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 10,2,8,8,1,2,5,10,6,9,9 },true) ;
      return ok_sofar ;
  }


  static boolean test_69 ()
  {
      
      testName = "test_69" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_allNonNull(new Integer[] { 1,4,8,8,7,2,2,6,9,4,6,2,9 },true) ;
      return ok_sofar ;
  }


  static boolean test_70 ()
  {
      
      testName = "test_70" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] {  },0) ;
      return ok_sofar ;
  }


  static boolean test_71 ()
  {
      
      testName = "test_71" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 4 },1) ;
      return ok_sofar ;
  }


  static boolean test_72 ()
  {
      
      testName = "test_72" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { null },0) ;
      return ok_sofar ;
  }


  static boolean test_73 ()
  {
      
      testName = "test_73" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 8 },1) ;
      return ok_sofar ;
  }


  static boolean test_74 ()
  {
      
      testName = "test_74" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 3 },1) ;
      return ok_sofar ;
  }


  static boolean test_75 ()
  {
      
      testName = "test_75" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 5 },1) ;
      return ok_sofar ;
  }


  static boolean test_76 ()
  {
      
      testName = "test_76" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 9 },1) ;
      return ok_sofar ;
  }


  static boolean test_77 ()
  {
      
      testName = "test_77" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 0 },1) ;
      return ok_sofar ;
  }


  static boolean test_78 ()
  {
      
      testName = "test_78" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 8,5 },2) ;
      return ok_sofar ;
  }


  static boolean test_79 ()
  {
      
      testName = "test_79" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 1,1 },2) ;
      return ok_sofar ;
  }


  static boolean test_80 ()
  {
      
      testName = "test_80" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 9,7 },2) ;
      return ok_sofar ;
  }


  static boolean test_81 ()
  {
      
      testName = "test_81" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { null,null },0) ;
      return ok_sofar ;
  }


  static boolean test_82 ()
  {
      
      testName = "test_82" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 0,null },1) ;
      return ok_sofar ;
  }


  static boolean test_83 ()
  {
      
      testName = "test_83" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 8,7,6 },3) ;
      return ok_sofar ;
  }


  static boolean test_84 ()
  {
      
      testName = "test_84" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 5,1,6 },3) ;
      return ok_sofar ;
  }


  static boolean test_85 ()
  {
      
      testName = "test_85" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 0,null,0 },2) ;
      return ok_sofar ;
  }


  static boolean test_86 ()
  {
      
      testName = "test_86" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 2,4,9,10 },4) ;
      return ok_sofar ;
  }


  static boolean test_87 ()
  {
      
      testName = "test_87" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 2,null,3,5 },3) ;
      return ok_sofar ;
  }


  static boolean test_88 ()
  {
      
      testName = "test_88" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 3,null,9,8 },3) ;
      return ok_sofar ;
  }


  static boolean test_89 ()
  {
      
      testName = "test_89" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 9,3,9,4 },4) ;
      return ok_sofar ;
  }


  static boolean test_90 ()
  {
      
      testName = "test_90" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 8,2,4,7 },4) ;
      return ok_sofar ;
  }


  static boolean test_91 ()
  {
      
      testName = "test_91" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 8,5,9,10,7 },5) ;
      return ok_sofar ;
  }


  static boolean test_92 ()
  {
      
      testName = "test_92" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 3,10,null,null,10 },3) ;
      return ok_sofar ;
  }


  static boolean test_93 ()
  {
      
      testName = "test_93" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 1,7,5,1,1,9 },6) ;
      return ok_sofar ;
  }


  static boolean test_94 ()
  {
      
      testName = "test_94" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 5,2,7,1,10,4 },6) ;
      return ok_sofar ;
  }


  static boolean test_95 ()
  {
      
      testName = "test_95" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 10,null,1,3,2,8,9 },6) ;
      return ok_sofar ;
  }


  static boolean test_96 ()
  {
      
      testName = "test_96" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { null,10,null,10,4,10,9 },5) ;
      return ok_sofar ;
  }


  static boolean test_97 ()
  {
      
      testName = "test_97" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 2,null,6,7,null,3,7,9 },6) ;
      return ok_sofar ;
  }


  static boolean test_98 ()
  {
      
      testName = "test_98" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 3,2,7,9,9,4,7,7,5 },9) ;
      return ok_sofar ;
  }


  static boolean test_99 ()
  {
      
      testName = "test_99" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 5,null,2,2,8,2,2,3,4 },8) ;
      return ok_sofar ;
  }


  static boolean test_100 ()
  {
      
      testName = "test_100" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { null,3,1,10,3,10,4,9,6 },8) ;
      return ok_sofar ;
  }


  static boolean test_101 ()
  {
      
      testName = "test_101" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 9,7,5,3,6,9,4,5,2,3 },10) ;
      return ok_sofar ;
  }


  static boolean test_102 ()
  {
      
      testName = "test_102" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 7,1,2,7,1,9,9,5,9,9,8 },11) ;
      return ok_sofar ;
  }


  static boolean test_103 ()
  {
      
      testName = "test_103" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd5.check_countNonNull(new Integer[] { 7,6,6,9,10,9,1,5,4,2,7 },11) ;
      return ok_sofar ;
  }



  static int test_type_to_index(String test_type) {
      if (test_type.equals("power")) return 0;
      if (test_type.equals("allNonNull")) return 1;
      if (test_type.equals("countNonNull")) return 2;
      System.out.println("\n*** Error in test setup: unknown test type: "+test_type);
      throw new RuntimeException();
  }

  static String index_to_test_type(int index) {
      if (index == 0) return "power";
      if (index == 1) return "allNonNull";
      if (index == 2) return "countNonNull";
      else {
	  System.out.println("\n*** Error in test setup: unknown test index: "+index);
	  throw new RuntimeException();
      }
  }

  static int general_test_to_index(String test_type) {
      if (test_type.equals("rec_power")) return 0;
      if (test_type.equals("rec_allNonNull")) return 1;
      if (test_type.equals("rec_countNonNull")) return 2;
      throw new RuntimeException();
  }

  static String general_index_to_test_type(int index) {
      if (index == 0) return "rec_power";
      if (index == 1) return "rec_allNonNull";
      if (index == 2) return "rec_countNonNull";
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

  static boolean[] combine_general_result(String name, boolean result, boolean general_results[]) {
      int index = general_test_to_index(name);
      general_results[index] = result;
      return general_results;
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


      for (int i=0; i<general_results.length; i++) {
	  if (!general_results[i])
	      printWarning
		  (ExecutionTime.UNRELATED,
		   "no recursive definition found for method "+general_index_to_test_type(i)+"; "+
		   "there is a risk that your solution will receive "+
		   "the grade 0.");
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

  static boolean check_power
    (int n1,
     int n2,
     int expected) {

    String methodName = "power";
    String callString = methodName+"("+n1+","+n2+")";

    try {
      int result = RecursiveUtils.power(n1,n2);
      
      if (result != expected) {
          printError
            (ExecutionTime.UNRELATED,
             "the call "+callString+" returned "+result+
             " but should have returned "+expected);
          return false;
      }
      return true;
    } catch ( Throwable exc ) {
      printCallException(callString,exc);
      return false;
    }
  }

  static boolean check_allNonNull
    (Integer[] elements,
     boolean expected) {
    
    String methodName = "allNonNull";
    String callString = methodName+"("+printArray(elements)+")";

    PositionList<Integer> l = new NodePositionList<Integer>();
    for (int k=0; k<elements.length; k++)
      l.addLast(elements[k]);
    
    try {
      boolean result = RecursiveUtils.allNonNull(l);

      if (result != expected) {
          printError
            (ExecutionTime.UNRELATED,
             "the call "+callString+" returned "+result+
             " but should have returned "+expected);
          return false;
      }
      return unChanged(callString,elements,l);
    } catch ( Throwable exc ) {
      printCallException(callString,exc);
      return false;
    }
  }

  static boolean check_countNonNull
    (Integer[] elements,
     int expected) {
    
    String methodName = "countNonNull";
    String callString = methodName+"("+printArray(elements)+")";

    PositionList<Integer> l = new NodePositionList<Integer>();
    for (int k=0; k<elements.length; k++)
      l.addLast(elements[k]);
    
    try {
      int result = RecursiveUtils.countNonNull(l);

      if (result != expected) {
          printError
            (ExecutionTime.UNRELATED,
             "the call "+callString+" returned "+result+
             " but should have returned "+expected);
          return false;
      }
      return unChanged(callString,elements,l);
    }  catch ( Throwable exc ) {
      printCallException(callString,exc);
      return false;
    }
  }

  static <E> boolean unChanged(String callString, E[] original, PositionList<E> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      Position<E> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  E elem = lPos.element();

	  if (elem == null) ok_sofar = (original[i] == null);
	  else ok_sofar = elem.equals(original[i]);

	  lPos = l.next(lPos);
	  ++i;
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.UNRELATED,
	       "the call "+callString+
	       " has modified the input list "+printArray(original)+
	       "; it has now the elements "+l);
	  return ok_sofar;
      }
      return ok_sofar;
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

  static boolean checkRecursive(String starter) {
      ClassParser cp = null;
      JavaClass jc = null;

      try {
        ClassLoader loader = 
	    TesterInd5.class.getClassLoader();
	String classLocation = 
	    loader.getResource("aed/recursion/RecursiveUtils.class").getFile();

	try {
	    cp = new ClassParser(classLocation);
	} catch (Exception exc) {
	    System.out.println
		("\nnot checking recursion: cannot read RecursiveUtils classfile");
	    exc.printStackTrace();
	    return false;
	}

	try {
	    jc = cp.parse();
	} catch (Exception exc) {
	    System.out.println
		("\nnot checking recursion: cannot parse classfile RecursiveUtils");
	    exc.printStackTrace();
	    return false;
	}

	Map<String,Set<String>> calls = new HashMap<String,Set<String>>();
	ClassCFG ccfg = new ClassCFG(jc, calls);
	ccfg.start();
	boolean result = isRecursive(starter,new TreeSet<String>(),calls);

	if (!result)
	    System.out.println
		("\nWARNING: La implementacion de "+starter+
		 " no parece recursivo aunque es OBLIGATORIO "+
		 "-- compruebalo manualmente!\n");
	return result;
      } catch (Throwable exc) {
	System.out.println
	  ("\n*** Warning: checking if the method is recursive failed -- check manually");
	return true;
      }
  }

    static boolean hasAttributes() {
	Class<RecursiveUtils> cl = RecursiveUtils.class;
	boolean hasAttributes = false;
	
	for (Field field : cl.getFields()) {
	    if (!hasAttributes) {
		printError
		    (ExecutionTime.UNRELATED,
		     "the class RecursiveUtils contains the field "+
		     field.getName()+"; this is not permitted");
		hasAttributes = true;
	    }
	}

	return hasAttributes;
    }

    static boolean isRecursive(String current, 
			       Set<String> seen,
			       Map<String,Set<String>> calls) {
	if (seen.contains(current)) {
	    return true;
	}

	Set<String> nexts = calls.get(current);
	seen.add(current);

	if (nexts == null) return false;
	else {
	    for (String next : nexts)
	    if (isRecursive(next,seen,calls)) return true;
	}

	return false;
    }
}



