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
import jio.System.Collections.*;
import Antlr.Runtime.*;

public class TreeWizard {
  protected NObject javonetHandle;

  public TreeWizard(ITreeAdaptor adaptor) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeWizard", adaptor);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeWizard(
      ITreeAdaptor adaptor, IDictionary<java.lang.String, java.lang.Integer> tokenNameToTypeMap) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeWizard", adaptor, tokenNameToTypeMap);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeWizard(ITreeAdaptor adaptor, java.lang.String[] tokenNames) {
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.Tree.TreeWizard", adaptor, new Object[] {tokenNames});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeWizard(java.lang.String[] tokenNames) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeWizard", new Object[] {tokenNames});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeWizard(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public IDictionary<java.lang.String, java.lang.Integer> ComputeTokenTypes(
      java.lang.String[] tokenNames) {
    try {
      Object res = javonetHandle.invoke("ComputeTokenTypes", new Object[] {tokenNames});
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Integer GetTokenType(java.lang.String tokenName) {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetTokenType", tokenName);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public IDictionary<java.lang.Integer, jio.System.Collections.IList> Index(Object t) {
    try {
      Object res = javonetHandle.invoke("Index", t);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.IList Find(Object t, java.lang.Integer ttype) {
    try {
      Object res = javonetHandle.invoke("Find", t, ttype);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public jio.System.Collections.IList Find(Object t, java.lang.String pattern) {
    try {
      Object res = javonetHandle.invoke("Find", t, pattern);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object FindFirst(Object t, java.lang.Integer ttype) {
    try {
      Object res = javonetHandle.invoke("FindFirst", t, ttype);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public Object FindFirst(Object t, java.lang.String pattern) {
    try {
      Object res = javonetHandle.invoke("FindFirst", t, pattern);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Visit(Object t, java.lang.Integer ttype, IContextVisitor visitor) {
    try {
      javonetHandle.invoke("Visit", t, ttype, visitor);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Visit(Object t, java.lang.Integer ttype, Action<Object> action) {
    try {
      javonetHandle.invoke("Visit", t, ttype, action);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void Visit(Object t, java.lang.String pattern, IContextVisitor visitor) {
    try {
      javonetHandle.invoke("Visit", t, pattern, visitor);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean Parse(
      Object t, java.lang.String pattern, IDictionary<java.lang.String, Object> labels) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Parse", t, pattern, labels);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean Parse(Object t, java.lang.String pattern) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Parse", t, pattern);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public Object Create(java.lang.String pattern) {
    try {
      Object res = javonetHandle.invoke("Create", pattern);
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.Boolean Equals(Object t1, Object t2, ITreeAdaptor adaptor) {
    try {
      java.lang.Boolean res = Javonet.getType("TreeWizard").invoke("Equals", t1, t2, adaptor);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean Equals(Object t1, Object t2) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", t1, t2);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }

  public abstract static class IContextVisitor {
    protected NObject javonetHandle;

    public IContextVisitor(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public void Visit(
        Object t,
        Object parent,
        java.lang.Integer childIndex,
        IDictionary<java.lang.String, Object> labels) {
      try {
        javonetHandle.invoke("Visit", t, parent, childIndex, labels);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
  }

  public abstract static class Visitor {
    protected NObject javonetHandle;

    public Visitor(NObject handle) {
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
    /** Method */

    public void Visit(
        Object t,
        Object parent,
        java.lang.Integer childIndex,
        IDictionary<java.lang.String, Object> labels) {
      try {
        javonetHandle
            .explicitInterface("Antlr.Runtime.Tree.IContextVisitor")
            .invoke("Visit", t, parent, childIndex, labels);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** Method */

    public void Visit(Object t) {
      try {
        javonetHandle.invoke("Visit", t);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
  }

  public static class TreePattern extends CommonTree implements ITree {
    protected NObject javonetHandle;
    /** GetFiled */
    public java.lang.String getlabel() {
      try {
        java.lang.String res = javonetHandle.get("label");
        if (res == null) return "";
        return (java.lang.String) res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return "";
      }
    }
    /** SetFiled */

    public void setlabel(java.lang.String param) {
      try {
        javonetHandle.set("label", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }
    /** GetFiled */

    public java.lang.Boolean gethasTextArg() {
      try {
        java.lang.Boolean res = javonetHandle.get("hasTextArg");
        if (res == null) return false;
        return res;
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
        return false;
      }
    }
    /** SetFiled */

    public void sethasTextArg(java.lang.Boolean param) {
      try {
        javonetHandle.set("hasTextArg", param);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public TreePattern(IToken payload) {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeWizard+TreePattern", payload);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public TreePattern(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
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
  }

  public static class WildcardTreePattern extends TreeWizard.TreePattern implements ITree {
    protected NObject javonetHandle;

    public WildcardTreePattern(IToken payload) {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeWizard+WildcardTreePattern", payload);
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public WildcardTreePattern(NObject handle) {
      super(handle);
      this.javonetHandle = handle;
    }

    public void setJavonetHandle(NObject handle) {
      this.javonetHandle = handle;
    }
  }

  public static class TreePatternTreeAdaptor extends CommonTreeAdaptor implements ITreeAdaptor {
    protected NObject javonetHandle;

    public TreePatternTreeAdaptor() {
      super((NObject) null);
      try {
        javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeWizard+TreePatternTreeAdaptor");
        super.setJavonetHandle(javonetHandle);
      } catch (JavonetException _javonetException) {
        _javonetException.printStackTrace();
      }
    }

    public TreePatternTreeAdaptor(NObject handle) {
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
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
