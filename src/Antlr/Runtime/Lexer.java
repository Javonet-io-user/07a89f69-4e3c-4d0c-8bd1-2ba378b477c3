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

public abstract class Lexer extends BaseRecognizer implements ITokenSource {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setText(java.lang.String value) {
    try {
      javonetHandle.set("Text", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getText() {
    try {
      java.lang.String res = javonetHandle.get("Text");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setLine(java.lang.Integer value) {
    try {
      javonetHandle.set("Line", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getLine() {
    try {
      java.lang.Integer res = javonetHandle.get("Line");
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
      javonetHandle.set("CharPositionInLine", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getCharPositionInLine() {
    try {
      java.lang.Integer res = javonetHandle.get("CharPositionInLine");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setCharStream(ICharStream value) {
    try {
      javonetHandle.set("CharStream", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ICharStream getCharStream() {
    try {
      Object res = javonetHandle.<NObject>get("CharStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getSourceNameAsLexer() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Antlr.Runtime.ITokenSource").invoke("get_SourceName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Integer getCharIndex() {
    try {
      java.lang.Integer res = javonetHandle.get("CharIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public Lexer() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Lexer");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Lexer(ICharStream input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Lexer", input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Lexer(ICharStream input, RecognizerSharedState state) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Lexer", input, state);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public Lexer(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public IToken NextToken() {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.ITokenSource").invoke("NextToken");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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

  public void Skip() {
    try {
      javonetHandle.invoke("Skip");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void mTokens() {
    try {
      javonetHandle.invoke("mTokens");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Emit(IToken token) {
    try {
      javonetHandle.invoke("Emit", token);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IToken Emit() {
    try {
      Object res = javonetHandle.invoke("Emit");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Lexer___Match(java.lang.String s) {
    try {
      javonetHandle.invoke("Match", s);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void MatchAny() {
    try {
      javonetHandle.invoke("MatchAny");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Lexer___Match(java.lang.Integer c) {
    try {
      javonetHandle.invoke("Match", c);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void MatchRange(java.lang.Integer a, java.lang.Integer b) {
    try {
      javonetHandle.invoke("MatchRange", a, b);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ReportError(RecognitionException e) {
    try {
      javonetHandle.invoke("ReportError", e);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

  public java.lang.String GetCharErrorDisplay(java.lang.Integer c) {
    try {
      java.lang.String res = javonetHandle.invoke("GetCharErrorDisplay", c);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void Recover(RecognitionException re) {
    try {
      javonetHandle.invoke("Recover", re);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
