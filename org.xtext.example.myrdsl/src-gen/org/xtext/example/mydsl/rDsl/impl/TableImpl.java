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

import org.xtext.example.mydsl.rDsl.Column;
import org.xtext.example.mydsl.rDsl.Dataset;
import org.xtext.example.mydsl.rDsl.LabelProperties;
import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.Row;
import org.xtext.example.mydsl.rDsl.Table;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.TableImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.TableImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.TableImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.TableImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.TableImpl#getHeaderrows <em>Headerrows</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.TableImpl#getDetailrows <em>Detailrows</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.TableImpl#getFooterrows <em>Footerrows</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableImpl extends ReportElementsImpl implements Table
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
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<LabelProperties> properties;

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
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<Column> columns;

  /**
   * The cached value of the '{@link #getHeaderrows() <em>Headerrows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaderrows()
   * @generated
   * @ordered
   */
  protected EList<Row> headerrows;

  /**
   * The cached value of the '{@link #getDetailrows() <em>Detailrows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetailrows()
   * @generated
   * @ordered
   */
  protected EList<Row> detailrows;

  /**
   * The cached value of the '{@link #getFooterrows() <em>Footerrows</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFooterrows()
   * @generated
   * @ordered
   */
  protected EList<Row> footerrows;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TableImpl()
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
    return RDslPackage.eINSTANCE.getTable();
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
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.TABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<LabelProperties> getProperties()
  {
    if (properties == null)
    {
      properties = new EObjectContainmentEList<LabelProperties>(LabelProperties.class, this, RDslPackage.TABLE__PROPERTIES);
    }
    return properties;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDslPackage.TABLE__DATASET, oldDataset, dataset));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.TABLE__DATASET, oldDataset, dataset));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Column> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<Column>(Column.class, this, RDslPackage.TABLE__COLUMNS);
    }
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Row> getHeaderrows()
  {
    if (headerrows == null)
    {
      headerrows = new EObjectContainmentEList<Row>(Row.class, this, RDslPackage.TABLE__HEADERROWS);
    }
    return headerrows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Row> getDetailrows()
  {
    if (detailrows == null)
    {
      detailrows = new EObjectContainmentEList<Row>(Row.class, this, RDslPackage.TABLE__DETAILROWS);
    }
    return detailrows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Row> getFooterrows()
  {
    if (footerrows == null)
    {
      footerrows = new EObjectContainmentEList<Row>(Row.class, this, RDslPackage.TABLE__FOOTERROWS);
    }
    return footerrows;
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
      case RDslPackage.TABLE__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case RDslPackage.TABLE__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
      case RDslPackage.TABLE__HEADERROWS:
        return ((InternalEList<?>)getHeaderrows()).basicRemove(otherEnd, msgs);
      case RDslPackage.TABLE__DETAILROWS:
        return ((InternalEList<?>)getDetailrows()).basicRemove(otherEnd, msgs);
      case RDslPackage.TABLE__FOOTERROWS:
        return ((InternalEList<?>)getFooterrows()).basicRemove(otherEnd, msgs);
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
      case RDslPackage.TABLE__NAME:
        return getName();
      case RDslPackage.TABLE__PROPERTIES:
        return getProperties();
      case RDslPackage.TABLE__DATASET:
        if (resolve) return getDataset();
        return basicGetDataset();
      case RDslPackage.TABLE__COLUMNS:
        return getColumns();
      case RDslPackage.TABLE__HEADERROWS:
        return getHeaderrows();
      case RDslPackage.TABLE__DETAILROWS:
        return getDetailrows();
      case RDslPackage.TABLE__FOOTERROWS:
        return getFooterrows();
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
      case RDslPackage.TABLE__NAME:
        setName((String)newValue);
        return;
      case RDslPackage.TABLE__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends LabelProperties>)newValue);
        return;
      case RDslPackage.TABLE__DATASET:
        setDataset((Dataset)newValue);
        return;
      case RDslPackage.TABLE__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends Column>)newValue);
        return;
      case RDslPackage.TABLE__HEADERROWS:
        getHeaderrows().clear();
        getHeaderrows().addAll((Collection<? extends Row>)newValue);
        return;
      case RDslPackage.TABLE__DETAILROWS:
        getDetailrows().clear();
        getDetailrows().addAll((Collection<? extends Row>)newValue);
        return;
      case RDslPackage.TABLE__FOOTERROWS:
        getFooterrows().clear();
        getFooterrows().addAll((Collection<? extends Row>)newValue);
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
      case RDslPackage.TABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RDslPackage.TABLE__PROPERTIES:
        getProperties().clear();
        return;
      case RDslPackage.TABLE__DATASET:
        setDataset((Dataset)null);
        return;
      case RDslPackage.TABLE__COLUMNS:
        getColumns().clear();
        return;
      case RDslPackage.TABLE__HEADERROWS:
        getHeaderrows().clear();
        return;
      case RDslPackage.TABLE__DETAILROWS:
        getDetailrows().clear();
        return;
      case RDslPackage.TABLE__FOOTERROWS:
        getFooterrows().clear();
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
      case RDslPackage.TABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RDslPackage.TABLE__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case RDslPackage.TABLE__DATASET:
        return dataset != null;
      case RDslPackage.TABLE__COLUMNS:
        return columns != null && !columns.isEmpty();
      case RDslPackage.TABLE__HEADERROWS:
        return headerrows != null && !headerrows.isEmpty();
      case RDslPackage.TABLE__DETAILROWS:
        return detailrows != null && !detailrows.isEmpty();
      case RDslPackage.TABLE__FOOTERROWS:
        return footerrows != null && !footerrows.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //TableImpl
