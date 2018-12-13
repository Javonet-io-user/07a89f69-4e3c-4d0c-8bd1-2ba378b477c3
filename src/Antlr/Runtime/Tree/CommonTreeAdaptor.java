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
import Antlr.Runtime.Tree.*;
import Antlr.Runtime.*;
import jio.System.*;

public class CommonTreeAdaptor extends BaseTreeAdaptor implements ITreeAdaptor {
  protected NObject javonetHandle;

  public CommonTreeAdaptor() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.CommonTreeAdaptor");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommonTreeAdaptor(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Object Create(IToken payload) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("Create", payload);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IToken GetToken(Object t) {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor").invoke("GetToken", t);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IToken CreateToken(java.lang.Integer tokenType, java.lang.String text) {
    try {
      Object res = javonetHandle.invoke("CreateToken", tokenType, text);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IToken CreateToken(IToken fromToken) {
    try {
      Object res = javonetHandle.invoke("CreateToken", fromToken);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
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
