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

public class TemplateTreeRuleReturnScope<TTemplate, TTree> extends TreeRuleReturnScope<TTree>
    implements IRuleReturnScopeTLabel<TTree>,
        IRuleReturnScope,
        ITemplateRuleReturnScopeTTemplate<TTemplate>,
        ITemplateRuleReturnScope {
  protected NObject javonetHandle;
  /** SetProperty */
  public void set_TemplateProperty(TTemplate value) {
    try {
      javonetHandle.invoke("set_Template", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TTemplate get_TemplateProperty(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Template");
      if (res == null) return null;
      return (TTemplate) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public TemplateTreeRuleReturnScope(Class<?> TTemplate, Class<?> TTree) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType(
                  "Antlr.Runtime.Tree.TemplateTreeRuleReturnScope`2",
                  getReturnObjectName(TTemplate),
                  getReturnObjectName(TTree))
              .create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public TemplateTreeRuleReturnScope(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Object get_Template() {
    try {
      Object res =
          javonetHandle
              .explicitInterface("Antlr.Runtime.ITemplateRuleReturnScope")
              .invoke("get_Template");
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
