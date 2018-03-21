/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.TextStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.TextStyleImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.TextStyleImpl#isI <em>I</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.TextStyleImpl#isB <em>B</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.TextStyleImpl#isU <em>U</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.TextStyleImpl#isT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TextStyleImpl extends MinimalEObjectImpl.Container implements TextStyle
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
   * The default value of the '{@link #isI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isI()
   * @generated
   * @ordered
   */
  protected static final boolean I_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isI() <em>I</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isI()
   * @generated
   * @ordered
   */
  protected boolean i = I_EDEFAULT;

  /**
   * The default value of the '{@link #isB() <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isB()
   * @generated
   * @ordered
   */
  protected static final boolean B_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isB() <em>B</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isB()
   * @generated
   * @ordered
   */
  protected boolean b = B_EDEFAULT;

  /**
   * The default value of the '{@link #isU() <em>U</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isU()
   * @generated
   * @ordered
   */
  protected static final boolean U_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isU() <em>U</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isU()
   * @generated
   * @ordered
   */
  protected boolean u = U_EDEFAULT;

  /**
   * The default value of the '{@link #isT() <em>T</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT()
   * @generated
   * @ordered
   */
  protected static final boolean T_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isT() <em>T</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isT()
   * @generated
   * @ordered
   */
  protected boolean t = T_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TextStyleImpl()
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
    return RDslPackage.eINSTANCE.getTextStyle();
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
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.TEXT_STYLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isI()
  {
    return i;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setI(boolean newI)
  {
    boolean oldI = i;
    i = newI;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.TEXT_STYLE__I, oldI, i));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isB()
  {
    return b;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setB(boolean newB)
  {
    boolean oldB = b;
    b = newB;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.TEXT_STYLE__B, oldB, b));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isU()
  {
    return u;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setU(boolean newU)
  {
    boolean oldU = u;
    u = newU;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.TEXT_STYLE__U, oldU, u));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(boolean newT)
  {
    boolean oldT = t;
    t = newT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.TEXT_STYLE__T, oldT, t));
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
      case RDslPackage.TEXT_STYLE__NAME:
        return getName();
      case RDslPackage.TEXT_STYLE__I:
        return isI();
      case RDslPackage.TEXT_STYLE__B:
        return isB();
      case RDslPackage.TEXT_STYLE__U:
        return isU();
      case RDslPackage.TEXT_STYLE__T:
        return isT();
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
      case RDslPackage.TEXT_STYLE__NAME:
        setName((String)newValue);
        return;
      case RDslPackage.TEXT_STYLE__I:
        setI((Boolean)newValue);
        return;
      case RDslPackage.TEXT_STYLE__B:
        setB((Boolean)newValue);
        return;
      case RDslPackage.TEXT_STYLE__U:
        setU((Boolean)newValue);
        return;
      case RDslPackage.TEXT_STYLE__T:
        setT((Boolean)newValue);
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
      case RDslPackage.TEXT_STYLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RDslPackage.TEXT_STYLE__I:
        setI(I_EDEFAULT);
        return;
      case RDslPackage.TEXT_STYLE__B:
        setB(B_EDEFAULT);
        return;
      case RDslPackage.TEXT_STYLE__U:
        setU(U_EDEFAULT);
        return;
      case RDslPackage.TEXT_STYLE__T:
        setT(T_EDEFAULT);
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
      case RDslPackage.TEXT_STYLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RDslPackage.TEXT_STYLE__I:
        return i != I_EDEFAULT;
      case RDslPackage.TEXT_STYLE__B:
        return b != B_EDEFAULT;
      case RDslPackage.TEXT_STYLE__U:
        return u != U_EDEFAULT;
      case RDslPackage.TEXT_STYLE__T:
        return t != T_EDEFAULT;
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
    result.append(", I: ");
    result.append(i);
    result.append(", B: ");
    result.append(b);
    result.append(", U: ");
    result.append(u);
    result.append(", T: ");
    result.append(t);
    result.append(')');
    return result.toString();
  }

} //TextStyleImpl
