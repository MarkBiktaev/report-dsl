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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.SortType;
import org.xtext.example.mydsl.rDsl.StaticParameterSort;
import org.xtext.example.mydsl.rDsl.StaticParameterValue;
import org.xtext.example.mydsl.rDsl.StaticParameterValues;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Parameter Values</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.StaticParameterValuesImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.StaticParameterValuesImpl#getSort <em>Sort</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.StaticParameterValuesImpl#getSorttype <em>Sorttype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticParameterValuesImpl extends ParameterValueImpl implements StaticParameterValues
{
  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected EList<StaticParameterValue> value;

  /**
   * The default value of the '{@link #getSort() <em>Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSort()
   * @generated
   * @ordered
   */
  protected static final StaticParameterSort SORT_EDEFAULT = StaticParameterSort.LABEL;

  /**
   * The cached value of the '{@link #getSort() <em>Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSort()
   * @generated
   * @ordered
   */
  protected StaticParameterSort sort = SORT_EDEFAULT;

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
  protected StaticParameterValuesImpl()
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
    return RDslPackage.eINSTANCE.getStaticParameterValues();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<StaticParameterValue> getValue()
  {
    if (value == null)
    {
      value = new EObjectContainmentEList<StaticParameterValue>(StaticParameterValue.class, this, RDslPackage.STATIC_PARAMETER_VALUES__VALUE);
    }
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StaticParameterSort getSort()
  {
    return sort;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSort(StaticParameterSort newSort)
  {
    StaticParameterSort oldSort = sort;
    sort = newSort == null ? SORT_EDEFAULT : newSort;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.STATIC_PARAMETER_VALUES__SORT, oldSort, sort));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.STATIC_PARAMETER_VALUES__SORTTYPE, oldSorttype, sorttype));
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
      case RDslPackage.STATIC_PARAMETER_VALUES__VALUE:
        return ((InternalEList<?>)getValue()).basicRemove(otherEnd, msgs);
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
      case RDslPackage.STATIC_PARAMETER_VALUES__VALUE:
        return getValue();
      case RDslPackage.STATIC_PARAMETER_VALUES__SORT:
        return getSort();
      case RDslPackage.STATIC_PARAMETER_VALUES__SORTTYPE:
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
      case RDslPackage.STATIC_PARAMETER_VALUES__VALUE:
        getValue().clear();
        getValue().addAll((Collection<? extends StaticParameterValue>)newValue);
        return;
      case RDslPackage.STATIC_PARAMETER_VALUES__SORT:
        setSort((StaticParameterSort)newValue);
        return;
      case RDslPackage.STATIC_PARAMETER_VALUES__SORTTYPE:
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
      case RDslPackage.STATIC_PARAMETER_VALUES__VALUE:
        getValue().clear();
        return;
      case RDslPackage.STATIC_PARAMETER_VALUES__SORT:
        setSort(SORT_EDEFAULT);
        return;
      case RDslPackage.STATIC_PARAMETER_VALUES__SORTTYPE:
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
      case RDslPackage.STATIC_PARAMETER_VALUES__VALUE:
        return value != null && !value.isEmpty();
      case RDslPackage.STATIC_PARAMETER_VALUES__SORT:
        return sort != SORT_EDEFAULT;
      case RDslPackage.STATIC_PARAMETER_VALUES__SORTTYPE:
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
    result.append(" (sort: ");
    result.append(sort);
    result.append(", sorttype: ");
    result.append(sorttype);
    result.append(')');
    return result.toString();
  }

} //StaticParameterValuesImpl
