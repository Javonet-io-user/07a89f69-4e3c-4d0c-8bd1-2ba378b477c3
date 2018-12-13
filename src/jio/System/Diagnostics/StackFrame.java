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

public class StackFrame {
  public NObject javonetHandle;

  public StackFrame() {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackFrame");
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackFrame(java.lang.Boolean fNeedFileInfo) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackFrame", fNeedFileInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackFrame(java.lang.Integer skipFrames) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackFrame", skipFrames);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackFrame(java.lang.Integer skipFrames, java.lang.Boolean fNeedFileInfo) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackFrame", skipFrames, fNeedFileInfo);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackFrame(java.lang.String fileName, java.lang.Integer lineNumber) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackFrame", fileName, lineNumber);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackFrame(
      java.lang.String fileName, java.lang.Integer lineNumber, java.lang.Integer colNumber) {
    try {
      javonetHandle = Javonet.New("System.Diagnostics.StackFrame", fileName, lineNumber, colNumber);
    } catch (JavonetException _javonetException) {
      _javonetException.printStackTrace();
    }
  }

  public StackFrame(NObject handle) {
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
