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
import jio.System.Text.*;

public class TreePatternLexer {
  protected NObject javonetHandle;
  /** GetFiled */
  public jio.System.Text.StringBuilder getsval() {
    try {
      Object res = javonetHandle.<NObject>get("sval");
      if (res == null) return null;
      return new jio.System.Text.StringBuilder((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setsval(jio.System.Text.StringBuilder param) {
    try {
      javonetHandle.set("sval", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Boolean geterror() {
    try {
      java.lang.Boolean res = javonetHandle.get("error");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void seterror(java.lang.Boolean param) {
    try {
      javonetHandle.set("error", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getBegin() {
    try {
      java.lang.Integer res = Javonet.getType("TreePatternLexer").get("Begin");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setBegin(java.lang.Integer param) {
    try {
      Javonet.getType("TreePatternLexer").set("Begin", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getEnd() {
    try {
      java.lang.Integer res = Javonet.getType("TreePatternLexer").get("End");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setEnd(java.lang.Integer param) {
    try {
      Javonet.getType("TreePatternLexer").set("End", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getId() {
    try {
      java.lang.Integer res = Javonet.getType("TreePatternLexer").get("Id");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setId(java.lang.Integer param) {
    try {
      Javonet.getType("TreePatternLexer").set("Id", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getArg() {
    try {
      java.lang.Integer res = Javonet.getType("TreePatternLexer").get("Arg");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setArg(java.lang.Integer param) {
    try {
      Javonet.getType("TreePatternLexer").set("Arg", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getPercent() {
    try {
      java.lang.Integer res = Javonet.getType("TreePatternLexer").get("Percent");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setPercent(java.lang.Integer param) {
    try {
      Javonet.getType("TreePatternLexer").set("Percent", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getColon() {
    try {
      java.lang.Integer res = Javonet.getType("TreePatternLexer").get("Colon");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setColon(java.lang.Integer param) {
    try {
      Javonet.getType("TreePatternLexer").set("Colon", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getDot() {
    try {
      java.lang.Integer res = Javonet.getType("TreePatternLexer").get("Dot");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setDot(java.lang.Integer param) {
    try {
      Javonet.getType("TreePatternLexer").set("Dot", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreePatternLexer(java.lang.String pattern) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreePatternLexer", pattern);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreePatternLexer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer NextToken() {
    try {
      java.lang.Integer res = javonetHandle.invoke("NextToken");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
