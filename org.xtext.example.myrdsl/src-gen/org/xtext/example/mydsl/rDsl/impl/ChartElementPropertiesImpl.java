/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDsl.Border;
import org.xtext.example.mydsl.rDsl.ChartElementProperties;
import org.xtext.example.mydsl.rDsl.Color;
import org.xtext.example.mydsl.rDsl.Display;
import org.xtext.example.mydsl.rDsl.Font;
import org.xtext.example.mydsl.rDsl.FontSize;
import org.xtext.example.mydsl.rDsl.HAlignment;
import org.xtext.example.mydsl.rDsl.Padding;
import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.StyleRef;
import org.xtext.example.mydsl.rDsl.TextStyle;
import org.xtext.example.mydsl.rDsl.VAlignment;
import org.xtext.example.mydsl.rDsl.Visibility;
import org.xtext.example.mydsl.rDsl.Whitespace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart Element Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getHAlign <em>HAlign</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getVAlign <em>VAlign</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getWhiteSpace <em>White Space</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartElementPropertiesImpl#getDisplay <em>Display</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChartElementPropertiesImpl extends MinimalEObjectImpl.Container implements ChartElementProperties
{
  /**
   * The cached value of the '{@link #getPadding() <em>Padding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPadding()
   * @generated
   * @ordered
   */
  protected Padding padding;

  /**
   * The cached value of the '{@link #getBorder() <em>Border</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorder()
   * @generated
   * @ordered
   */
  protected Border border;

  /**
   * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVisibility()
   * @generated
   * @ordered
   */
  protected Visibility visibility;

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
   * The cached value of the '{@link #getColor() <em>Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color;

  /**
   * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackgroundColor()
   * @generated
   * @ordered
   */
  protected Color backgroundColor;

  /**
   * The cached value of the '{@link #getTextStyle() <em>Text Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTextStyle()
   * @generated
   * @ordered
   */
  protected TextStyle textStyle;

  /**
   * The cached value of the '{@link #getHAlign() <em>HAlign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHAlign()
   * @generated
   * @ordered
   */
  protected HAlignment hAlign;

  /**
   * The cached value of the '{@link #getVAlign() <em>VAlign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVAlign()
   * @generated
   * @ordered
   */
  protected VAlignment vAlign;

  /**
   * The cached value of the '{@link #getWhiteSpace() <em>White Space</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWhiteSpace()
   * @generated
   * @ordered
   */
  protected Whitespace whiteSpace;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected StyleRef style;

  /**
   * The cached value of the '{@link #getDisplay() <em>Display</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDisplay()
   * @generated
   * @ordered
   */
  protected Display display;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChartElementPropertiesImpl()
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
    return RDslPackage.eINSTANCE.getChartElementProperties();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Padding getPadding()
  {
    return padding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPadding(Padding newPadding, NotificationChain msgs)
  {
    Padding oldPadding = padding;
    padding = newPadding;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__PADDING, oldPadding, newPadding);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPadding(Padding newPadding)
  {
    if (newPadding != padding)
    {
      NotificationChain msgs = null;
      if (padding != null)
        msgs = ((InternalEObject)padding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__PADDING, null, msgs);
      if (newPadding != null)
        msgs = ((InternalEObject)newPadding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__PADDING, null, msgs);
      msgs = basicSetPadding(newPadding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__PADDING, newPadding, newPadding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Border getBorder()
  {
    return border;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBorder(Border newBorder, NotificationChain msgs)
  {
    Border oldBorder = border;
    border = newBorder;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__BORDER, oldBorder, newBorder);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBorder(Border newBorder)
  {
    if (newBorder != border)
    {
      NotificationChain msgs = null;
      if (border != null)
        msgs = ((InternalEObject)border).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__BORDER, null, msgs);
      if (newBorder != null)
        msgs = ((InternalEObject)newBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__BORDER, null, msgs);
      msgs = basicSetBorder(newBorder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__BORDER, newBorder, newBorder));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Visibility getVisibility()
  {
    return visibility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVisibility(Visibility newVisibility, NotificationChain msgs)
  {
    Visibility oldVisibility = visibility;
    visibility = newVisibility;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__VISIBILITY, oldVisibility, newVisibility);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVisibility(Visibility newVisibility)
  {
    if (newVisibility != visibility)
    {
      NotificationChain msgs = null;
      if (visibility != null)
        msgs = ((InternalEObject)visibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__VISIBILITY, null, msgs);
      if (newVisibility != null)
        msgs = ((InternalEObject)newVisibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__VISIBILITY, null, msgs);
      msgs = basicSetVisibility(newVisibility, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__VISIBILITY, newVisibility, newVisibility));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__FONT, oldFont, newFont);
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
        msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__FONT, null, msgs);
      if (newFont != null)
        msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__FONT, null, msgs);
      msgs = basicSetFont(newFont, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__FONT, newFont, newFont));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__FONT_SIZE, oldFontSize, newFontSize);
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
        msgs = ((InternalEObject)fontSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__FONT_SIZE, null, msgs);
      if (newFontSize != null)
        msgs = ((InternalEObject)newFontSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__FONT_SIZE, null, msgs);
      msgs = basicSetFontSize(newFontSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__FONT_SIZE, newFontSize, newFontSize));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetColor(Color newColor, NotificationChain msgs)
  {
    Color oldColor = color;
    color = newColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__COLOR, oldColor, newColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(Color newColor)
  {
    if (newColor != color)
    {
      NotificationChain msgs = null;
      if (color != null)
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__COLOR, newColor, newColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getBackgroundColor()
  {
    return backgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBackgroundColor(Color newBackgroundColor, NotificationChain msgs)
  {
    Color oldBackgroundColor = backgroundColor;
    backgroundColor = newBackgroundColor;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__BACKGROUND_COLOR, oldBackgroundColor, newBackgroundColor);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackgroundColor(Color newBackgroundColor)
  {
    if (newBackgroundColor != backgroundColor)
    {
      NotificationChain msgs = null;
      if (backgroundColor != null)
        msgs = ((InternalEObject)backgroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__BACKGROUND_COLOR, null, msgs);
      if (newBackgroundColor != null)
        msgs = ((InternalEObject)newBackgroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__BACKGROUND_COLOR, null, msgs);
      msgs = basicSetBackgroundColor(newBackgroundColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__BACKGROUND_COLOR, newBackgroundColor, newBackgroundColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextStyle getTextStyle()
  {
    return textStyle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTextStyle(TextStyle newTextStyle, NotificationChain msgs)
  {
    TextStyle oldTextStyle = textStyle;
    textStyle = newTextStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__TEXT_STYLE, oldTextStyle, newTextStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTextStyle(TextStyle newTextStyle)
  {
    if (newTextStyle != textStyle)
    {
      NotificationChain msgs = null;
      if (textStyle != null)
        msgs = ((InternalEObject)textStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__TEXT_STYLE, null, msgs);
      if (newTextStyle != null)
        msgs = ((InternalEObject)newTextStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__TEXT_STYLE, null, msgs);
      msgs = basicSetTextStyle(newTextStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__TEXT_STYLE, newTextStyle, newTextStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HAlignment getHAlign()
  {
    return hAlign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHAlign(HAlignment newHAlign, NotificationChain msgs)
  {
    HAlignment oldHAlign = hAlign;
    hAlign = newHAlign;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__HALIGN, oldHAlign, newHAlign);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHAlign(HAlignment newHAlign)
  {
    if (newHAlign != hAlign)
    {
      NotificationChain msgs = null;
      if (hAlign != null)
        msgs = ((InternalEObject)hAlign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__HALIGN, null, msgs);
      if (newHAlign != null)
        msgs = ((InternalEObject)newHAlign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__HALIGN, null, msgs);
      msgs = basicSetHAlign(newHAlign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__HALIGN, newHAlign, newHAlign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VAlignment getVAlign()
  {
    return vAlign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVAlign(VAlignment newVAlign, NotificationChain msgs)
  {
    VAlignment oldVAlign = vAlign;
    vAlign = newVAlign;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__VALIGN, oldVAlign, newVAlign);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVAlign(VAlignment newVAlign)
  {
    if (newVAlign != vAlign)
    {
      NotificationChain msgs = null;
      if (vAlign != null)
        msgs = ((InternalEObject)vAlign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__VALIGN, null, msgs);
      if (newVAlign != null)
        msgs = ((InternalEObject)newVAlign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__VALIGN, null, msgs);
      msgs = basicSetVAlign(newVAlign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__VALIGN, newVAlign, newVAlign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Whitespace getWhiteSpace()
  {
    return whiteSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWhiteSpace(Whitespace newWhiteSpace, NotificationChain msgs)
  {
    Whitespace oldWhiteSpace = whiteSpace;
    whiteSpace = newWhiteSpace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__WHITE_SPACE, oldWhiteSpace, newWhiteSpace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWhiteSpace(Whitespace newWhiteSpace)
  {
    if (newWhiteSpace != whiteSpace)
    {
      NotificationChain msgs = null;
      if (whiteSpace != null)
        msgs = ((InternalEObject)whiteSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__WHITE_SPACE, null, msgs);
      if (newWhiteSpace != null)
        msgs = ((InternalEObject)newWhiteSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__WHITE_SPACE, null, msgs);
      msgs = basicSetWhiteSpace(newWhiteSpace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__WHITE_SPACE, newWhiteSpace, newWhiteSpace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StyleRef getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStyle(StyleRef newStyle, NotificationChain msgs)
  {
    StyleRef oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__STYLE, oldStyle, newStyle);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(StyleRef newStyle)
  {
    if (newStyle != style)
    {
      NotificationChain msgs = null;
      if (style != null)
        msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__STYLE, null, msgs);
      if (newStyle != null)
        msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__STYLE, null, msgs);
      msgs = basicSetStyle(newStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__STYLE, newStyle, newStyle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Display getDisplay()
  {
    return display;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDisplay(Display newDisplay, NotificationChain msgs)
  {
    Display oldDisplay = display;
    display = newDisplay;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__DISPLAY, oldDisplay, newDisplay);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDisplay(Display newDisplay)
  {
    if (newDisplay != display)
    {
      NotificationChain msgs = null;
      if (display != null)
        msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__DISPLAY, null, msgs);
      if (newDisplay != null)
        msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART_ELEMENT_PROPERTIES__DISPLAY, null, msgs);
      msgs = basicSetDisplay(newDisplay, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART_ELEMENT_PROPERTIES__DISPLAY, newDisplay, newDisplay));
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
      case RDslPackage.CHART_ELEMENT_PROPERTIES__PADDING:
        return basicSetPadding(null, msgs);
      case RDslPackage.CHART_ELEMENT_PROPERTIES__BORDER:
        return basicSetBorder(null, msgs);
      case RDslPackage.CHART_ELEMENT_PROPERTIES__VISIBILITY:
        return basicSetVisibility(null, msgs);
      case RDslPackage.CHART_ELEMENT_PROPERTIES__FONT:
        return basicSetFont(null, msgs);
      case RDslPackage.CHART_ELEMENT_PROPERTIES__FONT_SIZE:
        return basicSetFontSize(null, msgs);
      case RDslPackage.CHART_ELEMENT_PROPERTIES__COLOR:
        return basicSetColor(null, msgs);
      case RDslPackage.CHART_ELEMENT_PROPERTIES__BACKGROUND_COLOR:
        return basicSetBackgroundColor(null, msgs);
      case RDslPackage.CHART_ELEMENT_PROPERTIES__TEXT_STYLE:
        return basicSetTextStyle(null, msgs);
      case RDslPackage.CHART_ELEMENT_PROPERTIES__HALIGN:
        return basicSetHAlign(null, msgs);
      case RDslPackage.CHART_ELEMENT_PROPERTIES__VALIGN:
        return basicSetVAlign(null, msgs);
      case RDslPackage.CHART_ELEMENT_PROPERTIES__WHITE_SPACE:
        return basicSetWhiteSpace(null, msgs);
      case RDslPackage.CHART_ELEMENT_PROPERTIES__STYLE:
        return basicSetStyle(null, msgs);
      case RDslPackage.CHART_ELEMENT_PROPERTIES__DISPLAY:
        return basicSetDisplay(null, msgs);
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
      case RDslPackage.CHART_ELEMENT_PROPERTIES__PADDING:
        return getPadding();
      case RDslPackage.CHART_ELEMENT_PROPERTIES__BORDER:
        return getBorder();
      case RDslPackage.CHART_ELEMENT_PROPERTIES__VISIBILITY:
        return getVisibility();
      case RDslPackage.CHART_ELEMENT_PROPERTIES__FONT:
        return getFont();
      case RDslPackage.CHART_ELEMENT_PROPERTIES__FONT_SIZE:
        return getFontSize();
      case RDslPackage.CHART_ELEMENT_PROPERTIES__COLOR:
        return getColor();
      case RDslPackage.CHART_ELEMENT_PROPERTIES__BACKGROUND_COLOR:
        return getBackgroundColor();
      case RDslPackage.CHART_ELEMENT_PROPERTIES__TEXT_STYLE:
        return getTextStyle();
      case RDslPackage.CHART_ELEMENT_PROPERTIES__HALIGN:
        return getHAlign();
      case RDslPackage.CHART_ELEMENT_PROPERTIES__VALIGN:
        return getVAlign();
      case RDslPackage.CHART_ELEMENT_PROPERTIES__WHITE_SPACE:
        return getWhiteSpace();
      case RDslPackage.CHART_ELEMENT_PROPERTIES__STYLE:
        return getStyle();
      case RDslPackage.CHART_ELEMENT_PROPERTIES__DISPLAY:
        return getDisplay();
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
      case RDslPackage.CHART_ELEMENT_PROPERTIES__PADDING:
        setPadding((Padding)newValue);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__BORDER:
        setBorder((Border)newValue);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__VISIBILITY:
        setVisibility((Visibility)newValue);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__FONT:
        setFont((Font)newValue);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__FONT_SIZE:
        setFontSize((FontSize)newValue);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__COLOR:
        setColor((Color)newValue);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__BACKGROUND_COLOR:
        setBackgroundColor((Color)newValue);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__TEXT_STYLE:
        setTextStyle((TextStyle)newValue);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__HALIGN:
        setHAlign((HAlignment)newValue);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__VALIGN:
        setVAlign((VAlignment)newValue);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__WHITE_SPACE:
        setWhiteSpace((Whitespace)newValue);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__STYLE:
        setStyle((StyleRef)newValue);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__DISPLAY:
        setDisplay((Display)newValue);
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
      case RDslPackage.CHART_ELEMENT_PROPERTIES__PADDING:
        setPadding((Padding)null);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__BORDER:
        setBorder((Border)null);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__VISIBILITY:
        setVisibility((Visibility)null);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__FONT:
        setFont((Font)null);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__FONT_SIZE:
        setFontSize((FontSize)null);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__COLOR:
        setColor((Color)null);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__BACKGROUND_COLOR:
        setBackgroundColor((Color)null);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__TEXT_STYLE:
        setTextStyle((TextStyle)null);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__HALIGN:
        setHAlign((HAlignment)null);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__VALIGN:
        setVAlign((VAlignment)null);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__WHITE_SPACE:
        setWhiteSpace((Whitespace)null);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__STYLE:
        setStyle((StyleRef)null);
        return;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__DISPLAY:
        setDisplay((Display)null);
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
      case RDslPackage.CHART_ELEMENT_PROPERTIES__PADDING:
        return padding != null;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__BORDER:
        return border != null;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__VISIBILITY:
        return visibility != null;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__FONT:
        return font != null;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__FONT_SIZE:
        return fontSize != null;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__COLOR:
        return color != null;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__BACKGROUND_COLOR:
        return backgroundColor != null;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__TEXT_STYLE:
        return textStyle != null;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__HALIGN:
        return hAlign != null;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__VALIGN:
        return vAlign != null;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__WHITE_SPACE:
        return whiteSpace != null;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__STYLE:
        return style != null;
      case RDslPackage.CHART_ELEMENT_PROPERTIES__DISPLAY:
        return display != null;
    }
    return super.eIsSet(featureID);
  }

} //ChartElementPropertiesImpl
