/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Chart#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Chart#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Chart#getSubtype <em>Subtype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Chart#getDataset <em>Dataset</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Chart#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Chart#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Chart#getLegend <em>Legend</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Chart#getPlot <em>Plot</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Chart#getAxe <em>Axe</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Chart#getXaxe <em>Xaxe</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Chart#getYaxe <em>Yaxe</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Chart#getColorpalette <em>Colorpalette</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart()
 * @model
 * @generated
 */
public interface Chart extends ReportElements, BasicElements
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Chart#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.STRING}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.STRING
   * @see #setType(STRING)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart_Type()
   * @model
   * @generated
   */
  STRING getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Chart#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.STRING
   * @see #getType()
   * @generated
   */
  void setType(STRING value);

  /**
   * Returns the value of the '<em><b>Subtype</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.ChartSubType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.ChartSubType
   * @see #setSubtype(ChartSubType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart_Subtype()
   * @model
   * @generated
   */
  ChartSubType getSubtype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Chart#getSubtype <em>Subtype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.ChartSubType
   * @see #getSubtype()
   * @generated
   */
  void setSubtype(ChartSubType value);

  /**
   * Returns the value of the '<em><b>Dataset</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dataset</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dataset</em>' reference.
   * @see #setDataset(Dataset)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart_Dataset()
   * @model
   * @generated
   */
  Dataset getDataset();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Chart#getDataset <em>Dataset</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dataset</em>' reference.
   * @see #getDataset()
   * @generated
   */
  void setDataset(Dataset value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.LabelProperties}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart_Properties()
   * @model containment="true"
   * @generated
   */
  EList<LabelProperties> getProperties();

  /**
   * Returns the value of the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' containment reference.
   * @see #setTitle(Title)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart_Title()
   * @model containment="true"
   * @generated
   */
  Title getTitle();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Chart#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(Title value);

  /**
   * Returns the value of the '<em><b>Legend</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Legend</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Legend</em>' containment reference.
   * @see #setLegend(Legend)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart_Legend()
   * @model containment="true"
   * @generated
   */
  Legend getLegend();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Chart#getLegend <em>Legend</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Legend</em>' containment reference.
   * @see #getLegend()
   * @generated
   */
  void setLegend(Legend value);

  /**
   * Returns the value of the '<em><b>Plot</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plot</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plot</em>' attribute.
   * @see #setPlot(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart_Plot()
   * @model
   * @generated
   */
  String getPlot();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Chart#getPlot <em>Plot</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plot</em>' attribute.
   * @see #getPlot()
   * @generated
   */
  void setPlot(String value);

  /**
   * Returns the value of the '<em><b>Axe</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Axe</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Axe</em>' attribute.
   * @see #setAxe(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart_Axe()
   * @model
   * @generated
   */
  String getAxe();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Chart#getAxe <em>Axe</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Axe</em>' attribute.
   * @see #getAxe()
   * @generated
   */
  void setAxe(String value);

  /**
   * Returns the value of the '<em><b>Xaxe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xaxe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xaxe</em>' containment reference.
   * @see #setXaxe(XAxe)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart_Xaxe()
   * @model containment="true"
   * @generated
   */
  XAxe getXaxe();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Chart#getXaxe <em>Xaxe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xaxe</em>' containment reference.
   * @see #getXaxe()
   * @generated
   */
  void setXaxe(XAxe value);

  /**
   * Returns the value of the '<em><b>Yaxe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Yaxe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Yaxe</em>' containment reference.
   * @see #setYaxe(YAxe)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart_Yaxe()
   * @model containment="true"
   * @generated
   */
  YAxe getYaxe();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Chart#getYaxe <em>Yaxe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Yaxe</em>' containment reference.
   * @see #getYaxe()
   * @generated
   */
  void setYaxe(YAxe value);

  /**
   * Returns the value of the '<em><b>Colorpalette</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Colorpalette</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colorpalette</em>' containment reference.
   * @see #setColorpalette(ColorPalette)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChart_Colorpalette()
   * @model containment="true"
   * @generated
   */
  ColorPalette getColorpalette();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Chart#getColorpalette <em>Colorpalette</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Colorpalette</em>' containment reference.
   * @see #getColorpalette()
   * @generated
   */
  void setColorpalette(ColorPalette value);

} // Chart
