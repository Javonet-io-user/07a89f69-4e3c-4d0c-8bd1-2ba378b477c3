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

public class ParserRuleReturnScope<TToken>
    implements IRuleReturnScopeTLabel<TToken>, IRuleReturnScope {
  protected NObject javonetHandle;
  /** SetProperty */
  public void set_StartProperty(TToken value) {
    try {
      javonetHandle.invoke("set_Start", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TToken get_StartProperty(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Start");
      if (res == null) return null;
      return (TToken) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void set_Stop(TToken value) {
    try {
      javonetHandle.invoke("set_Stop", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TToken get_Stop(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Stop");
      if (res == null) return null;
      return (TToken) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public ParserRuleReturnScope(Class<?> TToken) {
    try {
      javonetHandle =
          Javonet.getType("Antlr.Runtime.ParserRuleReturnScope`1", getReturnObjectName(TToken))
              .create();
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ParserRuleReturnScope(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Object get_Start() {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.IRuleReturnScope").invoke("get_Start");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object IRuleReturnScope_get_Stop() {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.IRuleReturnScope").invoke("get_Stop");
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
