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
import jio.System.Runtime.Serialization.*;
import jio.System.*;
import jio.System.Runtime.InteropServices.*;

public class NoViableAltException extends RecognitionException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getDecisionNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("DecisionNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.String getGrammarDecisionDescription() {
    try {
      java.lang.String res = javonetHandle.get("GrammarDecisionDescription");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** GetProperty */

  public java.lang.Integer getStateNumber() {
    try {
      java.lang.Integer res = javonetHandle.get("StateNumber");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public NoViableAltException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.NoViableAltException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NoViableAltException(java.lang.String grammarDecisionDescription) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.NoViableAltException", grammarDecisionDescription);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NoViableAltException(
      java.lang.String message, java.lang.String grammarDecisionDescription) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.NoViableAltException", message, grammarDecisionDescription);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NoViableAltException(
      java.lang.String message,
      java.lang.String grammarDecisionDescription,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.NoViableAltException",
              message,
              grammarDecisionDescription,
              innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NoViableAltException(
      java.lang.String grammarDecisionDescription,
      java.lang.Integer decisionNumber,
      java.lang.Integer stateNumber,
      IIntStream input) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.NoViableAltException",
              grammarDecisionDescription,
              decisionNumber,
              stateNumber,
              input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NoViableAltException(
      java.lang.String grammarDecisionDescription,
      java.lang.Integer decisionNumber,
      java.lang.Integer stateNumber,
      IIntStream input,
      java.lang.Integer k) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.NoViableAltException",
              grammarDecisionDescription,
              decisionNumber,
              stateNumber,
              input,
              k);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NoViableAltException(
      java.lang.String message,
      java.lang.String grammarDecisionDescription,
      java.lang.Integer decisionNumber,
      java.lang.Integer stateNumber,
      IIntStream input) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.NoViableAltException",
              message,
              grammarDecisionDescription,
              decisionNumber,
              stateNumber,
              input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NoViableAltException(
      java.lang.String message,
      java.lang.String grammarDecisionDescription,
      java.lang.Integer decisionNumber,
      java.lang.Integer stateNumber,
      IIntStream input,
      java.lang.Integer k) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.NoViableAltException",
              message,
              grammarDecisionDescription,
              decisionNumber,
              stateNumber,
              input,
              k);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NoViableAltException(
      java.lang.String message,
      java.lang.String grammarDecisionDescription,
      java.lang.Integer decisionNumber,
      java.lang.Integer stateNumber,
      IIntStream input,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.NoViableAltException",
              message,
              grammarDecisionDescription,
              decisionNumber,
              stateNumber,
              input,
              innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NoViableAltException(
      java.lang.String message,
      java.lang.String grammarDecisionDescription,
      java.lang.Integer decisionNumber,
      java.lang.Integer stateNumber,
      IIntStream input,
      java.lang.Integer k,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.NoViableAltException",
              message,
              grammarDecisionDescription,
              decisionNumber,
              stateNumber,
              input,
              k,
              innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public NoViableAltException(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void GetObjectData(SerializationInfo info, StreamingContext context) {
    try {
      javonetHandle
          .explicitInterface("jio.System.Runtime.Serialization.ISerializable")
          .invoke("GetObjectData", info, context);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("jio.System.Runtime.InteropServices._Exception")
              .invoke("ToString");
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
