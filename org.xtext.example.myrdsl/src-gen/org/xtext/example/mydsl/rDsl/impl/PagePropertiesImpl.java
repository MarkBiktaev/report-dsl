/**
 */
package org.xtext.example.mydsl.rDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.rDsl.Bookmark;
import org.xtext.example.mydsl.rDsl.Border;
import org.xtext.example.mydsl.rDsl.Color;
import org.xtext.example.mydsl.rDsl.Display;
import org.xtext.example.mydsl.rDsl.Font;
import org.xtext.example.mydsl.rDsl.FontSize;
import org.xtext.example.mydsl.rDsl.HAlignment;
import org.xtext.example.mydsl.rDsl.Height;
import org.xtext.example.mydsl.rDsl.Padding;
import org.xtext.example.mydsl.rDsl.PageBreak;
import org.xtext.example.mydsl.rDsl.PageProperties;
import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.StyleRef;
import org.xtext.example.mydsl.rDsl.TextStyle;
import org.xtext.example.mydsl.rDsl.Toc;
import org.xtext.example.mydsl.rDsl.VAlignment;
import org.xtext.example.mydsl.rDsl.Visibility;
import org.xtext.example.mydsl.rDsl.Whitespace;
import org.xtext.example.mydsl.rDsl.Width;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getFont <em>Font</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getHAlign <em>HAlign</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getVAlign <em>VAlign</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getWhiteSpace <em>White Space</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getDisplay <em>Display</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getBorder <em>Border</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getPagebreak <em>Pagebreak</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getToc <em>Toc</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getBookmark <em>Bookmark</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.PagePropertiesImpl#getHeight <em>Height</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PagePropertiesImpl extends MinimalEObjectImpl.Container implements PageProperties
{
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
   * The cached value of the '{@link #getBorder() <em>Border</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBorder()
   * @generated
   * @ordered
   */
  protected Border border;

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
   * The cached value of the '{@link #getMargin() <em>Margin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMargin()
   * @generated
   * @ordered
   */
  protected Padding margin;

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
   * The cached value of the '{@link #getPagebreak() <em>Pagebreak</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPagebreak()
   * @generated
   * @ordered
   */
  protected PageBreak pagebreak;

  /**
   * The cached value of the '{@link #getToc() <em>Toc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getToc()
   * @generated
   * @ordered
   */
  protected Toc toc;

  /**
   * The cached value of the '{@link #getBookmark() <em>Bookmark</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBookmark()
   * @generated
   * @ordered
   */
  protected Bookmark bookmark;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected Width width;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected Height height;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PagePropertiesImpl()
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
    return RDslPackage.eINSTANCE.getPageProperties();
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__FONT, oldFont, newFont);
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
        msgs = ((InternalEObject)font).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__FONT, null, msgs);
      if (newFont != null)
        msgs = ((InternalEObject)newFont).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__FONT, null, msgs);
      msgs = basicSetFont(newFont, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__FONT, newFont, newFont));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__FONT_SIZE, oldFontSize, newFontSize);
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
        msgs = ((InternalEObject)fontSize).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__FONT_SIZE, null, msgs);
      if (newFontSize != null)
        msgs = ((InternalEObject)newFontSize).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__FONT_SIZE, null, msgs);
      msgs = basicSetFontSize(newFontSize, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__FONT_SIZE, newFontSize, newFontSize));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__COLOR, oldColor, newColor);
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
        msgs = ((InternalEObject)color).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__COLOR, null, msgs);
      if (newColor != null)
        msgs = ((InternalEObject)newColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__COLOR, null, msgs);
      msgs = basicSetColor(newColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__COLOR, newColor, newColor));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__BACKGROUND_COLOR, oldBackgroundColor, newBackgroundColor);
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
        msgs = ((InternalEObject)backgroundColor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__BACKGROUND_COLOR, null, msgs);
      if (newBackgroundColor != null)
        msgs = ((InternalEObject)newBackgroundColor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__BACKGROUND_COLOR, null, msgs);
      msgs = basicSetBackgroundColor(newBackgroundColor, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__BACKGROUND_COLOR, newBackgroundColor, newBackgroundColor));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__TEXT_STYLE, oldTextStyle, newTextStyle);
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
        msgs = ((InternalEObject)textStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__TEXT_STYLE, null, msgs);
      if (newTextStyle != null)
        msgs = ((InternalEObject)newTextStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__TEXT_STYLE, null, msgs);
      msgs = basicSetTextStyle(newTextStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__TEXT_STYLE, newTextStyle, newTextStyle));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__HALIGN, oldHAlign, newHAlign);
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
        msgs = ((InternalEObject)hAlign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__HALIGN, null, msgs);
      if (newHAlign != null)
        msgs = ((InternalEObject)newHAlign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__HALIGN, null, msgs);
      msgs = basicSetHAlign(newHAlign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__HALIGN, newHAlign, newHAlign));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__VALIGN, oldVAlign, newVAlign);
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
        msgs = ((InternalEObject)vAlign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__VALIGN, null, msgs);
      if (newVAlign != null)
        msgs = ((InternalEObject)newVAlign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__VALIGN, null, msgs);
      msgs = basicSetVAlign(newVAlign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__VALIGN, newVAlign, newVAlign));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__WHITE_SPACE, oldWhiteSpace, newWhiteSpace);
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
        msgs = ((InternalEObject)whiteSpace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__WHITE_SPACE, null, msgs);
      if (newWhiteSpace != null)
        msgs = ((InternalEObject)newWhiteSpace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__WHITE_SPACE, null, msgs);
      msgs = basicSetWhiteSpace(newWhiteSpace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__WHITE_SPACE, newWhiteSpace, newWhiteSpace));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__STYLE, oldStyle, newStyle);
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
        msgs = ((InternalEObject)style).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__STYLE, null, msgs);
      if (newStyle != null)
        msgs = ((InternalEObject)newStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__STYLE, null, msgs);
      msgs = basicSetStyle(newStyle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__STYLE, newStyle, newStyle));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__DISPLAY, oldDisplay, newDisplay);
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
        msgs = ((InternalEObject)display).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__DISPLAY, null, msgs);
      if (newDisplay != null)
        msgs = ((InternalEObject)newDisplay).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__DISPLAY, null, msgs);
      msgs = basicSetDisplay(newDisplay, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__DISPLAY, newDisplay, newDisplay));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__BORDER, oldBorder, newBorder);
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
        msgs = ((InternalEObject)border).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__BORDER, null, msgs);
      if (newBorder != null)
        msgs = ((InternalEObject)newBorder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__BORDER, null, msgs);
      msgs = basicSetBorder(newBorder, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__BORDER, newBorder, newBorder));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__PADDING, oldPadding, newPadding);
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
        msgs = ((InternalEObject)padding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__PADDING, null, msgs);
      if (newPadding != null)
        msgs = ((InternalEObject)newPadding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__PADDING, null, msgs);
      msgs = basicSetPadding(newPadding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__PADDING, newPadding, newPadding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Padding getMargin()
  {
    return margin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMargin(Padding newMargin, NotificationChain msgs)
  {
    Padding oldMargin = margin;
    margin = newMargin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__MARGIN, oldMargin, newMargin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMargin(Padding newMargin)
  {
    if (newMargin != margin)
    {
      NotificationChain msgs = null;
      if (margin != null)
        msgs = ((InternalEObject)margin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__MARGIN, null, msgs);
      if (newMargin != null)
        msgs = ((InternalEObject)newMargin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__MARGIN, null, msgs);
      msgs = basicSetMargin(newMargin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__MARGIN, newMargin, newMargin));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__VISIBILITY, oldVisibility, newVisibility);
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
        msgs = ((InternalEObject)visibility).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__VISIBILITY, null, msgs);
      if (newVisibility != null)
        msgs = ((InternalEObject)newVisibility).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__VISIBILITY, null, msgs);
      msgs = basicSetVisibility(newVisibility, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__VISIBILITY, newVisibility, newVisibility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PageBreak getPagebreak()
  {
    return pagebreak;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPagebreak(PageBreak newPagebreak, NotificationChain msgs)
  {
    PageBreak oldPagebreak = pagebreak;
    pagebreak = newPagebreak;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__PAGEBREAK, oldPagebreak, newPagebreak);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPagebreak(PageBreak newPagebreak)
  {
    if (newPagebreak != pagebreak)
    {
      NotificationChain msgs = null;
      if (pagebreak != null)
        msgs = ((InternalEObject)pagebreak).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__PAGEBREAK, null, msgs);
      if (newPagebreak != null)
        msgs = ((InternalEObject)newPagebreak).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__PAGEBREAK, null, msgs);
      msgs = basicSetPagebreak(newPagebreak, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__PAGEBREAK, newPagebreak, newPagebreak));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Toc getToc()
  {
    return toc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetToc(Toc newToc, NotificationChain msgs)
  {
    Toc oldToc = toc;
    toc = newToc;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__TOC, oldToc, newToc);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setToc(Toc newToc)
  {
    if (newToc != toc)
    {
      NotificationChain msgs = null;
      if (toc != null)
        msgs = ((InternalEObject)toc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__TOC, null, msgs);
      if (newToc != null)
        msgs = ((InternalEObject)newToc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__TOC, null, msgs);
      msgs = basicSetToc(newToc, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__TOC, newToc, newToc));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Bookmark getBookmark()
  {
    return bookmark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBookmark(Bookmark newBookmark, NotificationChain msgs)
  {
    Bookmark oldBookmark = bookmark;
    bookmark = newBookmark;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__BOOKMARK, oldBookmark, newBookmark);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBookmark(Bookmark newBookmark)
  {
    if (newBookmark != bookmark)
    {
      NotificationChain msgs = null;
      if (bookmark != null)
        msgs = ((InternalEObject)bookmark).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__BOOKMARK, null, msgs);
      if (newBookmark != null)
        msgs = ((InternalEObject)newBookmark).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__BOOKMARK, null, msgs);
      msgs = basicSetBookmark(newBookmark, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__BOOKMARK, newBookmark, newBookmark));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Width getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetWidth(Width newWidth, NotificationChain msgs)
  {
    Width oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__WIDTH, oldWidth, newWidth);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(Width newWidth)
  {
    if (newWidth != width)
    {
      NotificationChain msgs = null;
      if (width != null)
        msgs = ((InternalEObject)width).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__WIDTH, null, msgs);
      if (newWidth != null)
        msgs = ((InternalEObject)newWidth).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__WIDTH, null, msgs);
      msgs = basicSetWidth(newWidth, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__WIDTH, newWidth, newWidth));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Height getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeight(Height newHeight, NotificationChain msgs)
  {
    Height oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__HEIGHT, oldHeight, newHeight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(Height newHeight)
  {
    if (newHeight != height)
    {
      NotificationChain msgs = null;
      if (height != null)
        msgs = ((InternalEObject)height).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__HEIGHT, null, msgs);
      if (newHeight != null)
        msgs = ((InternalEObject)newHeight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.PAGE_PROPERTIES__HEIGHT, null, msgs);
      msgs = basicSetHeight(newHeight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.PAGE_PROPERTIES__HEIGHT, newHeight, newHeight));
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
      case RDslPackage.PAGE_PROPERTIES__FONT:
        return basicSetFont(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__FONT_SIZE:
        return basicSetFontSize(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__COLOR:
        return basicSetColor(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__BACKGROUND_COLOR:
        return basicSetBackgroundColor(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__TEXT_STYLE:
        return basicSetTextStyle(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__HALIGN:
        return basicSetHAlign(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__VALIGN:
        return basicSetVAlign(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__WHITE_SPACE:
        return basicSetWhiteSpace(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__STYLE:
        return basicSetStyle(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__DISPLAY:
        return basicSetDisplay(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__BORDER:
        return basicSetBorder(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__PADDING:
        return basicSetPadding(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__MARGIN:
        return basicSetMargin(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__VISIBILITY:
        return basicSetVisibility(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__PAGEBREAK:
        return basicSetPagebreak(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__TOC:
        return basicSetToc(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__BOOKMARK:
        return basicSetBookmark(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__WIDTH:
        return basicSetWidth(null, msgs);
      case RDslPackage.PAGE_PROPERTIES__HEIGHT:
        return basicSetHeight(null, msgs);
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
      case RDslPackage.PAGE_PROPERTIES__FONT:
        return getFont();
      case RDslPackage.PAGE_PROPERTIES__FONT_SIZE:
        return getFontSize();
      case RDslPackage.PAGE_PROPERTIES__COLOR:
        return getColor();
      case RDslPackage.PAGE_PROPERTIES__BACKGROUND_COLOR:
        return getBackgroundColor();
      case RDslPackage.PAGE_PROPERTIES__TEXT_STYLE:
        return getTextStyle();
      case RDslPackage.PAGE_PROPERTIES__HALIGN:
        return getHAlign();
      case RDslPackage.PAGE_PROPERTIES__VALIGN:
        return getVAlign();
      case RDslPackage.PAGE_PROPERTIES__WHITE_SPACE:
        return getWhiteSpace();
      case RDslPackage.PAGE_PROPERTIES__STYLE:
        return getStyle();
      case RDslPackage.PAGE_PROPERTIES__DISPLAY:
        return getDisplay();
      case RDslPackage.PAGE_PROPERTIES__BORDER:
        return getBorder();
      case RDslPackage.PAGE_PROPERTIES__PADDING:
        return getPadding();
      case RDslPackage.PAGE_PROPERTIES__MARGIN:
        return getMargin();
      case RDslPackage.PAGE_PROPERTIES__VISIBILITY:
        return getVisibility();
      case RDslPackage.PAGE_PROPERTIES__PAGEBREAK:
        return getPagebreak();
      case RDslPackage.PAGE_PROPERTIES__TOC:
        return getToc();
      case RDslPackage.PAGE_PROPERTIES__BOOKMARK:
        return getBookmark();
      case RDslPackage.PAGE_PROPERTIES__WIDTH:
        return getWidth();
      case RDslPackage.PAGE_PROPERTIES__HEIGHT:
        return getHeight();
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
      case RDslPackage.PAGE_PROPERTIES__FONT:
        setFont((Font)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__FONT_SIZE:
        setFontSize((FontSize)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__COLOR:
        setColor((Color)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__BACKGROUND_COLOR:
        setBackgroundColor((Color)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__TEXT_STYLE:
        setTextStyle((TextStyle)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__HALIGN:
        setHAlign((HAlignment)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__VALIGN:
        setVAlign((VAlignment)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__WHITE_SPACE:
        setWhiteSpace((Whitespace)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__STYLE:
        setStyle((StyleRef)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__DISPLAY:
        setDisplay((Display)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__BORDER:
        setBorder((Border)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__PADDING:
        setPadding((Padding)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__MARGIN:
        setMargin((Padding)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__VISIBILITY:
        setVisibility((Visibility)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__PAGEBREAK:
        setPagebreak((PageBreak)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__TOC:
        setToc((Toc)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__BOOKMARK:
        setBookmark((Bookmark)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__WIDTH:
        setWidth((Width)newValue);
        return;
      case RDslPackage.PAGE_PROPERTIES__HEIGHT:
        setHeight((Height)newValue);
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
      case RDslPackage.PAGE_PROPERTIES__FONT:
        setFont((Font)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__FONT_SIZE:
        setFontSize((FontSize)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__COLOR:
        setColor((Color)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__BACKGROUND_COLOR:
        setBackgroundColor((Color)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__TEXT_STYLE:
        setTextStyle((TextStyle)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__HALIGN:
        setHAlign((HAlignment)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__VALIGN:
        setVAlign((VAlignment)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__WHITE_SPACE:
        setWhiteSpace((Whitespace)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__STYLE:
        setStyle((StyleRef)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__DISPLAY:
        setDisplay((Display)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__BORDER:
        setBorder((Border)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__PADDING:
        setPadding((Padding)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__MARGIN:
        setMargin((Padding)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__VISIBILITY:
        setVisibility((Visibility)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__PAGEBREAK:
        setPagebreak((PageBreak)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__TOC:
        setToc((Toc)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__BOOKMARK:
        setBookmark((Bookmark)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__WIDTH:
        setWidth((Width)null);
        return;
      case RDslPackage.PAGE_PROPERTIES__HEIGHT:
        setHeight((Height)null);
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
      case RDslPackage.PAGE_PROPERTIES__FONT:
        return font != null;
      case RDslPackage.PAGE_PROPERTIES__FONT_SIZE:
        return fontSize != null;
      case RDslPackage.PAGE_PROPERTIES__COLOR:
        return color != null;
      case RDslPackage.PAGE_PROPERTIES__BACKGROUND_COLOR:
        return backgroundColor != null;
      case RDslPackage.PAGE_PROPERTIES__TEXT_STYLE:
        return textStyle != null;
      case RDslPackage.PAGE_PROPERTIES__HALIGN:
        return hAlign != null;
      case RDslPackage.PAGE_PROPERTIES__VALIGN:
        return vAlign != null;
      case RDslPackage.PAGE_PROPERTIES__WHITE_SPACE:
        return whiteSpace != null;
      case RDslPackage.PAGE_PROPERTIES__STYLE:
        return style != null;
      case RDslPackage.PAGE_PROPERTIES__DISPLAY:
        return display != null;
      case RDslPackage.PAGE_PROPERTIES__BORDER:
        return border != null;
      case RDslPackage.PAGE_PROPERTIES__PADDING:
        return padding != null;
      case RDslPackage.PAGE_PROPERTIES__MARGIN:
        return margin != null;
      case RDslPackage.PAGE_PROPERTIES__VISIBILITY:
        return visibility != null;
      case RDslPackage.PAGE_PROPERTIES__PAGEBREAK:
        return pagebreak != null;
      case RDslPackage.PAGE_PROPERTIES__TOC:
        return toc != null;
      case RDslPackage.PAGE_PROPERTIES__BOOKMARK:
        return bookmark != null;
      case RDslPackage.PAGE_PROPERTIES__WIDTH:
        return width != null;
      case RDslPackage.PAGE_PROPERTIES__HEIGHT:
        return height != null;
    }
    return super.eIsSet(featureID);
  }

} //PagePropertiesImpl
