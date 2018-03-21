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

import org.xtext.example.mydsl.rDsl.LabelProperties;
import org.xtext.example.mydsl.rDsl.List;
import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.ReportElements;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ListImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ListImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ListImpl#getHeaderelements <em>Headerelements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ListImpl#getDetailelements <em>Detailelements</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ListImpl#getFooterelements <em>Footerelements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ListImpl extends ReportElementsImpl implements List
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
   * The cached value of the '{@link #getHeaderelements() <em>Headerelements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaderelements()
   * @generated
   * @ordered
   */
  protected EList<ReportElements> headerelements;

  /**
   * The cached value of the '{@link #getDetailelements() <em>Detailelements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetailelements()
   * @generated
   * @ordered
   */
  protected EList<ReportElements> detailelements;

  /**
   * The cached value of the '{@link #getFooterelements() <em>Footerelements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFooterelements()
   * @generated
   * @ordered
   */
  protected EList<ReportElements> footerelements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ListImpl()
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
    return RDslPackage.eINSTANCE.getList();
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
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.LIST__NAME, oldName, name));
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
      properties = new EObjectContainmentEList<LabelProperties>(LabelProperties.class, this, RDslPackage.LIST__PROPERTIES);
    }
    return properties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReportElements> getHeaderelements()
  {
    if (headerelements == null)
    {
      headerelements = new EObjectContainmentEList<ReportElements>(ReportElements.class, this, RDslPackage.LIST__HEADERELEMENTS);
    }
    return headerelements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReportElements> getDetailelements()
  {
    if (detailelements == null)
    {
      detailelements = new EObjectContainmentEList<ReportElements>(ReportElements.class, this, RDslPackage.LIST__DETAILELEMENTS);
    }
    return detailelements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReportElements> getFooterelements()
  {
    if (footerelements == null)
    {
      footerelements = new EObjectContainmentEList<ReportElements>(ReportElements.class, this, RDslPackage.LIST__FOOTERELEMENTS);
    }
    return footerelements;
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
      case RDslPackage.LIST__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case RDslPackage.LIST__HEADERELEMENTS:
        return ((InternalEList<?>)getHeaderelements()).basicRemove(otherEnd, msgs);
      case RDslPackage.LIST__DETAILELEMENTS:
        return ((InternalEList<?>)getDetailelements()).basicRemove(otherEnd, msgs);
      case RDslPackage.LIST__FOOTERELEMENTS:
        return ((InternalEList<?>)getFooterelements()).basicRemove(otherEnd, msgs);
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
      case RDslPackage.LIST__NAME:
        return getName();
      case RDslPackage.LIST__PROPERTIES:
        return getProperties();
      case RDslPackage.LIST__HEADERELEMENTS:
        return getHeaderelements();
      case RDslPackage.LIST__DETAILELEMENTS:
        return getDetailelements();
      case RDslPackage.LIST__FOOTERELEMENTS:
        return getFooterelements();
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
      case RDslPackage.LIST__NAME:
        setName((String)newValue);
        return;
      case RDslPackage.LIST__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends LabelProperties>)newValue);
        return;
      case RDslPackage.LIST__HEADERELEMENTS:
        getHeaderelements().clear();
        getHeaderelements().addAll((Collection<? extends ReportElements>)newValue);
        return;
      case RDslPackage.LIST__DETAILELEMENTS:
        getDetailelements().clear();
        getDetailelements().addAll((Collection<? extends ReportElements>)newValue);
        return;
      case RDslPackage.LIST__FOOTERELEMENTS:
        getFooterelements().clear();
        getFooterelements().addAll((Collection<? extends ReportElements>)newValue);
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
      case RDslPackage.LIST__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RDslPackage.LIST__PROPERTIES:
        getProperties().clear();
        return;
      case RDslPackage.LIST__HEADERELEMENTS:
        getHeaderelements().clear();
        return;
      case RDslPackage.LIST__DETAILELEMENTS:
        getDetailelements().clear();
        return;
      case RDslPackage.LIST__FOOTERELEMENTS:
        getFooterelements().clear();
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
      case RDslPackage.LIST__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RDslPackage.LIST__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case RDslPackage.LIST__HEADERELEMENTS:
        return headerelements != null && !headerelements.isEmpty();
      case RDslPackage.LIST__DETAILELEMENTS:
        return detailelements != null && !detailelements.isEmpty();
      case RDslPackage.LIST__FOOTERELEMENTS:
        return footerelements != null && !footerelements.isEmpty();
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

} //ListImpl
