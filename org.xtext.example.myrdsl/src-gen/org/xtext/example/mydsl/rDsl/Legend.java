/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Legend</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Legend#getPlace <em>Place</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Legend#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Legend#getTitle <em>Title</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.Legend#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getLegend()
 * @model
 * @generated
 */
public interface Legend extends EObject
{
  /**
   * Returns the value of the '<em><b>Place</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Place</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Place</em>' containment reference.
   * @see #setPlace(Place)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getLegend_Place()
   * @model containment="true"
   * @generated
   */
  Place getPlace();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Legend#getPlace <em>Place</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Place</em>' containment reference.
   * @see #getPlace()
   * @generated
   */
  void setPlace(Place value);

  /**
   * Returns the value of the '<em><b>Orientation</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.OrientationType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Orientation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Orientation</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.OrientationType
   * @see #setOrientation(OrientationType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getLegend_Orientation()
   * @model
   * @generated
   */
  OrientationType getOrientation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Legend#getOrientation <em>Orientation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Orientation</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.OrientationType
   * @see #getOrientation()
   * @generated
   */
  void setOrientation(OrientationType value);

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
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getLegend_Title()
   * @model containment="true"
   * @generated
   */
  Title getTitle();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Legend#getTitle <em>Title</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' containment reference.
   * @see #getTitle()
   * @generated
   */
  void setTitle(Title value);

  /**
   * Returns the value of the '<em><b>Visibility</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Visibility</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Visibility</em>' containment reference.
   * @see #setVisibility(LegendVisibility)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getLegend_Visibility()
   * @model containment="true"
   * @generated
   */
  LegendVisibility getVisibility();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.Legend#getVisibility <em>Visibility</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Visibility</em>' containment reference.
   * @see #getVisibility()
   * @generated
   */
  void setVisibility(LegendVisibility value);

} // Legend
