package Antlr.Runtime.Tree;

import Common.Activation;
import static Common.Helper.Convert;
import static Common.Helper.getGetObjectName;
import static Common.Helper.getReturnObjectName;
import static Common.Helper.ConvertToConcreteInterfaceImplementation;
import Common.Helper;
import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;
import com.javonet.api.NObject;
import com.javonet.api.NEnum;
import com.javonet.api.keywords.NRef;
import com.javonet.api.keywords.NOut;
import com.javonet.api.NControlContainer;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.*;
import Antlr.Runtime.Tree.*;
import Antlr.Runtime.*;
import jio.System.*;

public class TreeRuleReturnScope<TTree> implements IRuleReturnScopeTLabel<TTree>, IRuleReturnScope {
  protected NObject javonetHandle;
  /** SetProperty */
  public void set_StartProperty(TTree value) {
    try {
      javonetHandle.invoke("set_Start", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TTree get_StartProperty(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Start");
      if (res == null) return null;
      return (TTree) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public TreeRuleReturnScope(Class<?> TTree) {
    try {
      javonetHandle =
          Javonet.getType("Antlr.Runtime.Tree.TreeRuleReturnScope`1", getReturnObjectName(TTree))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeRuleReturnScope(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public TTree get_Stop(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Stop");
      if (res == null) return null;
      return (TTree) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object get_Start() {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.IRuleReturnScope").invoke("get_Start");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object IRuleReturnScope_get_Stop() {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.IRuleReturnScope").invoke("get_Stop");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
