/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.rDsl.IndentSide;
import org.xtext.example.mydsl.rDsl.IndentValue;
import org.xtext.example.mydsl.rDsl.RDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Indent Side</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.IndentSideImpl#getRight <em>Right</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.IndentSideImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.IndentSideImpl#getTop <em>Top</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.IndentSideImpl#getBottom <em>Bottom</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IndentSideImpl extends PaddingImpl implements IndentSide
{
  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected IndentValue right;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected IndentValue left;

  /**
   * The cached value of the '{@link #getTop() <em>Top</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTop()
   * @generated
   * @ordered
   */
  protected IndentValue top;

  /**
   * The cached value of the '{@link #getBottom() <em>Bottom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBottom()
   * @generated
   * @ordered
   */
  protected IndentValue bottom;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IndentSideImpl()
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
    return RDslPackage.eINSTANCE.getIndentSide();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndentValue getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(IndentValue newRight, NotificationChain msgs)
  {
    IndentValue oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.INDENT_SIDE__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(IndentValue newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.INDENT_SIDE__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.INDENT_SIDE__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.INDENT_SIDE__RIGHT, newRight, newRight));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndentValue getLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLeft(IndentValue newLeft, NotificationChain msgs)
  {
    IndentValue oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.INDENT_SIDE__LEFT, oldLeft, newLeft);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(IndentValue newLeft)
  {
    if (newLeft != left)
    {
      NotificationChain msgs = null;
      if (left != null)
        msgs = ((InternalEObject)left).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.INDENT_SIDE__LEFT, null, msgs);
      if (newLeft != null)
        msgs = ((InternalEObject)newLeft).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.INDENT_SIDE__LEFT, null, msgs);
      msgs = basicSetLeft(newLeft, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.INDENT_SIDE__LEFT, newLeft, newLeft));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndentValue getTop()
  {
    return top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTop(IndentValue newTop, NotificationChain msgs)
  {
    IndentValue oldTop = top;
    top = newTop;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.INDENT_SIDE__TOP, oldTop, newTop);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTop(IndentValue newTop)
  {
    if (newTop != top)
    {
      NotificationChain msgs = null;
      if (top != null)
        msgs = ((InternalEObject)top).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.INDENT_SIDE__TOP, null, msgs);
      if (newTop != null)
        msgs = ((InternalEObject)newTop).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.INDENT_SIDE__TOP, null, msgs);
      msgs = basicSetTop(newTop, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.INDENT_SIDE__TOP, newTop, newTop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IndentValue getBottom()
  {
    return bottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBottom(IndentValue newBottom, NotificationChain msgs)
  {
    IndentValue oldBottom = bottom;
    bottom = newBottom;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.INDENT_SIDE__BOTTOM, oldBottom, newBottom);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBottom(IndentValue newBottom)
  {
    if (newBottom != bottom)
    {
      NotificationChain msgs = null;
      if (bottom != null)
        msgs = ((InternalEObject)bottom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.INDENT_SIDE__BOTTOM, null, msgs);
      if (newBottom != null)
        msgs = ((InternalEObject)newBottom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.INDENT_SIDE__BOTTOM, null, msgs);
      msgs = basicSetBottom(newBottom, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.INDENT_SIDE__BOTTOM, newBottom, newBottom));
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
      case RDslPackage.INDENT_SIDE__RIGHT:
        return basicSetRight(null, msgs);
      case RDslPackage.INDENT_SIDE__LEFT:
        return basicSetLeft(null, msgs);
      case RDslPackage.INDENT_SIDE__TOP:
        return basicSetTop(null, msgs);
      case RDslPackage.INDENT_SIDE__BOTTOM:
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
      case RDslPackage.INDENT_SIDE__RIGHT:
        return getRight();
      case RDslPackage.INDENT_SIDE__LEFT:
        return getLeft();
      case RDslPackage.INDENT_SIDE__TOP:
        return getTop();
      case RDslPackage.INDENT_SIDE__BOTTOM:
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
      case RDslPackage.INDENT_SIDE__RIGHT:
        setRight((IndentValue)newValue);
        return;
      case RDslPackage.INDENT_SIDE__LEFT:
        setLeft((IndentValue)newValue);
        return;
      case RDslPackage.INDENT_SIDE__TOP:
        setTop((IndentValue)newValue);
        return;
      case RDslPackage.INDENT_SIDE__BOTTOM:
        setBottom((IndentValue)newValue);
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
      case RDslPackage.INDENT_SIDE__RIGHT:
        setRight((IndentValue)null);
        return;
      case RDslPackage.INDENT_SIDE__LEFT:
        setLeft((IndentValue)null);
        return;
      case RDslPackage.INDENT_SIDE__TOP:
        setTop((IndentValue)null);
        return;
      case RDslPackage.INDENT_SIDE__BOTTOM:
        setBottom((IndentValue)null);
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
      case RDslPackage.INDENT_SIDE__RIGHT:
        return right != null;
      case RDslPackage.INDENT_SIDE__LEFT:
        return left != null;
      case RDslPackage.INDENT_SIDE__TOP:
        return top != null;
      case RDslPackage.INDENT_SIDE__BOTTOM:
        return bottom != null;
    }
    return super.eIsSet(featureID);
  }

} //IndentSideImpl
