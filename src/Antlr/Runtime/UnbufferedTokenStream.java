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
import Antlr.Runtime.Misc.*;

public class UnbufferedTokenStream extends LookaheadStream<IToken>
    implements ITokenStream, IIntStream, ITokenStreamInformation {
  protected NObject javonetHandle;
  /** GetProperty */
  public ITokenSource getTokenSource() {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.ITokenStream").invoke("get_TokenSource");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
  /** GetProperty */

  public IToken getLastToken() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.ITokenStreamInformation")
              .invoke("get_LastToken");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public IToken getLastRealToken() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.ITokenStreamInformation")
              .invoke("get_LastRealToken");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getMaxLookBehind() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.ITokenStreamInformation")
              .invoke("get_MaxLookBehind");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public UnbufferedTokenStream(ITokenSource tokenSource) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.UnbufferedTokenStream", tokenSource);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnbufferedTokenStream(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public IToken Get(java.lang.Integer i) {
    try {
      Object res = javonetHandle.explicitInterface("Antlr.Runtime.ITokenStream").invoke("Get", i);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String ToString(java.lang.Integer start, java.lang.Integer stop) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.ITokenStream")
              .invoke("ToString", start, stop);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToString(IToken start, IToken stop) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.ITokenStream")
              .invoke("ToString", start, stop);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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

  public void Release(java.lang.Integer marker) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("Release", marker);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Clear() {
    try {
      javonetHandle.invoke("Clear");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IToken UnbufferedTokenStream___NextElement() {
    try {
      Object res = javonetHandle.invoke("NextElement");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean IsEndOfFile(IToken o) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsEndOfFile", o);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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
