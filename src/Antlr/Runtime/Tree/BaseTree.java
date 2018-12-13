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
import jio.System.Collections.Generic.*;
import jio.System.*;

public abstract class BaseTree implements ITree {
  protected NObject javonetHandle;
  /** GetProperty */
  public IList<ITree> getChildren() {
    try {
      Object res = javonetHandle.<NObject>get("Children");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetProperty */

  public java.lang.Integer getChildCount() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_ChildCount");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setParent(ITree value) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("set_Parent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ITree getParent() {
    try {
      Object res = javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_Parent");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setChildIndex(java.lang.Integer value) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("set_ChildIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getChildIndex() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_ChildIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.Boolean getIsNil() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_IsNil");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetProperty */

  public void setTokenStartIndex(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITree")
          .invoke("set_TokenStartIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getTokenStartIndex() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_TokenStartIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setTokenStopIndex(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITree")
          .invoke("set_TokenStopIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getTokenStopIndex() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_TokenStopIndex");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setType(java.lang.Integer value) {
    try {
      javonetHandle.set("Type", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getType() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_Type");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setText(java.lang.String value) {
    try {
      javonetHandle.set("Text", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getText() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_Text");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** SetProperty */

  public void setLine(java.lang.Integer value) {
    try {
      javonetHandle.set("Line", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getLine() {
    try {
      java.lang.Integer res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("get_Line");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** SetProperty */

  public void setCharPositionInLine(java.lang.Integer value) {
    try {
      javonetHandle.set("CharPositionInLine", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getCharPositionInLine() {
    try {
      java.lang.Integer res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.Tree.ITree")
              .invoke("get_CharPositionInLine");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }

  public BaseTree() {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.BaseTree");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseTree(ITree node) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.BaseTree", node);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BaseTree(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public ITree GetChild(java.lang.Integer i) {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("GetChild", i);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean HasAncestor(java.lang.Integer ttype) {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("HasAncestor", ttype);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public ITree GetAncestor(java.lang.Integer ttype) {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("GetAncestor", ttype);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public IList<ITree> GetAncestors() {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("GetAncestors");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void FreshenParentAndChildIndexes() {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITree")
          .invoke("FreshenParentAndChildIndexes");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void AddChild(ITree t) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("AddChild", t);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SetChild(java.lang.Integer i, ITree t) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("SetChild", i, t);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object DeleteChild(java.lang.Integer i) {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("DeleteChild", i);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void ReplaceChildren(
      java.lang.Integer startChildIndex, java.lang.Integer stopChildIndex, Object t) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITree")
          .invoke("ReplaceChildren", startChildIndex, stopChildIndex, t);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public ITree DupNode() {
    try {
      Object res = javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("DupNode");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String ToStringTree() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("ToStringTree");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      java.lang.String res =
          javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public ITree GetFirstChildWithType(java.lang.Integer type) {
    try {
      Object res = javonetHandle.invoke("GetFirstChildWithType", type);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void AddChildren(IEnumerable<ITree> kids) {
    try {
      javonetHandle.invoke("AddChildren", kids);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void InsertChild(java.lang.Integer i, ITree t) {
    try {
      javonetHandle.invoke("InsertChild", i, t);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void FreshenParentAndChildIndexes(java.lang.Integer offset) {
    try {
      javonetHandle.invoke("FreshenParentAndChildIndexes", offset);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void FreshenParentAndChildIndexesDeeply() {
    try {
      javonetHandle.invoke("FreshenParentAndChildIndexesDeeply");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void FreshenParentAndChildIndexesDeeply(java.lang.Integer offset) {
    try {
      javonetHandle.invoke("FreshenParentAndChildIndexesDeeply", offset);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SanityCheckParentAndChildIndexes() {
    try {
      javonetHandle.invoke("SanityCheckParentAndChildIndexes");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void SanityCheckParentAndChildIndexes(ITree parent, java.lang.Integer i) {
    try {
      javonetHandle.invoke("SanityCheckParentAndChildIndexes", parent, i);
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
