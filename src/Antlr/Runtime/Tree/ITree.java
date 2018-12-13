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

public interface ITree {
  public ITree GetChild(java.lang.Integer i);

  public java.lang.Boolean HasAncestor(java.lang.Integer ttype);

  public ITree GetAncestor(java.lang.Integer ttype);

  public IList<ITree> GetAncestors();

  public void FreshenParentAndChildIndexes();

  public void AddChild(ITree t);

  public void SetChild(java.lang.Integer i, ITree t);

  public Object DeleteChild(java.lang.Integer i);

  public void ReplaceChildren(
      java.lang.Integer startChildIndex, java.lang.Integer stopChildIndex, Object t);

  public ITree DupNode();

  public java.lang.String ToStringTree();

  public java.lang.String ToString();
}
