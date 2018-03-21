/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Static Parameter Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.StaticParameterValues#getValue <em>Value</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.StaticParameterValues#getSort <em>Sort</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.StaticParameterValues#getSorttype <em>Sorttype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getStaticParameterValues()
 * @model
 * @generated
 */
public interface StaticParameterValues extends ParameterValue
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.rDsl.StaticParameterValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' containment reference list.
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getStaticParameterValues_Value()
   * @model containment="true"
   * @generated
   */
  EList<StaticParameterValue> getValue();

  /**
   * Returns the value of the '<em><b>Sort</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.StaticParameterSort}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sort</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sort</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.StaticParameterSort
   * @see #setSort(StaticParameterSort)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getStaticParameterValues_Sort()
   * @model
   * @generated
   */
  StaticParameterSort getSort();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.StaticParameterValues#getSort <em>Sort</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sort</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.StaticParameterSort
   * @see #getSort()
   * @generated
   */
  void setSort(StaticParameterSort value);

  /**
   * Returns the value of the '<em><b>Sorttype</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.SortType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sorttype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sorttype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.SortType
   * @see #setSorttype(SortType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getStaticParameterValues_Sorttype()
   * @model
   * @generated
   */
  SortType getSorttype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.StaticParameterValues#getSorttype <em>Sorttype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Sorttype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.SortType
   * @see #getSorttype()
   * @generated
   */
  void setSorttype(SortType value);

} // StaticParameterValues
