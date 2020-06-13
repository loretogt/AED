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

package aed.iteradores;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.util.Iterator;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;
import es.upm.aedlib.indexedlist.*;

@SuppressWarnings("unused")
public class TesterLab3 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";
  static Secretaria secretaria = null;

  public static void main(String[] args) {

    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    boolean[] results_sofar =
      {
        true
        ,true
        ,true
        ,true
        //,true
      };
    boolean general_results = true;
    boolean ok_sofar = true;
    


    //////////////////////////////////////////////////////////////////////
    //
    // File generated at: 2017/10/12 -- 23:52:39
    // Seed: {1507,845156,717693}
    //
    //////////////////////////////////////////////////////////////////////



    try {
      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_3(), results_sofar, "test_3", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_4(), results_sofar, "test_4", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_15(), results_sofar, "test_15", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_16(), results_sofar, "test_16", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_18(), results_sofar, "test_18", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"notaMediaExpediente") && local_results_ok_sofar(results_sofar,"notaMediaExpediente"))
        results_sofar =
          combine_results(test_31(), results_sofar, "test_31", "notaMediaExpediente");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_32(), results_sofar, "test_32", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_33(), results_sofar, "test_33", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_34(), results_sofar, "test_34", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_35(), results_sofar, "test_35", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_36(), results_sofar, "test_36", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_37(), results_sofar, "test_37", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_38(), results_sofar, "test_38", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_39(), results_sofar, "test_39", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_40(), results_sofar, "test_40", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_41(), results_sofar, "test_41", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_42(), results_sofar, "test_42", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_43(), results_sofar, "test_43", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_44(), results_sofar, "test_44", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_45(), results_sofar, "test_45", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_46(), results_sofar, "test_46", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_47(), results_sofar, "test_47", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_48(), results_sofar, "test_48", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_49(), results_sofar, "test_49", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_50(), results_sofar, "test_50", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_51(), results_sofar, "test_51", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_52(), results_sofar, "test_52", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_53(), results_sofar, "test_53", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_54(), results_sofar, "test_54", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_55(), results_sofar, "test_55", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_56(), results_sofar, "test_56", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_57(), results_sofar, "test_57", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_58(), results_sofar, "test_58", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_59(), results_sofar, "test_59", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_60(), results_sofar, "test_60", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"asignaturasNoConflictivas") && local_results_ok_sofar(results_sofar,"asignaturasNoConflictivas"))
        results_sofar =
          combine_results(test_61(), results_sofar, "test_61", "asignaturasNoConflictivas");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_62(), results_sofar, "test_62", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_63(), results_sofar, "test_63", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_64(), results_sofar, "test_64", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_65(), results_sofar, "test_65", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_66(), results_sofar, "test_66", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_67(), results_sofar, "test_67", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_68(), results_sofar, "test_68", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_69(), results_sofar, "test_69", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_70(), results_sofar, "test_70", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_71(), results_sofar, "test_71", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_72(), results_sofar, "test_72", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_73(), results_sofar, "test_73", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_74(), results_sofar, "test_74", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_75(), results_sofar, "test_75", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_76(), results_sofar, "test_76", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_77(), results_sofar, "test_77", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_78(), results_sofar, "test_78", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_79(), results_sofar, "test_79", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_80(), results_sofar, "test_80", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_81(), results_sofar, "test_81", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_82(), results_sofar, "test_82", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_83(), results_sofar, "test_83", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_84(), results_sofar, "test_84", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_85(), results_sofar, "test_85", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_86(), results_sofar, "test_86", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_87(), results_sofar, "test_87", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_88(), results_sofar, "test_88", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_89(), results_sofar, "test_89", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_90(), results_sofar, "test_90", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"mejorNotaMedia") && local_results_ok_sofar(results_sofar,"mejorNotaMedia"))
        results_sofar =
          combine_results(test_91(), results_sofar, "test_91", "mejorNotaMedia");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_92(), results_sofar, "test_92", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_93(), results_sofar, "test_93", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_94(), results_sofar, "test_94", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_95(), results_sofar, "test_95", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_96(), results_sofar, "test_96", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_97(), results_sofar, "test_97", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_98(), results_sofar, "test_98", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_99(), results_sofar, "test_99", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_100(), results_sofar, "test_100", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_101(), results_sofar, "test_101", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_102(), results_sofar, "test_102", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_103(), results_sofar, "test_103", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_104(), results_sofar, "test_104", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_105(), results_sofar, "test_105", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_106(), results_sofar, "test_106", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_107(), results_sofar, "test_107", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_108(), results_sofar, "test_108", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_109(), results_sofar, "test_109", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_110(), results_sofar, "test_110", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_111(), results_sofar, "test_111", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_112(), results_sofar, "test_112", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_113(), results_sofar, "test_113", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_114(), results_sofar, "test_114", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_115(), results_sofar, "test_115", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_116(), results_sofar, "test_116", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_117(), results_sofar, "test_117", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_118(), results_sofar, "test_118", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_119(), results_sofar, "test_119", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_120(), results_sofar, "test_120", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_121(), results_sofar, "test_121", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_122(), results_sofar, "test_122", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_123(), results_sofar, "test_123", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_124(), results_sofar, "test_124", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_125(), results_sofar, "test_125", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_126(), results_sofar, "test_126", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_127(), results_sofar, "test_127", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_128(), results_sofar, "test_128", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_129(), results_sofar, "test_129", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_130(), results_sofar, "test_130", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_131(), results_sofar, "test_131", "expediente");

      if (results_ok_sofar(results_sofar,"expediente") && local_results_ok_sofar(results_sofar,"expediente"))
        results_sofar =
          combine_results(test_132(), results_sofar, "test_132", "expediente");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          System.exit(24);
      }


    report_results("TesterLab3",results_sofar,general_results);


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
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      ok_sofar = TesterLab3.check_notaMediaExpediente("444",secretaria,0) ;
      return ok_sofar ;
  }


  private static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_notaMediaExpediente("111",secretaria,0) ;
      return ok_sofar ;
  }


  private static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_notaMediaExpediente("111",secretaria,0) ;
      return ok_sofar ;
  }


  private static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_notaMediaExpediente("222",secretaria,0) ;
      return ok_sofar ;
  }


  private static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("222",secretaria,1.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",7) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("111",secretaria,7.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("222",secretaria,9.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",6) ;
          asignatura.setNota("111",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("444",secretaria,6.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",3) ;
          asignatura.setNota("111",7) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("222",secretaria,3.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",2) ;
          asignatura.setNota("444",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("111",secretaria,2.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",3) ;
          asignatura.setNota("111",5) ;
          asignatura.setNota("222",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("111",secretaria,5.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",7) ;
          asignatura.setNota("222",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("222",secretaria,9.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",4) ;
          asignatura.setNota("444",1) ;
          asignatura.setNota("111",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("111",secretaria,3.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_notaMediaExpediente("111",secretaria,1.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("444",secretaria,8.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("111",secretaria,4.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("999",secretaria,0) ;
      return ok_sofar ;
  }


  private static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",1) ;
          asignatura.setNota("444",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_notaMediaExpediente("333",secretaria,1.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("333",secretaria,0) ;
      return ok_sofar ;
  }


  private static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignaturaMatriculas.add(0,"111") ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_notaMediaExpediente("111",secretaria,1.00000000000000000000e+01) ;
      return ok_sofar ;
  }


  private static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",3) ;
          asignatura.setNota("333",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("111",secretaria,3.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignaturaMatriculas.add(0,"333") ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",3) ;
          asignatura.setNota("111",5) ;
          asignatura.setNota("222",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("333",secretaria,3.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",7) ;
          asignatura.setNota("111",2) ;
          asignatura.setNota("333",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",10) ;
          asignatura.setNota("111",7) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("222",secretaria,7.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",9) ;
          asignatura.setNota("444",3) ;
          asignatura.setNota("222",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",10) ;
          asignatura.setNota("444",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("333",secretaria,9.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",10) ;
          asignatura.setNota("444",6) ;
          asignatura.setNota("333",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",5) ;
          asignatura.setNota("444",10) ;
          asignatura.setNota("111",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("444",secretaria,8.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignaturaMatriculas.add(0,"111") ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("111",secretaria,0) ;
      return ok_sofar ;
  }


  private static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",10) ;
          asignatura.setNota("444",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",6) ;
          asignatura.setNota("222",7) ;
          asignatura.setNota("444",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_notaMediaExpediente("222",secretaria,7.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",8) ;
          asignatura.setNota("444",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",6) ;
          asignatura.setNota("222",10) ;
          asignatura.setNota("333",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("111",secretaria,0) ;
      return ok_sofar ;
  }


  private static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("222",secretaria,3.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",8) ;
          asignatura.setNota("333",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_notaMediaExpediente("222",secretaria,9.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",1) ;
          asignatura.setNota("111",3) ;
          asignatura.setNota("222",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_notaMediaExpediente("444",secretaria,1.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignaturaMatriculas.add(0,"111") ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_37 ()
  {
      
      testName = "test_37" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_38 ()
  {
      
      testName = "test_38" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_39 ()
  {
      
      testName = "test_39" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",6) ;
          asignatura.setNota("111",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_40 ()
  {
      
      testName = "test_40" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",6) ;
          asignatura.setNota("111",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_41 ()
  {
      
      testName = "test_41" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",10) ;
          asignatura.setNota("444",9) ;
          asignatura.setNota("222",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_42 ()
  {
      
      testName = "test_42" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",9) ;
          asignatura.setNota("444",3) ;
          asignatura.setNota("111",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_43 ()
  {
      
      testName = "test_43" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "Concurrencia" },new String[] { "Programacion I" }) ;
      return ok_sofar ;
  }


  private static boolean test_44 ()
  {
      
      testName = "test_44" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "AED" },new String[] { "Programacion II" }) ;
      return ok_sofar ;
  }


  private static boolean test_45 ()
  {
      
      testName = "test_45" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "PPS" },new String[] { "Programacion II" }) ;
      return ok_sofar ;
  }


  private static boolean test_46 ()
  {
      
      testName = "test_46" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "PPS" },new String[] { "Programacion II" }) ;
      return ok_sofar ;
  }


  private static boolean test_47 ()
  {
      
      testName = "test_47" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "PPS" },new String[] { "Programacion II" }) ;
      return ok_sofar ;
  }


  private static boolean test_48 ()
  {
      
      testName = "test_48" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "AED" },new String[] { "PPS" }) ;
      return ok_sofar ;
  }


  private static boolean test_49 ()
  {
      
      testName = "test_49" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "Concurrencia" },new String[] { "Programacion II" }) ;
      return ok_sofar ;
  }


  private static boolean test_50 ()
  {
      
      testName = "test_50" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",1) ;
          asignatura.setNota("444",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "AED" },new String[] { "Concurrencia" }) ;
      return ok_sofar ;
  }


  private static boolean test_51 ()
  {
      
      testName = "test_51" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "AED" },new String[] { "Concurrencia" }) ;
      return ok_sofar ;
  }


  private static boolean test_52 ()
  {
      
      testName = "test_52" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",9) ;
          asignatura.setNota("222",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",8) ;
          asignatura.setNota("333",2) ;
          asignatura.setNota("444",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_53 ()
  {
      
      testName = "test_53" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "Concurrencia","Concurrencia","PPS" },new String[] { "PPS","Programacion I","Programacion I" }) ;
      return ok_sofar ;
  }


  private static boolean test_54 ()
  {
      
      testName = "test_54" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",5) ;
          asignatura.setNota("444",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "AED","PPS","AED" },new String[] { "PPS","Programacion II","Programacion II" }) ;
      return ok_sofar ;
  }


  private static boolean test_55 ()
  {
      
      testName = "test_55" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",7) ;
          asignatura.setNota("444",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "AED","AED","Programacion I" },new String[] { "Programacion I","Programacion II","Programacion II" }) ;
      return ok_sofar ;
  }


  private static boolean test_56 ()
  {
      
      testName = "test_56" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",2) ;
          asignatura.setNota("444",2) ;
          asignatura.setNota("333",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "AED","PPS","AED" },new String[] { "Programacion II","Programacion II","PPS" }) ;
      return ok_sofar ;
  }


  private static boolean test_57 ()
  {
      
      testName = "test_57" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",10) ;
          asignatura.setNota("333",7) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "Programacion I","AED" },new String[] { "Programacion II","Programacion I" }) ;
      return ok_sofar ;
  }


  private static boolean test_58 ()
  {
      
      testName = "test_58" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",2) ;
          asignatura.setNota("111",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "AED","PPS","AED" },new String[] { "Programacion II","Programacion II","PPS" }) ;
      return ok_sofar ;
  }


  private static boolean test_59 ()
  {
      
      testName = "test_59" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",8) ;
          asignatura.setNota("333",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",10) ;
          asignatura.setNota("111",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "Programacion I","AED","AED","Concurrencia","Concurrencia","AED" },new String[] { "Programacion II","Programacion I","Programacion II","Programacion I","Programacion II","Concurrencia" }) ;
      return ok_sofar ;
  }


  private static boolean test_60 ()
  {
      
      testName = "test_60" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",3) ;
          asignatura.setNota("222",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "AED","PPS","PPS" },new String[] { "PPS","Programacion II","Programacion I" }) ;
      return ok_sofar ;
  }


  private static boolean test_61 ()
  {
      
      testName = "test_61" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",10) ;
          asignatura.setNota("111",2) ;
          asignatura.setNota("444",3) ;
          asignatura.setNota("333",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",7) ;
          asignatura.setNota("444",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_asignaturasNoConflictivas(secretaria,new String[] { "AED","PPS" },new String[] { "Programacion II","Programacion II" }) ;
      return ok_sofar ;
  }


  private static boolean test_62 ()
  {
      
      testName = "test_62" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,null) ;
      return ok_sofar ;
  }


  private static boolean test_63 ()
  {
      
      testName = "test_63" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,null) ;
      return ok_sofar ;
  }


  private static boolean test_64 ()
  {
      
      testName = "test_64" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,null) ;
      return ok_sofar ;
  }


  private static boolean test_65 ()
  {
      
      testName = "test_65" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"PPS") ;
      return ok_sofar ;
  }


  private static boolean test_66 ()
  {
      
      testName = "test_66" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Programacion I") ;
      return ok_sofar ;
  }


  private static boolean test_67 ()
  {
      
      testName = "test_67" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignaturaMatriculas.add(0,"222") ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,null) ;
      return ok_sofar ;
  }


  private static boolean test_68 ()
  {
      
      testName = "test_68" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Concurrencia") ;
      return ok_sofar ;
  }


  private static boolean test_69 ()
  {
      
      testName = "test_69" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Programacion II") ;
      return ok_sofar ;
  }


  private static boolean test_70 ()
  {
      
      testName = "test_70" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",9) ;
          asignatura.setNota("444",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"PPS") ;
      return ok_sofar ;
  }


  private static boolean test_71 ()
  {
      
      testName = "test_71" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",3) ;
          asignatura.setNota("111",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Programacion I") ;
      return ok_sofar ;
  }


  private static boolean test_72 ()
  {
      
      testName = "test_72" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",5) ;
          asignatura.setNota("222",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Programacion II") ;
      return ok_sofar ;
  }


  private static boolean test_73 ()
  {
      
      testName = "test_73" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Concurrencia") ;
      return ok_sofar ;
  }


  private static boolean test_74 ()
  {
      
      testName = "test_74" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",3) ;
          asignatura.setNota("333",7) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Programacion I") ;
      return ok_sofar ;
  }


  private static boolean test_75 ()
  {
      
      testName = "test_75" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",3) ;
          asignatura.setNota("222",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Programacion I") ;
      return ok_sofar ;
  }


  private static boolean test_76 ()
  {
      
      testName = "test_76" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",5) ;
          asignatura.setNota("333",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"PPS") ;
      return ok_sofar ;
  }


  private static boolean test_77 ()
  {
      
      testName = "test_77" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",6) ;
          asignatura.setNota("333",8) ;
          asignatura.setNota("222",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"AED") ;
      return ok_sofar ;
  }


  private static boolean test_78 ()
  {
      
      testName = "test_78" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",3) ;
          asignatura.setNota("333",5) ;
          asignatura.setNota("444",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Programacion II") ;
      return ok_sofar ;
  }


  private static boolean test_79 ()
  {
      
      testName = "test_79" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",5) ;
          asignatura.setNota("333",8) ;
          asignatura.setNota("222",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",7) ;
          asignatura.setNota("333",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Concurrencia") ;
      return ok_sofar ;
  }


  private static boolean test_80 ()
  {
      
      testName = "test_80" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",4) ;
          asignatura.setNota("333",10) ;
          asignatura.setNota("111",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",8) ;
          asignatura.setNota("222",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"PPS") ;
      return ok_sofar ;
  }


  private static boolean test_81 ()
  {
      
      testName = "test_81" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",5) ;
          asignatura.setNota("111",3) ;
          asignatura.setNota("222",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",5) ;
          asignatura.setNota("111",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"PPS") ;
      return ok_sofar ;
  }


  private static boolean test_82 ()
  {
      
      testName = "test_82" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",10) ;
          asignatura.setNota("333",1) ;
          asignatura.setNota("444",3) ;
          asignatura.setNota("222",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",2) ;
          asignatura.setNota("222",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Programacion II") ;
      return ok_sofar ;
  }


  private static boolean test_83 ()
  {
      
      testName = "test_83" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Programacion II") ;
      return ok_sofar ;
  }


  private static boolean test_84 ()
  {
      
      testName = "test_84" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",1) ;
          asignatura.setNota("333",3) ;
          asignatura.setNota("111",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Programacion II") ;
      return ok_sofar ;
  }


  private static boolean test_85 ()
  {
      
      testName = "test_85" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",6) ;
          asignatura.setNota("111",10) ;
          asignatura.setNota("333",6) ;
          asignatura.setNota("222",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Programacion II") ;
      return ok_sofar ;
  }


  private static boolean test_86 ()
  {
      
      testName = "test_86" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Programacion II") ;
      return ok_sofar ;
  }


  private static boolean test_87 ()
  {
      
      testName = "test_87" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",10) ;
          asignatura.setNota("444",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Concurrencia") ;
      return ok_sofar ;
  }


  private static boolean test_88 ()
  {
      
      testName = "test_88" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",8) ;
          asignatura.setNota("222",3) ;
          asignatura.setNota("111",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Concurrencia") ;
      return ok_sofar ;
  }


  private static boolean test_89 ()
  {
      
      testName = "test_89" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",8) ;
          asignatura.setNota("444",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignaturaMatriculas.add(0,"222") ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Concurrencia") ;
      return ok_sofar ;
  }


  private static boolean test_90 ()
  {
      
      testName = "test_90" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",4) ;
          asignatura.setNota("333",4) ;
          asignatura.setNota("222",9) ;
          asignatura.setNota("111",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Concurrencia") ;
      return ok_sofar ;
  }


  private static boolean test_91 ()
  {
      
      testName = "test_91" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",3) ;
          asignatura.setNota("111",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",5) ;
          asignatura.setNota("222",10) ;
          asignatura.setNota("111",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",5) ;
          asignatura.setNota("444",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_mejorNotaMedia(secretaria,"Concurrencia") ;
      return ok_sofar ;
  }


  private static boolean test_92 ()
  {
      
      testName = "test_92" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      ok_sofar = TesterLab3.check_expediente("444",secretaria,new String[] {  },new int[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_93 ()
  {
      
      testName = "test_93" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("444",secretaria,new String[] {  },new int[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_94 ()
  {
      
      testName = "test_94" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("111",secretaria,new String[] {  },new int[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_95 ()
  {
      
      testName = "test_95" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("333",secretaria,new String[] {  },new int[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_96 ()
  {
      
      testName = "test_96" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("111",secretaria,new String[] {  },new int[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_97 ()
  {
      
      testName = "test_97" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("333",secretaria,new String[] { "Programacion II" },new int[] { 3 }) ;
      return ok_sofar ;
  }


  private static boolean test_98 ()
  {
      
      testName = "test_98" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("333",secretaria,new String[] { "AED" },new int[] { 10 }) ;
      return ok_sofar ;
  }


  private static boolean test_99 ()
  {
      
      testName = "test_99" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("111",secretaria,new String[] { "Programacion II" },new int[] { 9 }) ;
      return ok_sofar ;
  }


  private static boolean test_100 ()
  {
      
      testName = "test_100" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("333",secretaria,new String[] { "AED" },new int[] { 9 }) ;
      return ok_sofar ;
  }


  private static boolean test_101 ()
  {
      
      testName = "test_101" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("333",secretaria,new String[] { "PPS" },new int[] { 3 }) ;
      return ok_sofar ;
  }


  private static boolean test_102 ()
  {
      
      testName = "test_102" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",3) ;
          asignatura.setNota("111",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("333",secretaria,new String[] { "Programacion I" },new int[] { 3 }) ;
      return ok_sofar ;
  }


  private static boolean test_103 ()
  {
      
      testName = "test_103" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",2) ;
          asignatura.setNota("111",7) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("222",secretaria,new String[] { "Programacion II" },new int[] { 2 }) ;
      return ok_sofar ;
  }


  private static boolean test_104 ()
  {
      
      testName = "test_104" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",4) ;
          asignatura.setNota("444",7) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("444",secretaria,new String[] { "Programacion II" },new int[] { 7 }) ;
      return ok_sofar ;
  }


  private static boolean test_105 ()
  {
      
      testName = "test_105" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",8) ;
          asignatura.setNota("111",7) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("111",secretaria,new String[] { "Programacion I" },new int[] { 7 }) ;
      return ok_sofar ;
  }


  private static boolean test_106 ()
  {
      
      testName = "test_106" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",4) ;
          asignatura.setNota("333",4) ;
          asignatura.setNota("111",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("111",secretaria,new String[] { "PPS" },new int[] { 8 }) ;
      return ok_sofar ;
  }


  private static boolean test_107 ()
  {
      
      testName = "test_107" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",8) ;
          asignatura.setNota("333",1) ;
          asignatura.setNota("222",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("333",secretaria,new String[] { "PPS" },new int[] { 1 }) ;
      return ok_sofar ;
  }


  private static boolean test_108 ()
  {
      
      testName = "test_108" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",6) ;
          asignatura.setNota("444",10) ;
          asignatura.setNota("111",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("111",secretaria,new String[] { "Programacion II" },new int[] { 1 }) ;
      return ok_sofar ;
  }


  private static boolean test_109 ()
  {
      
      testName = "test_109" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("444",secretaria,new String[] {  },new int[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_110 ()
  {
      
      testName = "test_110" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("444",secretaria,new String[] {  },new int[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_111 ()
  {
      
      testName = "test_111" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("222",secretaria,new String[] {  },new int[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_112 ()
  {
      
      testName = "test_112" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("444",secretaria,new String[] { "PPS" },new int[] { 4 }) ;
      return ok_sofar ;
  }


  private static boolean test_113 ()
  {
      
      testName = "test_113" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("222",secretaria,new String[] { "AED" },new int[] { 4 }) ;
      return ok_sofar ;
  }


  private static boolean test_114 ()
  {
      
      testName = "test_114" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",7) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("444",secretaria,new String[] { "Concurrencia" },new int[] { 7 }) ;
      return ok_sofar ;
  }


  private static boolean test_115 ()
  {
      
      testName = "test_115" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",9) ;
          asignatura.setNota("222",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("222",secretaria,new String[] { "Programacion II" },new int[] { 6 }) ;
      return ok_sofar ;
  }


  private static boolean test_116 ()
  {
      
      testName = "test_116" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("333",secretaria,new String[] { "AED","Programacion I" },new int[] { 3,10 }) ;
      return ok_sofar ;
  }


  private static boolean test_117 ()
  {
      
      testName = "test_117" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignaturaMatriculas.add(0,"111") ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("111",secretaria,new String[] { "PPS" },new int[] { 10 }) ;
      return ok_sofar ;
  }


  private static boolean test_118 ()
  {
      
      testName = "test_118" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",4) ;
          asignatura.setNota("222",2) ;
          asignatura.setNota("111",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("222",secretaria,new String[] { "Concurrencia" },new int[] { 2 }) ;
      return ok_sofar ;
  }


  private static boolean test_119 ()
  {
      
      testName = "test_119" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",7) ;
          asignatura.setNota("333",2) ;
          asignatura.setNota("222",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("444",secretaria,new String[] { "Concurrencia" },new int[] { 7 }) ;
      return ok_sofar ;
  }


  private static boolean test_120 ()
  {
      
      testName = "test_120" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",10) ;
          asignatura.setNota("222",2) ;
          asignatura.setNota("111",3) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("111",secretaria,new String[] { "Programacion I" },new int[] { 3 }) ;
      return ok_sofar ;
  }


  private static boolean test_121 ()
  {
      
      testName = "test_121" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",5) ;
          asignatura.setNota("444",7) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("444",secretaria,new String[] { "AED" },new int[] { 7 }) ;
      return ok_sofar ;
  }


  private static boolean test_122 ()
  {
      
      testName = "test_122" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",1) ;
          asignatura.setNota("111",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",6) ;
          asignatura.setNota("444",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("222",secretaria,new String[] { "Concurrencia" },new int[] { 6 }) ;
      return ok_sofar ;
  }


  private static boolean test_123 ()
  {
      
      testName = "test_123" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",3) ;
          asignatura.setNota("111",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",9) ;
          asignatura.setNota("111",3) ;
          asignatura.setNota("444",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("111",secretaria,new String[] { "PPS","AED" },new int[] { 8,3 }) ;
      return ok_sofar ;
  }


  private static boolean test_124 ()
  {
      
      testName = "test_124" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",6) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("222",secretaria,new String[] { "AED" },new int[] { 6 }) ;
      return ok_sofar ;
  }


  private static boolean test_125 ()
  {
      
      testName = "test_125" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",2) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("444",secretaria,new String[] { "Concurrencia" },new int[] { 2 }) ;
      return ok_sofar ;
  }


  private static boolean test_126 ()
  {
      
      testName = "test_126" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",7) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("222",secretaria,new String[] { "Programacion II","AED" },new int[] { 4,7 }) ;
      return ok_sofar ;
  }


  private static boolean test_127 ()
  {
      
      testName = "test_127" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",3) ;
          asignatura.setNota("222",6) ;
          asignatura.setNota("444",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      ok_sofar = TesterLab3.check_expediente("444",secretaria,new String[] { "Programacion I" },new int[] { 1 }) ;
      return ok_sofar ;
  }


  private static boolean test_128 ()
  {
      
      testName = "test_128" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",6) ;
          asignatura.setNota("111",7) ;
          asignatura.setNota("333",7) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("222",secretaria,new String[] { "PPS" },new int[] { 6 }) ;
      return ok_sofar ;
  }


  private static boolean test_129 ()
  {
      
      testName = "test_129" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",10) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",10) ;
          asignatura.setNota("333",9) ;
          asignatura.setNota("111",8) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("444",secretaria,new String[] { "Programacion I","Programacion II" },new int[] { 9,10 }) ;
      return ok_sofar ;
  }


  private static boolean test_130 ()
  {
      
      testName = "test_130" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"111") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",7) ;
          asignatura.setNota("111",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("333",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("333",secretaria,new String[] { "Programacion II","Programacion I" },new int[] { 7,5 }) ;
      return ok_sofar ;
  }


  private static boolean test_131 ()
  {
      
      testName = "test_131" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",8) ;
          asignatura.setNota("444",4) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"333") ;
          asignaturaMatriculas.add(0,"222") ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",6) ;
          asignatura.setNota("333",6) ;
          asignatura.setNota("222",7) ;
          asignatura.setNota("444",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("222",secretaria,new String[] { "Programacion II","PPS" },new int[] { 8,7 }) ;
      return ok_sofar ;
  }


  private static boolean test_132 ()
  {
      
      testName = "test_132" ;
      callSeq = "" ;
      boolean ok_sofar = true ;
      IndexedList<AsignaturaAdmin> secretaria = new ArrayIndexedList<AsignaturaAdmin>() ;
      IndexedList<String> asignaturaMatriculas = null ;
      AsignaturaAdmin asignatura ;
      asignatura = new AsignaturaAdmin("Programacion I") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("AED") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"444") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("444",1) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("Programacion II") ;
      secretaria.add(0,asignatura) ;
      asignaturaMatriculas = new ArrayIndexedList<String>() ;
      asignaturaMatriculas.add(0,"111") ;
      asignaturaMatriculas.add(0,"444") ;
      asignatura.matricular(asignaturaMatriculas) ;
      asignatura = new AsignaturaAdmin("Concurrencia") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"111") ;
          asignaturaMatriculas.add(0,"333") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("111",8) ;
          asignatura.setNota("333",9) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      asignatura = new AsignaturaAdmin("PPS") ;
      secretaria.add(0,asignatura) ;
      try
      {
          asignaturaMatriculas = new ArrayIndexedList<String>() ;
          asignaturaMatriculas.add(0,"222") ;
          asignatura.matricular(asignaturaMatriculas) ;
          asignatura.setNota("222",5) ;
      }
      catch ( InvalidMatriculaException exc )
      {
          return false ;
      }
      ok_sofar = TesterLab3.check_expediente("999",secretaria,new String[] {  },new int[] {  }) ;
      return ok_sofar ;
  }



  static int test_type_to_index(String test_type) {
      if (test_type.equals("notaMediaExpediente")) return 0;
      else if (test_type.equals("mejorNotaMedia")) return 1;
      else if (test_type.equals("expediente")) return 2;
      else if (test_type.equals("asignaturasNoConflictivas")) return 3;
      //else if (test_type.equals("matricular")) return 4;
      System.out.println("\n*** Error in test setup: unknown test type: "+test_type);
      throw new RuntimeException();
  }

  static String index_to_test_type(int index) {
      if (index == 0) return "notaMediaExpediente";
      else if (index == 1) return "mejorNotaMedia";
      else if (index == 2) return "expediente";
      else if (index == 3) return "asignaturasNoConflictivas";
      //else if (index == 4) return "matricular";
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

  static boolean results_ok(boolean results_sofar[], boolean general_results) {
    boolean all_true = true;

    for (int i=0; i<results_sofar.length; i++)
      all_true = all_true && results_sofar[i];

    return all_true;
  }

static void report_results(String tester, boolean results_sofar[], boolean general_results) {
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
    printCallException(null, time, msg, exc);
  }

  static void printCallException(IndexedList<AsignaturaAdmin> secretaria,ExecutionTime time, String msg, Throwable exc) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+testName+": ");

      System.out.print("\nWith the ");
      printSecretaria(secretaria);

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

  static void printCallException(IndexedList<AsignaturaAdmin> secretaria, String msg, Throwable exc) {
    printCallException(secretaria,ExecutionTime.AFTER,msg,exc);
  }

  static void printCallException(IndexedList<AsignaturaAdmin> secretaria, Throwable exc) {
    printCallException(secretaria, ExecutionTime.LAST,"",exc);
  }

  static void printWarning(ExecutionTime time, String msg) {
      System.out.println("\n*** Warning for "+testName+": ");
      System.out.print(callSeqString(time));
      System.out.println(callSeq);
      System.out.println(msg+"\n");
  }

  static void printError(IndexedList<AsignaturaAdmin> secretaria, ExecutionTime time, String msg) {
      System.out.println("\n\n***********************************************");
      System.out.println("*** Error in "+testName+": ");

      System.out.print("\nWith the ");
      printSecretaria(secretaria);

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

  static boolean check_asignaturasNoConflictivas
    (IndexedList<AsignaturaAdmin> secretariaAsignaturas,
     String[] leftAsignaturas,
     String[] rightAsignaturas) {
    
    String methodName = "asignaturasNoConflictivas";
    String callString = methodName+"()";

    try {
      Secretaria secretaria = new Secretaria(secretariaAsignaturas);
      Iterable<Pair<String,String>> result = secretaria.asignaturasNoConflictivas();

      if (result == null) {
          printError
            (secretariaAsignaturas,
             ExecutionTime.UNRELATED,
             "the call "+callString+" returned null");
          return false;
      }

      HashMap<Pair<String,String>,Boolean> nonconflictingPairs =
        new HashMap<Pair<String,String>,Boolean>();

      for (int i=0; i<leftAsignaturas.length; i++) {
        Pair<String,String> key =
          new Pair<String,String>(leftAsignaturas[i],
                                  rightAsignaturas[i]);
          nonconflictingPairs.put(key,false);
      }

      for (Pair<String,String> resultPair : result) {
        if ((resultPair.getLeft() == null) || (resultPair.getRight() == null)) {
          printError
            (secretariaAsignaturas,
             ExecutionTime.UNRELATED,
             "the call "+callString+" returned pairs with null asignaturas: "+
             result);
          return false;
        }

        if (resultPair.getLeft().equals(resultPair.getRight())) {
          printError
            (secretariaAsignaturas,
             ExecutionTime.UNRELATED,
             "the call "+callString+" returned a pair "+
             resultPair+" with identical asignaturas");
          return false;
        }

        Pair<String,String> key;
        if (resultPair.getLeft().compareTo(resultPair.getRight()) > 0) {
          key = new Pair<String,String>(resultPair.getRight(),
                                        resultPair.getLeft());
        } else {
          key = new Pair<String,String>(resultPair.getLeft(),
                                        resultPair.getRight());
        }

        Boolean exists = nonconflictingPairs.get(key);
        if (exists == null) {
          printError
            (secretariaAsignaturas,
             ExecutionTime.UNRELATED,
             "the call "+callString+" returned pairs "+result+
             " but the asignaturas "+resultPair.getLeft()+
             " and "+resultPair.getRight()+" are conflicting.");
          return false;
        }
        nonconflictingPairs.put(key,true);
      }

      Set<Map.Entry<Pair<String,String>,Boolean>> entries =
        nonconflictingPairs.entrySet();
      for (Map.Entry<Pair<String,String>,Boolean> entry : entries) {
        Pair<String,String> entryKey = entry.getKey();
        Boolean entryValue = entry.getValue();
        if (entryValue == false) {
          printError
            (secretariaAsignaturas,
             ExecutionTime.UNRELATED,
             "the call "+callString+" returned pairs "+result+
             ";\nbut the non-conflicting asignatura pair "+
             entryKey.getLeft()+" and "+entryKey.getRight()+
             " is MISSING");
          return false;
        }
      }
    }
    catch ( Throwable exc ) {
      printCallException(secretariaAsignaturas,callString,exc);
      return false;
    }
    return true;
  }

  static boolean check_expediente
    (String matricula,
     IndexedList<AsignaturaAdmin> secretariaAsignaturas,
     String[] asignaturas,
     int[] notas) {
    
    String methodName = "expediente";
    String callString = methodName+"("+matricula+")";

    try {
      Secretaria secretaria = new Secretaria(secretariaAsignaturas);
      Iterable<Pair<String,Integer>> result = secretaria.expediente(matricula);

      if (result == null) {
          printError
            (secretariaAsignaturas,
             ExecutionTime.UNRELATED,
             "the call "+callString+" returned null");
          return false;
      }

      Object expected[] = new Object[asignaturas.length];
      HashSet<Pair<String,Integer>> ts1 = new HashSet<Pair<String,Integer>>();
      HashSet<Pair<String,Integer>> ts2 = new HashSet<Pair<String,Integer>>();

      for (Pair<String,Integer> s1 : result)
        ts1.add(s1);
      for (int i=0; i<asignaturas.length; i++) {
        Pair<String,Integer> newPair = new Pair<String,Integer>(asignaturas[i],notas[i]);
        expected[i] = newPair;
        ts2.add(newPair);
      }
      
      if (!ts1.equals(ts2)) {
        printError
          (secretariaAsignaturas,
           ExecutionTime.UNRELATED,
           "the call to "+callString+
           " returned a list\n"+result+
           "\nwhich does not contain the same elements as the expected answer"+
           "\n"+printArray(expected));
        return false;
      }
    }
    catch ( Throwable exc ) {
      printCallException(secretariaAsignaturas,callString,exc);
      return false;
    }
    return true;
  }

  static boolean check_mejorNotaMedia
    (IndexedList<AsignaturaAdmin> secretariaAsignaturas,
     String expected) {
    String methodName = "mejorNotaMedia";
    String callString = methodName+"()";
    
    try {
      Secretaria secretaria = new Secretaria(secretariaAsignaturas);
      String result = secretaria.mejorNotaMedia();

      boolean ok_sofar = true;
      
      if (result == null) ok_sofar = (expected == null);
      else ok_sofar = result.equals(expected);

      if (!ok_sofar) {
          printError
            (secretariaAsignaturas,
             ExecutionTime.UNRELATED,
             "the call "+callString+" returned the value "+result+
             ", but should have returned "+expected);
          return false;
      }
    } 
    catch ( Throwable exc ) {
        printCallException(secretariaAsignaturas,callString,exc);
        return false;
      }
    return true;
  }

  static boolean check_matricular
    (IndexedList<AsignaturaAdmin> secretariaAsignaturas,
     String asignatura,
     String[] matriculas,
     String[] expected,
     boolean doMatricular) {

    String methodName = "";
    if (doMatricular) methodName = "matricular";
    else methodName = "desMatricular";
    String callString = methodName+"(\""+asignatura+"\","+printArray(matriculas)+"\")";

    try {
      Secretaria secretaria = new Secretaria(secretariaAsignaturas);
      Iterable<String> result = null;

      IndexedList<String> arg = new ArrayIndexedList<String>();
      for (String matricula : matriculas)
        arg.add(arg.size(),matricula);

      if (doMatricular)
        result = secretaria.matricular(asignatura,arg);
      else
        result = secretaria.desMatricular(asignatura,arg);

      if (expected == null) {
          printError
            (secretariaAsignaturas,
             ExecutionTime.UNRELATED,
             "the call "+callString+" returned the value "+result+
             ", but should have raised the exception InvalidAsignaturaException");
          return false;
      }

      if (result == null) {
          printError
            (secretariaAsignaturas,
             ExecutionTime.UNRELATED,
             "the call "+callString+" returned null");
          return false;
      }

      HashSet<String> ts1 = new HashSet<String>();
      HashSet<String> ts2 = new HashSet<String>();

      for (String s1 : result)
        ts1.add(s1);
      for (String s2 : expected)
        ts2.add(s2);
      
      if (!ts1.equals(ts2)) {
        printError
          (secretariaAsignaturas,
           ExecutionTime.UNRELATED,
           "the call to "+callString+
           " returned a list\n"+result+
           "\nwhich does not contain the same elements as the expected answer"+
           "\n"+printArray(expected));
        return false;
      }
    }
    catch ( InvalidAsignaturaException exc ) {
      if (expected != null) {
        printCallException(secretariaAsignaturas,callString,exc);
        return false;
      }
    }
    catch ( Throwable exc ) {
        printCallException(secretariaAsignaturas,callString,exc);
        return false;
      }
    return true;
  }

    static boolean check_notaMediaExpediente
	(String matricula,
	 IndexedList<AsignaturaAdmin> secretariaAsignaturas,
         double expected) {

      String methodName = "notaMediaExpediente";
      String callString = methodName+"(\""+matricula+"\")";

      try {
        Secretaria secretaria = new Secretaria(secretariaAsignaturas);
        double result = secretaria.notaMediaExpediente(matricula);

        if (Double.isNaN(result)
            || Double.isInfinite(result)
            || (Math.abs(result - expected)) > 0.1) {
          printError
            (secretariaAsignaturas,
             ExecutionTime.UNRELATED,
             "the call "+callString+" returned the value "+result+
             ", but should have returned "+expected);
          return false;
        }
      } catch ( Throwable exc ) {
        printCallException(secretariaAsignaturas,callString,exc);
        return false;
      }

      return true;
    }


  static void printSecretaria(IndexedList<AsignaturaAdmin> secretaria) {
    if (secretaria == null) return;

    if (secretaria.size() == 0) {
      System.out.println("empty Secretaria\n");
      return;
    }
      
      System.out.println("Secretaria");
      System.out.println("----------------------------------------------");
      for (AsignaturaAdmin admin : secretaria) {
	  System.out.println("   Asignatura "+admin.getNombreAsignatura()+": ");
	  System.out.print("       matricula: ");
	  Iterable<String> matriculados = admin.matriculados();
	  Iterator<String> it = matriculados.iterator();
	  while (it.hasNext()) {
	      String matricula = it.next();
	      String matriculaFormatted = String.format("%-4s",matricula);
	      System.out.print(matriculaFormatted+"   ");
	  }
	  System.out.println();
	  System.out.print("       nota:      ");
	  it = matriculados.iterator();
	  while (it.hasNext()) {
	      String matricula = it.next();
	      String stringNota="";
	      try {
		  if (admin.tieneNota(matricula)) {
		      int nota = admin.getNota(matricula);
		      stringNota = String.format("%-4s",nota);
		  } else stringNota="    ";
	      } catch (InvalidMatriculaException exc) { };
	      System.out.print(stringNota+"   ");
	  }
	  System.out.println();
      }
      System.out.println("----------------------------------------------\n");
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



