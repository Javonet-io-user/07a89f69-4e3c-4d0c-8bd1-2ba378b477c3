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

public class CommonTree extends BaseTree implements ITree {
  protected NObject javonetHandle;
  /** SetProperty */
  public void setCharPositionInLineAsCommonTree(java.lang.Integer value) {
    try {
      javonetHandle.set("CharPositionInLine", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getCharPositionInLineAsCommonTree() {
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
  /** SetProperty */

  public void setChildIndexAsCommonTree(java.lang.Integer value) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("set_ChildIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getChildIndexAsCommonTree() {
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

  public java.lang.Boolean getIsNilAsCommonTree() {
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

  public void setLineAsCommonTree(java.lang.Integer value) {
    try {
      javonetHandle.set("Line", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getLineAsCommonTree() {
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

  public void setParentAsCommonTree(ITree value) {
    try {
      javonetHandle.explicitInterface("Antlr.Runtime.Tree.ITree").invoke("set_Parent", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public ITree getParentAsCommonTree() {
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

  public void setTextAsCommonTree(java.lang.String value) {
    try {
      javonetHandle.set("Text", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.String getTextAsCommonTree() {
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

  public void setToken(IToken value) {
    try {
      javonetHandle.set("Token", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public IToken getToken() {
    try {
      Object res = javonetHandle.<NObject>get("Token");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetProperty */

  public void setTokenStartIndexAsCommonTree(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITree")
          .invoke("set_TokenStartIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getTokenStartIndexAsCommonTree() {
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

  public void setTokenStopIndexAsCommonTree(java.lang.Integer value) {
    try {
      javonetHandle
          .explicitInterface("Antlr.Runtime.Tree.ITree")
          .invoke("set_TokenStopIndex", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getTokenStopIndexAsCommonTree() {
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

  public void setTypeAsCommonTree(java.lang.Integer value) {
    try {
      javonetHandle.set("Type", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public java.lang.Integer getTypeAsCommonTree() {
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

  public CommonTree() {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.CommonTree");
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommonTree(CommonTree node) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.CommonTree", node);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommonTree(IToken t) {
    super((NObject) null);
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.CommonTree", t);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public CommonTree(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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

  public void SetUnknownTokenBoundaries() {
    try {
      javonetHandle.invoke("SetUnknownTokenBoundaries");
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
