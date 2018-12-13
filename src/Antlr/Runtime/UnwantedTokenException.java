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
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class UnwantedTokenException extends MismatchedTokenException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;
  /** GetProperty */
  public IToken getUnexpectedToken() {
    try {
      Object res = javonetHandle.<NObject>get("UnexpectedToken");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public UnwantedTokenException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.UnwantedTokenException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnwantedTokenException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.UnwantedTokenException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnwantedTokenException(java.lang.String message, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.UnwantedTokenException", message, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnwantedTokenException(java.lang.Integer expecting, IIntStream input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.UnwantedTokenException", expecting, input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnwantedTokenException(
      java.lang.Integer expecting, IIntStream input, IList<java.lang.String> tokenNames) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.UnwantedTokenException", expecting, input, tokenNames);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnwantedTokenException(
      java.lang.String message,
      java.lang.Integer expecting,
      IIntStream input,
      IList<java.lang.String> tokenNames) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.UnwantedTokenException", message, expecting, input, tokenNames);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnwantedTokenException(
      java.lang.String message,
      java.lang.Integer expecting,
      IIntStream input,
      IList<java.lang.String> tokenNames,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.UnwantedTokenException",
              message,
              expecting,
              input,
              tokenNames,
              innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public UnwantedTokenException(NObject handle) {
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
