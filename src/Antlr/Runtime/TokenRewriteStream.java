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
import jio.System.*;

public class TokenRewriteStream extends CommonTokenStream
    implements ITokenStream, IIntStream, ITokenStreamInformation {
  protected NObject javonetHandle;
  /** GetFiled */
  public static java.lang.String getDEFAULT_PROGRAM_NAME() {
    try {
      java.lang.String res = Javonet.getType("TokenRewriteStream").get("DEFAULT_PROGRAM_NAME");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setDEFAULT_PROGRAM_NAME(java.lang.String param) {
    try {
      Javonet.getType("TokenRewriteStream").set("DEFAULT_PROGRAM_NAME", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getPROGRAM_INIT_SIZE() {
    try {
      java.lang.Integer res = Javonet.getType("TokenRewriteStream").get("PROGRAM_INIT_SIZE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setPROGRAM_INIT_SIZE(java.lang.Integer param) {
    try {
      Javonet.getType("TokenRewriteStream").set("PROGRAM_INIT_SIZE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getMIN_TOKEN_INDEX() {
    try {
      java.lang.Integer res = Javonet.getType("TokenRewriteStream").get("MIN_TOKEN_INDEX");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setMIN_TOKEN_INDEX(java.lang.Integer param) {
    try {
      Javonet.getType("TokenRewriteStream").set("MIN_TOKEN_INDEX", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TokenRewriteStream() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.TokenRewriteStream");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TokenRewriteStream(ITokenSource tokenSource) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.TokenRewriteStream", tokenSource);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TokenRewriteStream(ITokenSource tokenSource, java.lang.Integer channel) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.TokenRewriteStream", tokenSource, channel);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TokenRewriteStream(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String ToString(java.lang.Integer start, java.lang.Integer end) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.ITokenStream")
              .invoke("ToString", start, end);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void Rollback(java.lang.Integer instructionIndex) {
    try {
      javonetHandle.invoke("Rollback", instructionIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Rollback(java.lang.String programName, java.lang.Integer instructionIndex) {
    try {
      javonetHandle.invoke("Rollback", programName, instructionIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DeleteProgram() {
    try {
      javonetHandle.invoke("DeleteProgram");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void DeleteProgram(java.lang.String programName) {
    try {
      javonetHandle.invoke("DeleteProgram", programName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InsertAfter(IToken t, Object text) {
    try {
      javonetHandle.invoke("InsertAfter", t, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InsertAfter(java.lang.Integer index, Object text) {
    try {
      javonetHandle.invoke("InsertAfter", index, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InsertAfter(java.lang.String programName, IToken t, Object text) {
    try {
      javonetHandle.invoke("InsertAfter", programName, t, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InsertAfter(java.lang.String programName, java.lang.Integer index, Object text) {
    try {
      javonetHandle.invoke("InsertAfter", programName, index, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InsertBefore(IToken t, Object text) {
    try {
      javonetHandle.invoke("InsertBefore", t, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InsertBefore(java.lang.Integer index, Object text) {
    try {
      javonetHandle.invoke("InsertBefore", index, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InsertBefore(java.lang.String programName, IToken t, Object text) {
    try {
      javonetHandle.invoke("InsertBefore", programName, t, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InsertBefore(java.lang.String programName, java.lang.Integer index, Object text) {
    try {
      javonetHandle.invoke("InsertBefore", programName, index, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Replace(java.lang.Integer index, Object text) {
    try {
      javonetHandle.invoke("Replace", index, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Replace(java.lang.Integer from, java.lang.Integer to, Object text) {
    try {
      javonetHandle.invoke("Replace", from, to, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Replace(IToken indexT, Object text) {
    try {
      javonetHandle.invoke("Replace", indexT, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Replace(IToken from, IToken to, Object text) {
    try {
      javonetHandle.invoke("Replace", from, to, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Replace(
      java.lang.String programName, java.lang.Integer from, java.lang.Integer to, Object text) {
    try {
      javonetHandle.invoke("Replace", programName, from, to, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Replace(java.lang.String programName, IToken from, IToken to, Object text) {
    try {
      javonetHandle.invoke("Replace", programName, from, to, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Delete(java.lang.Integer index) {
    try {
      javonetHandle.invoke("Delete", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Delete(java.lang.Integer from, java.lang.Integer to) {
    try {
      javonetHandle.invoke("Delete", from, to);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Delete(IToken indexT) {
    try {
      javonetHandle.invoke("Delete", indexT);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Delete(IToken from, IToken to) {
    try {
      javonetHandle.invoke("Delete", from, to);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Delete(java.lang.String programName, java.lang.Integer from, java.lang.Integer to) {
    try {
      javonetHandle.invoke("Delete", programName, from, to);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Delete(java.lang.String programName, IToken from, IToken to) {
    try {
      javonetHandle.invoke("Delete", programName, from, to);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer GetLastRewriteTokenIndex() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetLastRewriteTokenIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.String ToOriginalString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToOriginalString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToOriginalString(java.lang.Integer start, java.lang.Integer end) {
    try {
      java.lang.String res = javonetHandle.invoke("ToOriginalString", start, end);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToString(java.lang.String programName) {
    try {
      java.lang.String res = javonetHandle.invoke("ToString", programName);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToString(
      java.lang.String programName, java.lang.Integer start, java.lang.Integer end) {
    try {
      java.lang.String res = javonetHandle.invoke("ToString", programName, start, end);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToDebugString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToDebugString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToDebugString(java.lang.Integer start, java.lang.Integer end) {
    try {
      java.lang.String res = javonetHandle.invoke("ToDebugString", start, end);
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
