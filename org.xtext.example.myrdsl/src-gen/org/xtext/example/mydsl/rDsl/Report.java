/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Report</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Report#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Report#getDatasources <em>Datasources</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Report#getDatasets <em>Datasets</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Report#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Report#getStyles <em>Styles</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Report#getPagesetup <em>Pagesetup</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Report#getBody <em>Body</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Report#getElementProperties <em>Element Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getReport()
 * @model
 * @generated
 */
public interface Report extends EObject
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
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getReport_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Report#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Datasources</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datasources</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datasources</em>' containment reference.
   * @see #setDatasources(Datasources)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getReport_Datasources()
   * @model containment="true"
   * @generated
   */
  Datasources getDatasources();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Report#getDatasources <em>Datasources</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datasources</em>' containment reference.
   * @see #getDatasources()
   * @generated
   */
  void setDatasources(Datasources value);

  /**
   * Returns the value of the '<em><b>Datasets</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datasets</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datasets</em>' containment reference.
   * @see #setDatasets(Datasets)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getReport_Datasets()
   * @model containment="true"
   * @generated
   */
  Datasets getDatasets();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Report#getDatasets <em>Datasets</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datasets</em>' containment reference.
   * @see #getDatasets()
   * @generated
   */
  void setDatasets(Datasets value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference.
   * @see #setParameters(Parameters)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getReport_Parameters()
   * @model containment="true"
   * @generated
   */
  Parameters getParameters();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Report#getParameters <em>Parameters</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameters</em>' containment reference.
   * @see #getParameters()
   * @generated
   */
  void setParameters(Parameters value);

  /**
   * Returns the value of the '<em><b>Styles</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Styles</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Styles</em>' containment reference.
   * @see #setStyles(Styles)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getReport_Styles()
   * @model containment="true"
   * @generated
   */
  Styles getStyles();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Report#getStyles <em>Styles</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Styles</em>' containment reference.
   * @see #getStyles()
   * @generated
   */
  void setStyles(Styles value);

  /**
   * Returns the value of the '<em><b>Pagesetup</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pagesetup</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pagesetup</em>' containment reference.
   * @see #setPagesetup(PageSetup)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getReport_Pagesetup()
   * @model containment="true"
   * @generated
   */
  PageSetup getPagesetup();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Report#getPagesetup <em>Pagesetup</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pagesetup</em>' containment reference.
   * @see #getPagesetup()
   * @generated
   */
  void setPagesetup(PageSetup value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(Body)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getReport_Body()
   * @model containment="true"
   * @generated
   */
  Body getBody();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Report#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(Body value);

  /**
   * Returns the value of the '<em><b>Element Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Properties</em>' containment reference.
   * @see #setElementProperties(elementProperties)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getReport_ElementProperties()
   * @model containment="true"
   * @generated
   */
  elementProperties getElementProperties();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Report#getElementProperties <em>Element Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Properties</em>' containment reference.
   * @see #getElementProperties()
   * @generated
   */
  void setElementProperties(elementProperties value);

} // Report
