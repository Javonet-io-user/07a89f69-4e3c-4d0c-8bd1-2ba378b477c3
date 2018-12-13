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

public class ANTLRStringStream implements ICharStream, IIntStream {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getIndex() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("get_Index");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setLine(java.lang.Integer value) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.ICharStream").invoke("set_Line", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getLine() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.ICharStream").invoke("get_Line");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setCharPositionInLine(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.ICharStream")
          .invoke("set_CharPositionInLine", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getCharPositionInLine() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.ICharStream")
              .invoke("get_CharPositionInLine");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("get_Count");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.String getSourceName() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("get_SourceName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetFiled */

  public java.lang.String getname() {
    try {
      java.lang.String res = javonetHandle.get("name");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public void setname(java.lang.String param) {
    try {
      javonetHandle.set("name", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRStringStream(java.lang.String input) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ANTLRStringStream", input);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRStringStream(java.lang.String input, java.lang.String sourceName) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ANTLRStringStream", input, sourceName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRStringStream(
      java.lang.Character[] data, java.lang.Integer numberOfActualCharsInArray) {
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.ANTLRStringStream", new Object[] {data}, numberOfActualCharsInArray);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRStringStream(
      java.lang.Character[] data,
      java.lang.Integer numberOfActualCharsInArray,
      java.lang.String sourceName) {
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.ANTLRStringStream",
              new Object[] {data},
              numberOfActualCharsInArray,
              sourceName);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRStringStream(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String Substring(java.lang.Integer start, java.lang.Integer length) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.ICharStream")
              .invoke("Substring", start, length);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.Integer LT(java.lang.Integer i) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.ICharStream").invoke("LT", i);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void Consume() {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("Consume");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer LA(java.lang.Integer i) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("LA", i);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer Mark() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("Mark");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void Rewind(java.lang.Integer m) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("Rewind", m);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Rewind() {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("Rewind");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Release(java.lang.Integer marker) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("Release", marker);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Seek(java.lang.Integer index) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("Seek", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
