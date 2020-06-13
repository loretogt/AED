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

package aed.secretaria;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.management.ManagementFactory;
import java.util.Comparator;
import java.util.HashSet;
import java.util.ArrayList;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;


@SuppressWarnings("unused")
public class TesterLab2 {

  enum ExecutionTime { AFTER, LAST, DURING, UNRELATED }

  static String testName;
  static String callSeq="";
  static AsignaturaAdmin asignaturaAdmin = null;

  public static void main(String[] args) {

    try {
	String[] ids = ManagementFactory.getRuntimeMXBean().getName().split("@");
	BufferedWriter bw = new BufferedWriter(new FileWriter("pid"));
	bw.write(ids[0]);
	bw.close();
    } catch (Exception e) {
	System.out.println("Avisa al profesor de fallo sacando el PID");
    }

    boolean[] results_sofar = {true};
    boolean general_results = true;
    boolean ok_sofar = true;

    


    //////////////////////////////////////////////////////////////////////
    //
    // File generated at: 2017/10/5 -- 12:23:29
    // Seed: {1507,199007,783494}
    //
    //////////////////////////////////////////////////////////////////////



    try {
      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_1(), results_sofar, "test_1", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_2(), results_sofar, "test_2", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_3(), results_sofar, "test_3", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_4(), results_sofar, "test_4", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_5(), results_sofar, "test_5", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_6(), results_sofar, "test_6", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_7(), results_sofar, "test_7", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_8(), results_sofar, "test_8", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_9(), results_sofar, "test_9", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_10(), results_sofar, "test_10", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_11(), results_sofar, "test_11", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_12(), results_sofar, "test_12", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_13(), results_sofar, "test_13", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_14(), results_sofar, "test_14", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_15(), results_sofar, "test_15", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_16(), results_sofar, "test_16", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_17(), results_sofar, "test_17", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_18(), results_sofar, "test_18", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_19(), results_sofar, "test_19", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_20(), results_sofar, "test_20", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_21(), results_sofar, "test_21", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_22(), results_sofar, "test_22", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_23(), results_sofar, "test_23", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_24(), results_sofar, "test_24", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_25(), results_sofar, "test_25", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_26(), results_sofar, "test_26", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_27(), results_sofar, "test_27", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_28(), results_sofar, "test_28", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_29(), results_sofar, "test_29", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_30(), results_sofar, "test_30", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_31(), results_sofar, "test_31", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_32(), results_sofar, "test_32", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_33(), results_sofar, "test_33", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_34(), results_sofar, "test_34", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_35(), results_sofar, "test_35", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_36(), results_sofar, "test_36", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_37(), results_sofar, "test_37", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_38(), results_sofar, "test_38", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_39(), results_sofar, "test_39", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_40(), results_sofar, "test_40", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_41(), results_sofar, "test_41", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_42(), results_sofar, "test_42", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_43(), results_sofar, "test_43", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_44(), results_sofar, "test_44", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_45(), results_sofar, "test_45", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_46(), results_sofar, "test_46", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_47(), results_sofar, "test_47", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_48(), results_sofar, "test_48", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_49(), results_sofar, "test_49", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_50(), results_sofar, "test_50", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_51(), results_sofar, "test_51", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_52(), results_sofar, "test_52", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_53(), results_sofar, "test_53", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_54(), results_sofar, "test_54", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_55(), results_sofar, "test_55", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_56(), results_sofar, "test_56", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_57(), results_sofar, "test_57", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_58(), results_sofar, "test_58", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_59(), results_sofar, "test_59", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_60(), results_sofar, "test_60", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_61(), results_sofar, "test_61", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_62(), results_sofar, "test_62", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_63(), results_sofar, "test_63", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_64(), results_sofar, "test_64", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_65(), results_sofar, "test_65", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_66(), results_sofar, "test_66", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_67(), results_sofar, "test_67", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_68(), results_sofar, "test_68", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_69(), results_sofar, "test_69", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_70(), results_sofar, "test_70", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_71(), results_sofar, "test_71", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_72(), results_sofar, "test_72", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_73(), results_sofar, "test_73", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_74(), results_sofar, "test_74", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_75(), results_sofar, "test_75", "asignaturaAdmin");

      if (results_ok_sofar(results_sofar,"asignaturaAdmin") && local_results_ok_sofar(results_sofar,"asignaturaAdmin"))
        results_sofar =
          combine_results(test_76(), results_sofar, "test_76", "asignaturaAdmin");

    } catch ( Throwable exc ) {
          printCallException(ExecutionTime.DURING,"",exc);
          System.exit(24);
      }


    report_results("TesterLab2",results_sofar,general_results);


    if (results_ok(results_sofar,general_results))
      System.exit(0);
    else
      System.exit(24);
  }



  private static boolean test_1 ()
  {
      
      testName = "test_1" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      return ok_sofar ;
  }


  private static boolean test_2 ()
  {
      
      testName = "test_2" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      return ok_sofar ;
  }


  private static boolean test_3 ()
  {
      
      testName = "test_3" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",null) ;
      return ok_sofar ;
  }


  private static boolean test_4 ()
  {
      
      testName = "test_4" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      return ok_sofar ;
  }


  private static boolean test_5 ()
  {
      
      testName = "test_5" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",false) ;
      return ok_sofar ;
  }


  private static boolean test_6 ()
  {
      
      testName = "test_6" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("111",false) ;
      return ok_sofar ;
  }


  private static boolean test_7 ()
  {
      
      testName = "test_7" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("111",null) ;
      return ok_sofar ;
  }


  private static boolean test_8 ()
  {
      
      testName = "test_8" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("111",null) ;
      return ok_sofar ;
  }


  private static boolean test_9 ()
  {
      
      testName = "test_9" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      return ok_sofar ;
  }


  private static boolean test_10 ()
  {
      
      testName = "test_10" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(1,10,new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_11 ()
  {
      
      testName = "test_11" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(2,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",5,false) ;
      return ok_sofar ;
  }


  private static boolean test_12 ()
  {
      
      testName = "test_12" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      return ok_sofar ;
  }


  private static boolean test_13 ()
  {
      
      testName = "test_13" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_14 ()
  {
      
      testName = "test_14" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("111",false) ;
      return ok_sofar ;
  }


  private static boolean test_15 ()
  {
      
      testName = "test_15" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("111",null) ;
      return ok_sofar ;
  }


  private static boolean test_16 ()
  {
      
      testName = "test_16" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("111",true) ;
      return ok_sofar ;
  }


  private static boolean test_17 ()
  {
      
      testName = "test_17" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("222",false) ;
      return ok_sofar ;
  }


  private static boolean test_18 ()
  {
      
      testName = "test_18" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "3333333" },new String[] { "3333333" }) ;
      return ok_sofar ;
  }


  private static boolean test_19 ()
  {
      
      testName = "test_19" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      return ok_sofar ;
  }


  private static boolean test_20 ()
  {
      
      testName = "test_20" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444","2222222" },new String[] { "4444444","2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",7,false) ;
      return ok_sofar ;
  }


  private static boolean test_21 ()
  {
      
      testName = "test_21" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("111",true) ;
      return ok_sofar ;
  }


  private static boolean test_22 ()
  {
      
      testName = "test_22" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111","222","333" },new String[] { "111","222","333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("222",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "111","222","333" },new String[] { "111","333" }) ;
      return ok_sofar ;
  }


  private static boolean test_23 ()
  {
      
      testName = "test_23" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("222",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("111",false) ;
      return ok_sofar ;
  }


  private static boolean test_24 ()
  {
      
      testName = "test_24" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("111",1) ;
      return ok_sofar ;
  }


  private static boolean test_25 ()
  {
      
      testName = "test_25" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("111",false) ;
      return ok_sofar ;
  }


  private static boolean test_26 ()
  {
      
      testName = "test_26" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      return ok_sofar ;
  }


  private static boolean test_27 ()
  {
      
      testName = "test_27" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_28 ()
  {
      
      testName = "test_28" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "5555555","1111111","6666666" },new String[] { "5555555","1111111","6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      return ok_sofar ;
  }


  private static boolean test_29 ()
  {
      
      testName = "test_29" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "5555555","2222222" },new String[] { "5555555","2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_30 ()
  {
      
      testName = "test_30" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "1111111","3333333","5555555" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      return ok_sofar ;
  }


  private static boolean test_31 ()
  {
      
      testName = "test_31" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("111",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("111",2) ;
      return ok_sofar ;
  }


  private static boolean test_32 ()
  {
      
      testName = "test_32" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111" },new String[] { "111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "111" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("111",true) ;
      return ok_sofar ;
  }


  private static boolean test_33 ()
  {
      
      testName = "test_33" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111","222" },new String[] { "111","222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("111",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("222",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(3.50000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_34 ()
  {
      
      testName = "test_34" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      return ok_sofar ;
  }


  private static boolean test_35 ()
  {
      
      testName = "test_35" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666","3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNombreAsignatura("AED") ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      return ok_sofar ;
  }


  private static boolean test_36 ()
  {
      
      testName = "test_36" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111","222","333" },new String[] { "111","222","333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("222",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "111","222","333" },new String[] { "111","333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("222",1) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("333",false) ;
      return ok_sofar ;
  }


  private static boolean test_37 ()
  {
      
      testName = "test_37" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_38 ()
  {
      
      testName = "test_38" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444","1111111","5555555","2222222" },new String[] { "4444444","1111111","5555555","2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(7,9,new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_39 ()
  {
      
      testName = "test_39" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "4444444","2222222","6666666","3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "2222222","5555555","6666666","1111111" },new String[] { "2222222","5555555","6666666","1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",false) ;
      return ok_sofar ;
  }


  private static boolean test_40 ()
  {
      
      testName = "test_40" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111","222","333","444","555" },new String[] { "111","222","333","444","555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("333",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("444",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("555",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(3.00000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_41 ()
  {
      
      testName = "test_41" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111","222","333","444","555" },new String[] { "111","222","333","444","555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("333",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("444",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("555",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(1,10,new String[] { "111","222","333","444","555" }) ;
      return ok_sofar ;
  }


  private static boolean test_42 ()
  {
      
      testName = "test_42" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111","222","333","444","555" },new String[] { "111","222","333","444","555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("333",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("444",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("555",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(7,10,new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_43 ()
  {
      
      testName = "test_43" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111","222","333","444","555" },new String[] { "111","222","333","444","555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("333",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("444",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("555",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(1,1,new String[] { "111" }) ;
      return ok_sofar ;
  }


  private static boolean test_44 ()
  {
      
      testName = "test_44" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "111","222","333","444","555" },new String[] { "111","222","333","444","555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("111",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("333",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("444",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("555",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(1,5,new String[] { "111","222","333","444","555" }) ;
      return ok_sofar ;
  }


  private static boolean test_45 ()
  {
      
      testName = "test_45" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444","5555555" },new String[] { "4444444","5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "3333333","2222222" },new String[] { "3333333","2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",false) ;
      return ok_sofar ;
  }


  private static boolean test_46 ()
  {
      
      testName = "test_46" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(1,1,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666","2222222","5555555" },new String[] { "6666666","2222222","5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",4,true) ;
      return ok_sofar ;
  }


  private static boolean test_47 ()
  {
      
      testName = "test_47" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(5,5,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(1,2,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","4444444","6666666" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",false) ;
      return ok_sofar ;
  }


  private static boolean test_48 ()
  {
      
      testName = "test_48" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "1111111","6666666","5555555","2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111","4444444","3333333","6666666" },new String[] { "1111111","4444444","3333333","6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666","1111111","4444444","5555555" },new String[] { "5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",false) ;
      return ok_sofar ;
  }


  private static boolean test_49 ()
  {
      
      testName = "test_49" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "3333333","6666666","5555555" },new String[] { "3333333","6666666","5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(2,6,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111" },new String[] { "1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666","2222222" },new String[] { "2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",4,true) ;
      return ok_sofar ;
  }


  private static boolean test_50 ()
  {
      
      testName = "test_50" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "2222222" },new String[] { "2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNombreAsignatura("AED") ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444","1111111","2222222" },new String[] { "4444444","1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNombreAsignatura("AED") ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111","3333333","6666666" },new String[] { "3333333","6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      return ok_sofar ;
  }


  private static boolean test_51 ()
  {
      
      testName = "test_51" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,7,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      return ok_sofar ;
  }


  private static boolean test_52 ()
  {
      
      testName = "test_52" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666","5555555" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "5555555","4444444" },new String[] { "5555555","4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_53 ()
  {
      
      testName = "test_53" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","6666666","4444444" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",2,false) ;
      return ok_sofar ;
  }


  private static boolean test_54 ()
  {
      
      testName = "test_54" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,6,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,8,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(5,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      return ok_sofar ;
  }


  private static boolean test_55 ()
  {
      
      testName = "test_55" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "2222222","3333333" },new String[] { "2222222","3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(5,5,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(1,1,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111","3333333","2222222","4444444","6666666","5555555" },new String[] { "1111111","4444444","6666666","5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",5,true) ;
      return ok_sofar ;
  }


  private static boolean test_56 ()
  {
      
      testName = "test_56" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(8,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(2,2,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "4444444" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNombreAsignatura("AED") ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111" },new String[] { "1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333" },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_57 ()
  {
      
      testName = "test_57" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(9,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666","1111111" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "3333333" },new String[] { "3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,7,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111" },new String[] { "1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(2,3,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "2222222","6666666" },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_58 ()
  {
      
      testName = "test_58" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666","3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555","4444444","3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_59 ()
  {
      
      testName = "test_59" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(5,8,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(1,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111" },new String[] { "1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "1111111" },new String[] { "1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "5555555" },new String[] { "5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666","1111111","4444444","5555555" },new String[] { "6666666","1111111","4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(5,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      return ok_sofar ;
  }


  private static boolean test_60 ()
  {
      
      testName = "test_60" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,4,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,7,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","4444444" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","5555555" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(2,3,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      return ok_sofar ;
  }


  private static boolean test_61 ()
  {
      
      testName = "test_61" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "1111111","6666666","5555555","2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666","5555555","2222222" },new String[] { "6666666","5555555","2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(9,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444" },new String[] { "4444444" }) ;
      return ok_sofar ;
  }


  private static boolean test_62 ()
  {
      
      testName = "test_62" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,8,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNombreAsignatura("AED") ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,7,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","1111111" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,7,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "2222222","6666666","5555555","1111111" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666" },new String[] { "6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      return ok_sofar ;
  }


  private static boolean test_63 ()
  {
      
      testName = "test_63" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444","6666666","3333333","5555555" },new String[] { "4444444","6666666","3333333","5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "1111111" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(5.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",3) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(7,8,new String[] { "3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111" },new String[] { "1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555" },new String[] { "5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111","2222222" },new String[] { "2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",3) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "4444444" },new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_64 ()
  {
      
      testName = "test_64" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111","3333333","6666666" },new String[] { "1111111","3333333","6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444" },new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNombreAsignatura("AED") ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "4444444" },new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(5.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444" },new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",6,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",3) ;
      return ok_sofar ;
  }


  private static boolean test_65 ()
  {
      
      testName = "test_65" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,5,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(7,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","6666666","1111111" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "2222222" },new String[] { "2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555","2222222","3333333","1111111" },new String[] { "2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "5555555","2222222","1111111" },new String[] { "5555555","2222222","1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",4,true) ;
      return ok_sofar ;
  }


  private static boolean test_66 ()
  {
      
      testName = "test_66" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444","6666666","5555555" },new String[] { "4444444","6666666","5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "1111111","2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(1.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(1.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(1.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(1.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(1.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(7,8,new String[] {  }) ;
      return ok_sofar ;
  }


  private static boolean test_67 ()
  {
      
      testName = "test_67" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,4,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,7,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,5,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555","4444444","6666666" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,5,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "2222222","3333333" },new String[] { "2222222","3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      return ok_sofar ;
  }


  private static boolean test_68 ()
  {
      
      testName = "test_68" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(8,8,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "2222222","1111111" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(7,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444" },new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666","3333333" },new String[] { "6666666","3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(7,8,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",6,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555","1111111","2222222","6666666" },new String[] { "6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",null) ;
      return ok_sofar ;
  }


  private static boolean test_69 ()
  {
      
      testName = "test_69" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111","3333333" },new String[] { "1111111","3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555","3333333","1111111" },new String[] { "3333333","1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(8,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "2222222","3333333" },new String[] { "2222222","3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","2222222","4444444" },new String[] { "3333333","2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666","3333333","1111111","4444444" },new String[] { "6666666","3333333","1111111","4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "2222222","5555555","6666666" },new String[] { "2222222","5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(2,10,new String[] { "2222222","1111111" }) ;
      return ok_sofar ;
  }


  private static boolean test_70 ()
  {
      
      testName = "test_70" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444","1111111" },new String[] { "4444444","1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",3,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "4444444","3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666","1111111" },new String[] { "6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "1111111","2222222" },new String[] { "1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",2) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",5,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(3.50000000000000000000e+00) ;
      return ok_sofar ;
  }


  private static boolean test_71 ()
  {
      
      testName = "test_71" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "3333333","4444444" },new String[] { "3333333","4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,5,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "2222222","5555555" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666","3333333","5555555" },new String[] { "3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(5,8,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555","6666666","2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,6,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666","1111111","2222222","3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",null) ;
      return ok_sofar ;
  }


  private static boolean test_72 ()
  {
      
      testName = "test_72" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNombreAsignatura("AED") ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111" },new String[] { "1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(5,7,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666" },new String[] { "6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",8,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNombreAsignatura("AED") ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(2,7,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,7,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "4444444","6666666" },new String[] { "6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,6,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444" },new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "3333333","1111111" },new String[] { "3333333" }) ;
      return ok_sofar ;
  }


  private static boolean test_73 ()
  {
      
      testName = "test_73" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(1,7,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",4,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "3333333" },new String[] { "3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444" },new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(1,4,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,6,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "4444444","2222222" },new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(9,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(9,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","5555555","6666666" },new String[] { "3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNombreAsignatura("AED") ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "3333333","1111111" },new String[] { "3333333","1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "2222222","4444444","3333333","5555555","1111111" },new String[] { "3333333","1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666" },new String[] { "6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,7,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444","3333333","6666666","5555555","1111111" },new String[] { "4444444","3333333","5555555","1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",true) ;
      return ok_sofar ;
  }


  private static boolean test_74 ()
  {
      
      testName = "test_74" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "3333333" },new String[] { "3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(5,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "1111111","5555555" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666","1111111","3333333" },new String[] { "6666666","1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555","4444444" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNombreAsignatura("AED") ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(1.00000000000000000000e+01) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111","4444444","3333333","2222222" },new String[] { "4444444","2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNombreAsignatura("AED") ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,6,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",7) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","6666666","5555555" },new String[] { "3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(7,7,new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444","3333333","1111111","6666666" },new String[] { "3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(6.75000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",2) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","6666666","2222222" },new String[] { "3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666","4444444","1111111" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "1111111","3333333","2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",8) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(6.75000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",8,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("1111111",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(5.25000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(5,10,new String[] { "6666666","4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111","6666666" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(5.25000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(7,9,new String[] { "6666666","4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","6666666","2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",4) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(5.25000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",8) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(5.25000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(7,8,new String[] { "6666666","4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(5.25000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",9,true) ;
      return ok_sofar ;
  }


  private static boolean test_75 ()
  {
      
      testName = "test_75" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(9,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "4444444" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","5555555" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(2,8,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "5555555" },new String[] { "5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444","6666666" },new String[] { "4444444","6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",7,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",5,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(8,10,new String[] { "4444444","6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("6666666",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(9.50000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(9.50000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(9.50000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "4444444","5555555","3333333","2222222" },new String[] { "5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","5555555","4444444","1111111" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555","4444444","1111111","6666666","3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "4444444","1111111" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(8.50000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111" },new String[] { "1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(1,5,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(5,9,new String[] { "6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(8.50000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",10) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(8,10,new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "3333333","5555555" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(5,6,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("6666666",7) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "3333333" },new String[] { "3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(8.50000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(1,2,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "1111111","3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "4444444" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555","1111111","6666666","2222222" },new String[] { "1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(8,10,new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(8.50000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",2,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666","3333333" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",true) ;
      return ok_sofar ;
  }


  private static boolean test_76 ()
  {
      
      testName = "test_76" ;
      callSeq = "" ;
      asignaturaAdmin = null ;
      boolean ok_sofar = true ;
      
      if (ok_sofar)
          ok_sofar = TesterLab2.constructor() ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(2,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("2222222",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("1111111",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("6666666",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(0) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",10,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444","3333333","2222222" },new String[] { "4444444","3333333","2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("4444444",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555","4444444" },new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,6,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",10,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",4,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666" },new String[] { "6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,10,new String[] { "3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(7.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",9,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(9,9,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,8,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("3333333",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(6.50000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(5,8,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(9,10,new String[] { "3333333" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(10,10,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "4444444" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(6,7,new String[] { "2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("5555555",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,9,new String[] { "3333333","2222222" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNombreAsignatura("AED") ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("3333333",9) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("1111111",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(6.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444","2222222" },new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(6.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "2222222" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555","4444444" },new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(6.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("6666666",9,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",1,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",3) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(7.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("2222222",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.hasNota("4444444",null) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(7.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(7.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "4444444" },new String[] { "4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("5555555",2,false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(7,9,new String[] { "3333333","6666666" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "6666666" },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("2222222",7,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(4,5,new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] { "6666666","4444444","1111111","5555555" },new String[] { "1111111","5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "1111111","6666666" },new String[] { "1111111" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",7) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",7) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",1,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.matricularAlumnos(new String[] {  },new String[] {  }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.getNota("2222222",7) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.setNota("4444444",3,true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.desMatricularAlumnos(new String[] { "5555555" },new String[] { "5555555" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.averageGrade(7.00000000000000000000e+00) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.alumnosEnRango(3,9,new String[] { "3333333","2222222","6666666","4444444" }) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("3333333",true) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      if (ok_sofar)
          ok_sofar = TesterLab2.isMatriculated("5555555",false) ;
      return ok_sofar ;
  }



  static boolean constructor() {
      boolean ok_sofar = true;

      callSeq += "\n  asignaturaAdmin = new AsignaturaAdmin(\"AED\");";

      try {
	  asignaturaAdmin = new AsignaturaAdmin("AED");
      } catch ( Throwable exc ) {
	  printCallException(exc);
	  ok_sofar = false;
      }

      return ok_sofar;
  }

  //////////////////////////////////////////////////////////////////////


  static boolean getNota(String matricula, Integer expected) {
      boolean ok_sofar = true;

      String methodName = "getNota";

      callSeq += "\n  asignaturaAdmin."+methodName+"(\""+matricula+"\");";

      try {
	  int nota = asignaturaAdmin.getNota(matricula);

          if (expected == null) {
            ok_sofar = false;
            printError
	      (ExecutionTime.LAST,
	       "\nthe call to getNota returned the value "+nota+
	       ", but should have raised the exception "+
	       "InvalidMatriculaException");
          }

          if (ok_sofar && nota != expected.intValue()) {
	      ok_sofar = false;
	      printError
                (ExecutionTime.LAST,
	       "\nthe call to getNota returned the value "+nota+
                 ", but should have returned "+expected.intValue());
          }
      } catch ( InvalidMatriculaException exc ) {
        if (expected != null) {
	  ok_sofar = false;
	  printCallException(exc);
	}
      } catch ( Throwable exc ) {
      	  ok_sofar = false;
	  printCallException(exc);
      }
      return ok_sofar;
  }

  static boolean isMatriculated(String matricula, boolean expected) {
      boolean ok_sofar = true;

      String methodName = "estaMatriculado";
      callSeq += "\n  asignaturaAdmin."+methodName+"(\""+matricula+"\");";

      try {
	  boolean result = asignaturaAdmin.estaMatriculado(matricula);

          if (expected != result) {
            ok_sofar = false;
            printError
	      (ExecutionTime.LAST,
	       "\nthe call to "+methodName+" returned the value "+result+
	       ", but should have returned "+expected);
          }
      } catch ( Throwable exc ) {
        ok_sofar = false;
        printCallException(exc);
      }
      return ok_sofar;
  }

  static boolean averageGrade(double expected) {
      boolean ok_sofar = true;

      String methodName = "notaMedia";
      callSeq += "\n  asignaturaAdmin."+methodName+"();";

      try {
	  double result = asignaturaAdmin.notaMedia();

          if (Double.isNaN(result)
	      || Double.isInfinite(result)
	      || (Math.abs(result - expected)) > 0.1) {
            ok_sofar = false;
            printError
	      (ExecutionTime.LAST,
	       "\nthe call to "+methodName+" returned the value "+result+
	       ", but should have returned "+expected);
          }
      } catch ( Throwable exc ) {
        ok_sofar = false;
        printCallException(exc);
      }
      return ok_sofar;
  }

static boolean alumnosEnRango(int min, int max, String[] expected) {
      boolean ok_sofar = true;

      String methodName = "alumnosEnRango";
      callSeq += "\n  asignaturaAdmin."+methodName+"("+min+","+max+");";

      try {
        PositionList<String> result = asignaturaAdmin.alumnosEnRango(min,max);

          if (result == null) {
            ok_sofar = false;
            printError
	      (ExecutionTime.LAST,
	       "\nthe call to "+methodName+
               " returned null; it should not have");
          }

          if (ok_sofar) {
            HashSet<String> ts1 = new HashSet<String>();
            HashSet<String> ts2 = new HashSet<String>();

            for (String s1 : result)
              ts1.add(s1);
            for (String s2 : expected)
              ts2.add(s2);

            if (!ts1.equals(ts2)) {
              ok_sofar = false;
              printError
                (ExecutionTime.LAST,
                 "\nthe call to "+methodName+
                 " returned a list\n"+result+
                 "\nwhich does not contain the same elements as the expected answer"+
                 "\n"+printArray(expected));
            }
          }
      } catch ( Throwable exc ) {
        ok_sofar = false;
        printCallException(exc);
      }
      return ok_sofar;
  }

  static boolean hasNota(String matricula, Boolean expected) {
      boolean ok_sofar = true;

      String methodName = "tieneNota";
      callSeq += "\n  asignaturaAdmin."+methodName+"(\""+matricula+"\");";

      try {
	  boolean result = asignaturaAdmin.tieneNota(matricula);

          if (expected == null) {
            ok_sofar = false;
            printError
	      (ExecutionTime.LAST,
	       "\nthe call to "+methodName+" returned the value "+result+
	       ", but should have raised the exception "+
	       "InvalidMatriculaException");
          }

          if (ok_sofar && expected.booleanValue() != result) {
            ok_sofar = false;
            printError
	      (ExecutionTime.LAST,
	       "\nthe call to "+methodName+" returned the value "+result+
	       ", but should have returned "+expected);
          }
      } catch ( InvalidMatriculaException exc ) {
        if (expected != null) {
	  ok_sofar = false;
	  printCallException(exc);
	}
      } catch ( Throwable exc ) {
	  ok_sofar = false;
	  printCallException(exc);
      }
      return ok_sofar;
  }

  static boolean getNombreAsignatura(String expected) {
      boolean ok_sofar = true;

      String methodName = "getNombreAsignatura"; 
      callSeq += "\n  asignaturaAdmin."+methodName+"();";

      try {
	  String result = asignaturaAdmin.getNombreAsignatura();

          if (result == null) {
            ok_sofar = false;
            printError
	      (ExecutionTime.LAST,
	       "\nthe call to "+methodName+" returned null");
          }

          if (ok_sofar && !result.equals(expected)) {
            ok_sofar = false;
            printError
	      (ExecutionTime.LAST,
	       "\nthe call to "+methodName+" returned the value "+result+
	       ", but should have returned "+expected);
          }
      } catch ( Throwable exc ) {
	  ok_sofar = false;
	  printCallException(exc);
      }
      return ok_sofar;
  }

  static boolean setNota(String matricula, int nota, boolean returnsNormally) {
      boolean ok_sofar = true;

      callSeq += "\n  asignaturaAdmin.setNota(\""+matricula+","+nota+"\");";

      try {
          asignaturaAdmin.setNota(matricula,nota);

          if (!returnsNormally) {
            ok_sofar = false;
            printError
	      (ExecutionTime.LAST,
	       "\nthe call to addNota returned normally, "+
	       " but should have raised the exception "+
	       "InvalidMatriculaException");
          }
      } catch ( InvalidMatriculaException exc ) {
        if (returnsNormally) {
	  ok_sofar = false;
	  printCallException(exc);
	}
      } catch ( Throwable exc ) {
	  ok_sofar = false;
	  printCallException(exc);
      }

      return ok_sofar;
  }

  static boolean desMatricularAlumnos(String[] matriculas_string,String[] removed) {
      boolean ok_sofar = true;

      PositionList<String> matriculas = new NodePositionList<String>();
      for (int k=0; k<matriculas_string.length; k++)
        matriculas.addLast(matriculas_string[k]);

      String methodName = "desMatricular";
      String callString = "asignaturaAdmin."+methodName+"("+matriculas+")";
      callSeq += "\n  "+callString+";";

      try {
	  PositionList<String> result =
            asignaturaAdmin.desMatricular(matriculas);

          if (result == null) {
            ok_sofar = false;
            printError
	      (ExecutionTime.LAST,
	       "\nthe call to "+methodName+
               " returned null; it should not have");
          }

          if (ok_sofar && (result == matriculas)) {
            ok_sofar = false;
            printError
              (ExecutionTime.LAST,
               "\nthe call to "+methodName+" did not return a NEW list");
          }

          if (ok_sofar && !unChanged(callString,matriculas_string,matriculas))
            ok_sofar = false;

          if (ok_sofar) {
            HashSet<String> ts1 = new HashSet<String>();
            HashSet<String> ts2 = new HashSet<String>();

            for (String s1 : result)
              ts1.add(s1);
            for (String s2 : removed)
              ts2.add(s2);

            if (!ts1.equals(ts2)) {
              ok_sofar = false;
              printError
                (ExecutionTime.LAST,
                 "\nthe call to "+methodName+
                 " returned a list\n"+result+
                 "\nwhich does not contain the same elements as the expected answer"+
                 "\n"+printArray(removed));
            }
          }
      } catch ( Throwable exc ) {
	  printCallException(exc);
	  ok_sofar = false;
      }

      return ok_sofar;
  }

  static boolean matricularAlumnos(String matriculas_string[],String added[]) {
      boolean ok_sofar = true;

      PositionList<String> matriculas = new NodePositionList<String>();
      for (int k=0; k<matriculas_string.length; k++)
        matriculas.addLast(matriculas_string[k]);

      String methodName = "matricular";
      String callString = "asignaturaAdmin."+methodName+"("+matriculas+")";
      callSeq += "\n  "+callString+";";

      try {
	  PositionList<String> result =
            asignaturaAdmin.matricular(matriculas);

          if (ok_sofar && (result == null)) {
            ok_sofar = false;
            printError
	      (ExecutionTime.LAST,
	       "\nthe call to "+methodName+
               " returned null; it should not have");
          }

          if (ok_sofar && (result == matriculas)) {
            ok_sofar = false;
            printError
              (ExecutionTime.LAST,
               "\nthe call to "+methodName+" did not return a NEW list");
          }

          if (ok_sofar && !unChanged(callString,matriculas_string,matriculas))
            ok_sofar = false;

          if (ok_sofar) {
            HashSet<String> ts1 = new HashSet<String>();
            HashSet<String> ts2 = new HashSet<String>();

            for (String s1 : result)
              ts1.add(s1);
            for (String s2 : added)
              ts2.add(s2);

            if (!ts1.equals(ts2)) {
              ok_sofar = false;
              printError
                (ExecutionTime.LAST,
                 "\nthe call to "+methodName+
                 " returned a list\n"+result+
                 "\nwhich does not contain the same elements as the expected answer"+
                 "\n"+printArray(added));
            }
          }

      } catch ( Throwable exc ) {
	  printCallException(exc);
	  ok_sofar = false;
      }

      return ok_sofar;
  }

  static boolean unChanged(String callString, String[] original, PositionList<String> l) {
      boolean ok_sofar = true;
      
      if (l.size() != original.length) {
	  ok_sofar = false;
      }

      Position<String> lPos = l.first();
      int i=0;
      while (ok_sofar && lPos != null) {
	  String elem = lPos.element();
	  if (elem == null || !elem.equals(original[i])) {
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

  static int test_type_to_index(String test_type) {
      if (test_type.equals("asignaturaAdmin")) return 0;
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
	  if (i==0) testName = "asignaturaAdmin";

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



