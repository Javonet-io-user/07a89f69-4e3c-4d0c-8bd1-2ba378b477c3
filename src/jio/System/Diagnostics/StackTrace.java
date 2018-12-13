package jio.System.Diagnostics;

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
import jio.System.Diagnostics.*;
import jio.System.*;
import jio.System.Threading.*;

public class StackTrace {
  public NObject javonetHandle;

  public StackTrace() {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackTrace");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackTrace(java.lang.Boolean fNeedFileInfo) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackTrace", fNeedFileInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackTrace(java.lang.Integer skipFrames) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackTrace", skipFrames);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackTrace(java.lang.Integer skipFrames, java.lang.Boolean fNeedFileInfo) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackTrace", skipFrames, fNeedFileInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackTrace(jio.System.Exception e) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackTrace", e);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackTrace(jio.System.Exception e, java.lang.Boolean fNeedFileInfo) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackTrace", e, fNeedFileInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackTrace(jio.System.Exception e, java.lang.Integer skipFrames) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackTrace", e, skipFrames);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackTrace(
      jio.System.Exception e, java.lang.Integer skipFrames, java.lang.Boolean fNeedFileInfo) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackTrace", e, skipFrames, fNeedFileInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackTrace(StackFrame frame) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackTrace", frame);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackTrace(jio.System.Threading.Thread targetThread, java.lang.Boolean needFileInfo) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackTrace", targetThread, needFileInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackTrace(NObject handle) {
    this.javonetHandle = handle;
  }

  public void setJavonetHandle(NObject handle) {
    this.javonetHandle = handle;
  }

  static {
    try {
      Activation.initializeJavonet();
    } catch (java.lang.Exception e) {
      e.printStackTrace();
    }
  }
}
