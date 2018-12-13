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
import jio.System.Text.*;

public class ANTLRInputStream extends ANTLRReaderStream implements ICharStream, IIntStream {
  protected NObject javonetHandle;

  public ANTLRInputStream(Stream input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ANTLRInputStream", input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRInputStream(Stream input, java.lang.Integer size) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ANTLRInputStream", input, size);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRInputStream(Stream input, Encoding encoding) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ANTLRInputStream", input, encoding);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRInputStream(Stream input, java.lang.Integer size, Encoding encoding) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.ANTLRInputStream", input, size, encoding);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRInputStream(
      Stream input, java.lang.Integer size, java.lang.Integer readBufferSize, Encoding encoding) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.ANTLRInputStream", input, size, readBufferSize, encoding);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ANTLRInputStream(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
