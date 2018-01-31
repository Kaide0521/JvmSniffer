package org.jdiscript.handlers;

import com.sun.jdi.VirtualMachine;
import com.sun.jdi.event.AccessWatchpointEvent;
import com.sun.jdi.event.BreakpointEvent;
import com.sun.jdi.event.ClassPrepareEvent;
import com.sun.jdi.event.ClassUnloadEvent;
import com.sun.jdi.event.Event;
import com.sun.jdi.event.ExceptionEvent;
import com.sun.jdi.event.LocatableEvent;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;
import com.sun.jdi.event.ModificationWatchpointEvent;
import com.sun.jdi.event.MonitorContendedEnterEvent;
import com.sun.jdi.event.MonitorContendedEnteredEvent;
import com.sun.jdi.event.MonitorWaitEvent;
import com.sun.jdi.event.MonitorWaitedEvent;
import com.sun.jdi.event.StepEvent;
import com.sun.jdi.event.ThreadDeathEvent;
import com.sun.jdi.event.ThreadStartEvent;
import com.sun.jdi.event.VMDeathEvent;
import com.sun.jdi.event.VMDisconnectEvent;
import com.sun.jdi.event.VMStartEvent;
import com.sun.jdi.event.WatchpointEvent;

import org.jdiscript.events.UnhandledEventException;

/**
 * Each handler method for requested events delegates to unhandledEvent(),
 * which throws an UnhandledEventException.  Handler methods for unrequested
 * events do nothing.
 *
 * This class is intended to be subclassed.
 *
 * @author jfager
 */
public class BaseEventHandler
    implements OnAccessWatchpoint, OnBreakpoint, OnClassPrepare,
    OnClassUnload, OnEvent, OnException, OnLocatable,
    OnMethodEntry, OnMethodExit, OnModificationWatchpoint,
    OnMonitorContendedEnter, OnMonitorContendedEntered,
    OnMonitorWait, OnMonitorWaited, OnStep, OnThreadDeath,
    OnThreadStart, OnVMDeath, OnVMDisconnect, OnVMStart,
    OnWatchpoint {

  private VirtualMachine vm;

  public void setVM(VirtualMachine vm) {
    this.vm = vm;
  }

  public VirtualMachine vm() {
    return vm;
  }

  public void notifySuspendPolicy(int suspendPolicy) {
    // do nothing
  }

  public void accessWatchpoint(AccessWatchpointEvent e) {
    unhandledEvent(e);
  }

  public void breakpoint(BreakpointEvent e) {
    unhandledEvent(e);
  }

  public void classPrepare(ClassPrepareEvent e) {
    unhandledEvent(e);
  }

  public void classUnload(ClassUnloadEvent e) {
    unhandledEvent(e);
  }

  public void event(Event e) {
    unhandledEvent(e);
  }

  public void exception(ExceptionEvent e) {
    unhandledEvent(e);
  }

  public void locatable(LocatableEvent e) {
    unhandledEvent(e);
  }

  public void methodEntry(MethodEntryEvent e) {
    unhandledEvent(e);
  }

  public void methodExit(MethodExitEvent e) {
    unhandledEvent(e);
  }

  public void modificationWatchpoint(ModificationWatchpointEvent e) {
    unhandledEvent(e);
  }

  public void monitorContendedEnter(MonitorContendedEnterEvent e) {
    unhandledEvent(e);
  }

  public void monitorContendedEntered(MonitorContendedEnteredEvent e) {
    unhandledEvent(e);
  }

  public void monitorWait(MonitorWaitEvent e) {
    unhandledEvent(e);
  }

  public void monitorWaited(MonitorWaitedEvent e) {
    unhandledEvent(e);
  }

  public void step(StepEvent e) {
    unhandledEvent(e);
  }

  public void threadDeath(ThreadDeathEvent e) {
    unhandledEvent(e);
  }

  public void threadStart(ThreadStartEvent e) {
    unhandledEvent(e);
  }

  public void vmDeath(VMDeathEvent e) {
    //do nothing
  }

  public void vmDisconnect(VMDisconnectEvent e) {
    //do nothing
  }

  public void vmStart(VMStartEvent e) {
    //do nothing
  }

  public void watchpoint(WatchpointEvent e) {
    unhandledEvent(e);
  }

  public void unhandledEvent(Event e) {
    throw new UnhandledEventException(e);
  }
}
