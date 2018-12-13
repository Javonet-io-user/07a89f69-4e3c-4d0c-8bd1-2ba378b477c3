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
import jio.System.Text.*;

public class ANTLRFileStream extends ANTLRStringStream implements ICharStream, IIntStream {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getSourceNameAsANTLRFileStream() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("get_SourceName");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public ANTLRFileStream(java.lang.String fileName) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ANTLRFileStream", fileName);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRFileStream(java.lang.String fileName, Encoding encoding) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ANTLRFileStream", fileName, encoding);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRFileStream(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Load(java.lang.String fileName, Encoding encoding) {
    try {
      javonetHandle.invoke("Load", fileName, encoding);
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
