/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDsl.Axe;
import org.xtext.example.mydsl.rDsl.ChartGrid;
import org.xtext.example.mydsl.rDsl.JSExpression;
import org.xtext.example.mydsl.rDsl.Line;
import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.Title;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Axe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.AxeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.AxeImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.AxeImpl#getGroupingby <em>Groupingby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.AxeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.AxeImpl#getLine <em>Line</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.AxeImpl#getMajorgrid <em>Majorgrid</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.AxeImpl#getMinorgrid <em>Minorgrid</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AxeImpl extends MinimalEObjectImpl.Container implements Axe
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getData() <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getData()
   * @generated
   * @ordered
   */
  protected JSExpression data;

  /**
   * The cached value of the '{@link #getGroupingby() <em>Groupingby</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupingby()
   * @generated
   * @ordered
   */
  protected JSExpression groupingby;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected Title title;

  /**
   * The cached value of the '{@link #getLine() <em>Line</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLine()
   * @generated
   * @ordered
   */
  protected Line line;

  /**
   * The cached value of the '{@link #getMajorgrid() <em>Majorgrid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMajorgrid()
   * @generated
   * @ordered
   */
  protected ChartGrid majorgrid;

  /**
   * The cached value of the '{@link #getMinorgrid() <em>Minorgrid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMinorgrid()
   * @generated
   * @ordered
   */
  protected ChartGrid minorgrid;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AxeImpl()
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
    return RDslPackage.eINSTANCE.getAxe();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSExpression getData()
  {
    return data;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetData(JSExpression newData, NotificationChain msgs)
  {
    JSExpression oldData = data;
    data = newData;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__DATA, oldData, newData);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setData(JSExpression newData)
  {
    if (newData != data)
    {
      NotificationChain msgs = null;
      if (data != null)
        msgs = ((InternalEObject)data).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.AXE__DATA, null, msgs);
      if (newData != null)
        msgs = ((InternalEObject)newData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.AXE__DATA, null, msgs);
      msgs = basicSetData(newData, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__DATA, newData, newData));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSExpression getGroupingby()
  {
    return groupingby;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGroupingby(JSExpression newGroupingby, NotificationChain msgs)
  {
    JSExpression oldGroupingby = groupingby;
    groupingby = newGroupingby;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__GROUPINGBY, oldGroupingby, newGroupingby);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGroupingby(JSExpression newGroupingby)
  {
    if (newGroupingby != groupingby)
    {
      NotificationChain msgs = null;
      if (groupingby != null)
        msgs = ((InternalEObject)groupingby).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.AXE__GROUPINGBY, null, msgs);
      if (newGroupingby != null)
        msgs = ((InternalEObject)newGroupingby).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.AXE__GROUPINGBY, null, msgs);
      msgs = basicSetGroupingby(newGroupingby, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__GROUPINGBY, newGroupingby, newGroupingby));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Title getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTitle(Title newTitle, NotificationChain msgs)
  {
    Title oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__TITLE, oldTitle, newTitle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(Title newTitle)
  {
    if (newTitle != title)
    {
      NotificationChain msgs = null;
      if (title != null)
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.AXE__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.AXE__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__TITLE, newTitle, newTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Line getLine()
  {
    return line;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLine(Line newLine, NotificationChain msgs)
  {
    Line oldLine = line;
    line = newLine;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__LINE, oldLine, newLine);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLine(Line newLine)
  {
    if (newLine != line)
    {
      NotificationChain msgs = null;
      if (line != null)
        msgs = ((InternalEObject)line).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.AXE__LINE, null, msgs);
      if (newLine != null)
        msgs = ((InternalEObject)newLine).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.AXE__LINE, null, msgs);
      msgs = basicSetLine(newLine, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__LINE, newLine, newLine));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChartGrid getMajorgrid()
  {
    return majorgrid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMajorgrid(ChartGrid newMajorgrid, NotificationChain msgs)
  {
    ChartGrid oldMajorgrid = majorgrid;
    majorgrid = newMajorgrid;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__MAJORGRID, oldMajorgrid, newMajorgrid);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMajorgrid(ChartGrid newMajorgrid)
  {
    if (newMajorgrid != majorgrid)
    {
      NotificationChain msgs = null;
      if (majorgrid != null)
        msgs = ((InternalEObject)majorgrid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.AXE__MAJORGRID, null, msgs);
      if (newMajorgrid != null)
        msgs = ((InternalEObject)newMajorgrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.AXE__MAJORGRID, null, msgs);
      msgs = basicSetMajorgrid(newMajorgrid, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__MAJORGRID, newMajorgrid, newMajorgrid));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChartGrid getMinorgrid()
  {
    return minorgrid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMinorgrid(ChartGrid newMinorgrid, NotificationChain msgs)
  {
    ChartGrid oldMinorgrid = minorgrid;
    minorgrid = newMinorgrid;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__MINORGRID, oldMinorgrid, newMinorgrid);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMinorgrid(ChartGrid newMinorgrid)
  {
    if (newMinorgrid != minorgrid)
    {
      NotificationChain msgs = null;
      if (minorgrid != null)
        msgs = ((InternalEObject)minorgrid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.AXE__MINORGRID, null, msgs);
      if (newMinorgrid != null)
        msgs = ((InternalEObject)newMinorgrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.AXE__MINORGRID, null, msgs);
      msgs = basicSetMinorgrid(newMinorgrid, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.AXE__MINORGRID, newMinorgrid, newMinorgrid));
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
      case RDslPackage.AXE__DATA:
        return basicSetData(null, msgs);
      case RDslPackage.AXE__GROUPINGBY:
        return basicSetGroupingby(null, msgs);
      case RDslPackage.AXE__TITLE:
        return basicSetTitle(null, msgs);
      case RDslPackage.AXE__LINE:
        return basicSetLine(null, msgs);
      case RDslPackage.AXE__MAJORGRID:
        return basicSetMajorgrid(null, msgs);
      case RDslPackage.AXE__MINORGRID:
        return basicSetMinorgrid(null, msgs);
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
      case RDslPackage.AXE__TYPE:
        return getType();
      case RDslPackage.AXE__DATA:
        return getData();
      case RDslPackage.AXE__GROUPINGBY:
        return getGroupingby();
      case RDslPackage.AXE__TITLE:
        return getTitle();
      case RDslPackage.AXE__LINE:
        return getLine();
      case RDslPackage.AXE__MAJORGRID:
        return getMajorgrid();
      case RDslPackage.AXE__MINORGRID:
        return getMinorgrid();
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
      case RDslPackage.AXE__TYPE:
        setType((String)newValue);
        return;
      case RDslPackage.AXE__DATA:
        setData((JSExpression)newValue);
        return;
      case RDslPackage.AXE__GROUPINGBY:
        setGroupingby((JSExpression)newValue);
        return;
      case RDslPackage.AXE__TITLE:
        setTitle((Title)newValue);
        return;
      case RDslPackage.AXE__LINE:
        setLine((Line)newValue);
        return;
      case RDslPackage.AXE__MAJORGRID:
        setMajorgrid((ChartGrid)newValue);
        return;
      case RDslPackage.AXE__MINORGRID:
        setMinorgrid((ChartGrid)newValue);
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
      case RDslPackage.AXE__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RDslPackage.AXE__DATA:
        setData((JSExpression)null);
        return;
      case RDslPackage.AXE__GROUPINGBY:
        setGroupingby((JSExpression)null);
        return;
      case RDslPackage.AXE__TITLE:
        setTitle((Title)null);
        return;
      case RDslPackage.AXE__LINE:
        setLine((Line)null);
        return;
      case RDslPackage.AXE__MAJORGRID:
        setMajorgrid((ChartGrid)null);
        return;
      case RDslPackage.AXE__MINORGRID:
        setMinorgrid((ChartGrid)null);
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
      case RDslPackage.AXE__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case RDslPackage.AXE__DATA:
        return data != null;
      case RDslPackage.AXE__GROUPINGBY:
        return groupingby != null;
      case RDslPackage.AXE__TITLE:
        return title != null;
      case RDslPackage.AXE__LINE:
        return line != null;
      case RDslPackage.AXE__MAJORGRID:
        return majorgrid != null;
      case RDslPackage.AXE__MINORGRID:
        return minorgrid != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //AxeImpl
