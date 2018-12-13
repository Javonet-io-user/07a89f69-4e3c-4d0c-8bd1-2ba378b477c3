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
import jio.System.*;
import Antlr.Runtime.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class RecognitionException extends jio.System.Exception
    implements ISerializable, _Exception {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getUnexpectedType() {
    try {
      java.lang.Integer res = javonetHandle.get("UnexpectedType");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getApproximateLineInfo() {
    try {
      java.lang.Boolean res = javonetHandle.get("ApproximateLineInfo");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public IIntStream getInput() {
    try {
      Object res = javonetHandle.<NObject>get("Input");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getLookahead() {
    try {
      java.lang.Integer res = javonetHandle.get("Lookahead");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setToken(IToken value) {
    try {
      javonetHandle.set("Token", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public IToken getToken() {
    try {
      Object res = javonetHandle.<NObject>get("Token");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Object getNode() {
    try {
      Object res = javonetHandle.<NObject>get("Node");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getCharacter() {
    try {
      java.lang.Integer res = javonetHandle.get("Character");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Integer getIndex() {
    try {
      java.lang.Integer res = javonetHandle.get("Index");
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

  public RecognitionException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.RecognitionException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecognitionException(IIntStream input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.RecognitionException", input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecognitionException(IIntStream input, java.lang.Integer k) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.RecognitionException", input, k);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecognitionException(java.lang.String message) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.RecognitionException", message);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecognitionException(java.lang.String message, IIntStream input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.RecognitionException", message, input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecognitionException(java.lang.String message, IIntStream input, java.lang.Integer k) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.RecognitionException", message, input, k);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecognitionException(java.lang.String message, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.RecognitionException", message, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecognitionException(
      java.lang.String message, IIntStream input, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.RecognitionException", message, input, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecognitionException(
      java.lang.String message,
      IIntStream input,
      java.lang.Integer k,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.RecognitionException", message, input, k, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RecognitionException(NObject handle) {
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

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
