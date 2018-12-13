package Antlr.Runtime;

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
import jio.System.Collections.Generic.*;

public class RecognizerSharedState {
  protected NObject javonetHandle;
  /** GetFiled */
  public BitSet[] getfollowing(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("following");
      if (res == null) return null;
      return (BitSet[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setfollowing(BitSet[] param) {
    try {
      javonetHandle.set("following", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer get_fsp() {
    try {
      java.lang.Integer res = javonetHandle.get("_fsp");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void set_fsp(java.lang.Integer param) {
    try {
      javonetHandle.set("_fsp", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Boolean geterrorRecovery() {
    try {
      java.lang.Boolean res = javonetHandle.get("errorRecovery");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void seterrorRecovery(java.lang.Boolean param) {
    try {
      javonetHandle.set("errorRecovery", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getlastErrorIndex() {
    try {
      java.lang.Integer res = javonetHandle.get("lastErrorIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setlastErrorIndex(java.lang.Integer param) {
    try {
      javonetHandle.set("lastErrorIndex", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Boolean getfailed() {
    try {
      java.lang.Boolean res = javonetHandle.get("failed");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void setfailed(java.lang.Boolean param) {
    try {
      javonetHandle.set("failed", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getsyntaxErrors() {
    try {
      java.lang.Integer res = javonetHandle.get("syntaxErrors");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setsyntaxErrors(java.lang.Integer param) {
    try {
      javonetHandle.set("syntaxErrors", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getbacktracking() {
    try {
      java.lang.Integer res = javonetHandle.get("backtracking");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setbacktracking(java.lang.Integer param) {
    try {
      javonetHandle.set("backtracking", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public IDictionary[] getruleMemo(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("ruleMemo");
      if (res == null) return null;
      return (IDictionary[]) Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setruleMemo(IDictionary[] param) {
    try {
      javonetHandle.set("ruleMemo", new Object[] {param});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public IToken gettoken() {
    try {
      Object res = javonetHandle.<NObject>get("token");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void settoken(IToken param) {
    try {
      javonetHandle.set("token", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer gettokenStartCharIndex() {
    try {
      java.lang.Integer res = javonetHandle.get("tokenStartCharIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void settokenStartCharIndex(java.lang.Integer param) {
    try {
      javonetHandle.set("tokenStartCharIndex", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer gettokenStartLine() {
    try {
      java.lang.Integer res = javonetHandle.get("tokenStartLine");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void settokenStartLine(java.lang.Integer param) {
    try {
      javonetHandle.set("tokenStartLine", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer gettokenStartCharPositionInLine() {
    try {
      java.lang.Integer res = javonetHandle.get("tokenStartCharPositionInLine");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void settokenStartCharPositionInLine(java.lang.Integer param) {
    try {
      javonetHandle.set("tokenStartCharPositionInLine", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer getchannel() {
    try {
      java.lang.Integer res = javonetHandle.get("channel");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void setchannel(java.lang.Integer param) {
    try {
      javonetHandle.set("channel", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.Integer gettype() {
    try {
      java.lang.Integer res = javonetHandle.get("type");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public void settype(java.lang.Integer param) {
    try {
      javonetHandle.set("type", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public java.lang.String gettext() {
    try {
      java.lang.String res = javonetHandle.get("text");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void settext(java.lang.String param) {
    try {
      javonetHandle.set("text", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecognizerSharedState() {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.RecognizerSharedState");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecognizerSharedState(RecognizerSharedState state) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.RecognizerSharedState", state);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecognizerSharedState(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
