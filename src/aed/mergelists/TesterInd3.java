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

package aed.mergelists;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.util.Comparator;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.indexedlist.*;

@SuppressWarnings("unused")
public class TesterInd3 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";

  public static void main(String[] args) {

    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    boolean[] results_sofar = {true,true};
    boolean general_results = true;
    boolean ok_sofar = true;
    


    //////////////////////////////////////////////////////////////////////
    //
    // File generated at: 2017/9/27 -- 16:21:17
    // Seed: {1506,522075,709900}
    //
    //////////////////////////////////////////////////////////////////////



    try {
      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_3(), results_sofar, "test_3", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
         combine_results(test_4(), results_sofar, "test_4", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_15(), results_sofar, "test_15", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_16(), results_sofar, "test_16", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_18(), results_sofar, "test_18", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_31(), results_sofar, "test_31", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_32(), results_sofar, "test_32", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_33(), results_sofar, "test_33", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_34(), results_sofar, "test_34", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_35(), results_sofar, "test_35", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_36(), results_sofar, "test_36", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_37(), results_sofar, "test_37", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_38(), results_sofar, "test_38", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_39(), results_sofar, "test_39", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_40(), results_sofar, "test_40", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_41(), results_sofar, "test_41", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_42(), results_sofar, "test_42", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_43(), results_sofar, "test_43", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_44(), results_sofar, "test_44", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_45(), results_sofar, "test_45", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_PositionList") && local_results_ok_sofar(results_sofar,"mergeLists_PositionList"))
        results_sofar =
          combine_results(test_46(), results_sofar, "test_46", "mergeLists_PositionList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_47(), results_sofar, "test_47", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_48(), results_sofar, "test_48", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_49(), results_sofar, "test_49", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_50(), results_sofar, "test_50", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_51(), results_sofar, "test_51", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_52(), results_sofar, "test_52", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_53(), results_sofar, "test_53", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_54(), results_sofar, "test_54", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_55(), results_sofar, "test_55", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_56(), results_sofar, "test_56", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_57(), results_sofar, "test_57", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_58(), results_sofar, "test_58", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_59(), results_sofar, "test_59", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_60(), results_sofar, "test_60", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_61(), results_sofar, "test_61", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_62(), results_sofar, "test_62", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_63(), results_sofar, "test_63", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_64(), results_sofar, "test_64", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_65(), results_sofar, "test_65", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_66(), results_sofar, "test_66", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_67(), results_sofar, "test_67", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_68(), results_sofar, "test_68", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_69(), results_sofar, "test_69", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_70(), results_sofar, "test_70", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_71(), results_sofar, "test_71", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_72(), results_sofar, "test_72", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_73(), results_sofar, "test_73", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_74(), results_sofar, "test_74", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_75(), results_sofar, "test_75", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_76(), results_sofar, "test_76", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_77(), results_sofar, "test_77", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_78(), results_sofar, "test_78", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_79(), results_sofar, "test_79", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_80(), results_sofar, "test_80", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_81(), results_sofar, "test_81", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_82(), results_sofar, "test_82", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_83(), results_sofar, "test_83", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_84(), results_sofar, "test_84", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_85(), results_sofar, "test_85", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_86(), results_sofar, "test_86", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_87(), results_sofar, "test_87", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_88(), results_sofar, "test_88", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_89(), results_sofar, "test_89", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_90(), results_sofar, "test_90", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_91(), results_sofar, "test_91", "mergeLists_IndexedList");

      if (results_ok_sofar(results_sofar,"mergeLists_IndexedList") && local_results_ok_sofar(results_sofar,"mergeLists_IndexedList"))
        results_sofar =
          combine_results(test_92(), results_sofar, "test_92", "mergeLists_IndexedList");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          System.exit(24);
      }


    report_results("TesterInd3",results_sofar,general_results);


    if (results_ok(results_sofar,general_results))
      System.exit(0);
    else
      System.exit(24);
  }



  private static boolean test_1 ()
  {
      
      testName = "test_1" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] {  },new int[] {  },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] { 8 },new int[] { 8 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1 },new int[] {  },new int[] { 1 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] { 1 },new int[] { 1 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1 },new int[] { 1 },new int[] { 1,1 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2 },new int[] { 1 },new int[] { 1,2 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1 },new int[] { 2 },new int[] { 1,2 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2 },new int[] { 1 },new int[] { 2,1 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1 },new int[] { 2 },new int[] { 2,1 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 4,7 },new int[] { 7 },new int[] { 4,7,7 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2 },new int[] { 1,1 },new int[] { 1,1,2 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,1 },new int[] { 2 },new int[] { 1,1,2 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,2,3 },new int[] {  },new int[] { 1,2,3 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] { 1,2,3 },new int[] { 1,2,3 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2 },new int[] { 1,1 },new int[] { 2,1,1 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,1 },new int[] { 2 },new int[] { 2,1,1 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 3,2,1 },new int[] {  },new int[] { 3,2,1 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] { 3,2,1 },new int[] { 3,2,1 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 8,7,7 },new int[] { 3 },new int[] { 8,7,7,3 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] { 9,8,7,7,5 },new int[] { 9,8,7,7,5 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 3,3,2,1 },new int[] { 3 },new int[] { 3,3,3,2,1 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 3,6,7,9 },new int[] { 5,6 },new int[] { 3,5,6,6,7,9 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 9,2 },new int[] { 4,3,3,2 },new int[] { 9,4,3,3,2,2 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 4,5 },new int[] { 1,2,9,10 },new int[] { 1,2,4,5,9,10 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 6,5,4,4 },new int[] { 7,3 },new int[] { 7,6,5,4,4,3 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,5 },new int[] { 2,3,3,7,9 },new int[] { 1,2,3,3,5,7,9 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,2,3,5,7,10 },new int[] { 2,3 },new int[] { 1,2,2,3,3,5,7,10 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,1,5,7,8,9 },new int[] { 2,9 },new int[] { 1,1,2,5,7,8,9,9 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 4,5,10 },new int[] { 2,3,6,8,9 },new int[] { 2,3,4,5,6,8,9,10 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2,3,3,4,7,8,9,9 },new int[] { 3 },new int[] { 2,3,3,3,4,7,8,9,9 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] { 4,5,6,6,6,7,8,9,10 },new int[] { 4,5,6,6,6,7,8,9,10 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 10,9,5,3 },new int[] { 9,8,7,4,1 },new int[] { 10,9,9,8,7,5,4,3,1 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,2,2,3,4,5,6,7 },new int[] { 5,6 },new int[] { 1,2,2,3,4,5,5,6,6,7 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 7,1 },new int[] { 9,9,8,7,6,6,4,1 },new int[] { 9,9,8,7,7,6,6,4,1,1 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 9,8,8,3,3 },new int[] { 9,6,4,2,2 },new int[] { 9,9,8,8,6,4,3,3,2,2 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,2,5,8 },new int[] { 1,1,3,6,6,8,9 },new int[] { 1,1,1,2,3,5,6,6,8,8,9 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_37 ()
  {
      
      testName = "test_37" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,2,2,2,2,5,5 },new int[] { 2,4,7,9 },new int[] { 1,2,2,2,2,2,4,5,5,7,9 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_38 ()
  {
      
      testName = "test_38" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,2,3,3,8,9,9,10 },new int[] { 6,8,9,9 },new int[] { 1,2,3,3,6,8,8,9,9,9,9,10 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_39 ()
  {
      
      testName = "test_39" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,2,5,5,5,6,6,6,8,8,9,9 },new int[] {  },new int[] { 1,2,5,5,5,6,6,6,8,8,9,9 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_40 ()
  {
      
      testName = "test_40" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2,3,6,6,9,10,10 },new int[] { 2,4,4,5,9,9 },new int[] { 2,2,3,4,4,5,6,6,9,9,9,10,10 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_41 ()
  {
      
      testName = "test_41" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,1,3,6,6,9 },new int[] { 1,5,5,6,7,8,8,10 },new int[] { 1,1,1,3,5,5,6,6,6,7,8,8,9,10 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_42 ()
  {
      
      testName = "test_42" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,2,3,4,5,6,7,7,8,8,9 },new int[] { 7,8,9 },new int[] { 1,2,3,4,5,6,7,7,7,8,8,8,9,9 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_43 ()
  {
      
      testName = "test_43" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 10,9,9,9,1 },new int[] { 10,9,8,6,6,5,3,3,1 },new int[] { 10,10,9,9,9,9,8,6,6,5,3,3,1,1 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_44 ()
  {
      
      testName = "test_44" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,1,2,3,3,3,10,10 },new int[] { 2,2,3,3,5,8,8 },new int[] { 1,1,2,2,2,3,3,3,3,3,5,8,8,10,10 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_45 ()
  {
      
      testName = "test_45" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 10,9,8,7,6,5,5,3,2,1,1 },new int[] { 10,7,3,3,2 },new int[] { 10,10,9,8,7,7,6,5,5,3,3,3,2,2,1,1 },false,true) ;
      return ok_sofar ;
  }


  private static boolean test_46 ()
  {
      
      testName = "test_46" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,5,6,6,9,9,9,10,10 },new int[] { 2,3,3,4,5,6,7,8,8,10,10 },new int[] { 1,2,3,3,4,5,5,6,6,6,7,8,8,9,9,9,10,10,10,10 },true,true) ;
      return ok_sofar ;
  }


  private static boolean test_47 ()
  {
      
      testName = "test_47" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] {  },new int[] {  },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_48 ()
  {
      
      testName = "test_48" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 6 },new int[] {  },new int[] { 6 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_49 ()
  {
      
      testName = "test_49" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1 },new int[] {  },new int[] { 1 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_50 ()
  {
      
      testName = "test_50" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] { 1 },new int[] { 1 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_51 ()
  {
      
      testName = "test_51" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1 },new int[] { 1 },new int[] { 1,1 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_52 ()
  {
      
      testName = "test_52" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2 },new int[] { 1 },new int[] { 1,2 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_53 ()
  {
      
      testName = "test_53" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1 },new int[] { 2 },new int[] { 1,2 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_54 ()
  {
      
      testName = "test_54" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2 },new int[] { 1 },new int[] { 2,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_55 ()
  {
      
      testName = "test_55" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1 },new int[] { 2 },new int[] { 2,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_56 ()
  {
      
      testName = "test_56" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] { 2,1,1 },new int[] { 2,1,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_57 ()
  {
      
      testName = "test_57" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 6 },new int[] { 10,9 },new int[] { 10,9,6 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_58 ()
  {
      
      testName = "test_58" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2 },new int[] { 1,3 },new int[] { 1,2,3 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_59 ()
  {
      
      testName = "test_59" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2 },new int[] { 1,1 },new int[] { 1,1,2 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_60 ()
  {
      
      testName = "test_60" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,1 },new int[] { 2 },new int[] { 1,1,2 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_61 ()
  {
      
      testName = "test_61" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,2,3 },new int[] {  },new int[] { 1,2,3 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_62 ()
  {
      
      testName = "test_62" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] { 1,2,3 },new int[] { 1,2,3 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_63 ()
  {
      
      testName = "test_63" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2 },new int[] { 1,1 },new int[] { 2,1,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_64 ()
  {
      
      testName = "test_64" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,1 },new int[] { 2 },new int[] { 2,1,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_65 ()
  {
      
      testName = "test_65" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 3,2,1 },new int[] {  },new int[] { 3,2,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_66 ()
  {
      
      testName = "test_66" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] { 3,2,1 },new int[] { 3,2,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_67 ()
  {
      
      testName = "test_67" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 6,6,7 },new int[] { 8 },new int[] { 6,6,7,8 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_68 ()
  {
      
      testName = "test_68" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 10,9,9,6 },new int[] {  },new int[] { 10,9,9,6 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_69 ()
  {
      
      testName = "test_69" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,4,5,6,9 },new int[] {  },new int[] { 1,4,5,6,9 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_70 ()
  {
      
      testName = "test_70" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2,2,8 },new int[] { 2,3,3 },new int[] { 2,2,2,3,3,8 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_71 ()
  {
      
      testName = "test_71" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 3,3,3,4,4,9 },new int[] {  },new int[] { 3,3,3,4,4,9 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_72 ()
  {
      
      testName = "test_72" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 8,7,6,6,3 },new int[] { 7 },new int[] { 8,7,7,6,6,3 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_73 ()
  {
      
      testName = "test_73" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2,3,10,10 },new int[] { 4,8 },new int[] { 2,3,4,8,10,10 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_74 ()
  {
      
      testName = "test_74" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 3,7,9,10 },new int[] { 2,3,3 },new int[] { 2,3,3,3,7,9,10 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_75 ()
  {
      
      testName = "test_75" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 2,6,6 },new int[] { 1,1,2,4 },new int[] { 1,1,2,2,4,6,6 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_76 ()
  {
      
      testName = "test_76" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 10,3 },new int[] { 6,5,5,4,1,1 },new int[] { 10,6,5,5,4,3,1,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_77 ()
  {
      
      testName = "test_77" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 3,3,5,6,7,8,10 },new int[] { 4 },new int[] { 3,3,4,5,6,7,8,10 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_78 ()
  {
      
      testName = "test_78" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 9,7,6,3,2,1,1 },new int[] { 4 },new int[] { 9,7,6,4,3,2,1,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_79 ()
  {
      
      testName = "test_79" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 5 },new int[] { 9,9,7,7,5,5,4,3 },new int[] { 9,9,7,7,5,5,5,4,3 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_80 ()
  {
      
      testName = "test_80" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 5,8 },new int[] { 1,2,2,5,5,7,10 },new int[] { 1,2,2,5,5,5,7,8,10 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_81 ()
  {
      
      testName = "test_81" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 10,10,6,6,6,5 },new int[] { 5,4,1 },new int[] { 10,10,6,6,6,5,5,4,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_82 ()
  {
      
      testName = "test_82" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 7,7,5,5,4 },new int[] { 10,9,6,1 },new int[] { 10,9,7,7,6,5,5,4,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_83 ()
  {
      
      testName = "test_83" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 10,9,5,5,3 },new int[] { 8,7,7,4 },new int[] { 10,9,8,7,7,5,5,4,3 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_84 ()
  {
      
      testName = "test_84" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,1,2,5,8,10,10 },new int[] { 7,7,7 },new int[] { 1,1,2,5,7,7,7,8,10,10 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_85 ()
  {
      
      testName = "test_85" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] {  },new int[] { 9,8,6,5,3,3,3,2,2,1 },new int[] { 9,8,6,5,3,3,3,2,2,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_86 ()
  {
      
      testName = "test_86" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 8,7,7,6,4 },new int[] { 7,5,4,4,3 },new int[] { 8,7,7,7,6,5,4,4,4,3 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_87 ()
  {
      
      testName = "test_87" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 8,6,1 },new int[] { 10,9,9,8,7,6,3,3,2 },new int[] { 10,9,9,8,8,7,6,6,3,3,2,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_88 ()
  {
      
      testName = "test_88" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 8,8,7,5,5,4,3 },new int[] { 10,10,7,6,4,3,2,1 },new int[] { 10,10,8,8,7,7,6,5,5,4,4,3,3,2,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_89 ()
  {
      
      testName = "test_89" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 10,9,8,7,4,3,1 },new int[] { 10,9,7,6,6,4,1,1,1 },new int[] { 10,10,9,9,8,7,7,6,6,4,4,3,1,1,1,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_90 ()
  {
      
      testName = "test_90" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 10,9,5,3,3,2,1 },new int[] { 9,9,9,8,7,6,6,5,4,3,2 },new int[] { 10,9,9,9,9,8,7,6,6,5,5,4,3,3,3,2,2,1 },false,false) ;
      return ok_sofar ;
  }


  private static boolean test_91 ()
  {
      
      testName = "test_91" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,1,2,2,3,4,5,6,8,9,10 },new int[] { 3,5,5,6,6,6,9,9,10 },new int[] { 1,1,2,2,3,3,4,5,5,5,6,6,6,6,8,9,9,9,10,10 },true,false) ;
      return ok_sofar ;
  }


  private static boolean test_92 ()
  {
      
      testName = "test_92" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      ok_sofar = TesterInd3.check_mergeLists(new int[] { 1,2,3,5,6,8,9,9,10,10 },new int[] { 1,1,2,2,3,4,6,6,7,7,7,8 },new int[] { 1,1,1,2,2,2,3,3,4,5,6,6,6,7,7,7,8,8,9,9,10,10 },true,false) ;
      return ok_sofar ;
  }



  static int test_type_to_index(String test_type) {
      if (test_type.equals("mergeLists_PositionList")) return 0;
      if (test_type.equals("mergeLists_IndexedList")) return 1;
      System.out.println("\n*** Error in test setup: unknown test type: "+test_type);
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

  static boolean results_ok(boolean results_sofar[], boolean general_results) {
      return results_sofar[0];
  }

static void report_results(String tester, boolean results_sofar[], boolean general_results) {
      System.out.println("\n++++++++++++++++++++++++++++++++++++++++++\n");

      for (int i=0; i<results_sofar.length; i++) {
	  String testName="";
	  if (i==0) testName = "merge with PositionList";
	  if (i==1) testName = "merge with IndexedList";

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

      if (results_ok(results_sofar,general_results) && !results_sofar[1]) {
	  System.out.println("\n\n*** Observad que la implementación usando "+
			     "indexed lists no es correcto --\n"+
			     "    como consecuencia la nota maxima obtenible es 8 en vez de 11.\n");
      }
  }


  static void printWarning(String TestName) {
      System.out.println("\n*** Warning in "+TestName+":");
  }

  static void printError(String TestName) {
      System.out.println("\n*** Error in "+TestName+":");
  }

  static boolean compare(Object o1, Object o2) {
      if (o1==null) return o2==null;
      else return o1.equals(o2);
  }

    static void printCallException(ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n*** Error in "+testName+": ");

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
      System.out.println("\n*** Error in "+testName+": ");
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

  static boolean check_mergeLists(int[] l1, int[] l2, int[] expected, boolean ascending, boolean positionLists) {
      boolean ok_sofar = true;
      String argType = "";
      String comparator = "";
      if (ascending)
	  comparator = "integers in ascending order";
      else
	  comparator = "integers in descending order";
      if (positionLists)
	  argType = "PositionList";
      else
	  argType = "IndexedList";
      String callString =
	  "MergeLists.mergeLists("+printArray(l1)+","+printArray(l2)+
	  ") (using lists of type "+argType+") and with the comparator ordering "+comparator;

      Comparator<Integer> cmp = null;
      if (ascending)
	  cmp = new AscendingComparator();
      else
	  cmp = new DescendingComparator();

      int[] result = null;
      if (positionLists)
	  result = mergeLists_positionlists(callString,l1,l2,cmp);
      else
	  result = mergeLists_indexedlists(callString,l1,l2,cmp);

      if (result == null) {
	  ok_sofar = false;
	  return false;
      }
      
      if (ok_sofar && result.length != expected.length) {
	  ok_sofar = false;
      }

      int i=0;
      while (i<result.length && ok_sofar) {
	  if (result[i] != expected[i]) ok_sofar=false;
	  i++;
      }
					    
      if (!ok_sofar) {
	  printError
	      (ExecutionTime.UNRELATED,
	       "the call "+callString+
	       " returns the list "+printArray(result)+
	       " instead of the correct list "+printArray(expected));
	  ok_sofar = false;
	  return false;
      }

      return ok_sofar;
  }

  static int[] mergeLists_positionlists(String callString, int[] l1, int[] l2, Comparator<Integer> cmp) {

      PositionList<Integer> l1l = new NodePositionList<Integer>();
      for (int k=0; k<l1.length; k++)
	  l1l.addLast(new Integer(l1[k]));

      PositionList<Integer> l2l = new NodePositionList<Integer>();
      for (int k=0; k<l2.length; k++)
	  l2l.addLast(new Integer(l2[k]));
	  
      PositionList<Integer> result = null;
      try {
	  result = MergeLists.merge(l1l,l2l,cmp);
      } catch ( Throwable exc ) {
	  printCallException(callString,exc);
	  return null;
      }
	  
      if (result == null) {
	  printError
	      (ExecutionTime.UNRELATED,
	       "the call "+callString+
	       " returned null");
	  return null;
      }

      int[] arrResult = new int[result.size()];
      Position<Integer> cursor = result.first();
      int i=0;
      while (cursor != null) {
	  Integer e = cursor.element();
	  if (e == null) {
	      printError
		  (ExecutionTime.UNRELATED,
		   "the call "+callString+
		   " returned a list with null elements: "+result);
	      return null;
	  }
	  arrResult[i] = e.intValue();
	  cursor = result.next(cursor);
	  ++i;
      }

      if (!unChanged(callString,l1,l1l))
	  return null;

      if (!unChanged(callString,l2,l2l))
	  return null;

      return arrResult;
  }

  static int[] mergeLists_indexedlists(String callString, int[] l1, int[] l2, Comparator<Integer> cmp) {

      IndexedList<Integer> l1l = new ArrayIndexedList<Integer>();
      for (int k=0; k<l1.length; k++)
	  l1l.add(k,new Integer(l1[k]));

      IndexedList<Integer> l2l = new ArrayIndexedList<Integer>();
      for (int k=0; k<l2.length; k++)
	  l2l.add(k,new Integer(l2[k]));
	  
      IndexedList<Integer> result = null;
      try {
	  result = MergeLists.merge(l1l,l2l,cmp);
      } catch ( Throwable exc ) {
	  printCallException(callString,exc);
	  return null;
      }
	  
      if (result == null) {
	  printError
	      (ExecutionTime.UNRELATED,
	       "the call "+callString+
	       " returned null");
	  return null;
      }

      int[] arrResult = new int[result.size()];
      int i=0;
      while (i < result.size()) {
	  Integer e = result.get(i);
	  if (e == null) {
	      printError
		  (ExecutionTime.UNRELATED,
		   "the call "+callString+
		   " returned a list with null elements: "+result);
	      return null;
	  }
	  arrResult[i] = e.intValue();
	  ++i;
      }

      if (!unChanged(callString,l1,l1l))
	  return null;

      if (!unChanged(callString,l2,l2l))
	  return null;

      return arrResult;
  }

  static boolean unChanged(String callString, int[] original, PositionList<Integer> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      Position<Integer> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  Integer elem = lPos.element();
	  if (elem == null || elem.intValue() != original[i]) {
	      ok_sofar = false;
	  } else {
	      lPos = l.next(lPos);
	      ++i;
	  }
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

  static boolean unChanged(String callString, int[] original, IndexedList<Integer> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      int i=0;
      while (ok_sofar && i<l.size()) {
	  Integer elem = l.get(i);
	  if (elem == null || elem.intValue() != original[i]) {
	      ok_sofar = false;
	  } else {
	      ++i;
	  }
      }

      if (!ok_sofar) {
	  printError
	      (ExecutionTime.UNRELATED,
	       "the call "+callString+
	       " has modified the input list "+original+
	       "; it has now the elements "+l);
	  return ok_sofar;
      }

      return ok_sofar;
  }

  static String printArray(int[] arr) {
      if (arr == null) return "null";
      else {
	  StringBuilder arrString = new StringBuilder("[");
      
	  for (int i = 0; i < arr.length; i++) {
	      arrString.append(arr[i]);
	      if (i < arr.length-1)
		  arrString.append(" ");
	  }
	  arrString.append("]");
	  return arrString.toString();
      }
  }
}



