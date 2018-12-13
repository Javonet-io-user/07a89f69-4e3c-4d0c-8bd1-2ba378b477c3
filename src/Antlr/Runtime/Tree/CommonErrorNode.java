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

public class CommonErrorNode extends CommonTree implements ITree {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Boolean getIsNilAsCommonErrorNode() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_IsNil");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setTextAsCommonErrorNode(java.lang.String value) {
    try {
      javonetHandle.set("Text", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getTextAsCommonErrorNode() {
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

  public void setTypeAsCommonErrorNode(java.lang.Integer value) {
    try {
      javonetHandle.set("Type", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getTypeAsCommonErrorNode() {
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

  public IIntStream getinput() {
    try {
      Object res = javonetHandle.<NObject>get("input");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setinput(IIntStream param) {
    try {
      javonetHandle.set("input", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public IToken getstart() {
    try {
      Object res = javonetHandle.<NObject>get("start");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setstart(IToken param) {
    try {
      javonetHandle.set("start", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public IToken getstop() {
    try {
      Object res = javonetHandle.<NObject>get("stop");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setstop(IToken param) {
    try {
      javonetHandle.set("stop", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public RecognitionException gettrappedException() {
    try {
      Object res = javonetHandle.<NObject>get("trappedException");
      if (res == null) return null;
      return new RecognitionException((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void settrappedException(RecognitionException param) {
    try {
      javonetHandle.set("trappedException", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommonErrorNode(ITokenStream input, IToken start, IToken stop, RecognitionException e) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.CommonErrorNode", input, start, stop, e);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommonErrorNode(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
