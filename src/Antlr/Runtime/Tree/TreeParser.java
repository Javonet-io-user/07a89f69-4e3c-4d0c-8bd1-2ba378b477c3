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
import Antlr.Runtime.*;
import Antlr.Runtime.Tree.*;

public class TreeParser extends BaseRecognizer {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getSourceNameAsTreeParser() {
    try {
      java.lang.String res = javonetHandle.get("SourceName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetFiled */

  public static java.lang.Integer getDOWN() {
    try {
      java.lang.Integer res = Javonet.getType("TreeParser").get("DOWN");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setDOWN(java.lang.Integer param) {
    try {
      Javonet.getType("TreeParser").set("DOWN", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getUP() {
    try {
      java.lang.Integer res = Javonet.getType("TreeParser").get("UP");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setUP(java.lang.Integer param) {
    try {
      Javonet.getType("TreeParser").set("UP", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeParser(ITreeNodeStream input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeParser", input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeParser(ITreeNodeStream input, RecognizerSharedState state) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeParser", input, state);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeParser(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Reset() {
    try {
      javonetHandle.invoke("Reset");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SetTreeNodeStream(ITreeNodeStream input) {
    try {
      javonetHandle.invoke("SetTreeNodeStream", input);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public ITreeNodeStream GetTreeNodeStream() {
    try {
      Object res = javonetHandle.invoke("GetTreeNodeStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void MatchAny(IIntStream ignore) {
    try {
      javonetHandle.invoke("MatchAny", ignore);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String GetErrorHeader(RecognitionException e) {
    try {
      java.lang.String res = javonetHandle.invoke("GetErrorHeader", e);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetErrorMessage(RecognitionException e, java.lang.String[] tokenNames) {
    try {
      java.lang.String res = javonetHandle.invoke("GetErrorMessage", e, new Object[] {tokenNames});
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void TraceIn(java.lang.String ruleName, java.lang.Integer ruleIndex) {
    try {
      javonetHandle.invoke("TraceIn", ruleName, ruleIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void TraceOut(java.lang.String ruleName, java.lang.Integer ruleIndex) {
    try {
      javonetHandle.invoke("TraceOut", ruleName, ruleIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
