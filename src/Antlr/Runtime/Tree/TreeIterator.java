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
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public class TreeIterator
    implements jio.System.Collections.Generic.IEnumerator<Object>,
        IDisposable,
        jio.System.Collections.IEnumerator {
  protected NObject javonetHandle;
  /** GetProperty */
  public Object getCurrent() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("jio.System.Collections.IEnumerator")
              .invoke("get_Current");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public Object getup() {
    try {
      Object res = javonetHandle.<NObject>get("up");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setup(Object param) {
    try {
      javonetHandle.set("up", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public Object getdown() {
    try {
      Object res = javonetHandle.<NObject>get("down");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void setdown(Object param) {
    try {
      javonetHandle.set("down", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetFiled */

  public Object geteof() {
    try {
      Object res = javonetHandle.<NObject>get("eof");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** SetFiled */

  public void seteof(Object param) {
    try {
      javonetHandle.set("eof", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeIterator(CommonTree tree) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeIterator", tree);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeIterator(ITreeAdaptor adaptor, Object tree) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.Tree.TreeIterator", adaptor, tree);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TreeIterator(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public void Dispose() {
    try {
      javonetHandle.explicitInterface("jio.System.IDisposable").invoke("Dispose");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean MoveNext() {
    try {
      java.lang.Boolean res =
          javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("MoveNext");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Reset() {
    try {
      javonetHandle.explicitInterface("jio.System.Collections.IEnumerator").invoke("Reset");
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
