package Antlr.Runtime.Debug;

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
import Antlr.Runtime.Debug.*;
import Antlr.Runtime.*;
import jio.System.*;

public interface IDebugEventListener {
  public void Initialize();

  public void EnterRule(java.lang.String grammarFileName, java.lang.String ruleName);

  public void EnterAlt(java.lang.Integer alt);

  public void ExitRule(java.lang.String grammarFileName, java.lang.String ruleName);

  public void EnterSubRule(java.lang.Integer decisionNumber);

  public void ExitSubRule(java.lang.Integer decisionNumber);

  public void EnterDecision(java.lang.Integer decisionNumber, java.lang.Boolean couldBacktrack);

  public void ExitDecision(java.lang.Integer decisionNumber);

  public void ConsumeToken(IToken t);

  public void ConsumeHiddenToken(IToken t);

  public void LT(java.lang.Integer i, IToken t);

  public void Mark(java.lang.Integer marker);

  public void Rewind(java.lang.Integer marker);

  public void Rewind();

  public void BeginBacktrack(java.lang.Integer level);

  public void EndBacktrack(java.lang.Integer level, java.lang.Boolean successful);

  public void Location(java.lang.Integer line, java.lang.Integer pos);

  public void RecognitionException(RecognitionException e);

  public void BeginResync();

  public void EndResync();

  public void SemanticPredicate(java.lang.Boolean result, java.lang.String predicate);

  public void Commence();

  public void Terminate();

  public void ConsumeNode(Object t);

  public void LT(java.lang.Integer i, Object t);

  public void NilNode(Object t);

  public void ErrorNode(Object t);

  public void CreateNode(Object t);

  public void CreateNode(Object node, IToken token);

  public void BecomeRoot(Object newRoot, Object oldRoot);

  public void AddChild(Object root, Object child);

  public void SetTokenBoundaries(
      Object t, java.lang.Integer tokenStartIndex, java.lang.Integer tokenStopIndex);
}
