/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDsl.ColorPalette;
import org.xtext.example.mydsl.rDsl.ElementProperty;
import org.xtext.example.mydsl.rDsl.Font;
import org.xtext.example.mydsl.rDsl.FontSize;
import org.xtext.example.mydsl.rDsl.RDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ElementPropertyImpl#getColorpalette <em>Colorpalette</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ElementPropertyImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ElementPropertyImpl#getFontSize <em>Font Size</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementPropertyImpl extends MinimalEObjectImpl.Container implements ElementProperty
{
  /**
   * The cached value of the '{@link #getColorpalette() <em>Colorpalette</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColorpalette()
   * @generated
   * @ordered
   */
  protected ColorPalette colorpalette;

  /**
   * The cached value of the '{@link #getFont() <em>Font</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFont()
   * @generated
   * @ordered
   */
  protected Font font;

  /**
   * The cached value of the '{@link #getFontSize() <em>Font Size</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFontSize()
   * @generated
   * @ordered
   */
  protected FontSize fontSize;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementPropertyImpl()
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
    return RDslPackage.eINSTANCE.getElementProperty();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ColorPalette getColorpalette()
  {
    return colorpalette;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColorpalette(ColorPalette newColorpalette, NotificationChain msgs)
  {
    ColorPalette oldColorpalette = colorpalette;
    colorpalette = newColorpalette;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.ELEMENT_PROPERTY__COLORPALETTE, oldColorpalette, newColorpalette);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColorpalette(ColorPalette newColorpalette)
  {
    if (newColorpalette != colorpalette)
    {
      NotificationChain msgs = null;
      if (colorpalette != null)
        msgs = ((InternalEObject)colorpalette).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.ELEMENT_PROPERTY__COLORPALETTE, null, msgs);
      if (newColorpalette != null)
        msgs = ((InternalEObject)newColorpalette).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.ELEMENT_PROPERTY__COLORPALETTE, null, msgs);
      msgs = basicSetColorpalette(newColorpalette, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.ELEMENT_PROPERTY__COLORPALETTE, newColorpalette, newColorpalette));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Font getFont()
  {
    return font;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFont(Font newFont, NotificationChain msgs)
  {
    Font oldFont = font;
    font = newFont;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.ELEMENT_PROPERTY__FONT, oldFont, newFont);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFont(Font newFont)
  {
    if (newFont != font)
    {
      NotificationChain msgs = null;
      if (font != null)
        msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.ELEMENT_PROPERTY__FONT, null, msgs);
      if (newFont != null)
        msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.ELEMENT_PROPERTY__FONT, null, msgs);
      msgs = basicSetFont(newFont, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.ELEMENT_PROPERTY__FONT, newFont, newFont));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FontSize getFontSize()
  {
    return fontSize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFontSize(FontSize newFontSize, NotificationChain msgs)
  {
    FontSize oldFontSize = fontSize;
    fontSize = newFontSize;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.ELEMENT_PROPERTY__FONT_SIZE, oldFontSize, newFontSize);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFontSize(FontSize newFontSize)
  {
    if (newFontSize != fontSize)
    {
      NotificationChain msgs = null;
      if (fontSize != null)
        msgs = ((InternalEObject)fontSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.ELEMENT_PROPERTY__FONT_SIZE, null, msgs);
      if (newFontSize != null)
        msgs = ((InternalEObject)newFontSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.ELEMENT_PROPERTY__FONT_SIZE, null, msgs);
      msgs = basicSetFontSize(newFontSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.ELEMENT_PROPERTY__FONT_SIZE, newFontSize, newFontSize));
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
      case RDslPackage.ELEMENT_PROPERTY__COLORPALETTE:
        return basicSetColorpalette(null, msgs);
      case RDslPackage.ELEMENT_PROPERTY__FONT:
        return basicSetFont(null, msgs);
      case RDslPackage.ELEMENT_PROPERTY__FONT_SIZE:
        return basicSetFontSize(null, msgs);
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
      case RDslPackage.ELEMENT_PROPERTY__COLORPALETTE:
        return getColorpalette();
      case RDslPackage.ELEMENT_PROPERTY__FONT:
        return getFont();
      case RDslPackage.ELEMENT_PROPERTY__FONT_SIZE:
        return getFontSize();
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
      case RDslPackage.ELEMENT_PROPERTY__COLORPALETTE:
        setColorpalette((ColorPalette)newValue);
        return;
      case RDslPackage.ELEMENT_PROPERTY__FONT:
        setFont((Font)newValue);
        return;
      case RDslPackage.ELEMENT_PROPERTY__FONT_SIZE:
        setFontSize((FontSize)newValue);
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
      case RDslPackage.ELEMENT_PROPERTY__COLORPALETTE:
        setColorpalette((ColorPalette)null);
        return;
      case RDslPackage.ELEMENT_PROPERTY__FONT:
        setFont((Font)null);
        return;
      case RDslPackage.ELEMENT_PROPERTY__FONT_SIZE:
        setFontSize((FontSize)null);
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
      case RDslPackage.ELEMENT_PROPERTY__COLORPALETTE:
        return colorpalette != null;
      case RDslPackage.ELEMENT_PROPERTY__FONT:
        return font != null;
      case RDslPackage.ELEMENT_PROPERTY__FONT_SIZE:
        return fontSize != null;
    }
    return super.eIsSet(featureID);
  }

} //ElementPropertyImpl
