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

public class ClassicToken implements IToken {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setText(java.lang.String value) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("set_Text", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getText() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("get_Text");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setType(java.lang.Integer value) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("set_Type", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getType() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("get_Type");
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
      javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("set_Line", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getLine() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("get_Line");
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
          .explicitInterface("Antlr.Runtime.IToken")
          .invoke("set_CharPositionInLine", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getCharPositionInLine() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("get_CharPositionInLine");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setChannel(java.lang.Integer value) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("set_Channel", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getChannel() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("get_Channel");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setStartIndex(java.lang.Integer value) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("set_StartIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getStartIndex() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("get_StartIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setStopIndex(java.lang.Integer value) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("set_StopIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getStopIndex() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("get_StopIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setTokenIndex(java.lang.Integer value) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("set_TokenIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getTokenIndex() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("get_TokenIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setInputStream(ICharStream value) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("set_InputStream", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ICharStream getInputStream() {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.IToken").invoke("get_InputStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public ClassicToken(java.lang.Integer type) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ClassicToken", type);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClassicToken(IToken oldToken) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ClassicToken", oldToken);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClassicToken(java.lang.Integer type, java.lang.String text) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ClassicToken", type, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClassicToken(java.lang.Integer type, java.lang.String text, java.lang.Integer channel) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ClassicToken", type, text, channel);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ClassicToken(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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
