/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chart Grid</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ChartGrid#getScale <em>Scale</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ChartGrid#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ChartGrid#getTick <em>Tick</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChartGrid()
 * @model
 * @generated
 */
public interface ChartGrid extends EObject
{
  /**
   * Returns the value of the '<em><b>Scale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Scale</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Scale</em>' attribute.
   * @see #setScale(int)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChartGrid_Scale()
   * @model
   * @generated
   */
  int getScale();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.ChartGrid#getScale <em>Scale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Scale</em>' attribute.
   * @see #getScale()
   * @generated
   */
  void setScale(int value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference.
   * @see #setValue(BorderLine)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChartGrid_Value()
   * @model containment="true"
   * @generated
   */
  BorderLine getValue();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.ChartGrid#getValue <em>Value</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' containment reference.
   * @see #getValue()
   * @generated
   */
  void setValue(BorderLine value);

  /**
   * Returns the value of the '<em><b>Tick</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tick</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tick</em>' containment reference.
   * @see #setTick(Tick)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChartGrid_Tick()
   * @model containment="true"
   * @generated
   */
  Tick getTick();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.ChartGrid#getTick <em>Tick</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Tick</em>' containment reference.
   * @see #getTick()
   * @generated
   */
  void setTick(Tick value);

} // ChartGrid
