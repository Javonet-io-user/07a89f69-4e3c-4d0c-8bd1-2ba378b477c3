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

public interface ITreeAdaptor {
  public Object Create(IToken payload);

  public Object Create(java.lang.Integer tokenType, IToken fromToken);

  public Object Create(java.lang.Integer tokenType, IToken fromToken, java.lang.String text);

  public Object Create(IToken fromToken, java.lang.String text);

  public Object Create(java.lang.Integer tokenType, java.lang.String text);

  public Object DupNode(Object treeNode);

  public Object DupNode(java.lang.Integer type, Object treeNode);

  public Object DupNode(Object treeNode, java.lang.String text);

  public Object DupNode(java.lang.Integer type, Object treeNode, java.lang.String text);

  public Object DupTree(Object tree);

  public Object Nil();

  public Object ErrorNode(ITokenStream input, IToken start, IToken stop, RecognitionException e);

  public java.lang.Boolean IsNil(Object tree);

  public void AddChild(Object t, Object child);

  public Object BecomeRoot(Object newRoot, Object oldRoot);

  public Object RulePostProcessing(Object root);

  public java.lang.Integer GetUniqueID(Object node);

  public Object BecomeRoot(IToken newRoot, Object oldRoot);

  public java.lang.Integer GetType(Object t);

  public void SetType(Object t, java.lang.Integer type);

  public java.lang.String GetText(Object t);

  public void SetText(Object t, java.lang.String text);

  public IToken GetToken(Object t);

  public void SetTokenBoundaries(Object t, IToken startToken, IToken stopToken);

  public java.lang.Integer GetTokenStartIndex(Object t);

  public java.lang.Integer GetTokenStopIndex(Object t);

  public Object GetChild(Object t, java.lang.Integer i);

  public void SetChild(Object t, java.lang.Integer i, Object child);

  public Object DeleteChild(Object t, java.lang.Integer i);

  public java.lang.Integer GetChildCount(Object t);

  public Object GetParent(Object t);

  public void SetParent(Object t, Object parent);

  public java.lang.Integer GetChildIndex(Object t);

  public void SetChildIndex(Object t, java.lang.Integer index);

  public void ReplaceChildren(
      Object parent, java.lang.Integer startChildIndex, java.lang.Integer stopChildIndex, Object t);
}
