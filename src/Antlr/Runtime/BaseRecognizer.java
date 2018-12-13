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
import jio.System.Collections.Generic.*;
import jio.System.Diagnostics.*;
import jio.System.IO.*;
import Antlr.Runtime.Debug.*;

public abstract class BaseRecognizer {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setTraceDestination(TextWriter value) {
    try {
      javonetHandle.set("TraceDestination", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TextWriter getTraceDestination() {
    try {
      Object res = javonetHandle.<NObject>get("TraceDestination");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getNumberOfSyntaxErrors() {
    try {
      java.lang.Integer res = javonetHandle.get("NumberOfSyntaxErrors");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setBacktrackingLevel(java.lang.Integer value) {
    try {
      javonetHandle.set("BacktrackingLevel", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getBacktrackingLevel() {
    try {
      java.lang.Integer res = javonetHandle.get("BacktrackingLevel");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getFailed() {
    try {
      java.lang.Boolean res = javonetHandle.get("Failed");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.String[] getTokenNames(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.<NObject[]>get("TokenNames");
      if (res == null) return null;
      return (java.lang.String[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.String getGrammarFileName() {
    try {
      java.lang.String res = javonetHandle.get("GrammarFileName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.String getSourceName() {
    try {
      java.lang.String res = javonetHandle.get("SourceName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public IDebugEventListener getDebugListener() {
    try {
      Object res = javonetHandle.<NObject>get("DebugListener");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public static java.lang.Integer getMemoRuleFailed() {
    try {
      java.lang.Integer res = Javonet.getType("BaseRecognizer").get("MemoRuleFailed");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setMemoRuleFailed(java.lang.Integer param) {
    try {
      Javonet.getType("BaseRecognizer").set("MemoRuleFailed", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getMemoRuleUnknown() {
    try {
      java.lang.Integer res = Javonet.getType("BaseRecognizer").get("MemoRuleUnknown");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setMemoRuleUnknown(java.lang.Integer param) {
    try {
      Javonet.getType("BaseRecognizer").set("MemoRuleUnknown", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getInitialFollowStackSize() {
    try {
      java.lang.Integer res = Javonet.getType("BaseRecognizer").get("InitialFollowStackSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setInitialFollowStackSize(java.lang.Integer param) {
    try {
      Javonet.getType("BaseRecognizer").set("InitialFollowStackSize", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getDefaultTokenChannel() {
    try {
      java.lang.Integer res = Javonet.getType("BaseRecognizer").get("DefaultTokenChannel");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setDefaultTokenChannel(java.lang.Integer param) {
    try {
      Javonet.getType("BaseRecognizer").set("DefaultTokenChannel", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getHidden() {
    try {
      java.lang.Integer res = Javonet.getType("BaseRecognizer").get("Hidden");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setHidden(java.lang.Integer param) {
    try {
      Javonet.getType("BaseRecognizer").set("Hidden", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.String getNextTokenRuleName() {
    try {
      java.lang.String res = Javonet.getType("BaseRecognizer").get("NextTokenRuleName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetFiled */

  public static void setNextTokenRuleName(java.lang.String param) {
    try {
      Javonet.getType("BaseRecognizer").set("NextTokenRuleName", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseRecognizer() {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.BaseRecognizer");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseRecognizer(RecognizerSharedState state) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.BaseRecognizer", state);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseRecognizer(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void SetState(RecognizerSharedState value) {
    try {
      javonetHandle.invoke("SetState", value);
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

  public Object Match(IIntStream input, java.lang.Integer ttype, BitSet follow) {
    try {
      Object res = javonetHandle.invoke("Match", input, ttype, follow);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void MatchAny(IIntStream input) {
    try {
      javonetHandle.invoke("MatchAny", input);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean MismatchIsUnwantedToken(IIntStream input, java.lang.Integer ttype) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("MismatchIsUnwantedToken", input, ttype);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean MismatchIsMissingToken(IIntStream input, BitSet follow) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("MismatchIsMissingToken", input, follow);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
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

  public void DisplayRecognitionError(java.lang.String[] tokenNames, RecognitionException e) {
    try {
      javonetHandle.invoke("DisplayRecognitionError", new Object[] {tokenNames}, e);
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

  public java.lang.String GetErrorHeader(RecognitionException e) {
    try {
      java.lang.String res = javonetHandle.invoke("GetErrorHeader", e);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String GetTokenErrorDisplay(IToken t) {
    try {
      java.lang.String res = javonetHandle.invoke("GetTokenErrorDisplay", t);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void EmitErrorMessage(java.lang.String msg) {
    try {
      javonetHandle.invoke("EmitErrorMessage", msg);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Recover(IIntStream input, RecognitionException re) {
    try {
      javonetHandle.invoke("Recover", input, re);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void BeginResync() {
    try {
      javonetHandle.invoke("BeginResync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void EndResync() {
    try {
      javonetHandle.invoke("EndResync");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object RecoverFromMismatchedSet(IIntStream input, RecognitionException e, BitSet follow) {
    try {
      Object res = javonetHandle.invoke("RecoverFromMismatchedSet", input, e, follow);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void ConsumeUntil(IIntStream input, java.lang.Integer tokenType) {
    try {
      javonetHandle.invoke("ConsumeUntil", input, tokenType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void ConsumeUntil(IIntStream input, BitSet set) {
    try {
      javonetHandle.invoke("ConsumeUntil", input, set);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public IList<java.lang.String> GetRuleInvocationStack() {
    try {
      Object res = javonetHandle.invoke("GetRuleInvocationStack");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static IList<java.lang.String> GetRuleInvocationStack(StackTrace trace) {
    try {
      Object res = Javonet.getType("BaseRecognizer").invoke("GetRuleInvocationStack", trace);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public List<java.lang.String> ToStrings(ICollection<IToken> tokens) {
    try {
      Object res = javonetHandle.invoke("ToStrings", tokens);
      if (res == null) return null;
      return new List<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer GetRuleMemoization(
      java.lang.Integer ruleIndex, java.lang.Integer ruleStartIndex) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetRuleMemoization", ruleIndex, ruleStartIndex);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Boolean AlreadyParsedRule(IIntStream input, java.lang.Integer ruleIndex) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("AlreadyParsedRule", input, ruleIndex);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Memoize(
      IIntStream input, java.lang.Integer ruleIndex, java.lang.Integer ruleStartIndex) {
    try {
      javonetHandle.invoke("Memoize", input, ruleIndex, ruleStartIndex);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer GetRuleMemoizationCacheSize() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetRuleMemoizationCacheSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void TraceIn(java.lang.String ruleName, java.lang.Integer ruleIndex, Object inputSymbol) {
    try {
      javonetHandle.invoke("TraceIn", ruleName, ruleIndex, inputSymbol);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void TraceOut(java.lang.String ruleName, java.lang.Integer ruleIndex, Object inputSymbol) {
    try {
      javonetHandle.invoke("TraceOut", ruleName, ruleIndex, inputSymbol);
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
