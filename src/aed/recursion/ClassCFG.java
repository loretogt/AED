package aed.recursion;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.bcel.classfile.Constant;
import org.apache.bcel.classfile.ConstantPool;
import org.apache.bcel.classfile.EmptyVisitor;
import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.MethodGen;

/**
* The simplest of class visitors, invokes the method visitor class for each
* method found.
*/
public class ClassCFG extends EmptyVisitor {
    private static Map<String,Set<String>> calls;
    private JavaClass clazz;
    private ConstantPoolGen constants;
    
    public ClassCFG(JavaClass jc, Map<String,Set<String>> calls) {
        clazz = jc;
	ClassCFG.calls = calls;
        constants = new ConstantPoolGen(clazz.getConstantPool());
    }

    public void visitJavaClass(JavaClass jc) {
        jc.getConstantPool().accept(this);
        Method[] methods = jc.getMethods();
        for (int i = 0; i < methods.length; i++)
            methods[i].accept(this);
    }

    public void visitConstantPool(ConstantPool constantPool) {
        for (int i = 0; i < constantPool.getLength(); i++) {
            Constant constant = constantPool.getConstant(i);
            if (constant == null)
                continue;
        }
    }

    public void visitMethod(Method method) {
        MethodGen mg = new MethodGen(method, clazz.getClassName(), constants);
	Set<String> callTable = new TreeSet<String>();
	calls.put(clazz.getClassName()+"."+mg.getName(),callTable);
        MethodCFG visitor = new MethodCFG(mg, clazz, callTable);
        visitor.start();
    }

    public void start() {
        visitJavaClass(clazz);
	//for (Map.Entry<String,Set<String>> entry : calls.entrySet()) {
	//  System.out.println(entry.getKey()+": ");
	//  for (String callSite : entry.getValue())
	//	System.out.println(callSite);
	//}
    }
}
