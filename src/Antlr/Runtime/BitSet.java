package Antlr.Runtime;

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
import Antlr.Runtime.*;
import jio.System.*;
import jio.System.Collections.Generic.*;

public class BitSet implements ICloneable {
  protected NObject javonetHandle;

  public BitSet() {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.BitSet");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BitSet(java.math.BigInteger[] bits) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.BitSet", new Object[] {bits});
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BitSet(IEnumerable<java.lang.Integer> items) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.BitSet", items);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BitSet(java.lang.Integer nbits) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.BitSet", nbits);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public BitSet(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Object Clone() {
    try {
      Object res = javonetHandle.explicitInterface("jio.System.ICloneable").invoke("Clone");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BitSet Of(java.lang.Integer el) {
    try {
      Object res = Javonet.getType("BitSet").invoke("Of", el);
      if (res == null) return null;
      return new BitSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BitSet Of(java.lang.Integer a, java.lang.Integer b) {
    try {
      Object res = Javonet.getType("BitSet").invoke("Of", a, b);
      if (res == null) return null;
      return new BitSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BitSet Of(java.lang.Integer a, java.lang.Integer b, java.lang.Integer c) {
    try {
      Object res = Javonet.getType("BitSet").invoke("Of", a, b, c);
      if (res == null) return null;
      return new BitSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static BitSet Of(
      java.lang.Integer a, java.lang.Integer b, java.lang.Integer c, java.lang.Integer d) {
    try {
      Object res = Javonet.getType("BitSet").invoke("Of", a, b, c, d);
      if (res == null) return null;
      return new BitSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public BitSet Or(BitSet a) {
    try {
      Object res = javonetHandle.invoke("Or", a);
      if (res == null) return null;
      return new BitSet((NObject) res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public void Add(java.lang.Integer el) {
    try {
      javonetHandle.invoke("Add", el);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void GrowToInclude(java.lang.Integer bit) {
    try {
      javonetHandle.invoke("GrowToInclude", bit);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public void OrInPlace(BitSet a) {
    try {
      javonetHandle.invoke("OrInPlace", a);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Integer Size() {
    try {
      java.lang.Integer res = javonetHandle.invoke("Size");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer GetHashCode() {
    try {
      java.lang.Integer res = javonetHandle.invoke("GetHashCode");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Boolean Equals(Object other) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Equals", other);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Boolean Member(java.lang.Integer el) {
    try {
      java.lang.Boolean res = javonetHandle.invoke("Member", el);
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public void Remove(java.lang.Integer el) {
    try {
      javonetHandle.invoke("Remove", el);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public java.lang.Boolean IsNil() {
    try {
      java.lang.Boolean res = javonetHandle.invoke("IsNil");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** Method */

  public java.lang.Integer NumBits() {
    try {
      java.lang.Integer res = javonetHandle.invoke("NumBits");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer LengthInLongWords() {
    try {
      java.lang.Integer res = javonetHandle.invoke("LengthInLongWords");
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public java.lang.Integer[] ToArray(Class<?> returnArrayType) {
    try {
      Object[] res = javonetHandle.invoke("ToArray");
      if (res == null) return null;
      return (java.lang.Integer[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public java.lang.String ToString() {
    try {
      java.lang.String res = javonetHandle.invoke("ToString");
      if (res == null) return "";
      return (java.lang.String) res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return "";
    }
  }
  /** Method */

  public java.lang.String ToString(java.lang.String[] tokenNames) {
    try {
      java.lang.String res = javonetHandle.invoke("ToString", new Object[] {tokenNames});
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
