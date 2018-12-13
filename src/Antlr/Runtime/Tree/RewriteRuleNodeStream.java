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

public class RewriteRuleNodeStream extends RewriteRuleElementStream {
  protected NObject javonetHandle;

  public RewriteRuleNodeStream(ITreeAdaptor adaptor, java.lang.String elementDescription) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New("Antlr.Runtime.Tree.RewriteRuleNodeStream", adaptor, elementDescription);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RewriteRuleNodeStream(
      ITreeAdaptor adaptor, java.lang.String elementDescription, Object oneElement) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.Tree.RewriteRuleNodeStream", adaptor, elementDescription, oneElement);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RewriteRuleNodeStream(
      ITreeAdaptor adaptor, java.lang.String elementDescription, IList elements) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.New(
              "Antlr.Runtime.Tree.RewriteRuleNodeStream", adaptor, elementDescription, elements);
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public RewriteRuleNodeStream(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Object NextNode() {
    try {
      Object res = javonetHandle.invoke("NextNode");
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
