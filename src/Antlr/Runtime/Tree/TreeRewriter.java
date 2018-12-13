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
import Antlr.Runtime.*;
import Antlr.Runtime.Misc.*;

public class TreeRewriter extends TreeParser {
  protected NObject javonetHandle;

  public TreeRewriter(ITreeNodeStream input) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeRewriter", input);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeRewriter(ITreeNodeStream input, RecognizerSharedState state) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeRewriter", input, state);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeRewriter(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Object ApplyOnce(Object t, FuncTResult<IAstRuleReturnScope> whichRule) {
    try {
      Object res = javonetHandle.invoke("ApplyOnce", t, whichRule);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object ApplyRepeatedly(Object t, FuncTResult<IAstRuleReturnScope> whichRule) {
    try {
      Object res = javonetHandle.invoke("ApplyRepeatedly", t, whichRule);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object Downup(Object t) {
    try {
      Object res = javonetHandle.invoke("Downup", t);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object Downup(Object t, java.lang.Boolean showTransformations) {
    try {
      Object res = javonetHandle.invoke("Downup", t, showTransformations);
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
