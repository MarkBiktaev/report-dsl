/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.rDsl.Dataset;
import org.xtext.example.mydsl.rDsl.DatasetField;
import org.xtext.example.mydsl.rDsl.DynamicParameterValue;
import org.xtext.example.mydsl.rDsl.JSExpression;
import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.SortType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dynamic Parameter Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.DynamicParameterValueImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.DynamicParameterValueImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.DynamicParameterValueImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.DynamicParameterValueImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.DynamicParameterValueImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.DynamicParameterValueImpl#getSorttype <em>Sorttype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DynamicParameterValueImpl extends MinimalEObjectImpl.Container implements DynamicParameterValue
{
  /**
   * The cached value of the '{@link #getDataset() <em>Dataset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataset()
   * @generated
   * @ordered
   */
  protected Dataset dataset;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected JSExpression label;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected JSExpression value;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected EList<JSExpression> default_;

  /**
   * The cached value of the '{@link #getSort() <em>Sort</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSort()
   * @generated
   * @ordered
   */
  protected DatasetField sort;

  /**
   * The default value of the '{@link #getSorttype() <em>Sorttype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSorttype()
   * @generated
   * @ordered
   */
  protected static final SortType SORTTYPE_EDEFAULT = SortType.ASC;

  /**
   * The cached value of the '{@link #getSorttype() <em>Sorttype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSorttype()
   * @generated
   * @ordered
   */
  protected SortType sorttype = SORTTYPE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DynamicParameterValueImpl()
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
    return RDslPackage.eINSTANCE.getDynamicParameterValue();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dataset getDataset()
  {
    if (dataset != null && dataset.eIsProxy())
    {
      InternalEObject oldDataset = (InternalEObject)dataset;
      dataset = (Dataset)eResolveProxy(oldDataset);
      if (dataset != oldDataset)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDslPackage.DYNAMIC_PARAMETER_VALUE__DATASET, oldDataset, dataset));
      }
    }
    return dataset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dataset basicGetDataset()
  {
    return dataset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataset(Dataset newDataset)
  {
    Dataset oldDataset = dataset;
    dataset = newDataset;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.DYNAMIC_PARAMETER_VALUE__DATASET, oldDataset, dataset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSExpression getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLabel(JSExpression newLabel, NotificationChain msgs)
  {
    JSExpression oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.DYNAMIC_PARAMETER_VALUE__LABEL, oldLabel, newLabel);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(JSExpression newLabel)
  {
    if (newLabel != label)
    {
      NotificationChain msgs = null;
      if (label != null)
        msgs = ((InternalEObject)label).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.DYNAMIC_PARAMETER_VALUE__LABEL, null, msgs);
      if (newLabel != null)
        msgs = ((InternalEObject)newLabel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.DYNAMIC_PARAMETER_VALUE__LABEL, null, msgs);
      msgs = basicSetLabel(newLabel, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.DYNAMIC_PARAMETER_VALUE__LABEL, newLabel, newLabel));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JSExpression getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValue(JSExpression newValue, NotificationChain msgs)
  {
    JSExpression oldValue = value;
    value = newValue;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.DYNAMIC_PARAMETER_VALUE__VALUE, oldValue, newValue);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValue(JSExpression newValue)
  {
    if (newValue != value)
    {
      NotificationChain msgs = null;
      if (value != null)
        msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.DYNAMIC_PARAMETER_VALUE__VALUE, null, msgs);
      if (newValue != null)
        msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.DYNAMIC_PARAMETER_VALUE__VALUE, null, msgs);
      msgs = basicSetValue(newValue, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.DYNAMIC_PARAMETER_VALUE__VALUE, newValue, newValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<JSExpression> getDefault()
  {
    if (default_ == null)
    {
      default_ = new EObjectContainmentEList<JSExpression>(JSExpression.class, this, RDslPackage.DYNAMIC_PARAMETER_VALUE__DEFAULT);
    }
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatasetField getSort()
  {
    if (sort != null && sort.eIsProxy())
    {
      InternalEObject oldSort = (InternalEObject)sort;
      sort = (DatasetField)eResolveProxy(oldSort);
      if (sort != oldSort)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDslPackage.DYNAMIC_PARAMETER_VALUE__SORT, oldSort, sort));
      }
    }
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DatasetField basicGetSort()
  {
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSort(DatasetField newSort)
  {
    DatasetField oldSort = sort;
    sort = newSort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.DYNAMIC_PARAMETER_VALUE__SORT, oldSort, sort));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SortType getSorttype()
  {
    return sorttype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSorttype(SortType newSorttype)
  {
    SortType oldSorttype = sorttype;
    sorttype = newSorttype == null ? SORTTYPE_EDEFAULT : newSorttype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.DYNAMIC_PARAMETER_VALUE__SORTTYPE, oldSorttype, sorttype));
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
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__LABEL:
        return basicSetLabel(null, msgs);
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__VALUE:
        return basicSetValue(null, msgs);
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__DEFAULT:
        return ((InternalEList<?>)getDefault()).basicRemove(otherEnd, msgs);
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
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__DATASET:
        if (resolve) return getDataset();
        return basicGetDataset();
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__LABEL:
        return getLabel();
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__VALUE:
        return getValue();
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__DEFAULT:
        return getDefault();
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__SORT:
        if (resolve) return getSort();
        return basicGetSort();
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__SORTTYPE:
        return getSorttype();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__DATASET:
        setDataset((Dataset)newValue);
        return;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__LABEL:
        setLabel((JSExpression)newValue);
        return;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__VALUE:
        setValue((JSExpression)newValue);
        return;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__DEFAULT:
        getDefault().clear();
        getDefault().addAll((Collection<? extends JSExpression>)newValue);
        return;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__SORT:
        setSort((DatasetField)newValue);
        return;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__SORTTYPE:
        setSorttype((SortType)newValue);
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
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__DATASET:
        setDataset((Dataset)null);
        return;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__LABEL:
        setLabel((JSExpression)null);
        return;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__VALUE:
        setValue((JSExpression)null);
        return;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__DEFAULT:
        getDefault().clear();
        return;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__SORT:
        setSort((DatasetField)null);
        return;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__SORTTYPE:
        setSorttype(SORTTYPE_EDEFAULT);
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
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__DATASET:
        return dataset != null;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__LABEL:
        return label != null;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__VALUE:
        return value != null;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__DEFAULT:
        return default_ != null && !default_.isEmpty();
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__SORT:
        return sort != null;
      case RDslPackage.DYNAMIC_PARAMETER_VALUE__SORTTYPE:
        return sorttype != SORTTYPE_EDEFAULT;
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
    result.append(" (sorttype: ");
    result.append(sorttype);
    result.append(')');
    return result.toString();
  }

} //DynamicParameterValueImpl
