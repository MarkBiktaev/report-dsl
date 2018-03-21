/**
 */
package org.xtext.example.mydsl.rDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Computed Dataset Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField#getDatatype <em>Datatype</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getComputedDatasetField()
 * @model
 * @generated
 */
public interface ComputedDatasetField extends DatasetField
{
  /**
   * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.AggregatorFunction}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregation</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.AggregatorFunction
   * @see #setAggregation(AggregatorFunction)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getComputedDatasetField_Aggregation()
   * @model
   * @generated
   */
  AggregatorFunction getAggregation();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField#getAggregation <em>Aggregation</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregation</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.AggregatorFunction
   * @see #getAggregation()
   * @generated
   */
  void setAggregation(AggregatorFunction value);

  /**
   * Returns the value of the '<em><b>Datatype</b></em>' attribute.
   * The literals are from the enumeration {@link org.xtext.example.mydsl.rDsl.DataType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Datatype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Datatype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.DataType
   * @see #setDatatype(DataType)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getComputedDatasetField_Datatype()
   * @model
   * @generated
   */
  DataType getDatatype();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField#getDatatype <em>Datatype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Datatype</em>' attribute.
   * @see org.xtext.example.mydsl.rDsl.DataType
   * @see #getDatatype()
   * @generated
   */
  void setDatatype(DataType value);

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(JSExpression)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getComputedDatasetField_Argument()
   * @model containment="true"
   * @generated
   */
  JSExpression getArgument();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(JSExpression value);

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(JSExpression)
   * @see org.xtext.example.mydsl.rDsl.RDslPackage#getComputedDatasetField_Filter()
   * @model containment="true"
   * @generated
   */
  JSExpression getFilter();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.rDsl.ComputedDatasetField#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(JSExpression value);

} // ComputedDatasetField
