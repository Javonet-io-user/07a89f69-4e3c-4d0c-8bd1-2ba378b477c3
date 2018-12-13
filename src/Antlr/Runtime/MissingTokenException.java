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

public class MissingTokenException extends MismatchedTokenException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getMissingType() {
    try {
      java.lang.Integer res = javonetHandle.get("MissingType");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public MissingTokenException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.MissingTokenException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MissingTokenException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.MissingTokenException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MissingTokenException(java.lang.String message, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.MissingTokenException", message, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MissingTokenException(java.lang.Integer expecting, IIntStream input, Object inserted) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.MissingTokenException", expecting, input, inserted);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MissingTokenException(
      java.lang.Integer expecting,
      IIntStream input,
      Object inserted,
      IList<java.lang.String> tokenNames) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.MissingTokenException", expecting, input, inserted, tokenNames);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MissingTokenException(
      java.lang.String message,
      java.lang.Integer expecting,
      IIntStream input,
      Object inserted,
      IList<java.lang.String> tokenNames) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.MissingTokenException",
              message,
              expecting,
              input,
              inserted,
              tokenNames);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MissingTokenException(
      java.lang.String message,
      java.lang.Integer expecting,
      IIntStream input,
      Object inserted,
      IList<java.lang.String> tokenNames,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.MissingTokenException",
              message,
              expecting,
              input,
              inserted,
              tokenNames,
              innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MissingTokenException(NObject handle) {
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
