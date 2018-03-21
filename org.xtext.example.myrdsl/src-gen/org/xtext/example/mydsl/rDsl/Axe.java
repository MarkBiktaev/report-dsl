/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Axe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Axe#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Axe#getData <em>Data</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Axe#getGroupingby <em>Groupingby</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Axe#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Axe#getLine <em>Line</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Axe#getMajorgrid <em>Majorgrid</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Axe#getMinorgrid <em>Minorgrid</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getAxe()
 * @model
 * @generated
 */
public interface Axe extends EObject
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getAxe_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Axe#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Data</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Data</em>' containment reference.
   * @see #setData(JSExpression)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getAxe_Data()
   * @model containment="true"
   * @generated
   */
  JSExpression getData();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Axe#getData <em>Data</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Data</em>' containment reference.
   * @see #getData()
   * @generated
   */
  void setData(JSExpression value);

  /**
   * Returns the value of the '<em><b>Groupingby</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Groupingby</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Groupingby</em>' containment reference.
   * @see #setGroupingby(JSExpression)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getAxe_Groupingby()
   * @model containment="true"
   * @generated
   */
  JSExpression getGroupingby();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Axe#getGroupingby <em>Groupingby</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Groupingby</em>' containment reference.
   * @see #getGroupingby()
   * @generated
   */
  void setGroupingby(JSExpression value);

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
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getAxe_Title()
   * @model containment="true"
   * @generated
   */
  Title getTitle();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Axe#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(Title value);

  /**
   * Returns the value of the '<em><b>Line</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Line</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Line</em>' containment reference.
   * @see #setLine(Line)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getAxe_Line()
   * @model containment="true"
   * @generated
   */
  Line getLine();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Axe#getLine <em>Line</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Line</em>' containment reference.
   * @see #getLine()
   * @generated
   */
  void setLine(Line value);

  /**
   * Returns the value of the '<em><b>Majorgrid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Majorgrid</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Majorgrid</em>' containment reference.
   * @see #setMajorgrid(ChartGrid)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getAxe_Majorgrid()
   * @model containment="true"
   * @generated
   */
  ChartGrid getMajorgrid();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Axe#getMajorgrid <em>Majorgrid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Majorgrid</em>' containment reference.
   * @see #getMajorgrid()
   * @generated
   */
  void setMajorgrid(ChartGrid value);

  /**
   * Returns the value of the '<em><b>Minorgrid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Minorgrid</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Minorgrid</em>' containment reference.
   * @see #setMinorgrid(ChartGrid)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getAxe_Minorgrid()
   * @model containment="true"
   * @generated
   */
  ChartGrid getMinorgrid();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Axe#getMinorgrid <em>Minorgrid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Minorgrid</em>' containment reference.
   * @see #getMinorgrid()
   * @generated
   */
  void setMinorgrid(ChartGrid value);

} // Axe
