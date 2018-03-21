/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDsl.BorderLine;
import org.xtext.example.mydsl.rDsl.BorderSide;
import org.xtext.example.mydsl.rDsl.RDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Border Side</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.BorderSideImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.BorderSideImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.BorderSideImpl#getTop <em>Top</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.BorderSideImpl#getBottom <em>Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BorderSideImpl extends MinimalEObjectImpl.Container implements BorderSide
{
  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected BorderLine right;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected BorderLine left;

  /**
   * The cached value of the '{@link #getTop() <em>Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTop()
   * @generated
   * @ordered
   */
  protected BorderLine top;

  /**
   * The cached value of the '{@link #getBottom() <em>Bottom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBottom()
   * @generated
   * @ordered
   */
  protected BorderLine bottom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BorderSideImpl()
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
    return RDslPackage.eINSTANCE.getBorderSide();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderLine getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(BorderLine newRight, NotificationChain msgs)
  {
    BorderLine oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.BORDER_SIDE__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(BorderLine newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.BORDER_SIDE__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.BORDER_SIDE__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.BORDER_SIDE__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderLine getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(BorderLine newLeft, NotificationChain msgs)
  {
    BorderLine oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.BORDER_SIDE__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(BorderLine newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.BORDER_SIDE__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.BORDER_SIDE__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.BORDER_SIDE__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderLine getTop()
  {
    return top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTop(BorderLine newTop, NotificationChain msgs)
  {
    BorderLine oldTop = top;
    top = newTop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.BORDER_SIDE__TOP, oldTop, newTop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTop(BorderLine newTop)
  {
    if (newTop != top)
    {
      NotificationChain msgs = null;
      if (top != null)
        msgs = ((InternalEObject)top).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.BORDER_SIDE__TOP, null, msgs);
      if (newTop != null)
        msgs = ((InternalEObject)newTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.BORDER_SIDE__TOP, null, msgs);
      msgs = basicSetTop(newTop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.BORDER_SIDE__TOP, newTop, newTop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BorderLine getBottom()
  {
    return bottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBottom(BorderLine newBottom, NotificationChain msgs)
  {
    BorderLine oldBottom = bottom;
    bottom = newBottom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.BORDER_SIDE__BOTTOM, oldBottom, newBottom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBottom(BorderLine newBottom)
  {
    if (newBottom != bottom)
    {
      NotificationChain msgs = null;
      if (bottom != null)
        msgs = ((InternalEObject)bottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.BORDER_SIDE__BOTTOM, null, msgs);
      if (newBottom != null)
        msgs = ((InternalEObject)newBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.BORDER_SIDE__BOTTOM, null, msgs);
      msgs = basicSetBottom(newBottom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.BORDER_SIDE__BOTTOM, newBottom, newBottom));
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
      case RDslPackage.BORDER_SIDE__RIGHT:
        return basicSetRight(null, msgs);
      case RDslPackage.BORDER_SIDE__LEFT:
        return basicSetLeft(null, msgs);
      case RDslPackage.BORDER_SIDE__TOP:
        return basicSetTop(null, msgs);
      case RDslPackage.BORDER_SIDE__BOTTOM:
        return basicSetBottom(null, msgs);
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
      case RDslPackage.BORDER_SIDE__RIGHT:
        return getRight();
      case RDslPackage.BORDER_SIDE__LEFT:
        return getLeft();
      case RDslPackage.BORDER_SIDE__TOP:
        return getTop();
      case RDslPackage.BORDER_SIDE__BOTTOM:
        return getBottom();
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
      case RDslPackage.BORDER_SIDE__RIGHT:
        setRight((BorderLine)newValue);
        return;
      case RDslPackage.BORDER_SIDE__LEFT:
        setLeft((BorderLine)newValue);
        return;
      case RDslPackage.BORDER_SIDE__TOP:
        setTop((BorderLine)newValue);
        return;
      case RDslPackage.BORDER_SIDE__BOTTOM:
        setBottom((BorderLine)newValue);
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
      case RDslPackage.BORDER_SIDE__RIGHT:
        setRight((BorderLine)null);
        return;
      case RDslPackage.BORDER_SIDE__LEFT:
        setLeft((BorderLine)null);
        return;
      case RDslPackage.BORDER_SIDE__TOP:
        setTop((BorderLine)null);
        return;
      case RDslPackage.BORDER_SIDE__BOTTOM:
        setBottom((BorderLine)null);
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
      case RDslPackage.BORDER_SIDE__RIGHT:
        return right != null;
      case RDslPackage.BORDER_SIDE__LEFT:
        return left != null;
      case RDslPackage.BORDER_SIDE__TOP:
        return top != null;
      case RDslPackage.BORDER_SIDE__BOTTOM:
        return bottom != null;
    }
    return super.eIsSet(featureID);
  }

} //BorderSideImpl
