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

public abstract class BaseTreeAdaptor implements ITreeAdaptor {
  protected NObject javonetHandle;

  public BaseTreeAdaptor(NObject handle) {
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

  public Object Create(java.lang.Integer tokenType, IToken fromToken) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("Create", tokenType, fromToken);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object Create(java.lang.Integer tokenType, IToken fromToken, java.lang.String text) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("Create", tokenType, fromToken, text);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object Create(IToken fromToken, java.lang.String text) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("Create", fromToken, text);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object Create(java.lang.Integer tokenType, java.lang.String text) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("Create", tokenType, text);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object DupNode(Object treeNode) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("DupNode", treeNode);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object DupNode(java.lang.Integer type, Object treeNode) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("DupNode", type, treeNode);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object DupNode(Object treeNode, java.lang.String text) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("DupNode", treeNode, text);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object DupNode(java.lang.Integer type, Object treeNode, java.lang.String text) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("DupNode", type, treeNode, text);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object DupTree(Object tree) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("DupTree", tree);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object Nil() {
    try {
      Object res = javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor").invoke("Nil");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object ErrorNode(ITokenStream input, IToken start, IToken stop, RecognitionException e) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("ErrorNode", input, start, stop, e);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean IsNil(Object tree) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor").invoke("IsNil", tree);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void AddChild(Object t, Object child) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
          .invoke("AddChild", t, child);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object BecomeRoot(Object newRoot, Object oldRoot) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("BecomeRoot", newRoot, oldRoot);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object RulePostProcessing(Object root) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("RulePostProcessing", root);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer GetUniqueID(Object node) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("GetUniqueID", node);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public Object BecomeRoot(IToken newRoot, Object oldRoot) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("BecomeRoot", newRoot, oldRoot);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer GetType(Object t) {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor").invoke("GetType", t);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void SetType(Object t, java.lang.Integer type) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor").invoke("SetType", t, type);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.String GetText(Object t) {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor").invoke("GetText", t);
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public void SetText(Object t, java.lang.String text) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor").invoke("SetText", t, text);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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

  public void SetTokenBoundaries(Object t, IToken startToken, IToken stopToken) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
          .invoke("SetTokenBoundaries", t, startToken, stopToken);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer GetTokenStartIndex(Object t) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("GetTokenStartIndex", t);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetTokenStopIndex(Object t) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("GetTokenStopIndex", t);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public Object GetChild(Object t, java.lang.Integer i) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("GetChild", t, i);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void SetChild(Object t, java.lang.Integer i, Object child) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
          .invoke("SetChild", t, i, child);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object DeleteChild(Object t, java.lang.Integer i) {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("DeleteChild", t, i);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer GetChildCount(Object t) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("GetChildCount", t);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public Object GetParent(Object t) {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor").invoke("GetParent", t);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void SetParent(Object t, Object parent) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
          .invoke("SetParent", t, parent);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer GetChildIndex(Object t) {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
              .invoke("GetChildIndex", t);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void SetChildIndex(Object t, java.lang.Integer index) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
          .invoke("SetChildIndex", t, index);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
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
          .explicitInterface("Antlr.Runtime.Tree.ITreeAdaptor")
          .invoke("ReplaceChildren", parent, startChildIndex, stopChildIndex, t);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object DupTree(Object t, Object parent) {
    try {
      Object res = javonetHandle.invoke("DupTree", t, parent);
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
