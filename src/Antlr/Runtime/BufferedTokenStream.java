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

public class BufferedTokenStream implements ITokenStream, IIntStream, ITokenStreamInformation {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setTokenSource(ITokenSource value) {
    try {
      javonetHandle.set("TokenSource", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
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
  /** GetProperty */

  public java.lang.Integer getRange() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.ITokenStream").invoke("get_Range");
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

  public BufferedTokenStream() {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.BufferedTokenStream");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BufferedTokenStream(ITokenSource tokenSource) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.BufferedTokenStream", tokenSource);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BufferedTokenStream(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public IToken LT(java.lang.Integer k) {
    try {
      Object res = javonetHandle.explicitInterface("Antlr.Runtime.ITokenStream").invoke("LT", k);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
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

  public void Rewind(java.lang.Integer marker) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("Rewind", marker);
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

  public List<IToken> GetTokens() {
    try {
      Object res = javonetHandle.invoke("GetTokens");
      if (res == null) return null;
      return new List<IToken>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public List<IToken> GetTokens(java.lang.Integer start, java.lang.Integer stop) {
    try {
      Object res = javonetHandle.invoke("GetTokens", start, stop);
      if (res == null) return null;
      return new List<IToken>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public List<IToken> GetTokens(java.lang.Integer start, java.lang.Integer stop, BitSet types) {
    try {
      Object res = javonetHandle.invoke("GetTokens", start, stop, types);
      if (res == null) return null;
      return new List<IToken>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public List<IToken> GetTokens(
      java.lang.Integer start, java.lang.Integer stop, IEnumerable<java.lang.Integer> types) {
    try {
      Object res = javonetHandle.invoke("GetTokens", start, stop, types);
      if (res == null) return null;
      return new List<IToken>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public List<IToken> GetTokens(
      java.lang.Integer start, java.lang.Integer stop, java.lang.Integer ttype) {
    try {
      Object res = javonetHandle.invoke("GetTokens", start, stop, ttype);
      if (res == null) return null;
      return new List<IToken>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public void Fill() {
    try {
      javonetHandle.invoke("Fill");
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
