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
import jio.System.Collections.*;

public abstract class RewriteRuleElementStream {
  protected NObject javonetHandle;
  /** GetProperty */
  public java.lang.Boolean getHasNext() {
    try {
      java.lang.Boolean res = javonetHandle.get("HasNext");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** GetProperty */

  public java.lang.Integer getCount() {
    try {
      java.lang.Integer res = javonetHandle.get("Count");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** GetProperty */

  public java.lang.String getDescription() {
    try {
      java.lang.String res = javonetHandle.get("Description");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }

  public RewriteRuleElementStream(ITreeAdaptor adaptor, java.lang.String elementDescription) {
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.Tree.RewriteRuleElementStream", adaptor, elementDescription);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RewriteRuleElementStream(
      ITreeAdaptor adaptor, java.lang.String elementDescription, Object oneElement) {
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.Tree.RewriteRuleElementStream",
              adaptor,
              elementDescription,
              oneElement);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RewriteRuleElementStream(
      ITreeAdaptor adaptor, java.lang.String elementDescription, IList elements) {
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.Tree.RewriteRuleElementStream", adaptor, elementDescription, elements);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RewriteRuleElementStream(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
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

  public void Add(Object el) {
    try {
      javonetHandle.invoke("Add", el);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public Object NextTree() {
    try {
      Object res = javonetHandle.invoke("NextTree");
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
