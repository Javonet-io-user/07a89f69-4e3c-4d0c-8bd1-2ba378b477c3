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

public class CommonTokenStream extends BufferedTokenStream
    implements ITokenStream, IIntStream, ITokenStreamInformation {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Integer getChannel() {
    try {
      java.lang.Integer res = javonetHandle.get("Channel");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setTokenSourceAsCommonTokenStream(ITokenSource value) {
    try {
      javonetHandle.set("TokenSource", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ITokenSource getTokenSourceAsCommonTokenStream() {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.ITokenStream").invoke("get_TokenSource");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }

  public CommonTokenStream() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.CommonTokenStream");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommonTokenStream(ITokenSource tokenSource) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.CommonTokenStream", tokenSource);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommonTokenStream(ITokenSource tokenSource, java.lang.Integer channel) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.CommonTokenStream", tokenSource, channel);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommonTokenStream(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public IToken LT(java.lang.Integer k) {
    try {
      Object res = javonetHandle.explicitInterface("Antlr.Runtime.ITokenStream").invoke("LT", k);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Consume() {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("Consume");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Reset() {
    try {
      javonetHandle.invoke("Reset");
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
