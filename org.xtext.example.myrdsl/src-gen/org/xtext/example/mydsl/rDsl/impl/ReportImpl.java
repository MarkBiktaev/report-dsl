/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDsl.Body;
import org.xtext.example.mydsl.rDsl.Datasets;
import org.xtext.example.mydsl.rDsl.Datasources;
import org.xtext.example.mydsl.rDsl.PageSetup;
import org.xtext.example.mydsl.rDsl.Parameters;
import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.Report;
import org.xtext.example.mydsl.rDsl.Styles;
import org.xtext.example.mydsl.rDsl.elementProperties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ReportImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ReportImpl#getDatasources <em>Datasources</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ReportImpl#getDatasets <em>Datasets</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ReportImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ReportImpl#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ReportImpl#getPagesetup <em>Pagesetup</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ReportImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ReportImpl#getElementProperties <em>Element Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReportImpl extends MinimalEObjectImpl.Container implements Report
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
   * The cached value of the '{@link #getDatasources() <em>Datasources</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatasources()
   * @generated
   * @ordered
   */
  protected Datasources datasources;

  /**
   * The cached value of the '{@link #getDatasets() <em>Datasets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDatasets()
   * @generated
   * @ordered
   */
  protected Datasets datasets;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected Parameters parameters;

  /**
   * The cached value of the '{@link #getStyles() <em>Styles</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyles()
   * @generated
   * @ordered
   */
  protected Styles styles;

  /**
   * The cached value of the '{@link #getPagesetup() <em>Pagesetup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPagesetup()
   * @generated
   * @ordered
   */
  protected PageSetup pagesetup;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected Body body;

  /**
   * The cached value of the '{@link #getElementProperties() <em>Element Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementProperties()
   * @generated
   * @ordered
   */
  protected elementProperties elementProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReportImpl()
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
    return RDslPackage.eINSTANCE.getReport();
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
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datasources getDatasources()
  {
    return datasources;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatasources(Datasources newDatasources, NotificationChain msgs)
  {
    Datasources oldDatasources = datasources;
    datasources = newDatasources;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__DATASOURCES, oldDatasources, newDatasources);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatasources(Datasources newDatasources)
  {
    if (newDatasources != datasources)
    {
      NotificationChain msgs = null;
      if (datasources != null)
        msgs = ((InternalEObject)datasources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__DATASOURCES, null, msgs);
      if (newDatasources != null)
        msgs = ((InternalEObject)newDatasources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__DATASOURCES, null, msgs);
      msgs = basicSetDatasources(newDatasources, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__DATASOURCES, newDatasources, newDatasources));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Datasets getDatasets()
  {
    return datasets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDatasets(Datasets newDatasets, NotificationChain msgs)
  {
    Datasets oldDatasets = datasets;
    datasets = newDatasets;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__DATASETS, oldDatasets, newDatasets);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDatasets(Datasets newDatasets)
  {
    if (newDatasets != datasets)
    {
      NotificationChain msgs = null;
      if (datasets != null)
        msgs = ((InternalEObject)datasets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__DATASETS, null, msgs);
      if (newDatasets != null)
        msgs = ((InternalEObject)newDatasets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__DATASETS, null, msgs);
      msgs = basicSetDatasets(newDatasets, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__DATASETS, newDatasets, newDatasets));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parameters getParameters()
  {
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetParameters(Parameters newParameters, NotificationChain msgs)
  {
    Parameters oldParameters = parameters;
    parameters = newParameters;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__PARAMETERS, oldParameters, newParameters);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setParameters(Parameters newParameters)
  {
    if (newParameters != parameters)
    {
      NotificationChain msgs = null;
      if (parameters != null)
        msgs = ((InternalEObject)parameters).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__PARAMETERS, null, msgs);
      if (newParameters != null)
        msgs = ((InternalEObject)newParameters).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__PARAMETERS, null, msgs);
      msgs = basicSetParameters(newParameters, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__PARAMETERS, newParameters, newParameters));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Styles getStyles()
  {
    return styles;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyles(Styles newStyles, NotificationChain msgs)
  {
    Styles oldStyles = styles;
    styles = newStyles;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__STYLES, oldStyles, newStyles);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyles(Styles newStyles)
  {
    if (newStyles != styles)
    {
      NotificationChain msgs = null;
      if (styles != null)
        msgs = ((InternalEObject)styles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__STYLES, null, msgs);
      if (newStyles != null)
        msgs = ((InternalEObject)newStyles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__STYLES, null, msgs);
      msgs = basicSetStyles(newStyles, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__STYLES, newStyles, newStyles));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageSetup getPagesetup()
  {
    return pagesetup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPagesetup(PageSetup newPagesetup, NotificationChain msgs)
  {
    PageSetup oldPagesetup = pagesetup;
    pagesetup = newPagesetup;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__PAGESETUP, oldPagesetup, newPagesetup);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPagesetup(PageSetup newPagesetup)
  {
    if (newPagesetup != pagesetup)
    {
      NotificationChain msgs = null;
      if (pagesetup != null)
        msgs = ((InternalEObject)pagesetup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__PAGESETUP, null, msgs);
      if (newPagesetup != null)
        msgs = ((InternalEObject)newPagesetup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__PAGESETUP, null, msgs);
      msgs = basicSetPagesetup(newPagesetup, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__PAGESETUP, newPagesetup, newPagesetup));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Body getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(Body newBody, NotificationChain msgs)
  {
    Body oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(Body newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__BODY, newBody, newBody));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public elementProperties getElementProperties()
  {
    return elementProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementProperties(elementProperties newElementProperties, NotificationChain msgs)
  {
    elementProperties oldElementProperties = elementProperties;
    elementProperties = newElementProperties;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__ELEMENT_PROPERTIES, oldElementProperties, newElementProperties);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementProperties(elementProperties newElementProperties)
  {
    if (newElementProperties != elementProperties)
    {
      NotificationChain msgs = null;
      if (elementProperties != null)
        msgs = ((InternalEObject)elementProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__ELEMENT_PROPERTIES, null, msgs);
      if (newElementProperties != null)
        msgs = ((InternalEObject)newElementProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.REPORT__ELEMENT_PROPERTIES, null, msgs);
      msgs = basicSetElementProperties(newElementProperties, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.REPORT__ELEMENT_PROPERTIES, newElementProperties, newElementProperties));
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
      case RDslPackage.REPORT__DATASOURCES:
        return basicSetDatasources(null, msgs);
      case RDslPackage.REPORT__DATASETS:
        return basicSetDatasets(null, msgs);
      case RDslPackage.REPORT__PARAMETERS:
        return basicSetParameters(null, msgs);
      case RDslPackage.REPORT__STYLES:
        return basicSetStyles(null, msgs);
      case RDslPackage.REPORT__PAGESETUP:
        return basicSetPagesetup(null, msgs);
      case RDslPackage.REPORT__BODY:
        return basicSetBody(null, msgs);
      case RDslPackage.REPORT__ELEMENT_PROPERTIES:
        return basicSetElementProperties(null, msgs);
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
      case RDslPackage.REPORT__NAME:
        return getName();
      case RDslPackage.REPORT__DATASOURCES:
        return getDatasources();
      case RDslPackage.REPORT__DATASETS:
        return getDatasets();
      case RDslPackage.REPORT__PARAMETERS:
        return getParameters();
      case RDslPackage.REPORT__STYLES:
        return getStyles();
      case RDslPackage.REPORT__PAGESETUP:
        return getPagesetup();
      case RDslPackage.REPORT__BODY:
        return getBody();
      case RDslPackage.REPORT__ELEMENT_PROPERTIES:
        return getElementProperties();
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
      case RDslPackage.REPORT__NAME:
        setName((String)newValue);
        return;
      case RDslPackage.REPORT__DATASOURCES:
        setDatasources((Datasources)newValue);
        return;
      case RDslPackage.REPORT__DATASETS:
        setDatasets((Datasets)newValue);
        return;
      case RDslPackage.REPORT__PARAMETERS:
        setParameters((Parameters)newValue);
        return;
      case RDslPackage.REPORT__STYLES:
        setStyles((Styles)newValue);
        return;
      case RDslPackage.REPORT__PAGESETUP:
        setPagesetup((PageSetup)newValue);
        return;
      case RDslPackage.REPORT__BODY:
        setBody((Body)newValue);
        return;
      case RDslPackage.REPORT__ELEMENT_PROPERTIES:
        setElementProperties((elementProperties)newValue);
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
      case RDslPackage.REPORT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RDslPackage.REPORT__DATASOURCES:
        setDatasources((Datasources)null);
        return;
      case RDslPackage.REPORT__DATASETS:
        setDatasets((Datasets)null);
        return;
      case RDslPackage.REPORT__PARAMETERS:
        setParameters((Parameters)null);
        return;
      case RDslPackage.REPORT__STYLES:
        setStyles((Styles)null);
        return;
      case RDslPackage.REPORT__PAGESETUP:
        setPagesetup((PageSetup)null);
        return;
      case RDslPackage.REPORT__BODY:
        setBody((Body)null);
        return;
      case RDslPackage.REPORT__ELEMENT_PROPERTIES:
        setElementProperties((elementProperties)null);
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
      case RDslPackage.REPORT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RDslPackage.REPORT__DATASOURCES:
        return datasources != null;
      case RDslPackage.REPORT__DATASETS:
        return datasets != null;
      case RDslPackage.REPORT__PARAMETERS:
        return parameters != null;
      case RDslPackage.REPORT__STYLES:
        return styles != null;
      case RDslPackage.REPORT__PAGESETUP:
        return pagesetup != null;
      case RDslPackage.REPORT__BODY:
        return body != null;
      case RDslPackage.REPORT__ELEMENT_PROPERTIES:
        return elementProperties != null;
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

} //ReportImpl
