/**
 */
package org.xtext.example.mydsl.rDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Break</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.PageBreak#getBefore <em>Before</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.PageBreak#getAfter <em>After</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.PageBreak#getInside <em>Inside</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.PageBreak#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.PageBreak#getRepeat <em>Repeat</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getPageBreak()
 * @model
 * @generated
 */
public interface PageBreak extends EObject
{
  /**
   * Returns the value of the '<em><b>Before</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.PageBreakValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Before</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Before</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.PageBreakValue
   * @see #setBefore(PageBreakValue)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getPageBreak_Before()
   * @model
   * @generated
   */
  PageBreakValue getBefore();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.PageBreak#getBefore <em>Before</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Before</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.PageBreakValue
   * @see #getBefore()
   * @generated
   */
  void setBefore(PageBreakValue value);

  /**
   * Returns the value of the '<em><b>After</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.PageBreakValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>After</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>After</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.PageBreakValue
   * @see #setAfter(PageBreakValue)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getPageBreak_After()
   * @model
   * @generated
   */
  PageBreakValue getAfter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.PageBreak#getAfter <em>After</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>After</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.PageBreakValue
   * @see #getAfter()
   * @generated
   */
  void setAfter(PageBreakValue value);

  /**
   * Returns the value of the '<em><b>Inside</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.PageBreakValue}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inside</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inside</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.PageBreakValue
   * @see #setInside(PageBreakValue)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getPageBreak_Inside()
   * @model
   * @generated
   */
  PageBreakValue getInside();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.PageBreak#getInside <em>Inside</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inside</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.PageBreakValue
   * @see #getInside()
   * @generated
   */
  void setInside(PageBreakValue value);

  /**
   * Returns the value of the '<em><b>Interval</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interval</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' containment reference.
   * @see #setInterval(IntLiteral)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getPageBreak_Interval()
   * @model containment="true"
   * @generated
   */
  IntLiteral getInterval();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.PageBreak#getInterval <em>Interval</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' containment reference.
   * @see #getInterval()
   * @generated
   */
  void setInterval(IntLiteral value);

  /**
   * Returns the value of the '<em><b>Repeat</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Repeat</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Repeat</em>' containment reference.
   * @see #setRepeat(BooleanLiteral)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getPageBreak_Repeat()
   * @model containment="true"
   * @generated
   */
  BooleanLiteral getRepeat();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.PageBreak#getRepeat <em>Repeat</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Repeat</em>' containment reference.
   * @see #getRepeat()
   * @generated
   */
  void setRepeat(BooleanLiteral value);

} // PageBreak
