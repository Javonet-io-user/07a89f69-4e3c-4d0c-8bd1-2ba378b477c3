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

public class DFA {
  protected NObject javonetHandle;
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
  /** GetProperty */

  public SpecialStateTransitionHandler getSpecialStateTransition() {
    try {
      Object res = javonetHandle.<NObject>get("SpecialStateTransition");
      if (res == null) return null;
      return ConvertToConcreteInterfaceImplementation(res);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GetFiled */

  public java.lang.Boolean getdebug() {
    try {
      java.lang.Boolean res = javonetHandle.get("debug");
      if (res == null) return false;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return false;
    }
  }
  /** SetFiled */

  public void setdebug(java.lang.Boolean param) {
    try {
      javonetHandle.set("debug", param);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DFA() {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.DFA");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DFA(SpecialStateTransitionHandler specialStateTransition) {
    try {
      javonetHandle = Javonet.New("Antlr.Runtime.DFA", specialStateTransition);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public DFA(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public java.lang.Integer Predict(IIntStream input) {
    try {
      java.lang.Integer res = javonetHandle.invoke("Predict", input);
      if (res == null) return 0;
      return res;
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return 0;
    }
  }
  /** Method */

  public void Error(NoViableAltException nvae) {
    try {
      javonetHandle.invoke("Error", nvae);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** Method */

  public static java.lang.Short[] UnpackEncodedString(
      java.lang.String encodedString, Class<?> returnArrayType) {
    try {
      Object[] res = Javonet.getType("DFA").invoke("UnpackEncodedString", encodedString);
      if (res == null) return null;
      return (java.lang.Short[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** Method */

  public static java.lang.Character[] UnpackEncodedStringToUnsignedChars(
      java.lang.String encodedString, Class<?> returnArrayType) {
    try {
      Object[] res =
          Javonet.getType("DFA").invoke("UnpackEncodedStringToUnsignedChars", encodedString);
      if (res == null) return null;
      return (java.lang.Character[])
          Helper.ConvertNObjectToDestinationType((Object) res, returnArrayType);
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
