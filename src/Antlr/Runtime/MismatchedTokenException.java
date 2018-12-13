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
import jio.System.Collections.ObjectModel.*;
import jio.System.*;
import jio.System.Collections.Generic.*;
import jio.System.Runtime.InteropServices.*;

public class MismatchedTokenException extends RecognitionException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getExpecting() {
    try {
      java.lang.Integer res = javonetHandle.get("Expecting");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public ReadOnlyCollection<java.lang.String> getTokenNames() {
    try {
      Object res = javonetHandle.<NObject>get("TokenNames");
      if (res == null) return null;
      return new ReadOnlyCollection<java.lang.String>((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public MismatchedTokenException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.MismatchedTokenException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MismatchedTokenException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.MismatchedTokenException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MismatchedTokenException(java.lang.String message, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.MismatchedTokenException", message, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MismatchedTokenException(java.lang.Integer expecting, IIntStream input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.MismatchedTokenException", expecting, input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MismatchedTokenException(
      java.lang.Integer expecting, IIntStream input, IList<java.lang.String> tokenNames) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.MismatchedTokenException", expecting, input, tokenNames);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MismatchedTokenException(
      java.lang.String message,
      java.lang.Integer expecting,
      IIntStream input,
      IList<java.lang.String> tokenNames) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.MismatchedTokenException", message, expecting, input, tokenNames);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MismatchedTokenException(
      java.lang.String message,
      java.lang.Integer expecting,
      IIntStream input,
      IList<java.lang.String> tokenNames,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.MismatchedTokenException",
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

  public MismatchedTokenException(NObject handle) {
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
