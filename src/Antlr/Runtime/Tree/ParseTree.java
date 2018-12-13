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
import jio.System.*;
import Antlr.Runtime.*;
import jio.System.Collections.Generic.*;

public class ParseTree extends BaseTree implements ITree {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setTextAsParseTree(java.lang.String value) {
    try {
      javonetHandle.set("Text", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getTextAsParseTree() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_Text");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setTokenStartIndexAsParseTree(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITree")
          .invoke("set_TokenStartIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getTokenStartIndexAsParseTree() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_TokenStartIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setTokenStopIndexAsParseTree(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITree")
          .invoke("set_TokenStopIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getTokenStopIndexAsParseTree() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_TokenStopIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setTypeAsParseTree(java.lang.Integer value) {
    try {
      javonetHandle.set("Type", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getTypeAsParseTree() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_Type");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetFiled */

  public Object getpayload() {
    try {
      Object res = javonetHandle.<NObject>get("payload");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setpayload(Object param) {
    try {
      javonetHandle.set("payload", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public List<IToken> gethiddenTokens() {
    try {
      Object res = javonetHandle.<NObject>get("hiddenTokens");
      if (res == null) return null;
      return new List<IToken>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void sethiddenTokens(List<IToken> param) {
    try {
      javonetHandle.set("hiddenTokens", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParseTree(Object label) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.ParseTree", label);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParseTree(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public ITree DupNode() {
    try {
      Object res = javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("DupNode");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToStringWithHiddenTokens() {
    try {
      java.lang.String res = javonetHandle.invoke("ToStringWithHiddenTokens");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToInputString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToInputString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
