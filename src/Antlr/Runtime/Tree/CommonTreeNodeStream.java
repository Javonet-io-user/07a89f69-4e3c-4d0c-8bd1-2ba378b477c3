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
import Antlr.Runtime.Misc.*;
import Antlr.Runtime.Tree.*;
import Antlr.Runtime.*;

public class CommonTreeNodeStream extends LookaheadStream<Object>
    implements ITreeNodeStream, IIntStream {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.String getSourceName() {
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
  /** SetProperty */

  public void setTokenStream(ITokenStream value) {
    try {
      javonetHandle.set("TokenStream", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ITokenStream getTokenStream() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeNodeStream")
              .invoke("get_TokenStream");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setTreeAdaptor(ITreeAdaptor value) {
    try {
      javonetHandle.set("TreeAdaptor", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ITreeAdaptor getTreeAdaptor() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeNodeStream")
              .invoke("get_TreeAdaptor");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public Object getTreeSource() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeNodeStream")
              .invoke("get_TreeSource");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setUniqueNavigationNodes(java.lang.Boolean value) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITreeNodeStream")
          .invoke("set_UniqueNavigationNodes", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Boolean getUniqueNavigationNodes() {
    try {
      java.lang.Boolean res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeNodeStream")
              .invoke("get_UniqueNavigationNodes");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetFiled */

  public static java.lang.Integer getDEFAULT_INITIAL_BUFFER_SIZE() {
    try {
      java.lang.Integer res =
          Javonet.getType("CommonTreeNodeStream").get("DEFAULT_INITIAL_BUFFER_SIZE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setDEFAULT_INITIAL_BUFFER_SIZE(java.lang.Integer param) {
    try {
      Javonet.getType("CommonTreeNodeStream").set("DEFAULT_INITIAL_BUFFER_SIZE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public static java.lang.Integer getINITIAL_CALL_STACK_SIZE() {
    try {
      java.lang.Integer res =
          Javonet.getType("CommonTreeNodeStream").get("INITIAL_CALL_STACK_SIZE");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetFiled */

  public static void setINITIAL_CALL_STACK_SIZE(java.lang.Integer param) {
    try {
      Javonet.getType("CommonTreeNodeStream").set("INITIAL_CALL_STACK_SIZE", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommonTreeNodeStream(Object tree) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.CommonTreeNodeStream", tree);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommonTreeNodeStream(ITreeAdaptor adaptor, Object tree) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.CommonTreeNodeStream", adaptor, tree);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommonTreeNodeStream(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.String ToString(Object start, Object stop) {
    try {
      java.lang.String res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeNodeStream")
              .invoke("ToString", start, stop);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void ReplaceChildren(
      Object parent,
      java.lang.Integer startChildIndex,
      java.lang.Integer stopChildIndex,
      Object t) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITreeNodeStream")
          .invoke("ReplaceChildren", parent, startChildIndex, stopChildIndex, t);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer LA(java.lang.Integer i) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.IIntStream").invoke("LA", i);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
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
  /** Method */

  public Object CommonTreeNodeStream___NextElement() {
    try {
      Object res = javonetHandle.invoke("NextElement");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean IsEndOfFile(Object o) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsEndOfFile", o);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Push(java.lang.Integer index) {
    try {
      javonetHandle.invoke("Push", index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer Pop() {
    try {
      java.lang.Integer res = javonetHandle.invoke("Pop");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.String ToTokenTypeString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToTokenTypeString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
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
