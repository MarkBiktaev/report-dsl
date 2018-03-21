/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDsl.BooleanLiteral;
import org.xtext.example.mydsl.rDsl.IntLiteral;
import org.xtext.example.mydsl.rDsl.PageBreak;
import org.xtext.example.mydsl.rDsl.PageBreakValue;
import org.xtext.example.mydsl.rDsl.RDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Break</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PageBreakImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PageBreakImpl#getAfter <em>After</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PageBreakImpl#getInside <em>Inside</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PageBreakImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PageBreakImpl#getRepeat <em>Repeat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PageBreakImpl extends MinimalEObjectImpl.Container implements PageBreak
{
  /**
   * The default value of the '{@link #getBefore() <em>Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBefore()
   * @generated
   * @ordered
   */
  protected static final PageBreakValue BEFORE_EDEFAULT = PageBreakValue.AUTO;

  /**
   * The cached value of the '{@link #getBefore() <em>Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBefore()
   * @generated
   * @ordered
   */
  protected PageBreakValue before = BEFORE_EDEFAULT;

  /**
   * The default value of the '{@link #getAfter() <em>After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfter()
   * @generated
   * @ordered
   */
  protected static final PageBreakValue AFTER_EDEFAULT = PageBreakValue.AUTO;

  /**
   * The cached value of the '{@link #getAfter() <em>After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfter()
   * @generated
   * @ordered
   */
  protected PageBreakValue after = AFTER_EDEFAULT;

  /**
   * The default value of the '{@link #getInside() <em>Inside</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInside()
   * @generated
   * @ordered
   */
  protected static final PageBreakValue INSIDE_EDEFAULT = PageBreakValue.AUTO;

  /**
   * The cached value of the '{@link #getInside() <em>Inside</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInside()
   * @generated
   * @ordered
   */
  protected PageBreakValue inside = INSIDE_EDEFAULT;

  /**
   * The cached value of the '{@link #getInterval() <em>Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
  protected IntLiteral interval;

  /**
   * The cached value of the '{@link #getRepeat() <em>Repeat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRepeat()
   * @generated
   * @ordered
   */
  protected BooleanLiteral repeat;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageBreakImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return RDslPackage.eINSTANCE.getPageBreak();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageBreakValue getBefore()
  {
    return before;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBefore(PageBreakValue newBefore)
  {
    PageBreakValue oldBefore = before;
    before = newBefore == null ? BEFORE_EDEFAULT : newBefore;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_BREAK__BEFORE, oldBefore, before));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageBreakValue getAfter()
  {
    return after;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAfter(PageBreakValue newAfter)
  {
    PageBreakValue oldAfter = after;
    after = newAfter == null ? AFTER_EDEFAULT : newAfter;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_BREAK__AFTER, oldAfter, after));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageBreakValue getInside()
  {
    return inside;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInside(PageBreakValue newInside)
  {
    PageBreakValue oldInside = inside;
    inside = newInside == null ? INSIDE_EDEFAULT : newInside;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_BREAK__INSIDE, oldInside, inside));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntLiteral getInterval()
  {
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInterval(IntLiteral newInterval, NotificationChain msgs)
  {
    IntLiteral oldInterval = interval;
    interval = newInterval;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_BREAK__INTERVAL, oldInterval, newInterval);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterval(IntLiteral newInterval)
  {
    if (newInterval != interval)
    {
      NotificationChain msgs = null;
      if (interval != null)
        msgs = ((InternalEObject)interval).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_BREAK__INTERVAL, null, msgs);
      if (newInterval != null)
        msgs = ((InternalEObject)newInterval).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_BREAK__INTERVAL, null, msgs);
      msgs = basicSetInterval(newInterval, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_BREAK__INTERVAL, newInterval, newInterval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getRepeat()
  {
    return repeat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRepeat(BooleanLiteral newRepeat, NotificationChain msgs)
  {
    BooleanLiteral oldRepeat = repeat;
    repeat = newRepeat;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_BREAK__REPEAT, oldRepeat, newRepeat);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRepeat(BooleanLiteral newRepeat)
  {
    if (newRepeat != repeat)
    {
      NotificationChain msgs = null;
      if (repeat != null)
        msgs = ((InternalEObject)repeat).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_BREAK__REPEAT, null, msgs);
      if (newRepeat != null)
        msgs = ((InternalEObject)newRepeat).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_BREAK__REPEAT, null, msgs);
      msgs = basicSetRepeat(newRepeat, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_BREAK__REPEAT, newRepeat, newRepeat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case RDslPackage.PAGE_BREAK__INTERVAL:
        return basicSetInterval(null, msgs);
      case RDslPackage.PAGE_BREAK__REPEAT:
        return basicSetRepeat(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case RDslPackage.PAGE_BREAK__BEFORE:
        return getBefore();
      case RDslPackage.PAGE_BREAK__AFTER:
        return getAfter();
      case RDslPackage.PAGE_BREAK__INSIDE:
        return getInside();
      case RDslPackage.PAGE_BREAK__INTERVAL:
        return getInterval();
      case RDslPackage.PAGE_BREAK__REPEAT:
        return getRepeat();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RDslPackage.PAGE_BREAK__BEFORE:
        setBefore((PageBreakValue)newValue);
        return;
      case RDslPackage.PAGE_BREAK__AFTER:
        setAfter((PageBreakValue)newValue);
        return;
      case RDslPackage.PAGE_BREAK__INSIDE:
        setInside((PageBreakValue)newValue);
        return;
      case RDslPackage.PAGE_BREAK__INTERVAL:
        setInterval((IntLiteral)newValue);
        return;
      case RDslPackage.PAGE_BREAK__REPEAT:
        setRepeat((BooleanLiteral)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case RDslPackage.PAGE_BREAK__BEFORE:
        setBefore(BEFORE_EDEFAULT);
        return;
      case RDslPackage.PAGE_BREAK__AFTER:
        setAfter(AFTER_EDEFAULT);
        return;
      case RDslPackage.PAGE_BREAK__INSIDE:
        setInside(INSIDE_EDEFAULT);
        return;
      case RDslPackage.PAGE_BREAK__INTERVAL:
        setInterval((IntLiteral)null);
        return;
      case RDslPackage.PAGE_BREAK__REPEAT:
        setRepeat((BooleanLiteral)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case RDslPackage.PAGE_BREAK__BEFORE:
        return before != BEFORE_EDEFAULT;
      case RDslPackage.PAGE_BREAK__AFTER:
        return after != AFTER_EDEFAULT;
      case RDslPackage.PAGE_BREAK__INSIDE:
        return inside != INSIDE_EDEFAULT;
      case RDslPackage.PAGE_BREAK__INTERVAL:
        return interval != null;
      case RDslPackage.PAGE_BREAK__REPEAT:
        return repeat != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (before: ");
    result.append(before);
    result.append(", after: ");
    result.append(after);
    result.append(", inside: ");
    result.append(inside);
    result.append(')');
    return result.toString();
  }

} //PageBreakImpl
