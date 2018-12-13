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

public class AstParserRuleReturnScope<TTree, TToken> extends ParserRuleReturnScope<TToken>
    implements IRuleReturnScopeTLabel<TToken>,
        IRuleReturnScope,
        IAstRuleReturnScopeTAstLabel<TTree>,
        IAstRuleReturnScope {
  protected NObject javonetHandle;
  /** SetProperty */
  public void set_TreeProperty(TTree value) {
    try {
      javonetHandle.invoke("set_Tree", value);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }
  /** GetProperty */

  public TTree get_TreeProperty(Class<?> returnType) {
    try {
      Object res = javonetHandle.invoke("get_Tree");
      if (res == null) return null;
      return (TTree) Convert(res, returnType);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
      return null;
    }
  }
  /** GenericConstructor */

  public AstParserRuleReturnScope(Class<?> TTree, Class<?> TToken) {
    super((NObject) null);
    try {
      javonetHandle =
          Javonet.getType(
                  "Antlr.Runtime.AstParserRuleReturnScope`2",
                  getReturnObjectName(TTree),
                  getReturnObjectName(TToken))
              .create();
      super.setJavonetHandle(javonetHandle);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public AstParserRuleReturnScope(NObject handle) {
    super(handle);
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }
  /** Method */

  public Object get_Tree() {
    try {
      Object res =
          javonetHandle.explicitInterface("Antlr.Runtime.IAstRuleReturnScope").invoke("get_Tree");
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
