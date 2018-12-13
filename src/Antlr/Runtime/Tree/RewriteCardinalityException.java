package Antlr.Runtime.Tree;

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
import Antlr.Runtime.Tree.*;
import jio.System.Runtime.Serialization.*;
import jio.System.Runtime.InteropServices.*;

public class RewriteCardinalityException extends jio.System.Exception
    implements ISerializable, _Exception {
  protected NObject javonetHandle;

  public RewriteCardinalityException() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.RewriteCardinalityException");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RewriteCardinalityException(java.lang.String elementDescription) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.Tree.RewriteCardinalityException", elementDescription);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RewriteCardinalityException(
      java.lang.String elementDescription, jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.Tree.RewriteCardinalityException", elementDescription, innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RewriteCardinalityException(
      java.lang.String message, java.lang.String elementDescription) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.Tree.RewriteCardinalityException", message, elementDescription);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RewriteCardinalityException(
      java.lang.String message,
      java.lang.String elementDescription,
      jio.System.Exception innerException) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.Tree.RewriteCardinalityException",
              message,
              elementDescription,
              innerException);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RewriteCardinalityException(NObject handle) {
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
