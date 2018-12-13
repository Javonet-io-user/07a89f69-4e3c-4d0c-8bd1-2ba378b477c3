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
import jio.System.IO.*;

public class ANTLRReaderStream extends ANTLRStringStream implements ICharStream, IIntStream {
  protected NObject javonetHandle;
  /** GetFiled */
  public static java.lang.Integer getReadBufferSize() {
    try {
      java.lang.Integer res = Javonet.getType("ANTLRReaderStream").get("ReadBufferSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setReadBufferSize(java.lang.Integer param) {
    try {
      Javonet.getType("ANTLRReaderStream").set("ReadBufferSize", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getInitialBufferSize() {
    try {
      java.lang.Integer res = Javonet.getType("ANTLRReaderStream").get("InitialBufferSize");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setInitialBufferSize(java.lang.Integer param) {
    try {
      Javonet.getType("ANTLRReaderStream").set("InitialBufferSize", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRReaderStream(TextReader r) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ANTLRReaderStream", r);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRReaderStream(TextReader r, java.lang.Integer size) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ANTLRReaderStream", r, size);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRReaderStream(TextReader r, java.lang.Integer size, java.lang.Integer readChunkSize) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ANTLRReaderStream", r, size, readChunkSize);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRReaderStream(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Load(TextReader r, java.lang.Integer size, java.lang.Integer readChunkSize) {
    try {
      javonetHandle.invoke("Load", r, size, readChunkSize);
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
