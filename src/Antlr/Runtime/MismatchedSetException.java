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

public class MismatchedSetException extends RecognitionException
    implements ISerializable, _Exception {
  protected NObject javonetHandle;
  /** GetProperty */
  public BitSet getExpecting() {
    try {
      Object res = javonetHandle.<NObject>get("Expecting");
      if (res == null) return null;
      return new BitSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public MismatchedSetException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.MismatchedSetException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MismatchedSetException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.MismatchedSetException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MismatchedSetException(java.lang.String message, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.MismatchedSetException", message, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MismatchedSetException(BitSet expecting, IIntStream input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.MismatchedSetException", expecting, input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MismatchedSetException(java.lang.String message, BitSet expecting, IIntStream input) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.MismatchedSetException", message, expecting, input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MismatchedSetException(
      java.lang.String message,
      BitSet expecting,
      IIntStream input,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.MismatchedSetException", message, expecting, input, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public MismatchedSetException(NObject handle) {
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
