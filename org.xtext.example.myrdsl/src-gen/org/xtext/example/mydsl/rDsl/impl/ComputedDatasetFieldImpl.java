/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.rDsl.AggregatorFunction;
import org.xtext.example.mydsl.rDsl.ComputedDatasetField;
import org.xtext.example.mydsl.rDsl.DataType;
import org.xtext.example.mydsl.rDsl.JSExpression;
import org.xtext.example.mydsl.rDsl.RDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Computed Dataset Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ComputedDatasetFieldImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ComputedDatasetFieldImpl#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ComputedDatasetFieldImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ComputedDatasetFieldImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComputedDatasetFieldImpl extends DatasetFieldImpl implements ComputedDatasetField
{
  /**
   * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregation()
   * @generated
   * @ordered
   */
  protected static final AggregatorFunction AGGREGATION_EDEFAULT = AggregatorFunction.COUNT;

  /**
   * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregation()
   * @generated
   * @ordered
   */
  protected AggregatorFunction aggregation = AGGREGATION_EDEFAULT;

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
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected JSExpression argument;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected JSExpression filter;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ComputedDatasetFieldImpl()
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
    return RDslPackage.eINSTANCE.getComputedDatasetField();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AggregatorFunction getAggregation()
  {
    return aggregation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregation(AggregatorFunction newAggregation)
  {
    AggregatorFunction oldAggregation = aggregation;
    aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.COMPUTED_DATASET_FIELD__AGGREGATION, oldAggregation, aggregation));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.COMPUTED_DATASET_FIELD__DATATYPE, oldDatatype, datatype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSExpression getArgument()
  {
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgument(JSExpression newArgument, NotificationChain msgs)
  {
    JSExpression oldArgument = argument;
    argument = newArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.COMPUTED_DATASET_FIELD__ARGUMENT, oldArgument, newArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgument(JSExpression newArgument)
  {
    if (newArgument != argument)
    {
      NotificationChain msgs = null;
      if (argument != null)
        msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.COMPUTED_DATASET_FIELD__ARGUMENT, null, msgs);
      if (newArgument != null)
        msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.COMPUTED_DATASET_FIELD__ARGUMENT, null, msgs);
      msgs = basicSetArgument(newArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.COMPUTED_DATASET_FIELD__ARGUMENT, newArgument, newArgument));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSExpression getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(JSExpression newFilter, NotificationChain msgs)
  {
    JSExpression oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.COMPUTED_DATASET_FIELD__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(JSExpression newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.COMPUTED_DATASET_FIELD__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.COMPUTED_DATASET_FIELD__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.COMPUTED_DATASET_FIELD__FILTER, newFilter, newFilter));
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
      case RDslPackage.COMPUTED_DATASET_FIELD__ARGUMENT:
        return basicSetArgument(null, msgs);
      case RDslPackage.COMPUTED_DATASET_FIELD__FILTER:
        return basicSetFilter(null, msgs);
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
      case RDslPackage.COMPUTED_DATASET_FIELD__AGGREGATION:
        return getAggregation();
      case RDslPackage.COMPUTED_DATASET_FIELD__DATATYPE:
        return getDatatype();
      case RDslPackage.COMPUTED_DATASET_FIELD__ARGUMENT:
        return getArgument();
      case RDslPackage.COMPUTED_DATASET_FIELD__FILTER:
        return getFilter();
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
      case RDslPackage.COMPUTED_DATASET_FIELD__AGGREGATION:
        setAggregation((AggregatorFunction)newValue);
        return;
      case RDslPackage.COMPUTED_DATASET_FIELD__DATATYPE:
        setDatatype((DataType)newValue);
        return;
      case RDslPackage.COMPUTED_DATASET_FIELD__ARGUMENT:
        setArgument((JSExpression)newValue);
        return;
      case RDslPackage.COMPUTED_DATASET_FIELD__FILTER:
        setFilter((JSExpression)newValue);
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
      case RDslPackage.COMPUTED_DATASET_FIELD__AGGREGATION:
        setAggregation(AGGREGATION_EDEFAULT);
        return;
      case RDslPackage.COMPUTED_DATASET_FIELD__DATATYPE:
        setDatatype(DATATYPE_EDEFAULT);
        return;
      case RDslPackage.COMPUTED_DATASET_FIELD__ARGUMENT:
        setArgument((JSExpression)null);
        return;
      case RDslPackage.COMPUTED_DATASET_FIELD__FILTER:
        setFilter((JSExpression)null);
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
      case RDslPackage.COMPUTED_DATASET_FIELD__AGGREGATION:
        return aggregation != AGGREGATION_EDEFAULT;
      case RDslPackage.COMPUTED_DATASET_FIELD__DATATYPE:
        return datatype != DATATYPE_EDEFAULT;
      case RDslPackage.COMPUTED_DATASET_FIELD__ARGUMENT:
        return argument != null;
      case RDslPackage.COMPUTED_DATASET_FIELD__FILTER:
        return filter != null;
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
    result.append(" (aggregation: ");
    result.append(aggregation);
    result.append(", datatype: ");
    result.append(datatype);
    result.append(')');
    return result.toString();
  }

} //ComputedDatasetFieldImpl
