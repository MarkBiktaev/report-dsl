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

import org.xtext.example.mydsl.rDsl.Chart;
import org.xtext.example.mydsl.rDsl.ChartSubType;
import org.xtext.example.mydsl.rDsl.ColorPalette;
import org.xtext.example.mydsl.rDsl.Dataset;
import org.xtext.example.mydsl.rDsl.LabelProperties;
import org.xtext.example.mydsl.rDsl.Legend;
import org.xtext.example.mydsl.rDsl.RDslPackage;
import org.xtext.example.mydsl.rDsl.STRING;
import org.xtext.example.mydsl.rDsl.Title;
import org.xtext.example.mydsl.rDsl.XAxe;
import org.xtext.example.mydsl.rDsl.YAxe;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl#getLegend <em>Legend</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl#getPlot <em>Plot</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl#getAxe <em>Axe</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl#getXaxe <em>Xaxe</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl#getYaxe <em>Yaxe</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.impl.ChartImpl#getColorpalette <em>Colorpalette</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChartImpl extends ReportElementsImpl implements Chart
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final STRING TYPE_EDEFAULT = STRING.BAR;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected STRING type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtype()
   * @generated
   * @ordered
   */
  protected static final ChartSubType SUBTYPE_EDEFAULT = ChartSubType.SBS;

  /**
   * The cached value of the '{@link #getSubtype() <em>Subtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubtype()
   * @generated
   * @ordered
   */
  protected ChartSubType subtype = SUBTYPE_EDEFAULT;

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
   * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProperties()
   * @generated
   * @ordered
   */
  protected EList<LabelProperties> properties;

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
   * The cached value of the '{@link #getLegend() <em>Legend</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLegend()
   * @generated
   * @ordered
   */
  protected Legend legend;

  /**
   * The default value of the '{@link #getPlot() <em>Plot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlot()
   * @generated
   * @ordered
   */
  protected static final String PLOT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPlot() <em>Plot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlot()
   * @generated
   * @ordered
   */
  protected String plot = PLOT_EDEFAULT;

  /**
   * The default value of the '{@link #getAxe() <em>Axe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxe()
   * @generated
   * @ordered
   */
  protected static final String AXE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAxe() <em>Axe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAxe()
   * @generated
   * @ordered
   */
  protected String axe = AXE_EDEFAULT;

  /**
   * The cached value of the '{@link #getXaxe() <em>Xaxe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXaxe()
   * @generated
   * @ordered
   */
  protected XAxe xaxe;

  /**
   * The cached value of the '{@link #getYaxe() <em>Yaxe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYaxe()
   * @generated
   * @ordered
   */
  protected YAxe yaxe;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChartImpl()
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
    return RDslPackage.eINSTANCE.getChart();
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
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public STRING getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(STRING newType)
  {
    STRING oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChartSubType getSubtype()
  {
    return subtype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubtype(ChartSubType newSubtype)
  {
    ChartSubType oldSubtype = subtype;
    subtype = newSubtype == null ? SUBTYPE_EDEFAULT : newSubtype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__SUBTYPE, oldSubtype, subtype));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, RDslPackage.CHART__DATASET, oldDataset, dataset));
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
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__DATASET, oldDataset, dataset));
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
      properties = new EObjectContainmentEList<LabelProperties>(LabelProperties.class, this, RDslPackage.CHART__PROPERTIES);
    }
    return properties;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__TITLE, oldTitle, newTitle);
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
        msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART__TITLE, null, msgs);
      if (newTitle != null)
        msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART__TITLE, null, msgs);
      msgs = basicSetTitle(newTitle, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__TITLE, newTitle, newTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Legend getLegend()
  {
    return legend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLegend(Legend newLegend, NotificationChain msgs)
  {
    Legend oldLegend = legend;
    legend = newLegend;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__LEGEND, oldLegend, newLegend);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLegend(Legend newLegend)
  {
    if (newLegend != legend)
    {
      NotificationChain msgs = null;
      if (legend != null)
        msgs = ((InternalEObject)legend).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART__LEGEND, null, msgs);
      if (newLegend != null)
        msgs = ((InternalEObject)newLegend).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART__LEGEND, null, msgs);
      msgs = basicSetLegend(newLegend, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__LEGEND, newLegend, newLegend));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPlot()
  {
    return plot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlot(String newPlot)
  {
    String oldPlot = plot;
    plot = newPlot;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__PLOT, oldPlot, plot));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAxe()
  {
    return axe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAxe(String newAxe)
  {
    String oldAxe = axe;
    axe = newAxe;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__AXE, oldAxe, axe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XAxe getXaxe()
  {
    return xaxe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetXaxe(XAxe newXaxe, NotificationChain msgs)
  {
    XAxe oldXaxe = xaxe;
    xaxe = newXaxe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__XAXE, oldXaxe, newXaxe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXaxe(XAxe newXaxe)
  {
    if (newXaxe != xaxe)
    {
      NotificationChain msgs = null;
      if (xaxe != null)
        msgs = ((InternalEObject)xaxe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART__XAXE, null, msgs);
      if (newXaxe != null)
        msgs = ((InternalEObject)newXaxe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART__XAXE, null, msgs);
      msgs = basicSetXaxe(newXaxe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__XAXE, newXaxe, newXaxe));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YAxe getYaxe()
  {
    return yaxe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetYaxe(YAxe newYaxe, NotificationChain msgs)
  {
    YAxe oldYaxe = yaxe;
    yaxe = newYaxe;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__YAXE, oldYaxe, newYaxe);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYaxe(YAxe newYaxe)
  {
    if (newYaxe != yaxe)
    {
      NotificationChain msgs = null;
      if (yaxe != null)
        msgs = ((InternalEObject)yaxe).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART__YAXE, null, msgs);
      if (newYaxe != null)
        msgs = ((InternalEObject)newYaxe).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART__YAXE, null, msgs);
      msgs = basicSetYaxe(newYaxe, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__YAXE, newYaxe, newYaxe));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__COLORPALETTE, oldColorpalette, newColorpalette);
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
        msgs = ((InternalEObject)colorpalette).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART__COLORPALETTE, null, msgs);
      if (newColorpalette != null)
        msgs = ((InternalEObject)newColorpalette).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RDslPackage.CHART__COLORPALETTE, null, msgs);
      msgs = basicSetColorpalette(newColorpalette, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, RDslPackage.CHART__COLORPALETTE, newColorpalette, newColorpalette));
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
      case RDslPackage.CHART__PROPERTIES:
        return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
      case RDslPackage.CHART__TITLE:
        return basicSetTitle(null, msgs);
      case RDslPackage.CHART__LEGEND:
        return basicSetLegend(null, msgs);
      case RDslPackage.CHART__XAXE:
        return basicSetXaxe(null, msgs);
      case RDslPackage.CHART__YAXE:
        return basicSetYaxe(null, msgs);
      case RDslPackage.CHART__COLORPALETTE:
        return basicSetColorpalette(null, msgs);
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
      case RDslPackage.CHART__NAME:
        return getName();
      case RDslPackage.CHART__TYPE:
        return getType();
      case RDslPackage.CHART__SUBTYPE:
        return getSubtype();
      case RDslPackage.CHART__DATASET:
        if (resolve) return getDataset();
        return basicGetDataset();
      case RDslPackage.CHART__PROPERTIES:
        return getProperties();
      case RDslPackage.CHART__TITLE:
        return getTitle();
      case RDslPackage.CHART__LEGEND:
        return getLegend();
      case RDslPackage.CHART__PLOT:
        return getPlot();
      case RDslPackage.CHART__AXE:
        return getAxe();
      case RDslPackage.CHART__XAXE:
        return getXaxe();
      case RDslPackage.CHART__YAXE:
        return getYaxe();
      case RDslPackage.CHART__COLORPALETTE:
        return getColorpalette();
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
      case RDslPackage.CHART__NAME:
        setName((String)newValue);
        return;
      case RDslPackage.CHART__TYPE:
        setType((STRING)newValue);
        return;
      case RDslPackage.CHART__SUBTYPE:
        setSubtype((ChartSubType)newValue);
        return;
      case RDslPackage.CHART__DATASET:
        setDataset((Dataset)newValue);
        return;
      case RDslPackage.CHART__PROPERTIES:
        getProperties().clear();
        getProperties().addAll((Collection<? extends LabelProperties>)newValue);
        return;
      case RDslPackage.CHART__TITLE:
        setTitle((Title)newValue);
        return;
      case RDslPackage.CHART__LEGEND:
        setLegend((Legend)newValue);
        return;
      case RDslPackage.CHART__PLOT:
        setPlot((String)newValue);
        return;
      case RDslPackage.CHART__AXE:
        setAxe((String)newValue);
        return;
      case RDslPackage.CHART__XAXE:
        setXaxe((XAxe)newValue);
        return;
      case RDslPackage.CHART__YAXE:
        setYaxe((YAxe)newValue);
        return;
      case RDslPackage.CHART__COLORPALETTE:
        setColorpalette((ColorPalette)newValue);
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
      case RDslPackage.CHART__NAME:
        setName(NAME_EDEFAULT);
        return;
      case RDslPackage.CHART__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case RDslPackage.CHART__SUBTYPE:
        setSubtype(SUBTYPE_EDEFAULT);
        return;
      case RDslPackage.CHART__DATASET:
        setDataset((Dataset)null);
        return;
      case RDslPackage.CHART__PROPERTIES:
        getProperties().clear();
        return;
      case RDslPackage.CHART__TITLE:
        setTitle((Title)null);
        return;
      case RDslPackage.CHART__LEGEND:
        setLegend((Legend)null);
        return;
      case RDslPackage.CHART__PLOT:
        setPlot(PLOT_EDEFAULT);
        return;
      case RDslPackage.CHART__AXE:
        setAxe(AXE_EDEFAULT);
        return;
      case RDslPackage.CHART__XAXE:
        setXaxe((XAxe)null);
        return;
      case RDslPackage.CHART__YAXE:
        setYaxe((YAxe)null);
        return;
      case RDslPackage.CHART__COLORPALETTE:
        setColorpalette((ColorPalette)null);
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
      case RDslPackage.CHART__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case RDslPackage.CHART__TYPE:
        return type != TYPE_EDEFAULT;
      case RDslPackage.CHART__SUBTYPE:
        return subtype != SUBTYPE_EDEFAULT;
      case RDslPackage.CHART__DATASET:
        return dataset != null;
      case RDslPackage.CHART__PROPERTIES:
        return properties != null && !properties.isEmpty();
      case RDslPackage.CHART__TITLE:
        return title != null;
      case RDslPackage.CHART__LEGEND:
        return legend != null;
      case RDslPackage.CHART__PLOT:
        return PLOT_EDEFAULT == null ? plot != null : !PLOT_EDEFAULT.equals(plot);
      case RDslPackage.CHART__AXE:
        return AXE_EDEFAULT == null ? axe != null : !AXE_EDEFAULT.equals(axe);
      case RDslPackage.CHART__XAXE:
        return xaxe != null;
      case RDslPackage.CHART__YAXE:
        return yaxe != null;
      case RDslPackage.CHART__COLORPALETTE:
        return colorpalette != null;
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
    result.append(", type: ");
    result.append(type);
    result.append(", subtype: ");
    result.append(subtype);
    result.append(", plot: ");
    result.append(plot);
    result.append(", axe: ");
    result.append(axe);
    result.append(')');
    return result.toString();
  }

} //ChartImpl
