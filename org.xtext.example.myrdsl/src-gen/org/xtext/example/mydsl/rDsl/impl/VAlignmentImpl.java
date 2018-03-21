/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.VAlignment;
import org.xtext.example.mydsl.rDsl.ValignmentType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>VAlignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.VAlignmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.VAlignmentImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.VAlignmentImpl#getLinkto <em>Linkto</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VAlignmentImpl extends MinimalEObjectImpl.Container implements VAlignment
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final ValignmentType VALUE_EDEFAULT = ValignmentType.BOTTOM;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected ValignmentType value = VALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getLinkto() <em>Linkto</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLinkto()
   * @generated
   * @ordered
   */
  protected VAlignment linkto;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VAlignmentImpl()
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
    return RDslPackage.eINSTANCE.getVAlignment();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.VALIGNMENT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValignmentType getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(ValignmentType newValue)
  {
    ValignmentType oldValue = value;
    value = newValue == null ? VALUE_EDEFAULT : newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.VALIGNMENT__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAlignment getLinkto()
  {
    if (linkto != null && linkto.eIsProxy())
    {
      InternalEObject oldLinkto = (InternalEObject)linkto;
      linkto = (VAlignment)eResolveProxy(oldLinkto);
      if (linkto != oldLinkto)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDslPackage.VALIGNMENT__LINKTO, oldLinkto, linkto));
      }
    }
    return linkto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAlignment basicGetLinkto()
  {
    return linkto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLinkto(VAlignment newLinkto)
  {
    VAlignment oldLinkto = linkto;
    linkto = newLinkto;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.VALIGNMENT__LINKTO, oldLinkto, linkto));
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
      case RDslPackage.VALIGNMENT__NAME:
        return getName();
      case RDslPackage.VALIGNMENT__VALUE:
        return getValue();
      case RDslPackage.VALIGNMENT__LINKTO:
        if (resolve) return getLinkto();
        return basicGetLinkto();
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
      case RDslPackage.VALIGNMENT__NAME:
        setName((String)newValue);
        return;
      case RDslPackage.VALIGNMENT__VALUE:
        setValue((ValignmentType)newValue);
        return;
      case RDslPackage.VALIGNMENT__LINKTO:
        setLinkto((VAlignment)newValue);
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
      case RDslPackage.VALIGNMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RDslPackage.VALIGNMENT__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case RDslPackage.VALIGNMENT__LINKTO:
        setLinkto((VAlignment)null);
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
      case RDslPackage.VALIGNMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RDslPackage.VALIGNMENT__VALUE:
        return value != VALUE_EDEFAULT;
      case RDslPackage.VALIGNMENT__LINKTO:
        return linkto != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(", value: ");
    result.append(value);
    result.append(')');
    return result.toString();
  }

} //VAlignmentImpl
