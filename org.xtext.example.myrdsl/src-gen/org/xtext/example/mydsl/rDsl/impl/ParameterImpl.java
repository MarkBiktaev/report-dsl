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
import org.xtext.example.mydsl.rDsl.DataType;
import org.xtext.example.mydsl.rDsl.Parameter;
import org.xtext.example.mydsl.rDsl.ParameterControlType;
import org.xtext.example.mydsl.rDsl.ParameterType;
import org.xtext.example.mydsl.rDsl.ParameterValue;
import org.xtext.example.mydsl.rDsl.ParameterValueType;
import org.xtext.example.mydsl.rDsl.RDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ParameterImpl#getControltype <em>Controltype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ParameterImpl#getPromt <em>Promt</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ParameterImpl#getHelp <em>Help</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ParameterImpl#getHide <em>Hide</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ParameterImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ParameterImpl#getDuplicate <em>Duplicate</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ParameterImpl#getValuetype <em>Valuetype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ParameterImpl#getParamtype <em>Paramtype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ParameterImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ParameterImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterImpl extends MinimalEObjectImpl.Container implements Parameter
{
  /**
   * The default value of the '{@link #getControltype() <em>Controltype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControltype()
   * @generated
   * @ordered
   */
  protected static final ParameterControlType CONTROLTYPE_EDEFAULT = ParameterControlType.CHB;

  /**
   * The cached value of the '{@link #getControltype() <em>Controltype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getControltype()
   * @generated
   * @ordered
   */
  protected ParameterControlType controltype = CONTROLTYPE_EDEFAULT;

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
   * The default value of the '{@link #getPromt() <em>Promt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPromt()
   * @generated
   * @ordered
   */
  protected static final String PROMT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPromt() <em>Promt</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPromt()
   * @generated
   * @ordered
   */
  protected String promt = PROMT_EDEFAULT;

  /**
   * The default value of the '{@link #getHelp() <em>Help</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelp()
   * @generated
   * @ordered
   */
  protected static final String HELP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHelp() <em>Help</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHelp()
   * @generated
   * @ordered
   */
  protected String help = HELP_EDEFAULT;

  /**
   * The cached value of the '{@link #getHide() <em>Hide</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHide()
   * @generated
   * @ordered
   */
  protected BooleanLiteral hide;

  /**
   * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequired()
   * @generated
   * @ordered
   */
  protected BooleanLiteral required;

  /**
   * The cached value of the '{@link #getDuplicate() <em>Duplicate</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDuplicate()
   * @generated
   * @ordered
   */
  protected BooleanLiteral duplicate;

  /**
   * The default value of the '{@link #getValuetype() <em>Valuetype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuetype()
   * @generated
   * @ordered
   */
  protected static final ParameterValueType VALUETYPE_EDEFAULT = ParameterValueType.DYNAMIC;

  /**
   * The cached value of the '{@link #getValuetype() <em>Valuetype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuetype()
   * @generated
   * @ordered
   */
  protected ParameterValueType valuetype = VALUETYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getParamtype() <em>Paramtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamtype()
   * @generated
   * @ordered
   */
  protected static final ParameterType PARAMTYPE_EDEFAULT = ParameterType.MULTI;

  /**
   * The cached value of the '{@link #getParamtype() <em>Paramtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParamtype()
   * @generated
   * @ordered
   */
  protected ParameterType paramtype = PARAMTYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatype()
   * @generated
   * @ordered
   */
  protected static final DataType DATATYPE_EDEFAULT = DataType.BOOLEAN;

  /**
   * The cached value of the '{@link #getDatatype() <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatatype()
   * @generated
   * @ordered
   */
  protected DataType datatype = DATATYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValues()
   * @generated
   * @ordered
   */
  protected ParameterValue values;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ParameterImpl()
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
    return RDslPackage.eINSTANCE.getParameter();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterControlType getControltype()
  {
    return controltype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setControltype(ParameterControlType newControltype)
  {
    ParameterControlType oldControltype = controltype;
    controltype = newControltype == null ? CONTROLTYPE_EDEFAULT : newControltype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__CONTROLTYPE, oldControltype, controltype));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPromt()
  {
    return promt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPromt(String newPromt)
  {
    String oldPromt = promt;
    promt = newPromt;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__PROMT, oldPromt, promt));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHelp()
  {
    return help;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHelp(String newHelp)
  {
    String oldHelp = help;
    help = newHelp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__HELP, oldHelp, help));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getHide()
  {
    return hide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHide(BooleanLiteral newHide, NotificationChain msgs)
  {
    BooleanLiteral oldHide = hide;
    hide = newHide;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__HIDE, oldHide, newHide);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHide(BooleanLiteral newHide)
  {
    if (newHide != hide)
    {
      NotificationChain msgs = null;
      if (hide != null)
        msgs = ((InternalEObject)hide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PARAMETER__HIDE, null, msgs);
      if (newHide != null)
        msgs = ((InternalEObject)newHide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PARAMETER__HIDE, null, msgs);
      msgs = basicSetHide(newHide, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__HIDE, newHide, newHide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getRequired()
  {
    return required;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRequired(BooleanLiteral newRequired, NotificationChain msgs)
  {
    BooleanLiteral oldRequired = required;
    required = newRequired;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__REQUIRED, oldRequired, newRequired);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequired(BooleanLiteral newRequired)
  {
    if (newRequired != required)
    {
      NotificationChain msgs = null;
      if (required != null)
        msgs = ((InternalEObject)required).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PARAMETER__REQUIRED, null, msgs);
      if (newRequired != null)
        msgs = ((InternalEObject)newRequired).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PARAMETER__REQUIRED, null, msgs);
      msgs = basicSetRequired(newRequired, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__REQUIRED, newRequired, newRequired));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BooleanLiteral getDuplicate()
  {
    return duplicate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDuplicate(BooleanLiteral newDuplicate, NotificationChain msgs)
  {
    BooleanLiteral oldDuplicate = duplicate;
    duplicate = newDuplicate;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__DUPLICATE, oldDuplicate, newDuplicate);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDuplicate(BooleanLiteral newDuplicate)
  {
    if (newDuplicate != duplicate)
    {
      NotificationChain msgs = null;
      if (duplicate != null)
        msgs = ((InternalEObject)duplicate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PARAMETER__DUPLICATE, null, msgs);
      if (newDuplicate != null)
        msgs = ((InternalEObject)newDuplicate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PARAMETER__DUPLICATE, null, msgs);
      msgs = basicSetDuplicate(newDuplicate, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__DUPLICATE, newDuplicate, newDuplicate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValueType getValuetype()
  {
    return valuetype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuetype(ParameterValueType newValuetype)
  {
    ParameterValueType oldValuetype = valuetype;
    valuetype = newValuetype == null ? VALUETYPE_EDEFAULT : newValuetype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__VALUETYPE, oldValuetype, valuetype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterType getParamtype()
  {
    return paramtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParamtype(ParameterType newParamtype)
  {
    ParameterType oldParamtype = paramtype;
    paramtype = newParamtype == null ? PARAMTYPE_EDEFAULT : newParamtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__PARAMTYPE, oldParamtype, paramtype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType getDatatype()
  {
    return datatype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatatype(DataType newDatatype)
  {
    DataType oldDatatype = datatype;
    datatype = newDatatype == null ? DATATYPE_EDEFAULT : newDatatype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__DATATYPE, oldDatatype, datatype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParameterValue getValues()
  {
    return values;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValues(ParameterValue newValues, NotificationChain msgs)
  {
    ParameterValue oldValues = values;
    values = newValues;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__VALUES, oldValues, newValues);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValues(ParameterValue newValues)
  {
    if (newValues != values)
    {
      NotificationChain msgs = null;
      if (values != null)
        msgs = ((InternalEObject)values).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PARAMETER__VALUES, null, msgs);
      if (newValues != null)
        msgs = ((InternalEObject)newValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PARAMETER__VALUES, null, msgs);
      msgs = basicSetValues(newValues, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PARAMETER__VALUES, newValues, newValues));
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
      case RDslPackage.PARAMETER__HIDE:
        return basicSetHide(null, msgs);
      case RDslPackage.PARAMETER__REQUIRED:
        return basicSetRequired(null, msgs);
      case RDslPackage.PARAMETER__DUPLICATE:
        return basicSetDuplicate(null, msgs);
      case RDslPackage.PARAMETER__VALUES:
        return basicSetValues(null, msgs);
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
      case RDslPackage.PARAMETER__CONTROLTYPE:
        return getControltype();
      case RDslPackage.PARAMETER__NAME:
        return getName();
      case RDslPackage.PARAMETER__PROMT:
        return getPromt();
      case RDslPackage.PARAMETER__HELP:
        return getHelp();
      case RDslPackage.PARAMETER__HIDE:
        return getHide();
      case RDslPackage.PARAMETER__REQUIRED:
        return getRequired();
      case RDslPackage.PARAMETER__DUPLICATE:
        return getDuplicate();
      case RDslPackage.PARAMETER__VALUETYPE:
        return getValuetype();
      case RDslPackage.PARAMETER__PARAMTYPE:
        return getParamtype();
      case RDslPackage.PARAMETER__DATATYPE:
        return getDatatype();
      case RDslPackage.PARAMETER__VALUES:
        return getValues();
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
      case RDslPackage.PARAMETER__CONTROLTYPE:
        setControltype((ParameterControlType)newValue);
        return;
      case RDslPackage.PARAMETER__NAME:
        setName((String)newValue);
        return;
      case RDslPackage.PARAMETER__PROMT:
        setPromt((String)newValue);
        return;
      case RDslPackage.PARAMETER__HELP:
        setHelp((String)newValue);
        return;
      case RDslPackage.PARAMETER__HIDE:
        setHide((BooleanLiteral)newValue);
        return;
      case RDslPackage.PARAMETER__REQUIRED:
        setRequired((BooleanLiteral)newValue);
        return;
      case RDslPackage.PARAMETER__DUPLICATE:
        setDuplicate((BooleanLiteral)newValue);
        return;
      case RDslPackage.PARAMETER__VALUETYPE:
        setValuetype((ParameterValueType)newValue);
        return;
      case RDslPackage.PARAMETER__PARAMTYPE:
        setParamtype((ParameterType)newValue);
        return;
      case RDslPackage.PARAMETER__DATATYPE:
        setDatatype((DataType)newValue);
        return;
      case RDslPackage.PARAMETER__VALUES:
        setValues((ParameterValue)newValue);
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
      case RDslPackage.PARAMETER__CONTROLTYPE:
        setControltype(CONTROLTYPE_EDEFAULT);
        return;
      case RDslPackage.PARAMETER__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RDslPackage.PARAMETER__PROMT:
        setPromt(PROMT_EDEFAULT);
        return;
      case RDslPackage.PARAMETER__HELP:
        setHelp(HELP_EDEFAULT);
        return;
      case RDslPackage.PARAMETER__HIDE:
        setHide((BooleanLiteral)null);
        return;
      case RDslPackage.PARAMETER__REQUIRED:
        setRequired((BooleanLiteral)null);
        return;
      case RDslPackage.PARAMETER__DUPLICATE:
        setDuplicate((BooleanLiteral)null);
        return;
      case RDslPackage.PARAMETER__VALUETYPE:
        setValuetype(VALUETYPE_EDEFAULT);
        return;
      case RDslPackage.PARAMETER__PARAMTYPE:
        setParamtype(PARAMTYPE_EDEFAULT);
        return;
      case RDslPackage.PARAMETER__DATATYPE:
        setDatatype(DATATYPE_EDEFAULT);
        return;
      case RDslPackage.PARAMETER__VALUES:
        setValues((ParameterValue)null);
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
      case RDslPackage.PARAMETER__CONTROLTYPE:
        return controltype != CONTROLTYPE_EDEFAULT;
      case RDslPackage.PARAMETER__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RDslPackage.PARAMETER__PROMT:
        return PROMT_EDEFAULT == null ? promt != null : !PROMT_EDEFAULT.equals(promt);
      case RDslPackage.PARAMETER__HELP:
        return HELP_EDEFAULT == null ? help != null : !HELP_EDEFAULT.equals(help);
      case RDslPackage.PARAMETER__HIDE:
        return hide != null;
      case RDslPackage.PARAMETER__REQUIRED:
        return required != null;
      case RDslPackage.PARAMETER__DUPLICATE:
        return duplicate != null;
      case RDslPackage.PARAMETER__VALUETYPE:
        return valuetype != VALUETYPE_EDEFAULT;
      case RDslPackage.PARAMETER__PARAMTYPE:
        return paramtype != PARAMTYPE_EDEFAULT;
      case RDslPackage.PARAMETER__DATATYPE:
        return datatype != DATATYPE_EDEFAULT;
      case RDslPackage.PARAMETER__VALUES:
        return values != null;
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
    result.append(" (controltype: ");
    result.append(controltype);
    result.append(", name: ");
    result.append(name);
    result.append(", promt: ");
    result.append(promt);
    result.append(", help: ");
    result.append(help);
    result.append(", valuetype: ");
    result.append(valuetype);
    result.append(", paramtype: ");
    result.append(paramtype);
    result.append(", datatype: ");
    result.append(datatype);
    result.append(')');
    return result.toString();
  }

} //ParameterImpl
