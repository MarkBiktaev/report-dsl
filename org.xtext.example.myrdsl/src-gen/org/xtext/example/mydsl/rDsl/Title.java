/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Title</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Title#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Title#getPlace <em>Place</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Title#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTitle()
 * @model
 * @generated
 */
public interface Title extends EObject
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTitle_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Title#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Place</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Place</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Place</em>' attribute.
   * @see #setPlace(String)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTitle_Place()
   * @model
   * @generated
   */
  String getPlace();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Title#getPlace <em>Place</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Place</em>' attribute.
   * @see #getPlace()
   * @generated
   */
  void setPlace(String value);

  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference.
   * @see #setProperties(ChartElementProperties)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getTitle_Properties()
   * @model containment="true"
   * @generated
   */
  ChartElementProperties getProperties();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Title#getProperties <em>Properties</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Properties</em>' containment reference.
   * @see #getProperties()
   * @generated
   */
  void setProperties(ChartElementProperties value);

} // Title
