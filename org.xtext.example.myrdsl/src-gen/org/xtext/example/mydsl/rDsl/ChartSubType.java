/**
 */
package org.xtext.example.mydsl.rDsl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Chart Sub Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.rDsl.RDslPackage#getChartSubType()
 * @model
 * @generated
 */
public enum ChartSubType implements Enumerator
{
  /**
   * The '<em><b>Sbs</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #SBS_VALUE
   * @generated
   * @ordered
   */
  SBS(0, "sbs", "side-by-side"),

  /**
   * The '<em><b>Stacked</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #STACKED_VALUE
   * @generated
   * @ordered
   */
  STACKED(1, "stacked", "stacked"),

  /**
   * The '<em><b>Percent</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PERCENT_VALUE
   * @generated
   * @ordered
   */
  PERCENT(2, "percent", "percent-stacked"),

  /**
   * The '<em><b>Overlay</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #OVERLAY_VALUE
   * @generated
   * @ordered
   */
  OVERLAY(3, "overlay", "overlay");

  /**
   * The '<em><b>Sbs</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Sbs</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #SBS
   * @model name="sbs" literal="side-by-side"
   * @generated
   * @ordered
   */
  public static final int SBS_VALUE = 0;

  /**
   * The '<em><b>Stacked</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Stacked</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #STACKED
   * @model name="stacked"
   * @generated
   * @ordered
   */
  public static final int STACKED_VALUE = 1;

  /**
   * The '<em><b>Percent</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Percent</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #PERCENT
   * @model name="percent" literal="percent-stacked"
   * @generated
   * @ordered
   */
  public static final int PERCENT_VALUE = 2;

  /**
   * The '<em><b>Overlay</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of '<em><b>Overlay</b></em>' literal object isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @see #OVERLAY
   * @model name="overlay"
   * @generated
   * @ordered
   */
  public static final int OVERLAY_VALUE = 3;

  /**
   * An array of all the '<em><b>Chart Sub Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final ChartSubType[] VALUES_ARRAY =
    new ChartSubType[]
    {
      SBS,
      STACKED,
      PERCENT,
      OVERLAY,
    };

  /**
   * A public read-only list of all the '<em><b>Chart Sub Type</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<ChartSubType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Chart Sub Type</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ChartSubType get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ChartSubType result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Chart Sub Type</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ChartSubType getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      ChartSubType result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Chart Sub Type</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ChartSubType get(int value)
  {
    switch (value)
    {
      case SBS_VALUE: return SBS;
      case STACKED_VALUE: return STACKED;
      case PERCENT_VALUE: return PERCENT;
      case OVERLAY_VALUE: return OVERLAY;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private ChartSubType(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getValue()
  {
    return value;
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
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //ChartSubType
