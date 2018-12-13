package Antlr.Runtime.Misc;

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
import Antlr.Runtime.Misc.*;
import jio.System.Collections.Generic.*;
import jio.System.Collections.*;

public class ListStack<T> extends List<T>
    implements jio.System.Collections.Generic.IList<T>,
        jio.System.Collections.Generic.ICollection<T>,
        jio.System.Collections.Generic.IEnumerable<T>,
        jio.System.Collections.IEnumerable,
        jio.System.Collections.IList,
        jio.System.Collections.ICollection,
        IReadOnlyList<T>,
        IReadOnlyCollection<T> {
  protected NObject javonetHandle;
  /** GenericConstructor */
  public ListStack(Class<?> T) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType("Antlr.Runtime.Misc.ListStack`1", getReturnObjectName(T)).create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public ListStack(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public T Peek(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("Peek");
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public T Peek(java.lang.Integer depth, Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("Peek", depth);
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean TryPeek(T item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("TryPeek", item);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean TryPeek(java.lang.Integer depth, T item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("TryPeek", depth, item);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public T Pop(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("Pop");
      if (res == null) return null;
      return (T) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.Boolean TryPop(T item) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("TryPop", item);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Push(T item) {
    try {
      javonetHandle.invoke("Push", item);
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
