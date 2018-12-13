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
import jio.System.*;
import Antlr.Runtime.Misc.*;

public class TreeVisitorAction implements ITreeVisitorAction {
  protected NObject javonetHandle;

  public TreeVisitorAction(
      FuncTTResult<Object, Object> preAction, FuncTTResult<Object, Object> postAction) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeVisitorAction", preAction, postAction);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeVisitorAction(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Object Pre(Object t) {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITreeVisitorAction").invoke("Pre", t);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object Post(Object t) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeVisitorAction")
              .invoke("Post", t);
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
