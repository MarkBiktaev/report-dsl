/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDsl.Legend;
import org.xtext.example.mydsl.rDsl.LegendVisibility;
import org.xtext.example.mydsl.rDsl.OrientationType;
import org.xtext.example.mydsl.rDsl.Place;
import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.Title;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.LegendImpl#getPlace <em>Place</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.LegendImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.LegendImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.LegendImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LegendImpl extends MinimalEObjectImpl.Container implements Legend
{
  /**
   * The cached value of the '{@link #getPlace() <em>Place</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlace()
   * @generated
   * @ordered
   */
  protected Place place;

  /**
   * The default value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrientation()
   * @generated
   * @ordered
   */
  protected static final OrientationType ORIENTATION_EDEFAULT = OrientationType.VERTICAL;

  /**
   * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOrientation()
   * @generated
   * @ordered
   */
  protected OrientationType orientation = ORIENTATION_EDEFAULT;

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
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected LegendVisibility visibility;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LegendImpl()
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
    return RDslPackage.eINSTANCE.getLegend();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Place getPlace()
  {
    return place;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPlace(Place newPlace, NotificationChain msgs)
  {
    Place oldPlace = place;
    place = newPlace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.LEGEND__PLACE, oldPlace, newPlace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlace(Place newPlace)
  {
    if (newPlace != place)
    {
      NotificationChain msgs = null;
      if (place != null)
        msgs = ((InternalEObject)place).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.LEGEND__PLACE, null, msgs);
      if (newPlace != null)
        msgs = ((InternalEObject)newPlace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.LEGEND__PLACE, null, msgs);
      msgs = basicSetPlace(newPlace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.LEGEND__PLACE, newPlace, newPlace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OrientationType getOrientation()
  {
    return orientation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOrientation(OrientationType newOrientation)
  {
    OrientationType oldOrientation = orientation;
    orientation = newOrientation == null ? ORIENTATION_EDEFAULT : newOrientation;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.LEGEND__ORIENTATION, oldOrientation, orientation));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.LEGEND__TITLE, oldTitle, newTitle);
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
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.LEGEND__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.LEGEND__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.LEGEND__TITLE, newTitle, newTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LegendVisibility getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVisibility(LegendVisibility newVisibility, NotificationChain msgs)
  {
    LegendVisibility oldVisibility = visibility;
    visibility = newVisibility;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.LEGEND__VISIBILITY, oldVisibility, newVisibility);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(LegendVisibility newVisibility)
  {
    if (newVisibility != visibility)
    {
      NotificationChain msgs = null;
      if (visibility != null)
        msgs = ((InternalEObject)visibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.LEGEND__VISIBILITY, null, msgs);
      if (newVisibility != null)
        msgs = ((InternalEObject)newVisibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.LEGEND__VISIBILITY, null, msgs);
      msgs = basicSetVisibility(newVisibility, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.LEGEND__VISIBILITY, newVisibility, newVisibility));
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
      case RDslPackage.LEGEND__PLACE:
        return basicSetPlace(null, msgs);
      case RDslPackage.LEGEND__TITLE:
        return basicSetTitle(null, msgs);
      case RDslPackage.LEGEND__VISIBILITY:
        return basicSetVisibility(null, msgs);
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
      case RDslPackage.LEGEND__PLACE:
        return getPlace();
      case RDslPackage.LEGEND__ORIENTATION:
        return getOrientation();
      case RDslPackage.LEGEND__TITLE:
        return getTitle();
      case RDslPackage.LEGEND__VISIBILITY:
        return getVisibility();
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
      case RDslPackage.LEGEND__PLACE:
        setPlace((Place)newValue);
        return;
      case RDslPackage.LEGEND__ORIENTATION:
        setOrientation((OrientationType)newValue);
        return;
      case RDslPackage.LEGEND__TITLE:
        setTitle((Title)newValue);
        return;
      case RDslPackage.LEGEND__VISIBILITY:
        setVisibility((LegendVisibility)newValue);
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
      case RDslPackage.LEGEND__PLACE:
        setPlace((Place)null);
        return;
      case RDslPackage.LEGEND__ORIENTATION:
        setOrientation(ORIENTATION_EDEFAULT);
        return;
      case RDslPackage.LEGEND__TITLE:
        setTitle((Title)null);
        return;
      case RDslPackage.LEGEND__VISIBILITY:
        setVisibility((LegendVisibility)null);
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
      case RDslPackage.LEGEND__PLACE:
        return place != null;
      case RDslPackage.LEGEND__ORIENTATION:
        return orientation != ORIENTATION_EDEFAULT;
      case RDslPackage.LEGEND__TITLE:
        return title != null;
      case RDslPackage.LEGEND__VISIBILITY:
        return visibility != null;
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
    result.append(" (orientation: ");
    result.append(orientation);
    result.append(')');
    return result.toString();
  }

} //LegendImpl
